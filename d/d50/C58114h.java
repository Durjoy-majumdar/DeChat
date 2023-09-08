package d50;

import com.tencent.midas.api.APMidasPayAPI;
import com.tencent.trtc.TRTCCloudDef;
import gy3.C8480h;
import gy3.C87412m;
import java.util.HashMap;
import te3.C64890zp2;

/* renamed from: d50.h */
public final class C58114h {

    /* renamed from: e */
    public static final TRTCCloudDef.TRTCParams f166248e = new TRTCCloudDef.TRTCParams(1400188366, "852082", "eJwtzE0LgkAUheH-creF3pnG8SK0iGhnEOiiwE01U1w-YlBTI-rvibo8zwvnC2mceJ2tIQLpIaynzca*Wn7wxBRIJLmUxhRX59hAJBSiINpoPRc7OK4tRBoVIc7WcjWKCEhK0oFYtOHneFvcM99w5ueZX6hdyQntb6XrkiqPV314HK7qlL9TbM-hof9ctvD7AxQcMac_", 12081, "", "");

    /* renamed from: f */
    public static final C58113g f166249f = new C58113g(APMidasPayAPI.ENV_TEST, 12081, 0, (String) null, 0, 0, (C58107a) null, 0, 0, 0, (HashMap) null, 0, 0, (C64890zp2) null, (String) null, 0, 0, 131068, (C8480h) null);

    /* renamed from: a */
    public TRTCCloudDef.TRTCParams f166250a;

    /* renamed from: b */
    public C58113g f166251b;

    /* renamed from: c */
    public C58110d f166252c;

    /* renamed from: d */
    public final C58112f f166253d;

    public C58114h(TRTCCloudDef.TRTCParams tRTCParams, C58113g gVar, C58110d dVar) {
        C87412m.m108594g(tRTCParams, "trtcParams");
        C87412m.m108594g(gVar, "liveRoomInfo");
        C87412m.m108594g(dVar, "jumpInfo");
        this.f166250a = tRTCParams;
        this.f166251b = gVar;
        this.f166252c = dVar;
        C58112f fVar = new C58112f(false, false, false, 0, false, 31, (C8480h) null);
        this.f166253d = fVar;
        fVar.f166228c = false;
        fVar.f166226a = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58114h)) {
            return false;
        }
        C58114h hVar = (C58114h) obj;
        return C87412m.m108589b(this.f166250a, hVar.f166250a) && C87412m.m108589b(this.f166251b, hVar.f166251b) && C87412m.m108589b(this.f166252c, hVar.f166252c);
    }

    public int hashCode() {
        return (((this.f166250a.hashCode() * 31) + this.f166251b.hashCode()) * 31) + this.f166252c.hashCode();
    }

    public String toString() {
        return "LiveRoomModel(liveRoomInfo=" + this.f166251b + " liveName:" + this.f166251b.f166231a + ", trtcParams=(sdkAppId:" + this.f166250a.sdkAppId + ",uid:" + this.f166250a.userId + ",roomId:" + this.f166250a.roomId + "))";
    }
}
