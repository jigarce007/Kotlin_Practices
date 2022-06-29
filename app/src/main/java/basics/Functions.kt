package basics

class Functions {
        //In-fix function
        infix fun square(n:Int):Int{
        val num = n*n
        return num
    }
}

fun main() {

    simpleFunction()
    functionParams("Jigar","Ahmedabad")
    var total = functionreturn(1200,200)
    println("Total payable amount is : $total")
    println("Total payable amount is : ${functionreturn(1200,200)}")
    println("Addition result is : ${addition(10,15)}")
    //infix function looks like natural language

    val f = Functions()
    val result = f square  4
    println("Square of value is : $result")

    //inline function calling
    inlineFunction { println("Calling inline function") }


}
//simple function without params and return values
fun simpleFunction(){
    println("This is a simple function without paramets and return value....\n")
}

//function with paramters
fun functionParams(name :String,city:String){
    println("My name is $name and i am belong to $city \n")
}

//function with params and return tyoe
fun functionreturn(principle : Int,interest : Int):Int{
    val totalamount = principle + interest
    return totalamount
}

//single expression function
fun addition(a:Int,b:Int):Int = a+b

//inline function
inline fun inlineFunction(myfun:() ->Unit){
    myfun()
    println("Inside inline function")
}







