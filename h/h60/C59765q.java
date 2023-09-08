package h60;

import b50.C54408d;
import c50.C54654a;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.live.view.LiveAnchorPluginLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.trtc.TRTCCloudDef;
import d50.C58110d;
import d50.C58113g;
import d50.C58114h;
import fy3.C32229r;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: h60.q */
public final class C59765q extends C87413o implements C32229r<Integer, String, C58113g, TRTCCloudDef.TRTCParams, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ LiveAnchorPluginLayout f170658d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59765q(LiveAnchorPluginLayout liveAnchorPluginLayout) {
        super(4);
        this.f170658d = liveAnchorPluginLayout;
    }

    /* renamed from: I */
    public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        String str = (String) obj2;
        C58113g gVar = (C58113g) obj3;
        TRTCCloudDef.TRTCParams tRTCParams = (TRTCCloudDef.TRTCParams) obj4;
        C87412m.m108594g(str, "errMsg");
        C87412m.m108594g(gVar, "liveRoomInfo");
        C87412m.m108594g(tRTCParams, "trtcParams");
        Log.m105924i("MicroMsg.LiveCoreAnchor", "join live room ret:" + intValue);
        if (intValue == 0) {
            C58114h hVar = new C58114h(tRTCParams, gVar, new C58110d("com.tencent.mm.live.ui.LiveUIA"));
            hVar.f166250a.role = 20;
            RoomLiveService.f157201l = hVar;
            C54654a aVar = this.f170658d.f157281P;
            if (aVar != null) {
                C54408d.C54409a.m61122b(aVar, hVar, false, false, 6, (Object) null);
            }
            LiveAnchorPluginLayout liveAnchorPluginLayout = this.f170658d;
            C54654a aVar2 = liveAnchorPluginLayout.f157281P;
            if (aVar2 != null) {
                aVar2.mo75218i(new C59764p(liveAnchorPluginLayout));
            }
        } else {
            LiveAnchorPluginLayout.m62848l(this.f170658d, intValue, str);
        }
        return C13598b0.f38549a;
    }
}
