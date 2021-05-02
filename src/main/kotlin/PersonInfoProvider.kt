/**
 * @author Gullian Van Der Walt
 * Created at 15:31 on May, 2021
 */
interface PersonInfoProvider {
    fun printInfo(person: Person)
}

// Implement
class BasicInfoProvider : PersonInfoProvider{

    override fun printInfo(person: Person) {
        println("Info");
    }
}

fun main(){
    val provider = BasicInfoProvider();
    provider.printInfo(Person());
}