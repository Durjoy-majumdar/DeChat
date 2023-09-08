package dm0;

import com.tencent.p014mm.sdk.platformtools.Log;
import lp3.C88631d;
import p284zb.C91635f;

/* renamed from: dm0.d */
public class C86347d implements C88631d.C76721a {

    /* renamed from: a */
    public final /* synthetic */ C91635f f251047a;

    /* renamed from: b */
    public final /* synthetic */ int f251048b;

    /* renamed from: c */
    public final /* synthetic */ C86349f f251049c;

    public C86347d(C86349f fVar, C91635f fVar2, int i) {
        this.f251049c = fVar;
        this.f251047a = fVar2;
        this.f251048b = i;
    }

    /* renamed from: a */
    public void mo1720a(Object obj) {
        Log.m105921e("Luggage.JsApiReportPageData", "reportwxaappexpose cgi failed, message = %s", obj);
        this.f251047a.mo109647a(this.f251048b, this.f251049c.mo115109j("fail:cgi fail"));
    }
}
