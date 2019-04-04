import java.io.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;
public class OfficeParty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		int numberOfRadius = s.nextInt();
		for (int i=0;i<numberOfRadius;i++) {
			list.add(s.nextInt());
		}
		int numberOfGuests = s.nextInt();
		double slice = 0;
		if (numberOfRadius >= list.get(list.size()-1)) {
			slice = Math.PI * list.get(list.size()-1) * list.get(list.size()-1);
		} else {
			slice = (Math.PI * list.get(list.size()-1) * list.get(list.size()-1))/ numberOfGuests;
		}
		DecimalFormat decimalFormat = new DecimalFormat("#.####");
		decimalFormat.setRoundingMode(RoundingMode.FLOOR);
		System.out.println(decimalFormat.format(slice));
	}

}
