// ### Global Variable ###
var num2: Int = 2;
// #### Array ####
val programmingLanguages = arrayOf("Kotlin", "Java", "PHP", "C", "C++", "C#");
// #### Lists ####
// ### Immutable List (Apply to all collections - cannot add afterwords) ###
val cars = listOf("BMW", "Volkswagen", "Nissan", "Mazda", "Porsche");
// ### Mutable List (Apply to all collections - can add afterwords) ###
val carList = mutableListOf("BMW", "Volkswagen", "Nissan", "Mazda", "Porsche");
// ### Maps ###
val superHeroes = mapOf("strength" to "John", "speed" to "William", "intelligence" to "Peter");
// Unit is same as void, not needed to state
fun getName(name: String, number : Int) = println("$name $number");
// Arrays and Loops
fun printLanguages(num: Int) {
    println(programmingLanguages.size);
    if(programmingLanguages.size >= num){
        programmingLanguages.forEachIndexed{ index, programmingLanguage ->
            if(index < num){
                println("$index - $programmingLanguage");
            }
        }
    }else{
        println("Number is out of bounds!");
    }
}
fun printAllLanguages(){
    // #### For Loop ####
    println("#### For Loop ###");
    for(programmingLanguage in programmingLanguages){
        println(programmingLanguage);
    }
    println("### For Each Loop ###");
    // #### For Each Loop - default ####
    programmingLanguages.forEach{
        // it -> default name for each element
        println(it)
    }
    // #### For Each Loop - Custom ####
    programmingLanguages.forEach{programmingLanguage ->
        // it -> default name for each element
        println(programmingLanguage)
    }
    println("### For Loop Certain Amount (3) ###")
    printLanguages(3);
}
// ### Vararg Parameters ###
fun getGreeting(name: String, vararg surname: String){
    if(surname.isEmpty()){
        println("Hello $name, how are you?");
    }else{
        println("Hello $name $surname, how are you?");
    }
}
fun greetPerson(name: String, surname: String){
    println("Hello $name $surname, how are you?");
}
// Default Parameters
fun greetPersonDefault(name: String = "Gullian", surname: String = "Doe"){
    println("Hello $name $surname, how are you?");
}
fun main(args: Array<String>) {
    // #### Variables ####
    // ### Local variables ###
    // ## Mutable variables (Can be reassigned) ##
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

    programmingLanguages.forEachIndexed{ index, programmingLanguage ->
        println("$index - $programmingLanguage");
    }

    println("### Loop List ###");
    cars.forEach{ car ->
        print(car + "\n");
    }
    // Print Map
    superHeroes.forEach{ (key, value) -> println("$value has super $key");}

    carList.add("Mercedes");

    getGreeting("John");

    // Named Parameters
    greetPerson(name = "Gullian", surname = "Van Der Walt");
    // Default Parameters
    greetPersonDefault();

    // class (Object) Instance
    val person = Person();
    person.printPerson();


}