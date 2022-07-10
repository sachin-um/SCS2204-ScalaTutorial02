object Q4a {
  def wage(hours:Int):Int=hours*250
  def ot(hours:Int):Int=hours*85
  def netSalary(hwage:Int,hOt:Int):Int=wage(hwage)+ot(hOt)
  def tax(income:Double):Double=income*.12
  def takeHomeSalary(hwage:Int,hOt:Int):Double=netSalary(hwage,hOt)-tax(netSalary(hwage,hOt))
  def main(args :Array[String]):Unit={
      println(takeHomeSalary(40,30))
  }
}
