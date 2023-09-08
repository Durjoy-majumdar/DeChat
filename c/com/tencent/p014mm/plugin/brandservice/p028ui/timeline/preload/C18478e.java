package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload;

import android.database.Cursor;
import c30.C104289g;
import c30.C26827e;
import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$BizNames;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.C19625p0;
import com.tencent.p014mm.storage.C19627t;
import com.tencent.p014mm.storage.C30763p;
import com.tencent.p014mm.storage.C30766q;
import com.tencent.p014mm.storage.C44671x;
import di3.C86312j;
import ex0.C45696d;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p005bg.C0277c;
import r73.C26115e;
import rb0.C48009v0;
import rx3.C13598b0;
import sx3.C64197v;
import vx3.C90875b;
import z04.C112551y;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.e */
public final class C18478e implements C26115e {

    /* renamed from: d */
    public final /* synthetic */ C40698a f51304d;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.e$a */
    public static final class C2128a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f12094d;

        /* renamed from: e */
        public final /* synthetic */ C40698a f12095e;

        /* renamed from: f */
        public final /* synthetic */ String f12096f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2128a(String str, C40698a aVar, String str2) {
            super(0);
            this.f12094d = str;
            this.f12095e = aVar;
            this.f12096f = str2;
        }

        public Object invoke() {
            boolean j0 = ((C0277c) C86312j.m106911c(C0277c.class)).mo557j0(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_AD_BRAND_SERVICE, this.f12094d);
            this.f12095e.mo63601b("wxa06c02b5c00ff39b", (String) null, this.f12096f, "errcode:" + (j0 ^ true ? 1 : 0));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.e$b */
    public static final class C2129b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f12097d;

        /* renamed from: e */
        public final /* synthetic */ C40698a f12098e;

        /* renamed from: f */
        public final /* synthetic */ String f12099f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2129b(String str, C40698a aVar, String str2) {
            super(0);
            this.f12097d = str;
            this.f12098e = aVar;
            this.f12099f = str2;
        }

        public Object invoke() {
            JSONArray Bh = ((C0277c) C86312j.m106911c(C0277c.class)).mo553Bh(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_AD_BRAND_SERVICE, this.f12097d);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("msgData", Bh);
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "jsonObject.toString()");
            if (C112551y.m153819s(jSONObject2, "{", false) && C112551y.m153808h(jSONObject2, "}", false, 2, (Object) null) && jSONObject2.length() > 2) {
                jSONObject2 = jSONObject2.substring(1, jSONObject2.length() - 1);
                C87412m.m108593f(jSONObject2, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            this.f12098e.mo63601b("wxa06c02b5c00ff39b", (String) null, this.f12099f, jSONObject2);
            Log.m105924i("MicroMsg.AdWebPrefetcherJsEngineInterceptor", "getAdPushMsg,wrapString:" + jSONObject2);
            return C13598b0.f38549a;
        }
    }

    public C18478e(C40698a aVar) {
        this.f51304d = aVar;
    }

    /* renamed from: A0 */
    public boolean mo23090A0(int i) {
        return C19627t.f55586a.mo25823E(i);
    }

    /* renamed from: H */
    public void mo23091H(int i, int i2) {
        C19627t tVar = C19627t.f55586a;
        Log.m105918d("MicroMsg.BizCardLogic", "setAdExposeParams exposureRatio=" + i + "， exposureTme=" + i2);
        float f = ((float) i) / 100.0f;
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 0.5f) {
            f = 0.5f;
        }
        C19627t.f55581I = f;
        long j = (long) i2;
        if (j < 1) {
            j = 1;
        }
        if (j > 1000) {
            j = 1000;
        }
        C19627t.f55582J = j;
        C19627t.f55583K = true;
        tVar.mo25832f().encode("minAdExposureRatio", C19627t.f55581I);
        tVar.mo25832f().encode("minAdExposureTme", C19627t.f55582J);
    }

    /* renamed from: Q */
    public String mo23092Q(int i) {
        return C19627t.f55586a.mo25843q(i);
    }

    /* renamed from: V */
    public String mo23093V() {
        C19627t tVar = C19627t.f55586a;
        C30766q vx02 = C48009v0.vx0();
        long qq = vx02.mo57691qq();
        Cursor query = vx02.f82736d.query("BizAdInfo", (String[]) null, "exposeTime >=? ", new String[]{String.valueOf(qq)}, (String) null, (String) null, (String) null);
        C87412m.m108593f(query, "cu");
        LinkedList linkedList = new LinkedList();
        while (query.moveToNext()) {
            C30763p pVar = new C30763p();
            pVar.convertFrom(query);
            linkedList.add(pVar);
        }
        query.close();
        Log.m105924i("MicroMsg.BizAdInfoStorage", "getExposedAd beginTime=" + qq + ", size = " + linkedList.size());
        JSONArray jSONArray = new JSONArray();
        try {
            int i = 0;
            for (Object next : linkedList) {
                int i2 = i + 1;
                if (i >= 0) {
                    C30763p pVar2 = (C30763p) next;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("msgid", pVar2.field_msgId);
                    jSONObject.put("traceid", pVar2.field_aId);
                    jSONObject.put(AppMeasurement.Param.TIMESTAMP, pVar2.field_exposeTime);
                    jSONArray.put(jSONObject);
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.BizCardLogic", e, "getExposedAd", new Object[0]);
        }
        String jSONArray2 = jSONArray.toString();
        C87412m.m108593f(jSONArray2, "getBizAdInfoStorage().ge…rray.toString()\n        }");
        return jSONArray2;
    }

    /* renamed from: Y */
    public void mo23094Y(String str) {
        C87412m.m108594g(str, "data");
        C19627t tVar = C19627t.f55586a;
        ((C119157j) C119157j.f356862d).mo183876g(new C44671x(str), "BizInsertTlRecCardThread");
    }

    /* renamed from: j0 */
    public void mo23095j0(int i) {
        C19627t tVar = C19627t.f55586a;
        Log.m105924i("MicroMsg.BizCardLogic", "setAdInsertType " + i);
        C19627t.f55580H = i;
    }

    /* renamed from: l */
    public Object mo23096l(String str) {
        C87412m.m108594g(str, "key");
        C19623o0 o0Var = null;
        switch (str.hashCode()) {
            case 144693390:
                if (!str.equals("recCardInfo")) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject();
                long TO = C48009v0.Jx0().mo25791TO();
                C19625p0 Jx0 = C48009v0.Jx0();
                Jx0.getClass();
                Cursor rawQuery = Jx0.f55550d.rawQuery("SELECT * FROM BizTimeLineInfo where type=620757041 and orderFlag > " + (TO << 32) + " limit 1 ", (String[]) null, 2);
                if (rawQuery.moveToFirst()) {
                    o0Var = new C19623o0();
                    o0Var.convertFrom(rawQuery);
                }
                rawQuery.close();
                jSONObject.put("hasRecCard", o0Var != null);
                C19627t tVar = C19627t.f55586a;
                jSONObject.put("recConflictOpen", false);
                String jSONObject2 = jSONObject.toString();
                Log.m105918d("MicroMsg.AdWebPrefetcherJsEngineInterceptor", "recCardInfo " + jSONObject2);
                return jSONObject2;
            case 767790441:
                if (!str.equals("adCacheData")) {
                    return null;
                }
                C19627t tVar2 = C19627t.f55586a;
                return tVar2.mo25832f().decodeString(tVar2.mo25825G("biz_ad_card_data"), "");
            case 1196431011:
                if (!str.equals("testAdInfo")) {
                    return null;
                }
                MultiProcessMMKV singleMMKV = MultiProcessMMKV.getSingleMMKV("brandService");
                C104289g gVar = new C104289g();
                gVar.mo145953n("AdTestMode", singleMMKV.decodeInt("BizTimeLineAdTestMode", 0));
                gVar.mo145953n("AdPreviewMode", singleMMKV.decodeInt("BizTimeLineAdPreviewMode", 0));
                gVar.put("AdCmd", singleMMKV.decodeString("BizTimeLineAdCmd", ""));
                gVar.put("AdTestExtInfo", singleMMKV.decodeString("BizTimeLineAdTestExtInfo", ""));
                String gVar2 = gVar.toString();
                C87412m.m108593f(gVar2, "JSONObject().apply {\n   …\n            }.toString()");
                return gVar2;
            case 1700095397:
                if (!str.equals("insertedAdData")) {
                    return null;
                }
                List<C19623o0> bO = C48009v0.Jx0().mo25799bO(637534257, 5);
                C26827e eVar = new C26827e();
                for (C19623o0 o0Var2 : bO) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("msgId", String.valueOf(o0Var2.field_msgId));
                    jSONObject3.put("data", o0Var2.mo25765o2());
                    eVar.mo53846q(jSONObject3);
                }
                return eVar.toString();
            default:
                return null;
        }
    }

    /* renamed from: l0 */
    public void mo23097l0(String str, String str2) {
        C87412m.m108594g(str, "slotId");
        C87412m.m108594g(str2, "eventType");
        C90875b.m113988a(false, false, (ClassLoader) null, (String) null, 0, new C2128a(str, this.f51304d, str2), 31, (Object) null);
    }

    /* renamed from: s0 */
    public int mo23098s0() {
        int U2 = ((C45696d) C86709a0.m107533q(C45696d.class)).mo70977U2();
        Log.m105924i("MicroMsg.AdWebPrefetcherJsEngineInterceptor", "getCanvasBizPkgVersion =" + U2);
        return U2;
    }

    /* renamed from: w0 */
    public boolean mo23099w0(String str, boolean z, boolean z2) {
        C87412m.m108594g(str, "msgId");
        Log.m105924i("MicroMsg.AdWebPrefetcherJsEngineInterceptor", "deleteAd msgId=" + str + ", forceDelete=" + z + ", deleteCache=" + z2);
        if (z2) {
            C19627t tVar = C19627t.f55586a;
            tVar.mo25832f().encode(tVar.mo25825G("biz_ad_card_data"), "");
        }
        if (C112551y.m153811k(str)) {
            return false;
        }
        long safeParseLong = Util.safeParseLong(str);
        if (safeParseLong == 0) {
            return false;
        }
        if (BuildInfo.DEBUG && C19627t.f55586a.mo25824F()) {
            return false;
        }
        C19623o0 kD = C48009v0.Jx0().mo25806kD(safeParseLong);
        if (z) {
            if (kD != null && kD.mo25753A2()) {
                C48009v0.Jx0().mo25785Lo(safeParseLong);
                return true;
            }
        }
        if (kD == null || kD.field_isRead == 1 || !kD.mo25753A2()) {
            return false;
        }
        C48009v0.Jx0().mo25785Lo(safeParseLong);
        return true;
    }

    /* renamed from: x */
    public void mo23100x(String str, String str2) {
        C87412m.m108594g(str, "slotId");
        C87412m.m108594g(str2, "eventType");
        C90875b.m113988a(false, false, (ClassLoader) null, (String) null, 0, new C2129b(str, this.f51304d, str2), 31, (Object) null);
    }
}
