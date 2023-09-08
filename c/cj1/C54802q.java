package cj1;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: cj1.q */
public final class C54802q extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C54769i f153628d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54802q(C54769i iVar) {
        super(0);
        this.f153628d = iVar;
    }

    public Object invoke() {
        C56032b bVar;
        C56032b bVar2 = this.f153628d.f153504b;
        Context context = bVar2 != null ? bVar2.getContext() : null;
        if (context != null) {
            C54769i iVar = this.f153628d;
            CharSequence b = C54769i.m61632b(iVar, iVar.f153512j, iVar.f153508f);
            C54769i iVar2 = this.f153628d;
            int i = iVar2.f153505c;
            if (i == 1 || i == 2) {
                C56032b bVar3 = iVar2.f153504b;
                if (bVar3 != null) {
                    if (b == null) {
                        b = context.getString(C0966R.string.dgc, new Object[]{Integer.valueOf(iVar2.f153508f)});
                        C87412m.m108593f(b, "context.getString(R.stri…n_time_v2, remainingTime)");
                    }
                    bVar3.updateVerificationCountDownTip(b);
                }
            } else if (i == 3) {
                C56032b bVar4 = iVar2.f153504b;
                if (bVar4 != null) {
                    if (b == null) {
                        b = context.getString(C0966R.string.dgb, new Object[]{Integer.valueOf(iVar2.f153508f)});
                        C87412m.m108593f(b, "context.getString(R.stri…for_limit, remainingTime)");
                    }
                    bVar4.updateVerificationCountDownTip(b);
                }
            } else if (i == 5 && (bVar = iVar2.f153504b) != null) {
                bVar.updateVerificationCountDownTip(b);
            }
        }
        return C13598b0.f38549a;
    }
}
