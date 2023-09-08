package bz1;

import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75597w2;
import gy3.C8479f0;

/* renamed from: bz1.m */
public final class C28445m implements C75597w2.C31525a {

    /* renamed from: a */
    public final /* synthetic */ C8479f0<String> f78205a;

    /* renamed from: b */
    public final /* synthetic */ C75597w2.C31525a f78206b;

    public C28445m(C8479f0<String> f0Var, C75597w2.C31525a aVar) {
        this.f78205a = f0Var;
        this.f78206b = aVar;
    }

    /* renamed from: a */
    public final void mo1109a(String str, boolean z) {
        Log.m105924i("GameLife.GetContactInterceptor", "[getContact] callback! succ=" + z + ", username=" + str + " talker=" + ((String) this.f78205a.f27484d));
        C75597w2.C31525a aVar = this.f78206b;
        if (aVar != null) {
            aVar.mo1109a(str, z);
        }
    }
}
