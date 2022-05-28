function odd(n){
    let sum=0;
    for(i=1;i<=n;i++){
        if(i%2!=0){
            sum=sum+i;
        }
    }
    console.log(sum);
}
odd(10);