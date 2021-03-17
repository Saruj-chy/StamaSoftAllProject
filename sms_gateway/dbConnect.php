<?php

  define('HOST','localhost');
	define('USER','root');
	define('PASS','');
	define('DB','stama_soft_all_project');
	
 //Connecting to Database

 $con = mysqli_connect(HOST,USER,PASS,DB) or die('Unable to Connect');


