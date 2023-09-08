package com.tencent.p014mm.sdk.platformtools;

import com.tencent.p014mm.sdk.platformtools.PhoneFormaterConfig;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.tencent.mm.sdk.platformtools.PhoneFormater */
public class PhoneFormater {
    private static final String TAG = "MicroMsg.PhoneFormater";
    public static PhoneFormaterConfig config;

    public static String countryCodeWithPlus(String str) {
        if (Util.isNullOrNil(str)) {
            return "";
        }
        if (str.startsWith("+")) {
            return str;
        }
        return "+" + str;
    }

    public static String countryNameWithCode(String str, String str2) {
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str2)) {
            return "";
        }
        return str + "（+" + str2 + "）";
    }

    public static String extractCountryCode(String str, String str2) {
        int length;
        int length2;
        int i;
        String replace = pureNumber(str).replace("+", "");
        if (config == null) {
            config = new PhoneFormaterConfig();
        }
        if (Util.isNullOrNil(str2)) {
            for (PhoneFormaterConfig.Country next : config.contryList) {
                if (replace.startsWith(next.countrycode) && (length2 = replace.length() - next.countrycode.length()) >= next.minlen && length2 <= (i = next.maxlen)) {
                    Log.m105925i(TAG, "[extractCountryCode] countrycode:%s country isocode: %s country.minlen:%d country.maxlen:%d", next.countrycode, next.isocode, Integer.valueOf(i), Integer.valueOf(next.maxlen));
                    return next.countrycode;
                }
            }
            return null;
        }
        for (PhoneFormaterConfig.Country next2 : config.contryList) {
            if (replace.startsWith(next2.countrycode) && (length = replace.length() - next2.countrycode.length()) >= next2.minlen && length <= next2.maxlen && str2.equalsIgnoreCase(next2.isocode)) {
                Log.m105925i(TAG, "[extractCountryCode] countrycode:%s country isocode: %s country.minlen:%d country.maxlen:%d", next2.countrycode, next2.isocode, Integer.valueOf(next2.maxlen), Integer.valueOf(next2.maxlen));
                return next2.countrycode;
            }
        }
        return null;
    }

    private String format(String str, String str2, String str3) {
        Matcher matcher = Pattern.compile(str).matcher(str3);
        return matcher.find() ? matcher.replaceAll(str2) : str3;
    }

    public static String formatMobileString(String str) {
        String str2;
        if (Util.isNullOrNil(str) || !Util.isPhoneNumber(str).booleanValue()) {
            return str;
        }
        PhoneFormater phoneFormater = new PhoneFormater();
        if (str.startsWith("+")) {
            str = str.replace("+", "");
            str2 = extractCountryCode(str);
            if (str2 != null) {
                str = str.substring(str2.length());
            }
        } else {
            str2 = "86";
        }
        return phoneFormater.formatNumber(str2, str);
    }

    private int getMatchLenght(String str, int i) {
        Pattern compile = Pattern.compile(str);
        int i2 = 0;
        String str2 = "1";
        while (i2 < i && !compile.matcher(str2).find()) {
            str2 = str2 + "1";
            i2++;
        }
        return i2 + 1;
    }

    public static String pureCountryCode(String str) {
        return Util.isNullOrNil(str) ? "" : str.replace("+", "");
    }

    public static String pureCountryName(String str) {
        if (Util.isNullOrNil(str)) {
            return "";
        }
        int indexOf = str.indexOf("（+");
        return indexOf >= 0 ? str.substring(0, indexOf) : str;
    }

    public static String pureNumber(String str) {
        return Util.isNullOrNil(str) ? "" : str.replaceAll("[\\.\\-\\ ]", "").trim();
    }

    public String formatNumber(String str, String str2) {
        if (!Util.isNullOrNil(str) && !Util.isNullOrNil(str2)) {
            if (config == null) {
                config = new PhoneFormaterConfig();
            }
            for (PhoneFormaterConfig.Country next : config.contryList) {
                if (!(next.countrycode == null || !str.trim().toLowerCase().equals(next.countrycode.trim().toLowerCase()) || next.formatList == null)) {
                    String pureNumber = pureNumber(str2);
                    if (pureNumber != null && pureNumber.length() > next.minlen) {
                        return pureNumber;
                    }
                    for (PhoneFormaterConfig.Format next2 : next.formatList) {
                        if (Util.isNullOrNil(next2.leading)) {
                            if (next.formatList.size() > 1) {
                                StringBuffer stringBuffer = new StringBuffer();
                                stringBuffer.append(pureNumber);
                                int length = pureNumber.length();
                                if (length <= getMatchLenght(next2.formatregex, next.maxlen)) {
                                    while (stringBuffer.toString().length() < next.maxlen) {
                                        stringBuffer.append("0");
                                    }
                                    String format = format(next2.formatregex, next2.pattern, stringBuffer.toString());
                                    int i = 0;
                                    for (int i2 = 0; i2 < format.length(); i2++) {
                                        char charAt = format.charAt(i2);
                                        if (i >= length) {
                                            format = format.substring(0, i2);
                                        }
                                        if (!(charAt == ' ' || charAt == '-' || charAt == 12290)) {
                                            i++;
                                        }
                                    }
                                    return format;
                                }
                            } else {
                                StringBuffer stringBuffer2 = new StringBuffer();
                                stringBuffer2.append(pureNumber);
                                int length2 = pureNumber.length();
                                while (stringBuffer2.toString().length() < next.maxlen) {
                                    stringBuffer2.append("0");
                                }
                                String format2 = format(next2.formatregex, next2.pattern, stringBuffer2.toString());
                                int i3 = 0;
                                for (int i4 = 0; i4 < format2.length(); i4++) {
                                    char charAt2 = format2.charAt(i4);
                                    if (i3 >= length2) {
                                        format2 = format2.substring(0, i4);
                                    }
                                    if (!(charAt2 == ' ' || charAt2 == '-' || charAt2 == 12290)) {
                                        i3++;
                                    }
                                }
                                return format2;
                            }
                        } else if (Pattern.compile(next2.leading).matcher(pureNumber).lookingAt()) {
                            StringBuffer stringBuffer3 = new StringBuffer();
                            stringBuffer3.append(pureNumber);
                            int length3 = pureNumber.length();
                            while (stringBuffer3.toString().length() < next.maxlen) {
                                stringBuffer3.append(pureNumber.charAt(length3 - 1));
                            }
                            String format3 = format(next2.formatregex, next2.pattern, stringBuffer3.toString());
                            int i5 = 0;
                            for (int i6 = 0; i6 < format3.length(); i6++) {
                                char charAt3 = format3.charAt(i6);
                                if (i5 >= length3) {
                                    format3 = format3.substring(0, i6);
                                }
                                if (!(charAt3 == ' ' || charAt3 == '-' || charAt3 == 12290)) {
                                    i5++;
                                }
                            }
                            return format3;
                        }
                    }
                    continue;
                }
            }
        }
        return str2;
    }

    public static String extractCountryCode(String str) {
        return extractCountryCode(str, (String) null);
    }
}
