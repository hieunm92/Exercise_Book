public class Main {
    public static void main(String[] args) {
        FictionBook[] fictionBooks = new FictionBook[5];
        fictionBooks[0] = new FictionBook(01234,"Cuon theo chieu gio", 100,"Nam cao","tam ly",60);
        fictionBooks[1] = new FictionBook(01235,"Chang vang", 150,"Stephenie Meyer","Vien tuong",90);
        fictionBooks[2] = new FictionBook(01236,"harry potter", 299,"J. K. Rowling","Vien tuong",199);
        fictionBooks[3] = new FictionBook(01237,"Lao Hac", 100,"Nam cao","tam ly",60);
        fictionBooks[4] = new FictionBook(01233,"Doi thua", 100,"Nam cao","tam ly",60);

        ProgrammingBook[] programmingBooks = new  ProgrammingBook[5];
        programmingBooks[0]= new ProgrammingBook(32145,"Chi Pheo",90,"Ngo Tat To", "Vietnamese","abc");
        programmingBooks[1]= new ProgrammingBook(32146,"Toi hoc code",120,"Ngo Tat To", "java","abc");
        programmingBooks[2]= new ProgrammingBook(32147,"Tat den",60,"Ngo Tat To", "Vietnamese","abc");
        programmingBooks[3]= new ProgrammingBook(32148,"Code dao",80,"Ngo Tat To", "java","abc");
        programmingBooks[4]= new ProgrammingBook(32149,"Tat den",78,"Ngo Tat To", "Vietnamese","abc");

        int sum1 = 0;
        for (FictionBook f:
             fictionBooks) {
            sum1 += f.getPrice();
        }
        System.out.println(sum1);


        for (ProgrammingBook p:
             programmingBooks) {
            sum1 += p.getPrice();
        }
        System.out.println("Tong tien cua 10 cuon sach: " + sum1);

        int count = 0;
        for (ProgrammingBook b:
             programmingBooks) {
            if (b.getLanguage() == "java"){
                count++;
            }
        }
        System.out.println("Sach co ngon ngu JAVA: "+count);
        int total=0;
        for (FictionBook m:
             fictionBooks) {
            total += m.setDiscount(20);
        }

        System.out.println("tong tien khuyen mai sach fictionBooks: " +total);



    }
}
