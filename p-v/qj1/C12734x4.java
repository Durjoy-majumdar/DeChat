package qj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import dj1.C58291w0;
import gy3.C87412m;
import kotlin.Result;
import o40.C61926c;
import qj1.C12360e8;
import wx3.C15601d;

/* renamed from: qj1.x4 */
public final class C12734x4 implements C12360e8.C12371d {

    /* renamed from: a */
    public final /* synthetic */ C15601d<Boolean> f36476a;

    /* renamed from: b */
    public final /* synthetic */ C12669t4 f36477b;

    public C12734x4(C15601d<? super Boolean> dVar, C12669t4 t4Var) {
        this.f36476a = dVar;
        this.f36477b = t4Var;
    }

    /* renamed from: a */
    public void mo9974a(boolean z, int i, C12360e8.C12371d.C12373b bVar, String str, Long l, int i2, String str2, String str3, C58291w0 w0Var) {
        C87412m.m108594g(bVar, "errType");
        if (z) {
            Log.m105924i("FinderLiveChargePayPluginEx", "after pay left balance:" + l);
        } else {
            int ordinal = bVar.ordinal();
            if (ordinal == 1) {
                C61926c.m72668M(new C12758y4(str3, this.f36477b));
            } else if (ordinal == 2) {
                if (i == 10003) {
                    C61926c.m72668M(new C12253b5(this.f36477b));
                } else {
                    C61926c.m72668M(new C12758y4(str3, this.f36477b));
                }
            }
        }
        this.f36476a.resumeWith(Result.m168114constructorimpl(Boolean.valueOf(z)));
    }
}
