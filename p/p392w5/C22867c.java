package p392w5;

import android.content.Context;

/* renamed from: w5.c */
public abstract class C22867c {

    /* renamed from: a */
    public static C22867c f65744a;

    /* renamed from: d */
    public static C22867c m26824d(Context context) {
        if (f65744a == null) {
            synchronized (C22867c.class) {
                if (f65744a == null) {
                    f65744a = new C22868d(context);
                }
            }
        }
        return f65744a;
    }

    /* renamed from: a */
    public abstract void mo36031a(String str, int i, int i2, int i3, int i4);

    /* renamed from: b */
    public abstract void mo36032b(String str, int i, int i2, int i3, int i4);

    /* renamed from: c */
    public abstract void mo36033c(String str, int i, int i2, int i3, int i4);

    /* renamed from: e */
    public abstract int mo36034e(String str);

    /* renamed from: f */
    public abstract void mo36035f();
}
