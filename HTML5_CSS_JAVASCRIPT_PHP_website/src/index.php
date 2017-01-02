<?php
session_start();

include_once('top-part.php'); ?>

 <title>Home</title>

<?php include_once('mid-part.php'); ?>

    <div id="mainContent" class="clearfix">
        <!-- there must be background -->
        <img src="Images/mainPhoto1.png" id=mainPhoto></img>
        <article>
            <section>
                <div id="aboutMe">
                    <h3>Hi I am Josh</h3>

                    <blockquote>
                        After making his mark as an award-winning and hugely-successful stand-up comedian and television panellist, Josh Thomas turned his hand to writing, acting and co-executive producing his own television show for ABC TV, inspired by his life and his comedy,
                        called Please Like Me. When Participant Media in the US chose to launch its brand new Pivot television network with Please Like Me and to co-commission a second season with ABC TV, Josh was on his way to being an international
                        success story.
                    </blockquote>
                </div>
            </section>
            <article/>
            <div id="preOrder">
                <!-- offer for session 4 -->
                <h4> Pre order NOW</h4>
                <img src="Images/pleaseLikeMeSeason4.png"></img>
                <br/>
                <input type="Submit" value="Pre Order NOW !!!" />
            </div>
    </div>

<?php include_once('end-part.php'); ?>
<?php include_once("debug-lite.php"); ?>

?>