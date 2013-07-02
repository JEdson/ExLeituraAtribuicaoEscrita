
public class DatasCronologicas020 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long Agora = System.currentTimeMillis();
		System.out.println(String.format("%1$td/%1$tm/%1$tY %1$tH:%1$tM:%1$tS", Agora));
		System.out.println(String.format("%1$tD ",Agora));
		System.out.println(String.format("%1$tT ",Agora));
		System.out.println(String.format("%1$tD %1$tT ",Agora));

	}

}
