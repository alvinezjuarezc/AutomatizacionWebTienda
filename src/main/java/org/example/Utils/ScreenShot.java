package org.example.Utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenShot {

    // Toma la foto y la guarda en la carpeta que le digas
    public static String captureScreenshot(WebDriver driver, String folder, String screenName) {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String screenShotPath = System.getProperty("user.dir") + "/" + folder + "/evidencia_" + getCurrentDateTime() + "_" + screenName + ".png";
        try {
            FileHandler.copy(src, new File(screenShotPath));
        } catch (IOException e) {
            System.out.println("unable to capture screenshot " + e.getMessage());
        }
        return screenShotPath;
    }

    // Crea el nombre con fecha y hora, ejemplo: 26-11-2026_15-30-10
    public static String getCurrentDateTime() {
        DateFormat customFormat = new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss");
        Date currentDate = new Date();
        return customFormat.format(currentDate);
    }

    // Devuelve la ruta completa dentro de tu proyecto
    public static String getResourcePath(String path) {
        String basePath = System.getProperty("user.dir");
        return basePath + "/" + path;
    }

    // Crea la carpetita de evidencias si no existe
    public static void createFolder(String FolderName) {
        String newFolderName = getResourcePath(FolderName);
        File f1 = new File(newFolderName);
        if (!f1.exists()) {
            f1.mkdirs();
        }
    }
}