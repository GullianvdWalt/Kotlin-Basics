/**
 * @author Gullian Van Der Walt
 * Created at 13:06 on May, 2021
 */
interface IdProvider{
    fun getId(): Int;
}

class EntityFactory private constructor(val id: Int){
    companion object Factory :IdProvider{
       override fun getId(): Int{
           return 1;
       }

        const val id = 1;
        fun create() = EntityFactory(getId());
    }
}

fun main(){
    // Entity
    val entity = EntityFactory.create();
    EntityFactory.id
}
