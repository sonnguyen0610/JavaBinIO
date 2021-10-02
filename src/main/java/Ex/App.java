package Ex;

import java.io.*;

public class App {
    public static void main(String[] args) {
        //copy tap tin( doc tap tin nguon và dan tap tin dich)
//person, doc ghi Object
        //Ghi object
//        Ex.Person p = new Ex.Person("Ryan", 30);
//        try {
//            FileOutputStream fos = new FileOutputStream("person.bin");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(p);
//            oos.flush();
//            oos.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        //Doc object
        try {
            FileInputStream fis = new FileInputStream("person.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Person p = (Person) ois.readObject();
            System.out.println(p);
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        //end
        //Ghi ds hoa don vao file: Start
//        Ex.Order[] orders = new Ex.Order[]{
//                new Ex.Order(LocalDate.now(), "Hy", 500f),
//                new Ex.Order(LocalDate.now(), "Hy", 500f),
//                new Ex.Order(LocalDate.now(), "Hy", 500f),
//                new Ex.Order(LocalDate.now(), "Hy", 500f),
//                new Ex.Order(LocalDate.now(), "Hy", 500f)
//        };
//        try {
//            FileOutputStream fos = new FileOutputStream("order.bin");
//            DataOutputStream dos = new DataOutputStream(fos);//co the boc bufferOutputStream
//            for (Ex.Order ord : orders) {
//                dos.writeUTF(ord.getCustomer());
//                dos.writeUTF(ord.getDate().toString());
//                dos.writeDouble(ord.getTotal());
//            }
//            dos.flush();
//            dos.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        //end
        //Doc ds hoa don: Start
//        try {
//            FileInputStream fis = new FileInputStream("order.bin");
//            DataInputStream dis = new DataInputStream(fis);
//            while (dis.available()>0) {
//                String name = dis.readUTF();
//                String date = dis.readUTF();
//                double total = dis.readDouble();
//                LocalDate ld = LocalDate.parse(date);
//                Ex.Order ordOuput = new Ex.Order(ld, name, total);
//                System.out.println(ordOuput);
//            }
//            dis.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        //end
//Ghi vao file
//        Ex.Order ord = new Ex.Order(LocalDate.now(), "Hy", 500f);
//        try {
//            FileOutputStream fos = new FileOutputStream("order.bin");
//            DataOutputStream dos = new DataOutputStream(fos);//co the boc bufferOutputStream
//            dos.writeUTF(ord.getCustomer());
//            dos.writeUTF(ord.getDate().toString());
//            dos.writeDouble(ord.getTotal());
//
//            dos.flush();
//            dos.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        //Doc tu file
//        try {
//            FileInputStream fis = new FileInputStream("order.bin");
//            DataInputStream dis = new DataInputStream(fis);
//            String name = dis.readUTF();
//            String date = dis.readUTF();
//            double total = dis.readDouble();
//
//            LocalDate ld = LocalDate.parse(date);
//            Ex.Order ordOuput = new Ex.Order(ld, name, total);
//            System.out.println(ordOuput);
//dis.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        //Ghi start
//        try {
//            FileOutputStream fos=new FileOutputStream("data.bin",true);
//            BufferedOutputStream bos=new BufferedOutputStream(fos);
//            bos.write("Hello".getBytes());
//            bos.flush();
//            bos.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        //end
        //Doc start
//        try {
//            FileInputStream fis = new FileInputStream("data.bin");
//            BufferedInputStream bis=new BufferedInputStream(fis);//boc lại bang bufer
//            //read 1 byte
//            int ch;
//            ch = bis.read();
//            while (ch != -1) {
//                System.out.print((char) ch);
//                ch = bis.read();
//            }
//            bis.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
}
