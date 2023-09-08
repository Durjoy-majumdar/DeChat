package x02;

import a12.C79455h;
import a70.C112760b;
import com.tencent.p014mm.app.C80589e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.p014mm.vfs.VFSStrategy$$b;
import iv3.C87825c;
import p271xn.C91299o;

public final /* synthetic */ class g$$a implements C91299o {

    /* renamed from: a */
    public final /* synthetic */ C86009m1 f261315a;

    public /* synthetic */ g$$a(C86009m1 m1Var) {
        this.f261315a = m1Var;
    }

    /* renamed from: a */
    public final void mo123278a(int i) {
        C86009m1 m1Var = this.f261315a;
        if (i == 0) {
            String i2 = m1Var.mo119971i();
            if (C79455h.f232995a) {
                C87825c.m109282a(C80589e.f235760a.getApplication(), i2);
            } else {
                throw new RuntimeException("upgrade patch but tinker is not installed");
            }
        } else {
            Log.m105921e("Tinker.HotPatchApplyService", "TCPFile Fail:%d", Integer.valueOf(i));
        }
        VFSStrategy$$b vFSStrategy$$b = VFSStrategy.f348871a;
        C86009m1[] u = C112760b.m154236i0("TPCFileTemp").mo119984u();
        if (u != null) {
            for (C86009m1 f : u) {
                f.mo119966f();
            }
        }
    }
}
