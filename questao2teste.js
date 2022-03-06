const diferenca = require("./questao2");


let teste = diferenca([1, 5, 3, 4, 2],2)
let resultEsperado = 3;
if(teste === resultEsperado){
    console.log("Passou!");
} else{
    console.log("Não passou!");
}