package pojo;
// Generated Apr 11, 2016 1:26:09 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Line generated by hbm2java
 */
public class Line  implements java.io.Serializable {


     private int lineId;
     private Ship ship;
     private String lineName;
     private Date startDate;
     private Set readers = new HashSet(0);

    public Line() {
    }

	
    public Line(int lineId) {
        this.lineId = lineId;
    }
    public Line(int lineId, Ship ship, String lineName, Date startDate, Set readers) {
       this.lineId = lineId;
       this.ship = ship;
       this.lineName = lineName;
       this.startDate = startDate;
       this.readers = readers;
    }
   
    public int getLineId() {
        return this.lineId;
    }
    
    public void setLineId(int lineId) {
        this.lineId = lineId;
    }
    public Ship getShip() {
        return this.ship;
    }
    
    public void setShip(Ship ship) {
        this.ship = ship;
    }
    public String getLineName() {
        return this.lineName;
    }
    
    public void setLineName(String lineName) {
        this.lineName = lineName;
    }
    public Date getStartDate() {
        return this.startDate;
    }
    
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Set getReaders() {
        return this.readers;
    }
    
    public void setReaders(Set readers) {
        this.readers = readers;
    }




}

