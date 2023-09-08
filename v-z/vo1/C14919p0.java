package vo1;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87413o;
import nj3.C76912y0;
import rx3.C13598b0;

/* renamed from: vo1.p0 */
public final class C14919p0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ int f40946d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14919p0(int i) {
        super(0);
        this.f40946d = i;
    }

    public Object invoke() {
        Context context = MMApplicationContext.getContext();
        C76912y0.makeText(context, (CharSequence) context.getString(this.f40946d), 0).show();
        return C13598b0.f38549a;
    }
}
