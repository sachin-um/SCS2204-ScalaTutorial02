def toUpper(line:String):String={
    var x=""
    line.foreach(i=>{
        if (i.isLower){
            x+=i.toUpper
        }
        else{
            x+=i
        }
        
    })
    return x
}

def toLower(line:String):String={
    var x=""
    line.foreach(i=>{
        if(i.isUpper){
            x+=i.toLower 
        }
        else{
            x+=i
        }
    })
    return x
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