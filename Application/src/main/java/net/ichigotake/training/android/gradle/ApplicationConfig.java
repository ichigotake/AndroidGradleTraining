package net.ichigotake.training.android.gradle;

public class ApplicationConfig {

    public static String getAuthorName() {
        //TODO: ビルドする人によって切り替えたい
        return "Taro";
    }

    public static boolean isDevelopmentMode() {
        //TODO: ビルドの種類によって自動で切り替えたい
        return true;
    }
}
