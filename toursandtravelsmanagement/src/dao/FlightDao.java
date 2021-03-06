package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import pojo.FlightBook;
import util.TourUtil;

public class FlightDao {

	public int saveFlightbook(FlightBook fb) {
		int status = 0;
		try {
			Connection con = TourUtil.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into flight_book(from_loc, to_loc, departure_date, no_passengers, class,customer_id) values(?, ?, ?, ?, ?,?)");
			 ps.setString(1, fb.getFrom_loc());
			 ps.setString(2, fb.getTo_loc());
			 ps.setDate(3, fb.getDeparture_date());
			 ps.setInt(4, fb.getNo_passengers());
			 ps.setString(5, fb.getF_class());
			 ps.setInt(6, fb.getCust_id());
			
			 status = ps.executeUpdate();
		}
		catch(Exception ex) {}
		return status;
	}

	public static List<FlightBook> getbycustid(int cust_id) {
		List<FlightBook> list = new ArrayList<FlightBook>();
		try {
			 Connection con = TourUtil.getConnection();
			 PreparedStatement ps=con.prepareStatement(  
					    "select * from flight_book where customer_id=?");
			 ps.setInt(1,cust_id);
			 ResultSet rs = ps.executeQuery();
			 while(rs.next()) 
			 {
				 FlightBook fb = new FlightBook();
				 fb.setFbook_id(rs.getInt(1));
				 fb.setFrom_loc(rs.getString(2));
				 fb.setTo_loc(rs.getString(3));
				 fb.setDeparture_date(rs.getDate(4));
				 fb.setNo_passengers(rs.getInt(5));
				 fb.setF_class(rs.getString(6));
				 fb.setCust_id(rs.getInt(7));
				 
				 list.add(fb);
			 }
			 
			 
		}catch (Exception e) {System.out.println(e);}
		return list;
		
	}

	public static int delete(int id) {
		int status=0;
		try {
			Connection con = TourUtil.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from flight_book where fbook_id=?");
			 ps.setInt(1,id);
			
			 status = ps.executeUpdate();
		}
		catch(Exception ex) {}
		return status;// TODO Auto-generated method stub
		
	}
}
