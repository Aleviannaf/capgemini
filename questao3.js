function encripitar(arr) {
    let string = arr.split(" ").join("");
    let tamanho = Math.ceil(Math.sqrt(string.length));
    let vetor = new Array(tamanho);
    for (i = 0; i < tamanho; i++) {
        let j = 0;
        let incremento = i;
        vetor[i] = new Array(tamanho);

        while (j < tamanho) {
            vetor[i][j] = string[incremento];
            j++;
            incremento += tamanho;
        }

    }

    let a = [];
    for(let i=0;i<tamanho;i++){
     a[i]= vetor[i].reduce((a,b)=> b!== undefined ? a+b : a+'');
    }

    return a.join(' ');
    
}
module.exports = encripitar;
