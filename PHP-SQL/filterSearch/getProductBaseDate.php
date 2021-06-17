<?php 

if($_SERVER['REQUEST_METHOD']=='POST'){
    $from_date = $_POST['from_date'];
    $to_date = $_POST['to_date'];
}


//Importing database
 require_once('dbConnect.php');
 
 
mysqli_query($con,'SET CHARACTER SET utf8');
mysqli_query($con,"SET SESSION collation_connection ='utf8_general_ci'");



 $r = getPhoneName($con, $from_date, $to_date);
//  var_dump($r);
 $ProductArray = array();
 while($row=$r->fetch_array(MYSQLI_ASSOC)){
  $ProductArray[] = $row ;
}


$response = array();
$response['result'] = array();
$response['result'] = $ProductArray;


echo json_encode($response) ;


 function getPhoneName($con, $from_date, $to_date ){
     $sql = "SELECT * FROM `product_details_with_date` WHERE `entrydate`>='$from_date' AND `entrydate`<= '$to_date' order by `entrydate` ";

  $r = mysqli_query($con,$sql) ;
  return $r ;
 }

 mysqli_close($con) ;