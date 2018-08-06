package demo

fun main(args : Array<String>){
    println("Hello, world!")
    val name="Jackson"
    var myAge=17
    var bigInt: Int = Int.MAX_VALUE
    var smallInt: Int= Int.MIN_VALUE
    println("Biggest Int : "+bigInt)
    println("Smallest Int : "+smallInt)
    var bigLong: Long=Long.MAX_VALUE
    var smallLong: Long=Long.MIN_VALUE
    println("Biggest Long : "+bigLong)
    println("Smallest Long : "+smallLong)
    var bigDouble: Double=Double.MAX_VALUE
    var smallDouble: Double=Double.MIN_VALUE
    println("Biggest Double : "+bigDouble)
    println("Smallest Double : "+smallDouble)
    var bigFloat: Float=Float.MAX_VALUE
    var smallFloat: Float=Float.MIN_VALUE
    println("Biggest Float : "+bigFloat)
    println("Smallest Float : "+smallFloat)
    var dblNum1 : Double=1.111111111111111111
    var dblNum2 : Double=1.111111111111111111
    println("Sum : "+(dblNum1+dblNum2))
    if(true is Boolean){
        print("true is boolean\n")
    }
    var letterGrade : Char='A'
    println("A is a Char : ${letterGrade is Char}")
    println("3.14 to Int : "+3.14.toInt())
    println("A to Int : "+('A'.toInt()))
    println("65 to Char : "+65.toChar())
    val myName="Jackson Baxter"
    val longStr="""This is a
        longstring"""
    var fName: String="Doug"
    var lName: String="Smith"
    fName="Sally"
    var fullName=fName+" "+lName
    println("Name: $fullName")
    println("1 + 2 = ${1+2}")
    println("String Length : ${longStr.length}")
    var str1="A random string"
    var str2="a random string"
    println("String Equal : ${str1.equals((str2))}")
    println("Compare A to B : ${"A".compareTo(("B"))}")
    println("2nd Index : ${str1[2]}")
    println("Index 2 - 7 :${str1.subSequence(2,8)}")
    println("Contains random : ${str1.contains("random")}")
}