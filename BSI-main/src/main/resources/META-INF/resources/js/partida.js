let seg = 0;
let min = 0;

let intervalo;

let pontuacaoTime1 = 0;
let pontuacaoTime2 = 0;

let buttonIniciar = document.getElementById("iniciar-cronometro");
let buttonPausar = document.getElementById("pausar-cronometro");
let buttonFinalizar = document.getElementById("finalizar-partida");

let buttonAdd2PontosJogador1Time1 = document.getElementById("add-2-pontos-jogador1-time-1")
let buttonAdd3PontosJogador1Time1 = document.getElementById("add-3-pontos-jogador1-time-1")

let buttonAdd2PontosJogador2Time1 = document.getElementById("add-2-pontos-jogador2-time-1")
let buttonAdd3PontosJogador2Time1 = document.getElementById("add-3-pontos-jogador2-time-1")

let buttonAdd2PontosJogador3Time1 = document.getElementById("add-2-pontos-jogador3-time-1")
let buttonAdd3PontosJogador3Time1 = document.getElementById("add-3-pontos-jogador3-time-1")

let buttonAdd2PontosJogador1Time2 = document.getElementById("add-2-pontos-jogador1-time-2")
let buttonAdd3PontosJogador1Time2 = document.getElementById("add-3-pontos-jogador1-time-2")

let buttonAdd2PontosJogador2Time2 = document.getElementById("add-2-pontos-jogador2-time-2")
let buttonAdd3PontosJogador2Time2 = document.getElementById("add-3-pontos-jogador2-time-2")

let buttonAdd2PontosJogador3Time2 = document.getElementById("add-2-pontos-jogador3-time-2")
let buttonAdd3PontosJogador3Time2 = document.getElementById("add-3-pontos-jogador3-time-2")

let buttonRetomar = document.getElementById("retomar-cronometro")
let resultadoPartida = document.getElementById("resultado-partida")
let criarPartida = document.getElementById("criar-partida")
let placar = document.getElementById("placar-partida")

function mostrarResultadoPartida() {
    criarPartida.display = "none";
    placar.ariaHidden = false;
    resultadoPartida.display = "grid";
}

function mostrarPlacar() {
    criarPartida.display = "none";
    placar.display = "grid";
    resultadoPartida.display = "none";
}

function doisDigitos(digito){
    if(digito<10){
        return('0'+digito)
    }else{
        return(digito)
    }
}


function iniciar(){
    cronometro();
    ativarBotoes();
    intervalo= setInterval(cronometro,1000);
    buttonIniciar.style.display = "none";
    buttonPausar.style.display = "grid";
    buttonFinalizar.style.display = "grid";

}

function ativarBotoes(){
    buttonAdd2PontosJogador1Time1.disabled = false;
    buttonAdd3PontosJogador1Time1.disabled = false;

    buttonAdd2PontosJogador2Time1.disabled = false;
    buttonAdd3PontosJogador2Time1.disabled = false;

    buttonAdd2PontosJogador3Time1.disabled = false;
    buttonAdd3PontosJogador3Time1.disabled = false;

    buttonAdd2PontosJogador1Time2.disabled = false;
    buttonAdd3PontosJogador1Time2.disabled = false;

    buttonAdd2PontosJogador2Time2.disabled = false;
    buttonAdd3PontosJogador2Time2.disabled = false;

    buttonAdd2PontosJogador3Time2.disabled = false;
    buttonAdd3PontosJogador3Time2.disabled = false;
}

function retomar(){
    cronometro();
    ativarBotoes();
    intervalo= setInterval(cronometro,1000);
    buttonRetomar.style.display = "none";
    buttonPausar.style.display = "grid";

}

function pausar(){
    clearInterval(intervalo)
    buttonPausar.style.display = "none";
    buttonRetomar.style.display = "grid";
}

function finalizar(){
    clearInterval(intervalo);
    desativarBotoes();
    buttonPausar.style.display = "none";
    buttonRetomar.style.display = "grid";

}

function desativarBotoes(){
    buttonAdd2PontosJogador1Time1.disabled = true;
    buttonAdd3PontosJogador1Time1.disabled = true;

    buttonAdd2PontosJogador2Time1.disabled = true;
    buttonAdd3PontosJogador2Time1.disabled = true;

    buttonAdd2PontosJogador3Time1.disabled = true;
    buttonAdd3PontosJogador3Time1.disabled = true;

    buttonAdd2PontosJogador1Time2.disabled = true;
    buttonAdd3PontosJogador1Time2.disabled = true;

    buttonAdd2PontosJogador2Time2.disabled = true;
    buttonAdd3PontosJogador2Time2.disabled = true;

    buttonAdd2PontosJogador3Time2.disabled = true;
    buttonAdd3PontosJogador3Time2.disabled = true;
}

function cronometro(){
    seg++
    if(seg===60){
        min++
        seg=0
    }
    document.getElementById('cronometro').innerText=+doisDigitos(min)+':'+doisDigitos(seg)
}

function adicionar2PontosTime1(){
    pontuacaoTime1 += 2
    document.getElementById(`pontuacao-time-1`).innerText=pontuacaoTime1;
}

function adicionar3PontosTime1(){
    pontuacaoTime1 += 3
    document.getElementById(`pontuacao-time-1`).innerText=pontuacaoTime1;
}

function adicionar2PontosTime2(){
    pontuacaoTime2 += 2
    document.getElementById(`pontuacao-time-2`).innerText=pontuacaoTime2;
}

function adicionar3PontosTime2(){
    pontuacaoTime2 += 3
    document.getElementById(`pontuacao-time-2`).innerText=pontuacaoTime2;
}

