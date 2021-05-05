import java.util.*

/**
 * @author Gullian Van Der Walt
 * Created at 13:19 on May, 2021
 */
// Enum
enum class EntityType{
    EASY,
    MEDIUM,
    HARD
}

// Singleton
object Factory {
    fun create(type: EntityType) : Entity {
        val id = UUID.randomUUID().toString();
        /*
            Kotlin when:
            advance form of switch
         */
        val name = when (type){
            EntityType.EASY -> "Easy"
            EntityType.MEDIUM -> "Medium"
            EntityType.HARD -> "Hard"
        }
        return Entity(id, name);
    }
}
class Entity (val id: String, val name : String){
    override fun toString(): String {
        return "id: $id name: $name"
    }
}

fun main(){
    val entity = Factory.create(EntityType.EASY);
    println(entity);
}