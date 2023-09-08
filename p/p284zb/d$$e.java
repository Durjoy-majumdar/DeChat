package p284zb;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.utils.C84768n1;

/* renamed from: zb.d$$e */
public final /* synthetic */ class d$$e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C91633d f262551d;

    /* renamed from: e */
    public final /* synthetic */ d$$n f262552e;

    /* renamed from: f */
    public final /* synthetic */ String f262553f;

    /* renamed from: g */
    public final /* synthetic */ String f262554g;

    /* renamed from: h */
    public final /* synthetic */ String f262555h;

    /* renamed from: i */
    public final /* synthetic */ boolean f262556i;

    public /* synthetic */ d$$e(C91633d dVar, d$$n d__n, String str, String str2, String str3, boolean z) {
        this.f262551d = dVar;
        this.f262552e = d__n;
        this.f262553f = str;
        this.f262554g = str2;
        this.f262555h = str3;
        this.f262556i = z;
    }

    public final void run() {
        C91633d dVar = this.f262551d;
        d$$n d__n = this.f262552e;
        String str = this.f262553f;
        String str2 = this.f262554g;
        String str3 = this.f262555h;
        boolean z = this.f262556i;
        dVar.getClass();
        String b = !TextUtils.isEmpty(d__n.f262572c) ? d__n.f262572c : ((C91635f) dVar.mo124764Z()).mo114272k().mo113372b(str);
        C84768n1.m104431g((C81925i2) dVar.mo124764Z(), ((C91635f) dVar.mo124764Z()).getJsRuntime(), str, str2, str3, dVar.mo122610O0(), b, C84768n1.C84773e.LIB, new d$$o(str, b, (C91635f) dVar.mo124764Z(), dVar, z, (d$$h) null));
    }
}
