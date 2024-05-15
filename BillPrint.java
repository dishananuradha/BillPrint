import java.util.*;
class BillPrint {
	public static void main(String[] args) {
		System.out.println();
		System.out.println("=================================================================================");
		System.out.println("__          __  _                            _          _ __  __            _");
		System.out.println("\\ \\        / / | |                          | |        (_)  \\/  |          | |");
		System.out.println(" \\ \\  /\\  / /__| | ___ ___  _ __ ___   ___  | |_ ___    _| \\  / | __ _ _ __| |_");
		System.out.println("  \\ \\/  \\/ / _ \\ |/ __/ _ \\| \'_ ` _ \\ / _ \\ | __/ _ \\  | | |\\/| |/ _` | \'__| __|");
		System.out.println("   \\  /\\  /  __/ | (_| (_) | | | | | |  __/ | || (_) | | | |  | | (_| | |  | |_");
		System.out.println("    \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___|  \\__\\___/  |_|_|  |_|\\__,_|_|   \\__|");
		System.out.println();
		System.out.println("=================================================================================");

		Scanner input = new Scanner(System.in);

		System.out.print("\nEnter Customer phone Number\t- ");
		String customer_phone_num = input.nextLine();

		System.out.print("\nEnter Customer Name\t\t- ");
		String customer_name = input.nextLine();

		System.out.println("\n=================================================================================");

		System.out.print("\n\nBasmathi Qty(Kg)\t- ");
		int basmathi_qty = input.nextInt();

		System.out.print("\nDhal Qty(Kg)\t\t- ");
		int dhal_qty = input.nextInt();

		System.out.print("\nSugar Qty(Kg)\t\t- ");
		int sugar_qty = input.nextInt();

		System.out.print("\nHighland Qty(Kg)\t- ");
		int highland_qty = input.nextInt();

		System.out.print("\nYoghurt Qty(Kg)\t\t- ");
		int yoghurt_qty = input.nextInt();

		System.out.print("\nFlour Qty(Kg)\t\t- ");
		int flour_qty = input.nextInt();

		System.out.print("\nSoap Qty(Kg)\t\t- ");
		int soap_qty = input.nextInt();
		System.out.println("\n");
		
		double basmathi_price = 250.00;
		double dhal_price = 180.00;
		double sugar_price = 150.00;
		double highland_price = 1200.00;
		double yoghurt_price = 50.00;
		double flour_price = 120.00;
		double soap_price = 250.00;

		double basmathi_total = basmathi_qty*basmathi_price;
		double dhal_total = dhal_qty*dhal_price;
		double sugar_total = sugar_qty*sugar_price;
		double highland_total = highland_qty*highland_price;
		double yoghurt_total = yoghurt_qty*yoghurt_price;
		double flour_total = flour_qty*flour_price;
		double soap_total = soap_qty*soap_price;

		double total = basmathi_total + dhal_total + sugar_total + highland_total + yoghurt_total + flour_total + soap_total;
		double discount = total*10/100;
		double net_amount = total - discount;

		System.out.println("+---------------------------------------------------------------+" );
		System.out.println("|               _   __  __          _____ _______               |" );
		System.out.println("|              (_) |  \\/  |   /\\   |  __ \\__   __|              |" );
		System.out.println("|               _  | \\  / |  /  \\  | |__) | | |                 |" );
		System.out.println("|              | | | |\\/| | / /\\ \\ |  _  /  | |                 |" );
		System.out.println("|              | | | |  | |/ ____ \\| | \\ \\  | |                 |" );
		System.out.println("|              |_| |_|  |_|_/    \\_\\_|  \\_\\ |_|                 |" );
		System.out.println("|                   225,Galle Road,Panadura.                    |" );
		System.out.println("|                                                               |" );
		System.out.println("+---------------------------------------------------------------+" );
		System.out.printf("|\t\t\t%-38s|\n", "# Tel\t: "+customer_phone_num);
		System.out.printf("|\t\t\t%-39s|\n", "# Name\t: "+customer_name);
		System.out.println("+--------------------+----------+----------------+--------------+" );
		System.out.printf("|%-20s|    %-6s|   %-13s|     %-9s|\n", "", "Qty", "Unit Price", "Price");
		System.out.println("+--------------------+----------+----------------+--------------+" );
		System.out.printf("| %-19s|%7d   |%,14.2f  |%,12.2f  |\n", "# Basmathi", basmathi_qty, basmathi_price, basmathi_total);
		System.out.println("|                    |          |                |              |" );
		System.out.printf("| %-19s|%7d   |%,14.2f  |%,12.2f  |\n", "# Dhal", dhal_qty, dhal_price, dhal_total);
		System.out.println("|                    |          |                |              |" );
		System.out.printf("| %-19s|%7d   |%,14.2f  |%,12.2f  |\n", "# Sugar", sugar_qty, sugar_price, sugar_total);
		System.out.println("|                    |          |                |              |" );
		System.out.printf("| %-19s|%7d   |%,14.2f  |%,12.2f  |\n", "# Highland", highland_qty, highland_price, highland_total);
		System.out.println("|                    |          |                |              |" );
		System.out.printf("| %-19s|%7d   |%,14.2f  |%,12.2f  |\n", "# Yoghurt", yoghurt_qty, yoghurt_price, yoghurt_total);
		System.out.println("|                    |          |                |              |" );
		System.out.printf("| %-19s|%7d   |%,14.2f  |%,12.2f  |\n", "# Flour", flour_qty, flour_price, flour_total);
		System.out.println("|                    |          |                |              |" );
		System.out.printf("| %-19s|%7d   |%,14.2f  |%,12.2f  |\n", "# Soap", soap_qty, soap_price, soap_total);
		System.out.println("|                    |          |                |              |" );
		System.out.println("+--------------------+----------+----------------+--------------+" );
		System.out.printf("|%-31s|  %-14s|%,12.2f  |\n", "", "Total", total);
		System.out.println("|                               +----------------+--------------+" );
		System.out.printf("|%-31s|  %-14s|%,12.2f  |\n", "", "Discount(10%)", discount);
		System.out.println("|                               +----------------+--------------+" );
		System.out.printf("|%-31s|  %-14s|%,12.2f  |\n", "", "Net Amount", net_amount);
		System.out.println("+-------------------------------+----------------+--------------+" );
		
		System.out.print("\n\nEnter Customer given amount - ");
		double cash = input.nextDouble();

		int change = (int)(cash - net_amount);	
		
		System.out.println("\n\n+--------------------+--------------------+" );	
		System.out.printf("|   %-17s|   %,-17.2f|\n", "Net Amount", net_amount);
		System.out.println("+--------------------+--------------------+" );
		System.out.printf("|   %-17s|   %,-17.2f|\n", "Cash", cash);
		System.out.println("+--------------------+--------------------+" );
		System.out.printf("|   %-17s|   %,-17d|\n", "Change", change);
		System.out.println("+--------------------+--------------------+" );

		int five_thousand,two_thousand,one_thousand,five_hundred,one_hundred,fifty,twenty,ten,five,two,one;
		five_thousand = change/5000;
		change = change%5000;
		two_thousand = change/2000;
		change = change%2000;
		one_thousand = change/1000;
		change = change%1000;
		five_hundred = change/500;
		change = change%500;
		one_hundred = change/100;
		change = change%100;
		fifty = change/50;
		change = change%50;
		twenty = change/20;
		change = change%20;
		ten = change/10;
		change = change%10;
		five = change/5;
		change = change%5;
		two = change/2;
		change = change%2;
		one = change;

		int no_of_notes = five_thousand+two_thousand+one_thousand+five_hundred+one_hundred+fifty+twenty;
		int no_of_coins = ten+five+two+one;

		System.out.println("\n\n+--------------------+---------------+" );	
		System.out.printf("|     %-15s|     %-10s|\n", "Value", "No");
		System.out.println("+--------------------+---------------+" );	
		System.out.printf("|     %-15s|     %-10d|\n", "Rs.5000", five_thousand);
		System.out.println("|--------------------|---------------|" );	
		System.out.printf("|     %-15s|     %-10d|\n", "Rs.2000", two_thousand);
		System.out.println("|--------------------|---------------|" );
		System.out.printf("|     %-15s|     %-10d|\n", "Rs.1000", one_thousand);
		System.out.println("|--------------------|---------------|" );
		System.out.printf("|     %-15s|     %-10d|\n", "Rs.500", five_hundred);
		System.out.println("|--------------------|---------------|" );
		System.out.printf("|     %-15s|     %-10d|\n", "Rs.100", one_hundred);
		System.out.println("|--------------------|---------------|" );
		System.out.printf("|     %-15s|     %-10d|\n", "Rs.50", fifty);
		System.out.println("|--------------------|---------------|" );
		System.out.printf("|     %-15s|     %-10d|\n", "Rs.20", twenty);
		System.out.println("|--------------------|---------------|" );
		System.out.printf("|     %-15s|     %-10d|\n", "Rs.10", ten);
		System.out.println("|--------------------|---------------|" );
		System.out.printf("|     %-15s|     %-10d|\n", "Rs.5", five);
		System.out.println("|--------------------|---------------|" );
		System.out.printf("|     %-15s|     %-10d|\n", "Rs.2", two);
		System.out.println("|--------------------|---------------|" );
		System.out.printf("|     %-15s|     %-10d|\n", "Rs.1", one);
		System.out.println("+--------------------+---------------+" );
		System.out.printf("|   %-17s|     %-10d|\n", "No of Notes", no_of_notes);
		System.out.println("+--------------------+---------------+" );
		System.out.printf("|   %-17s|     %-10d|\n", "No of Coins", no_of_coins);
		System.out.println("+--------------------+---------------+" );

		System.out.println("\n\n----------------------------------------------" );
		System.out.println("\tTHANK YOU FOR SHOPPING WITH US" );
		System.out.println("----------------------------------------------" );
	}
}



