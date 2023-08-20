/* 인원-선호 메뉴 페이지 */

var addTbl;
//var cnt=0;

/* 추가버튼 */              //Row 추가
function addRow() {
    addTbl = document.getElementById("_table");

    var addRow = addTbl.insertRow();
    addRow.onmouseover=function(){addTbl.clickedRowIndex=this.rowIndex}; //clickedRowIndex - 클릭한 Row의 위치를 확인;

    var addCell = addRow.insertCell();

    //contents_01 
    var con = "";   
    con+="<div class='newCon'><input type='text' class='form_control' placeholder='이름 입력' style='width: 80%;'></div>";

    addCell.innerHTML = con; ///

    //contents_02 
    addCell = addRow.insertCell();
    var con = "";   
    con+="<div class='newCon'><input type='text' class='form_control' placeholder='메뉴 입력' style='width: 90%;'></div>";

    addCell.innerHTML = con; ///

    //contents_03
    addCell = addRow.insertCell();
    var con = "";   
    con+="<div class='newCon'><input class='delete' type='button' value='삭제' onClick='removeRow()'></div>";   

    addCell.innerHTML = con; ///
    
    //cnt++;
}

/*삭제 버튼*/              //Row 삭제
function removeRow() {
  addTbl.deleteRow(addTbl.clickedRowIndex);
}

/*확인버튼*/

/*웹-앱 인터페이스*/
/*
1) (웹에서 앱호출) 웹에서 앱단 화면제어 - movePage(...params..)
2) (앱에서 웹호출) 앱에서 웹단 화면제어 - movePage(...params..)
3) (앱에서 웹호출) 초기 앱에서 웹으로 데이터 전달 - loadData(...params..)
4) (웹에서 앱호출) 웹에서 저장할 데이터를 앱으로 전달 - saveData(...params..)
*/
function movePage(){}
function movePage(){}

function loadData(){}
function loadData(){}

/**/

