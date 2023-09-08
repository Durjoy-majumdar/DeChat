package cl1;

import com.tencent.p014mm.plugin.finder.live.infrastructure.livedata.LiveMutableData;
import fj1.C45795b;
import gy3.C87412m;

/* renamed from: cl1.p1 */
public final class C0678p1 extends C39970c<C45795b> {

    /* renamed from: f */
    public boolean f1596f;

    /* renamed from: g */
    public LiveMutableData<Boolean> f1597g = new LiveMutableData<>();

    /* renamed from: h */
    public boolean f1598h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0678p1(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    public void onCleared() {
        this.f1596f = false;
    }
}
