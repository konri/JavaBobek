package lab4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ROT11 tmp = new ROT11();
		Polibiusz polibusz = new Polibiusz();
		String crypt = tmp.crypt("Konrad");
		System.out.print(crypt + " ");
		
		//System.out.print(tmp.decrypt(crypt));
		
		Cryptographer cryptObj = null; 
		cryptObj.cryptfile("fileToCrypt.txt", "fileToDecrypt.txt", tmp);
		cryptObj.decryptfile("fileToDecrypt.txt", "fileToCrypt_2.txt", tmp);
		
		cryptObj.cryptfile("fileToCrypt.txt", "fileToDecrypt_polibusz.txt", polibusz);
	}

}
