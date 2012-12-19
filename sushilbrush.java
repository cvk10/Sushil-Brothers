import java.awt.event.*;
import java.sql.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class sushilbrush implements ActionListener
{
  JFrame frame=new JFrame();
    JTabbedPane jtp = new JTabbedPane();
    JTabbedPane jtp2 = new JTabbedPane();
    JTabbedPane jtp3 = new JTabbedPane();
    JTabbedPane jtp4 = new JTabbedPane();

    int currentpurchase;
    int flag2;
    int first;
    int firstpurchase;
    int firstsale;
    
    int numbrushraw;
    int numpaintraw;
    
    float amountpur;
    float amountsale;
    JScrollPane scrollPane;
    int flagadd;
    JPanel jp1 = new JPanel();
    JPanel jp2 = new JPanel();
    JPanel jp3= new JPanel();

    
    JPanel jp5= new JPanel();
    JPanel jp6= new JPanel();
    JPanel jp7= new JPanel();
    JPanel jp8= new JPanel();
    JPanel jp9= new JPanel();
    
    JPanel jp10= new JPanel();
    JPanel jp11= new JPanel();
    JPanel jp12= new JPanel();
    JPanel jp13= new JPanel();
    JPanel jp14= new JPanel();
    
    
    JLabel credits=new JLabel("Developed by C Vaibhav Kumar.");
    JLabel paint = new JLabel("Paint: ");
    JLabel brush = new JLabel("Brush: ");
    JLabel wrongpass= new JLabel("Wrong Password. Please try again.");
    
    JLabel label1 = new JLabel("Add a new item:");
    JLabel type= new JLabel("Type:");
    JLabel orderdetails = new JLabel("Enter order details");
    JLabel labelfirmname = new JLabel("Name of Firm: ");
    JLabel quantity = new JLabel("Quantity: ");
    JLabel pass=new JLabel("Password:");
    JLabel price = new JLabel("Price: ");
    JLabel select=new JLabel("Select item type:");
    JLabel date = new JLabel("Date: ");
    
    JTable table;
    JLabel label3 = new JLabel("Add a new item:");
    
    JLabel label2 = new JLabel("Add a new item:");
    JLabel type2= new JLabel("Type:");
    JLabel orderdetails2 = new JLabel("Enter order details");
    JLabel labelfirmname2 = new JLabel("Name of Firm: ");
    JLabel quantity2 = new JLabel("Quantity: ");
    JLabel price2 = new JLabel("Price: ");
    JLabel select2=new JLabel("Select item type:");
    JLabel date2 = new JLabel("Date: ");
    JLabel date5 = new JLabel("Date: ");
    JLabel date6 = new JLabel("Date: ");
    

    JLabel quantity3 = new JLabel("Quantity: ");
    JLabel select3=new JLabel("Select item type:");
    JLabel date3 = new JLabel("Date: ");
    JLabel id2= new JLabel("ID: ");
    JLabel parentname2= new JLabel("Name: ");
    JLabel addmfg2= new JLabel("Name: ");
    JLabel id22= new JLabel("ID: ");
    
    JTextField firmname = new JTextField(20);
    JTextField quant = new JTextField(5);
    
    JTextField pri = new JTextField(5);
    JTextField dat = new JTextField(10);
    JTextField quant3 = new JTextField(5);
    JTextField quant4 = new JTextField(5);
    
    JTextField firmname2 = new JTextField(20);
    JTextField quant2 = new JTextField(5);
    JTextField pri2 = new JTextField(5);
    JTextField dat2 = new JTextField(10);
    JTextField dat3 = new JTextField(10);
    JTextField dat4 = new JTextField(10);
    JTextField dat5 = new JTextField(10);
    JTextField dat6 = new JTextField(10);
    
    JTextField id = new JTextField(5);
    JTextField parentname = new JTextField(15);
    JTextField mfgname = new JTextField(15);
    JTextField childname = new JTextField(15);
    

    JTextField ida = new JTextField(5);
    
    JButton showbyid = new JButton("Show By ID");
    JButton showbyid2 = new JButton("Show By ID");
    
    JButton go = new JButton("Go");
    JButton addfirm = new JButton("Add");
    JButton passwordsubmit = new JButton("Submit");
    JButton completesale = new JButton("Complete Sale");
    JButton showdetails = new JButton("Show Details");
    JButton showdetails2 = new JButton("Show Details");
    JButton showdetails3 = new JButton("Show Firms");
    
    JButton go2 = new JButton("Go");
    JButton addfirm2 = new JButton("Add");
    JButton completepurchase = new JButton("Complete Purchase");
    JButton completeproduction = new JButton("Complete Production");
    JButton completeproduction2 = new JButton("Complete Production");
    JButton show = new JButton("Show");
    JButton addparent = new JButton("Add Parent");
    JButton addchild = new JButton("Add Child");
    
    JButton addmfg = new JButton("Add Mfg. Item");
    JButton show2 = new JButton("Show");
    
    JComboBox selectcombo = new JComboBox();
    JComboBox nameoffirm = new JComboBox();
    JComboBox brushcombo = new JComboBox();
    JComboBox paintcombo = new JComboBox();
    JComboBox brushcombo2 = new JComboBox();
    JComboBox paintcombo2 = new JComboBox();
    JComboBox selectcombo3 = new JComboBox();
    JComboBox selectcombo5 = new JComboBox();
    JComboBox selectcombo6 = new JComboBox();
    JComboBox selectcombo7 = new JComboBox();
    JComboBox selectcombo8 = new JComboBox();
    JComboBox selectcombo9 = new JComboBox();
    JComboBox selectcombo11 = new JComboBox();
    JComboBox selectcombo10 = new JComboBox();
    JComboBox selectcombo12 = new JComboBox();
    JComboBox selectcombo13 = new JComboBox();
    JComboBox selectcombo14 = new JComboBox();

    JComboBox selectcombo2 = new JComboBox();
    JComboBox selectcombo4 = new JComboBox();
    
    JComboBox nameoffirm2 = new JComboBox();
    JComboBox nameoffirm3 = new JComboBox();

    JComboBox nameoffirm4 = new JComboBox();
    
    JComboBox rawmaterial = new JComboBox();
    JComboBox rawmaterial3 = new JComboBox();
    JComboBox rawmaterial4 = new JComboBox();
    
    JComboBox rawmaterialtype[];
     
    JComboBox brushrawmaterial = new JComboBox();
    JComboBox brushrawmaterial3 = new JComboBox();
    JComboBox brushrawmaterial4 = new JComboBox();
    
    JComboBox[] brushmaterialtype;
  

    JComboBox rawmaterial2 = new JComboBox();
    JComboBox rawmaterialtype2[];
    JComboBox rawmaterialtype3[];
    JComboBox brushrawmaterial2 = new JComboBox();
   
    JComboBox[] brushmaterialtype2;
    JComboBox[] brushmaterialtype3;
   
	TextArea cart2= new TextArea(20,50);
    
    JPasswordField password=new JPasswordField(10);
    Connection conn;
    
    public sushilbrush()
    {	
    	try {
        conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/sushilbrush","root","");
    	}
    	catch(Exception e)
    	{
    	}
    	first=0;
    	checknumraw();
    	
        passwordsubmit.addActionListener(this);
        rawmaterial.addActionListener(this);
        frame.add(pass);
        frame.add(password);
        frame.add(passwordsubmit);
        frame.add(credits);
        frame.setLayout(new FlowLayout());
        frame.setSize(700, 700);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);

        selectcombo2.addItem("--Select--");
        
        selectcombo2.addItem("Paint");
        selectcombo2.addItem("Brush");
        selectcombo3.addItem("--Select--");
        selectcombo3.addItem("Paint");
        selectcombo3.addItem("Brush");
        selectcombo4.addItem("--Select--");
        selectcombo4.addItem("Paint");
        selectcombo4.addItem("Brush");
        selectcombo5.addItem("--Select--");
        selectcombo5.addItem("Paint");
        selectcombo5.addItem("Brush");
        selectcombo6.addItem("--Select--");
        selectcombo6.addItem("Paint");
        selectcombo6.addItem("Brush");
        selectcombo7.addItem("--Select--");
        selectcombo7.addItem("Purchase");
        selectcombo7.addItem("Sale");
        selectcombo8.addItem("--Select--");
        selectcombo8.addItem("Paint");
        selectcombo8.addItem("Brush");
        selectcombo9.addItem("--Select--");
        selectcombo9.addItem("Paint");
        selectcombo9.addItem("Brush");
        selectcombo11.addItem("--Select--");
        selectcombo11.addItem("Paint");
        selectcombo11.addItem("Brush");
        selectcombo10.addItem("--Select--");
        selectcombo10.addItem("Purchase");
        selectcombo10.addItem("Sale");
        selectcombo12.addItem("--Select--");
        selectcombo12.addItem("Paint");
        selectcombo12.addItem("Brush");

        selectcombo13.addItem("--Select--");
        
        selectcombo13.addItem("Paint");
        selectcombo13.addItem("Brush");
        
        selectcombo14.addItem("--Select--");
        selectcombo14.addItem("Paint");
        selectcombo14.addItem("Brush");
        
    
          
        refreshbrush();
        refreshpaint();
        
    }
    
    public static void main(String args[]) throws Exception
    {
    	Class.forName("com.mysql.jdbc.Driver");
    	sushilbrush s=new sushilbrush();
    	s.showtabs();
    }
    
    public void actionPerformed(ActionEvent e) 
    {
    	if(e.getSource()==passwordsubmit)
    	{
    		  char[] s=password.getPassword();
              if (isPasswordCorrect(s)) 
                  {
              		frame.setVisible(false);
              		frame.remove(credits);
                      frame.remove(pass);
                      frame.remove(password);
                      frame.remove(passwordsubmit);
                      frame.setLayout(new GridLayout());
                      createtabs();    
                      showtabs();
                      frame.setVisible(true);
                  }
              
              else
                  {
                  frame.setVisible(false);
                  frame.add(wrongpass);
                  frame.setVisible(true);
                  }
    	}
    	
    	if(e.getSource()==addfirm)
    	{
    		
    		Object obj=selectcombo10.getSelectedItem();
    		String typ=obj.toString();
    		String tablename=null;
    		if(typ.equals("Purchase"))
    		{
    			Object obj2=selectcombo12.getSelectedItem();
        		String typ2=obj2.toString();
        		if(typ2.equals("Paint"))
        		{
        			tablename="firmspurchasepaint";
        		}
        		else if(typ2.equals("Brush"))
        		{
        			tablename="firmspurchasebrush";
        		}
    		}
    		else if(typ.equals("Sale"))
    		{
    		tablename="firmssale";
    		}	
    		
    	try
    	{   
    	Statement st1 = conn.createStatement();
    	String s1=firmname.getText();
    	st1.executeUpdate("insert into ".concat(tablename).concat("(firmname) values('"+s1+"')"));
    	conn.commit(); 
    	}
    	catch(Exception e1)
    	{	
    	}
    	refreshaddfirm();
  	refreshaddfirm2("paint");
  	refreshaddfirm2("brush");
  	refreshaddfirm3();

	JOptionPane.showMessageDialog(jp13,"Firm Successfully Added");
	firmname.setText(null);
	
	jp13.revalidate();
	jp13.repaint();
  	   }
    	
    	
    	if(e.getSource()==selectcombo)
    	{
    		Object type=selectcombo.getSelectedItem();
    		String type2=type.toString();
    		
    		if(type2.equals("Paint"))
    		{
    		refreshmfgitems("Paint");
    		brushcombo.setVisible(false);
    		jp1.add(paintcombo);
    		paintcombo.setVisible(true);	
    		}
    		else 
    		{
    		refreshmfgitems("Brush");
    		paintcombo.setVisible(false);
    		jp1.add(brushcombo);
    		brushcombo.setVisible(true);    			
    		}
    		jp1.revalidate();
    		jp1.repaint();
    	}
    	
    	if(e.getSource()==selectcombo13)
    	{
    		Object type=selectcombo13.getSelectedItem();
    		String type2=type.toString();
    		
    		if(type2.equals("Paint"))
    		{
    			refreshaddfirm2("paint");
    		}
    		else 
    		{
    			refreshaddfirm2("brush");    			
    		}
    		jp9.remove(date6);
    		jp9.remove(dat6);
    		jp9.remove(show2);
    		jp9.remove(id22);
    		jp9.remove(ida);
    		jp9.remove(showbyid2);
    		
    		nameoffirm4.setVisible(true);
    		jp9.add(nameoffirm4);
    		jp9.add(date6);
    		jp9.add(dat6);
    		jp9.add(show2);
    		jp9.add(id22);
    		jp9.add(ida);
    		jp9.add(showbyid2);
    		
    		
    		jp9.revalidate();
    		jp9.repaint();
    	}
    	
    	
    	if(e.getSource()==selectcombo3)
    	{
    		Object type=selectcombo3.getSelectedItem();
    		String type2=type.toString();
    		
    		if(type2.equals("Paint"))
    		{
    		refreshmfgitems2("Paint");
    		brushcombo2.setVisible(false);
    		jp2.add(paintcombo2);
    		paintcombo2.setVisible(true);	
    		}
    		else 
    		{
    		refreshmfgitems2("Brush");
    		paintcombo2.setVisible(false);
    		jp2.add(brushcombo2);
    		brushcombo2.setVisible(true);    			
    		}
    		jp2.revalidate();
    		jp2.repaint();
    	}

    	if(e.getSource()==selectcombo2)
    	{
    		Object type=selectcombo2.getSelectedItem();
    		String type2=type.toString();
    		
    		if(type2.equals("Paint"))
    				{
    				for(int i=0;i<=numbrushraw-1;i++)
    				{
    					brushmaterialtype[i].setVisible(false);
    				}
    				jp3.add(rawmaterial);
    				rawmaterial.setVisible(true);
    				brushrawmaterial.setVisible(false);
    				nameoffirm2.removeAllItems();
    				nameoffirm2.setVisible(false);
    				refreshaddfirm2("paint");
    				jp3.add(nameoffirm2);
    				nameoffirm2.setVisible(true);		
    				selectcombo2.setVisible(false);
    				}
    		else 
    		{
    			for(int i=0;i<=numpaintraw-1;i++)
				{
					rawmaterialtype[i].setVisible(false);
				}
    			jp3.add(brushrawmaterial);
    			brushrawmaterial.setVisible(true);
    			nameoffirm2.setVisible(false);
    			nameoffirm2.removeAllItems();
    			refreshaddfirm2("brush");
    			rawmaterial.setVisible(false);
    			jp3.add(nameoffirm2);
				nameoffirm2.setVisible(true);
				selectcombo2.setVisible(false);
    		}	
    		jp3.revalidate();
    		jp3.repaint();
    	}
    	
    	if(e.getSource()==selectcombo14)
    	{
    		Object type=selectcombo14.getSelectedItem();
    		String type2=type.toString();
    		jp11.remove(label2);
    		jp11.remove(childname);
    		jp11.remove(addchild);
    		if(type2.equals("Paint"))
    				{
    				jp11.add(rawmaterial4);
    				rawmaterial4.setVisible(true);
    				brushrawmaterial4.setVisible(false);
    				}
    		else if(type2.equals("Brush"))
    		{
    			jp11.add(brushrawmaterial4);
    			brushrawmaterial4.setVisible(true);
    			rawmaterial4.setVisible(false);
    			
    		}	
    		else
    		{
    			brushrawmaterial4.setVisible(false);
    			rawmaterial4.setVisible(false);
    			
    		}
    		jp11.add(label2);
    		jp11.add(childname);
    		jp11.add(addchild);
    		jp11.revalidate();
    		jp11.repaint();
    	}
    	
    	
    	if(e.getSource()==selectcombo5)
    	{ 	refreshtable();
    		Object type=selectcombo5.getSelectedItem();
    		String type2=type.toString();
    		
    		if(type2.equals("Paint"))
    				{
    				jp5.remove(showdetails);
    				jp5.add(rawmaterial3);
    				rawmaterial3.setVisible(true);
    				jp5.remove(brushrawmaterial3);
    				brushrawmaterial3.setVisible(false);
    				}
    		else if(type2.equals("Brush"))
    		{
    			jp5.remove(showdetails);
    			jp5.add(brushrawmaterial3);
    			brushrawmaterial3.setVisible(true);
    			jp5.remove(rawmaterial3);
    			rawmaterial3.setVisible(false);
    			}	
    		else if(type2.equals("--Select--"))
    		{
    			jp5.remove(showdetails);
    			jp5.remove(rawmaterial3);
    			jp5.remove(brushrawmaterial3);
    		}
    		jp5.add(showdetails);
    		jp5.revalidate();
    		jp5.repaint();
    	}
    	
    	if(e.getSource()==selectcombo7)
    	{ 	refreshtable3();
    		Object type=selectcombo7.getSelectedItem();
    		String type2=type.toString();
    		
    		if(type2.equals("Purchase"))
    				{
    				jp7.remove(showdetails3);
    				jp7.add(selectcombo8);
    				selectcombo8.setVisible(true);
    				
    				}
    		else 
    		{	
    			jp7.remove(showdetails3);
    			jp7.remove(selectcombo8);
    			selectcombo8.setVisible(false);
    			}	
    		jp7.add(showdetails3);
    		jp7.revalidate();
    		jp7.repaint();
    	}
    	
    	if(e.getSource()==selectcombo10)
    	{ 
    		Object type=selectcombo10.getSelectedItem();
    		String type2=type.toString();
    		
    		if(type2.equals("Purchase"))
    				{
    			jp13.remove(labelfirmname2);
    			jp13.remove(firmname);
    			jp13.remove(addfirm);
    				jp13.add(selectcombo12);
    				jp13.add(labelfirmname2);
        			jp13.add(firmname);
        			jp13.add(addfirm);
        				selectcombo12.setVisible(true);
    				
    				}
    		else 
    		{
    			jp13.remove(selectcombo12);
    			selectcombo12.setVisible(false);
    			}	
    		jp13.revalidate();
    		jp13.repaint();
    	}
    	

    	if(e.getSource()== showdetails )
    	{
    		refreshtable();
    		int type;
    		Object obj=selectcombo5.getSelectedItem();
    		String typ=obj.toString();
    		
    		String tablestart=null;
    		String tableid=null;
    		if(typ.equals("Paint"))
    		{
    			type=1;
    		}
    		else
    		{
    		type=0;
    		}	
    		if(type==1)
    		{
    			tablestart="paintrawtype_";
    			int i=rawmaterial3.getSelectedIndex();
        		i=i+1;
        		tableid=Integer.toString(i);
    		}
    		else
    		{
    			tablestart="brushrawtype_";
    			int i=brushrawmaterial3.getSelectedIndex();
        		i=i+1;
        		tableid=Integer.toString(i);
    		}
    		Object rowData[][] = {{"Row1-Column1", "Row1-Column2"}};
    	    // array to hold column names
    	    Object columnNames[] = {"Name", "Quantity"};
    		DefaultTableModel model=new DefaultTableModel(rowData,columnNames);
    		
    		Object[] rows;
    	    table = new JTable(model);
    	    model.removeRow(0);
    	   
    	    // create a table model and table based on it
    	        
    		String query="select * from ".concat(tablestart).concat(tableid);
			try
			{
		    	Statement st1 = conn.createStatement();
			    ResultSet rs=st1.executeQuery(query);
		    	while (rs.next()) 
		    	{
		    		rows = new Object[]{rs.getString(2), rs.getString(3)};
		    	      // add the temp row to the table
		    	      model.addRow(rows);
		    	}
		    	
			}
			catch(Exception e16)
			{
				System.out.println(e16.toString());
			}
		
		scrollPane = new JScrollPane(table);
		Dimension d = table.getPreferredSize();
		int noofrows=table.getRowCount();
		scrollPane.setPreferredSize(new Dimension((d.width*3),table.getRowHeight()*(noofrows+2)));
	   
	    	   jp5.add(scrollPane);
	    	   flagadd=1;
	    	   jp5.revalidate();
	    	   jp5.repaint();
    		
    	}

    	if(e.getSource()== addmfg )
    	{
    		int type;
    		Object obj=selectcombo11.getSelectedItem();
    		String typ=obj.toString();
    		String name=mfgname.getText();
    		
    		String tablename=null;
    		
    		if(typ.equals("Paint"))
    		{
    			type=1;
    		}
    		else
    		{
    		type=0;
    		}	
    		if(type==1)
    		{
    			tablename="mfgpaints";
    		}
    		else
    		{
    			tablename="mfgbrushes";
    		}
    		     
    		String query="insert into ".concat(tablename).concat("(name,quantity) values('"+name+"',0) ");
			try
			{
		    	Statement st1 = conn.createStatement();
			   st1.executeUpdate(query);
		    	
		    	
			}
			catch(Exception e16)
			{
				System.out.println(e16.toString());
			}

    		
    	}

    	if(e.getSource()== showdetails2 )
    	{
    		refreshtable2();
    		int type;
    		Object obj=selectcombo6.getSelectedItem();
    		String typ=obj.toString();
    		String tablename=null;
    		if(typ.equals("Paint"))
    		{
    			type=1;
    		}
    		else
    		{
    		type=0;
    		}	
    		if(type==1)
    		{
    			tablename="mfgpaints";
    			
    		}
    		else
    		{
    			tablename="mfgbrushes";
    		}
    		Object rowData[][] = {{"Row1-Column1", "Row1-Column2"}};
    	    // array to hold column names
    	    Object columnNames[] = {"Name", "Quantity"};
    		DefaultTableModel model=new DefaultTableModel(rowData,columnNames);
    		
    		Object[] rows;
    	    table = new JTable(model);
    	    model.removeRow(0);
    	   
    	    // create a table model and table based on it
    	        
    		String query="select * from ".concat(tablename);
			try
			{
		    	Statement st1 = conn.createStatement();
			    ResultSet rs=st1.executeQuery(query);
		    	while (rs.next()) 
		    	{
		    		rows = new Object[]{rs.getString(2), rs.getString(3)};
		    	      // add the temp row to the table
		    	      model.addRow(rows);
		    	}
		    	
			}
			catch(Exception e16)
			{
				System.out.println(e16.toString());
			}
		scrollPane = new JScrollPane(table);
		Dimension d = table.getPreferredSize();
		int noofrows=table.getRowCount();
		scrollPane.setPreferredSize(new Dimension((d.width*2),table.getRowHeight()*(noofrows+2)));
	    
	    	   jp6.add(scrollPane);
	    	   flagadd=1;
	    	   jp6.revalidate();
	    	   jp6.repaint();
    		
    	}


    	if(e.getSource()== showdetails3 )
    	{
    		refreshtable3();
    		Object obj=selectcombo7.getSelectedItem();
    		String typ=obj.toString();
    		String tablename=null;
    		if(typ.equals("Purchase"))
    		{
    			Object obj2=selectcombo8.getSelectedItem();
        		String typ2=obj2.toString();
        		if(typ2.equals("Paint"))
        		{
        			tablename="firmspurchasepaint";
        		}
        		else if(typ2.equals("Brush"))
        		{
        			tablename="firmspurchasebrush";
        		}
    		}
    		else if(typ.equals("Sale"))
    		{
    		tablename="firmssale";
    		}	
    		
    		Object rowData[][] = {{"Row1-Column1", "Row1-Column2"}};
    	    // array to hold column names
    	    Object columnNames[] = {"Name"};
    		DefaultTableModel model=new DefaultTableModel(rowData,columnNames);
    		
    		Object[] rows;
    	    table = new JTable(model);
    	    model.removeRow(0);
    	   
    	    // create a table model and table based on it
    	        
    		String query="select * from ".concat(tablename);
			try
			{
		    	Statement st1 = conn.createStatement();
			    ResultSet rs=st1.executeQuery(query);
		    	while (rs.next()) 
		    	{
		    		rows = new Object[]{rs.getString(2)};
		    	      // add the temp row to the table
		    	      model.addRow(rows);
		    	}
		    	
			}
			catch(Exception e16)
			{
				System.out.println(e16.toString());
			}
		scrollPane = new JScrollPane(table);
		Dimension d = table.getPreferredSize();
		int noofrows=table.getRowCount();
		scrollPane.setPreferredSize(new Dimension((d.width*2),table.getRowHeight()*(noofrows+2)));
	    
	    	   jp7.add(scrollPane);
	    	   flagadd=1;
	    	   jp7.revalidate();
	    	   jp7.repaint();
    		
    	}
    	
    	
    	if(e.getSource()==selectcombo4)
    	{
    		Object type=selectcombo4.getSelectedItem();
    		String type2=type.toString();
    		
    		if(type2.equals("Paint"))
    				{
    				for(int i=0;i<=numbrushraw-1;i++)
    				{
    					brushmaterialtype2[i].setVisible(false);
    				}
    				jp14.add(rawmaterial2);
    				rawmaterial2.setVisible(true);
    				brushrawmaterial2.setVisible(false);
    				}
    		else 
    		{
    			for(int i=0;i<=numpaintraw-1;i++)
				{
					rawmaterialtype2[i].setVisible(false);
				}
    			jp14.add(brushrawmaterial2);
    			brushrawmaterial2.setVisible(true);
    			rawmaterial2.setVisible(false);
    			
    		}	
    		jp14.revalidate();
    		jp14.repaint();
    	}
    	
    	if(e.getSource()==rawmaterial)
    	{	
		  int i=rawmaterial.getSelectedIndex();
		  refreshrawmaterial(i+1);
    	}
        
    	if(e.getSource()==rawmaterial2)
    	{	
    		  int i=rawmaterial2.getSelectedIndex();
    		  refreshrawmaterials(i+1);	
    	}
    	
    	if(e.getSource()==brushrawmaterial)
    	{
    		int i=brushrawmaterial.getSelectedIndex();
		  refreshbrushmaterial(i+1);
    	}
    	
    	if(e.getSource()==brushrawmaterial2)
    	{
    		int i=brushrawmaterial2.getSelectedIndex();
  		  refreshbrushmaterial2(i+1);
    	}
    	
    	if(e.getSource()==addchild)
    	{
    		String name=childname.getText();
    		String s=selectcombo14.getSelectedItem().toString();
    		int flag=0;
    		int i=0;
    		if(s.equals("Paint"))
    		{
    			flag=1;
       		i=rawmaterial4.getSelectedIndex();
    		}
    		else
    		{
    			flag=0;
    		 i=brushrawmaterial4.getSelectedIndex();
    		}
    		i=i+1;
    		String tablestart=null;
    		String id=Integer.toString(i);
    		if(flag==1)
    		{
    			tablestart="paintrawtype_".concat(id);
    		}
    		else
    		{
    			tablestart="brushrawtype_".concat(id);
    		}
		   
		   
			  String query2="insert into ".concat(tablestart).concat("(name,quantity) values('"+name+"',0)");
    		  try
          	{
    			  System.out.println(query2);
                  Statement st1 = conn.createStatement();
                  st1.executeUpdate(query2);
                         
                  
          	}
          	catch(Exception e10)
          	{
          		System.out.println(e10.toString());
          	}

  			JOptionPane.showMessageDialog(jp11,"Child Raw Material Type Successfully Added");
  			
  			childname.setText(null);
			jp11.revalidate();
			jp11.repaint();
			
    	}
    	
    	if(e.getSource()==addparent)
    	{
    		String name=parentname.getText();
    		String s=selectcombo9.getSelectedItem().toString();
    		int flag=0;
    		if(s.equals("Paint"))
    		{
    			flag=1;
    		}
    		else
    		{
    			flag=0;
    		}
    		String tablestart=null;
    		String iddd=null;
    		if(flag==1)
    		{
    			tablestart="paintrawtype";
    		}
    		else
    		{
    			tablestart="brushrawtype";
    		}
		    try
	        {
	    	Statement st1 = conn.createStatement();
		    ResultSet rs=st1.executeQuery("select * from ".concat(tablestart).concat(" order by id desc limit 1"));
	    
	    	while (rs.next()) 
	    	{
				 iddd = rs.getString("id");
	    	}
	        }
		    catch(Exception e12)
		    {
		    }
		    int i=Integer.parseInt(iddd);
		    i=i+1;
		    String id=Integer.toString(i);
		    
		    String rest="(id INT UNSIGNED NOT NULL AUTO_INCREMENT, PRIMARY KEY (id),name text, quantity text)";
		    String query="CREATE TABLE ".concat(tablestart).concat("_").concat(id).concat(rest);
		    
		    try
        	{
                Statement st1 = conn.createStatement();
                st1.executeUpdate(query);
                        
                
        	}
        	catch(Exception e10)
        	{
        		System.out.println(e10.toString());
        	}	
		
			  String query2="insert into ".concat(tablestart).concat("(name) values('"+name+"')");
    		 
			  try
          	{
                  Statement st1 = conn.createStatement();
                  st1.executeUpdate(query2);
                         
                  
          	}
          	catch(Exception e10)
          	{
          		System.out.println(e10.toString());
          	}
			checknumraw();
			refreshpaint();
			refreshbrush();

  			JOptionPane.showMessageDialog(jp10,"Parent Raw Material Type Successfully Added");
  			
  			parentname.setText(null);
			jp10.revalidate();
			jp10.repaint();
			
    	}


    	if(e.getSource()==go)
    	{
    		String name=null;
    		String iddd=null;
	    	String iddd2=null;

		    try
	        {
	    	Statement st1 = conn.createStatement();
		    ResultSet rs=st1.executeQuery("select * from sale order by id desc limit 1");
	    
	    	while (rs.next()) 
	    	{
				 iddd = rs.getString("id");
	    	}
	        }
		    catch(Exception e12)
		    {
		    }
		    int idd=Integer.parseInt(iddd);
		    idd=idd+1;
		     iddd2=Integer.toString(idd);
	
    		if(firstsale==0)
    		{
    	    		    String rest="(id INT UNSIGNED NOT NULL AUTO_INCREMENT, PRIMARY KEY (id),type text, name text, price text,  quantity text,amount text)";
    	    		    String query="CREATE TABLE sale_".concat(iddd2).concat(rest);
    	    			try
    	            	{
    	                    Statement st1 = conn.createStatement();
    	                    st1.executeUpdate(query);
    	                            
    	                    firstsale=1;
    	            	}
    	            	catch(Exception e10)
    	            	{
    	            		
    	            	}	
    	    			
    	    		
    	    		}
    		
        	int flag=0;
    	
        		//flag = 0 for brush raw material and 1 for paint raw material.
        		Object s = selectcombo.getSelectedItem();
        		String s1= s.toString();
        		if(s1.equalsIgnoreCase("brush"))
        		{
        			flag=1;
        			Object brushcmb = brushcombo.getSelectedItem();
          		   name = brushcmb.toString();
        		}
        		else
        		{
        			flag=0;
        			Object paintcmb = paintcombo.getSelectedItem();
            		   name = paintcmb.toString();
        		}
        		  String pric = pri.getText();
        		  Float price = new Float(pric);
        		  
        		  String qua = quant.getText(); 
        		  Float quan=new Float(qua);
        		  float amtsale=price*quan;
        		  
        		  amountsale=amountsale+amtsale;
        		  
        		  String halfquery="INSERT INTO sale_".concat(iddd2);
        		  String id2=null;
        		  if(flag==1)
        		  {
        			  id2="Brush";
        		  }
        		  else
        		  {
        			  id2="Paint";
        		  }
        		  String query=halfquery.concat("(type, name, quantity, price,amount) values('"+id2+"','"+name+"','"+qua+"','"+price+"','"+amtsale+"')");
        		  try
              	{
                      Statement st1 = conn.createStatement();
                      st1.executeUpdate(query);
                             
                      firstsale=1;
              	}
              	catch(Exception e10)
              	{
              	}
        frame.setVisible(false);
        textareaa();
        frame.setVisible(true);
            }
    	
    	if(e.getSource()==completesale)
    	{
    		String iddd=null;
		Object firmnam=nameoffirm.getSelectedItem();
		String firm=firmnam.toString();
		String amount2=Float.toString(amountsale);
		String dop2=dat.getText();
			try
			{
                Statement st2 = conn.createStatement();
                String query="INSERT INTO sale( firmname, amount, dop) values('"+firm+"','"+amount2+"','"+dop2+"')";
              
                st2.executeUpdate(query);
        	}
        	catch(Exception e10)
        	{
        		 System.out.println(e10.toString());
        	}	
			try
			{
		    	Statement st1 = conn.createStatement();
			    ResultSet rs=st1.executeQuery("select * from sale order by id desc limit 1");
		    	while (rs.next()) 
		    	{
					 iddd = rs.getString("id");	
		    	}
		     }
			 catch(Exception e12)
			 { 
			 }
			String query="select * from sale_".concat(iddd);
			try
			{
		    	Statement st1 = conn.createStatement();
			    ResultSet rs=st1.executeQuery(query);
		    	while (rs.next()) 
		    	{
		    		String name=rs.getString("name");
					 String type = rs.getString("type");
					 String quantities = rs.getString("quantity");
					 Float quans= new Float(quantities);
					 int type2=Integer.parseInt(type);
					 if(type2==1)
					 {
						 try
							{
							 String query2="select quantity from mfgpaints".concat(" where name='").concat(name).concat("'");
						    	Statement st2 = conn.createStatement();
							    ResultSet rs2=st2.executeQuery(query2);
						    	while (rs2.next()) 
						    	{
						    		String quantity2=rs2.getString("quantity");
						    		Float quan2=new Float(quantity2);
						    		
						    		Float newquantity=quan2-quans;
						    		
						    		String newquan=newquantity.toString();
						    		try
									{
									 String query3="update mfgpaints set quantity=".concat(newquan).concat(" where name='").concat(name).concat("'");
								     Statement st3 = conn.createStatement();
									    st3.executeUpdate(query3);
									}
						    		catch(Exception e15) {
						    			System.out.println(e15.toString());
						    		}
						    	
						    	}
							}
						 catch(Exception e18)
						 {
							 System.out.println(e18.toString());
						 }
					 }
					 else
					 {
						 try
							{
							 String query2="select quantity from mfgbrushes".concat(" where name='").concat(name).concat("'");
						    	Statement st2 = conn.createStatement();
							    ResultSet rs2=st2.executeQuery(query2);
						    	while (rs2.next()) 
						    	{
						    		String quantity2=rs2.getString("quantity");
						    		Float quan2=new Float(quantity2);
						    		
						    		Float newquantity=quan2-quans;
						    		String newquan=newquantity.toString();
						    		try
									{
									 String query3="update mfgbrushes set quantity=".concat(newquan).concat(" where name = '").concat(name).concat("'");
								    	Statement st3 = conn.createStatement();
								        st3.executeUpdate(query3);
									}
						    		catch(Exception e16) {
						    			System.out.println(e16.toString());
						    		}
						    	
						    	}
							}
						 catch(Exception e17)
						 { 
							 System.out.println(e17.toString());
						 }
					 }
					 
		    	}
		     }
			 catch(Exception e19)
			 { 
				 System.out.println(e19.toString());
			 }
			firstsale=0;
			JOptionPane.showMessageDialog(jp1,"Sale Successfully Completed");
			amountsale=0;
			quant.setText(null);
			pri.setText(null);
			dat.setText(null);
			brushcombo.setVisible(false);
			paintcombo.setVisible(false);
			refreshtable1();
			jp1.revalidate();
			jp1.repaint();
	   }
    	
    	if(e.getSource()==completeproduction)
    	{
    		String name=null;
        	int flag=0;
        		//flag = 0 for brush raw material and 1 for paint raw material.
        		Object s = selectcombo3.getSelectedItem();
        		String s1= s.toString();
        		if(s1.equalsIgnoreCase("brush"))
        		{
        			flag=1;
        			Object brushcmb = brushcombo2.getSelectedItem();
          		   name = brushcmb.toString();
        		}
        		else
        		{
        			flag=0;
        			Object paintcmb = paintcombo2.getSelectedItem();
            		   name = paintcmb.toString();
        		}
        		  
        		  String qua = quant3.getText(); 
        		  Float quan=new Float(qua);
        		  
        		  String datte = dat3.getText(); 
        		   
        		  String halfquery="INSERT INTO production_goods";
        		  int id2=0;
        		  if(flag==1)
        		  {
        			  id2=0;
        		  }
        		  else
        		  {
        			  id2=1;
        		  }
        		  String query=halfquery.concat("(type, name, quantity, dop) values('"+id2+"','"+name+"','"+quan+"','"+datte+"')");
        		  try
              	{
                      Statement st1 = conn.createStatement();
                      st1.executeUpdate(query);
                             
              	}
              	catch(Exception e10)
              	{
              		System.out.println(e10.toString());
              	}
     			
				 if(id2==1)
				 {
					 try
						{
						 String query2="select quantity from mfgpaints".concat(" where name='").concat(name).concat("'");
					    	Statement st2 = conn.createStatement();
						    ResultSet rs2=st2.executeQuery(query2);
					    	while (rs2.next()) 
					    	{
					    		String quantity2=rs2.getString("quantity");
					    		Float quan2=new Float(quantity2);
					    		
					    		Float newquantity=quan2+quan;
					    		
					    		String newquan=newquantity.toString();
					    		try
								{
								 String query3="update mfgpaints set quantity=".concat(newquan).concat(" where name='").concat(name).concat("'");
							     Statement st3 = conn.createStatement();
								    st3.executeUpdate(query3);
								}
					    		catch(Exception e15) {
					    			System.out.println(e15.toString());
					    		}
					    	}
						}
					 catch(Exception e18)
					 {
						 System.out.println(e18.toString());
					 }
				 }
				 else
				 {
					 try
						{
						 String query2="select quantity from mfgbrushes".concat(" where name='").concat(name).concat("'");
					    	Statement st2 = conn.createStatement();
						    ResultSet rs2=st2.executeQuery(query2);
					    	while (rs2.next()) 
					    	{
					    		String quantity2=rs2.getString("quantity");
					    		Float quan2=new Float(quantity2);
					    		
					    		Float newquantity=quan2+quan;
					    		String newquan=newquantity.toString();
					    		try
								{
								 String query3="update mfgbrushes set quantity=".concat(newquan).concat(" where name = '").concat(name).concat("'");
							    	Statement st3 = conn.createStatement();
							        st3.executeUpdate(query3);
								}
					    		catch(Exception e16) {
					    			System.out.println(e16.toString());
					    		}					    	
					    	}
						}
					 catch(Exception e17)
					 { 
						 System.out.println(e17.toString());
					 }
				 }
            }

    	if(e.getSource()==completeproduction2)
    	{	
    		String name=null;
    		String id=null;
    		String typed=null;
    		int flag;
        	
        	Object obj=selectcombo4.getSelectedItem();
        	String n=obj.toString();
        	
        	if(n.equals("Paint"))
        	{
        		flag=1;
        		//flag = 0 for brush raw material and 1 for paint raw material.
        		Object s = rawmaterial2.getSelectedItem();
        		String s1= s.toString();
        		int i=rawmaterial2.getSelectedIndex();
        			id=s1;
        			Object brushcmb = rawmaterialtype2[i].getSelectedItem();
          		   name = brushcmb.toString();
          		   int i2=i+1;
        		 typed=Integer.toString(i2);
        		}
        	else
        	{
        		flag=0;
        		//flag = 0 for brush raw material and 1 for paint raw material.
        		Object s = brushrawmaterial2.getSelectedItem();
        		String s1= s.toString();
        		
        		int i=brushrawmaterial2.getSelectedIndex();
        			id=s1;
        			Object brushcmb = brushmaterialtype2[i].getSelectedItem();
          		   name = brushcmb.toString();
        			int i2=i+1;
        			 typed=Integer.toString(i2);
        	}
        		  
        		  String qua = quant4.getText();
        		  Float quan=new Float(qua);
        		  
        		  String datte = dat4.getText();
     
        		  String halfquery="INSERT INTO production_materials";
        		  String query=halfquery.concat("(type,typematerial, name, quantity, dop) values('"+flag+"','"+id+"','"+name+"','"+quan+"','"+datte+"')");
        		  try
              	{
                      Statement st1 = conn.createStatement();
                      st1.executeUpdate(query);    
              	}
              	catch(Exception e10)
              	{
              		System.out.println(e10.toString());
              	}		   	  
        		  
      			String tablestart=null;
      			if(flag==1)
      			{
      				 tablestart="paintrawtype_";
      			}
      			else
      			{
      				tablestart="brushrawtype_";
      			}
      					 
      						 try
      							{
      							 String query2="select quantity from ".concat(tablestart).concat(typed).concat(" where name='").concat(name).concat("'");
      						    	Statement st2 = conn.createStatement();
      							    ResultSet rs2=st2.executeQuery(query2);
      						    	while (rs2.next()) 
      						    	{
      						    		String quantity2=rs2.getString("quantity");
      						    		Float quan2=new Float(quantity2);
      						    		
      						    		Float newquantity=quan2-quan;
      						    		
      						    		String newquan=newquantity.toString();
      						    		try
      									{
      									 String query3="update ".concat(tablestart).concat(typed).concat(" set quantity=").concat(newquan).concat(" where name='").concat(name).concat("'");
      								     Statement st3 = conn.createStatement();
      								     st3.executeUpdate(query3);
      									}
      						    		catch(Exception e15) {
      						    			System.out.println(e15.toString());
      						    		}
      						    	
      						    	}
      							}
      						 catch(Exception e18)
      						 {
      							 System.out.println(e18.toString());
      						 }	  
        		  
        frame.setVisible(false);   
        frame.setVisible(true);
            }
    
    	
    	if(e.getSource()==go2)
    	{	
    		int type;
    		String iddd=null;
    	String iddd2=null;
    		String name=null;
    	    try
	        {
	    	Statement st1 = conn.createStatement();
		    ResultSet rs=st1.executeQuery("select * from purchase order by id desc limit 1");
	    
	    	while (rs.next()) 
	    	{
				 iddd = rs.getString("id");	
	    	}
	        }
		    catch(Exception e12)
		    { }
		    int idd=Integer.parseInt(iddd);
		    idd=idd+1;
		     iddd2=Integer.toString(idd);
		
    		if(firstpurchase==0)
    		{
    		    String rest="(id INT UNSIGNED NOT NULL AUTO_INCREMENT, PRIMARY KEY (id),type integer, typetext text, name text, price text,  quantity text,amount text)";
    		    String query="CREATE TABLE purchase_".concat(iddd2).concat(rest);
    			try
            	{
                    Statement st1 = conn.createStatement();
                    st1.executeUpdate(query);
                            
                    first=1;
            	}
            	catch(Exception e10)
            	{
            		System.out.println(e10.toString());
            	}	
    			cart2.append("Id");
    			cart2.append("    ");
    			cart2.append("Type");
    			cart2.append("    ");
    			cart2.append("Name");
    			cart2.append("    ");
    			cart2.append("Price");
    			cart2.append("    ");
    			cart2.append("Quantity");
    			cart2.append("    ");
    			cart2.append("Amount");
    			cart2.append("    ");
    			
    			cart2.append(" \n");
    			
    			
    			
    		}
        	
        	Object obj=selectcombo2.getSelectedItem();
        	String n=obj.toString();
        	String s1=null;
        	if(n.equals("Paint"))
        	{
        		//flag = 0 for brush raw material and 1 for paint raw material.
        		Object s = rawmaterial.getSelectedItem();
        		 s1= s.toString();
        		int i=rawmaterial.getSelectedIndex();
        			type=i+1;
        			Object brushcmb = rawmaterialtype[i].getSelectedItem();
          		   name = brushcmb.toString();
        		
        		}
        	else
        	{
        		//flag = 0 for brush raw material and 1 for paint raw material.
        		Object s = brushrawmaterial.getSelectedItem();
        		 s1= s.toString();
        		int i=brushrawmaterial.getSelectedIndex();
        		type=i+1;
        			
        			Object brushcmb = brushmaterialtype[i].getSelectedItem();
          		   name = brushcmb.toString();
        		}
        		  String pric = pri2.getText();
        		  Float price = new Float(pric);
        		  
        		  String qua = quant2.getText();
        		  Float quan=new Float(qua);
        		  float amtpur=price*quan;
        		  
        		  amountpur=amountpur+amtpur;
        		  String id2=s1;
        		  String halfquery="INSERT INTO purchase_".concat(iddd2);
        		  String query=halfquery.concat("(type, typetext, name, quantity, price, amount) values('"+type+"','"+id2+"','"+name+"','"+qua+"','"+price+"','"+amtpur+"')");
        		  try
              	{
                      Statement st1 = conn.createStatement();
                      st1.executeUpdate(query);
                             
                      firstpurchase=1;
              	}
              	catch(Exception e10)
              	{
              		System.out.println(e10.toString());
              	}		   	  
        frame.setVisible(false);
        textareaa2();
        frame.setVisible(true);
            }
    	
    	if(e.getSource()== completepurchase )
    	{
    		String iddd=null;
    		String typees=null;
    		int type;
    		Object obj=selectcombo2.getSelectedItem();
    		String typ=obj.toString();
    		if(typ.equals("Paint"))
    		{
    			type=1;
    		}
    		else
    		{
    		type=0;
    		}	
    		Object firmnam=nameoffirm2.getSelectedItem();
    		String firm=firmnam.toString();
    		String amount2=Float.toString(amountpur);
    		
    		String dop2=dat2.getText();
    			try
            	{
                    Statement st2 = conn.createStatement();
                    String query="INSERT INTO purchase(type, firmname, amount, dop) values('"+type+"','"+firm+"','"+amount2+"','"+dop2+"')"; 
                    st2.executeUpdate(query);
            	}
            	catch(Exception e10)
            	{
            		 System.out.println(e10.toString());
            	}	
    			firstpurchase=0;
    			amountpur=0;
    			
    			try
    			{
    		    	Statement st1 = conn.createStatement();
    			    ResultSet rs=st1.executeQuery("select * from purchase order by id desc limit 1");
    		    	while (rs.next()) 
    		    	{
    		    		typees=rs.getString("type");
    					 iddd = rs.getString("id");	
    		    	}
    		     }
    			 catch(Exception e12)
    			 { 
    			 }
    			int itype=Integer.parseInt(typees);
    			String tablestart=null;
    			if(itype==1)
    			{
    				 tablestart="paintrawtype_";
    			}
    			else
    			{
    				tablestart="brushrawtype_";
    			}
    			String query="select * from purchase_".concat(iddd);
    			try
    			{
    		    	Statement st1 = conn.createStatement();
    			    ResultSet rs=st1.executeQuery(query);
    		    	while (rs.next()) 
    		    	{
    		    		String name=rs.getString("name");
    					 String typed = rs.getString("type");
    					 String quantities = rs.getString("quantity");
    					 Float quans= new Float(quantities);
    					 
    						 try
    							{
    							 String query2="select quantity from ".concat(tablestart).concat(typed).concat(" where name='").concat(name).concat("'");
    						    	Statement st2 = conn.createStatement();
    							    ResultSet rs2=st2.executeQuery(query2);
    						    	while (rs2.next()) 
    						    	{
    						    		String quantity2=rs2.getString("quantity");
    						    		Float quan2=new Float(quantity2);
    						    		
    						    		Float newquantity=quan2+quans;
    						    		
    						    		String newquan=newquantity.toString();
    						    		try
    									{
    									 String query3="update ".concat(tablestart).concat(typed).concat(" set quantity=").concat(newquan).concat(" where name='").concat(name).concat("'");
    								     Statement st3 = conn.createStatement();
    								     st3.executeUpdate(query3);
    									}
    						    		catch(Exception e15) {
    						    			System.out.println(e15.toString());
    						    		}
    						    	
    						    	}
    							}
    						 catch(Exception e18)
    						 {
    							 System.out.println(e18.toString());
    						 }
    					 }		 
    		     }
    			 catch(Exception e19)
    			 { 
    				 System.out.println(e19.toString());
    			 }
    			
    			JOptionPane.showMessageDialog(jp3,"Purchase Successfully Completed");
    			
    			quant2.setText(null);
    			pri2.setText(null);
    			dat2.setText(null);
    			cart2.setText(null);
    			
    			for(int i=0;i<=numpaintraw-1;i++)
				{
					rawmaterialtype[i].setVisible(false);
				}
    			for(int i=0;i<numbrushraw-1;i++)
    			{
    				brushmaterialtype[i].setVisible(false);
    			}
    			rawmaterial.setVisible(false);
    			brushrawmaterial.setVisible(false);
    			nameoffirm2.setVisible(false);
    			selectcombo2.setVisible(true);
    			refreshtablepurchase();
    			jp3.revalidate();
    			jp3.repaint();	
    	   }
    	
    	if(e.getSource()==show)
    	{
    		String obj=dat5.getText();
    		int i=nameoffirm3.getSelectedIndex();
    		Object names=nameoffirm3.getSelectedItem();
    		String name=names.toString();
    		if(i==0)
    		{
    			refreshtable4();
        		Object rowData[][] = {{"Row1-Column1", "Row1-Column2"}};
        	    // array to hold column names
        	    Object columnNames[] = {"ID", "Firmname","Amount","Date"};
        		DefaultTableModel model=new DefaultTableModel(rowData,columnNames);
        		
        		Object[] rows;
        	    table = new JTable(model);
        	    model.removeRow(0);
        	   
        	    // create a table model and table based on it
        	        
        		String query="select * from sale where dop='".concat(obj).concat("'");
    			try
    			{
    		    	Statement st1 = conn.createStatement();
    			    ResultSet rs=st1.executeQuery(query);
    		    	while (rs.next()) 
    		    	{
    		    		rows = new Object[]{rs.getString(1),rs.getString(2), rs.getString(3),rs.getString(4)};
    		    	      // add the temp row to the table
    		    	      model.addRow(rows);
    		    	}
    		    	
    			}
    			catch(Exception e16)
    			{
    				System.out.println(e16.toString());
    			}
    		scrollPane = new JScrollPane(table);
    		Dimension d = table.getPreferredSize();
    		int noofrows=table.getRowCount();
    		scrollPane.setPreferredSize(new Dimension((d.width*2),table.getRowHeight()*(noofrows+2)));
    	    
    	    	   jp8.add(scrollPane);
    	    	   flagadd=1;
    	    	   jp8.revalidate();
    	    	   jp8.repaint();
        	
  	
    		}
    		else if(obj.equals(""))
    		{
      			refreshtable4();
        		Object rowData[][] = {{"Row1-Column1", "Row1-Column2"}};
        	    // array to hold column names
        	    Object columnNames[] = {"ID", "Firmname","Amount","Date"};
        		DefaultTableModel model=new DefaultTableModel(rowData,columnNames);
        		
        		Object[] rows;
        	    table = new JTable(model);
        	    model.removeRow(0);
        	   
        	    // create a table model and table based on it
        	        
        		String query="select * from sale where firmname='".concat(name).concat("'");
    			try
    			{
    		    	Statement st1 = conn.createStatement();
    			    ResultSet rs=st1.executeQuery(query);
    		    	while (rs.next()) 
    		    	{
    		    		rows = new Object[]{rs.getString(1),rs.getString(2), rs.getString(3),rs.getString(4)};
    		    	      // add the temp row to the table
    		    	      model.addRow(rows);
    		    	}
    		    	
    			}
    			catch(Exception e16)
    			{
    				System.out.println(e16.toString());
    			}
    		scrollPane = new JScrollPane(table);
    		Dimension d = table.getPreferredSize();
    		int noofrows=table.getRowCount();
    		scrollPane.setPreferredSize(new Dimension((d.width*2),table.getRowHeight()*(noofrows+2)));
    	    
    	    	   jp8.add(scrollPane);
    	    	   flagadd=1;
    	    	   jp8.revalidate();
    	    	   jp8.repaint();
        	
  
    		}
    		else
    		{
      			refreshtable4();
        		Object rowData[][] = {{"Row1-Column1", "Row1-Column2"}};
        	    // array to hold column names
        	    Object columnNames[] = {"ID", "Firmname","Amount","Date"};
        		DefaultTableModel model=new DefaultTableModel(rowData,columnNames);
        		
        		Object[] rows;
        	    table = new JTable(model);
        	    model.removeRow(0);
        	   
        	    // create a table model and table based on it
        	        
        		String query="select * from sale where dop='".concat(obj).concat("'").concat("and firmname='").concat(name).concat("'");
    			try
    			{
    		    	Statement st1 = conn.createStatement();
    			    ResultSet rs=st1.executeQuery(query);
    		    	while (rs.next()) 
    		    	{
    		    		rows = new Object[]{rs.getString(1),rs.getString(2), rs.getString(3),rs.getString(4)};
    		    	      // add the temp row to the table
    		    	      model.addRow(rows);
    		    	}
    		    	
    			}
    			catch(Exception e16)
    			{
    				System.out.println(e16.toString());
    			}
    		scrollPane = new JScrollPane(table);
    		Dimension d = table.getPreferredSize();
    		int noofrows=table.getRowCount();
    		scrollPane.setPreferredSize(new Dimension((d.width*2),table.getRowHeight()*(noofrows+2)));
    	    
    	    	   jp8.add(scrollPane);
    	    	   flagadd=1;
    	    	   jp8.revalidate();
    	    	   jp8.repaint();
        
    		}
    	}
    	
    	if(e.getSource()==showbyid)
    	{
    		String obj=id.getText();
    		
    			refreshtable4();
        		Object rowData[][] = {{"Row1-Column1", "Row1-Column2"}};
        	    // array to hold column names
        	    Object columnNames[] = {"Type", "Name","Price","Quantity"};
        		DefaultTableModel model=new DefaultTableModel(rowData,columnNames);
        		
        		Object[] rows;
        	    table = new JTable(model);
        	    model.removeRow(0);
        	   
        	    // create a table model and table based on it
        	        
        		String query="select * from sale_".concat(obj);
    			try
    			{
    		    	Statement st1 = conn.createStatement();
    			    ResultSet rs=st1.executeQuery(query);
    		    	while (rs.next()) 
    		    	{
    		    		rows = new Object[]{rs.getString(2),rs.getString(3), rs.getString(4),rs.getString(5)};
    		    	      // add the temp row to the table
    		    	      model.addRow(rows);
    		    	}
    		    	
    			}
    			catch(Exception e16)
    			{
    				System.out.println(e16.toString());
    			}
    		scrollPane = new JScrollPane(table);
    		Dimension d = table.getPreferredSize();
    		int noofrows=table.getRowCount();
    		scrollPane.setPreferredSize(new Dimension((d.width*2),table.getRowHeight()*(noofrows+2)));
    	   
    		jp8.add(scrollPane);
    	    	   flagadd=1;
    	    	   jp8.revalidate();
    	    	   jp8.repaint();
    		}
    	
    	if(e.getSource()==show2)
    	{	
    		String obj=dat6.getText();
    		int  i=selectcombo13.getSelectedIndex();
    		
    		
    		
    		if(i==0 && (!(obj.equals(""))))
    		{
    			refreshtable5();
        		Object rowData[][] = {{"Row1-Column1", "Row1-Column2"}};
        	    // array to hold column names
        	    Object columnNames[] = {"ID","Type", "Firmname","Amount","Date"};
        		DefaultTableModel model=new DefaultTableModel(rowData,columnNames);
        		
        		Object[] rows;
        	    table = new JTable(model);
        	    model.removeRow(0);
        	   
        	    // create a table model and table based on it
        	        
        		String query="select * from purchase where dop='".concat(obj).concat("'");
    			try
    			{
    		    	Statement st1 = conn.createStatement();
    			    ResultSet rs=st1.executeQuery(query);
    		    	while (rs.next()) 
    		    	{
    		    		rows = new Object[]{rs.getString(1),rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5)};
    		    	      // add the temp row to the table
    		    	      model.addRow(rows);
    		    	}
    		    	
    			}
    			catch(Exception e16)
    			{
    				System.out.println(e16.toString());
    			}
    		scrollPane = new JScrollPane(table);
    		Dimension d = table.getPreferredSize();
    		int noofrows=table.getRowCount();
    		scrollPane.setPreferredSize(new Dimension((d.width*2),table.getRowHeight()*(noofrows+2)));
    	    
    	    	   jp9.add(scrollPane);
    	    	   flagadd=1;
    	    	   jp9.revalidate();
    	    	   jp9.repaint();
        	
  	
    		}
    		else if(obj.equals(""))
    		{
    			Object names=nameoffirm4.getSelectedItem();
        		String name=names.toString();
        		
      			refreshtable5();
        		Object rowData[][] = {{"Row1-Column1", "Row1-Column2"}};
        	    // array to hold column names
        	    Object columnNames[] = {"ID","Type","Firmname","Amount","Date"};
        		DefaultTableModel model=new DefaultTableModel(rowData,columnNames);
        		
        		Object[] rows;
        	    table = new JTable(model);
        	    model.removeRow(0);
        	   
        	    // create a table model and table based on it
        	        
        		String query="select * from purchase where firmname='".concat(name).concat("'");
    			try
    			{
    		    	Statement st1 = conn.createStatement();
    			    ResultSet rs=st1.executeQuery(query);
    		    	while (rs.next()) 
    		    	{
    		    		rows = new Object[]{rs.getString(1),rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5)};
    		    	      // add the temp row to the table
    		    	      model.addRow(rows);
    		    	}
    		    	
    			}
    			catch(Exception e16)
    			{
    				System.out.println(e16.toString());
    			}
    		scrollPane = new JScrollPane(table);
    		Dimension d = table.getPreferredSize();
    		int noofrows=table.getRowCount();
    		scrollPane.setPreferredSize(new Dimension((d.width*1),table.getRowHeight()*(noofrows+2)));
    	    
    	    	   jp9.add(scrollPane);
    	    	   flagadd=1;
    	    	   jp9.revalidate();
    	    	   jp9.repaint();
        	
  
    		}
    		else
    		{
    			Object names=nameoffirm4.getSelectedItem();
        		String name=names.toString();
        		
      			refreshtable5();
        		Object rowData[][] = {{"Row1-Column1", "Row1-Column2"}};
        	    // array to hold column names
        	    Object columnNames[] = {"ID","Type","Firmname","Amount","Date"};
        		DefaultTableModel model=new DefaultTableModel(rowData,columnNames);
        		
        		Object[] rows;
        	    table = new JTable(model);
        	    model.removeRow(0);
        	   
        	    // create a table model and table based on it
        	        
        		String query="select * from purchase where dop='".concat(obj).concat("'").concat("and firmname='").concat(name).concat("'");
    			try
    			{
    		    	Statement st1 = conn.createStatement();
    			    ResultSet rs=st1.executeQuery(query);
    		    	while (rs.next()) 
    		    	{
    		    		rows = new Object[]{rs.getString(1),rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5)};
    		    	      // add the temp row to the table
    		    	      model.addRow(rows);
    		    	}
    		    	
    			}
    			catch(Exception e16)
    			{
    				System.out.println(e16.toString());
    			}
    		scrollPane = new JScrollPane(table);
    		Dimension d = table.getPreferredSize();
    		int noofrows=table.getRowCount();
    		scrollPane.setPreferredSize(new Dimension((d.width*1),table.getRowHeight()*(noofrows+2)));
    	    
    	    	   jp9.add(scrollPane);
    	    	   flagadd=1;
    	    	   jp9.revalidate();
    	    	   jp9.repaint();
    		}
    	}
    	
    	if(e.getSource()==showbyid2)
    	{
    		String obj=ida.getText();
    		
    			refreshtable5();
        		Object rowData[][] = {{"Row1-Column1", "Row1-Column2"}};
        	    // array to hold column names
        	    Object columnNames[] = {"Type", "Name","Price","Quantity"};
        		DefaultTableModel model=new DefaultTableModel(rowData,columnNames);
        		
        		Object[] rows;
        	    table = new JTable(model);
        	    model.removeRow(0);
        	   
        	    // create a table model and table based on it
        	        
        		String query="select * from purchase_".concat(obj);
    			try
    			{
    		    	Statement st1 = conn.createStatement();
    			    ResultSet rs=st1.executeQuery(query);
    		    	while (rs.next()) 
    		    	{
    		    		rows = new Object[]{rs.getString(2),rs.getString(3), rs.getString(4),rs.getString(5)};
    		    	      // add the temp row to the table
    		    	      model.addRow(rows);
    		    	}
    		    	
    			}
    			catch(Exception e16)
    			{
    				System.out.println(e16.toString());
    			}
    		scrollPane = new JScrollPane(table);
    		Dimension d = table.getPreferredSize();
    		int noofrows=table.getRowCount();
    		scrollPane.setPreferredSize(new Dimension((d.width*1),table.getRowHeight()*(noofrows+2)));
    	   
    		jp9.add(scrollPane);
    	    	   flagadd=1;
    	    	   jp9.revalidate();
    	    	   jp9.repaint();
        	
  	
    		}
    	}
  
     	
    public void createtabs() 
    {
    	frame.add(jtp,BorderLayout.CENTER);
        
    	selectcombo.addItem("Brush");
    	selectcombo.addItem("Paint");
    	
        jp1.add(orderdetails);
        
        refreshaddfirm();    
       
        jp1.add(nameoffirm);
        
        jp1.add(select);
        jp1.add(selectcombo);
            	
        jp1.add(quantity);
        jp1.add(quant);
        jp1.add(price);
        jp1.add(pri);
        jp1.add(date);
        jp1.add(dat);
        
        jp1.add(go);
        jp1.add(completesale);
        
    	
    	
    	
        jp2.add(select3);
        jp2.add(selectcombo3);
        jp2.add(quantity3);
        jp2.add(quant3);
        jp2.add(date3);
        jp2.add(dat3);
        jp2.add(completeproduction);
        
        jp14.add(select3);
        jp14.add(selectcombo4);
        jp14.add(quantity3);
        jp14.add(quant4);
        jp14.add(date3);
        jp14.add(dat4);
        jp14.add(completeproduction2);
        
        jp3.add(selectcombo2);
        jp3.add(select2);
        
        jp3.add(quantity2);
        jp3.add(quant2);
        jp3.add(price2);
        jp3.add(pri2);
        jp3.add(date2);
        jp3.add(dat2);

        jp3.add(go2);
        jp3.add(completepurchase); 
    	
    	selectcombo.addActionListener(this);
        selectcombo3.addActionListener(this);
        completeproduction.addActionListener(this);
        selectcombo4.addActionListener(this);
        selectcombo5.addActionListener(this);
        completeproduction2.addActionListener(this);
       jp5.add(selectcombo5);
       jp5.add(showdetails);
       
       jp6.add(selectcombo6);
       jp6.add(showdetails2);
       
       jp7.add(selectcombo7);
       jp7.add(showdetails3);
selectcombo6.addActionListener(this);
       showdetails2.addActionListener(this);
    	

selectcombo7.addActionListener(this);
       showdetails3.addActionListener(this);
       refreshaddfirm3();
       jp8.add(nameoffirm3);
       jp8.add(date5);
       jp8.add(dat5);
       jp8.add(show);
       jp8.add(id2);
       jp8.add(id);
       jp8.add(showbyid);
       
       
       jp9.add(selectcombo13);
       jp9.add(date6);
       jp9.add(dat6);
       jp9.add(show2);
       jp9.add(id22);
       jp9.add(ida);
       jp9.add(showbyid2);
       selectcombo13.addActionListener(this);
       
       jp10.add(selectcombo9);
       jp10.add(parentname2);
       jp10.add(parentname);
       jp10.add(addparent);
       
       addparent.addActionListener(this);
       
       jp11.add(selectcombo14);
       selectcombo14.addActionListener(this);
       jp11.add(label2);
       jp11.add(childname);
       jp11.add(addchild);
       jp12.add(selectcombo11);
       jp12.add(addmfg2);
       jp12.add(mfgname);
       jp12.add(addmfg);
       
       addchild.addActionListener(this);
       jp13.add(selectcombo10);
       jp13.add(labelfirmname2);
       jp13.add(firmname);
       jp13.add(addfirm);
       
       addfirm.addActionListener(this);
       selectcombo10.addActionListener(this);
       addmfg.addActionListener(this);
       
       show2.addActionListener(this);
       showbyid2.addActionListener(this);
       
       
       
       show.addActionListener(this);
       showbyid.addActionListener(this);
       showdetails.addActionListener(this);
       
    	selectcombo2.addActionListener(this);
        go.addActionListener(this);
        
        rawmaterial.addActionListener(this);
        brushrawmaterial.addActionListener(this);
        
        rawmaterial2.addActionListener(this);
        brushrawmaterial2.addActionListener(this);
        
        go2.addActionListener(this);
        completesale.addActionListener(this);
        completepurchase.addActionListener(this);
        
        
        jtp.addTab("<html><body leftmargin=15 topmargin=8 marginwidth=15 marginheight=5>Sale</body></html>", jp1);
        jtp.addTab("<html><body leftmargin=15 topmargin=8 marginwidth=15 marginheight=5>Production</body></html>",jtp4);
        jtp.addTab("<html><body leftmargin=15 topmargin=8 marginwidth=15 marginheight=5>Purchase</body></html>",jp3);
        jtp.addTab("<html><body leftmargin=15 topmargin=8 marginwidth=15 marginheight=5>View</body></html>",jtp2);
        jtp.addTab("<html><body leftmargin=15 topmargin=8 marginwidth=15 marginheight=5>Add</body></html>",jtp3);
        
        jtp2.addTab("<html><body leftmargin=15 topmargin=8 marginwidth=15 marginheight=5>Raw Material</body></html>", jp5);
        jtp2.addTab("<html><body leftmargin=15 topmargin=8 marginwidth=15 marginheight=5>Mfg Goods</body></html>",jp6);
        jtp2.addTab("<html><body leftmargin=15 topmargin=8 marginwidth=15 marginheight=5>Firms</body></html>",jp7);
        jtp2.addTab("<html><body leftmargin=15 topmargin=8 marginwidth=15 marginheight=5>Sale</body></html>",jp8);
        jtp2.addTab("<html><body leftmargin=15 topmargin=8 marginwidth=15 marginheight=5>Purchase</body></html>",jp9);
        
        jtp3.addTab("<html><body leftmargin=15 topmargin=8 marginwidth=15 marginheight=5>Parent Raw Material</body></html>", jp10);
        jtp3.addTab("<html><body leftmargin=15 topmargin=8 marginwidth=15 marginheight=5>Child Raw Material</body></html>",jp11);
        jtp3.addTab("<html><body leftmargin=15 topmargin=8 marginwidth=15 marginheight=5>Mfg. Goods</body></html>",jp12);
        jtp3.addTab("<html><body leftmargin=15 topmargin=8 marginwidth=15 marginheight=5>Firms</body></html>",jp13);
        
        jtp4.addTab("<html><body leftmargin=15 topmargin=8 marginwidth=15 marginheight=5>For Mfg. Goods</body></html>",jp2);
        jtp4.addTab("<html><body leftmargin=15 topmargin=8 marginwidth=15 marginheight=5>For Raw Materials</body></html>",jp14);
        
        
    }
    
    public void textareaa()
    {	
    	refreshtable1();
    	String iddd=null;
		    try
	        {
	    	Statement st1 = conn.createStatement();
		    ResultSet rs=st1.executeQuery("select * from sale order by id desc limit 1");
	    
	    	while (rs.next()) 
	    	{
				 iddd = rs.getString("id");	
	    	}
	        }
		    catch(Exception e12)
		    {    }
		    int idd=Integer.parseInt(iddd);
		    idd=idd+1;
		    String iddd2=Integer.toString(idd);
    	
    	Object rowData[][] = {{"Row1-Column1", "Row1-Column2"}};
	    // array to hold column names
	    Object columnNames[] = {"Name","Type","Price","Quantity","Amount"};
		DefaultTableModel model=new DefaultTableModel(rowData,columnNames);
		
		Object[] rows;
	    table = new JTable(model);
	    model.removeRow(0);
	    table.getColumnModel().getColumn(0).setPreferredWidth(200);
	    // create a table model and table based on it
	        
	    String query="select * from sale_".concat(iddd2);
    	
        try
        {
        Statement st1 = conn.createStatement();
	    ResultSet rs=st1.executeQuery(query);
     
    	while (rs.next()) 
    	{
	    		rows = new Object[]{rs.getString("name"),rs.getString("type"),rs.getString("price"), rs.getString("quantity"),rs.getString("amount")};
	    	      // add the temp row to the table
	    	      model.addRow(rows);
	    	}
	    	
		}
		catch(Exception e16)
		{
			System.out.println(e16.toString());
		}
	scrollPane = new JScrollPane(table);
	
	
	
	Dimension d = table.getPreferredSize();
	int noofrows=table.getRowCount();
	scrollPane.setPreferredSize(new Dimension((d.width),table.getRowHeight()*(noofrows+2)));
   
	jp1.add(scrollPane);
    	   flagadd=1;
    	   jp1.revalidate();
    	   jp1.repaint();
   
}
    
    public void textareaa2()
    {	refreshtablepurchase();
    	String iddd=null;
		    try
	        {
	    	Statement st1 = conn.createStatement();
		    ResultSet rs=st1.executeQuery("select * from purchase order by id desc limit 1");
	    	while (rs.next()) 
	    	{
				 iddd = rs.getString("id");		
	    	}
	        }
		    catch(Exception e12)
		    { }
		    int idd=Integer.parseInt(iddd);
		    idd=idd+1;
		    String iddd2=Integer.toString(idd);
		    
		    Object rowData[][] = {{"Row1-Column1", "Row1-Column2"}};
		    // array to hold column names
		    Object columnNames[] = {"Type","Name","Price","Quantity"};
			DefaultTableModel model=new DefaultTableModel(rowData,columnNames);
			
			Object[] rows;
		    table = new JTable(model);
		    model.removeRow(0);
		    table.getColumnModel().getColumn(1).setPreferredWidth(150);
		    table.getColumnModel().getColumn(0).setPreferredWidth(150);
		    // create a table model and table based on it
		    
		    
    	String query="select * from purchase_".concat(iddd2);
    	
    	
        try
        {
    	Statement st1 = conn.createStatement();
	    ResultSet rs=st1.executeQuery(query);
    
    	while (rs.next()) 
    	{
    		rows = new Object[]{rs.getString("typetext"),rs.getString("name"),rs.getString("price"), rs.getString("quantity"),rs.getString("amount")};
  	      // add the temp row to the table
  	      model.addRow(rows);
		}
    	conn.commit();	
        }
        catch(Exception e2)
        {
        }
        
        scrollPane = new JScrollPane(table);
    	
    	Dimension d = table.getPreferredSize();
    	int noofrows=table.getRowCount();
    	scrollPane.setPreferredSize(new Dimension((d.width),table.getRowHeight()*(noofrows+2)));
       
    	jp3.add(scrollPane);
        	   flagadd=1;
        	   jp3.revalidate();
        	   jp3.repaint();
    }
    
    
    public void refreshaddfirm()
    { nameoffirm.removeAllItems();
    	try
        {
    	ResultSet rs;
    	Statement st1 = conn.createStatement();
    	rs=st1.executeQuery("select * from firmssale");
    	while (rs.next()) 
    	{
			String firmName = rs.getString("firmname");
			nameoffirm.addItem(firmName);
		}
    	conn.commit();
        }
        catch(Exception e2)
        {
        }
    }
    
    public void refreshaddfirm3()
    {
    	nameoffirm3.removeAllItems();
    	nameoffirm3.addItem("--Select--");
    	try
        {
    	ResultSet rs;
    	Statement st1 = conn.createStatement();
    	rs=st1.executeQuery("select * from firmssale");
    	while (rs.next()) 
    	{
			String firmName = rs.getString("firmname");
			nameoffirm3.addItem(firmName);
		}
    	conn.commit();
        }
        catch(Exception e2)
        {
        }
    }
    
    
    
    public void refreshrawmaterial(int id)
    {
    	refreshpaintrawmaterial(id);
    	jp3.add(rawmaterialtype[id-1]);	
    	rawmaterialtype[id-1].setVisible(true);
    	for(int i=0;i<=numpaintraw-1;i++)
    	{
    		if(i!=(id-1))
    		{
    		rawmaterialtype[i].setVisible(false);	
    		}
    	}
		jp3.revalidate();
		jp3.repaint();	
    }
    
    public void refreshrawmaterials(int id)
    {
    	refreshpaintrawmaterials(id);
    	jp14.add(rawmaterialtype2[id-1]);	
    	rawmaterialtype2[id-1].setVisible(true);
    	for(int i=0;i<=numpaintraw-1;i++)
    	{
    		if(i!=(id-1))
    		{
    		rawmaterialtype2[i].setVisible(false);	
    		}
    	}
		jp14.revalidate();
		jp14.repaint();	
    }
    
    public void refreshbrushmaterial(int id)
    {
    		refreshbrushrawmaterial(id);
    		jp3.add(brushmaterialtype[id-1]);
    		brushmaterialtype[id-1].setVisible(true);
    		for(int i=0;i<=numbrushraw-1;i++)
    		{
    		if(i!=id-1)
    		{
    		brushmaterialtype[i].setVisible(false);
    		}
    		}
    		jp3.revalidate();
    		jp3.repaint();		
    }
    
    public void refreshtable()
    {
    	if(flagadd==1)
    	{
    	jp5.remove(scrollPane);
    	}
    	jp5.revalidate();
    	jp5.repaint();
    }
    
    public void refreshtablepurchase()
    {
    	if(flagadd==1)
    	{
    	jp3.remove(scrollPane);
    	}
    	jp3.revalidate();
    	jp3.repaint();
    }
    
    public void refreshtable1()
    {
    	if(flagadd==1)
    	{
    	jp1.remove(scrollPane);
    	}
    	jp1.revalidate();
    	jp1.repaint();
    }
    
    public void refreshtable2()
    {
    	if(flagadd==1)
    	{
    	jp6.remove(scrollPane);
    	}
    	jp6.revalidate();
    	jp6.repaint();
    }
    
    public void refreshtable3()
    {
    	if(flagadd==1)
    	{
    	jp7.remove(scrollPane);
    	}
    	jp7.revalidate();
    	jp7.repaint();
    }
    
    public void refreshtable4()
    {
    	if(flagadd==1)
    	{
    	jp8.remove(scrollPane);
    	}
    	jp8.revalidate();
    	jp8.repaint();
    }
    
    public void refreshtable5()
    {
    	if(flagadd==1)
    	{
    	jp9.remove(scrollPane);
    	}
    	jp9.revalidate();
    	jp9.repaint();
    }
    
    public void refreshbrushmaterial2(int id)
    {
    		refreshbrushrawmaterial2(id);
    		jp14.add(brushmaterialtype2[id-1]);
    		brushmaterialtype2[id-1].setVisible(true);
    		for(int i=0;i<=numbrushraw-1;i++)
    		{
    		if(i!=id-1)
    		{
    		brushmaterialtype2[i].setVisible(false);
    		}
    		}
    		jp14.revalidate();
    		jp14.repaint();		
    }

    
    public void refreshaddfirm2(String type)
    {	nameoffirm2.removeAllItems();
    nameoffirm4.removeAllItems();
	nameoffirm4.addItem("Select");
    	try
        {
    	String tablename="firmspurchase".concat(type);	
    	String query="select * from ".concat(tablename);
    	ResultSet rs;
    	Statement st1 = conn.createStatement();
    	rs=st1.executeQuery(query);
    	while (rs.next()) 
    	{
			String firmName = rs.getString("firmname");
			nameoffirm2.addItem(firmName);
			nameoffirm4.addItem(firmName);
		}
    	conn.commit();
        }
        catch(Exception e2)
        {
        }
    }
    
    public void refreshmfgitems(String type)
    {
    	String types=null;
    	try
        {
    		if(type.equals("Brush"))
			{
			types="brushes";
			}
			else if(type.equals("Paint"))
			{
				types="paints";
			}
    		brushcombo.removeAllItems();
    		paintcombo.removeAllItems();
    	String tablename="mfg".concat(types);	
    	String query="select * from ".concat(tablename);
    	ResultSet rs;
    	Statement st1 = conn.createStatement();
    	rs=st1.executeQuery(query);
    	while (rs.next()) 
    	{
			String firmName = rs.getString("name");
			if(type.equals("Brush"))
			{
			brushcombo.addItem(firmName);
			}
			else if(type.equals("Paint"))
			{
				paintcombo.addItem(firmName);
			}
    	}
    	conn.commit();
        }
        catch(Exception e2)
        {
        }
    }
    
    public void refreshmfgitems2(String type)
    {
    	String types=null;
    	try
        {
    		if(type.equals("Brush"))
			{
			types="brushes";
			}
			else if(type.equals("Paint"))
			{
				types="paints";
			}
    		brushcombo2.removeAllItems();
    		paintcombo2.removeAllItems();
    	String tablename="mfg".concat(types);	
    	String query="select * from ".concat(tablename);
    	ResultSet rs;
    	Statement st1 = conn.createStatement();
    	rs=st1.executeQuery(query);
    	while (rs.next()) 
    	{
			String firmName = rs.getString("name");
			if(type.equals("Brush"))
			{
			brushcombo2.addItem(firmName);
			}
			else if(type.equals("Paint"))
			{
				paintcombo2.addItem(firmName);
			}
    	}
    	conn.commit();
        }
        catch(Exception e2)
        {
        }
    }
    
    public void refreshpaintrawmaterials(int id)
    {
    	String id2=Integer.toString(id);
    	String tblename="paintrawtype_".concat(id2);
    	try
        {
    	ResultSet rs;
    	Statement st1 = conn.createStatement();
    	String query="select * from ".concat(tblename);
    	rs=st1.executeQuery(query);
    	while (rs.next()) 
    	{
			String firmName = rs.getString("name");
			rawmaterialtype2[id-1].addItem(firmName);
		}
    	conn.commit();
        }
        catch(Exception e2)
        {
        }   	
    }
    
    public void refreshbrushrawmaterial2(int id)
    {
    	String id2=Integer.toString(id);
    	String tblename="brushrawtype_".concat(id2);			
    	try
        {
    	ResultSet rs;
    	Statement st1 = conn.createStatement();
    	String query="select * from ".concat(tblename);
    	rs=st1.executeQuery(query);
    	while (rs.next()) 
    	{
			String firmName = rs.getString("name");
			brushmaterialtype2[id-1].addItem(firmName);
		}
    	conn.commit();
        }
        catch(Exception e2)
        {
        }
    }
    
    public void refreshpaintrawmaterial(int id)
    {
    	String id2=Integer.toString(id);
    	String tblename="paintrawtype_".concat(id2);
    	try
        {
    	ResultSet rs;
    	Statement st1 = conn.createStatement();
    	String query="select * from ".concat(tblename);
    	rs=st1.executeQuery(query);
    	while (rs.next()) 
    	{
			String firmName = rs.getString("name");
			rawmaterialtype[id-1].addItem(firmName);
		}
    	conn.commit();
        }
        catch(Exception e2)
        {
        }   	
    }
    
    public void refreshbrushrawmaterial(int id)
    {
    	String id2=Integer.toString(id);
    	String tblename="brushrawtype_".concat(id2);		
    	try
        {
    	ResultSet rs;
    	Statement st1 = conn.createStatement();
    	String query="select * from ".concat(tblename);
    	rs=st1.executeQuery(query);
    	while (rs.next()) 
    	{
			String firmName = rs.getString("name");
			brushmaterialtype[id-1].addItem(firmName);
		}
    	conn.commit();
        }
        catch(Exception e2)
        {
        }
    }
    
    public void showtabs()
    {
    	jtp.setVisible(true);
    }
    
    private static boolean isPasswordCorrect(char[] inputPassword) 
    {
        char[] actualPassword = { '1' };
        if (inputPassword.length != actualPassword.length)
            return false; // Return false if lengths are unequal
        for (int i = 0; i < inputPassword.length; i++)
            if (inputPassword[i] != actualPassword[i])
                return false;
        return true;
    }
    
    public void checknumraw()
    {
    	String numbrush=null;
    	String numpaint=null;
    	try
        {
    	ResultSet rs;
    	Statement st1 = conn.createStatement();
    	String query="select count(*) as hey from brushrawtype";
    	rs=st1.executeQuery(query);
    	while (rs.next()) 
    	{
			numbrush = rs.getString("hey");
		}
    	conn.commit();
        }
        catch(Exception e2)
        {
        }
    	
    	try
        {
    	ResultSet rs;
    	Statement st1 = conn.createStatement();
    	String query="select count(*) as hey from paintrawtype";
    	rs=st1.executeQuery(query);
    	while (rs.next()) 
    	{
			numpaint = rs.getString("hey");
		}
    	conn.commit();
        }
        catch(Exception e2)
        {
        }
    	numbrushraw=Integer.parseInt(numbrush);
    	numpaintraw=Integer.parseInt(numpaint);
    	
    	 rawmaterialtype= new JComboBox[numpaintraw];
         for(int i=0;i<=numpaintraw-1;i++)
         {
         	rawmaterialtype[i]=new JComboBox();
         }
         rawmaterialtype2= new JComboBox[numpaintraw];
         for(int i=0;i<=numpaintraw-1;i++)
         {
         	rawmaterialtype2[i]=new JComboBox();
         }
         
         rawmaterialtype3= new JComboBox[numpaintraw];
         for(int i=0;i<=numpaintraw-1;i++)
         {
         	rawmaterialtype3[i]=new JComboBox();
         }
         
         brushmaterialtype= new JComboBox[numbrushraw];
         brushmaterialtype2= new JComboBox[numbrushraw];
         brushmaterialtype3= new JComboBox[numbrushraw];
         
         
         for(int i=0;i<=numbrushraw-1;i++)
         {
         	brushmaterialtype[i]=new JComboBox();
         }
        
         for(int i=0;i<=numbrushraw-1;i++)
         {
         	brushmaterialtype2[i]=new JComboBox();
         }
         for(int i=0;i<=numbrushraw-1;i++)
         {
         	brushmaterialtype3[i]=new JComboBox();
         }
         
    }
    
    public void refreshbrush()
    {
    	
    	String name=null;
    	try
        {
    	ResultSet rs;
    	Statement st1 = conn.createStatement();
    	String query="select * from brushrawtype";
    	rs=st1.executeQuery(query);
    	while (rs.next()) 
    	{
			name = rs.getString("name");
			brushrawmaterial.addItem(name);
			brushrawmaterial2.addItem(name);
			brushrawmaterial3.addItem(name);
			brushrawmaterial4.addItem(name);
			
		}
    	conn.commit();
        }
        catch(Exception e2)
        {
        }	
    }
    
    public void refreshpaint()
    {
    	
    	String name=null;
    	try
        {
    	ResultSet rs;
    	Statement st1 = conn.createStatement();
    	String query="select * from paintrawtype";
    	rs=st1.executeQuery(query);
    	while (rs.next()) 
    	{
			name = rs.getString("name");
			rawmaterial.addItem(name);
			rawmaterial2.addItem(name);
			rawmaterial3.addItem(name);
			rawmaterial4.addItem(name);
			
		}
    	conn.commit();
        }
        catch(Exception e2)
        {
        }		
    }

    public void refreshbrush1()
    {
    	brushrawmaterial.removeAllItems();
    	brushrawmaterial2.removeAllItems();
    	brushrawmaterial3.removeAllItems();
    	brushrawmaterial4.removeAllItems();
    	
    	String name=null;
    	try
        {
    	ResultSet rs;
    	Statement st1 = conn.createStatement();
    	String query="select * from brushrawtype";
    	rs=st1.executeQuery(query);
    	while (rs.next()) 
    	{
			name = rs.getString("name");
			brushrawmaterial.addItem(name);
			brushrawmaterial2.addItem(name);
			brushrawmaterial3.addItem(name);
			brushrawmaterial4.addItem(name);
			
		}
    	conn.commit();
        }
        catch(Exception e2)
        {
        }	
    }
    
    public void refreshpaint1()
    {
    	rawmaterial.removeAllItems();
    	rawmaterial2.removeAllItems();
    	rawmaterial3.removeAllItems();
    	rawmaterial4.removeAllItems();
    	
    	String name=null;
    	try
        {
    	ResultSet rs;
    	Statement st1 = conn.createStatement();
    	String query="select * from paintrawtype";
    	rs=st1.executeQuery(query);
    	while (rs.next()) 
    	{
			name = rs.getString("name");
			rawmaterial.addItem(name);
			rawmaterial2.addItem(name);
			rawmaterial3.addItem(name);
			rawmaterial4.addItem(name);
			
		}
    	conn.commit();
        }
        catch(Exception e2)
        {
        }		
    }
}
