case class Point(var x:Int, var y:Int){
    def add(p:Point)=new Point(this.x+p.x,this.y+p.y)

    def move(x:Int,y:Int):Unit={
        this.x=this.x+x
        this.y=this.y+y
    }

    def distance(p:Point):Double={
        var x_dist:Int=this.x-p.x
        var y_dist:Int=this.y-p.y
        
        scala.math.sqrt((x_dist*x_dist + y_dist*y_dist))
    }

    def invert():Unit={
        var tempX=this.x
        this.x=this.y
        this.y=tempX
    }

    override def toString(): String = "[ "+x+","+y+" ]"
}

object Q1 extends App{
    var x=Point(5,7)
    var y=Point(2,8)

    println(x.add(y))

    x.move(x=2,y=4)
    println(x)

    var z=x.distance(y)
    println(z)

    x.invert()
    println(x)
}