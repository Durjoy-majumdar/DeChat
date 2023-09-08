package com.tencent.p014mm.plugin.topstory.p113ui.webview;

import android.net.Uri;
import com.tencent.p014mm.plugin.topstory.p113ui.home.C43255a;
import com.tencent.p014mm.plugin.topstory.p113ui.home.TopStoryHomeUIComponentImpl;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import e83.C45556b;
import eb0.C31543z5;
import f40.C86709a0;
import g83.C45897a;
import g83.C59386f;
import java.io.IOException;
import java.util.HashMap;
import lu3.C88656g;
import o03.C21723h;
import ob0.C11385n;
import ob0.C117747y;
import org.json.JSONException;
import org.json.JSONObject;
import p03.C21912d;
import p03.C21914h;
import p03.C21915i;
import p167hz.C21032k;
import pe3.C47465a;
import s03.C22289b;
import t03.C22422f;
import te3.C50987qn3;
import te3.jh4;
import te3.kh4;
import te3.q25;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.topstory.ui.webview.c */
public class C43263c extends C45897a<jh4> {

    /* renamed from: e */
    public HashMap<Integer, C22289b> f117068e = new HashMap<>();

    /* renamed from: f */
    public HashMap<Integer, C43269f> f117069f = new HashMap<>();

    /* renamed from: g */
    public HashMap<Integer, Boolean> f117070g = new HashMap<>();

    /* renamed from: h */
    public byte[] f117071h;

    /* renamed from: i */
    public C11385n f117072i = new C43264a();

    /* renamed from: j */
    public C11385n f117073j = new C43265b();

    /* renamed from: n */
    public C11385n f117074n = new C43266c();

    /* renamed from: com.tencent.mm.plugin.topstory.ui.webview.c$a */
    public class C43264a implements C11385n {
        public C43264a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSceneEnd(int r5, int r6, java.lang.String r7, ob0.C117747y r8) {
            /*
                r4 = this;
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                java.lang.String r1 = "retCode"
                r0.put(r1, r6)     // Catch:{ JSONException -> 0x005c }
                java.lang.String r1 = "errMsg"
                r0.put(r1, r7)     // Catch:{ JSONException -> 0x005c }
                if (r5 != 0) goto L_0x0040
                if (r6 == 0) goto L_0x0014
                goto L_0x0040
            L_0x0014:
                com.tencent.mm.plugin.topstory.ui.webview.c r5 = com.tencent.p014mm.plugin.topstory.p113ui.webview.C43263c.this     // Catch:{ JSONException -> 0x005c }
                g83.f<T> r5 = r5.f123861d     // Catch:{ JSONException -> 0x005c }
                com.tencent.mm.plugin.topstory.ui.home.a r5 = (com.tencent.p014mm.plugin.topstory.p113ui.home.C43255a) r5     // Catch:{ JSONException -> 0x005c }
                if (r5 == 0) goto L_0x005d
                r5 = r8
                s03.f r5 = (s03.C77599f) r5     // Catch:{ JSONException -> 0x005c }
                ob0.c r5 = r5.f226228e     // Catch:{ JSONException -> 0x005c }
                ob0.c$d r5 = r5.f127056b     // Catch:{ JSONException -> 0x005c }
                pe3.a r5 = r5.f127083a     // Catch:{ JSONException -> 0x005c }
                te3.mh4 r5 = (te3.mh4) r5     // Catch:{ JSONException -> 0x005c }
                java.lang.String r5 = r5.f138037d     // Catch:{ JSONException -> 0x005c }
                s03.f r8 = (s03.C77599f) r8     // Catch:{ JSONException -> 0x005c }
                ob0.c r6 = r8.f226228e     // Catch:{ JSONException -> 0x005c }
                ob0.c$d r6 = r6.f127056b     // Catch:{ JSONException -> 0x005c }
                pe3.a r6 = r6.f127083a     // Catch:{ JSONException -> 0x005c }
                te3.mh4 r6 = (te3.mh4) r6     // Catch:{ JSONException -> 0x005c }
                java.lang.String r6 = r6.f138038e     // Catch:{ JSONException -> 0x005c }
                java.lang.String r7 = "commentId"
                r0.put(r7, r5)     // Catch:{ JSONException -> 0x005c }
                java.lang.String r5 = "requestId"
                r0.put(r5, r6)     // Catch:{ JSONException -> 0x005c }
                goto L_0x005d
            L_0x0040:
                java.lang.String r8 = "MicroMsg.TopStory.TopStoryWebData"
                java.lang.String r1 = "NetSceneTopStoryPostComment response, errType:%s, errCode:%s, errMsg:%s"
                r2 = 3
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ JSONException -> 0x005c }
                r3 = 0
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ JSONException -> 0x005c }
                r2[r3] = r5     // Catch:{ JSONException -> 0x005c }
                r5 = 1
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ JSONException -> 0x005c }
                r2[r5] = r6     // Catch:{ JSONException -> 0x005c }
                r5 = 2
                r2[r5] = r7     // Catch:{ JSONException -> 0x005c }
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r8, r1, r2)     // Catch:{ JSONException -> 0x005c }
                goto L_0x005d
            L_0x005c:
            L_0x005d:
                com.tencent.mm.plugin.topstory.ui.webview.c r5 = com.tencent.p014mm.plugin.topstory.p113ui.webview.C43263c.this
                g83.f<T> r5 = r5.f123861d
                com.tencent.mm.plugin.topstory.ui.home.a r5 = (com.tencent.p014mm.plugin.topstory.p113ui.home.C43255a) r5
                if (r5 == 0) goto L_0x006c
                java.lang.String r6 = r0.toString()
                r5.mo24896b2(r6)
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.topstory.p113ui.webview.C43263c.C43264a.onSceneEnd(int, int, java.lang.String, ob0.y):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.webview.c$b */
    public class C43265b implements C11385n {
        public C43265b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSceneEnd(int r5, int r6, java.lang.String r7, ob0.C117747y r8) {
            /*
                r4 = this;
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                java.lang.String r1 = "retCode"
                r0.put(r1, r6)     // Catch:{ JSONException -> 0x004a }
                java.lang.String r1 = "errMsg"
                r0.put(r1, r7)     // Catch:{ JSONException -> 0x004a }
                if (r5 != 0) goto L_0x002e
                if (r6 == 0) goto L_0x0014
                goto L_0x002e
            L_0x0014:
                com.tencent.mm.plugin.topstory.ui.webview.c r5 = com.tencent.p014mm.plugin.topstory.p113ui.webview.C43263c.this     // Catch:{ JSONException -> 0x004a }
                g83.f<T> r5 = r5.f123861d     // Catch:{ JSONException -> 0x004a }
                com.tencent.mm.plugin.topstory.ui.home.a r5 = (com.tencent.p014mm.plugin.topstory.p113ui.home.C43255a) r5     // Catch:{ JSONException -> 0x004a }
                if (r5 == 0) goto L_0x004b
                s03.j r8 = (s03.C22291j) r8     // Catch:{ JSONException -> 0x004a }
                ob0.c r5 = r8.f63196e     // Catch:{ JSONException -> 0x004a }
                ob0.c$d r5 = r5.f127056b     // Catch:{ JSONException -> 0x004a }
                pe3.a r5 = r5.f127083a     // Catch:{ JSONException -> 0x004a }
                te3.oh4 r5 = (te3.oh4) r5     // Catch:{ JSONException -> 0x004a }
                java.lang.String r5 = r5.f139186d     // Catch:{ JSONException -> 0x004a }
                java.lang.String r6 = "requestId"
                r0.put(r6, r5)     // Catch:{ JSONException -> 0x004a }
                goto L_0x004b
            L_0x002e:
                java.lang.String r8 = "MicroMsg.TopStory.TopStoryWebData"
                java.lang.String r1 = "NetSceneTopStorySetComment response, errType:%s, errCode:%s, errMsg:%s"
                r2 = 3
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ JSONException -> 0x004a }
                r3 = 0
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ JSONException -> 0x004a }
                r2[r3] = r5     // Catch:{ JSONException -> 0x004a }
                r5 = 1
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ JSONException -> 0x004a }
                r2[r5] = r6     // Catch:{ JSONException -> 0x004a }
                r5 = 2
                r2[r5] = r7     // Catch:{ JSONException -> 0x004a }
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r8, r1, r2)     // Catch:{ JSONException -> 0x004a }
                goto L_0x004b
            L_0x004a:
            L_0x004b:
                com.tencent.mm.plugin.topstory.ui.webview.c r5 = com.tencent.p014mm.plugin.topstory.p113ui.webview.C43263c.this
                g83.f<T> r5 = r5.f123861d
                com.tencent.mm.plugin.topstory.ui.home.a r5 = (com.tencent.p014mm.plugin.topstory.p113ui.home.C43255a) r5
                if (r5 == 0) goto L_0x005a
                java.lang.String r6 = r0.toString()
                r5.mo24906j6(r6)
            L_0x005a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.topstory.p113ui.webview.C43263c.C43265b.onSceneEnd(int, int, java.lang.String, ob0.y):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.webview.c$c */
    public class C43266c implements C11385n {
        public C43266c() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x006c  */
        /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSceneEnd(int r7, int r8, java.lang.String r9, ob0.C117747y r10) {
            /*
                r6 = this;
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                java.lang.String r1 = "retCode"
                r0.put(r1, r8)     // Catch:{ JSONException -> 0x0063 }
                java.lang.String r1 = "errMsg"
                r0.put(r1, r9)     // Catch:{ JSONException -> 0x0063 }
                java.lang.String r1 = "requestId"
                if (r7 != 0) goto L_0x0040
                if (r8 == 0) goto L_0x0016
                goto L_0x0040
            L_0x0016:
                com.tencent.mm.plugin.topstory.ui.webview.c r7 = com.tencent.p014mm.plugin.topstory.p113ui.webview.C43263c.this     // Catch:{ JSONException -> 0x0063 }
                g83.f<T> r7 = r7.f123861d     // Catch:{ JSONException -> 0x0063 }
                com.tencent.mm.plugin.topstory.ui.home.a r7 = (com.tencent.p014mm.plugin.topstory.p113ui.home.C43255a) r7     // Catch:{ JSONException -> 0x0063 }
                if (r7 == 0) goto L_0x0064
                r7 = r10
                s03.a r7 = (s03.C48214a) r7     // Catch:{ JSONException -> 0x0063 }
                ob0.c r7 = r7.f129199e     // Catch:{ JSONException -> 0x0063 }
                ob0.c$d r7 = r7.f127056b     // Catch:{ JSONException -> 0x0063 }
                pe3.a r7 = r7.f127083a     // Catch:{ JSONException -> 0x0063 }
                te3.c25 r7 = (te3.c25) r7     // Catch:{ JSONException -> 0x0063 }
                java.lang.String r7 = r7.f131472d     // Catch:{ JSONException -> 0x0063 }
                java.lang.String r8 = "commResp"
                r0.put(r8, r7)     // Catch:{ JSONException -> 0x0063 }
                s03.a r10 = (s03.C48214a) r10     // Catch:{ JSONException -> 0x0063 }
                ob0.c r7 = r10.f129199e     // Catch:{ JSONException -> 0x0063 }
                ob0.c$d r7 = r7.f127056b     // Catch:{ JSONException -> 0x0063 }
                pe3.a r7 = r7.f127083a     // Catch:{ JSONException -> 0x0063 }
                te3.c25 r7 = (te3.c25) r7     // Catch:{ JSONException -> 0x0063 }
                java.lang.String r7 = r7.f131473e     // Catch:{ JSONException -> 0x0063 }
                r0.put(r1, r7)     // Catch:{ JSONException -> 0x0063 }
                goto L_0x0064
            L_0x0040:
                java.lang.String r2 = "MicroMsg.TopStory.TopStoryWebData"
                java.lang.String r3 = "NetSceneSearchWebComm response, errType:%s, errCode:%s, errMsg:%s"
                r4 = 3
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ JSONException -> 0x0063 }
                r5 = 0
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ JSONException -> 0x0063 }
                r4[r5] = r7     // Catch:{ JSONException -> 0x0063 }
                r7 = 1
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ JSONException -> 0x0063 }
                r4[r7] = r8     // Catch:{ JSONException -> 0x0063 }
                r7 = 2
                r4[r7] = r9     // Catch:{ JSONException -> 0x0063 }
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r3, r4)     // Catch:{ JSONException -> 0x0063 }
                s03.a r10 = (s03.C48214a) r10     // Catch:{ JSONException -> 0x0063 }
                java.lang.String r7 = r10.f129201g     // Catch:{ JSONException -> 0x0063 }
                r0.put(r1, r7)     // Catch:{ JSONException -> 0x0063 }
                goto L_0x0064
            L_0x0063:
            L_0x0064:
                com.tencent.mm.plugin.topstory.ui.webview.c r7 = com.tencent.p014mm.plugin.topstory.p113ui.webview.C43263c.this
                g83.f<T> r7 = r7.f123861d
                com.tencent.mm.plugin.topstory.ui.home.a r7 = (com.tencent.p014mm.plugin.topstory.p113ui.home.C43255a) r7
                if (r7 == 0) goto L_0x0073
                java.lang.String r8 = r0.toString()
                r7.mo24912n2(r8)
            L_0x0073:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.topstory.p113ui.webview.C43263c.C43266c.onSceneEnd(int, int, java.lang.String, ob0.y):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.webview.c$d */
    public class C43267d implements C88656g {

        /* renamed from: d */
        public final /* synthetic */ q25 f117078d;

        /* renamed from: e */
        public final /* synthetic */ String f117079e;

        public C43267d(C43263c cVar, q25 q25, String str) {
            this.f117078d = q25;
            this.f117079e = str;
        }

        public String getKey() {
            return "TopStory.CacheHomeData";
        }

        public void run() {
            Class cls = C22422f.class;
            kh4 kh4 = new kh4();
            kh4.f136797h = this.f117078d.f140110h.f140415f;
            kh4.f136794e = C31543z5.m39453c();
            C50987qn3 qn32 = this.f117078d.f140110h;
            kh4.f136795f = qn32.f140413d;
            kh4.f136796g = qn32.f140414e;
            kh4.f136793d = this.f117079e;
            kh4.f136798i = qn32.f140416g;
            ((C22422f) C86312j.m106911c(cls)).T60().f117063f.put(Integer.valueOf(kh4.f136797h), kh4);
            try {
                byte[] byteArray = kh4.toByteArray();
                Uri n = C116299g2.m163858n(C21914h.m25158f());
                String path = n.getPath();
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!n.getPath().equals(k)) {
                        n = n.buildUpon().path(k).build();
                    }
                }
                C116281f0 f0Var = C116281f0.C116289i.f348994a;
                C116281f0.C116288h l = f0Var.mo177799l(n, (C116281f0.C116288h) null);
                if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                    C116281f0.C116288h l2 = f0Var.mo177799l(n, l);
                    if (l2.mo177810a()) {
                        l2.f348991a.mo119937g(l2.f348992b);
                    }
                }
                C86013q1.m106437S(C21914h.m25158f() + kh4.f136797h, byteArray);
                Log.m105925i("MicroMsg.TopStory.TopStoryWebViewMgr", "putHomeDataCache write data key: %d length: %d", Integer.valueOf(kh4.f136797h), Integer.valueOf(byteArray.length));
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewMgr", e, "putHomeDataCache ", new Object[0]);
            }
            ((C22422f) C86312j.m106911c(cls)).T60().mo67496d(kh4.f136797h, "");
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.webview.c$e */
    public class C43268e implements Runnable {
        public C43268e(C43264a aVar) {
        }

        public void run() {
            C45556b g = C43471q.m46983g(1);
            String format = String.format("%s/%s", new Object[]{g.mo71077o(), g.mo71058f()});
            C43263c.this.f117071h = C86013q1.m106433O(format, 0, -1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.webview.c$f */
    public class C43269f {

        /* renamed from: a */
        public long f117081a;

        /* renamed from: b */
        public String f117082b;

        /* renamed from: c */
        public jh4 f117083c;

        public C43269f(C43263c cVar, C43264a aVar) {
        }
    }

    public C43263c() {
        super((C59386f) null);
    }

    /* renamed from: b */
    public final void mo67499b(jh4 jh4, String str, boolean z) {
        if (this.f117070g.get(Integer.valueOf(jh4.f64041s)).booleanValue()) {
            C59386f<T> fVar = this.f123861d;
            if (((C43255a) fVar) != null) {
                ((C43255a) fVar).mo24900f7(str);
            }
            this.f117070g.remove(Integer.valueOf(jh4.f64041s));
        } else if (!z) {
            C43269f fVar2 = new C43269f(this, (C43264a) null);
            fVar2.f117083c = jh4;
            fVar2.f117081a = C31543z5.m39453c();
            fVar2.f117082b = str;
            this.f117069f.put(Integer.valueOf(jh4.f64041s), fVar2);
        } else {
            this.f117069f.remove(Integer.valueOf(jh4.f64041s));
        }
    }

    /* renamed from: c */
    public String mo67500c(jh4 jh4) {
        int i = jh4.f64041s;
        C43269f fVar = this.f117069f.get(Integer.valueOf(i));
        String str = null;
        if (fVar == null) {
            return null;
        }
        Log.m105924i("MicroMsg.TopStory.TopStoryWebData", "loadDataFromCache,channelId = " + i);
        if (fVar.f117083c.f64030e.equals(jh4.f64030e) && fVar.f117083c.f64036n.equals(jh4.f64036n) && C31543z5.m39453c() - fVar.f117081a <= 60000) {
            str = fVar.f117082b;
        }
        this.f117069f.remove(Integer.valueOf(i));
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.TopStory.TopStoryWebData", "load data from cache fail");
        } else {
            Log.m105925i("MicroMsg.TopStory.TopStoryWebData", "load data from cache success %d", Integer.valueOf(str.length()));
        }
        return str;
    }

    /* renamed from: d */
    public void mo67501d(jh4 jh4, boolean z, boolean z2, int i) {
        int i2 = jh4.f64041s;
        Log.m105925i("MicroMsg.TopStory.TopStoryWebData", "loadDataFromServer, preTabChannelId = %s，homeContext channelId = %s, hashcode = %s, needCallback = %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(hashCode()), Boolean.valueOf(z));
        C22289b bVar = this.f117068e.get(Integer.valueOf(i2));
        if (z2 || bVar == null || !jh4.f64030e.equals(bVar.f63190f.f64030e)) {
            C22289b bVar2 = new C22289b(jh4, i);
            C86709a0.m107524d().mo123455a(1943, this);
            C86709a0.m107524d().mo123460f(bVar2);
            this.f117068e.put(Integer.valueOf(i2), bVar2);
            this.f117070g.put(Integer.valueOf(i2), Boolean.valueOf(z));
            Log.m105924i("MicroMsg.TopStory.TopStoryWebData", "Start new net scene");
            return;
        }
        this.f117070g.put(Integer.valueOf(i2), Boolean.valueOf(z));
        Log.m105924i("MicroMsg.TopStory.TopStoryWebData", "Wait current net scene");
        C21915i.m25174f(jh4, "WaitCurrentNetScene", C31543z5.m39453c());
    }

    /* renamed from: e */
    public void mo67502e() {
        ((C119157j) C119157j.f356862d).mo183876g(new C43268e((C43264a) null), "TopStory.LoadHtmlDataFromSdcardTask");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Class cls = C21912d.class;
        super.onSceneEnd(i, i2, str, yVar);
        if (this.f117068e.values() != null && this.f117068e.values().contains(yVar)) {
            C22289b bVar = (C22289b) yVar;
            this.f117068e.remove(Integer.valueOf(bVar.f63190f.f64041s));
            if (this.f117068e.isEmpty()) {
                C86709a0.m107524d().mo123470p(1943, this);
                Log.m105924i("MicroMsg.TopStory.TopStoryWebData", "cacheCgi.isEmpty() = " + this.f117068e.isEmpty());
            }
            if (i == 0 && i2 == 0) {
                q25 q25 = (q25) bVar.f63189e.f127056b.f127083a;
                String str2 = q25.f140108f;
                jh4 jh4 = bVar.f63190f;
                if (jh4 != null && C21914h.m25162j(jh4.f64041s)) {
                    ((C21723h) ((C21912d) C86312j.m106911c(cls)).mo34966t4()).mo33987G((long) q25.f140111i);
                    Log.m105924i("MicroMsg.TopStory.TopStoryWebData", "try to clear haokan red dot");
                }
                jh4 jh42 = bVar.f63190f;
                if (jh42 != null && C21914h.m25163k(jh42.f64041s)) {
                    Log.m105924i("MicroMsg.TopStory.TopStoryWebData", "clear home red dot");
                    ((C21723h) ((C21912d) C86312j.m106911c(cls)).mo34966t4()).mo33998i();
                    C21723h hVar = (C21723h) ((C21912d) C86312j.m106911c(cls)).mo34966t4();
                    C21032k.C21033a aVar = hVar.f61501e;
                    if (aVar != null) {
                        ((TopStoryHomeUIComponentImpl.C19327e) aVar).mo24925d(hVar.mo34010u());
                    }
                }
                jh4 jh43 = bVar.f63190f;
                if (jh43 != null && C21914h.m25164l(jh43.f64041s)) {
                    Log.m105924i("MicroMsg.TopStory.TopStoryWebData", "clear home red dot");
                    ((C21723h) ((C21912d) C86312j.m106911c(cls)).mo34966t4()).mo33999j();
                    C21723h hVar2 = (C21723h) ((C21912d) C86312j.m106911c(cls)).mo34966t4();
                    C21032k.C21033a aVar2 = hVar2.f61501e;
                    if (aVar2 != null) {
                        ((TopStoryHomeUIComponentImpl.C19327e) aVar2).mo24926e(hVar2.mo34010u());
                    }
                }
                mo67499b(bVar.f63190f, str2, false);
                C47465a aVar3 = bVar.f63189e.f127056b.f127083a;
                if (((q25) aVar3).f140110h != null && ((q25) aVar3).f140110h.f140417h == 1) {
                    ((C119157j) C119157j.f356862d).mo183875f(new C43267d(this, q25, str2));
                    return;
                }
                return;
            }
            Log.m105924i("MicroMsg.TopStory.TopStoryWebData", "netscene topstory error");
            jh4 jh44 = bVar.f63190f;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("ret", -1);
            } catch (JSONException unused) {
            }
            mo67499b(jh44, jSONObject.toString(), true);
        }
    }
}
