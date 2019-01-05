package Main;

import javafx.scene.image.Image;

public class Products {
    private int price;
    private Image img;

    public Products(int price, Image img) {
        this.price = price;
        this.img = img;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }
}
