package gl1;

import al1.C54127h;
import android.os.Bundle;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import d60.C58124b;
import fy3.C32230s;
import gh1.C59447j;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;
import te3.C52005xq0;
import vk1.C65761b;

/* renamed from: gl1.m */
public final class C59569m extends C87413o implements C32230s<Boolean, Integer, Integer, String, Bundle, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59559k f170272d;

    /* renamed from: e */
    public final /* synthetic */ C52005xq0 f170273e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59569m(C59559k kVar, C52005xq0 xq02) {
        super(5);
        this.f170272d = kVar;
        this.f170273e = xq02;
    }

    /* renamed from: D */
    public Object mo237D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        C54127h data;
        LiveRoomControllerStore liveRoomControllerStore;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int intValue = ((Number) obj2).intValue();
        ((Number) obj3).intValue();
        String str = (String) obj4;
        Bundle bundle = (Bundle) obj5;
        if (booleanValue) {
            C65761b bVar = this.f170272d.f166842f;
            if (bVar != null) {
                C58124b.C7172a.m7372a(bVar, C58124b.C58125b.START_LIVE, (Bundle) null, 2, (Object) null);
            }
            C65761b bVar2 = this.f170272d.f166842f;
            if (!(bVar2 == null || (data = bVar2.getData()) == null || (liveRoomControllerStore = data.f151979f) == null)) {
                C59447j.f169870a.mo84556h(liveRoomControllerStore, this.f170273e);
            }
            FinderLiveService.f159376d.mo77652z(1);
        } else {
            C61926c.m72668M(new C59566l(this.f170272d, str, intValue));
        }
        return C13598b0.f38549a;
    }
}
