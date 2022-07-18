object Q5 extends App{
    def easy(d:Double):Double=d*8.0
    def tempo(d:Double):Double=d*7
    def runTime(e:Double,t:Double):Double=easy(e)+tempo(t)

    println("Total run time : "+runTime(2,2))
}