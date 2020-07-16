package java11;

public class NestedAccessControl {

    public void myPublic() {
    }
 
    private void myPrivate() {
    }
 
    class Nested {
 
        public void nestedPublic() {
            myPrivate();
        }
    }
    
    //private method of the main class is accessible from the above-nested class in the above manner.
    //But if we use Java Reflection, it will give an IllegalStateException.

    //Method method = ob.getClass().getDeclaredMethod("myPrivate");
    //method.invoke(ob);
    //Java 11 nested access control addresses this concern in reflection.
    //java.lang.Class introduces three methods in the reflection API: getNestHost(), getNestMembers(), and isNestmateOf().

}
