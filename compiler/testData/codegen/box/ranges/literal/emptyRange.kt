// TODO: muted automatically, investigate should it be ran for JVM_IR or not
// IGNORE_BACKEND: JVM_IR

// Auto-generated by org.jetbrains.kotlin.generators.tests.GenerateRangesCodegenTestData. DO NOT EDIT!
// WITH_RUNTIME



fun box(): String {
    val list1 = ArrayList<Int>()
    for (i in 10..5) {
        list1.add(i)
        if (list1.size > 23) break
    }
    if (list1 != listOf<Int>()) {
        return "Wrong elements for 10..5: $list1"
    }

    val list2 = ArrayList<Int>()
    for (i in 10.toByte()..(-5).toByte()) {
        list2.add(i)
        if (list2.size > 23) break
    }
    if (list2 != listOf<Int>()) {
        return "Wrong elements for 10.toByte()..(-5).toByte(): $list2"
    }

    val list3 = ArrayList<Int>()
    for (i in 10.toShort()..(-5).toShort()) {
        list3.add(i)
        if (list3.size > 23) break
    }
    if (list3 != listOf<Int>()) {
        return "Wrong elements for 10.toShort()..(-5).toShort(): $list3"
    }

    val list4 = ArrayList<Long>()
    for (i in 10L..-5L) {
        list4.add(i)
        if (list4.size > 23) break
    }
    if (list4 != listOf<Long>()) {
        return "Wrong elements for 10L..-5L: $list4"
    }

    val list5 = ArrayList<Char>()
    for (i in 'z'..'a') {
        list5.add(i)
        if (list5.size > 23) break
    }
    if (list5 != listOf<Char>()) {
        return "Wrong elements for 'z'..'a': $list5"
    }

    val list6 = ArrayList<UInt>()
    for (i in 10u..5u) {
        list6.add(i)
        if (list6.size > 23) break
    }
    if (list6 != listOf<UInt>()) {
        return "Wrong elements for 10u..5u: $list6"
    }

    val list7 = ArrayList<UInt>()
    for (i in 10u.toUByte()..5u.toUByte()) {
        list7.add(i)
        if (list7.size > 23) break
    }
    if (list7 != listOf<UInt>()) {
        return "Wrong elements for 10u.toUByte()..5u.toUByte(): $list7"
    }

    val list8 = ArrayList<UInt>()
    for (i in 10u.toUShort()..5u.toUShort()) {
        list8.add(i)
        if (list8.size > 23) break
    }
    if (list8 != listOf<UInt>()) {
        return "Wrong elements for 10u.toUShort()..5u.toUShort(): $list8"
    }

    val list9 = ArrayList<ULong>()
    for (i in 10uL..5uL) {
        list9.add(i)
        if (list9.size > 23) break
    }
    if (list9 != listOf<ULong>()) {
        return "Wrong elements for 10uL..5uL: $list9"
    }

    return "OK"
}
