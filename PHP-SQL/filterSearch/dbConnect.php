<?php


	//$connect = mysqli_connect("localhost","leaditap_combox","=2q!oN.vKTix","leaditap_combox");


	//define('DB_USER', "leaditap_combox"); 
	//define('DB_PASSWORD', "=2q!oN.vKTix"); 
	//define('DB_DATABASE', "leaditap_combox"); 
	//define('DB_SERVER', "localhost"); 



    define('HOST','localhost');
	define('USER','root');
	define('PASS','');
	define('DB','stama_soft_all_project');
	
 //Connecting to Database

 $con = mysqli_connect(HOST,USER,PASS,DB) or die('Unable to Connect');


