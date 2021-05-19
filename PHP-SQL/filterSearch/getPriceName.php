<?php 
//Importing database
 require_once('dbConnect.php');
 
 
mysqli_query($con,'SET CHARACTER SET utf8');
mysqli_query($con,"SET SESSION collation_connection ='utf8_general_ci'");



 $r = getPhoneName($con);
//  var_dump($r);
 $phoneData = array();
 while($row=$r->fetch_array(MYSQLI_ASSOC)){
  $phoneData[] = $row ;
}


$response = array();
$response['result'] = array();
$response['result'] = $phoneData;


echo json_encode($response) ;




 function getPhoneName($con){
  $sql = "SELECT * FROM food_price " ;
  $r = mysqli_query($con,$sql) ;
  return $r ;
 }

 mysqli_close($con) ;