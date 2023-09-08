package qj1;

import com.tencent.p014mm.live.core.view.LivePreviewView;
import com.tencent.p014mm.view.ratio.RatioLayout;
import fy3.C32224a;
import gi1.C59463a;
import gi1.C59464c;
import gi1.C59465f;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedList;
import rx3.C13598b0;
import sx3.C36907w;
import v50.C65547a;

/* renamed from: qj1.th */
public final class C63001th extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C62983sh f178762d;

    /* renamed from: e */
    public final /* synthetic */ C59464c f178763e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63001th(C62983sh shVar, C59464c cVar) {
        super(0);
        this.f178762d = shVar;
        this.f178763e = cVar;
    }

    public Object invoke() {
        LivePreviewView livePreviewView = this.f178762d.f178711r;
        LinkedList<C59463a> linkedList = this.f178763e.f169896a;
        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
        for (C59463a aVar : linkedList) {
            String a = aVar.mo84561a();
            C59465f fVar = aVar.f169895b;
            arrayList.add(new C65547a(a, new RatioLayout.C57914a(fVar.f165729a, fVar.f165730b, fVar.f165731c, fVar.f165732d)));
        }
        livePreviewView.mo76419b(arrayList, this.f178763e.f169897b);
        return C13598b0.f38549a;
    }
}
