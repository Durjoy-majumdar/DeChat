package xk1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C54219z;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: xk1.k1 */
public final class C15751k1 extends UIComponent {

    /* renamed from: d */
    public final String f42474d = "Finder.FinderLiveKeyboardUIC";

    /* renamed from: e */
    public KeyboardHeightProvider f42475e;

    /* renamed from: f */
    public final C54219z<C15752a> f42476f = new C54219z<>(new C15752a(false, 0));

    /* renamed from: xk1.k1$a */
    public static final class C15752a {

        /* renamed from: a */
        public final boolean f42477a;

        /* renamed from: b */
        public final int f42478b;

        public C15752a(boolean z, int i) {
            this.f42477a = z;
            this.f42478b = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15752a)) {
                return false;
            }
            C15752a aVar = (C15752a) obj;
            return this.f42477a == aVar.f42477a && this.f42478b == aVar.f42478b;
        }

        public int hashCode() {
            boolean z = this.f42477a;
            if (z) {
                z = true;
            }
            return ((z ? 1 : 0) * true) + this.f42478b;
        }

        public String toString() {
            return "KeyboardChangedInfo(show=" + this.f42477a + ", height=" + this.f42478b + ')';
        }
    }

    /* renamed from: xk1.k1$b */
    public static final class C15753b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C15751k1 f42479d;

        /* renamed from: xk1.k1$b$a */
        public static final class C15754a implements C7020t0 {

            /* renamed from: d */
            public final /* synthetic */ C15751k1 f42480d;

            public C15754a(C15751k1 k1Var) {
                this.f42480d = k1Var;
            }

            /* renamed from: Q1 */
            public final void mo531Q1(int i, boolean z) {
                String str = this.f42480d.f42474d;
                Log.m105924i(str, "onKeyboardHeightChanged, height:" + i + ", isResized:" + z);
                this.f42480d.f42476f.setValue(new C15752a(i > 0, i));
            }
        }

        public C15753b(C15751k1 k1Var) {
            this.f42479d = k1Var;
        }

        public final void run() {
            C15751k1 k1Var = this.f42479d;
            if (k1Var.f42475e == null) {
                k1Var.f42475e = new KeyboardHeightProvider(k1Var.getContext());
                C15751k1 k1Var2 = this.f42479d;
                KeyboardHeightProvider keyboardHeightProvider = k1Var2.f42475e;
                if (keyboardHeightProvider != null) {
                    keyboardHeightProvider.f220015b = new C15754a(k1Var2);
                }
            }
            KeyboardHeightProvider keyboardHeightProvider2 = this.f42479d.f42475e;
            if (keyboardHeightProvider2 != null) {
                keyboardHeightProvider2.mo104022e();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15751k1(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onPause() {
        String str = this.f42474d;
        Log.m105924i(str, "[LiveLifecycler]onPause " + this);
        super.onPause();
        KeyboardHeightProvider keyboardHeightProvider = this.f42475e;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104021d();
        }
    }

    public void onResume() {
        String str = this.f42474d;
        Log.m105924i(str, "[LiveLifecycler]onResume " + this);
        super.onResume();
        MMHandlerThread.postToMainThread(new C15753b(this));
    }
}
