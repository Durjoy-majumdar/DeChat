package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import android.os.Build;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8477a0;
import gy3.C87412m;
import hp3.C87581a;
import java.util.ArrayList;
import lp3.C88643g;
import nr3.C89059e;
import nr3.C89060f;
import p225rc.C89922k;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.t */
public final class C82764t<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C8477a0 f242095a;

    /* renamed from: b */
    public final /* synthetic */ C82777y f242096b;

    public C82764t(C8477a0 a0Var, C82777y yVar) {
        this.f242095a = a0Var;
        this.f242096b = yVar;
    }

    public Object call(Object obj) {
        Void voidR = (Void) obj;
        this.f242095a.f27482d = C89922k.m112465b(this.f242096b.f242124a.getContext(), this.f242096b.f242124a, Build.VERSION.SDK_INT >= 29 ? "android.permission.READ_EXTERNAL_STORAGE" : "android.permission.WRITE_EXTERNAL_STORAGE");
        Log.m105924i("MicroMsg.AppBrand.ChooseMediaWorkFlow", "has external storage permission: " + this.f242095a.f27482d);
        C82777y yVar = this.f242096b;
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.RECORD_AUDIO");
        arrayList.add("android.permission.CAMERA");
        yVar.getClass();
        C89059e<_Ret> B = C89060f.m111322a().mo123062e(new C82745p(arrayList, yVar));
        C87412m.m108593f(B, "private fun batchRequest…false\n            }\n    }");
        C88643g.m110543a(B);
        return Boolean.FALSE;
    }
}
