def toUpper(line:String):String={
    return line.toUpperCase()
}

def toLower(line:String):String={
    return line.toLowerCase()
}
def formatName(f:(String)=>String,name:String)={
    val string=f(name)
    println(string)
}


object Q3 extends App{
    var x="Sachin"
    var y="DAMIKa"
    formatName(toUpper,x)
    formatName(toLower,y)
}