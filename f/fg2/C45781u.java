package fg2;

import android.os.Message;
import com.tencent.p014mm.plugin.radar.p091ui.RadarStateView;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import gy3.C87412m;

/* renamed from: fg2.u */
public final class C45781u extends MMHandler {

    /* renamed from: a */
    public final /* synthetic */ RadarStateView f123676a;

    public C45781u(RadarStateView radarStateView) {
        this.f123676a = radarStateView;
    }

    public void handleMessage(Message message) {
        C87412m.m108594g(message, "msg");
        RadarStateView radarStateView = this.f123676a;
        int i = RadarStateView.f115873j;
        radarStateView.mo66965d();
        this.f123676a.mo66964c();
    }
}
