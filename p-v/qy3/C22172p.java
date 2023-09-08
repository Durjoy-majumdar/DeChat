package qy3;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import wy3.C26516w;
import yz3.C23393c;

/* renamed from: qy3.p */
public final class C22172p extends C87413o implements C32226l<C26516w, CharSequence> {

    /* renamed from: d */
    public static final C22172p f62699d = new C22172p();

    public C22172p() {
        super(1);
    }

    public Object invoke(Object obj) {
        C26516w wVar = (C26516w) obj;
        C87412m.m108594g(wVar, "descriptor");
        return C23393c.f67153b.mo36858o(wVar) + APLogFileUtil.SEPARATOR_LOG + C25977r0.f72357a.mo52843c(wVar).mo35265a();
    }
}
