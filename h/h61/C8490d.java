package h61;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87413o;
import p910lj.C76701a;
import rx3.C13598b0;

/* renamed from: h61.d */
public final class C8490d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f27502d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8490d(String str) {
        super(0);
        this.f27502d = str;
    }

    public Object invoke() {
        Context context = MMApplicationContext.getContext();
        C76701a.makeText(context, (CharSequence) "[MagicEmoji] " + this.f27502d, 0).show();
        return C13598b0.f38549a;
    }
}
