package com.company;

public class ComplicatedObject {

        private int a;
        private String b;
        private boolean c;


        private ComplicatedObject(Builder builder){

            this.a = builder.a;
            this.b = builder.b;
            this.c = builder.c;

        }


        public static class Builder {

            private int a;
            private String b;
            private boolean c;

            public Builder(String b){
                this.b = b;
            }

            public Builder a(int a){
                this.a = a;
                return this;
            }

            public Builder b(String b){
                this.b = b;
                return this;
            }

            public Builder c(boolean c){
                this.c = c;
                return this;
            }

            public ComplicatedObject build(){
                return new ComplicatedObject(this);
            }


        }

//    public ComplicatedObject(){
//
//    }
//
//    public ComplicatedObject(int a){
//        this.a = a;
//    }
//
//    public ComplicatedObject(int a, String b){
//        this.a = a;
//        this.b = b;
//    }
//
//    public ComplicatedObject(int a, String b, boolean c){
//        this.a = a;
//        this.b = b;
//        this.c = c;
//    }

        @Override
        public String toString(){
            return a + ", " + b + ", " + c;
        }

        public static void main(String[] args){
            ComplicatedObject.Builder builder = new ComplicatedObject.Builder("a");

            //chain
            ComplicatedObject o = builder.a(3).b("sss").c(true).build();

            System.out.print(o);
        }



}



