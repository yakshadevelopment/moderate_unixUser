package java9.mod.modapp2;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static boolean checkPrime(int no)
	{
		boolean flag=true;
		for(int i=2;i<(no+1)/2;i++)
		{
			if(no%i==0)
			{
				flag=false;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of users id to create:");
		int no=Integer.parseInt(scanner.nextLine());
		Set<UnixUser> userSet=new HashSet<UnixUser>();
		System.out.println("Enter all users details one line at a time");
		for(int i=0;i<no;i++)
		{
			String str=scanner.nextLine();
			String arr[]=str.split(",");
			UnixUser unixUser=new UnixUser(arr[0],arr[1],arr[2]);
			userSet.add(unixUser);
		}
		Stream<UnixUser> userStream1=userSet.stream();
		Stream<UnixUser> userStream2=userSet.stream();
		Stream<UnixUser> superStream=userStream1.filter(user->user.getUserType().equalsIgnoreCase("Super"));
		Stream<UnixUser> ordStream=userStream2.filter(user->user.getUserType().equalsIgnoreCase("Ordinary"));
		List<UnixUser> superList=superStream.collect(Collectors.toList());
		List<UnixUser> ordList=ordStream.collect(Collectors.toList());
		int start=1000;
		for(UnixUser user: superList)
		{
				start++;
			for(int i=start;;i++)
		    {
				if(checkPrime(i))
				{
					start=i;
					user.setUserId(""+i);
					break;
				}
			}// end of inner loop
		 }// end of outer loop
        start=1000;
        for(UnixUser user: ordList)
		{
				start++;
			for(int i=start;;i++)
		    {
				if(!checkPrime(i))
				{
					start=i;
					user.setUserId(""+i);
					break;
				}
			}// end of inner loop
		 }// end of outer loop
      
        System.out.println(String.format("%-10s %-15s %-20s %-15s","User Id","Employee Id","User Name","User Type"));
       superList.forEach(System.out::println);
       ordList.forEach(System.out::println);
        
        
      
	}

}
