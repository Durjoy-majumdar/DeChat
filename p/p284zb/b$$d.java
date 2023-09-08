package p284zb;

import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.plugin.appbrand.utils.C84754j1;
import com.tencent.p014mm.sdk.platformtools.Log;
import p1044ub.C90636f;

/* renamed from: zb.b$$d */
public class b$$d implements C84754j1.C84757c {

    /* renamed from: a */
    public final C90636f.C90637a[] f262504a;

    /* renamed from: b */
    public final Object[] f262505b = new Object[1];

    /* renamed from: c */
    public final boolean[] f262506c = new boolean[1];

    /* renamed from: d */
    public int f262507d = 2;

    /* renamed from: e */
    public final /* synthetic */ String f262508e;

    /* renamed from: f */
    public final /* synthetic */ boolean f262509f;

    /* renamed from: g */
    public final /* synthetic */ long f262510g;

    /* renamed from: h */
    public final /* synthetic */ long f262511h;

    /* renamed from: i */
    public final /* synthetic */ C91631b f262512i;

    public b$$d(C91631b bVar, String str, boolean z, long j, long j2) {
        this.f262512i = bVar;
        this.f262508e = str;
        this.f262509f = z;
        this.f262510g = j;
        this.f262511h = j2;
        C90636f.C90637a[] aVarArr = new C90636f.C90637a[1];
        this.f262504a = aVarArr;
        C90636f.C90637a aVar = new C90636f.C90637a();
        aVarArr[0] = aVar;
        aVar.f260398i = str;
    }

    /* renamed from: a */
    public void mo117481a(C80669j.C80676g gVar) {
        this.f262505b[0] = gVar;
        this.f262504a[0].f260400k = (long) gVar.sourceLength;
        mo125503c();
    }

    /* renamed from: b */
    public void mo114825b(String str) {
        this.f262506c[0] = false;
        mo125503c();
    }

    /* renamed from: c */
    public final void mo125503c() {
        int i = this.f262507d - 1;
        this.f262507d = i;
        if (i == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f262509f && this.f262510g > 0) {
                Log.m105925i("MicroMsg.AppBrandJSContextInterface[multicontext]", "loadJsFileWithOptions, appId[%s] initialScript[%s] inject done, cost[%d]ms", this.f262512i.f262488d.getAppId(), this.f262508e, Long.valueOf(currentTimeMillis - this.f262510g));
            }
            this.f262512i.mo122588c(this.f262508e, this.f262509f, this.f262504a, this.f262506c, this.f262505b, this.f262511h, currentTimeMillis);
        }
    }

    public void onSuccess(String str) {
        this.f262506c[0] = true;
        mo125503c();
    }
}
