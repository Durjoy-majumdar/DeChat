package fg2;

import android.os.Message;
import com.tencent.p014mm.plugin.radar.p091ui.RadarTipsView;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import gy3.C87412m;

/* renamed from: fg2.v */
public final class C75761v extends MMHandler {

    /* renamed from: a */
    public final /* synthetic */ RadarTipsView f222363a;

    public C75761v(RadarTipsView radarTipsView) {
        this.f222363a = radarTipsView;
    }

    public void handleMessage(Message message) {
        C87412m.m108594g(message, "msg");
        this.f222363a.setVisibility(8);
    }
}
