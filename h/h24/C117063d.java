package h24;

import e24.C20509c;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: h24.d */
public final class C117063d {

    /* renamed from: a */
    public static final ThreadLocal<DateFormat> f350745a = new C117064a();

    /* renamed from: b */
    public static final String[] f350746b;

    /* renamed from: c */
    public static final DateFormat[] f350747c;

    /* renamed from: h24.d$a */
    public class C117064a extends ThreadLocal<DateFormat> {
        public Object initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(C20509c.f57733e);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f350746b = strArr;
        f350747c = new DateFormat[strArr.length];
    }

    /* renamed from: a */
    public static Date m165079a(String str) {
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = f350745a.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        String[] strArr = f350746b;
        synchronized (strArr) {
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                DateFormat[] dateFormatArr = f350747c;
                DateFormat dateFormat = dateFormatArr[i];
                if (dateFormat == null) {
                    dateFormat = new SimpleDateFormat(f350746b[i], Locale.US);
                    dateFormat.setTimeZone(C20509c.f57733e);
                    dateFormatArr[i] = dateFormat;
                }
                parsePosition.setIndex(0);
                Date parse2 = dateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
            }
            return null;
        }
    }
}
