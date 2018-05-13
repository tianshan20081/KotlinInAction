package com.gooker.kotlin.base


open class 人(var 性格: String, var 长相: String, var 声音: String) {
    init {
        println("喜欢的 ${this.javaClass.simpleName}:性格:$性格,长相:$长相,声音:$声音")
    }
}


class 妹子(性格: String, 长相: String, 声音: String) : 人(性格, 长相, 声音) {


}

class 帅哥(性格: String, 长相: String, 声音: String) : 人(性格, 长相, 声音) {


}
// class 妹子(var 性格: String, var 长相: String, var 声音: String) {
//
//    init {
//        println("喜欢的女朋友:性格:$性格,长相:$长相,声音:$声音")
//    }
//}
//
//class 帅哥(var 性格: String, var 长相: String, var 声音: String) {
//
//    init {
//        println("喜欢的男朋友:性格:$性格,长相:$长相,声音:$声音")
//    }
//}


fun main(args: Array<String>) {
    val 女朋友: 妹子 = 妹子("温柔", "甜美", "动听")
    val 男朋友: 帅哥 = 帅哥("温柔", "甜美", "动听")
}