// Global Variable
var num2: Int = 2;
val programmingLanguages = arrayOf("Kotlin", "Java", "PHP", "C", "C++", "C#");
// Unit is same as void, not needed to state
fun getName(name: String, number : Int) = println("$name $number");
// Arrays and Loops
fun printLanguages(numNames: Int) {

    if(programmingLanguages.size <= numNames){

    }else{
        println("Number is out of bounds!");
    }
}
fun printAllLanguages(){
    // For Loop
    println("#### For Loop ###");
    for(programmingLanguage in programmingLanguages){
        println(programmingLanguage);
    }
    println("### For Each Loop ###");
    // For Each Loop
    programmingLanguages.forEach{
        // it -> default name for each element
        println(it)
    }
}


fun main(args: Array<String>) {
    // Variables
    // Local variables
    // Mutable variables (Can be reassigned)
    var num: Int = 1;
    // Readonly variables (Variable is final and cannot be changed
    val name: String = "Nate";

    if(name == "Nate"){
        println("Hi Nate!")
    }

    // When Statement (Switch)

    when(name){

        "Nate" -> println("Nate!");
        else -> println("Where is Nate!?");

    }

    getName("William",1);
    printAllLanguages();


}