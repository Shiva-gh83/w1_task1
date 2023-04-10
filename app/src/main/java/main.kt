fun task1(x: Int, y: Int, z: Int){
    var max: Int
    var min: Int
    var even: String= ""
    var odd: String= ""

    if (x>y){
        if(x>z){
            if(y>z){
                max=x
                min=z
            }
            else {
                max=x
                min=y
            }
        }
        else{
            max=z
            min=y
        }
    }
    else{
        if(y<z){
            max=z
            min=x
        }
        else{
            if(x<z){
                max=y
                min=x
            }
            else{
                max=y
                min=z
            }
        }
    }

    println("The maximum number is: $max")
    println("The minimum number is: $min")

    if (x%2==0){
        if (even=="") {
            even= "$x"
        }
        else{
            even= even+ ", $x"
        }
    }else{
        if (odd=="") {
            odd= "$x"
        }
        else {
            odd= odd+ ", $x"
        }
    }

    if (y%2==0){
        if (even==""){
            even= "$y"
        }
        else{
            even= even+ ", $y"
        }
    }else{
        if (odd=="") {
            odd= "$y"
        }
        else {
            odd= odd+ ", $y"
        }
    }

    if (z%2==0){
        if (even==""){
            even= "$z"
        }
        else{
            even= even+ ", $z"
        }
    }else{
        if (odd=="") {
            odd= "$z"
        }
        else {
            odd= odd+ ", $z"
        }
    }
    println("Even numbers are: $even")
    println("Odd numbers are: $odd")

}





fun main() {

    task1(8,9,6)

}
