package jh0;

import com.tencent.p014mm.sdk.platformtools.Util;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* renamed from: jh0.a */
public class C33573a {

    /* renamed from: a */
    public static SimpleDateFormat f90886a;

    /* renamed from: a */
    public static SimpleDateFormat m40125a() {
        if (f90886a == null) {
            f90886a = new SimpleDateFormat("yyyyMMdd");
        }
        return f90886a;
    }

    /* renamed from: b */
    public static long m40126b() {
        Calendar instance = Calendar.getInstance();
        instance.set(13, 0);
        instance.set(12, 0);
        instance.set(11, 0);
        instance.set(14, 0);
        return instance.getTimeInMillis();
    }

    /* renamed from: c */
    public static int m40127c(long j) {
        return Util.getInt(m40125a().format(Long.valueOf(j)), -1);
    }

    /* renamed from: d */
    public static int m40128d(long j) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(j);
        return gregorianCalendar.get(11);
    }
}
