public class First_test {
    //繼承是子類別將父類別裡的資料成員與方法成員都擁有，介面是將方法宣告出來但是沒有方法敘述段，必須由實作implement來完成方法敘述段
    //相同點是資料成員都完整擁有


    //這是繼承

    class Car1
    {
        int tire1 = 2;
        Car1()
        {
            System.out.println("機車的輪胎有"+tire1+"個!");
        }
    }

    class Car2 extends Car1
    {
        int tire2 = 4;
        Car2()
        {
            System.out.println("汽車的輪胎有"+tire2+"個!");
        }
    }

    public class Car
    {
        public static void main(String[] args)
        {
            Car2 C = new Car2();
        }
    }

    //這是介面
    interface Car1
    {
        int tire1 = 2; //機車輪胎
        int tire2 = 4; //汽車輪胎
        public void cshow();
    }

    class Car2 implements Car1
    {
        public void cshow()
        {
            System.out.println("機車的輪胎有"+tire1+"個!");
            System.out.println("汽車的輪胎有"+tire2+"個!");
        }
    }

    public class Car
    {
        public static void main(String[] args)
        {
            Car2 C = new Car2();
            C.cshow();
        }
    }
}
