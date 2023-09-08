package hm3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p723vf.C118672d;

/* renamed from: hm3.k */
public final class C32966k {
    /* renamed from: a */
    public static final long m39899a(String str) {
        try {
            Date parse = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).parse(str);
            if (parse != null) {
                return parse.getTime();
            }
            return 0;
        } catch (Throwable th) {
            C118672d.m167354d("Matrix.Safe", th, "", new Object[0]);
            return 0;
        }
    }

    /* renamed from: b */
    public static final <T> C32965j<T> m39900b(T t) {
        return new C32965j<>(t, m39899a("9999-11-11"));
    }
}
