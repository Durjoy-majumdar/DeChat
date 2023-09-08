package cj1;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import fy3.C32224a;
import gy3.C87413o;
import nj3.C76912y0;
import rx3.C13598b0;

/* renamed from: cj1.o */
public final class C54797o extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Context f153618d;

    /* renamed from: e */
    public final /* synthetic */ C54769i f153619e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54797o(Context context, C54769i iVar) {
        super(0);
        this.f153618d = context;
        this.f153619e = iVar;
    }

    public Object invoke() {
        Context context = this.f153618d;
        C76912y0.m92768g(context, context.getResources().getString(C0966R.string.dgd));
        C56032b bVar = this.f153619e.f153504b;
        if (bVar != null) {
            C56032b.hideLoadingLayer$default(bVar, false, 1, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
