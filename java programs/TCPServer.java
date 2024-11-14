import java.io.*;
import java.net.*;
public class TCPServer{
public static void main(String args []){
try{
ServerSocket serverSocket=new ServerSocket(1234);
System.out.println("Server started...");
Socket socket=serverSocket.accept();
BufferedReader reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
PrintWriter writer=new PrintWriter(socket.getOutputStream(),true);
String request=reader.readLine();
System.out.println("Client request:"+request);
writer.println("Hello client");
socket.close();
serverSocket.close();
}
catch(IOException e){
e.printStackTrace();
}
}
}