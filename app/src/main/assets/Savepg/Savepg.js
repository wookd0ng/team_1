function SaveData(){
    var Keyindex = 0;
    var obj = document.getElementById("parent");
    while(Keyindex < localStorage.length){
        var url = document.createElement("a");
        var key = document.createElement("button");
        key.id = "key"+Keyindex;
        var newbr = document.createElement('br');
        key.innerHTML = localStorage.key(Keyindex);
        var type = localStorage.getItem(key.innerHTML);     // 안드로이드 저장방식을 올라서 임의로 로컬 스토리지를 사용하였습니다. 추후변경 필요
        var list = type.split(" ");
        if (list[0] === "person"){                          // 저장 형식 합의 필요
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


