package n51;

import com.tencent.p014mm.sdk.platformtools.Log;
import kj2.C117407d;
import oa1.C117731d;
import tf3.C37076t;

/* renamed from: n51.a */
public final class C34740a {

    /* renamed from: a */
    public static final C34740a f93398a = new C34740a();

    /* renamed from: a */
    public final void mo59719a(int i, long j, long j2) {
        if (C117731d.m166007c().mo182440a(new C37076t()) == 1) {
            Log.m105924i("MicroMsg.ReportQuickDownload", "report 27518, action:" + i + ", size:" + j + ", type:" + j2);
            C117407d.INSTANCE.mo160131h(27518, Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2));
        }
    }
}
