/**
 *  Storing and printing messages.
 */

package com.messages;

import java.util.ArrayList;
import java.util.List;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Collection to store messages.
        List<TextMessage> messages = new ArrayList<>();

        TextMessage message = new TextMessage("Jack", "Hello!");
        TextMessage message1 = new TextMessage("Betty", "Hi.");
        TextMessage message2 = new TextMessage("Jack", "How are you?");
        TextMessage message3 = new TextMessage("Betty", "Good. Thanks. And you?");
        TextMessage message4 = new TextMessage("Jack", "Thanks. Not bad.");

        // Adding messages to storage.
        messages.add(message);
        messages.add(message1);
        messages.add(message2);
        messages.add(message3);
        messages.add(message4);

        // Printing messages.
        for (TextMessage msg : messages) {
            System.out.println(msg);
        }

        // Printing messages using method read.
        for (Readable msg : messages) {
            System.out.println(msg.read());
        }

    }
}