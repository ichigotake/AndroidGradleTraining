package net.ichigotake.training.android.gradle;

/**
 * {@link BuildConfig} への参照は、各所で直接せずにメソッド経由にしておくとよい
 * そうしておくと、 {@link BuildConfig} を利用しない参照法への移行もスムーズになる
 */
public class ApplicationConfig {

    public static String getAuthorName() {
        return BuildConfig.AUTHOR_NAME;
    }

    public static boolean isDevelopmentMode() {
        return BuildConfig.DEVELOPMENT;
    }
}
