package com.crio.qcalc;

// import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		// SpringApplication.run(QcalcApplication.class, args);
		ScientificCalculator calc = new ScientificCalculator();

		calc.add(1d, 1d);

		System.out.println(calc.getResult());
	}

}
