package fg2;

import android.os.Looper;
import android.os.Message;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.radar.p091ui.RadarTipsView;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import gy3.C87412m;

/* renamed from: fg2.z */
public final class C75765z extends MMHandler {

    /* renamed from: a */
    public final /* synthetic */ RadarTipsView f222367a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75765z(RadarTipsView radarTipsView, Looper looper) {
        super(looper);
        this.f222367a = radarTipsView;
    }

    public void handleMessage(Message message) {
        C87412m.m108594g(message, "msg");
        int i = message.what;
        RadarTipsView radarTipsView = this.f222367a;
        int i2 = RadarTipsView.f203329v;
        radarTipsView.getClass();
        if (i == 0) {
            this.f222367a.mo96948b();
            return;
        }
        RadarTipsView radarTipsView2 = this.f222367a;
        if (i == radarTipsView2.f203336j) {
            if (radarTipsView2.f203342s && radarTipsView2.f203343t) {
                String string = radarTipsView2.getContext().getString(C0966R.string.hr8);
                C87412m.m108593f(string, "context.getString(res)");
                radarTipsView2.mo96952f(string, -1);
            }
        } else if (i == radarTipsView2.f203338o) {
            radarTipsView2.mo96951e();
        } else if (i == radarTipsView2.f203339p) {
            radarTipsView2.mo96947a();
        }
    }
}
