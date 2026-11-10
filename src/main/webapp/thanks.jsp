<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>Murach's Java Servlets and JSP</title>
    <link rel="stylesheet" href="style/main.css" type="text/css"/>
    <style>
        label {
            width: 15em;
        }
    </style>
</head>
<body>
    <section>
        <h1>Thanks for joining our email list</h1>
        <p>Here is the information that you entered:</p>
            <label>First Name: </label>
            <span>${user.firstName}</span><br>
            <label>Last Name:</label>
            <span>${user.lastName}</span><br>
            <label>Email:</label>
            <span>${user.email}</span><br>
            <label>Date of birth:</label>
            <span>${user.dateOfBirth}</span><br>
    </section>

    <section>
        <h1>Additional informations</h1>
            <label>You heard about us through:</label>
            <span>${heardAbout}</span><br>
            <label>Receive offers:</label>
            <span>${receiveOffers}</span><br>
            <label>Receive announcement emails:</label>
            <span>${receiveAnnouncements}</span><br>
            <label>We may contact you through:</label>
            <span>${contactType}</span><br>
    </section>

<p>To enter another email address, click on the Back button in your browser or the Return button shown below.</p>
    <form action="murach-survey" method="get">
        <input type="hidden" name="action" value="join">
        <input type="submit" value="Return">
    </form>
</body>
</html>