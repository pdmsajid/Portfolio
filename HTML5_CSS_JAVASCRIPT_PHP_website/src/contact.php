<?php
session_start();

include_once('top-part.php'); ?>

    <title>Contact</title>

    <?php include_once('mid-part.php'); ?>

    <article>
        <img src="Images/mainPhoto4.png" id=mainPhoto3></img>
        <div id="contactForm">
                <form action="https://titan.csit.rmit.edu.au/~e54061/wp/processing.php" method="post">
                    <fieldset>
                        <legend> Contact ME !!! </legend>
                        <label for="firstname">First Name :</label> <input id="firstname" type="text" name="firstname" placeholder="ex:Sajid" required pattern="^[a-zA-Z-'\.\s]+$" />
                        <!--pattern="[A-Z][a-z-' \.]*"-->

                        <label for="lastname">Last Name :</label> <input id="lastname" type="text" name="lastname" placeholder="ex:Pakirdeen" required pattern="^[a-zA-Z-'\.\s]+$" />
                        <!--pattern="[A-Z][a-z-' \.]*"-->

                        <label for="email">Email :</label> <input id="email" type="email" name="email" placeholder="ex:emailname@email.com" required />

                        <label for="phone">Phone No :</label> <input id="phone" type="tel" name="phone" placeholder="ex:04123456789" required pattern="^\+?[\(\)\d\.\s]{10,20}$" />
                        <!--pattern="\+?[\d]{2} [\d]?[ ]?[\d]{4} [\d]{4}"-->

                        <label for="eventdate">Event date :</label> <input id="eventdate" type="date" name="eventdate" required />

                        <label for="eventtime">Event time :</label> <input id="eventtime" type="time" name="eventtime" />

                        <label for="eventflexibility">Event Flexibility :</label> <input id="eventflexibility" type="range" name="eventflexibility" min="1" max="3" />
                        <!---three values you need to fill -->

                        <label for="eventlocation">Event Location :</label> <textarea id="eventlocation" rows="4" cols="50" name=eventlocation placeholder="melbourne"></textarea>
                        <!--pattern-->

                        <label for="eventdescription">Event Description :</label><textarea id="eventdescription" rows="4" cols="50" name="eventdescription"></textarea>
                        <!--pattern-->

                        <label for="performance">Performance Required :</label>
                        <select id="performance" name="performance">
            <option value="mc">MC</option>
            <option value="comedyspot">Comedy Spot</option>
            <option value="fullshow">Full Show</option>
            <option value="other">Other</option>
          </select>

                        <label>By submitting this form, you accept the Mollom privacy policy.</label>
                        <input type="Submit" value="Send" />
                    </fieldset>
                </form>
        </div>
    </article>

    <?php include_once('end-part.php'); ?>
    <?php include_once("debug-lite.php"); ?> ?>