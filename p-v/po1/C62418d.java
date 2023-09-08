package po1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Base64;
import android.widget.FrameLayout;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import p145dx.C58457w;
import qy2.C77459z;
import rx3.C13598b0;
import uz2.C52686h1;
import uz2.C52692j1;
import uz2.C52695k1;
import uz2.C65488a0;
import wj2.C66132f;
import z04.C112551y;

/* renamed from: po1.d */
public final class C62418d extends C62415b {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62418d(String str, String str2) {
        super(str, str2);
        C87412m.m108594g(str2, "TAG");
    }

    /* renamed from: a */
    public C77459z mo87467a() {
        return null;
    }

    /* renamed from: d */
    public boolean mo84142d(Context context, Bundle bundle) {
        Context context2 = context;
        Bundle bundle2 = bundle;
        C65488a0 a0Var = this.f225886b;
        int i = 0;
        if (a0Var == null || !C87412m.m108589b(a0Var.f188439d, "14")) {
            return false;
        }
        String str = a0Var.f188442g;
        if (!(str == null || C112551y.m153811k(str))) {
            byte[] decode = Base64.decode(a0Var.f188442g, 0);
            C52692j1 j1Var = new C52692j1();
            j1Var.parseFrom(decode);
            C52686h1 h1Var = j1Var.f147148f;
            long j = 0;
            if (!(h1Var != null && h1Var.f147133d == 0)) {
                String str2 = null;
                String str3 = h1Var != null ? h1Var.f147134e : null;
                if (!(str3 == null || str3.length() == 0)) {
                    C7335d c = C86312j.m106911c(C58457w.class);
                    C87412m.m108593f(c, "getService(IRingtoneService::class.java)");
                    C58457w wVar = (C58457w) c;
                    C87412m.m108592e(context2, "null cannot be cast to non-null type android.app.Activity");
                    Activity activity = (Activity) context2;
                    String str4 = "";
                    String string = bundle2 != null ? bundle2.getString("userName", str4) : str4;
                    C87412m.m108593f(string, "getClickUserName(extParam)");
                    C66132f fVar = new C66132f();
                    C52686h1 h1Var2 = j1Var.f147148f;
                    if (h1Var2 != null) {
                        j = h1Var2.f147133d;
                    }
                    fVar.f190092o = j;
                    if (h1Var2 != null) {
                        str2 = h1Var2.f147134e;
                    }
                    if (str2 != null) {
                        str4 = str2;
                    }
                    fVar.f190093p = str4;
                    C52695k1 k1Var = j1Var.f147147e;
                    if (k1Var != null) {
                        i = k1Var.f147153d;
                    }
                    fVar.f190094q = i;
                    C13598b0 b0Var = C13598b0.f38549a;
                    wVar.mo82788KG(activity, 1, string, 10, false, fVar);
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public CharSequence mo84145i() {
        return "";
    }

    /* renamed from: p */
    public boolean mo84851p(FrameLayout frameLayout) {
        C87412m.m108594g(frameLayout, "container");
        return false;
    }
}
