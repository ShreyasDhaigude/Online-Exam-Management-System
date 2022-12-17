package projava;
import java.sql.*;
import java.util.*;
public class myproject {
				
			public void registration()throws Exception
			{
		       Scanner sc=new Scanner (System.in);
				
				 String sname,semail,sphone,spassword,sresult=" ";
				 double sscore=0;
				 
				
				
				System.out.println("Entre your name");
				sname=sc.nextLine();
				
				
				System.out.println("Entre your email");
				semail=sc.nextLine();
				
				
				System.out.println("Entre your  phone");
				sphone=sc.nextLine();
				
				System.out.println("Entre your  Password");
				spassword=sc.nextLine();
				
				
				
				
				Class.forName("com.mysql.cj.jdbc.Driver");

				
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","");
				
				String q="insert into stu(name,email,phone,password,result,score) values('"+sname+"','"+semail+"','"+sphone+"','"+spassword+"','"+sresult+"','"+sscore+"')";
				
				
				PreparedStatement psmt=conn.prepareStatement(q);
				
				
		        int row=psmt.executeUpdate();
		        
		        
		        if(row>0)
		        {
		        	
		        	
		        	System.out.println("/Your Data Is Successfully Saved/");
		        	
		        	
		        }
		        else {
		        	
		        	
		        	System.out.println("/Your Data Is not Successfully Saved !!!!!!!!!!!/");

		        }
		        
			}
			public void delete()throws Exception 
			{
				
				Scanner sc=new Scanner(System.in);
				
				
				int sid;
				
				 
				 
				
				System.out.println("Enter id You want to delete");
				sid=sc.nextInt();
				
				
		       
				Class.forName("com.mysql.cj.jdbc.Driver");
			
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","");
				
				
				String q="delete from stu where id='"+sid+"'";
			
				
				PreparedStatement psmt=conn.prepareStatement(q);
				
				
				int row=psmt.executeUpdate();
				
				
				if(row>0)
				{
					
					
					System.out.println("/Your Data Is Successfully Deleted / ");
					
					
					
				}
				else
				{
					
					System.out.println("*Sorry But Your Data is Not Exist * !!!!!");

					
				}
				System.out.println("\n***********************************************************************************************************************************************************************************\n");
				
				
				
				
				}
			
			
			
			
			public void display() throws  Exception 
			{
				
				Class.forName("com.mysql.cj.jdbc.Driver");
		      
				
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","");
				
				String q="Select * from stu";
				
				 
				
				PreparedStatement psmt=conn.prepareStatement(q);
			
		        
		        ResultSet rs=psmt.executeQuery();
		        
		        
		        while(rs.next())
		        {
		        	System.out.println("Your Id is "+rs.getInt("id"));
		        	
		        	System.out.println("Your Name is "+rs.getString("name"));
		        	
		        	System.out.println("Your Email is "+rs.getString("email"));
		        	
		        	System.out.println("Your Phone is "+rs.getInt("phone"));
		        	
		        	System.out.println("Your Result is "+rs.getString("result"));

		        	System.out.println("Your Score is "+rs.getDouble("score"));

		    
		        
		        	System.out.println("\n**********************************************************"
		        			+ "*********************************************************************"
		        			+ "*******************************************************************"
		        			+ "********************************************************************\n");
		 
		        	
		        }
		        
		        
		        int re = 0;
				if(re>0)
		        {
		        	System.out.println("Sorry Bro but Your Data Is  invalid !!!!!!!!!!!!!!!!!!!!! ");
		            

		        	System.out.println("\n**********************************************************"
		        			+ "*********************************************************************"
		        			+ "*******************************************************************"
		        			+ "********************************************************************\n");

		        	
		        	
		        }
		        

			}
			
			public void update() throws Exception 
			{
				Scanner sc=new Scanner (System.in);
				
				 
				   String semail,sname,spassword;
				   int sid,sphone;
				  
					
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					System.out.println("Enter Your ID");
					sid=sc.nextInt();
					
					
					{
						System.out.println("Enter your choice :\n1:Name\n2:Email\n3:Phone\n4:Password\n5:Exit");
						int ch=sc.nextInt();
						
						
						 if(ch==1)
						{
							
							System.out.println("Enter Your Name");
							sname=sc.next();
							
							
							 Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","");
							 
							 String q="update stu set name='"+sname+"' where id='"+sid+"'";
							

							 PreparedStatement psmt=conn.prepareStatement(q);
							 
							 int row=psmt.executeUpdate();
							 
								if(row>0)
								{
									
									System.out.print("/Your Data is successfully saved!/");
									
									System.out.println("\n***************************************************************************************************************************************************************************************************************\n");

								
									
									
								}
								
								else
								{
									
									System.out.print("!sorry But Your Data is not successfully saved!!!!");
									
									System.out.println("\n***************************************************************************************************************************************************************************************************************\n");

									
								}
								

							
							
						}
						else if(ch==2)
						{
							
							
							System.out.println("Enter Your Email");
							semail=sc.next();
							
			                   Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","");
							 
							 String q="update stu set email='"+semail+"' where id='"+sid+"'";
							

							 PreparedStatement psmt=conn.prepareStatement(q);
							 
							 int row=psmt.executeUpdate();
							 
								if(row>0)
								{
									
									System.out.print("/Your Data is successfully saved!/");
									
									System.out.println("\n***************************************************************************************************************************************************************************************************************\n");

								
									
									
								}
								
								else
								{
									
									System.out.print("!sorry But Your Data is not successfully saved!!!!");
									
									System.out.println("\n***************************************************************************************************************************************************************************************************************\n");

									
								}
								

							
						}
						
						else if(ch==3)
						{
							
							System.out.println("Enter Your Phone ");
							sphone=sc.nextInt();
							
							
							
			                Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","");
							 
							 String q="update stu set phone='"+sphone+"' where id='"+sid+"'";
							

							 PreparedStatement psmt=conn.prepareStatement(q);
							 
							 int row=psmt.executeUpdate();
							 
								if(row>0)
								{
									
									System.out.print("/Your Data is successfully saved!/");
									
									System.out.println("\n****************************************************************************************************************************************************************************\n");

								
									
									
								}
								
								else
								{
									
									System.out.print("!sorry But Your Data is not successfully saved!!!!");
									
									System.out.println("\n****************************************************************************************************************************************************************************\n");

									
								}
						}
								
								else if(ch==4)
								{
									System.out.println("Enter Your Password ");
									spassword=sc.next();
									
									
									
					                Connection conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","");
									 
									 String q="update stu set password='"+spassword+"' where id='"+sid+"'";
									

									 PreparedStatement psmt=conn1.prepareStatement(q);
									 
									 int row=psmt.executeUpdate();
									 
										if(row>0)
										{
											
											System.out.print("/Your Data is successfully saved!/");
											
											System.out.println("\n****************************************************************************************************************************************************************************\n");

										
											
											
										}
										
										else
										{
											
											System.out.print("!sorry But Your Data is not successfully saved!!!!");
											
											System.out.println("\n****************************************************************************************************************************************************************************\n");

											
										}
									
									
									
									
								}
								if(ch==5)
								{
									
									//break;
									
									
								}
								
								
						}
					
			
			}
			
			public void login() throws Exception
			{
				Scanner sc=new  Scanner (System.in);
				String spassword;
				int sid;
				
				
				
				
				System.out.println("Enter Your ID");
				sid=sc.nextInt();
				
				
				
				System.out.println("Enter Your Password");
				spassword=sc.next();
				
				
				 Class.forName("com.mysql.cj.jdbc.Driver");
				 
				 
				 Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","");
				 
				 String q="Select * from stu where id= '"+sid+"' and password='"+spassword+"'";
				 
				 PreparedStatement psmt=conn.prepareStatement(q);
				 
				 ResultSet rs=psmt.executeQuery();
				 
				 
				if(rs.next())
				{
					
					System.out.print("\nYou Can Give The Exam\n");

					myproject obj=new myproject();
					
					obj.test();
				}
				
				else
				{
					
					System.out.print("\nSorry Bro but Your Id Or Password Is invalid\n");
					
				}
				
			}
			
			
						
			public void  test() throws Exception
			{
				
				Scanner sc=new Scanner(System.in);
				int ch ,sid;
				double count=0 ,sscore;
				
				String sresult ="" ;
				
				
				  Class.forName("com.mysql.cj.jdbc.Driver");
					
					
					System.out.println(" \nQ1. Number of primitive data types in Java are? \n");
					System.out.println(" \n1:6\n2:7\n3:8\n4:9");
					
					System.out.println("Enter Your  Answer");
					ch=sc.nextInt();
					
					if(ch==3)
					{
						count++;
						System.out.println(" !Your Answer Is Right!");
						

					}
					
					else
					{
						
						System.out.println(" !WRONG******!  right answer is "+8);
						
					}
					
					System.out.println("\n*******************************************************************************************************************************************************************************************************************************************************************************************\n");
					
					System.out.println(" Q2.What is the size of float and double in java?");
					System.out.println(" \n1:32 and 64\n2:32 and 32\n3:64 and 64\n4:64 and 32");
					
					System.out.println("Enter Your  Answer");
					ch=sc.nextInt();
					
					if(ch==1)
					{
						count++;
						System.out.println(" !Your Answer Is Right!");
						

					}
					
					else
					{
						
						System.out.println(" !WRONG******!  right answer is "+"32 and 64");
						
					}
					System.out.println("\n*************************************************************************************************************************************************************************************************************************************************************************************\n");

					
					System.out.println(" Q3.Automatic type conversion is possible in which of the possible cases?");
					System.out.println(" \n1:Byte to Int\n2:Int to Long\n3:Long to Int\n4:Stort to Int");
					
					System.out.println("Enter Your  Answer");
					ch=sc.nextInt();
					
					if(ch==2)
					{
						count++;
						System.out.println(" !Your Answer Is Right!");
						

					}
					
					else
					{
						
						System.out.println(" !WRONG******!  right answer is "+"Int to Long");
						
					}
					
					System.out.println("\n*****************************************************************************************************************************************************************************************************************************************************************************\n");

					System.out.println(" Q4.When an array is passed to a method, what does the method receive?");
					System.out.println(" \n1:The references of the array\n2:A copy of the array\n3:Length fo the array\n4:Cpoy of first element");
					
					System.out.println("Enter Your  Answer");
					ch=sc.nextInt();
					
					if(ch==1)
					{
						count++;
						System.out.println(" !Your Answer Is Right!");
						

					}
					
					else
					{
						
						System.out.println(" !WRONG******!  right answer is "+"The references of the array");
						
					}
					System.out.println("\n***********************************************************************************************************************************************************************************************************************************************************************************************************\n");

					
					System.out.println(" Q5.Arrays in java are-");
					System.out.println(" \n1:Object references\n2:Objects\n3:Primitive data type\n4:None");
					
					System.out.println("Enter Your  Answer");
					ch=sc.nextInt();
					
					if(ch==2)
					{
						count++;
						System.out.println(" !Your Answer Is Right!");
						

					}
					
					else
					{
						
						System.out.println(" !WRONG******!  right answer is "+"Objects");
						
					}
					System.out.println("\n*****************************************************************************************************************************************************************************************************************************************************************************************************\n");

					
					System.out.println(" Q6.When is the object created with new keyword");
					System.out.println(" \n1:At run time\n2:At compile time\n3:Depends on the code\n4:None");
					
					System.out.println("Enter Your  Answer");
					ch=sc.nextInt();
					
					if(ch==1)
					{
						count++;
						System.out.println(" !Your Answer Is Right!");
						

					}
					
					else
					{
						
						System.out.println(" !WRONG******!  right answer is "+"At run time");
						
					}
					
					System.out.println("\n*************************************************************************************************************************************************************************************************************************************************************************************************\n");

					System.out.println(" Q7.Identify the corrected definition of a package.");
					System.out.println(" \n1:A package is a collection of editing tools \n2:A package is a collection of classes\n3:A package is a collection of classes and interfaces\n4:A package is a collection of interfaces");
					
					System.out.println("Enter Your  Answer");
					ch=sc.nextInt();
					
					if(ch==3)
					{
						count++;
						System.out.println(" !Your Answer Is Right!");
						

					}
					
					else
					{
						
						System.out.println(" !WRONG******!  right answer is "+"A package is a collection of classes and interfaces");
						
					}
					System.out.println("\n***********************************************************************************************************************************************************************************************************************************************************************************\n");

					
					System.out.println(" Q8.Identify the keyword among the following that makes a variable belong to a class,rather than being defined for each instance of the class.");
					System.out.println(" \n1:final\n2:Static\n3:Volatile\n4:Abstract");
					
					System.out.println("Enter Your  Answer");
					ch=sc.nextInt();
					
					if(ch==2)
					{
						count++;
						System.out.println(" !Your Answer Is Right!");
						

					}
					
					else
					{
						
						System.out.println(" !WRONG******!  right answer is "+ "Static");
						
					}
					System.out.println("\n*******************************************************************************************************************************************************************************************************************************************************************\n");

					
					System.out.println(" Q9. In which of the following is toString() method defined?");
					System.out.println(" \n1:java.lang.Object\n2:Java.lang String\n3:java.lang.util\n4:None");
					
					System.out.println("Enter Your  Answer");
					ch=sc.nextInt();
					
					if(ch==1)
					{
						count++;
						System.out.println(" !Your Answer Is Right!");
						

					}
					
					else
					{
						
						System.out.println(" !WRONG******!  right answer is "+"java.lang.Object");
						
					}
					System.out.println("\n***********************************************************************************************************************************************************************************************************************************************\n");

					
					System.out.println(" Q10. compareTo() returns");
					System.out.println(" \n1:True\n2:false\n3:An int value\n4:None");
					
					System.out.println("Enter Your  Answer");
					ch=sc.nextInt();
					
					if(ch==3)
					{
						count++;
						System.out.println(" !Your Answer Is Right!");
						

					}
					
					else
					{
						
						System.out.println(" !WRONG******!  right answer is + An int value");
						
					}
					System.out.println("\n***********************************************************************************************************************************************************************************************************************************************\n");
					
					

					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","");
					
					 System.out.println("Enter Your Id For Saved Your Exam");
						sid=sc.nextInt();
			
				      
					 
					 if(count>6)
					 {
						     System.out.println("\n***!Congratulations You Are Pass*!\n"+"Your Exam Score Is "+count+"\n****************************************** !THANK YOU FOR GIVING THE EXAM !*****************************************************************************************************************************************************\n"); 
						    // sscore=sc.nextDouble();
						     
						   sresult="Pass";
							
						   String q="update stu set result='"+sresult+"',score='"+count+"' where id='"+sid+"'";
							 
							 
							 PreparedStatement psmt=conn.prepareStatement(q);
							 
							 int row=psmt.executeUpdate();
							 
							 
							 if(row>0)
								{
									
									System.out.print(" \nYour Test Data Is Saved Successfully\n");
								
									
									
								}
								
								else
								{
									
									System.out.print("\nSorry Bro But  Your Test Data Is Not Saved \n \n****************************************** !THANK YOU FOR GIVING THE EXAM !*****************************************************************************************************************************************************\\n\"");
									
								}
					 }
									 
							 

						 
					 
					 if(count<6)
					 {
					
											
						     
						    // sscore=sc.nextDouble();
						     
						     
						     sresult="Fail";
						     
						     String q1="update stu set result='"+sresult+"',score='"+count+"' where id='"+sid+"'";
							 
							 
							 PreparedStatement psmt=conn.prepareStatement(q1);
							 
							 int row1=psmt.executeUpdate();
							 
							 
							 if(row1>0)
								{
									
								 System.out.println("\n !Sorry Bro But You Are Fail!!!!!!!!!!!!!!!!! \n"+"Your Exam Score Is "+count+"\n****************************************** !THANK YOU FOR GIVING THE EXAM !*****************************************************************************************************************************************************\n");
								
									
									
								}
								
								else
								{
									
									System.out.print("\nSorry Bro But  Your Test Data Is Not Saved \n \n****************************************** !THANK YOU FOR GIVING THE EXAM !*****************************************************************************************************************************************************\\n\"");
									
								}
								
		 
					 }
					 
					 
					 
					 
					 
					 
					
				
				
				
			}
			

			
			
			public static void main(String[] args)throws Exception
			{
				
				myproject obj=new myproject();
				
				
				
				Scanner sc=new Scanner(System.in);
				int ch=0;
				
				while(true)
				{
					System.out.println("Enter Your Choice :\n1:Registration\n2:Update\n3:Test\n4:Display\n5:Delete\n6:Exit");
					ch=sc.nextInt();
					
					if(ch==1)
					{
						obj.registration();
						
						
					}
					else if(ch==2)
					{
						obj.update();
						
						
						
					}
					else if(ch==3)
					{
						obj.login();
						
						
						
					}
					else if(ch==4)
					{
						
						obj.display();
						
						
					}
					else if(ch==5)
					{
						
						obj.delete();
						
						
					}
					else if(ch==6)
					{
						
						System.out.println("*************** !THANK YOU FOR COMING! *******************************************************************************************************************************************************************************************************************************************");
						break;
			         	
						
					}
					
					
					
				}
				
				
				
				
				
				
				
				
				
			
			
			}
		
				
			
			
			
			
				
			
				
				
				
				
				
				



		
		
		
		
		
		
		
		
		
		
	}


