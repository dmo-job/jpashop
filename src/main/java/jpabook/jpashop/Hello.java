package jpabook.jpashop;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Hello {
    private String data;

    public void sayHello(){
        System.out.println("This is public say hello");
    }
}
