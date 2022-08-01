
def patternMatching(num:Int)=num match{
    case 0=> "Zero"
    case x if(x<=0) => println("Negetive/Zero")
    case x if(x%2==0) => println("Even")
    case x if(x%2!=0) => println("Odd")
}

object Q2 extends App{
    print("Enter a number : ")
    var number=scala.io.StdIn.readInt()
    patternMatching(number) 
}