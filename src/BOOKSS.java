import java.util.ArrayList;
import java.util.List;
class BOOKSS 
{
String favoritebooks;
public void addfavoritebook(String bookname)
{
System.out.println("books are"+bookname);
int i,j;
for(i=0;i<100;i++) 
{
ArrayList <String> b = new ArrayList <String>();
b.add("GREAT");
System.out.println(bookname.equals(b));
 if(b ="false") 
 {
  favoritebooks.add(b);
 }
}

public void printfavoritebooks()
{
int size;
size=favoritebooks.size();
System.out.println("favoritebooks:"+ size);
System.out.println(favoritebooks);

}
public static void main(String[] args)
{
List <String> b =new ArrayList<>();
b.add("GREAT DAY");
b.add("WELCOME HOME");
b.add("AFTER DEATH");
System.out.println(b);
BOOKSS favoritebooks =new BOOKSS();
favoritebooks.addToList(b);
for(String str:b)
{
 System.out.println(str);
}
}
private void addToList(List<String>strList)
{
    List <String> favoritebooks =new ArrayList<>();
    favoritebooks.addAll(strList);
    favoritebooks.add(b);
    void addfavoritebooks(b);
    void printfavoritebooks();
} 
}
