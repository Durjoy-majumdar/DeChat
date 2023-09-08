package ta0;

import android.content.Context;
import android.os.Build;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import p436a1.C103276y;

/* renamed from: ta0.a */
public final class C110954a {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0030, code lost:
        if (r1 == p175j0.C108504h.C60656a.f172772a) goto L_0x0032;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p1104d1.C106969c m151253a(int r3, long r4, p175j0.C108504h r6, int r7) {
        /*
            r7 = -1087169317(0xffffffffbf331cdb, float:-0.69965905)
            r6.mo51557H(r7)
            j0.f1<android.content.Context> r7 = androidx.compose.p002ui.platform.C103691v.f306268b
            java.lang.Object r7 = r6.mo51598m(r7)
            android.content.Context r7 = (android.content.Context) r7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            a1.w r1 = new a1.w
            r1.<init>(r4)
            r2 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r6.mo51557H(r2)
            boolean r0 = r6.mo51619x(r0)
            boolean r1 = r6.mo51619x(r1)
            r0 = r0 | r1
            java.lang.Object r1 = r6.mo51606q()
            if (r0 != 0) goto L_0x0032
            int r0 = p175j0.C108504h.f324828a
            java.lang.Object r0 = p175j0.C108504h.C60656a.f172772a
            if (r1 != r0) goto L_0x0046
        L_0x0032:
            int r4 = p436a1.C103276y.m136796g(r4)
            android.graphics.drawable.Drawable r3 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r7, r3, r4)
            java.lang.String r4 = "getColorDrawable(\n      … color.toArgb()\n        )"
            gy3.C87412m.m108593f(r3, r4)
            d1.c r1 = ua0.C111148c.m151602a(r3)
            r6.mo51553F(r1)
        L_0x0046:
            r6.mo51565P()
            d1.c r1 = (p1104d1.C106969c) r1
            r6.mo51565P()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ta0.C110954a.m151253a(int, long, j0.h, int):d1.c");
    }

    /* renamed from: b */
    public static final long m151254b(int i, Context context) {
        C87412m.m108594g(context, "context");
        return Build.VERSION.SDK_INT >= 23 ? C103276y.m136791b(context.getResources().getColor(i, context.getTheme())) : C103276y.m136791b(context.getResources().getColor(i));
    }

    /* renamed from: c */
    public static long m151255c(int i, Context context, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
        }
        C87412m.m108594g(context, "context");
        return m151254b(i, context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002a, code lost:
        if (r1 == p175j0.C108504h.C60656a.f172772a) goto L_0x002c;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p1104d1.C106969c m151256d(int r2, p175j0.C108504h r3, int r4) {
        /*
            r4 = -352335535(0xffffffffeaffc951, float:-1.5461339E26)
            r3.mo51557H(r4)
            j0.f1<android.content.Context> r4 = androidx.compose.p002ui.platform.C103691v.f306268b
            java.lang.Object r4 = r3.mo51598m(r4)
            android.content.Context r4 = (android.content.Context) r4
            android.content.res.Resources r4 = r4.getResources()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1 = 1157296644(0x44faf204, float:2007.563)
            r3.mo51557H(r1)
            boolean r0 = r3.mo51619x(r0)
            java.lang.Object r1 = r3.mo51606q()
            if (r0 != 0) goto L_0x002c
            int r0 = p175j0.C108504h.f324828a
            java.lang.Object r0 = p175j0.C108504h.C60656a.f172772a
            if (r1 != r0) goto L_0x003c
        L_0x002c:
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r2)
            java.lang.String r4 = "resource.getDrawable(this)"
            gy3.C87412m.m108593f(r2, r4)
            d1.c r1 = ua0.C111148c.m151602a(r2)
            r3.mo51553F(r1)
        L_0x003c:
            r3.mo51565P()
            d1.c r1 = (p1104d1.C106969c) r1
            r3.mo51565P()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ta0.C110954a.m151256d(int, j0.h, int):d1.c");
    }
}
