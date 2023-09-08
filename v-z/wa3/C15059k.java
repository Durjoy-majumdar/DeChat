package wa3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import f40.C86709a0;

/* renamed from: wa3.k */
public class C15059k {

    /* renamed from: a */
    public static volatile boolean f41193a;

    /* renamed from: a */
    public static void m14229a() {
        StringBuilder sb = new StringBuilder();
        C86709a0.m107528h();
        sb.append(C86709a0.m107535s().f251806d);
        sb.append("wenote/");
        C86009m1 m1Var = new C86009m1(sb.toString());
        if (!m1Var.mo119967g() || !m1Var.mo119977o()) {
            Log.m105924i("MicroMsg.WNNoteInit", "record stg dir[%s] not exsit, create it");
            m1Var.mo119987x();
        }
    }
}
