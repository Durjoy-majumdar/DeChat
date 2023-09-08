package cj1;

import android.os.Bundle;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import d60.C58124b;
import fy3.C32224a;
import gh1.C59447j;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: cj1.y4 */
public final class C54846y4 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public static final C54846y4 f153751d = new C54846y4();

    public C54846y4() {
        super(0);
    }

    public Object invoke() {
        FinderLiveService.f159376d.getClass();
        C56032b bVar = FinderLiveService.f159379g;
        if (bVar != null) {
            C58124b.C7172a.m7372a(bVar, C58124b.C58125b.LIVE_HAS_FINISHED, (Bundle) null, 2, (Object) null);
        }
        LiveRoomControllerStore liveRoomControllerStore = FinderLiveService.f159349B;
        if (liveRoomControllerStore != null) {
            C59447j.f169870a.mo84549a(liveRoomControllerStore);
        }
        return C13598b0.f38549a;
    }
}
