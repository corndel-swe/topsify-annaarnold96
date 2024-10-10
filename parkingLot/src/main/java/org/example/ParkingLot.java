package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ParkingLot {
    private int totalSmallSpots;
    private int totalMedSpots;
    private int totalLargeSpots;
    private int remainingSmallSpots;
    private int remainingMedSpots;
    private int remainingLargeSpots;
    private int totalSpots;

    public ParkingLot(int smallSpots, int medSpots, int largeSpots) {
        this.totalSmallSpots = smallSpots;
        this.remainingSmallSpots = smallSpots;

        this.totalMedSpots = medSpots;
        this.remainingMedSpots = medSpots;

        this.totalLargeSpots = largeSpots;
        this.remainingLargeSpots = largeSpots;

        this.totalSpots = totalSmallSpots + totalMedSpots + totalLargeSpots;

    }

    public int totalRemainingSpots(){
        return remainingSmallSpots + remainingMedSpots + remainingLargeSpots;
    }

    public boolean isLotFull(){
        return totalRemainingSpots() == 0;
    }

    public boolean isLotEmpty(){
        return this.totalSpots == totalRemainingSpots();
    }

    public String getRemaining() {
        return String.format("There are %d total spots remaining.\n" +
                "There are %d large, %d medium and %d small left.",totalRemainingSpots(),remainingLargeSpots,remainingMedSpots,remainingSmallSpots);
    }

    public boolean areVehicleSpotsFull(String spotSize){
            if (spotSize.equals("small")) {
                return remainingSmallSpots == 0;
            } else if (spotSize.equals("medium")) {
                return remainingMedSpots == 0;
            } else if (spotSize.equals("large")) {
                return remainingLargeSpots == 0;
            }
            else{
                System.out.println("oops.");
                throw new RuntimeException();
            }
    }


    public static void main(String[] args) {

        ParkingLot parkingLot = new ParkingLot(5, 5, 5);
        System.out.println(parkingLot.getRemaining());

        parkingLot.remainingMedSpots = 4;
        System.out.println(parkingLot.getRemaining());

        }
    }