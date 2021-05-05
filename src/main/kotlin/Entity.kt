/**
 * @author Gullian Van Der Walt
 * Created at 13:19 on May, 2021
 */
// Singleton
object Factory {
    fun create() = Entity("id", "John");
}
class Entity (val id: String, val name : String){
    override fun toString(): String {
        return "id: $id name: $name"
    }
}

fun main(){
    val entity = Factory.create();
    println(entity);
}