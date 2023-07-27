function validate(){
	let email = document.getElementById("email").value;
    let password = document.getElementById("password").value;

    if(email == "bocarsock5@gmail.com" && password == "test" || email == "fatimdoumbouya@hotmail.com" && password == "test2"){
        alert("Login successful!");
    } else
        alert("Incorrect email or password!");
}

function message(){
    alert("Message sent!");
}