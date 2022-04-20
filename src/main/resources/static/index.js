$(function (){
    hentAlle();
    hentbiler1();
});
function hentbiler1(){
    $.get("/hentbiler1", function (data){
        formaterBiler(data);
    });
}
function formaterBiler(biler){
    let ut1 = "<select id='valgtBil1'>";
    for(const bil of biler){
        ut1+= "<option value='"+bil.merke+"'>"+bil.model+"</option>";
    }
    ut1+="</select>";
    $("#bilene").html(ut1);
}

function hallo(){
    const kunde ={
        navn : $("#navn").val(),
        addresse : $("#addresse").val(),
        eierbil : $('input[name=valgtBil]:checked').val(),
        forerkort:$('input[name=forerkort]:checked').val(),
        type:$("#valgtBil1").val()
    };
    $.post("/lagre",kunde, function (){
        window.location.href = '/';
    });

}

function hentAlle(){
    $.get("/hentAlle", function (data){
        formaterData(data);
    });

}
function formaterData(kunder){
    let ut = "<table><tr><th>Navn</th><th>Adresse</th><th>Førerkort</th><th>Bil</th></tr>";
    for(const kunde of kunder){
        let kort = "";
        if(kunde.forerkort){
            kort="ja";
        }
        else {
            kort="nei";
        }
        ut+="<tr><td>"+kunde.navn+"</td><td>"+kunde.addresse+"</td><td>"+kort+"</td><td>"+kunde.eierbil+"</td></tr>";
    }
    ut+="</table>";
    $("#ut").html(ut);
}
function slett(){
    $.get("/slettAlle", function (){
        window.location.href = '/';
    });
}