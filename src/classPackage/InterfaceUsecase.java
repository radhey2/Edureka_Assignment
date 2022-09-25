package classPackage;

import module4.QueueInterface;

public class InterfaceUsecase {
    public static void main(String[] args) {
        Iface obj = new Iface();
        obj.insert();
        obj.delete();
    }
}

class Iface implements QueueInterface {

    @Override
    public void delete() {
        System.out.println("Delete Method Override");
    }

}