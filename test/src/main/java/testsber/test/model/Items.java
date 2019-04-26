package testsber.test.model;

public class Items {
    private int id;
    private String Article;
    private String Name;
    private int Shelf;
    private String Box;

    @Override
    public String toString() {
        return  id + " " +
                Article + ' ' +
                Name + ' ' +
                Shelf + ' ' +
                Box;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArticle() {
        return Article;
    }

    public void setArticle(String article) {
        Article = article;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getShelf() {
        return Shelf;
    }

    public void setShelf(int shelf) {
        Shelf = shelf;
    }

    public String getBox() {
        return Box;
    }

    public void setBox(String box) {
        Box = box;
    }
}
