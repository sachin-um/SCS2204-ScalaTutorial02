object Q4b {

  def attendance(price:Float):Float=120+(15-price)/5*20
  def earn(price:Float):Float=price*attendance(price)
  def cost(price:Float):Float=500+attendance(price)*3
  def profit(price:Float):Float=earn(price)-cost(price)
  def main(args :Array[String]):Unit={
    println(profit(24))
  }
}
