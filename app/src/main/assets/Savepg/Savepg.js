function SaveData(){
    var Keyindex = 0;
    var obj = document.getElementById("parent");
    while(Keyindex < localStorage.length){
        var url = document.createElement("a");
        var key = document.createElement("button");
        key.id = "key"+Keyindex;
        var newbr = document.createElement('br');
        key.innerHTML = localStorage.key(Keyindex);
        var type = localStorage.getItem(key.innerHTML);
        var list = type.split(" ");
        if (list[0] === "person"){
            url.href = `PersonMenuPg.html?${localStorage.key(Keyindex)}`;
        }
        else if (list[0] === "menu"){
            url.href = `MenuCountPg.html?${localStorage.key(Keyindex)}`;
        }
        obj.appendChild(url);
        url.appendChild(key);
        obj.appendChild(newbr);
        Keyindex = Keyindex + 1;
    }
}


