/**
 * @author Gullian Van Der Walt
 * Created at 15:31 on May, 2021
 */
interface PersonInfoProvider {
    val providerInfo : String;
    fun printInfo(person: Person);

}
interface SessionInfoProvider{
    fun getSessionId() : String;
}
// Implement multiple interfaces
class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider{
    // Override Val
    override val providerInfo : String
    get() = "BasicInfoProvider";
    // Override Functions
    override fun printInfo(person: Person) {
        person.printPerson()
    }
    override fun getSessionId(): String {
        return "Session Id: 1";
    }
}

fun main(){
    val provider = BasicInfoProvider();
    provider.printInfo(Person());
    provider.getSessionId();
}