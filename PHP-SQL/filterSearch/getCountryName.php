<?php 
//Importing database
 require_once('dbConnect.php');
 
 
mysqli_query($con,'SET CHARACTER SET utf8');
mysqli_query($con,"SET SESSION collation_connection ='utf8_general_ci'");



 $r = getCountryName($con);
//  var_dump($r);
 $countryData = array();
 while($row=$r->fetch_array(MYSQLI_ASSOC)){
  $countryData[] = $row ;
}


$response = array();
// $response['error'] = !count($countryData) > 0;

// if ($response['error']){
//   $response['msg'] = "Data insufficient";
// }
// else{
$response['result'] = array();
$response['result'] = $countryData;
// }

echo json_encode($response) ;




 function getCountryName($con){
  $sql = "SELECT * FROM country_name " ;
  $r = mysqli_query($con,$sql) ;
  return $r ;
 }

 mysqli_close($con) ;