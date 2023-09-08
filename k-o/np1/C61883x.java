package np1;

import com.tencent.p014mm.sdk.platformtools.Log;
import di0.C86297n;
import di0.C86299o;
import di3.C86312j;
import fj1.C45795b;
import kr0.C88273g1;
import kr0.C88274h0;

/* renamed from: np1.x */
public final class C61883x implements C86297n {

    /* renamed from: a */
    public final /* synthetic */ C45795b f175968a;

    /* renamed from: b */
    public final /* synthetic */ C86299o f175969b;

    /* renamed from: c */
    public final /* synthetic */ long f175970c;

    /* renamed from: d */
    public final /* synthetic */ boolean f175971d;

    public C61883x(C45795b bVar, C86299o oVar, long j, boolean z) {
        this.f175968a = bVar;
        this.f175969b = oVar;
        this.f175970c = j;
        this.f175971d = z;
    }

    /* renamed from: a */
    public void mo1541a(int i, String str) {
        C61882w wVar = C61882w.f175962a;
        wVar.getClass();
        String str2 = C61882w.f175963b;
        Log.m105924i(str2, "prerender mini pro fail,errCode:" + i + ",errMsg:" + str);
        if (this.f175971d) {
            wVar.mo86815b(this.f175969b);
            Log.m105924i(str2, "[prepareEnv]");
            ((C88274h0) C86312j.m106911c(C88274h0.class)).mo113305TH(C88273g1.FINDER_LIVING);
            C61882w.f175964c = true;
        }
        C45795b bVar = this.f175968a;
        if (bVar != null) {
            C61855c0.f175880a.mo86788a(bVar, this.f175969b, this.f175970c, System.currentTimeMillis());
        }
    }

    public void onSuccess() {
        C61882w.f175962a.getClass();
        Log.m105924i(C61882w.f175963b, "prerender mini pro success!");
        C45795b bVar = this.f175968a;
        if (bVar != null) {
            C61855c0.f175880a.mo86788a(bVar, this.f175969b, this.f175970c, System.currentTimeMillis());
        }
    }
}
