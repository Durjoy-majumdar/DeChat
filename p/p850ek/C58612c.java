package p850ek;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;
import p852fk.C59109a;

/* renamed from: ek.c */
public class C58612c {

    /* renamed from: a */
    public static final SimpleDateFormat f167811a = new SimpleDateFormat("yy年M月d日 hh:mm:ss");

    /* renamed from: b */
    public static final Date f167812b = new Date();

    /* renamed from: c */
    public static final StringBuilder f167813c;

    /* renamed from: d */
    public static final Formatter f167814d;

    /* renamed from: e */
    public static float f167815e = -1.0f;

    static {
        StringBuilder sb = new StringBuilder();
        f167813c = sb;
        f167814d = new Formatter(sb, Locale.getDefault());
    }

    /* renamed from: a */
    public static int m68061a(float f) {
        if (f167815e < 0.0f) {
            f167815e = C59109a.m69050a().getResources().getDisplayMetrics().density;
        }
        return (int) ((f * f167815e) + 0.5f);
    }

    /* renamed from: b */
    public static String m68062b(long j) {
        if (j < 86400000) {
            long j2 = j / 1000;
            long j3 = j2 % 60;
            long j4 = (j2 / 60) % 60;
            long j5 = j2 / 3600;
            if (j3 < 0) {
                j3 = 0;
            }
            if (j4 < 0) {
                j4 = 0;
            }
            if (j5 < 0) {
                j5 = 0;
            }
            f167813c.setLength(0);
            if (j5 > 0) {
                return f167814d.format("%d:%02d:%02d", new Object[]{Long.valueOf(j5), Long.valueOf(j4), Long.valueOf(j3)}).toString();
            }
            return f167814d.format("%02d:%02d", new Object[]{Long.valueOf(j4), Long.valueOf(j3)}).toString();
        }
        Date date = f167812b;
        date.setTime(j);
        return f167811a.format(date);
    }
}
