
function diferenca(n,x){
    let count = 0; 
    for(let i=0; i<n.length; i++){
        if(n.includes(n[i]-x)){
            count++;
        }
    }
    return count;
}

module.exports = diferenca;