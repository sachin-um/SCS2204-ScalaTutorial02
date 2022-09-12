
class Rational(x:Int,y:Int){
    require(denominator>0,"Denominator must be greater than 0")
    private def gcd(a:Int,b:Int):Int= if (b==0) a else gcd(b,a%b)

    def numerator=x/gcd(x,y)
    def denominator=y/gcd(x,y)


    def neg= new Rational(-this.numerator,this.denominator)
    

    override def toString(): String = numerator+"/"+denominator
}


object Q1 extends App{
    val x= new Rational(3,4)  
    println("Rational number : "+ x)
    println("Negetive Rational number : "+x.neg)
}