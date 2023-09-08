package cj1;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import nj3.C76912y0;
import rx3.C13598b0;

/* renamed from: cj1.q2 */
public final class C0586q2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Context f1393d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0586q2(Context context) {
        super(0);
        this.f1393d = context;
    }

    public Object invoke() {
        Context context = this.f1393d;
        C76912y0.makeText(context, (CharSequence) context.getResources().getString(C0966R.string.dk5), 0).show();
        Log.m105924i("Finder.LiveJumpChecker", "checkVoip:" + this.f1393d.getResources().getString(C0966R.string.dk5));
        return C13598b0.f38549a;
    }
}
