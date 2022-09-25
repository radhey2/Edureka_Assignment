package module4;

public interface QueueInterface {

    default void insert() {

        System.out.println("Insert Method of InterFace");

    }

    default void delete() {
        System.out.println("Delete Method of InterFace");
    }
}
