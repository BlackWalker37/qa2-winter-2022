package hw1;

public class ObjectHomeWork {
    public void doingHomeWork () {
       CreditCard myCreditCard = new CreditCard();

       myCreditCard.setCardNumber(1235678123);
       myCreditCard.setBankName("Swedbank");
       myCreditCard.setSecurityCode(123);

       Envelope myEnvelope = new Envelope();

       myEnvelope.setHeight(8.00);
       myEnvelope.setEmpty(true);
       myEnvelope.setMaterial("Paper");

       Keyboard myKeyboard = new Keyboard();

       myKeyboard.setBrand("Gigabyte");
       myKeyboard.setColor("Black");
       myKeyboard.setNumberOfKeys(120);

       Monitor myMonitor = new Monitor();

       myMonitor.setBrand("Rog Swift");
       myMonitor.setFrequency(320.00);
       myMonitor.setScreenDiagonal(27.00);

       Notepad myNotepad = new Notepad();

       myNotepad.setLength(21.20);
       myNotepad.setPrice(3.60);
       myNotepad.setNumberOfPages(300);

       PackOfPills myPackOfPills = new PackOfPills();

       myPackOfPills.setColor("White");
       myPackOfPills.setBrand("Walmark");
       myPackOfPills.setAmount(50);

       Ruler myRuler = new Ruler();

       myRuler.setLength(30.50);
       myRuler.setColor("White");
       myRuler.setWeight(40.00);

       Scissors myScissors = new Scissors();

       myScissors.setSharp(true);
       myScissors.setMetallic(true);
       myScissors.setBrand("Scisserinos");

       Smartphone mySmartphone = new Smartphone();

       mySmartphone.setBrand("Iphone");
       mySmartphone.setCameraCount(2);
       mySmartphone.setMemorySize(64.00);

       UniversalSerialBus myUSB = new UniversalSerialBus();

       myUSB.setMemoryStorageCapacity(240);
       myUSB.setColor("Black");
       myUSB.setBrand("Kingsman");

       System.out.println("Dima is a great lecturer");
       System.out.println(myCreditCard.getCardNumber());
       System.out.println(myCreditCard.getBankName());

       System.out.println(myEnvelope.getHeight());
       System.out.println(myEnvelope.isEmpty());
       System.out.println(myEnvelope.getMaterial());

       System.out.println(myKeyboard.getBrand());
       System.out.println(myKeyboard.getNumberOfKeys());
       System.out.println(myKeyboard.getColor());

       System.out.println(myMonitor.getBrand());
       System.out.println(myMonitor.getScreenDiagonal());
       System.out.println(myMonitor.getFrequency());

       System.out.println(myNotepad.getLength());
       System.out.println(myNotepad.getPrice());
       System.out.println(myNotepad.getNumberOfPages());

       System.out.println(myPackOfPills.getBrand());
       System.out.println(myPackOfPills.getAmount());
       System.out.println(myPackOfPills.getColor());

       System.out.println(myRuler.getLength());
       System.out.println(myRuler.getColor());
       System.out.println(myRuler.getWeight());

       System.out.println(myScissors.getBrand());
       System.out.println(myScissors.isMetallic());
       System.out.println(myScissors.isSharp());

       System.out.println(mySmartphone.getBrand());
       System.out.println(mySmartphone.getCameraCount());
       System.out.println(mySmartphone.getMemorySize());

       System.out.println(myUSB.getBrand());
       System.out.println(myUSB.getColor());
       System.out.println(myUSB.getMemoryStorageCapacity());



    }
}
