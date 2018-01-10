package models;
import javax.print.DocFlavor;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;



public class Post {
    private String content;
    private static ArrayList<Post> instances = new ArrayList<>();
    private static boolean published;
    private LocalDateTime createdAt;
    private int id;

    public Post (String content){
        instances.add(this);
        this.content = content;
        this.published = false;
        this.createdAt = LocalDateTime.now();
        this.id = instances.size();
    }

    public String getContent() {
        return content;
    }

    public static ArrayList<Post> getAll(){
        return instances;
    }

    public static void clearAllPosts(){
        instances.clear();
    }

    public static boolean getPublished() {
        return published;
    }

    public LocalDateTime getCreatedAt(){
        return createdAt;
    }

    public int getId() {
        return id;
    }

    public static Post findById(int id){
        return instances.get(id-1);
    }

    public void update(String content) {
        this.content = content;
    }

    public void deletePost() {
        instances.remove(id-1);
    }

    public boolean getFirstPost() {
        if (this.id == this.instances.size()) {
            return true;

        } else {
            return false;
        }
    }

}
