package com.tencent.p014mm.sdk.platformtools;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import android.util.DisplayMetrics;
import java.util.Locale;

/* renamed from: com.tencent.mm.sdk.platformtools.LocaleUtil */
public final class LocaleUtil {
    public static final String ARABIC = "ar";
    public static final String CHINA = "zh_CN";
    public static final String ENGLISH = "en";
    public static final String FRENCH = "fr";
    public static final String GERMAN = "de";
    public static final String HONGKONG = "zh_HK";
    public static final String INDONESIAN = "id";
    public static final String INDONESIAN_NEWNAME = "in";
    public static final String ITALIAN = "it";
    public static final String JAPANESE = "ja";
    public static final String KOREAN = "ko";
    public static final String LANGUAGE_DEFAULT = "language_default";
    public static final String LANGUAGE_KEY = "language_key";
    public static final String LAO = "lo";
    public static final String MALAY = "ms";
    public static final String MYANMAR = "my";
    public static final String PORTUGUESE = "pt";
    public static final String RUSSIAN = "ru";
    public static final String SPANISH = "es";
    private static final String TAG = "MicroMsg.LocaleUtil";
    public static final String TAIWAN = "zh_TW";
    public static final String THAI = "th";
    public static final String TURKEY = "tr";
    public static final String VIETNAMESE = "vi";
    public static final String _LANGUAGE_DEFAULT = "language_default";
    public static Locale sysDefaultLocale;

    static {
        loadCurrentSystemLocale();
    }

    private LocaleUtil() {
    }

    private static String filterLanguage(String str) {
        String trim = Locale.getDefault().getLanguage().trim();
        String str2 = trim + "_" + Locale.getDefault().getCountry().trim();
        return trim.equals("en") ? trim : str2.equals("zh_TW") ? "zh_TW" : str2.equals("zh_HK") ? "zh_HK" : str2.equals("zh_CN") ? "zh_CN" : WeChatSomeFeatureSwitch.temporaryBlockMinorLanguage() ? str : trim.equals(THAI) ? THAI : (!trim.equals("id") && !trim.equals(INDONESIAN_NEWNAME)) ? trim.equals(VIETNAMESE) ? VIETNAMESE : trim.equals(PORTUGUESE) ? PORTUGUESE : trim.equals(SPANISH) ? SPANISH : trim.equals(RUSSIAN) ? RUSSIAN : trim.equals(ARABIC) ? ARABIC : trim.equals(JAPANESE) ? JAPANESE : trim.equals(ITALIAN) ? ITALIAN : trim.equals(KOREAN) ? KOREAN : trim.equals(MALAY) ? MALAY : trim.equals(TURKEY) ? TURKEY : trim.equals(GERMAN) ? GERMAN : trim.equals(FRENCH) ? FRENCH : trim.equals(MYANMAR) ? MYANMAR : trim.equals(LAO) ? LAO : str : "id";
    }

    public static String getApplicationLanguage() {
        String nullAsNil = Util.nullAsNil(SystemProperty.getProperty(LANGUAGE_KEY));
        return (nullAsNil.length() <= 0 || nullAsNil.equals("language_default")) ? filterLanguage("en") : nullAsNil;
    }

    public static String getCurrentCountryCode() {
        return Locale.getDefault().getCountry().trim();
    }

    public static String getCurrentLanguage(Context context) {
        String str;
        try {
            str = loadApplicationLanguageSettings(context.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0), context);
        } catch (Throwable th) {
            Log.printErrStackTrace(TAG, th, "getCurrentLanguage error", new Object[0]);
            str = "language_default";
        }
        return str.equalsIgnoreCase("language_default") ? getApplicationLanguage() : str;
    }

    public static String getLanguageName(Context context, int i, int i2) {
        String[] stringArray = context.getResources().getStringArray(i);
        String loadApplicationLanguageSettings = loadApplicationLanguageSettings(context.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0), context);
        if (loadApplicationLanguageSettings == null) {
            return context.getString(i2);
        }
        int i3 = 0;
        for (String equals : LocaleGen.LOCALES) {
            if (equals.equals(loadApplicationLanguageSettings)) {
                return stringArray[i3];
            }
            i3++;
        }
        return context.getString(i2);
    }

    public static Locale initLanguage(Context context) {
        String loadApplicationLanguage = loadApplicationLanguage(context.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0), context);
        if (loadApplicationLanguage.equals("language_default")) {
            updateApplicationResourceLocale(context, Locale.ENGLISH);
            return Locale.getDefault();
        }
        Locale transLanguageToLocale = transLanguageToLocale(loadApplicationLanguage);
        updateApplicationResourceLocale(context, transLanguageToLocale);
        return transLanguageToLocale;
    }

    public static boolean isChineseAppLang() {
        String applicationLanguage = getApplicationLanguage();
        return applicationLanguage.equals("zh_CN") || applicationLanguage.equals("zh_TW") || applicationLanguage.equals("zh_HK");
    }

    public static boolean isChineseSysLang() {
        return Locale.getDefault().equals(Locale.CHINA) || Locale.getDefault().equals(Locale.TAIWAN) || Locale.getDefault().toString().startsWith(Locale.CHINESE.toString());
    }

    public static boolean isLanguageSupported(String str) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        return str.equalsIgnoreCase("zh_TW") || str.equalsIgnoreCase("zh_HK") || str.equalsIgnoreCase("zh_CN") || str.equalsIgnoreCase("en") || str.equalsIgnoreCase(THAI) || str.equals("id") || str.equals(INDONESIAN_NEWNAME) || str.equals(VIETNAMESE) || str.equalsIgnoreCase(PORTUGUESE) || str.equalsIgnoreCase(SPANISH) || str.equalsIgnoreCase(RUSSIAN) || str.equalsIgnoreCase(ARABIC) || str.equalsIgnoreCase(JAPANESE) || str.equalsIgnoreCase(ITALIAN) || str.equalsIgnoreCase(KOREAN) || str.equalsIgnoreCase(MALAY) || str.equalsIgnoreCase(TURKEY) || str.equalsIgnoreCase(GERMAN) || str.equalsIgnoreCase(FRENCH) || str.equalsIgnoreCase(MYANMAR) || str.equalsIgnoreCase(LAO);
    }

    public static boolean isSimplifiedChineseAppLang() {
        return getApplicationLanguage().equals("zh_CN");
    }

    public static boolean isTraditionalChineseAppLang() {
        return getApplicationLanguage().equals("zh_TW") || getApplicationLanguage().equals("zh_HK");
    }

    public static String loadApplicationLanguage(SharedPreferences sharedPreferences, Context context) {
        String nullAsNil = Util.nullAsNil(sharedPreferences.getString(LANGUAGE_KEY, (String) null));
        if (nullAsNil.length() <= 0 || nullAsNil.equals("language_default")) {
            String filterLanguage = filterLanguage("en");
            SystemProperty.setProperty(LANGUAGE_KEY, filterLanguage);
            return filterLanguage;
        }
        SystemProperty.setProperty(LANGUAGE_KEY, nullAsNil);
        return nullAsNil;
    }

    public static String loadApplicationLanguageSettings(SharedPreferences sharedPreferences, Context context) {
        String nullAsNil = Util.nullAsNil(sharedPreferences.getString(LANGUAGE_KEY, (String) null));
        return !Util.isNullOrNil(nullAsNil) ? nullAsNil : "language_default";
    }

    public static void loadCurrentSystemLocale() {
        if (Build.VERSION.SDK_INT < 24) {
            sysDefaultLocale = Locale.getDefault();
        } else {
            sysDefaultLocale = LocaleList.getDefault().get(0);
        }
        Locale.setDefault(sysDefaultLocale);
    }

    public static void saveApplicationLanguage(SharedPreferences sharedPreferences, Context context, String str) {
        if (sharedPreferences.edit().putString(LANGUAGE_KEY, str).commit()) {
            SystemProperty.setProperty(LANGUAGE_KEY, str);
            Log.m105928w(TAG, "save application lang as:" + str);
            return;
        }
        Log.m105920e(TAG, "saving application lang failed");
    }

    public static Locale transLanguageToLocale(String str) {
        if (str.equals("zh_TW")) {
            return Locale.TAIWAN;
        }
        if (str.equals("zh_HK")) {
            return new Locale("zh", "HK");
        }
        if (str.equals("en")) {
            return Locale.ENGLISH;
        }
        if (str.equals("zh_CN")) {
            return Locale.CHINA;
        }
        if (WeChatSomeFeatureSwitch.temporaryBlockMinorLanguage()) {
            return Locale.ENGLISH;
        }
        if (str.equalsIgnoreCase(THAI) || str.equalsIgnoreCase("id") || str.equalsIgnoreCase(INDONESIAN_NEWNAME) || str.equalsIgnoreCase(VIETNAMESE) || str.equalsIgnoreCase(PORTUGUESE) || str.equalsIgnoreCase(SPANISH) || str.equalsIgnoreCase(RUSSIAN) || str.equalsIgnoreCase(ARABIC) || str.equalsIgnoreCase(JAPANESE) || str.equalsIgnoreCase(ITALIAN) || str.equalsIgnoreCase(KOREAN) || str.equalsIgnoreCase(MALAY) || str.equalsIgnoreCase(TURKEY) || str.equalsIgnoreCase(GERMAN) || str.equalsIgnoreCase(FRENCH) || str.equalsIgnoreCase(MYANMAR) || str.equalsIgnoreCase(LAO)) {
            return new Locale(str);
        }
        Log.m105920e(TAG, "transLanguageToLocale country = " + str);
        return Locale.ENGLISH;
    }

    public static String transLocaleToLanguage(Locale locale) {
        String language = locale.getLanguage();
        if (!language.equals("zh")) {
            return language;
        }
        return language + "_" + locale.getCountry().toUpperCase();
    }

    public static void updateApplicationResourceLocale(Context context, Locale locale) {
        try {
            Resources resources = context.getResources();
            Configuration configuration = resources.getConfiguration();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            configuration.locale = locale;
            resources.updateConfiguration(configuration, displayMetrics);
            Resources.getSystem().updateConfiguration(configuration, displayMetrics);
            WeChatBrands.updateLang(transLocaleToLanguage(locale));
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "updateApplicationResourceLocale err~~~", new Object[0]);
        }
    }
}
