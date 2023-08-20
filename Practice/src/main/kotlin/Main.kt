import java.util.Scanner

// Week 01
fun main(){

////    var name : String = "aaqib"
////    var age : Int = 10
////
//    println( "My name is $name and my age is $age")
//
//    var accountType = "free"
//    if( accountType == "free"){
//        println(" acc is free")
//    }
//    else{
//        println("Nigga cat")
//    }
//    println("Enter Password")
//    val scanner = Scanner(System.`in`)
//    val password = scanner.nextLine()
//    //    var password: String = "adsadasdadsad"
//
//    when{
//        password == "" ->{
//            println("Password cant be empty")
//        }
//        password.length < 7 -> {
//            println("Password too short")
//        }
//        else ->{
//            println(" nigga cat")
//        }
//    }

//    var i = 0 ;
//    while(i<=10){
//        println("hello")
//        i+=1;
//    }
//
//    val letters = arrayListOf("peshawar","quetta","swat","Kandahar")
//    for(letter in letters){
//        println("Current city is $letter")
//    }
//
//    for( i in 1.. 5){
//        println("Number is $i")
//    }
//
//    for( i in 1 until 5){
//        println("Number is $i")
//    }
//
//    for(i in 1..5 step 2){
//        println(i)
//    }
//
//    val value = true
//    println("$value || false")

    //functions
//
//        fun goToStore(storeName:String){
//            println("Go to $storeName")
//
//        }
//
//    goToStore("avon")

//fun doubleIt( value : Int) : Int{
//
//    return value*2
//}
//    print( doubleIt(2))


//    fun random( age:Int , name:String){
//        println("The age of $name is $age")
//    }
//
//    random(23,"aaqib")

//    fun fact( number:Int){
//
//        var n = 1
//        for( i in 1..number ){
//            n*= i;
//        }
//        print(n)
//    }
//    fact(3)
//
//    val std1  = Student("aizaz",25)
//    val std2 = Student("anfal",23)
//    println(std1.showName())
//    std1.setDomicile("peshawar")
//    std1.getDomicile()

//    val std3 = BsStudent("jango",19,"zuzu")
//    println(std3.showName())
//    std3.setDomicile("torghar")
//    std3.getDomicile()
//    println(std3.getFather())
//
//    val dog1 = Doggie()
//    dog1.makeNoise()
}
//
// public open class Student(
//     private var name : String,
//    private var age : Int
//){
//      private lateinit var domicile :String
//     public fun setDomicile( dom:String){
//         domicile = dom
//     }
//     public fun getDomicile(){
//         println(domicile)
//     }
//     public fun showName():String{
//         return name
//     }
// }
//
//public class BsStudent(name: String ,age: Int, fatherName:String) : Student(name,age){
//      var nm = fatherName
//    public fun getFather(): String {
//        return nm
//    }
//}


public interface Animal{
    public fun makeNoise()
}

public class Doggie(): Animal{
    override fun makeNoise() {
        println("bhew")
    }
}