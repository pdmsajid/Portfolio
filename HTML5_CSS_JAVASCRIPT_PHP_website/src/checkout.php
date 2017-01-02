<?php
session_start();

include_once('top-part.php'); ?>

    <title>Home</title>

    <?php include_once('mid-part.php'); ?>
    <article>
        <div id="contactForm">
            <form action="https://titan.csit.rmit.edu.au/~e54061/wp/processing.php" method="post">
                <fieldset>
                    <legend> Checkout !!! </legend>
                    <label for="firstname">First Name :</label> <input id="firstname" type="text" name="firstname" placeholder="ex:Sajid" required pattern="^[a-zA-Z-'\.\s]+$" />
                    <!--pattern="[A-Z][a-z-' \.]*"-->

                    <label for="lastname">Last Name :</label> <input id="lastname" type="text" name="lastname" placeholder="ex:Pakirdeen" required pattern="^[a-zA-Z-'\.\s]+$" />
                    <!--pattern="[A-Z][a-z-' \.]*"-->
                    
                    <label for="address">Address :</label> <textarea id="address" rows="4" cols="50" name=eventlocation placeholder="melbourne"></textarea>
                    <!--pattern-->

                    <label for="email">Email :</label> <input id="email" type="email" name="email" placeholder="ex:emailname@email.com" required />

                    <label for="phone">Phone No :</label> <input id="phone" type="tel" name="phone" placeholder="ex:04123456789" required pattern="^\+?[\(\)\d\.\s]{10,20}$" />
                    
                    <label for="creditCard">Credit Card No :</label> <input id="creditCard" type="number" name="phone" placeholder="ex:xxxx-xxxx-xxxx-xxxx" required  />
                   <!-- pattern="^\+?[\(\)\d\.\s]{10,20}$" -->
                    <label for="cardExpire">Credit card Expaire Date :</label>
                    <br>
                    <label> Month :</label><select id="cardExpire" name="cardMonth">
                        <option>January</option>
                        <option>Feb</option>
                        <option>March</option>
                    </select>
                    Year : 
                    <select id="cardExpire" name="CardYear">
                        <option>2016</option>
                    </select>
                    <br>
                    <label>By submitting this form, you accept the Mollom privacy policy.</label>
                    <input type="Submit" value="Send" />
                </fieldset>
            </form>
        </div>
    </article>
    <?php include_once('end-part.php'); ?>
    <?php include_once("debug-lite.php"); ?> ?>