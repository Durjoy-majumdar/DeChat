package n13;

import a12.C79450b;
import a70.C79471a;
import com.tencent.p014mm.plugin.p064hp.util.TinkerSyncResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import gy3.C87412m;
import p271xn.C91299o;
import zt3.C119157j;

/* renamed from: n13.e */
public final class C88892e implements C91299o {

    /* renamed from: a */
    public final /* synthetic */ TinkerSyncResponse f256381a;

    /* renamed from: b */
    public final /* synthetic */ long f256382b;

    /* renamed from: c */
    public final /* synthetic */ C86009m1 f256383c;

    public C88892e(TinkerSyncResponse tinkerSyncResponse, long j, C86009m1 m1Var) {
        this.f256381a = tinkerSyncResponse;
        this.f256382b = j;
        this.f256383c = m1Var;
    }

    /* renamed from: a */
    public void mo123278a(int i) {
        if (i == 0) {
            new C79450b(C79471a.f233015c, this.f256381a.f248349r).mo109426d(System.currentTimeMillis() - this.f256382b);
            C88880b bVar = C88880b.f256362a;
            String i2 = this.f256383c.mo119971i();
            C87412m.m108593f(i2, "patchFile.absolutePath");
            bVar.mo123262a(i2, this.f256381a);
        } else {
            C88880b bVar2 = C88880b.f256362a;
            Log.m105920e("MicroMsg.Updater.ManualUpdaterProcessor", "TCPFile Fail:" + i);
        }
        C88880b bVar3 = C88880b.f256362a;
        ((C119157j) C119157j.f356862d).mo183875f(C11111c.f32888d);
    }
}
