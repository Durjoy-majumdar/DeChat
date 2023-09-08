package p328cz;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import c03.C54600b;
import com.tencent.p014mm.plugin.thumbplayer.view.MMTPVideoLayout;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import j03.C21147f;
import j03.C60695a;
import j03.C60698b;
import j03.C60699c;
import j03.C60700d;
import p501dz.C58464f;

@C86522b
/* renamed from: cz.e */
public final class C58004e extends C86301e implements C58464f {
    /* renamed from: a */
    public C60698b mo82800a(Context context) {
        C87412m.m108594g(context, "context");
        return new C21147f(context);
    }

    /* renamed from: jf */
    public C60695a mo82801jf(Context context) {
        C87412m.m108594g(context, "context");
        return new C60700d(context);
    }

    /* renamed from: mj */
    public C60698b mo82802mj(Context context, Looper looper) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(looper, "threadLooper");
        return new C21147f(context, looper);
    }

    /* renamed from: ux */
    public C60699c mo82803ux(Context context, boolean z) {
        C87412m.m108594g(context, "context");
        return new MMTPVideoLayout(context, z);
    }

    /* renamed from: wv */
    public Bundle mo82804wv(Context context, int i, int i2) {
        C87412m.m108594g(context, "context");
        return C54600b.f153106a.mo75506a(context, i, i2);
    }
}
