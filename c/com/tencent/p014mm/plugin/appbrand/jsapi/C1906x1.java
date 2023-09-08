package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32226l;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.x1 */
public final class C1906x1 extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ int f11759d;

    /* renamed from: e */
    public final /* synthetic */ WeakReference<C81879g> f11760e;

    /* renamed from: f */
    public final /* synthetic */ C82914r1 f11761f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1906x1(int i, WeakReference<C81879g> weakReference, C82914r1 r1Var) {
        super(1);
        this.f11759d = i;
        this.f11760e = weakReference;
        this.f11761f = r1Var;
    }

    public Object invoke(Object obj) {
        String str;
        String str2 = (String) obj;
        Log.m105920e("Luggage.FULL.JsApiBatchGetContact", "Loader(" + this.f11759d + ").onError, errMsg:" + str2);
        C81879g gVar = this.f11760e.get();
        if (gVar != null) {
            int i = this.f11759d;
            C82914r1 r1Var = this.f11761f;
            StringBuilder sb = new StringBuilder();
            sb.append("fail");
            if (str2 == null || str2.length() == 0) {
                str = "";
            } else {
                str = XVFSFile.PATH_SEPARATOR_CHAR + str2;
            }
            sb.append(str);
            gVar.mo109647a(i, r1Var.mo115109j(sb.toString()));
        }
        return C13598b0.f38549a;
    }
}
