package on1;

import a14.C53934p0;
import bl3.C0317e;
import com.tencent.p014mm.autogen.events.FeedDeleteEvent;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: on1.f */
public final class C11519f extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FeedDeleteEvent f33837d;

    /* renamed from: e */
    public final /* synthetic */ C11533k f33838e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11519f(FeedDeleteEvent feedDeleteEvent, C11533k kVar) {
        super(0);
        this.f33837d = feedDeleteEvent;
        this.f33838e = kVar;
    }

    public Object invoke() {
        this.f33837d.f9154d.getClass();
        FeedDeleteEvent.C1035a aVar = this.f33837d.f9154d;
        long j = aVar.f9155a;
        if (j != 0) {
            this.f33838e.f33860d.mo11504f3(j, false);
        } else {
            C11533k kVar = this.f33838e;
            C0317e.launch$default(kVar.f33860d, (C66212f) null, (C53934p0) null, new C11531j(kVar, aVar.f9156b, (C15601d<? super C11531j>) null), 3, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
