package kk1;

import android.content.Context;
import com.tencent.p014mm.p136ui.MMActivity;
import dj1.C7337h1;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import jp3.C9487b;
import nr3.C89059e;

/* renamed from: kk1.d */
public final class C10288d {

    /* renamed from: a */
    public static final C10288d f31346a = new C10288d();

    /* renamed from: a */
    public static void m10244a(C10288d dVar, Context context, String str, int i, long j, long j2, String str2, C32226l lVar, int i2, Object obj) {
        Context context2 = context;
        C32226l lVar2 = (i2 & 64) != 0 ? null : lVar;
        dVar.getClass();
        C87412m.m108594g(context2, "context");
        String str3 = str2;
        C87412m.m108594g(str3, "userName");
        C89059e i3 = new C7337h1(str, i, System.currentTimeMillis(), j, j2, str3, (C7337h1.C7338a) null, 64, (C8480h) null).mo9225i();
        i3.mo123420E(new C10287c(lVar2));
        if (context2 instanceof MMActivity) {
            i3.mo11397F((C9487b) context2);
        }
    }
}
