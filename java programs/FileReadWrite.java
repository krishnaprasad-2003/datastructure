import java.io.*;
public class FileReadWrite{
public static void main(String[] args){
try{
BufferedWriter writer=new BufferedWriter(new FileWriter("test.txt"));
writer.write("Hello,World");
writer.close();
BufferedReader reader=new BufferedReader(new FileReader("test.txt"));
String line;
System.out.println("Content of the file:");
while((line=reader.readLine())!=null){
System.out.println(line);
}
reader.close();
}
catch(IOException e){
e.printStackTrace();
}
}
}