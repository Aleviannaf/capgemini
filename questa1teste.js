const mediana = require("./questao1");

let teste =mediana([9, 2, 1, 4, 6]);
let resultEsperado = 4;
if(teste === resultEsperado){
    console.log("Passou!");
} else{
    console.log("Não passou!");
}