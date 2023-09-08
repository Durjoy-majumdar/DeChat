package com.tencent.p014mm.plugin.topstory.p113ui.home;

import android.net.Uri;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.topstory.p113ui.webview.C19391e;
import com.tencent.p014mm.plugin.topstory.p113ui.webview.C43263c;
import com.tencent.p014mm.plugin.websearch.webview.WebSearchWebView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONArray;
import p03.C21914h;
import te3.jh4;
import te3.kh4;

/* renamed from: com.tencent.mm.plugin.topstory.ui.home.y */
public class C43259y {

    /* renamed from: a */
    public jh4 f117058a;

    /* renamed from: b */
    public C43263c f117059b;

    /* renamed from: c */
    public WebSearchWebView f117060c;

    /* renamed from: d */
    public C19391e f117061d;

    /* renamed from: e */
    public boolean f117062e = false;

    /* renamed from: f */
    public HashMap<Integer, kh4> f117063f = new HashMap<>();

    /* renamed from: g */
    public HashMap<Integer, String> f117064g = new HashMap<>();

    /* renamed from: com.tencent.mm.plugin.topstory.ui.home.y$a */
    public class C43260a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f117065d;

        /* renamed from: e */
        public final /* synthetic */ String f117066e;

        public C43260a(int i, String str) {
            this.f117065d = i;
            this.f117066e = str;
        }

        public void run() {
            try {
                String str = C43259y.this.f117064g.get(Integer.valueOf(this.f117065d));
                JSONArray jSONArray = Util.isNullOrNil(str) ? new JSONArray() : new JSONArray(str);
                jSONArray.put(this.f117066e);
                C43259y.this.mo67496d(this.f117065d, jSONArray.toString());
                Log.m105925i("MicroMsg.TopStory.TopStoryWebViewMgr", "addNegDocId finish: %s, %s", Integer.valueOf(this.f117065d), this.f117066e);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.TopStory.TopStoryWebViewMgr", "addNegDocId, exception: " + e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo67493a(int i, String str) {
        if (!Util.isNullOrNil(str)) {
            Log.m105925i("MicroMsg.TopStory.TopStoryWebViewMgr", "addNegDocId begin: %s, %s", Integer.valueOf(i), str);
            ThreadPool.post(new C43260a(i, str), "addNegDocId");
        }
    }

    /* renamed from: b */
    public void mo67494b(TopStoryHomeUIComponentImpl topStoryHomeUIComponentImpl) {
        Log.m105925i("MicroMsg.TopStory.TopStoryWebViewMgr", "attachWebViewToActivity %s", Integer.valueOf(topStoryHomeUIComponentImpl.hashCode()));
        C43263c cVar = this.f117059b;
        WebSearchWebView webSearchWebView = this.f117060c;
        C19391e eVar = this.f117061d;
        jh4 jh4 = this.f117058a;
        topStoryHomeUIComponentImpl.f54510h = cVar;
        topStoryHomeUIComponentImpl.f54511i = webSearchWebView;
        topStoryHomeUIComponentImpl.f54512j = eVar;
        eVar.f150904a = topStoryHomeUIComponentImpl;
        topStoryHomeUIComponentImpl.f54508f = jh4;
        cVar.f123861d = topStoryHomeUIComponentImpl;
        C86709a0.m107524d().mo123455a(2582, cVar.f117074n);
        C86709a0.m107524d().mo123455a(2802, cVar.f117073j);
        C86709a0.m107524d().mo123455a(2906, cVar.f117072i);
        topStoryHomeUIComponentImpl.f54509g.addView(topStoryHomeUIComponentImpl.f54511i, new FrameLayout.LayoutParams(-1, -1));
        topStoryHomeUIComponentImpl.f54511i.setOverScrollMode(0);
        this.f117059b = null;
        this.f117060c = null;
        this.f117061d = null;
        this.f117058a = null;
        this.f117062e = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x01ac A[Catch:{ Exception -> 0x01c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01ae A[Catch:{ Exception -> 0x01c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01b8 A[Catch:{ Exception -> 0x01c2 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo67495c(te3.jh4 r20, boolean r21, java.util.LinkedList<te3.C49768hy> r22) {
        /*
            r19 = this;
            r0 = r19
            r7 = r20
            boolean r1 = r0.f117062e
            if (r1 != 0) goto L_0x0245
            r8 = 1
            r0.f117062e = r8
            long r1 = eb0.C31543z5.m39453c()
            java.lang.String r3 = "startCreateWB"
            t03.C22426h.m26099a(r7, r3, r1)
            r0.f117058a = r7
            com.tencent.mm.plugin.topstory.ui.webview.c r1 = new com.tencent.mm.plugin.topstory.ui.webview.c
            r1.<init>()
            r0.f117059b = r1
            int r1 = r7.f64041s
            r9 = 100
            if (r1 > 0) goto L_0x0026
            r10 = 100
            goto L_0x0027
        L_0x0026:
            r10 = r1
        L_0x0027:
            java.util.HashMap<java.lang.Integer, te3.kh4> r1 = r0.f117063f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            boolean r1 = r1.containsKey(r2)
            java.lang.String r11 = "MicroMsg.TopStory.TopStoryWebViewMgr"
            java.lang.String r12 = ""
            r13 = 0
            if (r1 == 0) goto L_0x00de
            java.util.HashMap<java.lang.Integer, te3.kh4> r1 = r0.f117063f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            java.lang.Object r1 = r1.get(r2)
            te3.kh4 r1 = (te3.kh4) r1
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            long r3 = r1.f136794e
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2[r13] = r3
            int r3 = r1.f136795f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r8] = r3
            int r3 = r1.f136796g
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 2
            r2[r4] = r3
            r3 = 3
            long r5 = eb0.C31543z5.m39453c()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r2[r3] = r5
            java.lang.String r3 = "loadWebViewShowData SaveTs:%sms, DirectShowTs:%ss, ShowAndRefreshTs:%ss, curTs:%sms"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r3, r2)
            long r2 = r1.f136794e
            int r5 = r1.f136795f
            long r5 = (long) r5
            r14 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r14
            long r2 = r2 + r5
            long r5 = eb0.C31543z5.m39453c()
            int r16 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r16 <= 0) goto L_0x0090
            com.tencent.mm.plugin.topstory.ui.webview.c r2 = r0.f117059b
            r2.mo67502e()
            java.lang.String r2 = "loadWebViewShowData No Need Auto Refresh"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r2)
            java.lang.String r1 = r1.f136793d
            r14 = r1
            goto L_0x00eb
        L_0x0090:
            long r2 = r1.f136794e
            int r5 = r1.f136796g
            long r5 = (long) r5
            long r5 = r5 * r14
            long r2 = r2 + r5
            long r5 = eb0.C31543z5.m39453c()
            int r14 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r14 <= 0) goto L_0x00ad
            com.tencent.mm.plugin.topstory.ui.webview.c r2 = r0.f117059b
            r2.mo67502e()
            java.lang.String r2 = "loadWebViewShowData Need Auto Refresh"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r2)
            java.lang.String r2 = r1.f136793d
            goto L_0x00b8
        L_0x00ad:
            com.tencent.mm.plugin.topstory.ui.webview.c r2 = r0.f117059b
            r2.mo67502e()
            java.lang.String r2 = "loadWebViewShowData No Need Show CacheData"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r2)
            r2 = r12
        L_0x00b8:
            java.util.LinkedList<java.lang.String> r3 = r7.f64047y
            java.util.LinkedList<java.lang.String> r1 = r1.f136798i
            r3.addAll(r1)
            bp3.p r1 = bp3.C79758p.f233760a
            yf3.d r3 = new yf3.d
            r3.<init>()
            int r1 = r1.mo109883f(r3)
            if (r1 != r8) goto L_0x00cd
            goto L_0x00dc
        L_0x00cd:
            if (r1 != r4) goto L_0x00d5
            com.tencent.mm.plugin.topstory.ui.webview.c r1 = r0.f117059b
            r1.mo67501d(r7, r13, r13, r13)
            goto L_0x00dc
        L_0x00d5:
            if (r21 == 0) goto L_0x00dc
            com.tencent.mm.plugin.topstory.ui.webview.c r1 = r0.f117059b
            r1.mo67501d(r7, r13, r13, r13)
        L_0x00dc:
            r14 = r2
            goto L_0x00eb
        L_0x00de:
            com.tencent.mm.plugin.topstory.ui.webview.c r1 = r0.f117059b
            r1.mo67502e()
            if (r21 == 0) goto L_0x00ea
            com.tencent.mm.plugin.topstory.ui.webview.c r1 = r0.f117059b
            r1.mo67501d(r7, r13, r13, r13)
        L_0x00ea:
            r14 = r12
        L_0x00eb:
            com.tencent.mm.plugin.websearch.webview.WebSearchWebView r1 = new com.tencent.mm.plugin.websearch.webview.WebSearchWebView
            android.content.MutableContextWrapper r2 = new android.content.MutableContextWrapper
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r2.<init>(r3)
            r1.<init>(r2)
            r0.f117060c = r1
            com.tencent.mm.plugin.topstory.ui.webview.b r15 = new com.tencent.mm.plugin.topstory.ui.webview.b
            r15.<init>()
            com.tencent.mm.plugin.topstory.ui.webview.d r6 = new com.tencent.mm.plugin.topstory.ui.webview.d
            r6.<init>(r7)
            java.lang.Class<hz.i> r1 = p167hz.C8836i.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            hz.i r1 = (p167hz.C8836i) r1
            hz.j r16 = r1.x70()
            com.tencent.mm.plugin.topstory.ui.webview.e r5 = new com.tencent.mm.plugin.topstory.ui.webview.e
            com.tencent.mm.plugin.websearch.webview.WebSearchWebView r2 = r0.f117060c
            com.tencent.mm.plugin.topstory.ui.webview.c r4 = r0.f117059b
            r1 = r5
            r3 = r20
            r13 = r5
            r5 = r22
            r8 = r6
            r6 = r16
            r1.<init>(r2, r3, r4, r5, r6)
            r0.f117061d = r13
            com.tencent.mm.plugin.websearch.webview.WebSearchWebView r1 = r0.f117060c
            r1.mo67633c0(r15, r8)
            com.tencent.mm.plugin.websearch.webview.WebSearchWebView r1 = r0.f117060c
            com.tencent.mm.plugin.topstory.ui.webview.e r2 = r0.f117061d
            java.lang.String r3 = "topStoryJSApi"
            r1.addJavascriptInterface(r2, r3)
            long r1 = eb0.C31543z5.m39453c()
            java.lang.String r3 = "endCreateWB"
            t03.C22426h.m26099a(r7, r3, r1)
            com.tencent.mm.plugin.topstory.ui.webview.c r1 = r0.f117059b
            byte[] r1 = r1.f117071h
            if (r1 == 0) goto L_0x0222
            java.util.HashMap<java.lang.Integer, java.lang.String> r1 = r0.f117064g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            com.tencent.mm.plugin.topstory.ui.webview.c r2 = r0.f117059b
            java.util.HashMap<java.lang.Integer, te3.kh4> r3 = r0.f117063f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            boolean r3 = r3.containsKey(r4)
            if (r3 == 0) goto L_0x017f
            java.util.HashMap<java.lang.Integer, te3.kh4> r3 = r0.f117063f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            java.lang.Object r3 = r3.get(r4)
            te3.kh4 r3 = (te3.kh4) r3
            long r4 = r3.f136794e
            int r3 = r3.f136795f
            int r3 = r3 * 1000
            long r8 = (long) r3
            long r4 = r4 + r8
            long r8 = eb0.C31543z5.m39453c()
            int r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x017f
            java.lang.String r3 = "needRefreshCache false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r3)
            r3 = 0
            goto L_0x0185
        L_0x017f:
            java.lang.String r3 = "needRefreshCache true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r3)
            r3 = 1
        L_0x0185:
            r2.getClass()
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r4 == 0) goto L_0x018f
            goto L_0x01fc
        L_0x018f:
            byte[] r4 = r2.f117071h
            if (r4 == 0) goto L_0x01fc
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r5 = "json"
            r4.put(r5, r14)     // Catch:{ Exception -> 0x01c2 }
            java.lang.String r5 = "newQuery"
            r6 = 1
            r4.put(r5, r6)     // Catch:{ Exception -> 0x01c2 }
            java.lang.String r5 = "isCache"
            r4.put(r5, r6)     // Catch:{ Exception -> 0x01c2 }
            java.lang.String r5 = "recType"
            if (r3 == 0) goto L_0x01ae
            r6 = 1
            goto L_0x01af
        L_0x01ae:
            r6 = 0
        L_0x01af:
            r4.put(r5, r6)     // Catch:{ Exception -> 0x01c2 }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)     // Catch:{ Exception -> 0x01c2 }
            if (r3 != 0) goto L_0x01c2
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ Exception -> 0x01c2 }
            r3.<init>(r1)     // Catch:{ Exception -> 0x01c2 }
            java.lang.String r1 = "filterDocidList"
            r4.put(r1, r3)     // Catch:{ Exception -> 0x01c2 }
        L_0x01c2:
            java.lang.String r1 = new java.lang.String
            byte[] r3 = r2.f117071h
            r1.<init>(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            java.lang.String r4 = "\n"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "'###preloadObjFeedsData###'"
            java.lang.String r1 = r1.replace(r4, r3)
            byte[] r1 = r1.getBytes()
            r2.f117071h = r1
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r1 = r1.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 0
            r2[r3] = r1
            java.lang.String r1 = "MicroMsg.TopStory.TopStoryWebData"
            java.lang.String r3 = "attachDataToHtml htmlBytes:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r2)
        L_0x01fc:
            com.tencent.mm.plugin.websearch.webview.WebSearchWebView r13 = r0.f117060c
            java.lang.String r14 = r7.f64035j
            java.lang.String r15 = new java.lang.String
            com.tencent.mm.plugin.topstory.ui.webview.c r1 = r0.f117059b
            byte[] r1 = r1.f117071h
            r15.<init>(r1)
            r18 = 0
            java.lang.String r16 = "text/html"
            java.lang.String r17 = "utf-8"
            r13.loadDataWithBaseURL(r14, r15, r16, r17, r18)
            com.tencent.mm.plugin.topstory.ui.webview.c r1 = r0.f117059b
            r2 = 0
            r1.f117071h = r2
            long r1 = eb0.C31543z5.m39453c()
            java.lang.String r3 = "endCreateWBWithLoadData"
            t03.C22426h.m26099a(r7, r3, r1)
            goto L_0x0232
        L_0x0222:
            com.tencent.mm.plugin.websearch.webview.WebSearchWebView r1 = r0.f117060c
            java.lang.String r2 = r7.f64035j
            r1.loadUrl(r2)
            long r1 = eb0.C31543z5.m39453c()
            java.lang.String r3 = "endCreateWBWithLoadURL"
            t03.C22426h.m26099a(r7, r3, r1)
        L_0x0232:
            boolean r1 = p03.C21914h.m25163k(r10)
            if (r1 == 0) goto L_0x0245
            com.tencent.mm.plugin.topstory.ui.webview.e r1 = r0.f117061d
            r1.getClass()
            com.tencent.mm.plugin.topstory.ui.webview.m r2 = new com.tencent.mm.plugin.topstory.ui.webview.m
            r2.<init>(r1, r12)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r2)
        L_0x0245:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.topstory.p113ui.home.C43259y.mo67495c(te3.jh4, boolean, java.util.LinkedList):void");
    }

    /* renamed from: d */
    public void mo67496d(int i, String str) {
        this.f117064g.put(Integer.valueOf(i), str);
        try {
            byte[] bytes = str.getBytes("utf-8");
            Uri n = C116299g2.m163858n(C21914h.m25159g());
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
            if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n, l);
                if (l2.mo177810a()) {
                    l2.f348991a.mo119937g(l2.f348992b);
                }
            }
            C86013q1.m106437S(C21914h.m25159g() + i, bytes);
            Log.m105925i("MicroMsg.TopStory.TopStoryWebViewMgr", "putNegDataCache write data key: %d length: %d", Integer.valueOf(i), Integer.valueOf(bytes.length));
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewMgr", e, "putNegDataCache", new Object[0]);
        }
    }
}
