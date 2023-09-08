package x03;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.C83031z;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.wxmm.v2helper;
import eb0.C31519v2;
import eb0.C75597w2;
import f40.C86709a0;
import f62.C75700k0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ke3.C88144b;
import lu3.C88656g;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import org.json.JSONArray;
import org.json.JSONObject;
import p03.C21914h;
import qo3.C89779i0;
import r03.C22194c;
import s03.C22290h;
import s03.C22292k;
import s03.C48216e;
import te3.C49768hy;
import te3.C51273so;
import te3.C51425to3;
import te3.C64467je0;
import te3.br4;
import te3.do4;
import te3.e54;
import te3.ph4;
import te3.q25;
import te3.qh4;
import te3.uh4;
import te3.ur4;
import te3.vh4;
import te3.xh4;
import te3.zh4;
import v73.C102158a;
import zt3.C119157j;

/* renamed from: x03.q */
public class C22974q {

    /* renamed from: a */
    public C22947b f65999a;

    /* renamed from: b */
    public boolean f66000b;

    /* renamed from: c */
    public int f66001c;

    /* renamed from: d */
    public C22292k f66002d;

    /* renamed from: e */
    public C22290h f66003e;

    /* renamed from: f */
    public C11385n f66004f = new C22975b();

    /* renamed from: x03.q$b */
    public class C22975b implements C11385n {

        /* renamed from: x03.q$b$a */
        public class C22976a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C22290h f66006d;

            public C22976a(C22290h hVar) {
                this.f66006d = hVar;
            }

            public void run() {
                try {
                    JSONArray optJSONArray = new JSONObject(((q25) this.f66006d.f63193e.f127056b.f127083a).f140108f).optJSONArray("data");
                    if (optJSONArray != null && optJSONArray.length() > 0) {
                        List<xh4> k = C22974q.m27140k(C22974q.this.f65999a.mo24970W3(), optJSONArray);
                        this.f66006d.f63194f.f64713N.f64610i.addAll(k);
                        Log.m105925i("MicroMsg.TopStory.TopStoryVideoDataMgr", "netSceneTopStoryRelevantVideo add result list %d", Integer.valueOf(((ArrayList) k).size()));
                    }
                } catch (Exception unused) {
                }
            }
        }

        public C22975b() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            boolean z = false;
            Log.m105925i("MicroMsg.TopStory.TopStoryVideoDataMgr", "onSceneEnd, errType: %s, errCode: %s, scene: %s", Integer.valueOf(i), Integer.valueOf(i2), yVar);
            if (yVar.equals(C22974q.this.f66002d)) {
                C86709a0.m107524d().mo123470p(1943, C22974q.this.f66004f);
                C22974q qVar = C22974q.this;
                qVar.f66002d = null;
                C22292k kVar = (C22292k) yVar;
                if (i == 0 && i2 == 0) {
                    C22979e eVar = new C22979e((C22980a) null);
                    eVar.f66013d = ((q25) kVar.f63200e.f127056b.f127083a).f140108f;
                    if (kVar.f63201f.f64649s == 0) {
                        z = true;
                    }
                    eVar.f66014e = z;
                    ((C119157j) C119157j.f356862d).mo183876g(eVar, "TopStory.DecodeRecommendResultTask");
                    return;
                }
                Log.m105921e("MicroMsg.TopStory.TopStoryVideoDataMgr", "fetch page failed!, response json: %s", ((q25) kVar.f63200e.f127056b.f127083a).f140108f);
                C102158a.m134600a(2);
                C22974q.this.f65999a.mo24976a3(-1, str);
                C22974q.this.f66000b = false;
            } else if (yVar.equals(C22974q.this.f66003e)) {
                C86709a0.m107524d().mo123470p(1943, C22974q.this.f66004f);
                C22974q.this.f66003e = null;
                C22290h hVar = (C22290h) yVar;
                if (i == 0 && i2 == 0) {
                    Log.m105925i("MicroMsg.TopStory.TopStoryVideoDataMgr", "onSceneEnd relevantVideoNetScene %s", ((q25) hVar.f63193e.f127056b.f127083a).f140108f);
                    ((C119157j) C119157j.f356862d).mo183876g(new C22976a(hVar), "TopStory.DecodeRelevantResult");
                    return;
                }
                Log.m105925i("MicroMsg.TopStory.TopStoryVideoDataMgr", "requestRelVideo failed!, errType:%s, errCode:%s", Integer.valueOf(i), Integer.valueOf(i2));
                C102158a.m134600a(2);
            }
        }
    }

    /* renamed from: x03.q$c */
    public class C22977c implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ boolean[] f66008d;

        public C22977c(boolean[] zArr) {
            this.f66008d = zArr;
        }

        public void onCancel(DialogInterface dialogInterface) {
            this.f66008d[0] = true;
        }
    }

    /* renamed from: x03.q$d */
    public class C22978d implements C75597w2.C31525a {

        /* renamed from: a */
        public final /* synthetic */ C89779i0 f66009a;

        /* renamed from: b */
        public final /* synthetic */ boolean[] f66010b;

        /* renamed from: c */
        public final /* synthetic */ xh4 f66011c;

        /* renamed from: d */
        public final /* synthetic */ Context f66012d;

        public C22978d(C89779i0 i0Var, boolean[] zArr, xh4 xh4, Context context) {
            this.f66009a = i0Var;
            this.f66010b = zArr;
            this.f66011c = xh4;
            this.f66012d = context;
        }

        /* renamed from: a */
        public void mo1109a(String str, boolean z) {
            this.f66009a.dismiss();
            Log.m105925i("MicroMsg.TopStory.TopStoryVideoDataMgr", "jumpToProfile getNow:%s, isCancel:%s", Boolean.valueOf(z), Boolean.valueOf(this.f66010b[0]));
            if (!this.f66010b[0] && z) {
                Intent intent = new Intent();
                intent.putExtra("Contact_User", this.f66011c.f64724Z);
                intent.putExtra("biz_profile_tab_type", 1);
                C88144b.m109791i(this.f66012d, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
            }
        }
    }

    /* renamed from: x03.q$e */
    public class C22979e implements Runnable {

        /* renamed from: d */
        public String f66013d;

        /* renamed from: e */
        public boolean f66014e;

        public C22979e(C22980a aVar) {
        }

        public void run() {
            try {
                C22974q.m27134a(C22974q.this, new JSONObject(this.f66013d), this.f66014e);
            } catch (Exception unused) {
            } catch (Throwable th) {
                C22974q.this.f66000b = false;
                throw th;
            }
            C22974q.this.f66000b = false;
        }
    }

    /* renamed from: x03.q$a */
    public class C22980a implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ C48216e f66016d;

        /* renamed from: x03.q$a$a */
        public class C22981a implements C88656g {

            /* renamed from: d */
            public final /* synthetic */ C51425to3 f66018d;

            public C22981a(C51425to3 to32) {
                this.f66018d = to32;
            }

            public String getKey() {
                return "requestVideoUrlResultParse";
            }

            public void run() {
                ArrayList arrayList = new ArrayList();
                Iterator<ur4> it = this.f66018d.f142314d.f142377d.iterator();
                while (it.hasNext()) {
                    ur4 next = it.next();
                    xh4 xh4 = new xh4();
                    if (!Util.isNullOrNil(next.f143053d.f134994d)) {
                        xh4.f64729h = next.f143053d.f134994d;
                        br4 br4 = next.f143055f;
                        if (br4 != null && br4.f131278d == 1) {
                            C51273so soVar = br4.f131280f;
                            if (soVar != null && !Util.isNullOrNil((List) soVar.f141641d)) {
                                xh4.f64710K.clear();
                                br4 br42 = next.f143055f;
                                xh4.f64715Q = br42.f131281g;
                                Iterator<do4> it4 = br42.f131280f.f141641d.iterator();
                                while (it4.hasNext()) {
                                    do4 next2 = it4.next();
                                    zh4 zh4 = new zh4();
                                    zh4.f145964d = next2.f132459d.mo123705h();
                                    zh4.f145965e = 0;
                                    xh4.f64710K.add(zh4);
                                    xh4.f64709J = next2.f132461f;
                                }
                                zh4 e = C21914h.m25157e(xh4.f64710K);
                                if (e != null) {
                                    xh4.f64726e = e.f145964d;
                                    xh4.f64719U = e.f145965e;
                                }
                            }
                        } else if (br4 != null && br4.f131278d == 2) {
                            C51273so soVar2 = br4.f131279e;
                            if (soVar2 != null && !Util.isNullOrNil((List) soVar2.f141641d)) {
                                xh4.f64710K.clear();
                                br4 br43 = next.f143055f;
                                xh4.f64715Q = br43.f131281g;
                                Iterator<do4> it5 = br43.f131279e.f141641d.iterator();
                                while (it5.hasNext()) {
                                    do4 next3 = it5.next();
                                    zh4 zh42 = new zh4();
                                    zh42.f145964d = next3.f132459d.mo123705h();
                                    zh42.f145965e = 0;
                                    xh4.f64710K.add(zh42);
                                    xh4.f64709J = next3.f132461f;
                                }
                                zh4 e2 = C21914h.m25157e(xh4.f64710K);
                                if (e2 != null) {
                                    xh4.f64726e = e2.f145964d;
                                    xh4.f64719U = e2.f145965e;
                                }
                            }
                        } else if (!Util.isNullOrNil(next.f143056g)) {
                            xh4.f64710K.clear();
                            C22974q.m27145s(xh4, next.f143056g, "");
                            zh4 e3 = C21914h.m25157e(xh4.f64710K);
                            if (e3 != null) {
                                xh4.f64726e = e3.f145964d;
                                xh4.f64719U = e3.f145965e;
                                br4 br44 = next.f143055f;
                                if (br44 != null) {
                                    xh4.f64715Q = br44.f131281g;
                                }
                            }
                        }
                        arrayList.add(xh4);
                    }
                }
                synchronized (C22974q.this) {
                    List<xh4> b = C22974q.this.mo36192b();
                    if (!Util.isNullOrNil((List) b)) {
                        int i = 0;
                        while (true) {
                            LinkedList linkedList = (LinkedList) b;
                            if (i < linkedList.size()) {
                                xh4 xh42 = (xh4) linkedList.get(i);
                                Iterator it6 = arrayList.iterator();
                                while (it6.hasNext()) {
                                    xh4 xh43 = (xh4) it6.next();
                                    if (xh42.f64729h.equals(xh43.f64729h)) {
                                        xh42.f64710K = xh43.f64710K;
                                        xh42.f64709J = xh43.f64709J;
                                        String str = xh43.f64726e;
                                        xh42.f64726e = str;
                                        xh42.f64715Q = xh43.f64715Q;
                                        Log.m105919d("MicroMsg.TopStory.TopStoryVideoDataMgr", "item title:%s, after url:%s", xh42.f64725d, str);
                                    }
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    }
                }
            }
        }

        public C22980a(C48216e eVar) {
            this.f66016d = eVar;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            if ((yVar instanceof C48216e) && yVar.equals(this.f66016d)) {
                C89137b0 d = C86709a0.m107524d();
                this.f66016d.getClass();
                d.mo123470p(2579, this);
                if (i == 0 && i2 == 0) {
                    ((C119157j) C119157j.f356862d).mo183875f(new C22981a((C51425to3) ((C48216e) yVar).f129206e.f127056b.f127083a));
                    return;
                }
                Log.m105921e("MicroMsg.TopStory.TopStoryVideoDataMgr", "fetch videourl failed!, errType %s, errCode %s", Integer.valueOf(i), Integer.valueOf(i2));
            }
        }
    }

    /* renamed from: a */
    public static void m27134a(C22974q qVar, JSONObject jSONObject, boolean z) {
        qVar.getClass();
        JSONObject optJSONObject = jSONObject.optJSONObject("client_conf");
        if (optJSONObject != null) {
            qVar.f66001c = optJSONObject.optInt("enable_prefetch", 0);
            optJSONObject.optInt("max_report_exposed_cnt", 0);
            optJSONObject.optInt("max_report_exposed_cnt", 0);
            Log.m105925i("MicroMsg.TopStory.TopStoryVideoDataMgr", "parseAndSetPreFetchReportInfo %s", optJSONObject.toString());
        }
        String optString = jSONObject.optString("searchID");
        Log.m105925i("MicroMsg.TopStory.TopStoryVideoDataMgr", "fetch response newsearchid: %s originSearchId: %s", optString, qVar.f65999a.mo24989r4().f64643j);
        if (!Util.isNullOrNil(optString)) {
            qVar.f65999a.mo24989r4().f64643j = optString;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("data");
        boolean optBoolean = jSONObject.optBoolean("isSinglePage", false);
        qVar.f65999a.mo24989r4().f64636A = optBoolean;
        if (optBoolean) {
            qVar.f65999a.mo24945C5();
        }
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            C102158a.m134600a(1);
            qVar.f65999a.mo24976a3(-4, jSONObject.optString("nomoreText"));
            return;
        }
        try {
            List<xh4> k = m27140k(qVar.f65999a.mo24970W3(), optJSONArray);
            if (((ArrayList) k).size() == 0) {
                qVar.f65999a.mo24976a3(-2, MMApplicationContext.getContext().getString(C0966R.string.ht7));
            } else {
                qVar.f65999a.mo24986m5(k, z);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.TopStory.TopStoryVideoDataMgr", e, "parseAndRequestVideoList error: %s", e.getMessage());
            C102158a.m134600a(3);
            qVar.f65999a.mo24976a3(-3, "ParseDataError");
        }
    }

    /* renamed from: c */
    public static int m27135c() {
        int netType = NetStatusUtil.getNetType(MMApplicationContext.getContext());
        if (netType == -1) {
            return 0;
        }
        if (netType == 0) {
            return 1;
        }
        if (NetStatusUtil.is2G(MMApplicationContext.getContext())) {
            return 2;
        }
        if (NetStatusUtil.is3G(MMApplicationContext.getContext())) {
            return 3;
        }
        return NetStatusUtil.is4G(MMApplicationContext.getContext()) ? 4 : 0;
    }

    /* renamed from: f */
    public static boolean m27136f(xh4 xh4) {
        if (xh4 == null) {
            return false;
        }
        if (xh4.f64735p0 != 1 || TextUtils.isEmpty(xh4.f64740u)) {
            return xh4.f64735p0 == 2 && !TextUtils.isEmpty(xh4.f64724Z);
        }
        return true;
    }

    /* renamed from: g */
    public static String m27137g(String str, String str2, int i, int i2, int i3) {
        if (Util.isNullOrNil(str)) {
            return str;
        }
        String str3 = str + str2 + "Unicomtype=" + i + "&newnettype=" + i2 + "&Netoperator=" + i3;
        Log.m105918d("MicroMsg.TopStory.TopStoryVideoDataMgr", "joinUrlWithNetInfo: " + str3);
        return str3;
    }

    /* renamed from: h */
    public static boolean m27138h(xh4 xh4, Context context) {
        if (xh4 != null) {
            Log.m105925i("MicroMsg.TopStory.TopStoryVideoDataMgr", "jumpToProfile sJumpType:%s", Integer.valueOf(xh4.f64735p0));
            int i = xh4.f64735p0;
            if (i == 1) {
                if (!Util.isNullOrNil(xh4.f64740u)) {
                    Intent intent = new Intent();
                    intent.putExtra("rawUrl", xh4.f64740u);
                    C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                    return true;
                }
            } else if (i == 2 && !TextUtils.isEmpty(xh4.f64724Z)) {
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(xh4.f64724Z);
                if (z1Var == null || ((int) z1Var.f108320R1) <= 0) {
                    Log.m105924i("MicroMsg.TopStory.TopStoryVideoDataMgr", "jumpToProfile contact not exist, getNow");
                    boolean[] zArr = {false};
                    C89779i0 Q = C76879j.m92723Q(context, (String) null, context.getString(C0966R.string.gap), false, true, new C22977c(zArr));
                    try {
                        C31519v2.m39436a().mo55988e(xh4.f64724Z, "", new C22978d(Q, zArr, xh4, context));
                    } catch (Throwable th) {
                        Q.dismiss();
                        Log.m105921e("MicroMsg.TopStory.TopStoryVideoDataMgr", "jumpToProfile err:%s", th.getMessage());
                    }
                } else {
                    Log.m105924i("MicroMsg.TopStory.TopStoryVideoDataMgr", "jumpToProfile contact exist");
                    Intent intent2 = new Intent();
                    intent2.putExtra("Contact_User", xh4.f64724Z);
                    intent2.putExtra("biz_profile_tab_type", 1);
                    C88144b.m109791i(context, Scopes.PROFILE, ".ui.ContactInfoUI", intent2, (Bundle) null);
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public static void m27139j(JSONArray jSONArray, xh4 xh4) {
        try {
            JSONObject optJSONObject = jSONArray.optJSONObject(0);
            qh4 qh4 = new qh4();
            xh4.f64723Y = qh4;
            qh4.f64506j = optJSONObject.optString("bizuin");
            xh4.f64723Y.f64504h = optJSONObject.optString("id");
            JSONObject optJSONObject2 = optJSONObject.optJSONArray("list").optJSONObject(0);
            xh4.f64723Y.f64500d = optJSONObject2.optInt("beginTime");
            xh4.f64723Y.f64501e = optJSONObject2.optInt("endTime");
            xh4.f64723Y.f64502f = optJSONObject2.optInt("minShowTime");
            xh4.f64723Y.f64503g = optJSONObject2.optInt("type");
            xh4.f64723Y.f64505i = optJSONObject2.optString("id");
            JSONObject jSONObject = new JSONObject(optJSONObject2.optString("dot"));
            xh4.f64723Y.f64507n = new ph4();
            xh4.f64723Y.f64507n.f64399d = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            xh4.f64723Y.f64507n.f64400e = jSONObject.optString("desc");
            xh4.f64723Y.f64507n.f64401f = jSONObject.optString("relativeURL");
            xh4.f64723Y.f64507n.f64402g = jSONObject.optString("originalId");
            xh4.f64723Y.f64507n.f64403h = jSONObject.optString("weAppName");
            xh4.f64723Y.f64507n.f64404i = jSONObject.optString("appId");
            xh4.f64723Y.f64507n.f64405j = jSONObject.optString("avatar");
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x02d7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x02f6  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<te3.xh4> m27140k(boolean r30, org.json.JSONArray r31) {
        /*
            r0 = r30
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3 = 0
        L_0x0008:
            int r4 = r31.length()
            if (r3 >= r4) goto L_0x032d
            r4 = r31
            java.lang.Object r5 = r4.get(r3)
            org.json.JSONObject r5 = (org.json.JSONObject) r5
            java.lang.String r6 = "resultType"
            long r6 = r5.optLong(r6)
            java.lang.String r8 = "type"
            long r8 = r5.optLong(r8)
            java.lang.String r10 = "expand"
            java.lang.String r11 = r5.optString(r10)
            java.lang.String r12 = "items"
            org.json.JSONArray r5 = r5.optJSONArray(r12)
            if (r5 == 0) goto L_0x031c
            int r12 = r5.length()
            if (r12 <= 0) goto L_0x031c
            r12 = 0
        L_0x0038:
            int r13 = r5.length()
            if (r12 >= r13) goto L_0x031c
            java.lang.Object r13 = r5.get(r12)
            org.json.JSONObject r13 = (org.json.JSONObject) r13
            java.lang.String r14 = "videoId"
            java.lang.String r15 = r13.optString(r14)
            java.lang.String r2 = "docID"
            java.lang.String r4 = r13.optString(r2)
            r16 = r5
            java.lang.String r5 = "mediaDuration"
            r17 = r3
            r18 = r12
            r3 = 0
            int r12 = r13.optInt(r5, r3)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            r19 = r1
            java.lang.String r1 = "videoid: %s, videoUrl: %s, videoSize: %s"
            r20 = r1
            r21 = 0
            java.lang.String r1 = "MicroMsg.TopStory.TopStoryVideoDataMgr"
            r22 = r1
            if (r3 != 0) goto L_0x02c8
            te3.xh4 r3 = new te3.xh4
            r3.<init>()
            r3.f64729h = r15
            m27143n(r13, r3)
            m27144r(r0, r3, r13)
            java.lang.String r15 = r3.f64726e
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            if (r15 == 0) goto L_0x008b
            r15 = 11
            v73.C102158a.m134600a(r15)
        L_0x008b:
            r3.f64728g = r12
            java.lang.String r12 = "title"
            java.lang.String r15 = r13.optString(r12)
            r3.f64725d = r15
            java.lang.String r15 = "shareTitle"
            java.lang.String r15 = r13.optString(r15)
            r3.f64733o = r15
            java.lang.String r15 = "shareDesc"
            java.lang.String r15 = r13.optString(r15)
            r3.f64734p = r15
            java.lang.String r15 = "shareImgUrl"
            java.lang.String r15 = r13.optString(r15)
            r3.f64736q = r15
            java.lang.String r15 = "shareString"
            java.lang.String r15 = r13.optString(r15)
            r3.f64737r = r15
            java.lang.String r15 = "shareStringUrl"
            java.lang.String r15 = r13.optString(r15)
            r3.f64738s = r15
            java.lang.String r15 = "source"
            java.lang.String r15 = r13.optString(r15)
            r3.f64739t = r15
            java.lang.String r15 = "sourceUrl"
            java.lang.String r15 = r13.optString(r15)
            r3.f64740u = r15
            java.lang.String r15 = "shareUrl"
            java.lang.String r1 = r13.optString(r15)
            r3.f64732n = r1
            r0 = -1
            r23 = r15
            java.lang.String r15 = "relevant_category"
            long r0 = r13.optLong(r15, r0)
            r3.f64741v = r0
            java.lang.String r0 = "shareOpenId"
            java.lang.String r0 = r13.optString(r0)
            r3.f64742w = r0
            java.lang.String r0 = r13.optString(r10)
            r3.f64743x = r0
            java.lang.String r0 = "strPlayCount"
            java.lang.String r0 = r13.optString(r0)
            r3.f64744y = r0
            java.lang.String r0 = "titleUrl"
            java.lang.String r0 = r13.optString(r0)
            r3.f64745z = r0
            java.lang.String r0 = "itemType"
            int r1 = r13.optInt(r0)
            r3.f64700A = r1
            java.lang.String r1 = "bizIcon"
            java.lang.String r1 = r13.optString(r1)
            r3.f64702C = r1
            r1 = r14
            long r14 = r3.f64741v
            r24 = r10
            java.lang.String r10 = "shareChannelId"
            long r14 = r13.optLong(r10, r14)
            r3.f64712M = r14
            long r14 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r3.f64704E = r14
            r10 = 0
            r3.f64705F = r10
            r3.f64706G = r4
            r3.f64707H = r6
            r3.f64708I = r8
            r3.f64701B = r11
            java.lang.String r4 = "switchFlag"
            int r4 = r13.optInt(r4, r10)
            r3.f64711L = r4
            java.lang.String r4 = "bizUserName"
            java.lang.String r4 = r13.optString(r4)
            r3.f64724Z = r4
            java.lang.String r4 = "sourceJumpType"
            r10 = 1
            int r4 = r13.optInt(r4, r10)
            r3.f64735p0 = r4
            java.lang.String r4 = "colikeInfo"
            org.json.JSONObject r4 = r13.optJSONObject(r4)
            java.lang.String r10 = ""
            if (r4 == 0) goto L_0x0178
            java.lang.String r14 = "isSelfThumb"
            boolean r14 = r4.optBoolean(r14)
            r3.f64716R = r14
            java.lang.String r14 = "byPass"
            java.lang.String r14 = r4.optString(r14, r10)
            r3.f64717S = r14
            java.lang.String r14 = "globalColikeCnt"
            r15 = 0
            int r4 = r4.optInt(r14, r15)
            r3.f64722X = r4
        L_0x0178:
            java.lang.String r4 = "extReqParams"
            org.json.JSONArray r14 = r13.optJSONArray(r4)
            if (r14 == 0) goto L_0x0189
            java.util.LinkedList<te3.hy> r15 = r3.f64721W
            java.lang.String r14 = r14.toString()
            p03.C21914h.m25165m(r15, r14)
        L_0x0189:
            java.lang.String r14 = "show_tag_list"
            org.json.JSONArray r15 = r13.optJSONArray(r14)
            if (r15 == 0) goto L_0x0195
            m27141l(r15, r3)
        L_0x0195:
            java.lang.String r15 = "not_show_feedback"
            r25 = r6
            r6 = 0
            boolean r7 = r13.optBoolean(r15, r6)
            java.lang.String r6 = "feedbackObj"
            if (r7 != 0) goto L_0x01a9
            org.json.JSONObject r7 = r13.optJSONObject(r6)
            m27142m(r7, r3)
        L_0x01a9:
            java.lang.String r7 = "videoMpDotInfo"
            org.json.JSONArray r7 = r13.optJSONArray(r7)     // Catch:{ Exception -> 0x01b6 }
            if (r7 == 0) goto L_0x01b7
            m27139j(r7, r3)     // Catch:{ Exception -> 0x01b6 }
            goto L_0x01b7
        L_0x01b6:
        L_0x01b7:
            java.lang.String r7 = "videoSecondInfo"
            org.json.JSONObject r7 = r13.optJSONObject(r7)
            if (r7 == 0) goto L_0x01fe
            te3.sh4 r15 = new te3.sh4
            r15.<init>()
            r3.f64713N = r15
            r27 = r8
            java.lang.String r8 = "insertPos"
            r9 = 2
            int r8 = r7.optInt(r8, r9)
            r15.f64607f = r8
            te3.sh4 r8 = r3.f64713N
            java.lang.String r9 = "originVideoId"
            java.lang.String r9 = r7.optString(r9, r10)
            r8.f64606e = r9
            te3.sh4 r8 = r3.f64713N
            java.lang.String r9 = "videoSecondType"
            r15 = 1
            int r9 = r7.optInt(r9, r15)
            r8.f64605d = r9
            te3.sh4 r8 = r3.f64713N
            java.lang.String r9 = "requestDuration"
            r15 = 0
            int r9 = r7.optInt(r9, r15)
            r8.f64608g = r9
            te3.sh4 r8 = r3.f64713N
            java.lang.String r9 = "requestPercent"
            int r7 = r7.optInt(r9, r15)
            r8.f64609h = r7
            goto L_0x0200
        L_0x01fe:
            r27 = r8
        L_0x0200:
            java.lang.String r7 = "longVideoItem"
            org.json.JSONObject r7 = r13.optJSONObject(r7)
            if (r7 == 0) goto L_0x02a0
            te3.xh4 r8 = new te3.xh4
            r8.<init>()
            r3.f64720V = r8
            java.lang.String r2 = r7.optString(r2, r10)
            r8.f64706G = r2
            te3.xh4 r2 = r3.f64720V
            java.lang.String r8 = r7.optString(r12, r10)
            r2.f64725d = r8
            te3.xh4 r2 = r3.f64720V
            r8 = 0
            int r5 = r7.optInt(r5, r8)
            r2.f64728g = r5
            te3.xh4 r2 = r3.f64720V
            int r0 = r7.optInt(r0, r8)
            r2.f64700A = r0
            te3.xh4 r0 = r3.f64720V
            java.lang.String r1 = r7.optString(r1, r10)
            r0.f64729h = r1
            org.json.JSONArray r0 = r7.optJSONArray(r14)
            if (r0 == 0) goto L_0x0241
            te3.xh4 r1 = r3.f64720V
            m27141l(r0, r1)
        L_0x0241:
            org.json.JSONObject r0 = r7.optJSONObject(r6)
            if (r0 == 0) goto L_0x024c
            te3.xh4 r1 = r3.f64720V
            m27142m(r0, r1)
        L_0x024c:
            org.json.JSONArray r0 = r7.optJSONArray(r4)
            if (r0 == 0) goto L_0x025d
            te3.xh4 r1 = r3.f64720V
            java.util.LinkedList<te3.hy> r1 = r1.f64721W
            java.lang.String r0 = r0.toString()
            p03.C21914h.m25165m(r1, r0)
        L_0x025d:
            te3.xh4 r0 = r3.f64720V
            m27143n(r7, r0)
            te3.xh4 r0 = r3.f64720V
            r1 = r30
            m27144r(r1, r0, r7)
            te3.xh4 r0 = r3.f64720V
            java.lang.String r2 = r3.f64739t
            r0.f64739t = r2
            java.lang.String r2 = r3.f64740u
            r0.f64740u = r2
            java.lang.String r2 = r3.f64702C
            r0.f64702C = r2
            long r4 = r3.f64712M
            r0.f64712M = r4
            java.lang.String r2 = r3.f64733o
            r0.f64733o = r2
            java.lang.String r2 = r3.f64734p
            r0.f64734p = r2
            java.lang.String r2 = r3.f64742w
            r0.f64742w = r2
            java.lang.String r2 = r3.f64736q
            r0.f64736q = r2
            java.lang.String r2 = r3.f64737r
            r0.f64737r = r2
            java.lang.String r2 = r3.f64738s
            r0.f64738s = r2
            java.lang.String r2 = r3.f64742w
            r0.f64742w = r2
            r2 = r23
            java.lang.String r2 = r7.optString(r2, r10)
            r0.f64732n = r2
            goto L_0x02a2
        L_0x02a0:
            r1 = r30
        L_0x02a2:
            java.lang.String r0 = r3.f64726e
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x02cf
            r0 = 3
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r0 = r3.f64729h
            r4 = 0
            r2[r4] = r0
            java.lang.String r0 = r3.f64726e
            r4 = 1
            r2[r4] = r0
            long r4 = r3.f64709J
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r4 = 2
            r2[r4] = r0
            r0 = r20
            r4 = r22
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r0, r2)
            goto L_0x02d5
        L_0x02c8:
            r1 = r0
            r25 = r6
            r27 = r8
            r24 = r10
        L_0x02cf:
            r0 = r20
            r4 = r22
            r3 = r21
        L_0x02d5:
            if (r3 == 0) goto L_0x02f6
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r5 = r3.f64729h
            r6 = 0
            r2[r6] = r5
            java.lang.String r5 = r3.f64726e
            r7 = 1
            r2[r7] = r5
            long r7 = r3.f64709J
            java.lang.Long r5 = java.lang.Long.valueOf(r7)
            r7 = 2
            r2[r7] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r0, r2)
            r0 = r19
            r0.add(r3)
            goto L_0x0307
        L_0x02f6:
            r0 = r19
            r6 = 0
            r7 = 1
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.String r3 = r13.toString()
            r2[r6] = r3
            java.lang.String r3 = "Can not add video %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r3, r2)
        L_0x0307:
            int r12 = r18 + 1
            r4 = r31
            r5 = r16
            r3 = r17
            r10 = r24
            r6 = r25
            r8 = r27
            r29 = r1
            r1 = r0
            r0 = r29
            goto L_0x0038
        L_0x031c:
            r17 = r3
            r6 = 0
            r29 = r1
            r1 = r0
            r0 = r29
            int r3 = r17 + 1
            r29 = r1
            r1 = r0
            r0 = r29
            goto L_0x0008
        L_0x032d:
            r0 = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x03.C22974q.m27140k(boolean, org.json.JSONArray):java.util.List");
    }

    /* renamed from: l */
    public static void m27141l(JSONArray jSONArray, xh4 xh4) {
        for (int i = 0; i < jSONArray.length(); i++) {
            e54 e54 = new e54();
            e54.f63770d = jSONArray.getJSONObject(i).optString("id");
            e54.f63771e = jSONArray.getJSONObject(i).optString("wording");
            e54.f63772f = jSONArray.getJSONObject(i).optLong("category");
            e54.f63773g = jSONArray.getJSONObject(i).optInt("actionType");
            e54.f63774h = jSONArray.getJSONObject(i).optString("url");
            e54.f63775i = jSONArray.getJSONObject(i).optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            e54.f63776j = jSONArray.getJSONObject(i).optString("subTitle");
            e54.f63777n = jSONArray.getJSONObject(i).optString("icon");
            xh4.f64703D.add(e54);
        }
    }

    /* renamed from: m */
    public static void m27142m(JSONObject jSONObject, xh4 xh4) {
        vh4 vh4 = new vh4();
        xh4.f64718T = vh4;
        vh4.f185896d = jSONObject.optString("detailWording");
        xh4.f64718T.f185897e = jSONObject.optString("detailUrl");
        JSONArray optJSONArray = jSONObject.optJSONArray("feedbackData");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                C64467je0 je02 = new C64467je0();
                je02.f183790d = optJSONArray.optJSONObject(i).optString("id", "");
                je02.f183791e = optJSONArray.optJSONObject(i).optString("wording", "");
                je02.f183792f = optJSONArray.optJSONObject(i).optBoolean("isUseToConfirm", false);
                xh4.f64718T.f185898f.add(je02);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ce  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m27143n(org.json.JSONObject r13, te3.xh4 r14) {
        /*
            java.lang.String r0 = "videoPlatform"
            java.lang.String r0 = r13.optString(r0)
            java.lang.String r1 = "videoApi"
            java.lang.String r1 = r13.optString(r1)
            java.lang.String r2 = "videoInfo"
            org.json.JSONObject r13 = r13.optJSONObject(r2)
            java.lang.String r2 = "MicroMsg.TopStory.TopStoryVideoDataMgr"
            if (r13 == 0) goto L_0x0103
            java.lang.String r3 = "videoCdnInfo"
            org.json.JSONObject r13 = r13.optJSONObject(r3)
            r3 = 0
            if (r13 == 0) goto L_0x0033
            java.lang.String r4 = "cdnScene"
            int r4 = r13.optInt(r4, r3)
            r14.f64714P = r4
            java.lang.String r4 = "cdnSourceType"
            int r4 = r13.optInt(r4, r3)
            r14.f64715Q = r4
        L_0x0033:
            int r4 = r14.f64714P
            r5 = 2
            r6 = 1
            if (r4 == r6) goto L_0x003d
            int r7 = r14.f64715Q
            if (r7 != r5) goto L_0x00f1
        L_0x003d:
            java.lang.String r7 = "filesize"
            java.lang.String r8 = "url"
            java.lang.String r9 = "urlInfo"
            if (r4 != r6) goto L_0x004e
            java.lang.String r4 = "mpInfo"
            org.json.JSONObject r13 = r13.optJSONObject(r4)     // Catch:{ Exception -> 0x00b0 }
            goto L_0x0054
        L_0x004e:
            java.lang.String r4 = "ctnInfo"
            org.json.JSONObject r13 = r13.optJSONObject(r4)     // Catch:{ Exception -> 0x00b0 }
        L_0x0054:
            if (r13 == 0) goto L_0x00ca
            org.json.JSONArray r4 = r13.optJSONArray(r9)     // Catch:{ Exception -> 0x00b0 }
            if (r4 == 0) goto L_0x00ca
            org.json.JSONArray r4 = r13.optJSONArray(r9)     // Catch:{ Exception -> 0x00b0 }
            r9 = 0
        L_0x0061:
            int r10 = r4.length()     // Catch:{ Exception -> 0x00b0 }
            if (r9 >= r10) goto L_0x0095
            java.lang.Object r10 = r4.get(r9)     // Catch:{ Exception -> 0x00b0 }
            org.json.JSONObject r10 = (org.json.JSONObject) r10     // Catch:{ Exception -> 0x00b0 }
            boolean r11 = r10.has(r8)     // Catch:{ Exception -> 0x00b0 }
            if (r11 == 0) goto L_0x0092
            boolean r11 = r10.has(r7)     // Catch:{ Exception -> 0x00b0 }
            if (r11 == 0) goto L_0x0092
            int r11 = r10.optInt(r7, r3)     // Catch:{ Exception -> 0x00b0 }
            long r11 = (long) r11     // Catch:{ Exception -> 0x00b0 }
            r14.f64709J = r11     // Catch:{ Exception -> 0x00b0 }
            te3.zh4 r11 = new te3.zh4     // Catch:{ Exception -> 0x00b0 }
            r11.<init>()     // Catch:{ Exception -> 0x00b0 }
            java.lang.String r10 = r10.optString(r8)     // Catch:{ Exception -> 0x00b0 }
            r11.f145964d = r10     // Catch:{ Exception -> 0x00b0 }
            r11.f145965e = r3     // Catch:{ Exception -> 0x00b0 }
            java.util.LinkedList<te3.zh4> r10 = r14.f64710K     // Catch:{ Exception -> 0x00b0 }
            r10.add(r11)     // Catch:{ Exception -> 0x00b0 }
        L_0x0092:
            int r9 = r9 + 1
            goto L_0x0061
        L_0x0095:
            java.lang.String r4 = "coverUrl"
            java.lang.String r13 = r13.optString(r4)     // Catch:{ Exception -> 0x00b0 }
            r14.f64727f = r13     // Catch:{ Exception -> 0x00b0 }
            long r7 = r14.f64709J     // Catch:{ Exception -> 0x00b0 }
            r9 = 0
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 <= 0) goto L_0x00ca
            java.util.LinkedList<te3.zh4> r13 = r14.f64710K     // Catch:{ Exception -> 0x00b0 }
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r13)     // Catch:{ Exception -> 0x00b0 }
            if (r13 == 0) goto L_0x00ae
            goto L_0x00ca
        L_0x00ae:
            r13 = 1
            goto L_0x00cb
        L_0x00b0:
            r13 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "setVideoInfoByCdn exception: "
            r4.append(r7)
            java.lang.String r13 = r13.getMessage()
            r4.append(r13)
            java.lang.String r13 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r13)
        L_0x00ca:
            r13 = 0
        L_0x00cb:
            if (r13 != 0) goto L_0x00ce
            goto L_0x00f1
        L_0x00ce:
            r13 = 4
            java.lang.Object[] r13 = new java.lang.Object[r13]
            int r4 = r14.f64714P
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r13[r3] = r4
            java.lang.String r3 = r14.f64729h
            r13[r6] = r3
            java.lang.String r3 = r14.f64725d
            r13[r5] = r3
            r3 = 3
            long r4 = r14.f64709J
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r13[r3] = r4
            java.lang.String r3 = "useCdnData, cdnScene:%s, vid:%s, title:%s, size:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r13)
            r3 = 1
        L_0x00f1:
            if (r3 == 0) goto L_0x0103
            java.util.LinkedList<te3.zh4> r13 = r14.f64710K
            te3.zh4 r13 = p03.C21914h.m25157e(r13)
            if (r13 == 0) goto L_0x0103
            java.lang.String r3 = r13.f145964d
            r14.f64726e = r3
            int r13 = r13.f145965e
            r14.f64719U = r13
        L_0x0103:
            java.lang.String r13 = r14.f64726e
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r13 == 0) goto L_0x013a
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r13 != 0) goto L_0x013a
            m27145s(r14, r1, r0)
            java.util.LinkedList<te3.zh4> r13 = r14.f64710K
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r13)
            if (r13 == 0) goto L_0x012a
            r13 = 29
            v73.C102158a.m134600a(r13)
            java.lang.String r13 = "setVideoInfoByVideoApi retry"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r13)
            m27145s(r14, r1, r0)
        L_0x012a:
            java.util.LinkedList<te3.zh4> r13 = r14.f64710K
            te3.zh4 r13 = p03.C21914h.m25157e(r13)
            if (r13 == 0) goto L_0x013a
            java.lang.String r0 = r13.f145964d
            r14.f64726e = r0
            int r13 = r13.f145965e
            r14.f64719U = r13
        L_0x013a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x03.C22974q.m27143n(org.json.JSONObject, te3.xh4):void");
    }

    /* renamed from: r */
    public static void m27144r(boolean z, xh4 xh4, JSONObject jSONObject) {
        String optString = jSONObject.optString("thumbUrl");
        xh4.f64727f = optString;
        if (z) {
            xh4.f64730i = v2helper.VOIP_ENC_HEIGHT_LV1;
            xh4.f64731j = 640;
        } else {
            xh4.f64730i = C83031z.CTRL_INDEX;
            xh4.f64731j = 280;
        }
        if (Util.isNullOrNil(optString)) {
            xh4.f64727f = "http://shp.qpic.cn/qqvideo_ori/0/" + xh4.f64729h + String.format("_%s_%s/0", new Object[]{Integer.valueOf(xh4.f64730i), Integer.valueOf(xh4.f64731j)});
        }
        Log.m105925i("MicroMsg.TopStory.TopStoryVideoDataMgr", "setThumbnailUrl %s %s", xh4.f64729h, xh4.f64727f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x00b2 A[EDGE_INSN: B:118:0x00b2->B:48:0x00b2 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x00f1 A[EDGE_INSN: B:120:0x00f1->B:59:0x00f1 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0064 A[Catch:{ all -> 0x01c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0088 A[SYNTHETIC, Splitter:B:38:0x0088] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ae A[Catch:{ all -> 0x01b9 }, LOOP:0: B:45:0x00a8->B:47:0x00ae, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d8 A[Catch:{ all -> 0x01b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x013a A[Catch:{ all -> 0x01b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01b3  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m27145s(te3.xh4 r17, java.lang.String r18, java.lang.String r19) {
        /*
            r0 = r17
            r1 = r18
            java.lang.String r2 = "MicroMsg.TopStory.TopStoryVideoDataMgr"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = ""
            r3.<init>(r4)
            r4 = 0
            r5 = 1
            r6 = 0
            boolean r7 = u73.C101987v0.m134275i()     // Catch:{ all -> 0x01c5 }
            r8 = 2
            if (r7 == 0) goto L_0x0019
            r7 = 2
            goto L_0x001a
        L_0x0019:
            r7 = -1
        L_0x001a:
            int r9 = m27135c()     // Catch:{ all -> 0x01c5 }
            android.content.Context r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x01c5 }
            int r10 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getISPCode(r10)     // Catch:{ all -> 0x01c5 }
            r11 = 3
            if (r10 != 0) goto L_0x002a
            goto L_0x0051
        L_0x002a:
            int r12 = r10 / 100
            int r10 = r10 % 100
            r13 = 460(0x1cc, float:6.45E-43)
            if (r12 != r13) goto L_0x0051
            if (r10 == 0) goto L_0x004f
            if (r10 == r8) goto L_0x004f
            r12 = 7
            if (r10 != r12) goto L_0x003a
            goto L_0x004f
        L_0x003a:
            if (r10 == r5) goto L_0x0052
            r12 = 6
            if (r10 == r12) goto L_0x0052
            r12 = 9
            if (r10 != r12) goto L_0x0044
            goto L_0x0052
        L_0x0044:
            if (r10 == r11) goto L_0x004d
            r8 = 5
            if (r10 == r8) goto L_0x004d
            r8 = 11
            if (r10 != r8) goto L_0x0051
        L_0x004d:
            r8 = 1
            goto L_0x0052
        L_0x004f:
            r8 = 3
            goto L_0x0052
        L_0x0051:
            r8 = 0
        L_0x0052:
            java.lang.String r10 = "setVideoInfoByVideoApi, videoapi: %s"
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ all -> 0x01c5 }
            r11[r4] = r1     // Catch:{ all -> 0x01c5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r10, r11)     // Catch:{ all -> 0x01c5 }
            boolean r10 = android.webkit.URLUtil.isHttpsUrl(r18)     // Catch:{ all -> 0x01c5 }
            r11 = 3000(0xbb8, float:4.204E-42)
            if (r10 == 0) goto L_0x0088
            com.tencent.mm.network.e0 r10 = new com.tencent.mm.network.e0     // Catch:{ all -> 0x01c5 }
            r10.<init>(r1)     // Catch:{ all -> 0x01c5 }
            javax.net.ssl.HttpsURLConnection r1 = r10.f108504a     // Catch:{ all -> 0x0084 }
            r1.setUseCaches(r5)     // Catch:{ all -> 0x0084 }
            javax.net.ssl.HttpsURLConnection r1 = r10.f108504a     // Catch:{ all -> 0x0084 }
            r1.setConnectTimeout(r11)     // Catch:{ all -> 0x0084 }
            javax.net.ssl.HttpsURLConnection r1 = r10.f108504a     // Catch:{ all -> 0x0084 }
            r1.setReadTimeout(r11)     // Catch:{ all -> 0x0084 }
            javax.net.ssl.HttpsURLConnection r1 = r10.f108504a     // Catch:{ all -> 0x0084 }
            java.io.InputStream r1 = r1.getInputStream()     // Catch:{ all -> 0x0084 }
            r16 = r6
            r6 = r1
            r1 = r16
            goto L_0x009e
        L_0x0084:
            r0 = move-exception
            r1 = r6
            goto L_0x01c8
        L_0x0088:
            com.tencent.mm.network.b0 r1 = com.tencent.p014mm.network.C81035d.m98963d(r1, r6)     // Catch:{ all -> 0x01c5 }
            r1.mo112918c(r5)     // Catch:{ all -> 0x01c0 }
            r1.mo112919d(r11)     // Catch:{ all -> 0x01c0 }
            r1.mo112923g(r11)     // Catch:{ all -> 0x01c0 }
            java.io.InputStream r10 = r1.getInputStream()     // Catch:{ all -> 0x01c0 }
            r16 = r10
            r10 = r6
            r6 = r16
        L_0x009e:
            java.io.InputStreamReader r11 = new java.io.InputStreamReader     // Catch:{ all -> 0x01b9 }
            r11.<init>(r6)     // Catch:{ all -> 0x01b9 }
            java.io.BufferedReader r12 = new java.io.BufferedReader     // Catch:{ all -> 0x01b9 }
            r12.<init>(r11)     // Catch:{ all -> 0x01b9 }
        L_0x00a8:
            java.lang.String r11 = r12.readLine()     // Catch:{ all -> 0x01b9 }
            if (r11 == 0) goto L_0x00b2
            r3.append(r11)     // Catch:{ all -> 0x01b9 }
            goto L_0x00a8
        L_0x00b2:
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ all -> 0x01b9 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01b9 }
            r12 = 13
            java.lang.String r3 = r3.substring(r12)     // Catch:{ all -> 0x01b9 }
            r11.<init>(r3)     // Catch:{ all -> 0x01b9 }
            java.lang.String r3 = "fl"
            org.json.JSONObject r3 = r11.optJSONObject(r3)     // Catch:{ all -> 0x01b9 }
            if (r3 == 0) goto L_0x00f1
            java.lang.String r12 = "fi"
            org.json.JSONArray r3 = r3.optJSONArray(r12)     // Catch:{ all -> 0x01b9 }
            if (r3 == 0) goto L_0x00f1
            r12 = 0
        L_0x00d2:
            int r13 = r3.length()     // Catch:{ all -> 0x01b9 }
            if (r12 >= r13) goto L_0x00f1
            org.json.JSONObject r13 = r3.getJSONObject(r12)     // Catch:{ all -> 0x01b9 }
            java.lang.String r14 = "sl"
            int r14 = r13.optInt(r14, r4)     // Catch:{ all -> 0x01b9 }
            if (r14 != r5) goto L_0x00ee
            java.lang.String r3 = "fs"
            long r12 = r13.optLong(r3)     // Catch:{ all -> 0x01b9 }
            r0.f64709J = r12     // Catch:{ all -> 0x01b9 }
            goto L_0x00f1
        L_0x00ee:
            int r12 = r12 + 1
            goto L_0x00d2
        L_0x00f1:
            java.lang.String r3 = "vl"
            org.json.JSONObject r3 = r11.optJSONObject(r3)     // Catch:{ all -> 0x01b9 }
            if (r3 == 0) goto L_0x01ac
            java.lang.String r11 = "vi"
            org.json.JSONArray r3 = r3.optJSONArray(r11)     // Catch:{ all -> 0x01b9 }
            if (r3 == 0) goto L_0x01ac
            int r11 = r3.length()     // Catch:{ all -> 0x01b9 }
            if (r11 <= 0) goto L_0x01ac
            org.json.JSONObject r3 = r3.getJSONObject(r4)     // Catch:{ all -> 0x01b9 }
            if (r3 == 0) goto L_0x01ac
            java.lang.String r11 = "fn"
            java.lang.String r11 = r3.optString(r11)     // Catch:{ all -> 0x01b9 }
            java.lang.String r12 = "fvkey"
            java.lang.String r12 = r3.optString(r12)     // Catch:{ all -> 0x01b9 }
            java.lang.String r13 = "ul"
            org.json.JSONObject r3 = r3.optJSONObject(r13)     // Catch:{ all -> 0x01b9 }
            if (r3 == 0) goto L_0x01ac
            java.lang.String r13 = "ui"
            org.json.JSONArray r3 = r3.optJSONArray(r13)     // Catch:{ all -> 0x01b9 }
            if (r3 == 0) goto L_0x01ac
            int r13 = r3.length()     // Catch:{ all -> 0x01b9 }
            if (r13 <= 0) goto L_0x01ac
            r13 = 0
        L_0x0134:
            int r14 = r3.length()     // Catch:{ all -> 0x01b9 }
            if (r13 >= r14) goto L_0x01ac
            org.json.JSONObject r14 = r3.getJSONObject(r13)     // Catch:{ all -> 0x01b9 }
            if (r14 == 0) goto L_0x01a8
            java.lang.String r15 = "url"
            java.lang.String r15 = r14.optString(r15)     // Catch:{ all -> 0x01b9 }
            java.lang.String r5 = "vt"
            int r5 = r14.optInt(r5, r4)     // Catch:{ all -> 0x01b9 }
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)     // Catch:{ all -> 0x01b9 }
            if (r14 != 0) goto L_0x01a8
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)     // Catch:{ all -> 0x01b9 }
            if (r14 != 0) goto L_0x01a8
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)     // Catch:{ all -> 0x01b9 }
            if (r14 != 0) goto L_0x01a8
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b9 }
            r14.<init>()     // Catch:{ all -> 0x01b9 }
            r14.append(r15)     // Catch:{ all -> 0x01b9 }
            r14.append(r11)     // Catch:{ all -> 0x01b9 }
            java.lang.String r15 = "?vkey="
            r14.append(r15)     // Catch:{ all -> 0x01b9 }
            r14.append(r12)     // Catch:{ all -> 0x01b9 }
            java.lang.String r14 = r14.toString()     // Catch:{ all -> 0x01b9 }
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r19)     // Catch:{ all -> 0x01b9 }
            if (r15 != 0) goto L_0x0194
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b9 }
            r15.<init>()     // Catch:{ all -> 0x01b9 }
            r15.append(r14)     // Catch:{ all -> 0x01b9 }
            java.lang.String r14 = "&platform="
            r15.append(r14)     // Catch:{ all -> 0x01b9 }
            r14 = r19
            r15.append(r14)     // Catch:{ all -> 0x01b9 }
            java.lang.String r15 = r15.toString()     // Catch:{ all -> 0x01b9 }
            r14 = r15
        L_0x0194:
            java.lang.String r15 = "&"
            java.lang.String r14 = m27137g(r14, r15, r7, r9, r8)     // Catch:{ all -> 0x01b9 }
            te3.zh4 r15 = new te3.zh4     // Catch:{ all -> 0x01b9 }
            r15.<init>()     // Catch:{ all -> 0x01b9 }
            r15.f145964d = r14     // Catch:{ all -> 0x01b9 }
            r15.f145965e = r5     // Catch:{ all -> 0x01b9 }
            java.util.LinkedList<te3.zh4> r5 = r0.f64710K     // Catch:{ all -> 0x01b9 }
            r5.add(r15)     // Catch:{ all -> 0x01b9 }
        L_0x01a8:
            int r13 = r13 + 1
            r5 = 1
            goto L_0x0134
        L_0x01ac:
            if (r1 == 0) goto L_0x01b1
            r1.disconnect()
        L_0x01b1:
            if (r10 == 0) goto L_0x01b6
            r10.mo63087a()
        L_0x01b6:
            if (r6 == 0) goto L_0x01e6
            goto L_0x01e3
        L_0x01b9:
            r0 = move-exception
            r16 = r6
            r6 = r1
            r1 = r16
            goto L_0x01c8
        L_0x01c0:
            r0 = move-exception
            r10 = r6
            r6 = r1
            r1 = r10
            goto L_0x01c8
        L_0x01c5:
            r0 = move-exception
            r1 = r6
            r10 = r1
        L_0x01c8:
            java.lang.String r3 = "getVideoUrlByVideoApi error: %s"
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x01e7 }
            java.lang.String r7 = r0.getMessage()     // Catch:{ all -> 0x01e7 }
            r5[r4] = r7     // Catch:{ all -> 0x01e7 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r3, r5)     // Catch:{ all -> 0x01e7 }
            if (r6 == 0) goto L_0x01db
            r6.disconnect()
        L_0x01db:
            if (r10 == 0) goto L_0x01e0
            r10.mo63087a()
        L_0x01e0:
            if (r1 == 0) goto L_0x01e6
            r6 = r1
        L_0x01e3:
            com.tencent.p014mm.vfs.C116299g2.m163847c(r6)
        L_0x01e6:
            return
        L_0x01e7:
            r0 = move-exception
            if (r6 == 0) goto L_0x01ed
            r6.disconnect()
        L_0x01ed:
            if (r10 == 0) goto L_0x01f2
            r10.mo63087a()
        L_0x01f2:
            if (r1 == 0) goto L_0x01f7
            com.tencent.p014mm.vfs.C116299g2.m163847c(r1)
        L_0x01f7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x03.C22974q.m27145s(te3.xh4, java.lang.String, java.lang.String):void");
    }

    /* renamed from: b */
    public List<xh4> mo36192b() {
        return this.f65999a.mo24989r4().f64651u;
    }

    /* renamed from: d */
    public xh4 mo36193d(int i) {
        synchronized (this) {
            if (i >= 0) {
                if (i < ((LinkedList) mo36192b()).size()) {
                    xh4 xh4 = (xh4) ((LinkedList) mo36192b()).get(i);
                    return xh4;
                }
            }
            return null;
        }
    }

    /* renamed from: e */
    public int mo36194e() {
        return ((LinkedList) mo36192b()).size();
    }

    /* renamed from: i */
    public void mo36195i() {
        if (this.f66002d != null) {
            C86709a0.m107524d().mo123458d(this.f66002d);
            this.f66002d = null;
        }
        if (this.f66003e != null) {
            C86709a0.m107524d().mo123458d(this.f66003e);
            this.f66003e = null;
        }
        C86709a0.m107524d().mo123470p(1943, this.f66004f);
    }

    /* renamed from: o */
    public void mo36196o(int i) {
        synchronized (this) {
            if (i >= 0) {
                if (i < ((LinkedList) mo36192b()).size()) {
                    ((LinkedList) mo36192b()).remove(i);
                }
            }
        }
    }

    /* renamed from: p */
    public boolean mo36197p(int i) {
        boolean z;
        String str;
        if (this.f66000b) {
            Log.m105928w("MicroMsg.TopStory.TopStoryVideoDataMgr", "RequestingData");
            return false;
        }
        Log.m105925i("MicroMsg.TopStory.TopStoryVideoDataMgr", "requestData: %s", Integer.valueOf(i));
        this.f66000b = true;
        uh4 a = C21914h.m25153a(this.f65999a.mo24989r4());
        a.f64649s = i;
        if (!Util.isNullOrNil(this.f65999a.mo24989r4().f64637d)) {
            C49768hy hyVar = new C49768hy();
            hyVar.f134951d = "relevant_vid";
            hyVar.f134953f = this.f65999a.mo24989r4().f64637d;
            a.f64647q.add(hyVar);
        }
        if (!Util.isNullOrNil(this.f65999a.mo24989r4().f64638e)) {
            C49768hy hyVar2 = new C49768hy();
            hyVar2.f134951d = "relevant_expand";
            hyVar2.f134953f = this.f65999a.mo24989r4().f64638e;
            a.f64647q.add(hyVar2);
        }
        if (!Util.isNullOrNil(this.f65999a.mo24989r4().f64639f)) {
            C49768hy hyVar3 = new C49768hy();
            hyVar3.f134951d = "relevant_pre_searchid";
            hyVar3.f134953f = this.f65999a.mo24989r4().f64639f;
            a.f64647q.add(hyVar3);
        }
        if (!Util.isNullOrNil(this.f65999a.mo24989r4().f64640g)) {
            C49768hy hyVar4 = new C49768hy();
            hyVar4.f134951d = "relevant_shared_openid";
            hyVar4.f134953f = this.f65999a.mo24989r4().f64640g;
            a.f64647q.add(hyVar4);
        }
        if (this.f65999a.mo24989r4().f64646p != null) {
            C49768hy hyVar5 = new C49768hy();
            hyVar5.f134951d = "rec_category";
            hyVar5.f134952e = this.f65999a.mo24989r4().f64646p.f63772f;
            a.f64647q.add(hyVar5);
        } else {
            C49768hy hyVar6 = new C49768hy();
            hyVar6.f134951d = "rec_category";
            hyVar6.f134952e = this.f65999a.mo24989r4().f64641h;
            a.f64647q.add(hyVar6);
        }
        Iterator<C49768hy> it = a.f64647q.iterator();
        while (true) {
            if (it.hasNext()) {
                if ("show_tag_list".equals(it.next().f134951d)) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        if (this.f65999a.mo24989r4().f64646p != null && z) {
            C49768hy hyVar7 = new C49768hy();
            hyVar7.f134951d = "show_tag_list";
            hyVar7.f134953f = this.f65999a.mo24989r4().f64646p.f63770d;
            a.f64647q.add(hyVar7);
        }
        C49768hy hyVar8 = new C49768hy();
        hyVar8.f134951d = "fetch_seed_videoinfo";
        if (this.f65999a.mo24989r4().f64646p == null || Util.isNullOrNil(this.f65999a.mo24989r4().f64646p.f63770d)) {
            hyVar8.f134952e = 1;
        } else {
            hyVar8.f134952e = 0;
        }
        a.f64647q.add(hyVar8);
        if (mo36194e() == 1) {
            xh4 d = mo36193d(0);
            C49768hy hyVar9 = new C49768hy();
            hyVar9.f134951d = "first_video_tag_list";
            hyVar9.f134953f = C21914h.m25168p(d.f64703D).toString();
            a.f64647q.add(hyVar9);
        }
        C22982r U2 = this.f65999a.mo24967U2();
        if (((HashMap) U2.f66020a).size() > 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(((HashMap) U2.f66020a).values());
            StringBuffer stringBuffer = new StringBuffer("");
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                C22194c cVar = (C22194c) it4.next();
                stringBuffer.append(cVar.f62828b ? 1 : 0);
                stringBuffer.append("_");
                stringBuffer.append(cVar.f62827a.f64729h);
                stringBuffer.append(";");
            }
            str = stringBuffer.toString();
        } else {
            str = null;
        }
        if (!Util.isNullOrNil(str)) {
            C49768hy hyVar10 = new C49768hy();
            hyVar10.f134951d = "client_exposed_info";
            hyVar10.f134953f = str;
            a.f64647q.add(hyVar10);
        }
        C49768hy hyVar11 = new C49768hy();
        hyVar11.f134951d = "is_prefetch";
        hyVar11.f134952e = (long) this.f66001c;
        a.f64647q.add(hyVar11);
        if (this.f66002d != null) {
            C86709a0.m107524d().mo123458d(this.f66002d);
            this.f66002d = null;
        }
        this.f66002d = new C22292k(a);
        C86709a0.m107524d().mo123460f(this.f66002d);
        C86709a0.m107524d().mo123455a(1943, this.f66004f);
        C102158a.m134600a(0);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        r6 = new s03.C48216e(r5, r0);
        f40.C86709a0.m107524d().mo123460f(r6);
        f40.C86709a0.m107524d().mo123455a(2579, new x03.C22974q.C22980a(r4, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        return;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo36198q(te3.uh4 r5, int r6) {
        /*
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r4)
            java.util.List r1 = r4.mo36192b()     // Catch:{ all -> 0x0055 }
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r1)     // Catch:{ all -> 0x0055 }
            if (r2 != 0) goto L_0x0053
            java.util.LinkedList r1 = (java.util.LinkedList) r1     // Catch:{ all -> 0x0055 }
            int r2 = r1.size()     // Catch:{ all -> 0x0055 }
            if (r6 < r2) goto L_0x0019
            goto L_0x0053
        L_0x0019:
            r2 = 0
            if (r6 <= 0) goto L_0x001e
            int r2 = r6 + -1
        L_0x001e:
            r6 = r2
        L_0x001f:
            int r3 = r1.size()     // Catch:{ all -> 0x0055 }
            if (r6 >= r3) goto L_0x0037
            int r3 = r2 + 10
            if (r6 >= r3) goto L_0x0037
            java.lang.Object r3 = r1.get(r6)     // Catch:{ all -> 0x0055 }
            te3.xh4 r3 = (te3.xh4) r3     // Catch:{ all -> 0x0055 }
            java.lang.String r3 = r3.f64729h     // Catch:{ all -> 0x0055 }
            r0.add(r3)     // Catch:{ all -> 0x0055 }
            int r6 = r6 + 1
            goto L_0x001f
        L_0x0037:
            monitor-exit(r4)     // Catch:{ all -> 0x0055 }
            s03.e r6 = new s03.e
            r6.<init>(r5, r0)
            ob0.b0 r5 = f40.C86709a0.m107524d()
            r5.mo123460f(r6)
            ob0.b0 r5 = f40.C86709a0.m107524d()
            r0 = 2579(0xa13, float:3.614E-42)
            x03.q$a r1 = new x03.q$a
            r1.<init>(r6)
            r5.mo123455a(r0, r1)
            return
        L_0x0053:
            monitor-exit(r4)     // Catch:{ all -> 0x0055 }
            return
        L_0x0055:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0055 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x03.C22974q.mo36198q(te3.uh4, int):void");
    }
}
