package com.demo.management.mcp;

import com.demo.management.entity.Guest;
import com.demo.management.entity.Room;
import com.demo.management.service.GuestService;
import com.demo.management.service.RoomService;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class McpController {
    @Autowired
    private GuestService guestService;
    @Autowired
    private RoomService roomService;

    @Tool(description = "This is for Registering new guests")
    public Guest registerGuest(String name, String phone, Room room) {
        Guest guest = new Guest();
        guest.setName(name);
        guest.setPhone(phone);
        guest.setRoom(room);
        return guestService.saveGuest(guest);
    }

    @Tool(description = "This is for creating a new room")
    public Room createRoom(int number, double price) {
        Room room = new Room();
        room.setNumber(number);
        room.setPrice(price);
        return roomService.saveRoom(room);
    }
}
