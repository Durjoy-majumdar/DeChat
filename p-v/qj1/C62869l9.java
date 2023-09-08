package qj1;

import ak1.C54116w;
import android.content.DialogInterface;
import cl1.C39975j;
import di3.C86312j;
import gy3.C87412m;
import java.util.List;
import rx3.C13598b0;
import sx3.C26236u;
import te3.C50317lw0;

/* renamed from: qj1.l9 */
public final class C62869l9 implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ C62949r8 f178403d;

    /* renamed from: qj1.l9$a */
    public static final class C62870a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C62949r8 f178404d;

        public C62870a(C62949r8 r8Var) {
            this.f178404d = r8Var;
        }

        public final void run() {
            C62949r8 r8Var = this.f178404d;
            int i = C62949r8.f178620X;
            r8Var.mo87885r1();
        }
    }

    public C62869l9(C62949r8 r8Var) {
        this.f178403d = r8Var;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        String str;
        C13598b0 b0Var;
        Class cls = C54116w.class;
        C50317lw0 value = ((C39975j) this.f178403d.mo87696x0(C39975j.class)).f107170j.getValue();
        if (value == null || (str = value.f137677e) == null) {
            str = "";
        }
        String str2 = this.f178403d.f178639T;
        if (str2 != null) {
            if (C87412m.m108589b(str2, "notify@all")) {
                ((C54116w) C86312j.m106911c(cls)).Jx0(1, (List<String>) null, str);
            } else {
                ((C54116w) C86312j.m106911c(cls)).Jx0(2, C26236u.m33719b(str2), str);
            }
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            ((C54116w) C86312j.m106911c(cls)).Jx0(0, (List<String>) null, str);
        }
        C62949r8 r8Var = this.f178403d;
        r8Var.f178639T = null;
        r8Var.f178647v.postDelayed(new C62870a(r8Var), 200);
    }
}
