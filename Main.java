import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        HashMap<String,List<Contacts>> Dictionary=new HashMap<>();
        HashMap<String,String>mapping=new HashMap<>();
        Contacts ab=new Contacts();
       // int num=0;
        int cnt=0;

           HashMap<String,Contacts> Address_Book=new HashMap<>();
           while (true) {
               System.out.println("enter 0 to create address book");
               System.out.println("enter 1 to create a contact");
               System.out.println("enter 2 to edit a contact");
               System.out.println("enter 3 to delete a contact");
               System.out.println("enter any other number  to exit ");
               int num = sc.nextInt();
               if(num==0)
               {
                   System.out.println("enter the name of address book");
                   String tt=sc.next();
                   AddressBook abc=new AddressBook(tt);
                   Dictionary.put(tt,new ArrayList<>());
               }
            else  if (num == 1)
               {
                   System.out.println("enter the name of address book to add contact");
                   String b=sc.next();
                   if(!Dictionary.containsKey(b))
                   {
                   System.out.println("create a address book of given name first :");
                   continue;

               }
                   Contacts ct=ab.create();
                   if(Dictionary.containsKey(b))
                   {
                       List<Contacts> l=Dictionary.get(b);
                       l.add(ct);
                       Dictionary.put(b,l);
                       mapping.put(ct.getFirstName(),b);
                   }

               } else if (num == 2)
               {
                   Contacts ct=ab.edit();
                   if(ct!=null) {
                       ab.map.put(ct.getFirstName(),ct);
                   }

               } else if (num == 3)
               {
                   String ct=ab.delete();
                   if(ct!=null)
                   {
                        List<Contacts> l=Dictionary.get(mapping.get((ct)));
                        for(int i=0;i<l.size();i++)
                        {
                            if(l.get(i).getFirstName().equals(ct))
                            {
                                l.remove(i);
                                Dictionary.put(mapping.get(ct),l);
                            }
                        }
                   }
               } else break;
           }



       }

    }
