package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32226l;
import gy3.C8477a0;
import gy3.C87412m;
import hp3.C87581a;
import nr3.C89059e;
import nr3.C89060f;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.y */
public final class C82777y {

    /* renamed from: a */
    public final C82381f f242124a;

    /* renamed from: b */
    public final int f242125b;

    /* renamed from: c */
    public final int f242126c;

    /* renamed from: d */
    public final int f242127d;

    /* renamed from: e */
    public final boolean f242128e;

    /* renamed from: f */
    public final int f242129f;

    /* renamed from: g */
    public final int f242130g;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.y$a */
    public static final class C82778a implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C32226l f242131a;

        public C82778a(C32226l lVar) {
            this.f242131a = lVar;
        }

        public final /* synthetic */ Object call(Object obj) {
            return this.f242131a.invoke(obj);
        }
    }

    public C82777y(C82381f fVar, int i, int i2, int i3, boolean z, int i4, int i5) {
        C87412m.m108594g(fVar, "mComponent");
        this.f242124a = fVar;
        this.f242125b = i;
        this.f242126c = i2;
        this.f242127d = i3;
        this.f242128e = z;
        this.f242129f = Math.min(Math.max(i4, 1), 60);
        this.f242130g = Math.min(Math.max(i5, 1), 9);
    }

    /* renamed from: a */
    public static final C89059e m101524a(C82777y yVar) {
        yVar.getClass();
        C89059e<_Ret> B = C89060f.m111322a().mo123062e(new C82748q(yVar)).mo123062e(new C82761s(yVar));
        C87412m.m108593f(B, "private fun goAlbumUI():….CANCELED\n        }\n    }");
        return B;
    }

    /* renamed from: b */
    public static final C89059e m101525b(C82777y yVar) {
        if (!(Util.getAvailableMemoryMB(yVar.f242124a.getContext()) > 200)) {
            C76701a.makeText(yVar.f242124a.getContext(), (CharSequence) yVar.f242124a.getContext().getString(C0966R.string.f7636m8), 1).show();
        }
        C8477a0 a0Var = new C8477a0();
        a0Var.f27482d = true;
        C89059e<_Ret> B = C89060f.m111322a().mo123062e(new C82764t(a0Var, yVar));
        B.mo123419C(new C82767u(yVar, a0Var));
        C89059e<_Ret> B2 = B.mo123062e(new C82775x(yVar));
        C87412m.m108593f(B2, "private fun goSightCaptu…        }\n        }\n    }");
        return B2;
    }
}
