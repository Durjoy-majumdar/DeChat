package ex2;

import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87413o;
import p910lj.C76701a;
import rx3.C13598b0;

/* renamed from: ex2.a */
public final class C7945a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f26632d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7945a(String str) {
        super(0);
        this.f26632d = str;
    }

    public Object invoke() {
        C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) this.f26632d, 0).show();
        return C13598b0.f38549a;
    }
}
