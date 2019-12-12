package icefox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

public class Icefox {
	public static void main(String[] args) throws IOException {
		String[] codigo = new String[525];
		Arrays.fill(codigo, "");
		// CODIGOS 1XX - Informacion
		codigo[100] = "Continue";
		codigo[101] = "Switching Protocols";
		codigo[102] = "Processing";
		codigo[103] = "Early Hints";
		// CODIGOS 2XX - Correcto
		codigo[200] = "OK";
		codigo[201] = "Created";
		codigo[202] = "Accepted";
		codigo[203] = "Non-Authoritative Information";
		codigo[204] = "No Content";
		codigo[205] = "Reset Content";
		codigo[206] = "Partial Content";
		// CODIGOS 3XX - Redireccion
		codigo[300] = "Multiple Choices";
		codigo[301] = "Moved Permanently";
		codigo[302] = "Found";
		codigo[303] = "See Other";
		codigo[304] = "Not Modified";
		codigo[305] = "Use Proxy";
		codigo[306] = "Unused";
		codigo[307] = "Temporary Redirect";
		codigo[308] = "Permanent Redirect";
		// CODIGOS 4XX - Errores del cliente
		codigo[400] = "Bad Request";
		codigo[401] = "Unauthorized";
		codigo[402] = "Payment Required";
		codigo[403] = "Forbidden";
		codigo[404] = "Not Found";
		codigo[405] = "Method Not Allowed";
		codigo[406] = "Not Acceptable";
		codigo[407] = "Proxy Authentication Required";
		codigo[408] = "Request Timeout";
		codigo[409] = "Conflict";
		codigo[410] = "Gone";
		codigo[411] = "Length Required";
		codigo[412] = "Precondition Failed";
		codigo[413] = "Request Entity Too Large";
		codigo[414] = "Request-URI Too Long";
		codigo[415] = "Unsupported Media Type";
		codigo[416] = "Requested Range Not Satisfiable";
		codigo[417] = "Expectation Failed";
		codigo[418] = "I'm a teapot";
		codigo[421] = "Misdirected Request";
		codigo[422] = "Unprocessable Entity";
		codigo[423] = "Locked";
		codigo[425] = "Too Early";
		codigo[426] = "Upgrade Required";
		codigo[428] = "Precondition Required";
		codigo[429] = "Too Many Requests";
		codigo[431] = "Request Header Fields Too Large";
		codigo[451] = "Unavailable For Legal Reasons";
		// CODIGOS 5XX - Errores del servidor
		codigo[500] = "Internal Server Error";
		codigo[501] = "Not Implemented";
		codigo[502] = "Bad Gateway";
		codigo[503] = "Service Unavailable";
		codigo[504] = "Gateway Timeout";
		codigo[505] = "HTTP Version Not Supported";
		codigo[506] = "Variant Also Negotiates";
		codigo[507] = "Insufficient Storage";
		codigo[511] = "Network Authentication Required";
		codigo[520] = "Web server is returning an unknown error";
		codigo[522] = "Connection timed out";
		codigo[524] = "A timeout occurred";

		System.out.println(
				"WWWNNNWWNWWWWNWWWWWWWWWWNKkOXWWWNWWNWWWW\nWWNWWNNNWNWWX0kdoollloodxxodx0XXXWWWWWWW\nWWNWNkxXNKxc,..........,coooodxdxXWWWWWN\nWNWNOc:dd:''';cc;.....',ldoooooooxKNWNWW\nWWWXd:clllooodo,.......'cddoooooood0NWNN\nNNXxccllloooodl;,;;'....,ldoooooodod0NNN\nWXxccclllooodollool,.....,:ooooooddod0NW\nNOl:ccllloooddo:,'.........,:odddooddkXW\nNxccccclllllc::'.............:ooddooddkX\nXd:ccccllc:c,................;oloddddoo0\nNxcccccccccll:'....','.......;dolodooodX\nW0lcccccccllloollloddoc,.....cxoooodooON\nWXxccccccclllc:::::,''......cddooooookXW\nWWKoccccccccll:,.........,:lddoooooodKWN\nWWNKdccccccccclllc:::::clooooooooollkNWW\nWWNWXklcccccccccllllllllloooooollldONWNW\nWWNWNNKkocccccccccccccllllllllldx0XNWNWW\nWWNWNNWNXOxocc::ccccccccccc:coOXNWWWNNWN\nNNWWNWWNNWNX0Okddolllllooddk0XWWNWWNWWWW\nWNWWWWWWNNWNWWWNNXKKKKKXXNNWWWWWNNWWNWWW");

		System.out.println("  _____ _____ ______ ______ ______   __");
		System.out.println(" |_   _/ ____|  ____|  ____/ __ \\ \\ / /");
		System.out.println("   | || |    | |__  | |__ | |  | \\ V / ");
		System.out.println("   | || |    |  __| |  __|| |  | |> <  ");
		System.out.println("  _| || |____| |____| |   | |__| / . \\ ");
		System.out.println(" |_____\\_____|______|_|    \\____/_/ \\_\\ ©\n");

		System.out.println("Bienvenido a Icefox 1.0");

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca una URL (o salir): ");
		String dir = sc.nextLine();
		int status;

		while (!dir.equals("salir")) {
			if (dir.equals("icefox")) { // Modo debugging codigos HTTP
				for (int i = 200; i < codigo.length; i++) {
					if (!codigo[i].equals("")) {
						try {
							dir = "https://httpstat.us/" + i;
							System.out.println("Probando " + dir);
							URL url = new URL(dir);
							HttpURLConnection con = (HttpURLConnection) url.openConnection();
							con.setRequestMethod("GET");
							status = con.getResponseCode();
							System.out.println("El servidor a devuelto el codigo " + status + ": " + codigo[status]);
							BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
							String inputLine;
							StringBuffer contenido = new StringBuffer();
							while ((inputLine = in.readLine()) != null) {
								contenido.append(inputLine);
							}
							in.close();
							con.disconnect();
							System.out.println(contenido);
						} catch (Exception e) {
							System.out.println("Error: " + e);
						}
					}
				}
			} else { // Si se introduce una URL
				try {
					URL url = new URL(dir);
					HttpURLConnection con = (HttpURLConnection) url.openConnection();
					con.setRequestMethod("GET"); // Le hace un HTTP GET
					status = con.getResponseCode();
					System.out.println("El servidor a devuelto el codigo " + status + ": " + codigo[status]);

					if (status == 200) { // Si el servidor da el OK
						System.out.println("Descargando archivo html");

						// Empieza a descargar el html
						BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
						String inputLine;
						StringBuffer contenido = new StringBuffer();
						while ((inputLine = in.readLine()) != null) {
							contenido.append(inputLine);
						}
						in.close(); // Cierra el buffer
						con.disconnect(); // Cierra la conexión
						
						String res = contenido.toString().replace("><", ">\n<"); // Saltos de linea

						System.out.print("¿Cuanto quiere ver del html(0=todo)? ");
						try{
							int t = Integer.parseInt(sc.nextLine());
							if (t <= 0) {
								System.out.println(res);
							} else {
								System.out.println(res.substring(0, t));
							}
						} catch( NumberFormatException e ){
							System.out.println("Eso no es un numero");
						}
						
					}
				} catch (MalformedURLException e) { // Captura URLs mal escritas
					System.out.println("Revisa la URL");
				}
			}
			System.out.print("Introduzca una URL (o salir): ");
			dir = sc.nextLine();
		}
		sc.close();
	}
}
