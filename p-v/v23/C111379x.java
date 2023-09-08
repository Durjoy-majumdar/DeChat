package v23;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8479f0;
import gy3.C87412m;
import kg3.C76577a;
import lh2.C99417a;
import qh2.C101198e;
import qo3.C89779i0;
import zt3.C119157j;

/* renamed from: v23.x */
public final class C111379x extends C99417a {

    /* renamed from: f */
    public Context f333434f;

    /* renamed from: g */
    public final String f333435g = "MicroMsg.TimelineLoadingPlugin";

    /* renamed from: h */
    public C89779i0 f333436h;

    /* renamed from: v23.x$a */
    public static final class C111380a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C111379x f333437d;

        public C111380a(C111379x xVar) {
            this.f333437d = xVar;
        }

        public final void run() {
            C89779i0 i0Var = this.f333437d.f333436h;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            this.f333437d.f333436h = null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111379x(Context context, C101198e eVar) {
        super(eVar, (String) null);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(eVar, "status");
        this.f333434f = context;
    }

    /* renamed from: y */
    public static void m151864y(C111379x xVar, Integer num, int i, Object obj) {
        boolean z = true;
        Boolean bool = null;
        if ((i & 1) != 0) {
            num = null;
        }
        String str = xVar.f333435g;
        StringBuilder sb = new StringBuilder();
        sb.append("showLoading: ");
        C89779i0 i0Var = xVar.f333436h;
        if (i0Var != null) {
            bool = Boolean.valueOf(i0Var.isShowing());
        }
        sb.append(bool);
        Log.m105924i(str, sb.toString());
        C89779i0 i0Var2 = xVar.f333436h;
        if (i0Var2 == null || !i0Var2.isShowing()) {
            z = false;
        }
        if (!z) {
            C8479f0 f0Var = new C8479f0();
            f0Var.f27484d = C76577a.m92166q(xVar.f333434f, C0966R.string.gas);
            if (num != null) {
                num.intValue();
                f0Var.f27484d = C76577a.m92166q(xVar.f333434f, num.intValue());
            }
            ((C119157j) C119157j.f356862d).mo183895z(new C111381y(xVar, f0Var));
        }
    }

    /* renamed from: x */
    public final void mo163044x() {
        Log.m105924i(this.f333435g, "hideLoading: ");
        ((C119157j) C119157j.f356862d).mo183895z(new C111380a(this));
    }
}
