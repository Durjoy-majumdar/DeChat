package fh2;

import android.graphics.Point;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import f72.C97842b;
import xb0.C102609h;

/* renamed from: fh2.f */
public final class C97881f {

    /* renamed from: a */
    public static final C97881f f287137a = new C97881f();

    /* renamed from: b */
    public static int f287138b;

    /* renamed from: c */
    public static int f287139c;

    /* renamed from: d */
    public static int f287140d;

    /* renamed from: a */
    public final int mo137201a() {
        if (f287138b <= 0) {
            mo137202b();
        }
        return f287138b;
    }

    /* renamed from: b */
    public final synchronized Point mo137202b() {
        if (f287139c <= 0 || f287140d <= 0) {
            int i = C102609h.Fx0().ai0().f267166d;
            Point h = C85875k4.m106184h(MMApplicationContext.getContext());
            int i2 = (h.y * i) / h.x;
            if (i2 % 16 != 0) {
                i2 = C97842b.m126284a(i2);
            }
            if (i % 16 != 0) {
                i = C97842b.m126284a(i);
            }
            f287139c = i;
            f287140d = i2;
            f287138b = i;
        }
        return new Point(f287139c, f287140d);
    }
}
