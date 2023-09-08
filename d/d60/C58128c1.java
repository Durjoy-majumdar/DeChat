package d60;

import android.os.Bundle;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.core.view.LiveVideoView;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import f50.C58924d;
import gy3.C87412m;
import i50.C60251a;
import p50.C62197e;

/* renamed from: d60.c1 */
public final class C58128c1 extends C58121a {

    /* renamed from: f */
    public final C58124b f166515f;

    /* renamed from: g */
    public final String f166516g = "MicroMsg.LiveTXLivePlayerPlygin";

    /* renamed from: h */
    public final LiveVideoView f166517h;

    /* renamed from: i */
    public C58924d f166518i;

    /* renamed from: j */
    public C62197e f166519j;

    /* renamed from: n */
    public int f166520n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58128c1(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f166515f = bVar;
        this.f166517h = (LiveVideoView) viewGroup.findViewById(C0966R.C0970id.fzp);
        viewGroup.setPadding(0, 0, 0, 0);
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal != 8) {
            if (ordinal == 27 || ordinal == 28) {
                mo82898x0(true);
            }
        } else if (!(this.f166519j instanceof C60251a)) {
            mo82898x0(true);
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
    }

    /* renamed from: x0 */
    public final void mo82898x0(boolean z) {
        String str = this.f166516g;
        Log.m105924i(str, "stopPlay, type:" + this.f166520n);
        C62197e eVar = this.f166519j;
        if (eVar != null) {
            eVar.mo87256C0(z);
        }
    }
}
