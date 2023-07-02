function createRequestAcompanharPartida(){
    return new Request("http://localhost:8080/partida", {
        method: "POST",
        headers: {
            "Accept": "application/json",
            "Content-Type": "application/json"
        },
        body: JSON.stringify(),
    });
}


function acompanharPartida(){

    alert("Deu certo")
    var requisicao = createRequestAcompanharPartida();
    fetch(requisicao)
        .then((response) => {
            if (response.status === 200) {
                return response.json();
            } else {
                alert("Ocorreu algum erro no servidor!");
            }
        })
        .then(json => {
            alert(json.mensagem);
            window.location.href = window.location.origin+json.url;
        });

}