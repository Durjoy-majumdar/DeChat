package fh1;

import a14.C53872d1;
import a14.C53934p0;
import cl1.C0702z0;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.sdk.platformtools.Log;
import gh1.C8313a;
import gy3.C87412m;
import nk1.C11207i;
import o40.C61926c;
import te3.C52005xq0;
import wx3.C15601d;

/* renamed from: fh1.z0 */
public final class C45793z0 extends C8313a {

    /* renamed from: j */
    public final String f123695j = "Finder.LiveDanmakuInputController";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45793z0(LiveRoomControllerStore liveRoomControllerStore) {
        super(liveRoomControllerStore);
        C87412m.m108594g(liveRoomControllerStore, "store");
    }

    /* renamed from: m3 */
    public final void mo71261m3() {
        if (((C0702z0) business(C0702z0.class)).mo670d3()) {
            C11207i.m11066b(this, C53872d1.f151119c, (C53934p0) null, new C45790y0(this, (C15601d<? super C45790y0>) null), 2, (Object) null);
        }
    }

    public void onLiveActivate() {
        Log.m105924i(this.f123695j, "onLiveActivate!");
    }

    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        Log.m105924i(this.f123695j, "onLiveDeactivate!");
    }

    public void onLiveStart(C52005xq0 xq02) {
        super.onLiveStart(xq02);
        boolean u = C61926c.m72696u(xq02 != null ? (int) xq02.f144831W : 0, 16);
        String str = this.f123695j;
        Log.m105924i(str, "onLiveStart enableGetConfigImmediate:" + u + '!');
        if (u) {
            mo71261m3();
        }
    }
}
