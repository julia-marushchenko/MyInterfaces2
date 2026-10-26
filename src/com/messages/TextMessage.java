package com.messages;

import java.util.Objects;

/**
 *  TextMessage class.
 */
public class TextMessage implements Readable{

    private String sender;
    private String content;

    // Constructor.
    public TextMessage(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }

    // Read() method.
    @Override
    public String read() {
        return this.content;
    }

    // Getters and setters.
    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    // Equals, hashCode, and toString methods.
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TextMessage that = (TextMessage) o;
        return Objects.equals(sender, that.sender) && Objects.equals(content, that.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sender, content);
    }

    @Override
    public String toString() {
        return "TextMessage { sender = " + sender + ", content = " + content + " }";
    }

}
