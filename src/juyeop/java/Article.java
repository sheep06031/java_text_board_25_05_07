package juyeop.java;

public class Article {
    int id;
    String title;
    String content;

    Article(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString(){
        return String.format("{id : %d, title : \"%s\", content : \"%s\"}",id,title,content);
    }

    public String getTitle(){
        return title;
    }

    public String getContent(){
        return content;
    }
}
