package com.tencent.p014mm.plugin.appbrand.jsapi.file;

import android.util.ArrayMap;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.utils.C84754j1;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import fy3.C32226l;
import gy3.C87413o;
import java.net.URL;
import org.json.JSONArray;
import p170ic.C87688b;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.a0 */
public final class C82407a0 extends C87413o implements C32226l<Object, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ JSONArray f241482d;

    /* renamed from: e */
    public final /* synthetic */ ICommLibReader f241483e;

    /* renamed from: f */
    public final /* synthetic */ C83165i f241484f;

    /* renamed from: g */
    public final /* synthetic */ C83780d1 f241485g;

    /* renamed from: h */
    public final /* synthetic */ int f241486h;

    /* renamed from: i */
    public final /* synthetic */ C82411b0 f241487i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C82407a0(JSONArray jSONArray, ICommLibReader iCommLibReader, C83165i iVar, C83780d1 d1Var, int i, C82411b0 b0Var) {
        super(1);
        this.f241482d = jSONArray;
        this.f241483e = iCommLibReader;
        this.f241484f = iVar;
        this.f241485g = d1Var;
        this.f241486h = i;
        this.f241487i = b0Var;
    }

    public Object invoke(Object obj) {
        ArrayMap arrayMap = new ArrayMap(this.f241482d.length());
        C87688b bVar = new C87688b(new C1685z(arrayMap, this.f241485g, this.f241486h, this.f241487i), this.f241482d.length());
        String obj2 = obj != null ? obj.toString() : null;
        boolean z = true;
        if (!(obj2 == null || obj2.length() == 0)) {
            String b = this.f241483e.mo113372b(obj2);
            if (!(b == null || b.length() == 0)) {
                z = false;
            }
            if (z) {
                arrayMap.put(obj2, "file not exists");
                bVar.mo122118a();
            } else {
                C84754j1.m104418b(this.f241484f, new URL(C113600ck.f339986i, WeChatHosts.domainString(C0966R.string.fme), obj2), b, new C82501y(arrayMap, obj2, bVar));
            }
        } else {
            bVar.mo122118a();
        }
        return C13598b0.f38549a;
    }
}
