<link rel='stylesheet' href='styles.css' type='text/css' />
<link rel='stylesheet' href='header.css' type='text/css' />
<link rel='stylesheet' href='footer.css' type='text/css' />
<link rel='stylesheet' href='menu.css' type='text/css' />
<link href="https://fonts.googleapis.com/css?family=Baloo+Tamma|Play" rel="stylesheet">
<script type="text/javascript">
    function showCart1(id) {
        var divElement = document.getElementById(id);
        if (divElement.style.display == 'none')
            divElement.style.display = 'block';
        else
            divElement.style.display = 'none';
    }

    function showCart2(id) {
        var divElement2 = document.getElementById(id);
        if (divElement2.style.display == 'none')
            divElement2.style.display = 'block';
        else
            divElement2.style.display = 'none';
    }

    function showCart3(id) {
        var divElement = document.getElementById(id);
        if (divElement.style.display == 'none')
            divElement.style.display = 'block';
        else
            divElement.style.display = 'none';
    }
   
   function getCartSubTotal(){
       var total = getSession1Order()+getSession2Order()+getSession3order();
       return total;
   }
  
   function price(){
      
       var s1=17.00;
       var s2=22.50;
       var s3=26.75;
       var qty1 = parseInt(document.getElementById('s1').value);
       var qty2 = parseInt(document.getElementById('s2').value);
       var qty3 = parseInt(document.getElementById('s3').value);
       
       console.log(qty1);
       
       var price1 = 17.00 * qty1 || 0;
       var price2 = 22.50 * qty2 || 0;
       var price3 = 26.75 * qty3 || 0;
       
       var p1 = price1.toFixed(2);
       var p2 = price2.toFixed(2);
       var p3 = price3.toFixed(2);
       
       var total = [price1,price2,price3];
       var t = total[0]+total[1]+total[2];
       
       
       
       document.getElementById('pr1').value = p1;
       document.getElementById('pr2').value = p2;
       document.getElementById('pr3').value = p3;
       
       document.getElementById('total').value = t;
       
   }
   
   
</script>
</head>

<body>

    <header>
        <div class="header">
            <img class="logo" src="Images/pleaseLikeMeLogo.png" />
            <p class="businessName">Please Like Me !!!</p>
            <img class="sponserLogo" src="Images/PVIOTLOGOTV.png" />
        </div>
    </header>
    <nav class="menu">
        <ul>
            <li><a href='index.php'> Home</a></li>
            <li><a href='shop.php'>Shop</a></li>
            <li><a href='contact.php'>Contact</a></li>
        </ul>
    </nav>
    <main>