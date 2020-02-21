package main;

import org.jsfml.audio.Music;
import org.jsfml.graphics.*;
import org.jsfml.window.VideoMode;
import org.jsfml.window.event.Event;
import java.io.IOException;
import java.nio.file.Paths;
import main.Card.*;

/**
 * This is the short simple example from the front page of the SFML documentation "translated" to JSFML.
 */
public class Begin {
    public static void main(String[] args) throws IOException, TextureCreationException {
        //Create the main window
        RenderWindow window = new RenderWindow(new VideoMode(1800, 1000), "JSFML window");//加载窗口

        //Load a sprite to display
//        Texture texture = new Texture();
//        texture.loadFromFile(Paths.get("resources\\logo.png"));

//        Sprite sprite = new Sprite(texture);

        Sprite sprite1 = (new Card("0\\regenerate.png")).getCard();//卡牌加载
        sprite1.setPosition(300,550);//卡牌防止在屏幕上的位置
        sprite1.rotate(-10);//卡牌旋转角度

        Sprite sprite2 = (new Card("0\\accumulate_energy.png")).getCard();
        sprite2.setPosition(500,500);
        sprite2.rotate(-5);


        Sprite sprite3 = (new Card("0\\alleys.png")).getCard();
        sprite3.setPosition(700,460);
        sprite3.rotate(0);

        Sprite sprite4 = (new Card("0\\Hide_the_sword.png")).getCard();
        sprite4.setPosition(900,460);
        sprite4.rotate(5);

        Sprite sprite5 = (new Card("0\\death_together.png")).getCard();
        sprite5.setPosition(1100,450);
        sprite5.rotate(10);

        //Create a graphical text to display
        Font font = new Font();
        font.loadFromFile(Paths.get("resources\\Nakadai.ttf"));//加载窗口字体

        Text text = new Text("Hello JSFML", font, 50);//设置窗口文字

        //Load a music to play
        Music music = new Music();
        music.openFromFile(Paths.get("resources\\bg.flac"));

        //Play the music
        music.play();

        //Start the game loop

        while (window.isOpen()) {
//            Process events
            //Clear screen
            window.clear();

            //Draw the sprite
            window.draw(sprite1);
            window.draw(sprite2);
            window.draw(sprite3);
            window.draw(sprite4);
            window.draw(sprite5);

            //Draw the string
            window.draw(text);


            //Update the window
            window.display();

            Event event = window.pollEvent();//进行
            while (event != null) {
                //Close window : exit
                if (event.type == Event.Type.CLOSED)
                    window.close();
                else{
                    break;
                }
            }
        }
    }
}