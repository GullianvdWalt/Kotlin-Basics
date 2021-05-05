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
// By default kotlin classes are closed and cannot be inherited from.
// open makes it possible to inherent or extend a class
open class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider{
    // Override Val
    override val providerInfo : String
    get() = "BasicInfoProvider";
    // Available to children but not to public
    protected open val sessionIdPrefix = "Session";

    // Override Functions
    override fun printInfo(person: Person) {
        person.printPerson()
    }
    override fun getSessionId(): String {
        return sessionIdPrefix;
    }
}

fun main(){
    val provider = object : PersonInfoProvider{
        override val providerInfo: String
            get() = "New Info Provider"

        override fun printInfo(person: Person) {
            TODO("Not yet implemented")
        }

        fun getSessionId() = "id"

    }
    provider.printInfo(Person());
    provider.getSessionId();
    checkTypes(provider);
}

// Type Checking and Smart Casting
fun checkTypes(infoProvider: PersonInfoProvider){
    if(infoProvider is SessionInfoProvider){
        println("Is Session Info Provider")
    }else{
        println("Is Not Session Info Provider")
        // Type Casting
        (infoProvider as SessionInfoProvider).getSessionId();
        // Kotlin Smart Casting
        infoProvider.getSessionId();
    }
}