package xz2;

import android.content.Context;
import android.os.Bundle;
import android.util.Base64;
import android.widget.FrameLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import go3.C59600d;
import gy3.C87412m;
import p255vr.C65873e;
import qy2.C36206l;
import qy2.C77455o;
import u73.C101982p;
import u73.C14134p0;
import uz2.C52702n1;
import uz2.C65488a0;
import uz2.C65490m;

/* renamed from: xz2.c0 */
public final class C66460c0 implements C36206l {

    /* renamed from: xz2.c0$a */
    public static final class C66461a extends C77455o {
        public C66461a(String str) {
            super(str);
        }

        /* renamed from: d */
        public boolean mo84142d(Context context, Bundle bundle) {
            C65488a0 a0Var = this.f225886b;
            if (a0Var == null || !C87412m.m108589b(a0Var.f188439d, "9")) {
                return false;
            }
            C14134p0 p0Var = new C14134p0();
            p0Var.f39544a = context;
            p0Var.f39545b = 92;
            try {
                byte[] decode = Base64.decode(a0Var.f188442g, 0);
                C52702n1 n1Var = new C52702n1();
                n1Var.parseFrom(decode);
                p0Var.f39547d = n1Var.f147169d;
            } catch (Throwable th) {
                Log.printErrStackTrace("WebSearchStatusService", th, "doJumpSource err", new Object[0]);
            }
            p0Var.f39548e = ((C65873e) C86312j.m106911c(C65873e.class)).ep0(p0Var.f39545b);
            p0Var.f39549f = true;
            ((C101982p) C86312j.m106911c(C101982p.class)).mo6877X6(p0Var);
            return true;
        }

        /* renamed from: j */
        public boolean mo84146j() {
            return false;
        }

        /* renamed from: n */
        public void mo84148n() {
        }
    }

    /* renamed from: IT */
    public C59600d mo84138IT(String str, FrameLayout frameLayout, C65488a0 a0Var, C65490m mVar) {
        C87412m.m108594g(frameLayout, "container");
        C87412m.m108594g(mVar, "pullDownParam");
        return null;
    }

    public C77455o l30(String str) {
        return new C66461a(str);
    }

    public void release() {
    }
}
