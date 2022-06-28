function restcall(){
    let httpRequest = new XMLHttpRequest();
    let firstname = document.getElementById("firstname").value;
    let lastname = document.getElementById("lastname").value;
    httpRequest.open("GET","http://localhost:8080/api/call/"+firstname+"/"+lastname);
    httpRequest.send();
    httpRequest.onload = function(){
        alert(httpRequest.responseText);
    }
}