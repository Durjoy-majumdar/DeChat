package p516f9;

import android.content.Intent;
import java.util.ArrayDeque;
import java.util.Queue;
import p1042u.C111059i;

/* renamed from: f9.m */
public final class C116833m {

    /* renamed from: e */
    public static C116833m f350195e;

    /* renamed from: a */
    public final C111059i<String, String> f350196a = new C111059i<>();

    /* renamed from: b */
    public Boolean f350197b = null;

    /* renamed from: c */
    public final Queue<Intent> f350198c = new ArrayDeque();

    /* renamed from: d */
    public final Queue<Intent> f350199d = new ArrayDeque();

    /* renamed from: a */
    public static synchronized C116833m m164816a() {
        C116833m mVar;
        synchronized (C116833m.class) {
            if (f350195e == null) {
                f350195e = new C116833m();
            }
            mVar = f350195e;
        }
        return mVar;
    }
}
