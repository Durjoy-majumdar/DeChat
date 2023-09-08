package px0;

import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18355t;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C22521pi1;

/* renamed from: px0.k */
public final class C22047k extends C87413o implements C32226l<C22521pi1, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C22055p f62391d;

    /* renamed from: e */
    public final /* synthetic */ int f62392e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22047k(C22055p pVar, C22039d dVar, int i) {
        super(1);
        this.f62391d = pVar;
        this.f62392e = i;
    }

    public Object invoke(Object obj) {
        C87412m.m108594g((C22521pi1) obj, LocaleUtil.ITALIAN);
        C22055p pVar = this.f62391d;
        int i = this.f62392e;
        int i2 = C22055p.f62409o;
        if (i >= pVar.mo35160a().size()) {
            Log.m105924i("MicroMsg.NativeFinderListHelper", "delete fail, position >= this.finderFeedsList.size");
        } else {
            pVar.mo35160a().get(i).f62373d.f64422R = true;
            pVar.mo35160a().remove(i);
            pVar.mo35162c().notifyItemRemoved(i);
            pVar.mo35162c().notifyItemRangeChanged(i, pVar.mo35160a().size() - i);
            if (pVar.mo35160a().size() == 0) {
                pVar.f62414a.mo22945m(pVar.mo35161b());
            }
            C18355t.m18927f(pVar.mo35161b());
        }
        return C13598b0.f38549a;
    }
}
