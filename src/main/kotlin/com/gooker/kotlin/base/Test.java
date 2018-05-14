package com.gooker.kotlin.base;

public class Test {

    public interface A {
        int x();
    }

    interface B {
        int x();
    }

    abstract class D {
        abstract int x();
    }

    class E extends D implements A, B {

        private int y;

        public E(int y) {
            this.y = y;
        }

        @Override
        public int x() {
            if (y > 0) {
//                return ;
            }
            return 0;
        }
    }


    public static void main(String... args) {

    }

}
