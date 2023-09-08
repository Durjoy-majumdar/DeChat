package h21;

import android.os.Handler;
import com.tencent.p014mm.plugin.collect.p038ui.CollectMainUI;
import qo3.C101218e0;

/* renamed from: h21.r */
public class C117040r implements C101218e0.C12907m {

    /* renamed from: a */
    public final /* synthetic */ CollectMainUI f350707a;

    /* renamed from: h21.r$a */
    public class C117041a implements Runnable {
        public C117041a() {
        }

        public void run() {
            C117040r.this.f350707a.hideVKB();
        }
    }

    public C117040r(CollectMainUI collectMainUI) {
        this.f350707a = collectMainUI;
    }

    /* renamed from: a */
    public void mo2001a() {
        CollectMainUI collectMainUI = this.f350707a;
        CollectMainUI.m162068J7(collectMainUI, collectMainUI.f345621n1.f130704g);
        CollectMainUI collectMainUI2 = this.f350707a;
        C101218e0 e0Var = collectMainUI2.f345617k1;
        if (e0Var != null && e0Var.mo140661h()) {
            collectMainUI2.f345617k1.mo140680z();
            collectMainUI2.f345617k1 = null;
        }
        new Handler().postDelayed(new C117041a(), 200);
    }
}
