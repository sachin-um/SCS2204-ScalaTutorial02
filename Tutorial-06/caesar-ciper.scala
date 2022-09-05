object Main  extends App{
    val alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    val encrypt=(c:Char,key:Int,a:String)=> a((a.indexOf(c.toUpper)+key)%a.size)
    val decrypt=(c:Char,key:Int,a:String)=> a((a.indexOf(c.toUpper)-key)%a.size)

    val caesarCipher=(method:(Char,Int,String)=>Char,s:String,key:Int,a:String)=> s.map(method(_,key,a))

    var message="Sachin"
    val encrypted=caesarCipher(encrypt,message,5,alphabet)

    println(encrypted)

    val decrypted=caesarCipher(decrypt,encrypted,5,alphabet)
    println(decrypted)
}

