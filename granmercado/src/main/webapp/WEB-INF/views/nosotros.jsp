<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" pageEncoding="utf8"
	contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html lang="en"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
<spring:url value="/resources/css" var="Css" />
<spring:url value="/resources/js" var="Js" />
<spring:url value="/resources/img" var="Img" />
<spring:url value="/resources/index_files" var="IndexFiles" />

    <title>El Gran Mercado</title>

    <!-- Bootstrap Core CSS -->
    <link href="${Css}/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="${Css}/normalize.css">

    <!-- Custom CSS -->
    <link href="${Css}/modern-business.css" rel="stylesheet">
    
    <link href="${Css}/main.css" rel="stylesheet">
    
    <link rel="Shortcut Icon" href="${Img}/granmercado.ico">
    
    <link href='https://fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,900,900italic|Lato:400,900italic,700italic,400italic,300italic,100,100italic,300,700,900|Source+Sans+Pro:400,700italic,900italic,600italic,400italic,300italic,200italic,900,700,600,300,200|Ubuntu:400,300,500,700,300italic,400italic,500italic,700italic|Exo:400,100,200,300,500,600,700,800,900,100italic,200italic,300italic,400italic,500italic,600italic,700italic,800italic,900italic|Chivo:400,900italic,400italic,900' rel='stylesheet' type='text/css'>

    <!-- Custom Fonts -->
    <link href="${Css}/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.${Js}/1.4.2/respond.min.js"></script>
    <![endif]-->
    <link href="${Css}/css" rel="stylesheet" type="text/css">
    
 <style>
 #popup {
	left: 0;
    position: absolute;
    top: 000;
    width: 100%;
    z-index: 1001;
}

#popup2 {
	left: 0;
    position: absolute;
    top: 0;
    width: 100%;
    z-index: 1001;
}

.content-popup {
margin:0px auto;
margin-top:170px;
padding:10px;
width:500px;
min-height:250px;
border-radius:4px;
background-color:#FFFFFF;
box-shadow: 0 2px 5px #666666;
}

.close {
position:relative;
left:480px;
}
</style>
<script type="text/javascript" src="jquery.js"></script>
<script type="text/javascript">
$(document).ready(function(){
  $('#open').click(function(){
		$('#popup').fadeIn('slow');
		//$('body').css('opacity', '0.5');
		return false;
	});
	
	$('#close').click(function(){
		$('#popup').fadeOut('slow');
		//$('body').css('opacity', '1');
		return false;
	});
	
	$('#open2').click(function(){
		$('#popup2').fadeIn('slow');
		//$('body').css('opacity', '0.5');
		return false;
	});
	
	$('#close2').click(function(){
		$('#popup2').fadeOut('slow');
		//$('body').css('opacity', '1');
		return false;
	});
});
</script>   

<!--Colocar entre <head> y </head> -->
<link rel="stylesheet" href="${Css}/base.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js">
</script>
</head>

<body>
    <nav class="container-fluid" style="background-color:#da007f; height:30px; position:fixed; width:100%; z-index:1050;">

        <div class="container relat" id="font00">
            <ul class="menu-top pull-left">
                <li><a href="<c:url value="/index" />">Inicio </a></li>
				|
                <li><a class="active"  href="<c:url value="/nosotros" />">Nosotros </a></li>
				|
                <li><a href="<c:url value="/contactenos" />">Contáctenos</a></li>
            </ul>
            
		<div class="pull-right absolut">
              <ul class="list-unstyled list-inline list-social-icons">
                  <li class="sPad">
                    <a href="#"><img src="${Img}/icon_fb.png" width="24"/></a>
                  </li>

                  <li class="sPad">
                    <a href="#"><img src="${Img}/icon_tw.png" width="24"/></a>
                  </li>
                  <li class="sPad">
                    <a href="#"><img src="${Img}/icon_yt.png" width="24"/></a>
                  </li>
              </ul>
            </div>
        </div>
    </nav>
    
    <!-- Navigation -->
    <nav class="navbar nav-plusg navbar-fixed-top" role="navigation">
        <div class="container" id="font01">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header" style="margin-top:30px;">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="<c:url value="/index" />"><img class="img-responsive" src="${Img}/Gran_Mercardo_LOGO_2.png" width="180"></a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav ">
                    <li>
                        <a href="<c:url value="/quiero_comprar" />">Productos<br>Ofrecidos</a>
                    </li>
                    <li>
                        <a href="<c:url value="/productos" />">Pizarra de<br>Productos</a>
                    </li>
                    <li>
                        <a class="active"  href="<c:url value="/sube_tu_oferta" />"><span style="color: rgba(218,0,127,1.00); background-color: rgba(255,255,255,1.00);">&nbsp;&nbsp; Sube tu &nbsp;&nbsp;<br>&nbsp;&nbsp; Oferta &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></a>
                    </li>
                    <li>
                    <div class="pull-right  navbar-header">
                    <img src="${Img}/Mistura_Apega_LOGO.png" width="80">
                    </div>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>
    
    <header>
        <div class="">
            <div class="container sPad">
                <div class="col-md-12 sPad">
                    <!--<figure class="sMar">-->
                    <div class="item">
                        <img src="${Img}/nosotros.jpg" alt="" class="img-responsive">
                    </div>
                    <!--</figure>-->
                    <div class="bgTitle margLef">
                        <h2 class="pad">NOSOTROS</h2>
                    </div>                  
                </div>
                    
                </div>
            </div>
        </div>
    </header>


    <!-- Page Content -->
 <div class="container">


    <div class="row">
        <div class="col-lg-8 sPad">
            <p class="textNos" id="acerca">
                Es un Sistema de Información que fue desarrollado pensando en todos aquellos productores del campo y comercializadores de alimentos que deseen establecer contactos para la comercialización de sus productos, a través de esta herramienta la Sociedad Peruana de Gastronomía – APEGA pone en valor el esfuerzo del productor por proteger y conservar los productos agrarios como parte de la nuestra inmensa biodiversidad, resaltando la importancia de la identidad territorial como un factor que diferencia entre un producto emblemático y otro común. Además, a través de este Sistema de Información se pueden consultar precios de los productos, publicar ofertas y demandas y establecer contactos para la comercialización dentro de los principios del comercio justo. 
				<br><br>
				Si eres producto del campo puedes ofertar y si eres empresario y comercializador de alimentos puedes demandar el producto de tu preferencia a través de esta plataforma. 
                <br><br>
                
                <span id="historia"></span>
            </p>
            <h2 class="margLef"> Historia / Antecedentes</h2>
            <p class="textNos">
                El Gran Mercado nace en el corazón de la Feria Gastronómica Mistura como un espacio donde los pequeños productores agropecuarios de todas las regiones del país se reúnen para exponer los mejores productos de su despensa. 
				<br><br>
				Debido a las pocas posibilidades de encontrar una gran diversidad de productos como los que se ofrecen durante 10 días al año en Mistura, surge el Gran Mercado Mistura a través de esta Plataforma virtual. 
				<br><br>
				En esta plataforma web se brinda la posibilidad tanto al productor agropecuario como a las empresas y/o comercializadores de alimentos la posibilidad de ofertar y adquirir de manera permanente los principales productos emblemáticos de la biodiversidad peruana. 
				<br><br>
				Con este sistema de información, los productos del Gran Mercado Mistura estarán a tu disposición en el momento que más lo necesites.
            </p>
        </div>
 
    </div>


<footer>
        <hr>
        <div class="row">
            <div class="col-md-3">
            		<figure>
                    <img src="${Img}/Gran_Mercardo_LOGO_1.png" alt="" class="img-responsive">
                    </figure>
            </div>
            
            <div class="col-md-3">
            </div>
            
            <div class="col-md-3">
                <ul>
                	<p class="font05">
                    <br>
                    Oficina Central APEGA<br>
                    TEL： 51 (1) 461.2221
                    </p>
                </ul>
            </div>
            <div class="col-md-3">
                <ul class="">
                <p class="font05">
                	<br>
                    Escríbenos a<br>
                    <span><a href="mailto:apega@apega.pe">apega@apega.pe</a></span>
                 </p>   
                </ul>
            </div>
        </div>
        
        
        <hr>
        
        
        <div class="row">
            <div class="col-md-6">
            		<ul>
                    <li>Con el apoyo de:</li>
                    </ul>
                    
                    <div class="col-md-12">
                            <div class="col-md-4" sPad>
                            <img src="${Img}/bid.png" alt=""  class="img-responsive">
                            </div>
                            <div class="col-md-4" sPad>
                            <img src="${Img}/fomin.png" alt=""  class="img-responsive">
                            </div>
                            <div class="col-md-4">
                            </div>
                    </div>
            </div>
            
            <div class="col-md-3">
                <ul>
                	<br>
                    <li><a class="font05" href="">> Qué es El Gran Mercado?</a></li>                        
                    <li><a class="font05" href="">> Quiero comprar </a></li>
                    <li><a class="font05" href="">> Quiero vender </a></li>
                    <li><a class="font05" href="">> Pizarra de Productos </a></li>
                    <li><a class="font05" href="">> Productos de Estación </a></li>
                </ul>
            </div>
            <div class="col-md-3">
                <ul class="">
                	<br>
                    <li><a href="" class="font05">> Contáctanos</a></li>
                    <li><a href="" class="font05">> Política de Privacidad</a></li>
                    <li><a href="" class="font05">> FAQ</a></li>
                </ul>
            </div>
        </div>


        <hr>
        
        <div class="row">
            <div class="col-md-2">
                <p>© 2015 Gran Mercado.</p>
            </div>
            <div class="col-md-offset-8 col-md-2">
                <p><a href="http://www.plusgstudio.com" target="_blank">Diseñado por PlusG</a></p>
            </div>
        </div>
</footer>



</div>


    <!-- jQuery -->
    <script src="${Js}/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="${Js}/bootstrap.min.js"></script>

    <!-- Script to Activate the Carousel -->
    <script>
    $('.carousel').carousel({
        interval: 5000 //changes the speed
    })
    </script>



<script src="http://www.phpres.net/js/base.js"></script>
</body></html>