package com.tencent.p014mm.sdk.platformtools;

import android.telephony.TelephonyManager;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.tencent.mm.sdk.platformtools.WeChatLocaleUtil */
public class WeChatLocaleUtil {
    public static boolean isOverseasUser() {
        if (!Locale.getDefault().getCountry().equalsIgnoreCase("CN")) {
            return true;
        }
        if (TimeZone.getDefault().getRawOffset() != TimeZone.getTimeZone("GMT+08:00").getRawOffset()) {
            return true;
        }
        TelephonyManager telephonyManager = (TelephonyManager) MMApplicationContext.getContext().getSystemService("phone");
        if (telephonyManager == null) {
            return false;
        }
        String networkCountryIso = telephonyManager.getNetworkCountryIso();
        return !Util.isNullOrNil(networkCountryIso) && !networkCountryIso.contains("cn") && !networkCountryIso.contains("CN");
    }

    public static boolean isOverseasUserByWechatLanguage() {
        String loadApplicationLanguageSettings = LocaleUtil.loadApplicationLanguageSettings(MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0), MMApplicationContext.getContext());
        String applicationLanguage = LocaleUtil.getApplicationLanguage();
        if (loadApplicationLanguageSettings.equals("language_default")) {
            loadApplicationLanguageSettings = applicationLanguage;
        }
        if (!loadApplicationLanguageSettings.equals("zh_CN")) {
            return true;
        }
        if (TimeZone.getDefault().getRawOffset() != TimeZone.getTimeZone("GMT+08:00").getRawOffset()) {
            return true;
        }
        TelephonyManager telephonyManager = (TelephonyManager) MMApplicationContext.getContext().getSystemService("phone");
        if (telephonyManager != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            return !Util.isNullOrNil(networkCountryIso) && !networkCountryIso.contains("cn") && !networkCountryIso.contains("CN");
        }
    }
}
