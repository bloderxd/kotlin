// !CHECK_TYPE
// !WITH_CLASSES

/*
 * KOTLIN DIAGNOSTICS SPEC TEST (POSITIVE)
 *
 * SECTIONS: when-expression
 * PARAGRAPH: 9
 * SENTENCE: [1] The type of the resulting expression is the least upper bound of the types of all the entries.
 * NUMBER: 3
 * DESCRIPTION: 'When' least upper bound of the types check (when exhaustive via boolean bound value).
 */

// TESTCASE NUMBER: 1
fun case_1(value_1: Boolean): String {
    val whenValue = when (value_1) {
        true -> _ClassLevel2()
        false -> _ClassLevel3()
    }

    whenValue checkType { _<_ClassLevel2>() }
    checkSubtype<_ClassLevel1>(whenValue)

    return ""
}

// TESTCASE NUMBER: 2
fun case_2(value_1: Boolean?): String {
    val whenValue = when (value_1) {
        true -> _ClassLevel2()
        false -> _ClassLevel3()
        null -> _ClassLevel4()
    }

    whenValue checkType { _<_ClassLevel2>() }
    checkSubtype<_ClassLevel1>(whenValue)

    return ""
}


// TESTCASE NUMBER: 3
fun case_3(value_1: Boolean): String {
    val whenValue = when (value_1) {
        true -> <!IMPLICIT_CAST_TO_ANY!>10<!>
        false -> <!IMPLICIT_CAST_TO_ANY!>object<!> {}
    }

    whenValue checkType { _<Any>() }
    checkSubtype<Any>(whenValue)

    return ""
}


// TESTCASE NUMBER: 4
fun case_4(value_1: Boolean?): String {
    val whenValue = when (value_1) {
        true -> <!IMPLICIT_CAST_TO_ANY!>10<!>
        false -> {<!IMPLICIT_CAST_TO_ANY!>{}<!>}
        null -> <!IMPLICIT_CAST_TO_ANY!>object<!> {}
    }

    whenValue checkType { _<Any>() }
    checkSubtype<Any>(whenValue)

    return ""
}


