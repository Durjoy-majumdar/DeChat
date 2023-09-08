package dr1;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import er1.C58780v1;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: dr1.w */
public final class C58431w extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C58426v f167397d;

    /* renamed from: e */
    public final /* synthetic */ long f167398e;

    /* renamed from: f */
    public final /* synthetic */ int f167399f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58431w(C58426v vVar, long j, int i) {
        super(1);
        this.f167397d = vVar;
        this.f167398e = j;
        this.f167399f = i;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, LocaleUtil.ITALIAN);
        C58780v1.f168288a.mo83841c(this.f167397d.f167389f, this.f167398e, this.f167399f, str);
        return C13598b0.f38549a;
    }
}
