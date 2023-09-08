package yj1;

import com.tencent.p014mm.C0966R;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C51068r71;
import te3.C52173yv0;

/* renamed from: yj1.f */
public final class C16033f extends C87413o implements C32226l<Long, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C16029e f43130d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16033f(C16029e eVar) {
        super(1);
        this.f43130d = eVar;
    }

    public Object invoke(Object obj) {
        C52173yv0 yv02;
        long longValue = ((Number) obj).longValue();
        C16029e eVar = this.f43130d;
        C51068r71 r712 = eVar.f43125h;
        if (!(r712 == null || (yv02 = r712.f140743f) == null)) {
            yv02.f145533e = longValue;
            eVar.f43124g.setText(eVar.f43118a.getResources().getString(C0966R.string.mwk, new Object[]{Long.valueOf(longValue)}));
            eVar.f43119b.mo14208N(yv02, false);
            eVar.f43121d.invoke();
        }
        return C13598b0.f38549a;
    }
}
