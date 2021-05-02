/**
 * @author Gullian Van Der Walt
 * Created at 11:03 on May, 2021
 */
//class Person(_firstName: String, _lastName: String) {
//    // init
//    val firstName: String = _firstName;
//    val lastName: String = _lastName;
//}
class Person(val firstName: String = "Peter", val lastName: String = "Parker") {

    // Nullable String
    var nickName: String? = null
        // Setter
        set(value){
            field = value;
        }

    fun printPerson(){
//        val nickNameToPrint = if(nickName != null) nickName else "no nickname"
        // Elvis operator - if notNull return else return right side expr
        val nickNameToPrint = nickName ?: "no nickname"
        println("$firstName ($nickNameToPrint) $lastName")
    }
}