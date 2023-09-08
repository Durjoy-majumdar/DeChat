package p669qw;

import a70.C112760b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.p014mm.vfs.VFSStrategy$$b;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import gy3.C87412m;
import h81.C32735h;
import hi2.C32925e;
import hi2.C32927f;
import hi2.C98453h;
import java.util.HashSet;
import p232rw.C101475j;
import z04.C112550d0;

@C86522b
/* renamed from: qw.o */
public final class C36124o extends C86301e implements C101475j {

    /* renamed from: d */
    public final HashSet<String> f96267d = new HashSet<>();

    /* renamed from: e */
    public final HashSet<String> f96268e = new HashSet<>();

    public void P10(String str) {
        if (str != null) {
            Log.m105924i("MicroMsg.MediaFileOptService", "markComponentUseFinish " + str);
            this.f96268e.add(str);
            vx0(str);
        }
    }

    public void pt0(String str) {
        if (str != null) {
            Log.m105924i("MicroMsg.MediaFileOptService", "markBizUseFinish " + str);
            this.f96267d.add(str);
            vx0(str);
        }
    }

    public final void vx0(String str) {
        Class cls = C32735h.class;
        if (this.f96267d.contains(str) && this.f96268e.contains(str)) {
            this.f96267d.remove(str);
            this.f96268e.remove(str);
            if (((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_media_clean_enale_v2, true)) {
                C32925e eVar = C32925e.f89499a;
                VFSStrategy$$b vFSStrategy$$b = VFSStrategy.f348871a;
                String i = C112760b.m154236i0("media").mo119971i();
                C87412m.m108593f(i, "temDir.absolutePath");
                if (C112550d0.m153801u(str, i, true)) {
                    C98453h.f288774a.mo137810h(str);
                    C32927f fVar = C32927f.f89501a;
                    if (((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_media_clean_report_enale, true)) {
                        fVar.mo58867a(str, 2);
                    }
                }
            }
        }
    }
}
