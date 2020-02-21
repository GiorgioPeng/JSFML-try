package main.Card;

import org.jsfml.graphics.Sprite;
import org.jsfml.graphics.Texture;
import org.jsfml.graphics.TextureCreationException;

import java.io.IOException;
import java.nio.file.Paths;

public class Card {
    private Sprite card;
    public Card(String cardName) throws IOException, TextureCreationException {
        Texture texture = new Texture();
        texture.loadFromFile(Paths.get("resources\\"+cardName));
        card = new Sprite(texture);
        card.scale(0.5f, 0.5f);//缩放图片
    }
    public Sprite getCard(){
        return card;
    }
}
