package pg1;

import cl1.C39970c;
import com.tencent.p014mm.plugin.finder.live.infrastructure.livedata.LiveMutableData;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import fj1.C45795b;
import gy3.C87412m;
import pe3.C89349b;
import te3.C51075r91;

/* renamed from: pg1.b */
public final class C11935b extends C39970c<C45795b> {

    /* renamed from: f */
    public final String f34866f = "LiveOneClickGiftSlice";

    /* renamed from: g */
    public Long f34867g;

    /* renamed from: h */
    public LiveMutableData<C51075r91> f34868h = new LiveMutableData<>();

    /* renamed from: i */
    public C89349b f34869i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11935b(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    public void onCleared() {
        FinderLiveService.f159376d.getClass();
        FinderLiveService.f159383n.mo75800f(17);
        this.f34867g = null;
        this.f34869i = null;
    }
}
