package kata5p1;

import java.io.File;
import java.sql.SQLException;

public class Kata5P1 {
    public static void main(String[] args) throws SQLException {
       FlightIterable F = new SqliteFlightBD(new File("flights.db"));
       for (Flight flight :F.flights()) System.out.println(flight.toString());         
    }
    
}
