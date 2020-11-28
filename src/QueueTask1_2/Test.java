package QueueTask1_2;

public class Test {

    public static void main(String[] args) {

        ArrayQueueModule AQM = new ArrayQueueModule();
        AQM.enqueue("Мяч");
        AQM.enqueue("Стул");
        AQM.enqueue("Стол");
        AQM.enqueue("Компьютер");
        AQM.enqueue("Собака");
        System.out.println(AQM.dequeue().toString());
        System.out.println(AQM.dequeue().toString());
        AQM.enqueue("Телевизор");
        System.out.println(AQM.dequeue().toString() + "\n");
        System.out.println(AQM.isEmpty());
        AQM.clear();
        System.out.println(AQM.isEmpty() + "\n\n");


        ArrayQueueADT AQADT = new ArrayQueueADT(10);
        AQADT.enqueue(AQADT,7);
        AQADT.enqueue(AQADT,5);
        AQADT.enqueue(AQADT,3);
        System.out.println(AQADT.dequeue(AQADT).toString());
        System.out.println(AQADT.dequeue(AQADT).toString());
        AQADT.enqueue(AQADT,6);
        System.out.println(AQADT.dequeue(AQADT).toString() + "\n\n");

        ArrayQueue AQ = new ArrayQueue(10);
        AQ.enqueue(1);
        AQ.enqueue(10);
        AQ.enqueue(20);
        System.out.println(AQ.dequeue().toString());
        System.out.println(AQ.dequeue().toString());
        AQ.enqueue(25);
        System.out.println(AQ.dequeue().toString() + "\n\n");


        LinkedQueue LQ = new LinkedQueue(10);
        LQ.enqueue(true);
        LQ.enqueue(false);
        LQ.enqueue(false);
        System.out.println(LQ.dequeue().toString());
        System.out.println(LQ.dequeue().toString());
        LQ.enqueue(true);
        System.out.println(LQ.dequeue().toString() + "\n\n");

    }

}
