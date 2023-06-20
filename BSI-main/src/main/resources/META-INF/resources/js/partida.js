let seg = 0;
let min = 0;

let intervalo;

let pontuacaoTime1 = 0;
let pontuacaoTime2 = 0;

let buttonIniciar = document.getElementById("iniciar-cronometro");
let buttonPausar = document.getElementById("pausar-cronometro");
let buttonFinalizar = document.getElementById("finalizar-partida");
let buttonAdd2PontosTime1 = document.getElementById("add-2-pontos-time-1")
let buttonAdd3PontosTime1 = document.getElementById("add-3-pontos-time-1")
let buttonAdd2PontosTime2 = document.getElementById("add-2-pontos-time-2")
let buttonAdd3PontosTime2 = document.getElementById("add-3-pontos-time-2")
let buttonRetomar = document.getElementById("retomar-cronometro")

function doisDigitos(digito){
    if(digito<10){
        return('0'+digito)
    }else{
        return(digito)
    }
}


function iniciar(){
    cronometro()
    intervalo= setInterval(cronometro,1000)
    buttonIniciar.style.display = "none";
    buttonPausar.style.display = "inline-block";
    buttonFinalizar.style.display = "inline-block";
    buttonAdd2PontosTime1.disabled = false;
    buttonAdd3PontosTime1.disabled = false;
    buttonAdd2PontosTime2.disabled = false;
    buttonAdd3PontosTime2.disabled = false;
}

function retomar(){
    cronometro()
    intervalo= setInterval(cronometro,1000)
    buttonRetomar.style.display = "none";
    buttonPausar.style.display = "inline-block";
    buttonAdd2PontosTime1.disabled = false;
    buttonAdd3PontosTime1.disabled = false;
    buttonAdd2PontosTime2.disabled = false;
    buttonAdd3PontosTime2.disabled = false;
}

function pausar(){
    clearInterval(intervalo)
    buttonPausar.style.display = "none";
    buttonRetomar.style.display = "inline-block";
}

function finalizar(){
    clearInterval(intervalo)
    buttonAdd2PontosTime1.disabled = true;
    buttonAdd3PontosTime1.disabled = true;
    buttonAdd2PontosTime2.disabled = true;
    buttonAdd3PontosTime2.disabled = true;
    buttonPausar.style.display = "none";
    buttonRetomar.style.display = "inline-block";
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

