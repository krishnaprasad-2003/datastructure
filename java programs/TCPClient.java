import java.io.*;
import java.net.*;
public class TCPClient{
public static void main(String args []){
try{
Socket socket=new Socket("localhost",1234);
BufferedReader reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
PrintWriter writer=new PrintWriter(socket.getOutputStream(),true);
writer.println("Hello server");
String response=reader.readLine();
System.out.println("Server response:"+response);
socket.close();
}
catch(IOException e){
e.printStackTrace();
}
}
}