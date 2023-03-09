fun main(){
var y =add(43,65,97,67)
    println(y.min())
    println(y.max())
    println(y.average())
var x=call("kelly","klein","akello")
    println(x.contentToString())
    var calcutator=Calcutator(15,5)
    (calcutator.addition())
    (calcutator.subtract())
    (calcutator.divide())
    (calcutator.multiply())


}
//Write and invoke one function that takes in an array of integers and returns
//these 3 values: smallest, largest and average of all the elements
fun add(num1:Int,num2:Int,num3:Int,num4:Int):Array<Int>{
    var x= arrayOf(num1,num2,num3,num4)
    return x
}
//Write and call a function that takes in an array of strings, joins them all into
//one string and returns it.
fun call(firstName:String,secondName:String,lastName:String):Array<String>{
    var name= arrayOf("$firstName$secondName$lastName")
    return name
}


class Calcutator(var numr:Int,var numg:Int,) {
    fun addition() {
        var add = numr + numg
        println(add)
    }

    fun subtract() {
        var sub = numr - numg
        println(sub)
    }

    fun divide() {
        var div = numr / numg
        println(div)
    }

    fun multiply() {
        var mul = numr * numg
        println(mul)
    }

    fun book() {
        var x = "akira"
        println(x.split(x))
    }

}





