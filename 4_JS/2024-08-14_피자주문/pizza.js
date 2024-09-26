function order() {
    // ** 주문자 정보 **********************
    const address = document.getElementById("address");
    const phone = document.getElementById("phone");

    let orderer_info = document.getElementById("orderer_info");
    
    orderer_info.innerHTML = "<ul>"
                                + "<li> 주소 : " + address.value + "</li>";
                                + "<li>연락처 : " + phone.value + "</li>"
                            + "</ul>";
    
    // ******************************************

    // ** 메뉴 정보 ******************************
    const mainMenu = document.getElementById("main_menu");
    const toppings = document.getElementsByName("topping");
    // document.querySelectorAll("input[name=topping]");
    const sideMenu = document.getElementsByName("side_menu");

    const ulEle = document.createElement("ul");
    const liEle1 = document.createElement("li");
    const liEle2 = document.createElement("li");
    const liEle3 = document.createElement("li");

    const txtNode1 = document.createTextNode("메뉴 : " + mainMenu.value);

    let selTopping = [];
    for (let t of toppings) {
        if(t.checked) {     // checked: 체크되어있는지여부(T/F)
            selTopping.push(t.value);
        }
    }
    const txtNode2 = document.createTextNode("토핑: " + selTopping);

    let selSideMenu = [];
    for(let s of sideMenu) {
        if(s.checked) {
            selSideMenu.push(s.value);
        }
    }
    const txtNode3 = document.createTextNode("사이드 : " + selSideMenu);

    liEle1.appendChild(txtNode1);
    liEle2.appendChild(txtNode2);
    liEle3.appendChild(txtNode3);

    ulEle.appendChild(liEle1);
    ulEle.appendChild(liEle2);
    ulEle.appendChild(liEle3);


    const orderList = document.querySelector("#order_list");
    orderList.appendChild(ulEle);

    // ******************************************

}

function deleteOrer() {
    // 주문자 정보 삭제
    document.getElementById("orderer_info").innerHTML = "";

    // 메뉴 정보 삭제
    document.querySelector("#order_list > ul").remove();
}