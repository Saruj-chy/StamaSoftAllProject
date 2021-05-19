<?php 
 if($_SERVER['REQUEST_METHOD']=='POST'){

  $email = $_POST['email'];   
  $password = $_POST['password'];   
  $state = $_POST['state'];   
  
}

require_once('dbConnect.php');
mysqli_query($con,'SET CHARACTER SET utf8');
mysqli_query($con,"SET SESSION collation_connection ='utf8_general_ci'");

if($state=="sign_up"){
  $r = insertSignIn($con, $email, $password );
  if($r){
    echo 'Sign up Successfully ';
}else{
    echo 'Sign up failed';
}
}else if($state=="sign_in"){
  $r = getSignUp($con, $email, $password ) ;
  if(mysqli_num_rows($r) >0){
    echo 'Sign in Successfully ';
  }else{
      echo 'Sign in Failed';
  }

}

 
function insertSignIn($con, $email, $password  ){
  $sql = "INSERT INTO `user_email_check`(`email`, `password`) VALUES (?,?)";  
  $stmt = $con->prepare($sql) ;
  $stmt -> bind_param('ss', $email, $password ) ;
  $stmt -> execute();
  $stmt->close() ;
  return $stmt ;
}

function getSignUp($con, $email, $password ){
  $sql = "SELECT password FROM user_email_check WHERE email = '$email' and password= '$password'  " ;
    $r = mysqli_query($con,$sql) ;
    return $r ;
}


mysqli_close($con) ;
?>