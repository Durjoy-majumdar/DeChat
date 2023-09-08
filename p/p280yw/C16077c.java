package p280yw;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87413o;
import nj3.C76912y0;
import rx3.C13598b0;

/* renamed from: yw.c */
public final class C16077c extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ int f43225d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16077c(int i) {
        super(0);
        this.f43225d = i;
    }

    public Object invoke() {
        Context context = MMApplicationContext.getContext();
        C76912y0.makeText(context, (CharSequence) "fail，ret:" + this.f43225d, 0).show();
        return C13598b0.f38549a;
    }
}
