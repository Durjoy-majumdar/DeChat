package t70;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import h81.C32735h;
import p761yd.C38993b;
import rx3.C13598b0;

/* renamed from: t70.a */
public final class C36960a implements C36961c {

    /* renamed from: d */
    public static final C36960a f98035d = new C36960a();

    /* renamed from: a */
    public boolean mo56355a(boolean z, int i, C32226l<Object, C13598b0> lVar) {
        boolean z2 = false;
        if (C38993b.m41993c(C32735h.C32737c.clicfg_matrix_memory_trigger_dumpsys_enable, false) || BuildInfo.ENABLE_MATRIX_MEMORY_TRIGGERS || z) {
            z2 = true;
        }
        if (z2) {
            Log.m105924i("MicroMsg.triggers.DumpsysMemInfo", "DumpsysMemInfoTrigger: ");
        }
        return z2;
    }
}
