package model;

public class Room implements IRoom {
    private String RoomNumber;
    private Double price;
    private RoomType enumeration;


    @Override
    public String getRoomNumber() {
        return RoomNumber;
    }

    @Override
    public Double getRoomPrice() {
        return price;
    }

    @Override
    public RoomType getRoomType() {
        return enumeration;
    }

    @Override
    public boolean isFree() {
        return false;
    }

    @Override
    public String toString() {
        return "Room{" +
                "RoomNumber='" + RoomNumber + '\'' +
                ", price=" + price +
                ", enumeration=" + enumeration +
                '}';
    }
}
