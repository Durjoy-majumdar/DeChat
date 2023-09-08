package com.tencent.p014mm.plugin.websearch;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import b83.C0255c;
import b83.C0257d;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.RegionCodeDecoder;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import d62.C75339i;
import di3.C86312j;
import e00.C7575o0;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C75700k0;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jr2.C99018v;
import ke3.C88144b;
import kv1.C61173o;
import lv1.C10656l;
import lv1.C76728k;
import lv1.C99681n;
import ng2.C11163e;
import ob0.C11385n;
import ob0.C117747y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p196ln.C76706g;
import p227rn.C48053v;
import p652pu.C100910b;
import p823sg.C90193h;
import qc0.C101093a;
import qc0.C101106m;
import te3.C101762bu2;
import te3.C48884bn2;
import te3.C49334eu2;
import te3.C50200l03;
import te3.C50335m03;
import te3.C51043r10;
import te3.C51593us3;
import te3.c25;
import te3.lz4;
import u73.C101970c;
import u73.C101972d;
import u73.C101973e;
import u73.C101976i0;
import u73.C101979m0;
import u73.C101984s;
import u73.C101990z;
import u73.C14127e0;
import u73.C14128i;
import u73.C14132m;
import u73.C14133n0;
import u73.C22613h1;
import u73.C52456b0;
import u73.C52464j0;
import u73.C52469w0;
import u73.C78137s0;

/* renamed from: com.tencent.mm.plugin.websearch.FTSWebViewLogic */
public class FTSWebViewLogic implements C11385n, C14132m {

    /* renamed from: d */
    public Set<Integer> f282759d;

    /* renamed from: e */
    public C61173o f282760e = new C5822a(this);

    /* renamed from: f */
    public long f282761f;

    /* renamed from: g */
    public HashMap<String, C101970c> f282762g;

    /* renamed from: h */
    public C101976i0 f282763h;

    /* renamed from: i */
    public C101984s f282764i = new C96593c();

    /* renamed from: j */
    public Map<Integer, C14133n0> f282765j = new HashMap();

    /* renamed from: n */
    public C14128i f282766n = new C14128i();

    /* renamed from: o */
    public List<C101106m> f282767o;

    /* renamed from: p */
    public IListener f282768p = new IListener<MusicPlayerEvent>(C40008f.f107254d) {
        {
            this.__eventId = -1155728636;
        }

        public boolean callback(IEvent iEvent) {
            MusicPlayerEvent musicPlayerEvent = (MusicPlayerEvent) iEvent;
            Class cls = C7575o0.class;
            C101106m mVar = musicPlayerEvent.f9336d.f9338b;
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(mVar == null ? 0 : mVar.f295959d);
            objArr[1] = FTSWebViewLogic.this.f282759d;
            Log.m105919d("MicroMsg.WebSearch.FTSWebViewLogic", "musicPlayerListener type:%s webviewId:%s", objArr);
            if (mVar != null && C101093a.m132482d(mVar)) {
                int i = musicPlayerEvent.f9336d.f9337a;
                if (i == 0 || i == 1) {
                    for (Integer intValue : FTSWebViewLogic.this.f282759d) {
                        ((C7575o0) C86312j.m106911c(cls)).mb0(intValue.intValue(), mVar.f295960e, 1);
                    }
                } else if (i == 2 || i == 3 || i == 4 || i == 7) {
                    for (Integer intValue2 : FTSWebViewLogic.this.f282759d) {
                        ((C7575o0) C86312j.m106911c(cls)).mb0(intValue2.intValue(), mVar.f295960e, 0);
                    }
                }
            }
            return false;
        }
    };

    /* renamed from: q */
    public C0255c f282769q;

    /* renamed from: r */
    public C0257d f282770r;

    /* renamed from: s */
    public C101990z f282771s;

    /* renamed from: com.tencent.mm.plugin.websearch.FTSWebViewLogic$a */
    public class C5822a implements C61173o {

        /* renamed from: com.tencent.mm.plugin.websearch.FTSWebViewLogic$a$a */
        public class C5823a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C5825e f21976d;

            /* renamed from: e */
            public final /* synthetic */ JSONObject f21977e;

            public C5823a(C5822a aVar, C5825e eVar, JSONObject jSONObject) {
                this.f21976d = eVar;
                this.f21977e = jSONObject;
            }

            public void run() {
                int i = this.f21976d.f21981s;
                if (i != 0) {
                    Log.m105925i("MicroMsg.WebSearch.FTSWebViewLogic", "historySearchResultListener callback， id %d", Integer.valueOf(i));
                    ((C7575o0) C86312j.m106911c(C7575o0.class)).mo8684U7(this.f21976d.f21981s, this.f21977e.toString());
                }
            }
        }

        public C5822a(FTSWebViewLogic fTSWebViewLogic) {
        }

        /* renamed from: H0 */
        public void mo293H0(C10656l lVar) {
            C5825e eVar = (C5825e) lVar.f32072a;
            Log.m105925i("MicroMsg.WebSearch.FTSWebViewLogic", "historySearchResultListener ret %d, webViewId %s", Integer.valueOf(lVar.f32074c), Integer.valueOf(eVar.f21981s));
            if (lVar.f32074c == 0) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("ret", 0);
                    JSONArray jSONArray = new JSONArray();
                    JSONArray jSONArray2 = new JSONArray();
                    for (C99681n next : lVar.f32076e) {
                        if (next.f292154h != null) {
                            JSONObject jSONObject2 = new JSONObject(next.f292154h);
                            jSONObject2.put("timeStamp", next.f292152f);
                            jSONArray2.put(jSONObject2);
                        }
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("items", jSONArray2);
                    jSONArray.put(jSONObject3);
                    jSONObject.put("data", jSONArray);
                } catch (Exception unused) {
                }
                MMHandlerThread.postToMainThread(new C5823a(this, eVar, jSONObject));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.websearch.FTSWebViewLogic$d */
    public class C5824d implements Runnable {

        /* renamed from: d */
        public String f21978d;

        /* renamed from: e */
        public boolean f21979e;

        public C5824d(C5822a aVar) {
        }

        public void run() {
            List<C101106m> list;
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray(this.f21978d);
                for (int i = 0; i < jSONArray.length(); i++) {
                    TimeLineObject It0 = ((C99018v) C86312j.m106911c(C99018v.class)).It0(jSONArray.getString(i));
                    C86709a0.m107528h();
                    C101106m Qn0 = ((C100910b) C86312j.m106911c(C100910b.class)).Qn0(C86709a0.m107535s().f251806d, It0, 9);
                    if (Qn0 != null) {
                        arrayList.add(Qn0);
                    }
                }
                if (!this.f21979e || (list = FTSWebViewLogic.this.f282767o) == null) {
                    FTSWebViewLogic.this.f282767o = arrayList;
                } else {
                    list.addAll(arrayList);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.WebSearch.FTSWebViewLogic", e, "", new Object[0]);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.websearch.FTSWebViewLogic$e */
    public class C5825e extends C76728k {

        /* renamed from: s */
        public int f21981s;

        public C5825e(FTSWebViewLogic fTSWebViewLogic, C5822a aVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.websearch.FTSWebViewLogic$b */
    public class C96592b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f282772d;

        /* renamed from: e */
        public final /* synthetic */ int f282773e;

        /* renamed from: f */
        public final /* synthetic */ int f282774f;

        /* renamed from: g */
        public final /* synthetic */ String f282775g;

        /* renamed from: h */
        public final /* synthetic */ String f282776h;

        /* renamed from: i */
        public final /* synthetic */ String f282777i;

        public C96592b(int i, int i2, int i3, String str, String str2, String str3) {
            this.f282772d = i;
            this.f282773e = i2;
            this.f282774f = i3;
            this.f282775g = str;
            this.f282776h = str2;
            this.f282777i = str3;
        }

        public void run() {
            Log.m105925i("MicroMsg.WebSearch.FTSWebViewLogic", "getTeachSearchData realTime, webviewID = %d", Integer.valueOf(this.f282772d));
            C86709a0.m107524d().mo123455a(1048, FTSWebViewLogic.this);
            String currentLanguage = LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext());
            long optLong = C78137s0.m94340d("discoverSearchEntry").optLong("guideParam");
            FTSWebViewLogic.this.f282763h = new C101976i0(this.f282773e, this.f282774f, C43471q.m46977a(0), this.f282772d, currentLanguage, optLong, this.f282775g, this.f282776h, this.f282777i);
            C86709a0.m107524d().mo123460f(FTSWebViewLogic.this.f282763h);
        }
    }

    /* renamed from: com.tencent.mm.plugin.websearch.FTSWebViewLogic$c */
    public class C96593c implements C101984s {
        public C96593c() {
        }

        /* renamed from: a */
        public void mo134672a(C101979m0 m0Var) {
            C101976i0 i0Var;
            int i;
            byte[] bArr;
            Class cls = C7575o0.class;
            Log.m105925i("MicroMsg.WebSearch.FTSWebViewLogic", "handleCallback %s", m0Var);
            if (m0Var != null) {
                int intValue = ((Integer) m0Var.f300280d).intValue();
                C96594f fVar = (C96594f) m0Var.f300281e;
                if (fVar == null || (i0Var = fVar.f282782c) == null) {
                    Log.m105920e("MicroMsg.WebSearch.FTSWebViewLogic", "onSceneEnd netResult invalid");
                    return;
                }
                int i2 = fVar.f282780a;
                if (i2 == 0 && fVar.f282781b == 0) {
                    C101970c cVar = new C101970c();
                    cVar.f300214a = i0Var.f300269h;
                    C49334eu2 eu22 = i0Var.f300267f;
                    cVar.f300217d = (long) eu22.f133124e;
                    cVar.f300216c = eu22.f133123d;
                    cVar.f300218e = System.currentTimeMillis() / 1000;
                    cVar.f300219f = i0Var.f300267f.f133125f;
                    cVar.f300215b = i0Var.f300268g;
                    String a = C101970c.m134241a(C11163e.m11041a(), cVar.f300214a, cVar.f300215b, true);
                    Log.m105925i("MicroMsg.WebSearch.FTSWebViewLogic", "NetSceneWebSearchGuide cgi data %s ", cVar.f300216c);
                    if (!Util.isNullOrNil(cVar.f300216c)) {
                        if (cVar.f300214a == 20 && cVar.f300215b == 0) {
                            ((C7575o0) C86312j.m106911c(cls)).mo8680Kh(intValue, 0, cVar.f300216c, 0, i0Var.f300270i);
                        } else {
                            ((C7575o0) C86312j.m106911c(cls)).mo8680Kh(intValue, 0, cVar.f300216c, 0, i0Var.f300270i);
                        }
                        Log.m105925i("MicroMsg.WebSearch.FTSWebViewLogic", "onTeachSearchDataReady, %s", cVar.f300216c);
                    }
                    FTSWebViewLogic.this.f282762g.put(a, cVar);
                    if (cVar.f300217d == 0) {
                        String a2 = C11163e.m11041a();
                        int i3 = cVar.f300214a;
                        int i4 = cVar.f300215b;
                        Log.m105925i("MicroMsg.WebSearch.BizCacheObj", "delete biz cache %d %d", Integer.valueOf(i3), Integer.valueOf(i4));
                        C86009m1 m1Var = new C86009m1(a2, C101970c.m134241a(a2, i3, i4, true));
                        if (m1Var.mo119967g()) {
                            m1Var.mo119966f();
                        }
                        C86009m1 m1Var2 = new C86009m1(a2, C101970c.m134241a(a2, i3, i4, false));
                        if (m1Var2.mo119967g()) {
                            m1Var2.mo119966f();
                        }
                    } else {
                        String a3 = C11163e.m11041a();
                        C101762bu2 bu22 = new C101762bu2();
                        bu22.f297993d = cVar.f300214a;
                        bu22.f297994e = cVar.f300216c;
                        bu22.f297995f = cVar.f300217d;
                        bu22.f297996g = cVar.f300218e;
                        bu22.f297997h = cVar.f300219f;
                        bu22.f297998i = cVar.f300215b;
                        try {
                            bArr = bu22.toByteArray();
                        } catch (IOException unused) {
                            bArr = null;
                        }
                        if (bArr != null) {
                            C86009m1 m1Var3 = new C86009m1(a3, C101970c.m134241a(a3, cVar.f300214a, cVar.f300215b, true));
                            if (!m1Var3.mo119974l().mo119967g()) {
                                m1Var3.mo119974l().mo119987x();
                            }
                            if (m1Var3.mo119967g()) {
                                m1Var3.mo119966f();
                            }
                            C86013q1.m106438T(m1Var3.mo119971i(), bArr, 0, bArr.length);
                            Log.m105925i("MicroMsg.WebSearch.BizCacheObj", "save bizCacheFile %s %d", m1Var3.mo119971i(), Integer.valueOf(bArr.length));
                        } else {
                            Log.m105924i("MicroMsg.WebSearch.BizCacheObj", "save bizCacheFile fail");
                        }
                    }
                    int i5 = cVar.f300214a;
                    if (i5 == 20 && (i = cVar.f300215b) == 0) {
                        C22613h1.m26477c(i5, 1, cVar.f300219f, i, 2, cVar.mo141492b(), 1);
                    } else {
                        C22613h1.m26477c(i5, 1, cVar.f300219f, cVar.f300215b, 1, "", 0);
                    }
                } else {
                    Log.m105921e("MicroMsg.WebSearch.FTSWebViewLogic", "onSceneEnd errType %d,errCode %d", Integer.valueOf(i2), Integer.valueOf(fVar.f282781b));
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.websearch.FTSWebViewLogic$f */
    public static class C96594f {

        /* renamed from: a */
        public int f282780a;

        /* renamed from: b */
        public int f282781b;

        /* renamed from: c */
        public C101976i0 f282782c;

        public C96594f(int i, int i2, C101976i0 i0Var) {
            this.f282780a = i;
            this.f282781b = i2;
            this.f282782c = i0Var;
        }
    }

    public FTSWebViewLogic() {
        Log.m105924i("MicroMsg.WebSearch.FTSWebViewLogic", "create FTSWebViewLogic");
        this.f282762g = new HashMap<>();
        this.f282759d = Collections.synchronizedSet(new HashSet());
        this.f282768p.alive();
        C86709a0.m107524d().mo123455a(2975, this);
    }

    /* renamed from: a */
    public C101970c mo134656a(int i, int i2, boolean z) {
        String a = C101970c.m134241a(C11163e.m11041a(), i, i2, true);
        if (this.f282762g.get(a) == null) {
            C101970c cVar = new C101970c();
            cVar.mo141494d(C11163e.m11041a(), i, i2);
            this.f282762g.put(a, cVar);
        }
        return this.f282762g.get(a);
    }

    /* renamed from: b */
    public String mo134657b(int i, int i2, boolean z) {
        String a = C101970c.m134241a(C11163e.m11041a(), i, i2, z);
        if (this.f282762g.get(a) == null) {
            C101970c cVar = new C101970c();
            cVar.mo141494d(C11163e.m11041a(), i, i2);
            this.f282762g.put(a, cVar);
        }
        C101970c cVar2 = this.f282762g.get(a);
        String str = cVar2.mo141493c() ? cVar2.f300216c : "";
        return Util.isNullOrNil(str) ? "" : str;
    }

    /* renamed from: c */
    public final void mo134658c(C0257d dVar, int i, int i2, int i3) {
        String str;
        dVar.getClass();
        JSONObject jSONObject = new JSONObject();
        if (dVar.f801e && i >= 0 && i2 > 0) {
            int i4 = (i2 + i) - 1;
            if (i4 > dVar.f799c.size() - 1) {
                i4 = dVar.f799c.size() - 1;
            }
            if (i4 >= i) {
                try {
                    jSONObject.put("continueFlag", i4 == dVar.f799c.size() - 1 ? 0 : 1);
                    jSONObject.put("offset", i4 + 1);
                    jSONObject.put(SearchIntents.EXTRA_QUERY, dVar.f791a);
                    jSONObject.put("ret", 0);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("count", (i4 - i) + 1);
                    jSONObject2.put("totalCount", C45628s0.m50790o());
                    JSONArray jSONArray = new JSONArray();
                    while (i <= i4) {
                        C99681n nVar = dVar.f799c.get(i);
                        JSONObject jSONObject3 = new JSONObject();
                        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(nVar.f292151e);
                        jSONObject3.put("userName", z1Var.getUsername());
                        jSONObject3.put("nickName", z1Var.getNickname());
                        dVar.mo295b(nVar, z1Var, jSONObject3);
                        C68097n Lo = ((C68098o) ((C76706g) C86312j.m106911c(C76706g.class)).mo106832eg()).mo93607Lo(z1Var.getUsername());
                        if (Lo != null) {
                            str = Lo.mo93597f();
                            if (Util.isNullOrNil(str)) {
                                str = Lo.mo93594c();
                            }
                        } else {
                            str = "";
                        }
                        jSONObject3.put("thumbUrl", str);
                        jSONArray.put(jSONObject3);
                        i++;
                    }
                    jSONObject2.put("items", jSONArray);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put(jSONObject2);
                    jSONObject.put("data", jSONArray2);
                } catch (JSONException e) {
                    Log.printErrStackTrace("JsapiFtsMatchContact", e, "", new Object[0]);
                }
            }
        }
        ((C7575o0) C86312j.m106911c(C7575o0.class)).mo8690rd(i3, jSONObject);
    }

    /* renamed from: d */
    public String mo134659d(String str) {
        HashMap hashMap;
        if (!TextUtils.isEmpty(str)) {
            HashMap hashMap2 = new HashMap();
            Uri parse = Uri.parse(str);
            new HashSet();
            for (String next : parse.getQueryParameterNames()) {
                hashMap2.put(next, parse.getQueryParameter(next));
            }
            hashMap = hashMap2;
        } else {
            hashMap = Collections.emptyMap();
        }
        if (hashMap == null) {
            return null;
        }
        Object obj = hashMap.get("search_click_id");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* renamed from: e */
    public boolean mo134660e(Map<String, Object> map) {
        int i;
        Map<String, Object> map2 = map;
        Class cls = C7575o0.class;
        Log.m105925i("MicroMsg.WebSearch.FTSWebViewLogic", "getTeachSearchData: %s", map2);
        int e = C43471q.m46981e(map2, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        int e2 = C43471q.m46981e(map2, "type", 0);
        int e3 = C43471q.m46981e(map2, "requestType", 0);
        int nullAsInt = Util.nullAsInt(map2.get("webview_instance_id"), -1);
        String str = (String) map2.get("requestId");
        String str2 = (String) map2.get("guideInfo");
        String str3 = (String) map2.get("sessionId");
        boolean d = C43471q.m46980d(map2, "ignoreCache", false);
        if (e3 == 0) {
            C101970c a = mo134656a(e, e2, true);
            if (!a.mo141493c() || d) {
                ((C96604n) ((C96598h) ((C96603l) C86312j.m106911c(C96603l.class)).mo134690lS()).f282796o).mo134697d(2, str, Integer.valueOf(nullAsInt), new C96592b(nullAsInt, e, e2, str, str3, str2), this.f282764i);
            } else {
                Log.m105925i("MicroMsg.WebSearch.FTSWebViewLogic", "hit the cache: webviewID = %d %d %d %d %d, data %s", Integer.valueOf(nullAsInt), Integer.valueOf(a.f300214a), Long.valueOf(a.f300217d), Long.valueOf(a.f300218e), Integer.valueOf(a.f300215b), a.f300216c);
                ((C7575o0) C86312j.m106911c(cls)).mo8680Kh(nullAsInt, e3, a.f300216c, 1, str);
                int i2 = a.f300214a;
                if (i2 == 20 && (i = a.f300215b) == 0) {
                    C22613h1.m26477c(i2, 0, a.f300219f, i, 2, a.mo141492b(), 1);
                } else {
                    C22613h1.m26477c(i2, 0, a.f300219f, a.f300215b, 1, "", 0);
                }
            }
        } else {
            C50335m03 c = C52469w0.m58725c();
            try {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray2 = new JSONArray();
                for (int size = c.f137742d.size() - 1; size >= 0; size--) {
                    JSONObject jSONObject3 = new JSONObject();
                    C50200l03 l032 = c.f137742d.get(size);
                    if (C45628s0.m50740E(l032.f137121d)) {
                        String A10 = ((C48053v) C86312j.m106911c(C48053v.class)).A10(l032.f137121d);
                        if (!Util.isNullOrNil(A10)) {
                            jSONObject3.put("avatarUrl", A10);
                            jSONObject3.put("userName", l032.f137121d);
                            jSONObject3.put("nickName", ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(l032.f137121d));
                            jSONArray2.put(jSONObject3);
                        }
                    }
                }
                jSONObject2.put("items", jSONArray2);
                jSONObject2.put("type", 5);
                jSONObject2.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
                jSONArray.put(jSONObject2);
                jSONObject.put("data", jSONArray);
                String jSONObject4 = jSONObject.toString();
                Log.m105919d("MicroMsg.WebSearch.FTSWebViewLogic", "getTeachSearchData returnString=%s", jSONObject4);
                ((C7575o0) C86312j.m106911c(cls)).mo8680Kh(nullAsInt, 1, jSONObject4, 1, str);
            } catch (Exception e4) {
                Log.printErrStackTrace("MicroMsg.WebSearch.FTSWebViewLogic", e4, "gen mostSearchBizContactList error", new Object[0]);
                return false;
            }
        }
        return false;
    }

    /* renamed from: f */
    public String mo134661f(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("searchClickId", Util.nullAs(str, ""));
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.WebSearch.FTSWebViewLogic", e, "", new Object[0]);
            return null;
        }
    }

    /* renamed from: g */
    public final JSONObject mo134662g(C48884bn2 bn22) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("latitude", (double) bn22.f131220e);
            jSONObject.put("longitude", (double) bn22.f131219d);
            jSONObject.put("precision", bn22.f131221f);
            jSONObject.put("macAddr", (double) bn22.f131220e);
            jSONObject.put("cellId", (double) bn22.f131220e);
            jSONObject.put("gpsSource", (double) bn22.f131220e);
            jSONObject.put("address", (double) bn22.f131220e);
            return jSONObject;
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.WebSearch.FTSWebViewLogic", e, "", new Object[0]);
            return new JSONObject();
        }
    }

    /* renamed from: h */
    public final C101973e mo134663h(Map<String, Object> map) {
        C101973e eVar = new C101973e();
        eVar.f300242a = C43471q.m46982f(map, "userName");
        eVar.f300243b = C43471q.m46982f(map, "nickName");
        eVar.f300244c = C43471q.m46982f(map, "alias");
        eVar.f300246e = C43471q.m46982f(map, "signature");
        eVar.f300245d = C43471q.m46981e(map, "sex", 0);
        eVar.f300247f = C43471q.m46982f(map, "country");
        eVar.f300249h = C43471q.m46982f(map, "city");
        eVar.f300248g = C43471q.m46982f(map, "province");
        eVar.f300250i = C43471q.m46981e(map, "snsFlag", 0);
        String f = C43471q.m46982f(map, SearchIntents.EXTRA_QUERY);
        int i = 3;
        if (!Util.isNullOrNil(f)) {
            if (Character.isDigit(f.charAt(0))) {
                i = 15;
            }
            eVar.f300252k = i;
            if (i == 15) {
                if ("mobile".equals(C43471q.m46982f(map, "matchType"))) {
                    eVar.f300251j = f;
                } else {
                    eVar.f300252k = 1;
                }
            }
        } else {
            eVar.f300252k = 3;
        }
        return eVar;
    }

    /* renamed from: i */
    public final C101972d mo134664i(Map<String, Object> map) {
        C101972d dVar = new C101972d();
        dVar.f300226a = C43471q.m46982f(map, "userName");
        dVar.f300227b = C43471q.m46982f(map, "nickName");
        dVar.f300228c = C43471q.m46982f(map, "headHDImgUrl");
        dVar.f300230e = C43471q.m46981e(map, "verifyFlag", 0);
        dVar.f300229d = C43471q.m46982f(map, "signature");
        dVar.f300231f = C43471q.m46981e(map, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        dVar.f300232g = C43471q.m46981e(map, "sceneActionType", 1);
        C51043r10 r102 = new C51043r10();
        dVar.f300233h = r102;
        r102.f140656d = C43471q.m46981e(map, "brandFlag", 0);
        dVar.f300233h.f140659g = C43471q.m46982f(map, "iconUrl");
        dVar.f300233h.f140658f = C43471q.m46982f(map, "brandInfo");
        dVar.f300233h.f140657e = C43471q.m46982f(map, "externalInfo");
        dVar.f300234i = C43471q.m46982f(map, "searchId");
        dVar.f300235j = C43471q.m46982f(map, "searchClickId");
        dVar.f300236k = C43471q.m46982f(map, SearchIntents.EXTRA_QUERY);
        dVar.f300237l = C43471q.m46981e(map, "position", 0);
        dVar.f300238m = C43471q.m46980d(map, "isCurrentDetailPage", false);
        dVar.f300239n = C43471q.m46982f(map, "extraParams");
        dVar.f300240o = C43471q.m46981e(map, "friendScene", 0);
        if (C43471q.m46981e(map, "bizTabType", 0) == 2) {
            dVar.f300241p = 1;
        } else {
            dVar.f300241p = 0;
        }
        return dVar;
    }

    /* renamed from: j */
    public boolean mo134665j(Map<String, Object> map) {
        Log.m105925i("MicroMsg.WebSearch.FTSWebViewLogic", "reportSearchRealTimeReport: %s", map.toString());
        C51593us3 us32 = new C51593us3();
        us32.f143104t = C43471q.m46982f(map, "logString");
        C86709a0.m107524d().mo123455a(1134, this);
        C86709a0.m107524d().mo123460f(new C52464j0(us32));
        return false;
    }

    /* renamed from: k */
    public final void mo134666k(C101972d dVar, boolean z) {
        int i = dVar.f300240o;
        if (i == 0) {
            if (dVar.f300232g == 2) {
                i = 89;
            } else if (z) {
                i = 85;
            } else {
                int i2 = dVar.f300231f;
                i = (i2 == 3 || i2 == 16) ? dVar.f300238m ? 88 : 87 : 39;
            }
        }
        C52469w0.m58723a(dVar.f300226a);
        Intent intent = new Intent();
        intent.putExtra("Contact_User", dVar.f300226a);
        intent.putExtra("Contact_Nick", dVar.f300227b);
        intent.putExtra("Contact_BrandIconURL", dVar.f300228c);
        intent.putExtra("Contact_Signature", dVar.f300229d);
        intent.putExtra("Contact_VUser_Info_Flag", dVar.f300230e);
        intent.putExtra("Contact_Scene", i);
        C51043r10 r102 = dVar.f300233h;
        if (r102 != null) {
            try {
                intent.putExtra("Contact_customInfo", r102.toByteArray());
            } catch (IOException unused) {
            }
        }
        Bundle bundle = new Bundle();
        bundle.putString("Contact_Ext_Args_Search_Id", dVar.f300234i);
        bundle.putString("Contact_Ext_Args_Search_Click_Id", dVar.f300235j);
        bundle.putString("Contact_Ext_Args_Query_String", dVar.f300236k);
        intent.putExtra("KOpenArticleSceneFromScene", 7);
        bundle.putInt("Contact_Scene", i);
        bundle.putInt("Contact_Ext_Args_Index", dVar.f300237l);
        bundle.putString("Contact_Ext_Extra_Params", dVar.f300239n);
        intent.putExtra("preChatTYPE", 10);
        intent.putExtra("Contact_Ext_Args", bundle);
        intent.putExtra("biz_profile_tab_type", dVar.f300241p);
        intent.putExtra("force_get_contact", true);
        C88144b.m109791i(MMApplicationContext.getContext(), Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
    }

    /* renamed from: l */
    public final void mo134667l(C101973e eVar) {
        Intent intent = new Intent();
        intent.putExtra("Contact_User", eVar.f300242a);
        intent.putExtra("Contact_Nick", eVar.f300243b);
        intent.putExtra("Contact_Alias", eVar.f300244c);
        intent.putExtra("Contact_Sex", eVar.f300245d);
        intent.putExtra("Contact_Scene", eVar.f300252k);
        intent.putExtra("Contact_KHideExpose", true);
        intent.putExtra("Contact_RegionCode", RegionCodeDecoder.m124564q(eVar.f300247f, eVar.f300248g, eVar.f300249h));
        intent.putExtra("Contact_Signature", eVar.f300246e);
        intent.putExtra("Contact_KSnsIFlag", eVar.f300250i);
        intent.putExtra("Contact_full_Mobile_MD5", eVar.f300251j);
        C88144b.m109791i(MMApplicationContext.getContext(), Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
    }

    /* renamed from: m */
    public final void mo134668m(String str, String str2, String str3, boolean z) {
        TimeLineObject It0 = ((C99018v) C86312j.m106911c(C99018v.class)).It0(str2);
        Intent intent = new Intent();
        intent.putExtra("INTENT_TALKER", str3);
        intent.putExtra("INTENT_SNSID", new BigInteger(It0.f283893Id).longValue());
        intent.putExtra("SNS_FROM_MUSIC_ITEM", z);
        try {
            intent.putExtra("INTENT_SNS_TIMELINEOBJECT", It0.toByteArray());
        } catch (IOException unused) {
        }
        C88144b.m109791i(MMApplicationContext.getContext(), "sns", ".ui.SnsCommentDetailUI", intent, (Bundle) null);
    }

    /* renamed from: n */
    public final void mo134669n(String str, Bundle bundle, int i, String str2, String str3, int i2, String str4, int i3, int i4, String str5) {
        mo134670o(str, bundle, i, str2, str3, i2, str4, i3, i4, str5, -1, "");
    }

    /* renamed from: o */
    public final void mo134670o(String str, Bundle bundle, int i, String str2, String str3, int i2, String str4, int i3, int i4, String str5, int i5, String str6) {
        Intent intent = new Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("convertActivityFromTranslucent", false);
        intent.putExtra("customize_status_bar_color", i);
        intent.putExtra("status_bar_style", str2);
        intent.putExtra("from_scence", i3);
        intent.putExtra("subtype", i4);
        intent.putExtra("key_h5pay_cookie", str5);
        try {
            if (Util.isNullOrNil(str6)) {
                str6 = mo134659d(str);
            }
            intent.putExtra("KPageScene", 1);
            intent.putExtra("KPageInfo", Util.nullAs(mo134661f(str6), ""));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WebSearch.FTSWebViewLogic", e, "startSearchItemDetailPageUrl getSearchClickId exception", new Object[0]);
        }
        if (!Util.isNullOrNil(str3)) {
            intent.putExtra("prePublishId", str3);
            intent.putExtra("KPublisherId", str3);
        } else if (bundle != null && !Util.isNullOrNil(str)) {
            String str7 = bundle.getString("publishIdPrefix", "gs") + "_" + C90193h.m112878f(str.getBytes());
            intent.putExtra("prePublishId", str7);
            intent.putExtra("KPublisherId", str7);
        }
        if (i2 > 0) {
            intent.putExtra("pay_channel", i2);
        }
        intent.putExtra("geta8key_scene", 65);
        intent.putExtra("preChatTYPE", 10);
        if (!Util.isNullOrNil(str4)) {
            intent.putExtra("srcUsername", str4);
        }
        if (i5 == 3) {
            intent.putExtra("show_native_web_view", true);
        }
        C88144b.m109808z(MMApplicationContext.getContext(), intent);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Class cls = C7575o0.class;
        if (yVar instanceof C101976i0) {
            C86709a0.m107524d().mo123470p(1048, this);
            C101976i0 i0Var = (C101976i0) yVar;
            C96594f fVar = new C96594f(i, i2, i0Var);
            ((C96604n) ((C96598h) ((C96603l) C86312j.m106911c(C96603l.class)).mo134690lS()).f282796o).mo134695b(2, i0Var.f300270i, fVar, this.f282764i);
        } else if (yVar instanceof C52464j0) {
            C86709a0.m107524d().mo123470p(1134, this);
        } else if (yVar instanceof C14127e0) {
            C86709a0.m107524d().mo123470p(1866, this);
            if (i == 0 && i2 == 0) {
                C14127e0 e0Var = (C14127e0) yVar;
                if (e0Var.f39531h != -1) {
                    ((C7575o0) C86312j.m106911c(cls)).T50(e0Var.f39531h, ((lz4) e0Var.f39527d.f127056b.f127083a).f137732d, 0, 0, 0);
                }
                C14133n0 n0Var = e0Var.f39532i;
                if (n0Var != null) {
                    ((HashMap) this.f282765j).put(Integer.valueOf(n0Var.f39539a), e0Var.f39532i);
                }
            }
        } else if (yVar instanceof C101990z) {
            C86709a0.m107524d().mo123470p(2999, this);
            C101990z zVar = (C101990z) yVar;
            String nullAs = Util.nullAs(zVar.f300314o.f136568d, "");
            if (zVar.f300313n != -1) {
                ((C7575o0) C86312j.m106911c(cls)).mo8686fP(zVar.f300313n, nullAs, i2, str);
            }
        } else if (yVar instanceof C52456b0) {
            C52456b0 b0Var = (C52456b0) yVar;
            String nullAs2 = Util.nullAs(((c25) b0Var.f146572e.f127056b.f127083a).f131472d, "");
            if (b0Var.f146575h != -1) {
                ((C7575o0) C86312j.m106911c(cls)).mo8677Aa(b0Var.f146575h, nullAs2, b0Var.f146574g, i2, str);
            }
        }
    }
}
