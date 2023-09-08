package y50;

import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.trtc.TRTCCloudDef;
import d50.C58107a;
import d50.C58113g;
import d50.C58114h;
import f40.C86709a0;
import fy3.C32229r;
import gy3.C8480h;
import gy3.C87412m;
import java.util.HashMap;
import ob0.C11385n;
import ob0.C117747y;
import rx3.C13598b0;
import te3.C49317ep2;
import te3.C51408tk2;
import te3.C64265bq2;
import te3.C64890zp2;
import z50.C53744o;

/* renamed from: y50.i */
public final class C66516i implements C11385n {

    /* renamed from: d */
    public final long f191343d;

    /* renamed from: e */
    public final String f191344e;

    /* renamed from: f */
    public final boolean f191345f;

    /* renamed from: g */
    public C32229r<? super Integer, ? super String, ? super C58113g, ? super TRTCCloudDef.TRTCParams, C13598b0> f191346g;

    public C66516i(long j, String str, String str2, boolean z, int i, C8480h hVar) {
        z = (i & 8) != 0 ? false : z;
        C87412m.m108594g(str, "wechatRoomId");
        C87412m.m108594g(str2, "liveName");
        this.f191343d = j;
        this.f191344e = str;
        this.f191345f = z;
    }

    /* renamed from: a */
    public final void mo90593a(C32229r<? super Integer, ? super String, ? super C58113g, ? super TRTCCloudDef.TRTCParams, C13598b0> rVar) {
        C86709a0.m107529k().f251779b.mo123455a(3797, this);
        C86709a0.m107529k().f251779b.mo123460f(new C53744o(this.f191343d, this.f191344e, RoomLiveService.f157196g));
        this.f191346g = rVar;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3 = i;
        int i4 = i2;
        C117747y yVar2 = yVar;
        if (yVar2 instanceof C53744o) {
            Log.m105924i("MicroMsg.JoinLiveRoom", "JoinLiveRoom on SceneEnd");
            String str2 = "";
            if (i3 == 0 && i4 == 0) {
                C51408tk2 tk22 = ((C53744o) yVar2).f150875e;
                RoomLiveService roomLiveService = RoomLiveService.f157190a;
                C64265bq2 bq22 = tk22 != null ? tk22.f142257e : null;
                RoomLiveService.f157198i = bq22;
                if (bq22 != null) {
                    TRTCCloudDef.TRTCParams tRTCParams = new TRTCCloudDef.TRTCParams();
                    C58113g gVar = new C58113g((String) null, 0, 0, (String) null, 0, 0, (C58107a) null, 0, 0, 0, (HashMap) null, 0, 0, (C64890zp2) null, (String) null, 0, 0, 131071, (C8480h) null);
                    C66522l lVar = C66522l.f191362a;
                    C49317ep2 ep22 = RoomLiveService.f157197h;
                    String str3 = ep22.f133051e;
                    lVar.mo90608a(str3 == null ? str2 : str3, bq22, ep22, tRTCParams, gVar);
                    if (this.f191345f) {
                        gVar.f166233c = 0;
                    }
                    long j = (bq22.f182321p - 60) * ((long) 1000);
                    if (j < 60000) {
                        j = 60000;
                    }
                    C66519j0.f191358d.mo90600d(j);
                    C32229r<? super Integer, ? super String, ? super C58113g, ? super TRTCCloudDef.TRTCParams, C13598b0> rVar = this.f191346g;
                    if (rVar != null) {
                        rVar.mo162I(0, str2, gVar, tRTCParams);
                    }
                }
            } else {
                Log.m105924i("MicroMsg.JoinLiveRoom", "join live room failed " + i3 + ' ' + i4);
                C32229r<? super Integer, ? super String, ? super C58113g, ? super TRTCCloudDef.TRTCParams, C13598b0> rVar2 = this.f191346g;
                if (rVar2 != null) {
                    Integer valueOf = Integer.valueOf(i2);
                    if (str != null) {
                        str2 = str;
                    }
                    TRTCCloudDef.TRTCParams tRTCParams2 = C58114h.f166248e;
                    rVar2.mo162I(valueOf, str2, C58114h.f166249f, C58114h.f166248e);
                }
            }
            C86709a0.m107529k().f251779b.mo123470p(3797, this);
        }
    }
}
