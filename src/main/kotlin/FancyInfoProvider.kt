/**
 * @author Gullian Van Der Walt
 * Created at 08:16 on May, 2021
 */
// Kotlin Extends
class FancyInfoProvider : BasicInfoProvider(){

    override val sessionIdPrefix: String
        get() = "Fancy Session"

    override val providerInfo: String
        get() = "Fancy Info Provider";

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Fancy Info")
    }

}