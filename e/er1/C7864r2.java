package er1;

import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87413o;
import nj3.C76912y0;
import rx3.C13598b0;

/* renamed from: er1.r2 */
public final class C7864r2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f26467d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7864r2(String str) {
        super(0);
        this.f26467d = str;
    }

    public Object invoke() {
        C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) this.f26467d, 0).show();
        return C13598b0.f38549a;
    }
}
