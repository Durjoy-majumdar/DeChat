package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import android.os.Build;
import gy3.C87412m;
import hp3.C87581a;
import java.util.ArrayList;
import lp3.C88643g;
import nr3.C89059e;
import nr3.C89060f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.q */
public final class C82748q<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C82777y f242074a;

    public C82748q(C82777y yVar) {
        this.f242074a = yVar;
    }

    public Object call(Object obj) {
        Void voidR = (Void) obj;
        C82777y yVar = this.f242074a;
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 29) {
            arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
        } else {
            arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        yVar.getClass();
        C89059e<_Ret> B = C89060f.m111322a().mo123062e(new C82745p(arrayList, yVar));
        C87412m.m108593f(B, "private fun batchRequest…false\n            }\n    }");
        C88643g.m110543a(B);
        return Boolean.FALSE;
    }
}
