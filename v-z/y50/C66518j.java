package y50;

import android.content.Context;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.trtc.TRTCCloudDef;
import d50.C58107a;
import d50.C58113g;
import d50.C58114h;
import f40.C86709a0;
import fy3.C32230s;
import gy3.C8480h;
import gy3.C87412m;
import java.util.HashMap;
import ob0.C11385n;
import ob0.C117747y;
import rx3.C13598b0;
import te3.C49077d10;
import te3.C49317ep2;
import te3.C51408tk2;
import te3.C64265bq2;
import te3.C64890zp2;
import z50.C53742l;
import z50.C53744o;

/* renamed from: y50.j */
public final class C66518j implements C11385n {

    /* renamed from: d */
    public final String f191353d;

    /* renamed from: e */
    public final String f191354e;

    /* renamed from: f */
    public final Context f191355f;

    /* renamed from: g */
    public C32230s<? super Boolean, ? super Boolean, ? super String, ? super Integer, ? super String, C13598b0> f191356g;

    /* renamed from: h */
    public C32230s<? super Boolean, ? super Integer, ? super String, ? super C58113g, ? super TRTCCloudDef.TRTCParams, C13598b0> f191357h;

    public C66518j(String str, String str2, Context context) {
        C87412m.m108594g(str, "name");
        C87412m.m108594g(str2, "roomId");
        C87412m.m108594g(context, "context");
        this.f191353d = str;
        this.f191354e = str2;
        this.f191355f = context;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3 = i;
        int i4 = i2;
        String str2 = str;
        C117747y yVar2 = yVar;
        boolean z = false;
        String str3 = "";
        if (yVar2 instanceof C53742l) {
            String str4 = "anchor create live error:" + i3 + " code:" + i4 + " msg:" + str2;
            C87412m.m108594g(str4, "debugText");
            Log.m105924i("MicroMsg.LiveCore", str4);
            if (i3 == 0 && i4 == 0) {
                C49077d10 d102 = ((C53742l) yVar2).f150869e;
                if (d102 != null) {
                    if (WeChatEnvironment.hasDebugger() && MultiProcessMMKV.getSingleMMKV("tag_live_core").getBoolean("test_mmkv_live_face_verify", false)) {
                        z = true;
                    }
                    if (!z && d102.f132060e) {
                        C49317ep2 ep22 = d102.f132059d;
                        if (ep22 != null) {
                            RoomLiveService.f157197h = ep22;
                            Log.m105924i("MicroMsg.LaunchLiveRoom", "processCreateLiveResponse live_id:" + RoomLiveService.f157197h.f133050d);
                        }
                        C32230s<? super Boolean, ? super Boolean, ? super String, ? super Integer, ? super String, C13598b0> sVar = this.f191356g;
                        if (sVar != null) {
                            sVar.mo237D(Boolean.TRUE, Boolean.FALSE, "", Integer.valueOf(i2), str2 == null ? str3 : str2);
                        }
                    } else if (Util.isNullOrNil(d102.f132061f)) {
                        C32230s<? super Boolean, ? super Boolean, ? super String, ? super Integer, ? super String, C13598b0> sVar2 = this.f191356g;
                        if (sVar2 != null) {
                            Boolean bool = Boolean.FALSE;
                            sVar2.mo237D(bool, bool, "", Integer.valueOf(i2), str2 == null ? str3 : str2);
                        }
                    } else {
                        C32230s<? super Boolean, ? super Boolean, ? super String, ? super Integer, ? super String, C13598b0> sVar3 = this.f191356g;
                        if (sVar3 != null) {
                            Boolean bool2 = Boolean.FALSE;
                            Boolean bool3 = Boolean.TRUE;
                            String str5 = d102.f132061f;
                            C87412m.m108593f(str5, "response.verify_url");
                            sVar3.mo237D(bool2, bool3, str5, Integer.valueOf(i2), str2 == null ? str3 : str2);
                        }
                    }
                } else {
                    C32230s<? super Boolean, ? super Boolean, ? super String, ? super Integer, ? super String, C13598b0> sVar4 = this.f191356g;
                    if (sVar4 != null) {
                        Boolean bool4 = Boolean.FALSE;
                        sVar4.mo237D(bool4, bool4, "", Integer.valueOf(i2), str2 == null ? str3 : str2);
                    }
                }
            } else {
                Log.m105924i("MicroMsg.LaunchLiveRoom", "launch live room failed");
                C32230s<? super Boolean, ? super Boolean, ? super String, ? super Integer, ? super String, C13598b0> sVar5 = this.f191356g;
                if (sVar5 != null) {
                    Boolean bool5 = Boolean.FALSE;
                    sVar5.mo237D(bool5, bool5, "", Integer.valueOf(i2), str2 == null ? str3 : str2);
                }
            }
            C86709a0.m107529k().f251779b.mo123470p(3501, this);
        } else if (yVar2 instanceof C53744o) {
            String str6 = "visitor join live error:" + i3 + " code:" + i4 + " msg:" + str2;
            C87412m.m108594g(str6, "debugText");
            Log.m105924i("MicroMsg.LiveCore", str6);
            if (i3 == 0 && i4 == 0) {
                C51408tk2 tk22 = ((C53744o) yVar2).f150875e;
                if (tk22 != null) {
                    C64265bq2 bq22 = tk22.f142257e;
                    if (bq22 != null) {
                        RoomLiveService.f157198i = bq22;
                        TRTCCloudDef.TRTCParams tRTCParams = new TRTCCloudDef.TRTCParams();
                        C58113g gVar = new C58113g(this.f191353d, RoomLiveService.f157197h.f133050d, 0, (String) null, 0, 0, (C58107a) null, 0, 0, 0, (HashMap) null, 0, 0, (C64890zp2) null, (String) null, 0, 0, 131068, (C8480h) null);
                        C66522l lVar = C66522l.f191362a;
                        String str7 = this.f191353d;
                        C49317ep2 ep23 = RoomLiveService.f157197h;
                        C64265bq2 bq23 = RoomLiveService.f157198i;
                        if (bq23 == null) {
                            bq23 = new C64265bq2();
                        }
                        lVar.mo90608a(str7, bq23, ep23, tRTCParams, gVar);
                        gVar.f166233c = 0;
                        C64265bq2 bq24 = RoomLiveService.f157198i;
                        long j = ((bq24 != null ? bq24.f182321p : 0) - 60) * ((long) 1000);
                        if (j < 60000) {
                            j = 60000;
                        }
                        C66519j0.f191358d.mo90600d(j);
                        C32230s<? super Boolean, ? super Integer, ? super String, ? super C58113g, ? super TRTCCloudDef.TRTCParams, C13598b0> sVar6 = this.f191357h;
                        if (sVar6 != null) {
                            sVar6.mo237D(Boolean.TRUE, 0, "", gVar, tRTCParams);
                        }
                    }
                } else {
                    C32230s<? super Boolean, ? super Integer, ? super String, ? super C58113g, ? super TRTCCloudDef.TRTCParams, C13598b0> sVar7 = this.f191357h;
                    if (sVar7 != null) {
                        Boolean bool6 = Boolean.FALSE;
                        Integer valueOf = Integer.valueOf(i2);
                        String str8 = str2 == null ? str3 : str2;
                        TRTCCloudDef.TRTCParams tRTCParams2 = C58114h.f166248e;
                        sVar7.mo237D(bool6, valueOf, str8, C58114h.f166249f, C58114h.f166248e);
                    }
                }
            } else {
                Log.m105924i("MicroMsg.LaunchLiveRoom", "launch live room failed");
                C32230s<? super Boolean, ? super Integer, ? super String, ? super C58113g, ? super TRTCCloudDef.TRTCParams, C13598b0> sVar8 = this.f191357h;
                if (sVar8 != null) {
                    Boolean bool7 = Boolean.FALSE;
                    Integer valueOf2 = Integer.valueOf(i2);
                    if (str2 != null) {
                        str3 = str2;
                    }
                    TRTCCloudDef.TRTCParams tRTCParams3 = C58114h.f166248e;
                    sVar8.mo237D(bool7, valueOf2, str3, C58114h.f166249f, C58114h.f166248e);
                }
            }
            C86709a0.m107529k().f251779b.mo123470p(3797, this);
        }
    }
}
