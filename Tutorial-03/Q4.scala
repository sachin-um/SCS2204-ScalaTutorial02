object Q4 extends App{
    def netTotal(amount:Int):Double=amount*24.95
    def discount(total:Double):Double=total*0.4
    def shippingCost(amount:Int):Double= amount match{
        case amount if amount<=50 => amount*3
        case amount => 150+((amount-50)*.75)
    }

    def total(amount:Int):Double=netTotal(amount)-discount(netTotal(amount))+shippingCost(amount)

    println(total(60))
}