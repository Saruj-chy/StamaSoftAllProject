<?php
if($_SERVER['REQUEST_METHOD']=='POST'){
    $userEmail = $_POST['email']; 
    

}
require_once('dbConnect.php');
mysqli_query($con,'SET CHARACTER SET utf8');
mysqli_query($con,"SET SESSION collation_connection ='utf8_general_ci'");

$r = checkUserEmail($con, $userEmail);
if(mysqli_num_rows($r) == 1){
    while($row=$r->fetch_array(MYSQLI_ASSOC)){
        $emailCheckData = $row['password'];
    }


    $subject = "Email from Testing App";
    $body = "Your contains password is $emailCheckData";
    $headers = "From: saruj.chy222@gmail.com";
    if (mail($userEmail, $subject, $body, $headers)) {
        echo "Check Your Email";
    } else {
        echo "Please sent your email again";
    }

}else{
    echo "Email is invalidate";
}



function checkUserEmail($con, $userEmail){
    $sql = "SELECT password FROM user_email_check WHERE email = '$userEmail' " ;
    $r = mysqli_query($con,$sql) ;
    return $r ;
   }

 
