/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowershopmanagementsystem;

import java.sql.Date;

/**
 *
 * @author MarcoMan
 * 
 * Channel: https://www.youtube.com/channel/UCPgcmw0LXToDn49akUEJBkQ
 */
public class flowersData {
    
    private final Integer flowerId;
    private final String name;
    private final String status;
    private final Double price;
    private final Date date;
    private final String image;
    
    public flowersData(Integer flowerId, String name, String status, Double price
            , String image, Date date){
        this.flowerId = flowerId;
        this.name = name;
        this.status = status;
        this.price = price;
        this.date = date;
        this.image = image;
    }
    
    public Integer getFlowerId(){
        return flowerId;
    }
    public String getName(){
        return name;
    }
    public String getStatus(){
        return status;
    }
    public Double getPrice(){
        return price;
    }
    public Date getDate(){
        return date;
    }
    public String getImage(){
        return image;
    }
    
}
