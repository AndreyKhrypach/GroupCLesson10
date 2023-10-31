public class OuterClass {
    private int x = 10;

    class InnerClass {
        private int y = 5;
        void sum(){
            System.out.println(x +y);
        }
    }

    void sum(){
        System.out.println(x +new InnerClass().y);
    }

    //    static class InnerClass{
    //        public int y = 5;
    //
    //        public InnerClass(int y) {
    //            this.y = y;
    //        }
    //
    //        public InnerClass() {
    //        }


//    class InnerClass {
//        public int myInnerMethod() {
//            return x;
//        }
//    }
}
