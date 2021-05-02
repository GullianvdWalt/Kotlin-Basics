/**
 * @author Gullian Van Der Walt
 * Created at 11:03 on May, 2021
 */
class Arrays {
    private val programmingLanguages = arrayOf("Kotlin", "Java", "PHP", "C", "C++", "C#");
    fun printLanguages(numNames: Int) {

        if(programmingLanguages.size <= numNames){

        }else{
            println("Number is out of bounds!");
        }
    }
    fun printAllLanguages(){
        for(programmingLanguage in programmingLanguages){
            println(programmingLanguages);
        }
    }

}