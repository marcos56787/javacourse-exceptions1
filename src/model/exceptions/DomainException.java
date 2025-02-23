package model.exceptions;

public class DomainException extends RuntimeException{

    public DomainException(String msg){ //creating a constructor with arguments, bcs that way we CAN use arguments
        super(msg); //i'm allowing to use a custom message by taking the super-class constructor as a support.
    }
}
