import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.Statement;

	public class UpdateData {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				// TODO Auto-generated method stub
						try {
							Class.forName("com.mysql.cj.jdbc.Driver");
							Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdatabase", "root", "root");
							// Here employeetable is database name, root is the username and Mysql#803454 is the password
					 		Statement stmt = con.createStatement();
							DatabaseMetaData dm = con.getMetaData();
							System.out.println(dm);

							// SQL statement execution
							stmt.executeUpdate("update employee set EmpName='Prashanth',phone='9999' where EmpId =3;");
							stmt.executeUpdate("update employee set EmpName='vamsi',phone='6666' where EmpId =2;");
							System.out.println("Query has been executes Successfully");
							stmt.close();
							con.close();
						} catch (Exception e) { // Handling Exception in case of Exception
							System.out.println("Something went wrong " + e);

						}

					}

			}
