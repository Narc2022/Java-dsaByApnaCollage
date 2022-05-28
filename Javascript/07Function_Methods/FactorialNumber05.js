function factorial(a){
    let factorialConst=1;
    for(let i=a;i>=1;i--){
        factorialConst = factorialConst *i;
    }
    console.log(factorialConst);
}
factorial(3);