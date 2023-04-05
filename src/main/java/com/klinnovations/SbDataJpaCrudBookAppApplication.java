package com.klinnovations;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.klinnovations.entity.Book;
import com.klinnovations.repo.BookRepository;

@SpringBootApplication
public class SbDataJpaCrudBookAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(SbDataJpaCrudBookAppApplication.class, args);

		BookRepository repo = ctxt.getBean(BookRepository.class);

	
		Book b1 = new Book();
		b1.setBookId(1001);
		b1.setBookName("SpringBoot");
		b1.setBookPrice(2000.00);

		Book b2 = new Book();
		b2.setBookId(1002);
		b2.setBookName("Java");
		b2.setBookPrice(1100.00);

		Book b3 = new Book();
		b3.setBookId(1003);
		b3.setBookName("AWS");
		b3.setBookPrice(3000.00);

		Book b4 = new Book();
		b4.setBookId(1004);
		b4.setBookName("Azure");
		b4.setBookPrice(2500.00);

		Book b5 = new Book();
		b5.setBookId(1005);
		b5.setBookName("Adv Java");
		b5.setBookPrice(3500.00);

		Book b6 = new Book();
		b6.setBookId(1006);
		b6.setBookName("Cloud");
		b6.setBookPrice(4000.00);

		Book b7 = new Book();
		b7.setBookId(1007);
		b7.setBookName("Mysql");
		b7.setBookPrice(5000.00);

		Book b8 = new Book();
		b8.setBookId(1008);
		b8.setBookName("Oracle");
		b8.setBookPrice(6000.00);

		Book b9 = new Book();
		b9.setBookId(1009);
		b9.setBookName("MongoDb");
		b9.setBookPrice(5500.00);

		Book b10 = new Book();
		b10.setBookId(1010);
		b10.setBookName("C");
		b10.setBookPrice(1500.00);

		Book b11 = new Book();
		b11.setBookId(1011);
		b11.setBookName("C++");
		b11.setBookPrice(3300.00);

		Book b12 = new Book();
		b12.setBookId(1012);
		b12.setBookName("Core Java");
		b12.setBookPrice(1900.00);

		Book b13 = new Book();
		b13.setBookId(1013);
		b13.setBookName("SpringCloud");
		b13.setBookPrice(4400.00);

		Book b14 = new Book();
		b14.setBookId(1014);
		b14.setBookName("Spring Data Jpa");
		b14.setBookPrice(1300.00);

		Book b15 = new Book();
		b15.setBookId(1015);
		b15.setBookName("Spring Core");
		b15.setBookPrice(2100.00);

		Book b16 = new Book();
		b16.setBookId(1016);
		b16.setBookName("RestFul ");
		b16.setBookPrice(2300.00);

		Book b17 = new Book();
		b17.setBookId(1017);
		b17.setBookName("Spring Security");
		b17.setBookPrice(3800.00);

		Book b18 = new Book();
		b18.setBookId(1018);
		b18.setBookName("Spring Batch");
		b18.setBookPrice(4100.00);

		Book b19 = new Book();
		b19.setBookId(1019);
		b19.setBookName("Spring Social");
		b19.setBookPrice(5700.00);

		Book b20 = new Book();
		b20.setBookId(1020);
		b20.setBookName("Hadoop");
		b20.setBookPrice(8000.00);

		Book b21 = new Book();
		b21.setBookId(1021);
		b21.setBookName("SAP");
		b21.setBookPrice(9000.00);

		Book b22 = new Book();
		b22.setBookId(1022);
		b22.setBookName("Service Now");
		b22.setBookPrice(10000.00);

		Book b23 = new Book();
		b23.setBookId(1023);
		b23.setBookName("Gcp");
		b23.setBookPrice(11000.00);

		Book b24 = new Book();
		b24.setBookId(1024);
		b24.setBookName("AI");
		b24.setBookPrice(12000.00);

		Book b25 = new Book();
		b25.setBookId(1025);
		b25.setBookName("Networking");
		b25.setBookPrice(13000.00);

		Book b26 = new Book();
		b26.setBookId(1026);
		b26.setBookName("Networking");
		b26.setBookPrice(13000.00);

		Book b27 = new Book();
		b27.setBookId(1027);
		b27.setBookName("MariaDB");
		b27.setBookPrice(14000.00);

		Book b28 = new Book();
		b28.setBookId(1028);
		b28.setBookName("Redis");
		b28.setBookPrice(15000.00);

		Book b29 = new Book();
		b29.setBookId(1029);
		b29.setBookName("IBM DB2");
		b29.setBookPrice(16000.00);

		Book b30 = new Book();
		b30.setBookId(1030);
		b30.setBookName("PostgreSql");
		b30.setBookPrice(20000.00);

		repo.saveAll(Arrays.asList(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21,
				b22, b23, b24, b25, b26, b27, b28, b29, b30));
		
		System.out.println("Record Inserted SuccessFully.....");

	}

}
