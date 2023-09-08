package ym0;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.C17978c;
import com.tencent.p014mm.plugin.appbrand.utils.C29680s;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import h81.C32735h;
import qn0.C22114c;
import rn0.C22242c;
import rs0.C22245c;
import rs0.C22247f;

/* renamed from: ym0.b */
public class C91507b implements C23313f {
    /* renamed from: a */
    public C17978c mo35199a(Context context, int i) {
        Log.m105925i("MicroMsg.NonSameLayer.AppBrandVideoNonSameLayerStrategy", "createVideoView, playerHint: %d", Integer.valueOf(i));
        if ((i & 1) != 0) {
            C32735h hVar = (C32735h) C86312j.m106911c(C32735h.class);
            boolean wf = hVar != null ? hVar.mo58784wf(C32735h.C32737c.clicfg_android_wxa_reward_video_enable_tp2, true) : true;
            Log.m105924i("MicroMsg.SameLayer.AppBrandAVABTests", "canRewardVideoUseThumbPlayer, " + wf);
            Log.m105925i("MicroMsg.NonSameLayer.AppBrandVideoNonSameLayerStrategy", "createVideoView, canRewardVideoUseThumbPlayer: %b", Boolean.valueOf(wf));
            if (!wf) {
                Log.m105924i("MicroMsg.NonSameLayer.AppBrandVideoNonSameLayerStrategy", "createVideoView, use AppBrandExoVideoViewWrapper");
                return new C22114c(context);
            } else if ((i & 2) != 0) {
                Log.m105924i("MicroMsg.NonSameLayer.AppBrandVideoNonSameLayerStrategy", "createVideoView, use Mp4OnlyThumbVideoViewWrapper");
                return new C22247f(context);
            } else {
                Log.m105924i("MicroMsg.NonSameLayer.AppBrandVideoNonSameLayerStrategy", "createVideoView, use AppBrandThumbVideoViewWrapper");
                return new C22245c(context);
            }
        } else {
            int d = C29680s.m38859d();
            Log.m105924i("MicroMsg.NonSameLayer.AppBrandVideoNonSameLayerStrategy", "createVideoView, playerType: " + d);
            if (d == 3) {
                Log.m105924i("MicroMsg.NonSameLayer.AppBrandVideoNonSameLayerStrategy", "createVideoView, use SystemVideoViewWrapper");
                return new C22242c(context);
            } else if (d != 5) {
                Log.m105924i("MicroMsg.NonSameLayer.AppBrandVideoNonSameLayerStrategy", "createVideoView, use AppBrandExoVideoViewWrapper");
                return new C22114c(context);
            } else {
                Log.m105924i("MicroMsg.NonSameLayer.AppBrandVideoNonSameLayerStrategy", "createVideoView, use AppBrandThumbVideoViewWrapper");
                return new C22245c(context);
            }
        }
    }

    public String getName() {
        return "Factory#AppBrandVideoNonSameLayerStrategy";
    }
}
