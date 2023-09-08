package h21;

import android.os.Handler;
import com.tencent.p014mm.plugin.collect.p038ui.CollectMainUI;
import qo3.C101218e0;

/* renamed from: h21.s */
public class C117043s implements C101218e0.C12907m {

    /* renamed from: a */
    public final /* synthetic */ CollectMainUI f350710a;

    /* renamed from: h21.s$a */
    public class C117044a implements Runnable {
        public C117044a() {
        }

        public void run() {
            C117043s.this.f350710a.hideVKB();
        }
    }

    public C117043s(CollectMainUI collectMainUI) {
        this.f350710a = collectMainUI;
    }

    /* renamed from: a */
    public void mo2001a() {
        new Handler().postDelayed(new C117044a(), 200);
        CollectMainUI collectMainUI = this.f350710a;
        CollectMainUI.m162068J7(collectMainUI, collectMainUI.f345621n1.f130705h);
        CollectMainUI collectMainUI2 = this.f350710a;
        C101218e0 e0Var = collectMainUI2.f345617k1;
        if (e0Var != null && e0Var.mo140661h()) {
            collectMainUI2.f345617k1.mo140680z();
            collectMainUI2.f345617k1 = null;
        }
    }
}
