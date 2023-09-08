package bn2;

import android.os.CancellationSignal;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.setting.p102ui.fixtools.FixToolsFileListUI;
import hn2.C117099c;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import qo3.C89779i0;
import zt3.C119157j;

/* renamed from: bn2.d */
public final class C0332d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CancellationSignal f907d;

    /* renamed from: e */
    public final /* synthetic */ C89779i0 f908e;

    /* renamed from: f */
    public final /* synthetic */ FixToolsFileListUI f909f;

    /* renamed from: bn2.d$a */
    public static final class C0333a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C89779i0 f910d;

        /* renamed from: e */
        public final /* synthetic */ boolean f911e;

        /* renamed from: f */
        public final /* synthetic */ FixToolsFileListUI f912f;

        public C0333a(C89779i0 i0Var, boolean z, FixToolsFileListUI fixToolsFileListUI) {
            this.f910d = i0Var;
            this.f911e = z;
            this.f912f = fixToolsFileListUI;
        }

        public final void run() {
            this.f910d.dismiss();
            if (this.f911e) {
                View findViewById = this.f912f.findViewById(C0966R.C0970id.oov);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsFileListUI$startScan$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(findViewById, "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsFileListUI$startScan$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View findViewById2 = this.f912f.findViewById(C0966R.C0970id.m3z);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                View view = findViewById2;
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsFileListUI$startScan$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsFileListUI$startScan$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    public C0332d(CancellationSignal cancellationSignal, C89779i0 i0Var, FixToolsFileListUI fixToolsFileListUI) {
        this.f907d = cancellationSignal;
        this.f908e = i0Var;
        this.f909f = fixToolsFileListUI;
    }

    public final void run() {
        boolean a = C117099c.m165129a(this.f907d);
        ((C119157j) C119157j.f356862d).mo183895z(new C0333a(this.f908e, a, this.f909f));
    }
}
