package pdp.uz;

import pdp.uz.model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Storage {
    public static List<Category> categories=new ArrayList<>();
    public static HashMap<Chat, List<Message>> messages=new HashMap<>();
    public static List<Post> posts=new ArrayList<>();
    public static List<Report> reports=new ArrayList<>();
    public static List<User> users=new ArrayList<>();
}
