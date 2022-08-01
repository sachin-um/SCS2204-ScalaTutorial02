
def patternMatching(num:Int)=num match{
    case 0=> "Zero"
    case x if(x<0) => println("Your name is Negetive")
    case x if(x>0 || x%2==0) => println("Your name is Even")
    case x if(x>0 || x%2!=0) => println("Your name is Odd")
}

object Q2 extends App{
    print("Enter a number : ")
    var number=scala.io.StdIn.readInt()
    patternMatching(number) 
}