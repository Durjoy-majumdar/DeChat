package tf1;

import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fy3.C32224a;
import gy3.C87413o;
import java.util.LinkedList;
import rx3.C13598b0;
import zp3.C16389w;

/* renamed from: tf1.h */
public final class C13907h extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C13900g<C13914m> f39084d;

    /* renamed from: e */
    public final /* synthetic */ boolean f39085e;

    /* renamed from: f */
    public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f39086f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13907h(C13900g<C13914m> gVar, boolean z, RefreshLoadMoreLayout.C7080c<Object> cVar) {
        super(0);
        this.f39084d = gVar;
        this.f39085e = z;
        this.f39086f = cVar;
    }

    public Object invoke() {
        LinkedList<C16389w> linkedList = this.f39084d.f39067a;
        boolean z = this.f39085e;
        RefreshLoadMoreLayout.C7080c<Object> cVar = this.f39086f;
        synchronized (linkedList) {
            for (C16389w wVar : linkedList) {
                if (z) {
                    wVar.onPreFinishLoadMoreSmooth(cVar);
                } else {
                    wVar.onPreFinishLoadMore(cVar);
                }
            }
        }
        return C13598b0.f38549a;
    }
}
