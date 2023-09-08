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
import fy3.C32230s;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: h60.m */
public final class C59762m extends C87413o implements C32230s<Boolean, Integer, String, C58113g, TRTCCloudDef.TRTCParams, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ LiveAnchorPluginLayout f170655d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59762m(LiveAnchorPluginLayout liveAnchorPluginLayout) {
        super(5);
        this.f170655d = liveAnchorPluginLayout;
    }

    /* renamed from: D */
    public Object mo237D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int intValue = ((Number) obj2).intValue();
        String str = (String) obj3;
        C58113g gVar = (C58113g) obj4;
        TRTCCloudDef.TRTCParams tRTCParams = (TRTCCloudDef.TRTCParams) obj5;
        C87412m.m108594g(str, "errMsg");
        C87412m.m108594g(gVar, "liveRoomInfo");
        C87412m.m108594g(tRTCParams, "trtcParams");
        if (booleanValue) {
            RoomLiveService roomLiveService = RoomLiveService.f157190a;
            C58114h hVar = new C58114h(tRTCParams, gVar, new C58110d("com.tencent.mm.live.ui.LiveUIA"));
            RoomLiveService.f157201l = hVar;
            LiveAnchorPluginLayout liveAnchorPluginLayout = this.f170655d;
            C54654a aVar = liveAnchorPluginLayout.f157281P;
            if (aVar != null) {
                C54408d.C54409a.m61122b(aVar, hVar, false, false, 6, (Object) null);
            }
            C54654a aVar2 = liveAnchorPluginLayout.f157281P;
            if (aVar2 != null) {
                aVar2.mo75218i(new C59761l(liveAnchorPluginLayout));
            }
        } else {
            String str2 = "join live fail, errCode:" + intValue;
            C87412m.m108594g(str2, "debugText");
            Log.m105924i("MicroMsg.LiveCoreError", str2);
            LiveAnchorPluginLayout.m62848l(this.f170655d, intValue, str);
        }
        return C13598b0.f38549a;
    }
}
