fun main(){
word("codeHive")
    division(5,2)
    description("Liliane", 19)
    var word=count("Hello")
    println(word)



}

fun word(name:String){
    var newName=(name[4].toString() +name[5]+name[6]+name[7])
    println(newName)

}

fun division(a:Int, b:Int){
    var modulus =a%b
    println(modulus)
}

fun description(name:String, age:Int){
    println("Hi, my name is $name and I am $age years old.")
}

fun count(word:String):Int{
    var word= word.length
    return word
}
