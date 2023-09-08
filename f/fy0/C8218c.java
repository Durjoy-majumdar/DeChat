package fy0;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;

/* renamed from: fy0.c */
public class C8218c {

    /* renamed from: a */
    public static HashMap<Long, Long> f27142a = new HashMap<>();

    /* renamed from: b */
    public static HashMap<Long, String> f27143b = new HashMap<>();

    /* renamed from: a */
    public static synchronized String m8301a(Context context, long j) {
        String str;
        synchronized (C8218c.class) {
            if (j < 3600000) {
                return "";
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (j > currentTimeMillis) {
                j = currentTimeMillis;
            }
            if (f27142a.containsKey(Long.valueOf(j))) {
                if (currentTimeMillis - f27142a.get(Long.valueOf(j)).longValue() >= 60000) {
                    f27142a.remove(Long.valueOf(j));
                } else if (f27143b.containsKey(Long.valueOf(j))) {
                    String str2 = f27143b.get(Long.valueOf(j));
                    return str2;
                }
            }
            long j2 = currentTimeMillis - j;
            if (j2 < 3600000) {
                int i = (int) (j2 / 60000);
                if (i < 1) {
                    i = 1;
                }
                String quantityString = context.getResources().getQuantityString(C0966R.plurals.f7230k, i, new Object[]{Integer.valueOf(i)});
                f27143b.put(Long.valueOf(j), quantityString);
                f27142a.put(Long.valueOf(j), Long.valueOf(currentTimeMillis));
                return quantityString;
            } else if (j2 < 86400000) {
                int max = Math.max((int) (j2 / 3600000), 1);
                String quantityString2 = context.getResources().getQuantityString(C0966R.plurals.f7229j, max, new Object[]{Integer.valueOf(max)});
                f27143b.put(Long.valueOf(j), quantityString2);
                f27142a.put(Long.valueOf(j), Long.valueOf(currentTimeMillis));
                return quantityString2;
            } else if (j2 < 129600000) {
                Calendar instance = Calendar.getInstance();
                instance.setTimeInMillis(currentTimeMillis);
                int i2 = instance.get(6);
                instance.setTimeInMillis(j);
                if (i2 - instance.get(6) == 1) {
                    str = context.getString(C0966R.string.f360813f00);
                } else {
                    str = context.getResources().getQuantityString(C0966R.plurals.f7231l, 1, new Object[]{1});
                }
                f27143b.put(Long.valueOf(j), str);
                f27142a.put(Long.valueOf(j), Long.valueOf(currentTimeMillis));
                return str;
            } else {
                GregorianCalendar gregorianCalendar = new GregorianCalendar();
                int max2 = Math.max((int) (((new GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5)).getTimeInMillis() + 86400000) - j) / 86400000), 1);
                String quantityString3 = context.getResources().getQuantityString(C0966R.plurals.f7231l, max2, new Object[]{Integer.valueOf(max2)});
                f27143b.put(Long.valueOf(j), quantityString3);
                f27142a.put(Long.valueOf(j), Long.valueOf(currentTimeMillis));
                return quantityString3;
            }
        }
    }
}
