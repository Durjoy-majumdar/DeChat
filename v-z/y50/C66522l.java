package y50;

import c30.C104289g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.trtc.TRTCCloudDef;
import d50.C58107a;
import d50.C58113g;
import d50.C7170j;
import di3.C86312j;
import gy3.C87412m;
import java.util.HashMap;
import java.util.LinkedList;
import k50.C60971a;
import p682rz.C36594q;
import pe3.C47465a;
import sf0.C48374j0;
import te3.C49317ep2;
import te3.C64265bq2;
import te3.C64293cq2;
import te3.C64323dq2;
import te3.C64733to;
import te3.C64890zp2;

/* renamed from: y50.l */
public final class C66522l {

    /* renamed from: a */
    public static final C66522l f191362a = new C66522l();

    /* renamed from: a */
    public final void mo90608a(String str, C64265bq2 bq22, C49317ep2 ep22, TRTCCloudDef.TRTCParams tRTCParams, C58113g gVar) {
        C87412m.m108594g(str, "name");
        C87412m.m108594g(bq22, "liveSdkInfo");
        C87412m.m108594g(ep22, "liveInfo");
        C87412m.m108594g(tRTCParams, "trtcParams");
        C87412m.m108594g(gVar, "liveRoomInfo");
        tRTCParams.roomId = bq22.f182314f;
        tRTCParams.sdkAppId = bq22.f182312d;
        tRTCParams.privateMapKey = C48374j0.m53713b(bq22.f182317i);
        tRTCParams.userId = bq22.f182313e;
        tRTCParams.userSig = C48374j0.m53713b(bq22.f182316h);
        int i = bq22.f182315g;
        int i2 = 20;
        if (i != 0 && i == 1) {
            i2 = 21;
        }
        tRTCParams.role = i2;
        gVar.f166231a = str;
        gVar.f166232b = ep22.f133050d;
        HashMap<Integer, C7170j> hashMap = gVar.f166241k;
        String str2 = bq22.f182323r;
        C87412m.m108593f(str2, "liveSdkInfo.live_cdn_url");
        hashMap.put(0, new C7170j(str2, 0, ""));
        gVar.f166234d = bq22.f182319n;
        C47465a parseFrom = new C64293cq2().parseFrom(bq22.f182318j.f257327a);
        C87412m.m108592e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.LiveSdkParams");
        C64293cq2 cq22 = (C64293cq2) parseFrom;
        C64890zp2 zp22 = cq22.f182556f;
        gVar.f166233c = zp22.f186808f;
        gVar.f166235e = zp22.f186810h;
        gVar.f166236f = zp22.f186811i;
        mo90609b(cq22, tRTCParams, gVar);
    }

    /* renamed from: b */
    public final void mo90609b(C64293cq2 cq22, TRTCCloudDef.TRTCParams tRTCParams, C58113g gVar) {
        C87412m.m108594g(cq22, "liveSdkParam");
        C87412m.m108594g(gVar, "liveRoomInfo");
        C64323dq2 dq22 = cq22.f182554d;
        C64890zp2 zp22 = cq22.f182556f;
        boolean z = true;
        if (dq22 != null) {
            if (dq22.f182804d > 0) {
                C60971a.C60973b.f173670a.mo85947d().f174711d = dq22.f182804d;
            }
            if (dq22.f182806f > 0) {
                C60971a.C60973b.f173670a.mo85947d().f174712e = dq22.f182806f;
            }
            if (dq22.f182807g > 0) {
                C60971a.C60973b.f173670a.mo85947d().f174713f = dq22.f182807g;
            }
            if (dq22.f182814q > 0) {
                C60971a.C60973b.f173670a.mo85947d().f174714g = dq22.f182814q;
            }
            if (dq22.f182816s > 0) {
                C60971a.C60973b.f173670a.mo85947d().f174715h = dq22.f182816s;
            }
            if (dq22.f182817t > 0) {
                C60971a.C60973b.f173670a.mo85947d().f174716i = dq22.f182817t;
            }
            if (dq22.f182818u > 0) {
                C60971a.C60973b.f173670a.mo85947d().f174717j = dq22.f182818u;
            }
            if (dq22.f182819v > 0) {
                C60971a.C60973b.f173670a.mo85947d().f174718n = dq22.f182819v;
            }
            if (dq22.f182809i > 0) {
                C60971a.C60973b.f173670a.mo85947d().f174720p = dq22.f182809i;
            }
            int i = dq22.f182810j;
            if (i >= 0 && i < 2) {
                C60971a.C60973b.f173670a.mo85947d().f174719o = dq22.f182810j;
            }
        }
        if (zp22 != null && tRTCParams != null) {
            Log.m105924i("MicroMsg.LiveCoreSdk", "userDefineRecordId:" + zp22.f186806d + ',' + zp22.f186807e);
            String str = zp22.f186807e;
            String str2 = zp22.f186806d;
            int i2 = zp22.f186817q;
            String str3 = zp22.f186796Q;
            if (!((C36594q) C86312j.m106911c(C36594q.class)).mo60733UY(5)) {
                i2 = zp22.f186818r;
            }
            gVar.f166239i = zp22.f186818r;
            if (i2 < 100) {
                gVar.f166237g = C58107a.MMLiveStreamSwitchMode_Fixed;
                gVar.f166238h = i2;
            } else if (i2 == 101) {
                gVar.f166237g = C58107a.MMLiveStreamSwitchMode_Auto;
            } else if (i2 == 102) {
                gVar.f166237g = C58107a.MMLiveStreamSwitchMode_ML;
            }
            LinkedList<C64733to> linkedList = zp22.f186812j;
            if (linkedList != null && !linkedList.isEmpty()) {
                z = false;
            }
            if (!z) {
                LinkedList<C64733to> linkedList2 = zp22.f186812j;
                C87412m.m108593f(linkedList2, "channelParams.cdn_trans_info");
                for (C64733to toVar : linkedList2) {
                    HashMap<Integer, C7170j> hashMap = gVar.f166241k;
                    Integer valueOf = Integer.valueOf(toVar.f185623f);
                    String str4 = toVar.f185622e;
                    C87412m.m108593f(str4, "it.url");
                    hashMap.put(valueOf, new C7170j(str4, toVar.f185627j, toVar.f185628n));
                }
            }
            if (!Util.isNullOrNil(str) || !Util.isNullOrNil(str2) || !Util.isNullOrNil(str3)) {
                C104289g gVar2 = new C104289g();
                if (!Util.isNullOrNil(str)) {
                    gVar2.put("userdefine_streamid_main", str);
                }
                if (!Util.isNullOrNil(str2)) {
                    gVar2.put("userdefine_record_id", str2);
                }
                if (!Util.isNullOrNil(str3)) {
                    gVar2.put("userdefine_push_args", str3);
                }
                C104289g gVar3 = new C104289g();
                gVar3.put("Str_uc_params", gVar2);
                tRTCParams.businessInfo = gVar3.toString();
            }
        }
    }
}
