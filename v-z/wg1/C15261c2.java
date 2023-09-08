package wg1;

import a14.C53934p0;
import ak1.C54067f0;
import android.view.MenuItem;
import bl3.C0317e;
import c30.C104289g;
import di3.C86312j;
import ht1.C8777j5;
import nj3.C11184p0;
import qo3.C77407n;
import rx3.C13598b0;
import te3.C49098d51;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: wg1.c2 */
public final class C15261c2 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C15370z1 f41503d;

    /* renamed from: e */
    public final /* synthetic */ C77407n f41504e;

    public C15261c2(C15370z1 z1Var, C77407n nVar) {
        this.f41503d = z1Var;
        this.f41504e = nVar;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        String str;
        String str2;
        C54067f0.C0050b0 b0Var = C54067f0.C0050b0.LIVE_SHARE;
        Class cls = C8777j5.class;
        Integer valueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
        String str3 = "";
        int i2 = 0;
        if (valueOf != null && valueOf.intValue() == 0) {
            C15370z1 z1Var = this.f41503d;
            C0317e.launchUI$default(z1Var, (C66212f) null, (C53934p0) null, new C15274f2(z1Var, (C15601d<? super C15274f2>) null), 3, (Object) null);
            if (!this.f41503d.f41739N.f41642a) {
                C8777j5 j5Var = (C8777j5) C86312j.m106911c(cls);
                C104289g gVar = new C104289g();
                C15370z1 z1Var2 = this.f41503d;
                gVar.mo145953n("type", 2);
                gVar.mo145953n("style_id", z1Var2.f41734I);
                String str4 = z1Var2.f41737L;
                if (str4 == null || str4.length() == 0) {
                    i2 = 1;
                }
                gVar.mo145953n("is_pic", i2 ^ 1);
                C13598b0 b0Var2 = C13598b0.f38549a;
                String gVar2 = gVar.toString();
                C49098d51 d512 = this.f41503d.f41739N.f41643b;
                if (!(d512 == null || (str2 = d512.f132121g) == null)) {
                    str3 = str2;
                }
                j5Var.mo9608aH(b0Var, gVar2, str3);
            }
        } else if (valueOf != null && valueOf.intValue() == 1) {
            C15370z1 z1Var3 = this.f41503d;
            C0317e.launchUI$default(z1Var3, (C66212f) null, (C53934p0) null, new C15277g2(z1Var3, (C15601d<? super C15277g2>) null), 3, (Object) null);
            if (!this.f41503d.f41739N.f41642a) {
                C8777j5 j5Var2 = (C8777j5) C86312j.m106911c(cls);
                C104289g gVar3 = new C104289g();
                C15370z1 z1Var4 = this.f41503d;
                gVar3.mo145953n("type", 1);
                gVar3.mo145953n("style_id", z1Var4.f41734I);
                String str5 = z1Var4.f41737L;
                if (str5 == null || str5.length() == 0) {
                    i2 = 1;
                }
                gVar3.mo145953n("is_pic", i2 ^ 1);
                C13598b0 b0Var3 = C13598b0.f38549a;
                String gVar4 = gVar3.toString();
                C49098d51 d513 = this.f41503d.f41739N.f41643b;
                if (!(d513 == null || (str = d513.f132121g) == null)) {
                    str3 = str;
                }
                j5Var2.mo9608aH(b0Var, gVar4, str3);
            }
        } else if (valueOf != null && valueOf.intValue() == 2) {
            C15370z1 z1Var5 = this.f41503d;
            C0317e.launchUI$default(z1Var5, (C66212f) null, (C53934p0) null, new C15254a2(z1Var5, (C15601d<? super C15254a2>) null), 3, (Object) null);
        }
        this.f41504e.mo107572p();
    }
}
