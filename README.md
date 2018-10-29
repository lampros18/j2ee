#### Συνέχεια δοκιμών

Το θέμα που παρουσιάστηκε στην επικοινωνία της φόρμας με το spring λύθηκε βάζοντας ένα tag <filter> στο web.xml

Προσπαθώ να προσεγγίσω την διαδικάσία σύνδεσης με τη βάση

Αν θέλετε να δοκιμάσετε τον κώδικα θα πρέπει να ρυθμίσετε το database pool στον server


copy paste στο context.xml του apache

```
<!-- Ρυθμίσεις από https://tomcat.apache.org/tomcat-7.0-doc/jndi-datasource-examples-howto.html -->

	<Resource name="jdbc/spring" auth="Container"
		type="javax.sql.DataSource" maxActive="100" maxIdle="30"
		maxWait="10000" username="user" password="AlexLamNik"
		driverClassName="com.mysql.jdbc.Driver"
		url="jdbc:mysql://34.245.143.18:3306/katanemhmena" />
		
```

Ελπίζω να τρέχει

Ώρα για Τσερπέ!!!

