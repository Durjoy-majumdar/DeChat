package v82;

import com.tencent.p014mm.plugin.multitalk.model.C105770a;
import com.tencent.p014mm.plugin.multitalk.p078ui.widget.C105895a;
import eb0.C75592q0;
import gy3.C87412m;

/* renamed from: v82.j1 */
public class C111467j1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f333724d;

    /* renamed from: e */
    public final /* synthetic */ C105895a f333725e;

    public C111467j1(C105895a aVar, boolean z) {
        this.f333725e = aVar;
        this.f333724d = z;
    }

    public void run() {
        boolean z = true;
        this.f333725e.f315022A.setChecked(!this.f333724d);
        C105770a aVar = this.f333725e.f315050g;
        boolean z2 = this.f333724d;
        aVar.getClass();
        String s = C75592q0.m90789s();
        C87412m.m108593f(s, "getUsernameFromUserInfo()");
        C111433e f = aVar.mo150704f(s);
        if (f != null) {
            int i = 0;
            if (f.f333625z == null) {
                z = false;
            }
            if (!z) {
                f = null;
            }
            if (f != null) {
                if (!z2) {
                    i = 8;
                }
                f.mo163110E(i);
            }
        }
    }
}
