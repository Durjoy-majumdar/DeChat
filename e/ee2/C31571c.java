package ee2;

import be2.C79693c;
import ce2.C28544a;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import fy3.C32226l;
import h81.C32735h;
import p761yd.C38993b;
import rx3.C13598b0;
import t70.C36961c;

/* renamed from: ee2.c */
public final class C31571c implements C36961c {

    /* renamed from: d */
    public static final C31571c f84375d = new C31571c();

    /* renamed from: a */
    public boolean mo56355a(boolean z, int i, C32226l<Object, C13598b0> lVar) {
        boolean z2 = C38993b.m41993c(C32735h.C32737c.clicfg_matrix_memory_trigger_mem_hook_enable, true) || BuildInfo.ENABLE_MATRIX_MEMORY_TRIGGERS || z;
        C86511b bVar = (C86511b) C28544a.INSTANCE.mo56045a(C86511b.class);
        if (!bVar.f251353g.mo118547e() || !z2) {
            return false;
        }
        Log.m105924i("MicroMsg.triggers.MemoryHook", "MemoryHookTrigger: ");
        C86009m1 m1Var = C86511b.f251351n;
        bVar.mo120986r(m1Var.mo119971i(), C86511b.f251352o.mo119971i());
        bVar.mo120987s(true, i);
        C79693c.m96810d(C86511b.f251349i, m1Var);
        return true;
    }
}
