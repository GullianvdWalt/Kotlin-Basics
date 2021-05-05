import java.util.*

/**
 * @author Gullian Van Der Walt
 * Created at 13:19 on May, 2021
 */
// Enum
enum class EntityType{
    HELP,
    EASY,
    MEDIUM,
    HARD;

    fun getFormattedName() = name.toLowerCase().capitalize();
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
            EntityType.HELP -> type.getFormattedName()
        }
        return when (type){
            EntityType.EASY -> Entity.Easy(id, name);
            EntityType.MEDIUM -> Entity.Medium(id, name);
            EntityType.HARD -> Entity.Hard(id, name, 2f);
            EntityType.HELP -> Entity.Help
        }
    }
}
// Sealed Class
sealed class Entity (){
    object Help : Entity() {
        val name = "Help";
    }
    data class Easy(val id: String, val name: String): Entity()
    data class Medium(val id: String, val name: String): Entity()
    data class Hard(val id: String, val name: String, val multiplier: Float): Entity()
}

fun main(){
    val entity = Factory.create(EntityType.EASY);
   val msg = when (entity){
       Entity.Help -> "help class"
       is Entity.Easy -> "easy class"
       is Entity.Medium -> "medium class"
       is Entity.Hard -> "hard class"
   }
    println(msg);
}