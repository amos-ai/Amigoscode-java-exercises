package com.amigoscode._2_developers._4_accessmodifiers;

/**
 * Access Modifiers Demo
 *
 * Demonstrates how different access modifiers behave when accessing members
 * from another class in the SAME package. Complete the AccessModifiers class first.
 */
public class AccessDemo {

    public static void main(String[] args) {
        // TODO: 1 - Create an instance of AccessModifiers.
        AccessModifiers instance = new AccessModifiers();


        System.out.println("=== Calling Public Method ==instance");
        // TODO: 2 - Call the publicGreeting() method on your instance and print the result.
        //  This works because public methods are accessible from anywhere.
        String newGreet = instance.publicGreeting();
        System.out.println(newGreet);

        System.out.println("\n=== Calling Package-Private Method ===");
        // TODO: 3 - Call the packageGreeting() method on your instance and print the result.
        //  This works because AccessDemo is in the SAME package as AccessModifiers.
        String newPackage = instance.packageGreeting();
        System.out.println(newPackage);


        System.out.println("\n=== Accessing Private Field Through Getter ===");
        // TODO: 4 - Use setSecret() to set a value, then use getSecret() to read it back.
        //  Print the result. This demonstrates proper encapsulation:
        //  we access the private field only through public getter/setter methods.
        instance.setSecret("newSeCreT");
        System.out.println(instance.getSecret());


        System.out.println("\n=== Why Direct Private Access Won't Work ===");
        // TODO: 5 - Write a comment explaining why the following line would NOT compile:
        //  // instance.secret = "trying direct access";
        //  Then leave the line commented out, preceded by your explanation.
        //  Hint: think about what 'private' means for field visibility outside the class.

        /*
            This won't work because I'm trying to access it directly from
            another class --> AccessModifier. -- private access is only possible if it's
            within the same class.
        */
        // System.out.println(instance.secret);


    }
}
