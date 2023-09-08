package qy3;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import wy3.C26504r0;
import yz3.C23393c;

/* renamed from: qy3.q */
public final class C22173q extends C87413o implements C32226l<C26504r0, CharSequence> {

    /* renamed from: d */
    public static final C22173q f62700d = new C22173q();

    public C22173q() {
        super(1);
    }

    public Object invoke(Object obj) {
        C26504r0 r0Var = (C26504r0) obj;
        C87412m.m108594g(r0Var, "descriptor");
        return C23393c.f67153b.mo36858o(r0Var) + APLogFileUtil.SEPARATOR_LOG + C25977r0.f72357a.mo52842b(r0Var).mo35267a();
    }
}
