<?php
session_start();

include_once('top-part.php'); ?>

    <title>Shop</title>

    <?php include_once('mid-part.php'); ?>
    <div id="mainContent" class="clearfix">
        <!-- there must be background -->
        <img src="Images/mainPhoto3.png" id=mainPhoto2></img>
        <article>
            <section>

                <div id="buyNow">
                    <p id="buyNow">Get it NOW !!!</p>
                    <a href="#" onClick="showCart1('divID');"><img src="Images/pleaseLikeMeSeason1.png" /></a>
                    <a href="#" onClick="showCart2('divID2');"><img src="Images/pleaseLikeMeSeason2.png" /></a>
                    <a href="#" onClick="showCart3('divID3');"><img src="Images/pleaseLikeMeSeason3.png" /></a>
                </div>
            </section>
            <section>
                <div class="buyItNowContent1" id="divID">
                    <form action="https://titan.csit.rmit.edu.au/~e54061/wp/processing.php" method="post">
                        <label id='1' >Please Like Me Season 1 </label>
                        <br>DVD / Blueray
                <select name="media" class="select">DVD / Blueray 
                <option value="dvd">DVD</option>
                <option value="blueray">Blueray</option>
                </select>
                        <label>Quantity :</label><input type="number" class="QuantityTextBox" id="s1" name='plms[s1]' min="1" max="5" step="1"  oninput='price()'>Total :
                        <input type="text" class="TotalTextBox" name="price[s1]" id="pr1" readonly>  
                        
                        <input type="submit" name="submit" value="Purchase" />
                    </form>
                </div>
                <div class="buyItNowContent2" id="divID2">
                    <form action="https://titan.csit.rmit.edu.au/~e54061/wp/processing.php" method="post">
                        <label id='2' >Please Like Me Season 2</label>

                        <br>DVD / Blueray<select name="material" class="select">DVD / Blueray 
                <option value="dvd">DVD</option>
                <option value="blueray">Blueray</option>
                </select>
                        <label>Quantity :</label><input type="number" class="QuantityTextBox" id="s2" name='plms[s1]' min="1" max="5" step="1" value='' oninput='price()'>Total :
                         <input type="text" class="TotalTextBox" name="price[s3]" id = "pr2" readonly/>
                        <input type="submit" name="submit" value="Purchase" />
                    </form>
                </div>
                <div class="buyItNowContent3" id="divID3">
                    <form action="https://titan.csit.rmit.edu.au/~e54061/wp/processing.php" method="post">
                        <label id='3'>Please Like Me Season 3</label>
                        <br>DVD / Blueray<select name="material" class="select">DVD / Blueray 
                <option value="dvd">DVD</option>
                <option value="blueray">Blueray</option>
                </select>
                        <label>Quantity :</label><input type="number" class="QuantityTextBox" id="s3" name='plms[s1]' min="1" max="5" step="1" value='' oninput='price()'>Total :
                         <input type="text" class="TotalTextBox" name="price[3]" id = "pr3" readonly/>
                        <input type="submit" name="submit" value="Purchase" />
                    </form>
                    <p id="subTotal"> Sub Total :<input type="text" class="TotalTextBox" name="total" id ="total" readonly/><button> Purchase All</button></p>
                   
                </div>
            </section>
            <article/>
            <?php include_once('end-part.php'); ?>
            <?php include_once("debug-lite.php"); ?> ?>
            
            
