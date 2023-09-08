package uy1;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import java.util.GregorianCalendar;
import java.util.HashMap;

/* renamed from: uy1.b */
public class C14391b {

    /* renamed from: a */
    public static HashMap<Long, Long> f39963a = new HashMap<>();

    /* renamed from: b */
    public static HashMap<Long, String> f39964b = new HashMap<>();

    static {
        new HashMap();
        new HashMap();
    }

    /* renamed from: a */
    public static String m13703a(Context context, long j) {
        Context context2 = context;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        if (j < 3600000) {
            return "";
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        if (f39963a.containsKey(Long.valueOf(j))) {
            if (timeInMillis - f39963a.get(Long.valueOf(j)).longValue() >= 60000) {
                f39963a.remove(Long.valueOf(j));
            } else if (f39964b.containsKey(Long.valueOf(j))) {
                return f39964b.get(Long.valueOf(j));
            }
        }
        long j2 = timeInMillis - j;
        if (j2 < 60000) {
            return context2.getString(C0966R.string.f9n);
        }
        long j3 = j2 / 3600000;
        if (j3 == 0) {
            int i = (int) (j2 / 60000);
            if (i < 1) {
                i = 1;
            }
            String quantityString = context.getResources().getQuantityString(C0966R.plurals.f7230k, i, new Object[]{Integer.valueOf(i)});
            f39964b.put(Long.valueOf(j), quantityString);
            f39963a.put(Long.valueOf(j), Long.valueOf(timeInMillis));
            return quantityString;
        }
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
        long timeInMillis2 = j - gregorianCalendar2.getTimeInMillis();
        if (timeInMillis2 <= 0 || timeInMillis2 > 86400000) {
            long timeInMillis3 = (j - gregorianCalendar2.getTimeInMillis()) + 86400000;
            if (timeInMillis3 <= 0 || timeInMillis3 > 86400000) {
                int timeInMillis4 = (int) (((gregorianCalendar2.getTimeInMillis() + 86400000) - j) / 86400000);
                if (timeInMillis4 < 1) {
                    timeInMillis4 = 1;
                }
                String quantityString2 = context.getResources().getQuantityString(C0966R.plurals.f7231l, timeInMillis4, new Object[]{Integer.valueOf(timeInMillis4)});
                f39964b.put(Long.valueOf(j), quantityString2);
                f39963a.put(Long.valueOf(j), Long.valueOf(timeInMillis));
                return quantityString2;
            }
            String string = context2.getString(C0966R.string.f360813f00);
            f39964b.put(Long.valueOf(j), string);
            f39963a.put(Long.valueOf(j), Long.valueOf(timeInMillis));
            return string;
        }
        int i2 = (int) j3;
        if (i2 < 1) {
            i2 = 1;
        }
        String quantityString3 = context.getResources().getQuantityString(C0966R.plurals.f7229j, i2, new Object[]{Integer.valueOf(i2)});
        f39964b.put(Long.valueOf(j), quantityString3);
        f39963a.put(Long.valueOf(j), Long.valueOf(timeInMillis));
        return quantityString3;
    }
}
