/**
 * @author Gullian Van Der Walt
 * Created at 15:31 on May, 2021
 */
interface PersonInfoProvider {
    val providerInfo : String;
    fun printInfo(person: Person){
        // Default interface methods
        println("Info");
        person.printPerson()
    }

}

// Implement
class BasicInfoProvider : PersonInfoProvider{
    override val providerInfo : String
    get() = "BasicInfoProvider";
}

fun main(){
    val provider = BasicInfoProvider();
    provider.printInfo(Person());
}