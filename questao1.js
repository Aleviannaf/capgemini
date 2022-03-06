function ordena(arr){
    let aux;
    for(let i=0; i<arr.length;i++){
        for(let j =0; j<arr.length -1; j++){
            if(arr[j]>arr[j+1]){
                aux = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = aux; 
            }
        }
    }

    return arr;
}


function mediana(arr){
    
    vetor =ordena(arr);
   let tamanho = vetor.length;
   let meio = Math.floor(tamanho / 2);
  
   return vetor[meio];

}

module.exports = mediana;
