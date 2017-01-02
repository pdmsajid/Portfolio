            
            <?php 
            session_start();
            if(isset($_POST)&&!empth($_POST)){
                echo $_POST['qty'];
                $_SESSION['cart']=$_POST['qty'];
            }