package programs;

public class uniqueValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, k;
		String str = "kamal";
		String[] value = str.split("");
		for (i = 0; i < value.length; i++) {
			for (j = i + 1; j < value.length; j++) {
				if (value[i].equalsIgnoreCase(value[j])) {
					value[j] = "";
				}
				{

				}
			}
		}
		for (k = 0; k < value.length; k++) {
			System.out.println(value[k]);
		}

	}

}
