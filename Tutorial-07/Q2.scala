
class Rational(x:Int,y:Int){
    require(denominator>0,"Denominator must be greater than 0")
    private def gcd(a:Int,b:Int):Int= if (b==0) a else gcd(b,a%b)

    def numerator=x/gcd(x,y)
    def denominator=y/gcd(x,y)


    def neg= new Rational(-this.numerator,this.denominator)
    def add(r:Rational)=new Rational(this.numerator*r.denominator+this.denominator*r.numerator,this.numerator*this.denominator)
    def -(r:Rational)=this.add(r.neg)
    
    override def toString(): String = numerator +"/"+ denominator
}


object Q2 extends App{
    val x= new Rational(3,4)
    val y= new Rational(5,8)
    val z= new Rational(2,7)
    val result= x-y-z  
    println(result)
}