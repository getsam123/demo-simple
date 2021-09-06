package demo;

import org.jvnet.hk2.annotations.Service;

@Service
public class Driver {
    public void run(){
        System.out.println("Running Driver");
    }
}
