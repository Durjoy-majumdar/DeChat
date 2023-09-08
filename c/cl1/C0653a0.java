package cl1;

import com.tencent.p014mm.plugin.finder.live.infrastructure.livedata.LiveMutableData;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import fj1.C45795b;
import gy3.C87412m;

/* renamed from: cl1.a0 */
public final class C0653a0 extends C39970c<C45795b> {

    /* renamed from: f */
    public final LiveMutableData<FinderJumpInfo> f1542f = new LiveMutableData<>();

    /* renamed from: g */
    public boolean f1543g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0653a0(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    public void onCleared() {
        super.onCleared();
        this.f1543g = false;
    }
}
