package mo1;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileDraftUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8477a0;
import gy3.C87413o;
import nj3.C76912y0;
import rx3.C13598b0;
import te3.C64621p23;

/* renamed from: mo1.k */
public final class C47089k extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C8477a0 f126528d;

    /* renamed from: e */
    public final /* synthetic */ FinderProfileDraftUIC f126529e;

    /* renamed from: f */
    public final /* synthetic */ C32226l<C64621p23, C13598b0> f126530f;

    /* renamed from: g */
    public final /* synthetic */ C64621p23 f126531g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47089k(C8477a0 a0Var, FinderProfileDraftUIC finderProfileDraftUIC, C32226l<? super C64621p23, C13598b0> lVar, C64621p23 p232) {
        super(0);
        this.f126528d = a0Var;
        this.f126529e = finderProfileDraftUIC;
        this.f126530f = lVar;
        this.f126531g = p232;
    }

    public Object invoke() {
        if (!this.f126528d.f27482d) {
            Log.m105920e("Finder.FinderProfileDraftUIC", "getDetail failed.");
            C76912y0.makeText((Context) this.f126529e.getContext(), (CharSequence) this.f126529e.getString(C0966R.string.dnr), 0).show();
        } else {
            this.f126530f.invoke(this.f126531g);
        }
        return C13598b0.f38549a;
    }
}
