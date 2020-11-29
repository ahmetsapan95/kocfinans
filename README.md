# kocfinans

Web Projesi Kurulumu

1-	Projeyi hazırlamak için Spring Tool Suit kullandım. https://spring.io/tools linkten indirmenizi tavsiye ederim. Projeyi import etiğinizde sağ tıklayarak “Start as Spring Project” seçmeniz sunucunun çalışır hale gelmesi için yeterli olacaktır. Projeyi STS kullanarak oluşturduğumdan içerisinde gömülü bir Tomcat bulunmaktadır. Bu nedenle fazladan sunucu için ayar yapmanıza gerek yoktur. 


2-	Database olarak h2 database kullandım. Herhangi bir database kurulumu yapmanıza gerek yoktur. Database Server’a giriş yapmak için sunucuyu çalıştırdıktan sonra http://localhost:8080/h2-console adresine giderek password kısmına “password” yazarak giriş yapabilirsiniz.


3-	Kullanılan end pointler:


•	Sunucuyu çalıştırdıktan sonra http://localhost:8080/home adresine yönlenerek kredi başvuru formunu doldurabilirsiniz.


•	http://localhost:8080/enterCreditScore adresine yönlenerek istediğiniz bir TC kimlik numarası ile istediğiniz bir kredi skoru değeri girebilirsiniz. Uygulama sunucusu kredi skoru bilgisini öğrenmek için TC kimlik bilgisini kullanrak rest isteği yolladığında kredi skor servisi sizin buraya girdiğiniz değere göre yanıt dönecektir.


•	http://localhost:8080/api  TC kimlik numarası ile kredi skorunu öğrenebileceğiniz servistir. Postman ile hazırlanan API şablonunu klasörün içerisinde bulabilirsiniz.


Uyarı : SMS gönderimi için kullanılan servis bakiyesi 13$’dır. Her SMS gönderimi yaklaşık 0.10$. Hesap bakiyesinde para kalmadığı durumunda testlerinize devam edebilmek için HomeController class’ından bu servisi etkisiz hale getirmelisiniz. 

Test Projesi Kurulumu

1-	Test projesini kurma için öncelikle Java projesini kullandığınız IDE’ye aktarınız.


2-	Testler Selenium kütüphanesi kullanılarak hazırlanmıştır. Test-->lib klasörü altındaki jar dosyalarını build path’e tıkladıktan sonra add external jar seçeniğini seçerek ekleyiniz 


3- Daha sonra import ettiğiniz Java projesinin içine paylaşmış olduğum chromedriver.exe 'yi ekleyiniz ve projeyi çalıştırınız.


Not: Bilgisayarınızda Google Chrome yüklü olmalıdır.


3-	Üretilen test senaryolarını aşağıda bulabilirsiniz.



Test Case 1:



A user is added to the system with credit score of 450 with National ID 1.


An application form is filled with same National ID.


Expected system response:


Application Result: REJECTED


Credit Limit: 0



Test Case 2:



A user is added to the system with credit score of 501 with National ID 2.


An application form is filled with same National ID.


Income is set as 4000 TL.


Expected system response:


Application Result: APPROVED


Credit Limit: 10.000 TL



Test Case 3:



A user is added to the system with credit score of 700 with National ID 3.


An application form is filled with same National ID.


Income is set as 10.000.


Expected behavior is not known. Since there is no rule defined for applicants with 500 < credit score < 1000 and income > 5000TL


System Response:


Application Result: APPROVED


Credit Limit: 10.000 TL


Test Case 4:

A user is added to the system with credit score of 1500 with National ID 4.


An application form is filled with same National ID.


Income is filled as 100000000000000.


Expected system response


Application Result: APPROVED


Credit Limit: 4 * Income



Test Case 5:



Add 2 credit scores for the same applicant to Credit Service.


Expected result:


System should provide limit according to last entered credit score info. 



 
Bonus Soru Cevabı: 



1-	Kredi skoru 500 ile 1000 arasında olup geliri 5000TL’nin üzerindeki kişiler için kredi limiti belirtilmemiştir.


2-	Kredi skoru 500 olan kişiler için kredi limiti ve onay durumu belirtilmemiştir.




İletişim - Ahmet SAPAN


05337123217



