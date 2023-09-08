package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import android.app.Activity;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import gy3.C87412m;
import hp3.C87581a;
import java.util.ArrayList;
import java.util.Iterator;
import lp3.C46888b;
import lp3.C88643g;
import p225rc.C89916g;
import p225rc.C89922k;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.p */
public final class C82745p<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ ArrayList<String> f242066a;

    /* renamed from: b */
    public final /* synthetic */ C82777y f242067b;

    public C82745p(ArrayList<String> arrayList, C82777y yVar) {
        this.f242066a = arrayList;
        this.f242067b = yVar;
    }

    public Object call(Object obj) {
        Void voidR = (Void) obj;
        Iterator<String> it = this.f242066a.iterator();
        C82777y yVar = this.f242067b;
        while (it.hasNext()) {
            if (C89922k.m112465b(yVar.f242124a.getContext(), yVar.f242124a, it.next())) {
                it.remove();
            }
        }
        if (this.f242066a.isEmpty()) {
            return Boolean.TRUE;
        }
        Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(this.f242067b.f242124a.getContext());
        if (castActivityOrNull == null) {
            Log.m105920e("MicroMsg.AppBrand.ChooseMediaWorkFlow", "step:requestPermission, context !is Activity");
            C88643g.m110544b().mo72091a(new IllegalStateException("fail:internal error invalid android context"));
            return Boolean.FALSE;
        }
        C46888b b = C88643g.m110544b();
        b.mo72092b();
        C89916g a = C89916g.m112446a(castActivityOrNull);
        C82381f fVar = this.f242067b.f242124a;
        Object[] array = this.f242066a.toArray(new String[0]);
        C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        a.mo124235i(fVar, (String[]) array, new C55514o(b, this.f242066a));
        return Boolean.FALSE;
    }
}
