package g23;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.nio.IntBuffer;
import rx3.C13598b0;

/* renamed from: g23.g */
public final class C107704g extends C87413o implements C32226l<IntBuffer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C107701f f322256d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107704g(C107701f fVar) {
        super(1);
        this.f322256d = fVar;
    }

    public Object invoke(Object obj) {
        IntBuffer intBuffer = (IntBuffer) obj;
        C87412m.m108594g(intBuffer, LocaleUtil.ITALIAN);
        C32226l<? super IntBuffer, C13598b0> lVar = this.f322256d.f322243j;
        if (lVar != null) {
            lVar.invoke(intBuffer);
        }
        return C13598b0.f38549a;
    }
}
