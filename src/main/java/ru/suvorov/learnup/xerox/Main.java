package ru.suvorov.learnup.xerox;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            writeImage(readImage(args[0]), args[1]);
        } catch (IOException e) {
            System.out.println("Отсутствует доступ к ресурсу/файл не найден!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Неверно указаны/не указаны параметры, инструкция - \"java \'полное имя файла программы\'" +
                    " \'полное имя файла источника\' \'полное имя нового файла\'\"");
        }

    }

    static BufferedImage readImage(String filename) throws IOException {
        return ImageIO.read(new File(filename));
    }

    static void writeImage(BufferedImage sourceImage, String newFilename) throws IOException {
        ImageIO.write(sourceImage, "jpg", new File(newFilename));
    }

}
