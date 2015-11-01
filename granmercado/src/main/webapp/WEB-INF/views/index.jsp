<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" pageEncoding="utf8" contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<!-- saved from url=(0052)http://www.perfectview.com.pe/ipnet/plusg/index.html -->
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
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <link href="${Css}/css" rel="stylesheet" type="text/css">
</head>

<body>
    <nav class="container-fluid" style="background-color:#da007f; height:30px; position:fixed; width:100%; z-index:1050;">

        <div class="container relat" id="font00">
            <ul class="menu-top pull-left">
                <li><a class="active" href="index.html">Inicio </a></li>
				|
                <li><a href="nosotros.html">Nosotros </a></li>
				|
                <li><a href="multimedia.html">Multimedia </a></li>
				|
                <li><a href="contactenos.html">Contáctenos</a></li>
            </ul>
            
		<div class="pull-right absolut">
              <ul class="list-unstyled list-inline list-social-icons">
                  <li class="sPad">
                    <a href="#"><img src="${Img}/icon_fb.png" width="20"/></a>
                  </li>

                  <li class="sPad">
                    <a href="#"><img src="${Img}/icon_tw.png" width="20"/></a>
                  </li>
                  <li class="sPad">
                    <a href="#"><img src="${Img}/icon_yt.png" width="20"/></a>
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
                <a class="navbar-brand" href="index.html"><img class="img-responsive" src="${Img}/Gran_Mercardo_LOGO_2.png" width="180"></a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav ">
                    <li>
                        <a href="quiero_comprar.html">Quiero<br>Comprar</a>
                    </li>
                    <li>
                        <a href="quiero_vender.html">Quiero<br>Vender</a>
                    </li>
                    <li>
                        <a href="productos.html">Pizarra de<br>Productos</a>
                    </li>
                    <li>
                        <a href="#">Productos<br>de Estación</a>
                    </li>
                    <li>
                        <a href="#">Infórmate</a>
                    </li>
                    <li>
                        <a href="#">Los<br>Campeones</a>
                    </li>
                    
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>

    <!-- Header Carousel -->
    <header id="myCarousel" class="container carousel slide" >
        <!-- Indicators -->
        <ol class="carousel-indicators">
            <li data-target="#myCarousel" data-slide-to="0" class=""></li>
            <li data-target="#myCarousel" data-slide-to="1" class="active"></li>
            <li data-target="#myCarousel" data-slide-to="2" class=""></li>
        </ol>

        <!-- Wrapper for slides -->
        <div class="carousel-inner">
            <div class="item">
                <div class="fill" style="background-image:url(&#39;resources/img/bg01.jpg&#39;);"></div>
                <div class="carousel-caption">
                    <h2>TITULO 1</h2>
                    <p>
                        Aquí va la descripción del Banner 1
                    </p>
                </div>
            </div>
            <div class="item active">
                <div class="fill" style="background-image:url(&#39;resources/img/bg02.jpg&#39;);"></div>
                <div class="carousel-caption">
                    <h2>TÍTULO 2</h2>
                    <p>
                        Aquí va la descripción del Banner 2
                    </p>
                </div>
            </div>
            <div class="item">
                <div class="fill" style="background-image:url(&#39;resources/img/bg03.jpg&#39;);"></div>
                <div class="carousel-caption">
                    <h2>TÍTULO 3</h2>
                    <p>
                        Aquí va la descripción del Banner 3
                    </p>
                </div>
            </div>
        </div>

        <!-- Controls -->
        <a class="left carousel-control" href="${Css}/index.html#myCarousel" data-slide="prev">
            <span class="icon-prev"></span>
        </a>
        <a class="right carousel-control" href="${Css}/index.html#myCarousel" data-slide="next">
            <span class="icon-next"></span>
        </a>
    </header>

    <!-- Page Content -->
 <div class="container">


    <div class="row">
        <div class="col-lg-offset-4 col-lg-8 sPad">
            <h2 class="headTit">Pizarra de Productos</h2>
        </div>
        
        <div class="contCuerpo">
        	<!-- Area Blanco-->
            <div class="contWhite">
                <div class="col-md-3 sPad">
                    <figure class="sMar">
                        <a href="#"><img class="img-responsive" src="${Img}/producto_aji_01.jpg"/></a>
                    </figure>
                </div>
                <div class="col-md-7">
                    <h2 class="font06">Ají</h2>
                    <p>
                    Este condimento saborizante, tan difundido en toda América y tan bien recibido en toda Europa desde principios de la transculturización. El ají, cuando se consume en concentraciones adecuadas produce una sensación urente muy estimulante del apetito, 
                    </p>
                    <a href="#">> MAS INFORMACIÓN</a>
                    
                </div>
                <div class="col-md-2">
                    <div class="contEnlace">
                        <a href="#">COMPRAR <img src="${Img}/flecha_02.png" width="25"/></a>
                        <a href="#">VENDER <img src="${Img}/flecha_02.png" width="25"/></a>
                    </div>
                    
                </div>
            </div>
            <!-- Area Blanco-->
            
            <!-- Area Gris-->
            <div class="contGray">
                <div class="col-md-3 sPad">
                    <figure class="sMar">
                        <a href="#"><img class="img-responsive" src="${Img}/producto_chirimoya_01.jpg"/></a>
                    </figure>
                </div>
                <div class="col-md-7">
                    <h2 class="font06">Chirimoya</h2>
                    <p>
                    Este condimento saborizante, tan difundido en toda América y tan bien recibido en toda Europa desde principios de la transculturización. El ají, cuando se consume en concentraciones adecuadas produce una sensación urente muy estimulante del apetito, 
                    </p>
                    <a href="#">> MAS INFORMACIÓN</a>
                    
                </div>
                <div class="col-md-2">
                    <div class="contEnlace">
                        <a href="#">COMPRAR <img src="${Img}/flecha_02.png" width="25"/></a>
                        <a href="#">VENDER <img src="${Img}/flecha_02.png" width="25"/></a>
                    </div>
                    
                </div>
            </div>
            <!-- Fin Area Gris-->
            
            <!-- Area Blanco-->
            <div class="contWhite">
                <div class="col-md-3 sPad">
                    <figure class="sMar">
                        <a href="#"><img class="img-responsive" src="${Img}/producto_lucuma_01.jpg"/></a>
                    </figure>
                </div>
                <div class="col-md-7">
                    <h2 class="font06">Lúcuma</h2>
                    <p>
                    Este condimento saborizante, tan difundido en toda América y tan bien recibido en toda Europa desde principios de la transculturización. El ají, cuando se consume en concentraciones adecuadas produce una sensación urente muy estimulante del apetito, 
                    </p>
                    <a href="#">> MAS INFORMACIÓN</a>
                    
                </div>
                <div class="col-md-2">
                    <div class="contEnlace">
                        <a href="#">COMPRAR <img src="${Img}/flecha_02.png" width="25"/></a>
                        <a href="#">VENDER <img src="${Img}/flecha_02.png" width="25"/></a>
                    </div>
                    
                </div>
            </div>
            <!-- Area Blanco-->
            
            <!-- Area Gris-->
            <div class="contGray">
                <div class="col-md-3 sPad">
                    <figure class="sMar">
                        <a href="#"><img class="img-responsive" src="${Img}/producto_olluco_01.jpg"/></a>
                    </figure>
                </div>
                <div class="col-md-7">
                    <h2 class="font06">Olluco</h2>
                    <p>
                    Este condimento saborizante, tan difundido en toda América y tan bien recibido en toda Europa desde principios de la transculturización. El ají, cuando se consume en concentraciones adecuadas produce una sensación urente muy estimulante del apetito, 
                    </p>
                    <a href="#">> MAS INFORMACIÓN</a>
                    
                </div>
                <div class="col-md-2">
                    <div class="contEnlace">
                        <a href="#">COMPRAR <img src="${Img}/flecha_02.png" width="25"/></a>
                        <a href="#">VENDER <img src="${Img}/flecha_02.png" width="25"/></a>
                    </div>
                    
                </div>
            </div>
            <!-- Fin Area Gris-->
            
           <!-- Area Blanco-->
            <div class="contWhite">
                <div class="col-md-3 sPad">
                    <figure class="sMar">
                        <a href="#"><img class="img-responsive" src="${Img}/producto_papa_nativa_01.jpg"/></a>
                    </figure>
                </div>
                <div class="col-md-7">
                    <h2 class="font06">Papa Nativa</h2>
                    <p>
                    Este condimento saborizante, tan difundido en toda América y tan bien recibido en toda Europa desde principios de la transculturización. El ají, cuando se consume en concentraciones adecuadas produce una sensación urente muy estimulante del apetito, 
                    </p>
                    <a href="#">> MAS INFORMACIÓN</a>
                    
                </div>
                <div class="col-md-2">
                    <div class="contEnlace">
                        <a href="#">COMPRAR <img src="${Img}/flecha_02.png" width="25"/></a>
                        <a href="#">VENDER <img src="${Img}/flecha_02.png" width="25"/></a>
                    </div>
                    
                </div>
            </div>
            <!-- Area Blanco-->
            
            <!-- Area Gris-->
            <div class="contGray">
                <div class="col-md-3 sPad">
                    <figure class="sMar">
                        <a href="#"><img class="img-responsive" src="${Img}/producto_pina_01.jpg"/></a>
                    </figure>
                </div>
                <div class="col-md-7">
                    <h2 class="font06">Piña</h2>
                    <p>
                    Este condimento saborizante, tan difundido en toda América y tan bien recibido en toda Europa desde principios de la transculturización. El ají, cuando se consume en concentraciones adecuadas produce una sensación urente muy estimulante del apetito, 
                    </p>
                    <a href="#">> MAS INFORMACIÓN</a>
                    
                </div>
                <div class="col-md-2">
                    <div class="contEnlace">
                        <a href="#">COMPRAR <img src="${Img}/flecha_02.png" width="25"/></a>
                        <a href="#">VENDER <img src="${Img}/flecha_02.png" width="25"/></a>
                    </div>
                    
                </div>
            </div>
            <!-- Fin Area Gris-->
            
            <!-- Area Blanco-->
            <div class="contWhite">
                <div class="col-md-3 sPad">
                    <figure class="sMar">
                        <a href="#"><img class="img-responsive" src="${Img}/producto_quinua_01.jpg"/></a>
                    </figure>
                </div>
                <div class="col-md-7">
                    <h2 class="font06">Quinua</h2>
                    <p>
                    Este condimento saborizante, tan difundido en toda América y tan bien recibido en toda Europa desde principios de la transculturización. El ají, cuando se consume en concentraciones adecuadas produce una sensación urente muy estimulante del apetito, 
                    </p>
                    <a href="#">> MAS INFORMACIÓN</a>
                    
                </div>
                <div class="col-md-2">
                    <div class="contEnlace">
                        <a href="#">COMPRAR <img src="${Img}/flecha_02.png" width="25"/></a>
                        <a href="#">VENDER <img src="${Img}/flecha_02.png" width="25"/></a>
                    </div>
                    
                </div>
            </div>
            <!-- Area Blanco-->
            
            <!-- Area Gris-->
            <div class="contGray">
                <div class="col-md-3 sPad">
                    <figure class="sMar">
                        <a href="#"><img class="img-responsive" src="${Img}/producto_tomate_01.jpg"/></a>
                    </figure>
                </div>
                <div class="col-md-7">
                    <h2 class="font06">Tomate</h2>
                    <p>
                    Este condimento saborizante, tan difundido en toda América y tan bien recibido en toda Europa desde principios de la transculturización. El ají, cuando se consume en concentraciones adecuadas produce una sensación urente muy estimulante del apetito, 
                    </p>
                    <a href="#">> MAS INFORMACIÓN</a>
                    
                </div>
                <div class="col-md-2">
                    <div class="contEnlace">
                        <a href="#">COMPRAR <img src="${Img}/flecha_02.png" width="25"/></a>
                        <a href="#">VENDER <img src="${Img}/flecha_02.png" width="25"/></a>
                    </div>
                    
                </div>
            </div>
            <!-- Fin Area Gris-->
            
        </div>
    </div>

    <div class="row">
        <div class="contInf">
            <div class="col-md-6 sPad">
                <div class="contAz">
                    <h2>Qué es El Gran Mercado?</h2>
                    <p>
                     Es un Sistema de Información que fue desarrollado pensando en todos aquellos productores del campo y comercializadores de alimentos que deseen establecer contactos para la comercialización de sus productos, a través de esta herramienta la Sociedad Peruana de Gastronomía – APEGA pone en valor el esfuerzo del productor por proteger y conservar los productos agrarios como parte de la nuestra inmensa biodiversidad, resaltando la importancia de la identidad territorial como un factor que diferencia entre un producto emblemático y otro común.
                    </p>

                </div>
                <div class="contEnlace2">
                    <a href="http://www.perfectview.com.pe/ipnet/plusg/proyecto1.html">Leer todo <img src="${Img}/flecha_02.png" width="25"/></a>
                </div>
            </div>
            <div class="col-md-6 sPad">
                <div class="contAz zTop">
                    
                </div>
                <figure class="sMar">
                    <img src="${Img}/granmercado.jpg" alt="" class="img-responsive">
                </figure>
            </div>
        </div>
    </div>

    <footer>
        <hr>
        <div class="row">
            <div class="col-md-2">
                <figure>
                    <img src="${Img}/Gran_Mercardo_LOGO_1.png" alt="" class="img-responsive">
                </figure>
                
            </div>
            <div class="col-md-offset-2 col-md-4">
                <p class="font05 pull-right">
                    Oficina Central APEGA<br>
                    <span>TEL： 51 (1) 211.1111</span>
                </p>
            </div>
            <div class="col-md-4">
                <p class="font05">
                    Escríbenos a<br>
                    <span><a href="mailto:apega@apega.pe">apega@apega.pe</a></span>
                </p>
            </div>
        </div>
        <hr>
        <div class="row">
            <div class="col-md-6"></div>
            <div class="col-md-3">
                <ul>
                    <li><a class="font05" href="">> Qué es El Gran Mercado?</a></li>                        
                    <li><a class="font05" href="">> Quiero comprar </a></li>
                    <li><a class="font05" href="">> Quiero vender </a></li>
                    <li><a class="font05" href="">> Pizarra de Productos </a></li>
                    <li><a class="font05" href="">> Productos de Estación </a></li>
                    <li><a class="font05" href="">> Infórmate </a></li>
                    <li><a class="font05" href="">> Los Campeones</a></li>
                </ul>
            </div>
            <div class="col-md-3">
                <ul class="">
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
    <!-- /.container -->

    <!-- jQuery -->
    <script src="${IndexFiles}/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="${IndexFiles}/bootstrap.min.js"></script>

    <!-- Script to Activate the Carousel -->
    <script>
    $('.carousel').carousel({
        interval: 5000 //changes the speed
    })
    </script>




</body></html>