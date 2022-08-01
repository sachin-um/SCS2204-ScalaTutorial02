
def interest(deposit:Double):Double=deposit match{
    case x if(x<20000) => x*0.02
    case x if(x<200000) =>x*0.04
    case x if(x<2000000) =>x*0.035
    case x if(x<20000000) =>x*0.065
}



object Q1 extends App{
    println("Interest  for Rs.15000.00: "+interest(15000))
    println("Interest for Rs.150000.00: "+interest(150000))
    println("Interest for Rs.1500000.00: "+interest(1500000))
    println("Interest for Rs.15000000.00: "+interest(15000000)) 
}