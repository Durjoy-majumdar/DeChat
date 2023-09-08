package wy2;

import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75597w2;
import gy3.C8479f0;

/* renamed from: wy2.l */
public final class C38402l implements C75597w2.C31525a {

    /* renamed from: a */
    public final /* synthetic */ C8479f0<String> f101309a;

    /* renamed from: b */
    public final /* synthetic */ C75597w2.C31525a f101310b;

    public C38402l(C8479f0<String> f0Var, C75597w2.C31525a aVar) {
        this.f101309a = f0Var;
        this.f101310b = aVar;
    }

    /* renamed from: a */
    public final void mo1109a(String str, boolean z) {
        Log.m105924i("MicroMsg.TextStatus.TextStatusGetContactInterceptor", "[getContact] callback! succ=" + z + ", username=" + str + " talker=" + ((String) this.f101309a.f27484d));
        C75597w2.C31525a aVar = this.f101310b;
        if (aVar != null) {
            aVar.mo1109a(str, z);
        }
    }
}
