/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE LANDING_MAP PACKING
package com.MAVLink.common;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;

import MAVLink.MAVLinkPacket;
        
/**
* Quality data about specific landing positions
*/
public class msg_landing_map extends MAVLinkMessage{

    public static final int MAVLINK_MSG_ID_LANDING_MAP = 240;
    public static final int MAVLINK_MSG_LENGTH = 201;
    private static final long serialVersionUID = MAVLINK_MSG_ID_LANDING_MAP;


      
    /**
    * Timestamp (micros since boot or Unix epoch)
    */
    public long time_usec;
      
    /**
    * Best landing position on X-axis
    */
    public float best_x;
      
    /**
    * Best landing position on Y-axis
    */
    public float best_y;
      
    /**
    * Best landing position on Z-axis
    */
    public float best_z;
      
    /**
    * Position on X-axis
    */
    public float local_x;
      
    /**
    * Position on Y-axis
    */
    public float local_y;
      
    /**
    * Position on Z-axis
    */
    public float local_z;
      
    /**
    * LSB 0-2: Score between 0 and 7, LSB 3-7: Distance to the vehicle in meters.
    */
    public short factors[] = new short[169];
    

    /**
    * Generates the payload for a mavlink message for a message of this type
    * @return
    */
    public MAVLinkPacket pack(){
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_LANDING_MAP;
              
        packet.payload.putUnsignedLong(time_usec);
              
        packet.payload.putFloat(best_x);
              
        packet.payload.putFloat(best_y);
              
        packet.payload.putFloat(best_z);
              
        packet.payload.putFloat(local_x);
              
        packet.payload.putFloat(local_y);
              
        packet.payload.putFloat(local_z);
              
        
        for (int i = 0; i < factors.length; i++) {
            packet.payload.putUnsignedByte(factors[i]);
        }
                    
        
        return packet;
    }

    /**
    * Decode a landing_map message into this class fields
    *
    * @param payload The message to decode
    */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
              
        this.time_usec = payload.getUnsignedLong();
              
        this.best_x = payload.getFloat();
              
        this.best_y = payload.getFloat();
              
        this.best_z = payload.getFloat();
              
        this.local_x = payload.getFloat();
              
        this.local_y = payload.getFloat();
              
        this.local_z = payload.getFloat();
              
         
        for (int i = 0; i < this.factors.length; i++) {
            this.factors[i] = payload.getUnsignedByte();
        }
                
        
    }

    /**
    * Constructor for a new message, just initializes the msgid
    */
    public msg_landing_map(){
        msgid = MAVLINK_MSG_ID_LANDING_MAP;
    }

    /**
    * Constructor for a new message, initializes the message with the payload
    * from a mavlink packet
    *
    */
    public msg_landing_map(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_LANDING_MAP;
        unpack(mavLinkPacket.payload);        
    }

                    
    /**
    * Returns a string with the MSG name and data
    */
    public String toString(){
        return "MAVLINK_MSG_ID_LANDING_MAP -"+" time_usec:"+time_usec+" best_x:"+best_x+" best_y:"+best_y+" best_z:"+best_z+" local_x:"+local_x+" local_y:"+local_y+" local_z:"+local_z+" factors:"+factors+"";
    }
}
        