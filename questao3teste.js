const encripitar = require("./questao3");



let teste = encripitar("tenha um bom dia")
let resultEsperado = "taoa eum nmd hbi";
if(teste === resultEsperado){
    console.log("Passou!");
} else{
    console.log("Não passou!");
}