package com.tencent.maas.utils;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import rx3.C13604l;
import sx3.C90364q0;
import z04.C112550d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u0004\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0014\u0010\n\u001a\u00060\bj\u0002`\t*\u00060\bj\u0002`\tH\u0002J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002J\u0014\u0010\u000f\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\bj\u0002`\tH\u0002J\u001a\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0002J \u0010\u0018\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002R\u0014\u0010\u0019\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, mo182094d2 = {"Lcom/tencent/maas/utils/MaasSDKTimestampUtils;", "", "", "date", "parseDateNumber2Capital", "", "number", "convertToSimplifiedChinese", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "trim0", "", "longitude", "latitude", "getLocationString", "convertToSimplifiedChineseForYear", "tag", "msg", "Lrx3/b0;", "log", "", "timestampMs", "format", "localeStr", "formatTimestamp", "TAG", "Ljava/lang/String;", "<init>", "()V", "MaasSDK_release"}, mo182095k = 1, mo182096mv = {1, 5, 1})
public final class MaasSDKTimestampUtils {
    public static final MaasSDKTimestampUtils INSTANCE = new MaasSDKTimestampUtils();
    private static final String TAG = "MaasSDKTimestamp";

    private MaasSDKTimestampUtils() {
    }

    private final String convertToSimplifiedChinese(int i) {
        String[] strArr = {"零", "一", "二", "三", "四", "五", "六", "七", "八", "九"};
        String[] strArr2 = {"", "十", "百", "千", "万", "十", "百", "千", "亿", "十", "百", "千", "兆"};
        String valueOf = String.valueOf(i);
        if (valueOf != null) {
            char[] charArray = valueOf.toCharArray();
            C87412m.m108593f(charArray, "(this as java.lang.String).toCharArray()");
            StringBuffer stringBuffer = new StringBuffer();
            int i2 = 0;
            int length = charArray.length - 1;
            if (length >= 0) {
                while (true) {
                    int i3 = i2 + 1;
                    Integer valueOf2 = Integer.valueOf(String.valueOf(charArray[i2]));
                    C87412m.m108593f(valueOf2, "valueOf(digits[i].toString())");
                    int intValue = valueOf2.intValue();
                    String str = strArr[intValue];
                    int length2 = (charArray.length - i2) - 1;
                    String str2 = strArr2[length2];
                    if (intValue == 0 && length2 % 4 == 0) {
                        stringBuffer.append(str2);
                    } else if (intValue == 0) {
                        stringBuffer.append(str);
                    } else if (intValue == 1 && length2 % 4 == 1) {
                        stringBuffer.append(str2);
                    } else {
                        stringBuffer.append(str);
                        stringBuffer.append(str2);
                    }
                    if (i3 > length) {
                        break;
                    }
                    i2 = i3;
                }
            }
            String stringBuffer2 = stringBuffer.toString();
            C87412m.m108593f(stringBuffer2, "sb.toString()");
            return stringBuffer2;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    private final String convertToSimplifiedChineseForYear(StringBuilder sb) {
        Map f = C90364q0.m113147f(new C13604l('0', 38646), new C13604l('1', 19968), new C13604l('2', 20108), new C13604l('3', 19977), new C13604l('4', 22235), new C13604l('5', 20116), new C13604l('6', 20845), new C13604l('7', 19971), new C13604l('8', 20843), new C13604l('9', 20061));
        int i = 0;
        int i2 = 0;
        while (i < sb.length()) {
            char charAt = sb.charAt(i);
            int i3 = i2 + 1;
            if ('0' <= charAt && charAt <= '9') {
                Character ch = (Character) f.get(Character.valueOf(charAt));
                if (ch != null) {
                    sb.setCharAt(i2, ch.charValue());
                } else {
                    throw new IllegalStateException("ignored".toString());
                }
            }
            i++;
            i2 = i3;
        }
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "number.toString()");
        return sb4;
    }

    private final String getLocationString(double d, double d2) {
        String str = d2 > 0.0d ? "N" : ExifInterface.LATITUDE_SOUTH;
        String str2 = d > 0.0d ? ExifInterface.LONGITUDE_EAST : ExifInterface.LONGITUDE_WEST;
        int i = (int) d2;
        double d3 = (double) 60;
        double abs = Math.abs(d2 - ((double) i)) * d3;
        int i2 = (int) d;
        double abs2 = Math.abs(d - ((double) i2)) * d3;
        return i + 176 + abs + '\'' + str + ' ' + i2 + 176 + abs2 + '\'' + str2;
    }

    private final void log(String str, String str2) {
    }

    private final String parseDateNumber2Capital(String str) {
        Integer num;
        String str2 = str;
        if (str2 == null || str.length() == 0) {
            return "";
        }
        if (str2.charAt(C112550d0.m153765A(str)) != 26085 && str2.charAt(C112550d0.m153765A(str)) != 22825) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(str2);
        int i = 0;
        int i2 = 0;
        while (i < sb.length()) {
            char charAt = sb.charAt(i);
            int i3 = i2 + 1;
            MaasSDKTimestampUtils maasSDKTimestampUtils = INSTANCE;
            maasSDKTimestampUtils.log(TAG, C87412m.m108600m("parse date, char: ", Character.valueOf(charAt)));
            if ((charAt == 26085 || charAt == 22825) || charAt == 26376) {
                int i4 = i2 - 1;
                String str3 = "";
                while (true) {
                    if (i4 < -1) {
                        break;
                    }
                    Integer num2 = null;
                    try {
                        num = Integer.valueOf(Integer.parseInt(String.valueOf(sb.charAt(i4))));
                    } catch (Exception unused) {
                        num = null;
                    }
                    if (num == null) {
                        try {
                            num2 = Integer.valueOf(Integer.parseInt(str3));
                        } catch (Exception unused2) {
                        }
                        if (num2 != null) {
                            C87412m.m108593f(sb.replace(i4 + 1, i2, INSTANCE.convertToSimplifiedChinese(num2.intValue())), "this.replace(startIndex, endIndex, value)");
                        }
                    } else {
                        str3 = num + str3;
                        i4--;
                    }
                }
            } else if (charAt == 24180 && i2 >= 4) {
                int i5 = i2 - 1;
                char charAt2 = sb.charAt(i5);
                if ('0' <= charAt2 && charAt2 <= '9') {
                    int i6 = i2 - 2;
                    char charAt3 = sb.charAt(i6);
                    if ('0' <= charAt3 && charAt3 <= '9') {
                        int i7 = i2 - 3;
                        char charAt4 = sb.charAt(i7);
                        if ('0' <= charAt4 && charAt4 <= '9') {
                            int i8 = i2 - 4;
                            char charAt5 = sb.charAt(i8);
                            if ('0' <= charAt5 && charAt5 <= '9') {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(sb.charAt(i8));
                                sb4.append(sb.charAt(i7));
                                sb4.append(sb.charAt(i6));
                                sb4.append(sb.charAt(i5));
                                C87412m.m108593f(sb.replace(i8, i2, maasSDKTimestampUtils.convertToSimplifiedChineseForYear(maasSDKTimestampUtils.trim0(sb4))), "this.replace(startIndex, endIndex, value)");
                            }
                        }
                    }
                }
            }
            i++;
            i2 = i3;
        }
        String sb5 = sb.toString();
        C87412m.m108593f(sb5, "realResultDate.toString()");
        return sb5;
    }

    private final StringBuilder trim0(StringBuilder sb) {
        if (!C112550d0.m153787W(sb, '0', false, 2, (Object) null)) {
            return sb;
        }
        int i = 0;
        for (int i2 = 0; i2 < sb.length(); i2++) {
            if (sb.charAt(i2) == '0') {
                i++;
            }
        }
        return i == sb.length() ? new StringBuilder("0") : new StringBuilder(C112550d0.m153778N(sb, 0, i));
    }

    public final String formatTimestamp(long j, String str, String str2) {
        C87412m.m108594g(str, TPReportKeys.PlayerStep.PLAYER_FORMAT);
        C87412m.m108594g(str2, "localeStr");
        Date date = new Date(j);
        try {
            Locale locale = C87412m.m108589b(str2, "zh_CN") ? Locale.CHINA : C87412m.m108589b(str2, "en_US") ? Locale.US : null;
            String format = new SimpleDateFormat(str, locale == null ? Locale.CHINA : locale).format(date);
            if (!C87412m.m108589b(locale, Locale.CHINA)) {
                INSTANCE.log(TAG, C87412m.m108600m("result: ", format));
                return format;
            }
            String parseDateNumber2Capital = parseDateNumber2Capital(format);
            INSTANCE.log(TAG, C87412m.m108600m("result: ", parseDateNumber2Capital));
            return parseDateNumber2Capital;
        } catch (Exception e) {
            log("ParseDateFormat error", e.getMessage());
            return null;
        }
    }
}
