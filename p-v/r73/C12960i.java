package r73;

import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87413o;
import nj3.C76912y0;
import rx3.C13598b0;

/* renamed from: r73.i */
public final class C12960i extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f36983d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12960i(String str) {
        super(0);
        this.f36983d = str;
    }

    public Object invoke() {
        C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) this.f36983d, 2000).show();
        return C13598b0.f38549a;
    }
}
