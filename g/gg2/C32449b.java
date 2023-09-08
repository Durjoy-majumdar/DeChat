package gg2;

import android.content.Context;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.xweb.util.FrequentLimiter;
import di3.C86301e;
import di3.C86312j;
import eb0.C75592q0;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import ky2.C10432i;
import ob0.C11385n;
import ob0.C117747y;
import tc0.C37006i;
import tc0.C77885p;
import zt3.C119157j;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: gg2.b */
public class C32449b extends C86301e {

    /* renamed from: d */
    public C11385n f86231d = new C32451b();

    /* renamed from: gg2.b$a */
    public class C32450a implements Runnable {
        public C32450a() {
        }

        public void run() {
            Class cls = C10432i.class;
            if (System.currentTimeMillis() - ((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_READERAPP_REPORT_TIMESTAMP_LONG, 0L)).longValue() >= FrequentLimiter.WEEK_MILLS) {
                C86709a0.m107528h();
                if (Util.nullAsNil((Integer) C86709a0.m107535s().mo121142i().mo119684e(15, (Object) null)) != 0) {
                    C32449b.vx0(C32449b.this);
                } else {
                    C86709a0.m107524d().mo123455a(138, C32449b.this.f86231d);
                }
            }
            if (((C10432i) C86312j.m106911c(cls)).mo10750e() == C75592q0.m90758F() && ((C10432i) C86312j.m106911c(cls)).mo10750e()) {
                ((C119157j) C119157j.f356862d).mo183878i(new C32452c(false), FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
            }
        }
    }

    /* renamed from: gg2.b$b */
    public class C32451b implements C11385n {
        public C32451b() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C86709a0.m107528h();
            if (Util.nullAsNil((Integer) C86709a0.m107535s().mo121142i().mo119684e(15, (Object) null)) != 0) {
                C32449b.vx0(C32449b.this);
                C86709a0.m107524d().mo123470p(138, this);
            }
        }
    }

    public static void vx0(C32449b bVar) {
        bVar.getClass();
        C115669n.INSTANCE.mo160131h(15416, "newsapp", Integer.valueOf((C75592q0.m90785o() & 524288) == 0 ? 1 : 0), Integer.valueOf((C75592q0.m90786p() & 1024) == 0 ? 1 : 0));
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_READERAPP_REPORT_TIMESTAMP_LONG, Long.valueOf(System.currentTimeMillis()));
    }

    public static void wx0(boolean z) {
        int p = C75592q0.m90786p();
        C86709a0.m107535s().mo121142i().mo119676J(40, Integer.valueOf(z ? p & -1025 : p | 1024));
        ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C37006i(26, z ? 2 : 1));
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        ThreadPool.post(new C32450a(), "ReaderAppReport");
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        C86709a0.m107524d().mo123470p(138, this.f86231d);
    }
}
