package h43;

import b43.C104031a;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wxmm.v2helper;
import d43.C106987a;
import fy3.C32224a;
import gy3.C87413o;
import l33.C109247e;
import rx3.C13598b0;
import v33.C111384c;
import w33.C111725u;

/* renamed from: h43.j0 */
public final class C108093j0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C108077f0 f323692d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108093j0(C108077f0 f0Var) {
        super(0);
        this.f323692d = f0Var;
    }

    public Object invoke() {
        C108109r0 r0Var;
        C108109r0 r0Var2;
        C108107q0 q0Var;
        C108077f0 f0Var = this.f323692d;
        if (f0Var.f323642b != null) {
            int i = 0;
            if (f0Var.f323633D) {
                f0Var.f323633D = false;
                C111725u uVar = C111384c.f333465d;
                if (uVar != null) {
                    uVar.mo163434p(true, Util.milliSecondsToNow(f0Var.f323639J));
                }
            }
            C104031a aVar = f0Var.f323642b;
            boolean z = !(aVar != null ? aVar.mo145634f() : false);
            C104031a aVar2 = f0Var.f323642b;
            if (aVar2 != null) {
                i = ((C106987a) aVar2).f320237b;
            }
            C109247e.vx0().getClass();
            C108126x0 x0Var = f0Var.f323646f;
            if (x0Var != null) {
                int i2 = f0Var.f323661u;
                C108115u uVar2 = x0Var.f323774a;
                if (!(uVar2 == null || (q0Var = uVar2.f323741d) == null)) {
                    q0Var.f323717G = i;
                    q0Var.f323718H = i2;
                    q0Var.f323719I = z;
                }
            }
            if (x0Var != null) {
                int i3 = ((i + v2helper.VOIP_ENC_HEIGHT_LV1) - f0Var.f323660t) % v2helper.VOIP_ENC_HEIGHT_LV1;
                C108128y0 y0Var = x0Var.f323775b;
                if (!(y0Var == null || (r0Var2 = y0Var.f323617j) == null)) {
                    r0Var2.mo143262q(i3);
                }
                C108128y0 y0Var2 = x0Var.f323775b;
                if (!(y0Var2 == null || (r0Var = y0Var2.f323617j) == null)) {
                    r0Var.mo158479j(z);
                }
                C108061b bVar = x0Var.f323777d;
                if (bVar != null) {
                    int i4 = i - 90;
                    C108109r0 r0Var3 = bVar.f323617j;
                    if (r0Var3 != null) {
                        r0Var3.mo143262q(i4);
                    }
                }
            }
            f0Var.f323639J = Util.nowMilliSecond();
        }
        C108077f0.m146404a(this.f323692d);
        return C13598b0.f38549a;
    }
}
