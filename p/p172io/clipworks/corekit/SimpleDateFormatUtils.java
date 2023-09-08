package p172io.clipworks.corekit;

/* renamed from: io.clipworks.corekit.SimpleDateFormatUtils */
public class SimpleDateFormatUtils {
    public static String getTimeStringByFormatAndLocale(String str, String str2, String str3) {
        return TimestampUtils.INSTANCE.formatTimestamp(Long.parseLong(str), str2, str3);
    }
}
