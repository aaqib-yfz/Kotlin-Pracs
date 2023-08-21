import java.util.Scanner

fun startMenu(){
    println("Welcome to your banking system")
    println("What type of account would you like to create ?")
    println("1. Debit Account")
    println("2. Credit Account")
    println("3. Checking Account")
    println("Choose An option 1, 2 or 3")
    val userInput = Scanner(System.`in`)
    val option = userInput.nextInt()
    var accountBalance = 800
    println("Your Balance is $accountBalance")

    when{
        option == 1 ->{
            Debit()
            var amnt = Scanner(System.`in`)
            var amount = amnt.nextInt()
            withdraw(amount)
            accountBalance = accountBalance - amount
            println("Your New Balance is $accountBalance")
        }
        option == 2 ->{
            Credit()
            var amnt = Scanner(System.`in`)
            var amount = amnt.nextInt()
            accountBalance = accountBalance + amount
            println("Your New Balance is $accountBalance")

        }
        option == 3 ->{
            Checking()
        }else ->{
            println("Invalid Choice")
        }
    }


}
fun Debit(){
    println("You have created a Debit Account")
    println("Enter The Amount you want to withdraw")

}
fun Credit(){
    println("You have created a Credit Account")


}
fun Checking(){
    println("You have created a Checking Account")

}
fun withdraw(amount:Int):Int{

    println("Money Withdrawal Succesfull")
    return 0
}
fun Deposit(){
    println("Money Deposit Sucessful")
    println("Enter the amount your want to credit")
}
fun main(){
    startMenu()

}

