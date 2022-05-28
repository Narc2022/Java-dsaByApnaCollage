function prime(a){
    if (a%a==0 && a%1==0){
        if(a%2==0){
            console.log("not a prime number")
        }else{
            console.log("It is a prime number")
        }
    } 
}
prime(23);