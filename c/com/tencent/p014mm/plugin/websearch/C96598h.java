package com.tencent.p014mm.plugin.websearch;

import android.os.Bundle;
import android.text.TextUtils;
import b83.C0252b;
import b83.C0255c;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85927s;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import e00.C7575o0;
import f40.C86709a0;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kb0.C9575d;
import kv1.C61173o;
import lv1.C10656l;
import lv1.C99664b;
import lv1.C99681n;
import ob0.C11385n;
import ob0.C117747y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p523fp.C32147e;
import te3.C49768hy;
import te3.C64342ej;
import te3.C64569n43;
import te3.d75;
import te3.t25;
import te3.ye4;
import te3.zo4;
import u73.C101967a;
import u73.C101968a0;
import u73.C101969b;
import u73.C101979m0;
import u73.C101981o;
import u73.C101984s;
import u73.C14130k;

/* renamed from: com.tencent.mm.plugin.websearch.h */
public class C96598h implements C11385n, C14130k {

    /* renamed from: u */
    public static final long f282786u = ((long) (C85927s.f250294c + 500));

    /* renamed from: v */
    public static final /* synthetic */ int f282787v = 0;

    /* renamed from: d */
    public int f282788d = 0;

    /* renamed from: e */
    public t25 f282789e;

    /* renamed from: f */
    public t25 f282790f;

    /* renamed from: g */
    public Map<String, Integer> f282791g = new HashMap();

    /* renamed from: h */
    public volatile C101968a0 f282792h;

    /* renamed from: i */
    public long f282793i;

    /* renamed from: j */
    public C0255c f282794j = new C0252b();

    /* renamed from: n */
    public final MMHandler f282795n;

    /* renamed from: o */
    public final C101981o f282796o;

    /* renamed from: p */
    public C96601d f282797p = new C96601d((C5826e) null);

    /* renamed from: q */
    public C101984s f282798q = new C96599a();

    /* renamed from: r */
    public C5830e f282799r = new C5830e((C5826e) null);

    /* renamed from: s */
    public C99664b f282800s;

    /* renamed from: t */
    public C61173o f282801t = new C5829b();

    /* renamed from: com.tencent.mm.plugin.websearch.h$b */
    public class C5829b implements C61173o {
        public C5829b() {
        }

        /* renamed from: H0 */
        public void mo293H0(C10656l lVar) {
            Class cls = C7575o0.class;
            int i = lVar.f32074c;
            if (i == -3 || i == -2 || i == -1) {
                ((C7575o0) C86312j.m106911c(cls)).mo8687iT(((Integer) C96598h.this.f282800s.f292083i).intValue(), "");
            } else if (i == 0) {
                List<C99681n> list = lVar.f32076e;
                if (list == null || list.size() == 0) {
                    Log.m105924i("MicroMsg.WebSearch.FTSWebSearchLogic", "local contact search size 0");
                    ((C7575o0) C86312j.m106911c(cls)).mo8687iT(((Integer) C96598h.this.f282800s.f292083i).intValue(), "");
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    JSONArray jSONArray = new JSONArray();
                    JSONObject jSONObject2 = new JSONObject();
                    JSONArray jSONArray2 = new JSONArray();
                    for (C99681n next : lVar.f32076e) {
                        if (next.f292148b == 131072) {
                            jSONArray2.put(C96598h.m123946a(next, lVar.f32075d));
                        }
                    }
                    jSONObject2.put("items", jSONArray2);
                    jSONObject2.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, MMApplicationContext.getContext().getString(C0966R.string.f3p));
                    jSONObject2.put("count", jSONArray2.length());
                    jSONObject2.put("type", 3);
                    jSONArray.put(jSONObject2);
                    jSONObject.put("data", jSONArray);
                    jSONObject.put("ret", 0);
                    ((C7575o0) C86312j.m106911c(cls)).mo8687iT(((Integer) C96598h.this.f282800s.f292083i).intValue(), jSONObject.toString());
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.WebSearch.FTSWebSearchLogic", e, "onSearchDone", new Object[0]);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.websearch.h$e */
    public class C5830e {

        /* renamed from: a */
        public C101969b f21989a;

        public C5830e(C5826e eVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.websearch.h$a */
    public class C96599a implements C101984s {
        public C96599a() {
        }

        /* renamed from: a */
        public void mo134672a(C101979m0 m0Var) {
            Log.m105925i("MicroMsg.WebSearch.FTSWebSearchLogic", "handleCallback %s", m0Var);
            if (m0Var != null) {
                int intValue = ((Integer) m0Var.f300280d).intValue();
                C96600c cVar = (C96600c) m0Var.f300281e;
                if (cVar != null) {
                    Log.m105925i("MicroMsg.WebSearch.FTSWebSearchLogic", "calling back to webview, id %d, reqId %s,  %s", Integer.valueOf(intValue), cVar.f282806d, C96598h.this.f282792h);
                    ((C7575o0) C86312j.m106911c(C7575o0.class)).s90(intValue, cVar.f282804b, cVar.f282805c, cVar.f282806d, cVar.f282807e);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.websearch.h$c */
    public static class C96600c {

        /* renamed from: a */
        public int f282803a;

        /* renamed from: b */
        public String f282804b;

        /* renamed from: c */
        public boolean f282805c;

        /* renamed from: d */
        public String f282806d;

        /* renamed from: e */
        public Bundle f282807e;

        public C96600c(int i, String str, boolean z, String str2, Bundle bundle) {
            this.f282803a = i;
            this.f282804b = str;
            this.f282805c = z;
            this.f282806d = str2;
            this.f282807e = bundle;
        }

        public String toString() {
            return "NetReqResult{webviewId=" + this.f282803a + ", data='" + this.f282804b + '\'' + ", isNewQuery=" + this.f282805c + ", reqId='" + this.f282806d + '\'' + ", extData=" + this.f282807e + '}';
        }
    }

    /* renamed from: com.tencent.mm.plugin.websearch.h$d */
    public class C96601d implements Comparable {

        /* renamed from: d */
        public C101967a f282808d;

        /* renamed from: e */
        public ThreadPoolExecutor f282809e = new ThreadPoolExecutor(0, 10, 120, TimeUnit.SECONDS, new ArrayBlockingQueue(32));

        /* renamed from: f */
        public C96602a f282810f;

        /* renamed from: com.tencent.mm.plugin.websearch.h$d$a */
        public class C96602a implements Runnable {

            /* renamed from: d */
            public C101968a0 f282812d;

            /* renamed from: e */
            public volatile boolean f282813e;

            public C96602a(C5826e eVar) {
            }

            /* JADX WARNING: Removed duplicated region for block: B:51:0x015c  */
            /* JADX WARNING: Removed duplicated region for block: B:67:0x0235  */
            /* JADX WARNING: Removed duplicated region for block: B:69:0x023c  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r16 = this;
                    r1 = r16
                    boolean r0 = java.lang.Thread.interrupted()
                    if (r0 == 0) goto L_0x0009
                    return
                L_0x0009:
                    u73.a0 r0 = r1.f282812d
                    java.lang.String r0 = r0.f300187b
                    boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                    java.lang.String r2 = "MicroMsg.WebSearch.FTSWebSearchLogic"
                    r3 = 2
                    r4 = 3
                    r5 = 4
                    r6 = 5
                    r7 = 0
                    r8 = 1
                    if (r0 == 0) goto L_0x005e
                    u73.a0 r0 = r1.f282812d
                    int r9 = r0.f300179A
                    if (r9 == r3) goto L_0x005e
                    r9 = 6
                    java.lang.Object[] r9 = new java.lang.Object[r9]
                    int r0 = r0.f300189d
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    r9[r7] = r0
                    u73.a0 r0 = r1.f282812d
                    int r0 = r0.f300191f
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    r9[r8] = r0
                    u73.a0 r0 = r1.f282812d
                    int r0 = r0.f300186a
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    r9[r3] = r0
                    u73.a0 r0 = r1.f282812d
                    int r0 = r0.f300193h
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    r9[r4] = r0
                    u73.a0 r0 = r1.f282812d
                    java.lang.String r3 = r0.f300192g
                    r9[r5] = r3
                    int r0 = r0.f300188c
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    r9[r6] = r0
                    java.lang.String r0 = "error query %d %d %d %d %s %d"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r9)
                    return
                L_0x005e:
                    u73.a0 r0 = r1.f282812d
                    int r0 = r0.f300191f
                    r9 = 20
                    r10 = 16
                    if (r0 == r4) goto L_0x006d
                    if (r0 == r10) goto L_0x006d
                    if (r0 == r9) goto L_0x006d
                    goto L_0x00c7
                L_0x006d:
                    org.json.JSONObject r0 = new org.json.JSONObject
                    r0.<init>()
                    java.lang.String r11 = "word"
                    u73.a0 r12 = r1.f282812d     // Catch:{ Exception -> 0x009d }
                    java.lang.String r12 = r12.f300187b     // Catch:{ Exception -> 0x009d }
                    r0.put(r11, r12)     // Catch:{ Exception -> 0x009d }
                    java.lang.String r11 = "id"
                    long r12 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x009d }
                    java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x009d }
                    r0.put(r11, r12)     // Catch:{ Exception -> 0x009d }
                    java.lang.String r11 = "timestamp"
                    long r12 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x009d }
                    java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x009d }
                    r0.put(r11, r12)     // Catch:{ Exception -> 0x009d }
                    java.lang.String r11 = "showType"
                    r0.put(r11, r7)     // Catch:{ Exception -> 0x009d }
                L_0x009d:
                    java.lang.Class<kv1.q> r11 = kv1.C99260q.class
                    di3.d r11 = di3.C86312j.m106911c(r11)
                    kv1.q r11 = (kv1.C99260q) r11
                    java.lang.StringBuilder r12 = new java.lang.StringBuilder
                    r12.<init>()
                    u73.a0 r13 = r1.f282812d
                    java.lang.String r13 = r13.f300187b
                    r12.append(r13)
                    java.lang.String r13 = "​"
                    r12.append(r13)
                    java.lang.String r13 = "0"
                    r12.append(r13)
                    java.lang.String r12 = r12.toString()
                    java.lang.String r0 = r0.toString()
                    r11.mo128756j4(r12, r0)
                L_0x00c7:
                    java.lang.Object[] r0 = new java.lang.Object[r3]
                    u73.a0 r11 = r1.f282812d
                    java.lang.String r12 = r11.f300187b
                    r0[r7] = r12
                    int r11 = r11.f300202q
                    java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                    r0[r8] = r11
                    java.lang.String r11 = "start New NetScene %s ,  %d"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r11, r0)
                    com.tencent.mm.plugin.websearch.h$d r0 = com.tencent.p014mm.plugin.websearch.C96598h.C96601d.this
                    u73.a r0 = r0.f282808d
                    if (r0 == 0) goto L_0x00ee
                    ob0.b0 r0 = f40.C86709a0.m107524d()
                    com.tencent.mm.plugin.websearch.h$d r11 = com.tencent.p014mm.plugin.websearch.C96598h.C96601d.this
                    u73.a r11 = r11.f282808d
                    r0.mo123458d(r11)
                L_0x00ee:
                    u73.a0 r0 = r1.f282812d
                    java.util.LinkedList<te3.zo4> r0 = r0.f300190e
                    if (r0 == 0) goto L_0x00fa
                    boolean r0 = r0.isEmpty()
                    if (r0 == 0) goto L_0x0230
                L_0x00fa:
                    com.tencent.mm.plugin.websearch.h$d r0 = com.tencent.p014mm.plugin.websearch.C96598h.C96601d.this
                    com.tencent.mm.plugin.websearch.h r0 = com.tencent.p014mm.plugin.websearch.C96598h.this
                    u73.a0 r11 = r1.f282812d
                    java.lang.String r12 = r11.f300187b
                    int r13 = r11.f300191f
                    int r11 = r11.f300189d
                    int r14 = com.tencent.p014mm.plugin.websearch.C96598h.f282787v
                    r0.getClass()
                    boolean r0 = android.text.TextUtils.isEmpty(r12)
                    if (r0 == 0) goto L_0x0112
                    goto L_0x0159
                L_0x0112:
                    java.lang.String r0 = "snsContactMatch"
                    org.json.JSONObject r14 = u73.C78137s0.m94340d(r0)
                    java.lang.String r15 = "matchSwitch"
                    int r14 = r14.optInt(r15)
                    if (r14 != r8) goto L_0x0124
                    r14 = 1
                    goto L_0x0125
                L_0x0124:
                    r14 = 0
                L_0x0125:
                    if (r14 != 0) goto L_0x0128
                    goto L_0x0159
                L_0x0128:
                    org.json.JSONObject r0 = u73.C78137s0.m94340d(r0)
                    java.lang.String r14 = "queryUtfLenLimit"
                    int r0 = r0.optInt(r14)
                    if (r0 <= 0) goto L_0x013c
                    int r12 = r12.length()
                    if (r12 <= r0) goto L_0x013c
                    goto L_0x0159
                L_0x013c:
                    r0 = 8
                    if (r13 != r4) goto L_0x0143
                    if (r11 == r0) goto L_0x0143
                    goto L_0x0159
                L_0x0143:
                    if (r13 == r4) goto L_0x0147
                    if (r13 != r9) goto L_0x014a
                L_0x0147:
                    if (r11 != r0) goto L_0x014a
                    goto L_0x0157
                L_0x014a:
                    r9 = 14
                    if (r13 == r9) goto L_0x0152
                    r9 = 22
                    if (r13 != r9) goto L_0x0155
                L_0x0152:
                    if (r11 != r0) goto L_0x0155
                    goto L_0x0157
                L_0x0155:
                    if (r13 != r10) goto L_0x0159
                L_0x0157:
                    r0 = 1
                    goto L_0x015a
                L_0x0159:
                    r0 = 0
                L_0x015a:
                    if (r0 == 0) goto L_0x0230
                    long r9 = java.lang.System.currentTimeMillis()
                    com.tencent.mm.plugin.websearch.h$d r0 = com.tencent.p014mm.plugin.websearch.C96598h.C96601d.this
                    com.tencent.mm.plugin.websearch.h r0 = com.tencent.p014mm.plugin.websearch.C96598h.this
                    b83.c r0 = r0.f282794j
                    u73.a0 r11 = r1.f282812d
                    java.lang.String r11 = r11.f300187b
                    r12 = 2000(0x7d0, double:9.88E-321)
                    r14 = 2147483647(0x7fffffff, float:NaN)
                    r15 = r0
                    b83.b r15 = (b83.C0252b) r15
                    r15.getClass()
                    b83.e r5 = new b83.e
                    r5.<init>(r11, r14)
                    java.util.Map<b83.a, java.util.concurrent.CountDownLatch> r0 = r15.f793a
                    java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
                    java.lang.Object r0 = r0.get(r5)
                    java.util.concurrent.CountDownLatch r0 = (java.util.concurrent.CountDownLatch) r0
                    java.lang.String r4 = "FTSMatchContact"
                    if (r0 != 0) goto L_0x01be
                    kv1.o r6 = r15.f795c
                    boolean r6 = r15.mo292a(r5, r6)
                    if (r6 == 0) goto L_0x01ad
                    java.lang.Object[] r0 = new java.lang.Object[r3]
                    r0[r7] = r11
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r14)
                    r0[r8] = r6
                    java.lang.String r6 = "not have a running task ,start new task, query %s,maxMatch %d"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r0)
                    java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
                    r0.<init>(r8)
                    java.util.Map<b83.a, java.util.concurrent.CountDownLatch> r6 = r15.f793a
                    java.util.concurrent.ConcurrentHashMap r6 = (java.util.concurrent.ConcurrentHashMap) r6
                    r6.put(r5, r0)
                    goto L_0x01cd
                L_0x01ad:
                    java.lang.Object[] r6 = new java.lang.Object[r3]
                    r6[r7] = r11
                    java.lang.Integer r11 = java.lang.Integer.valueOf(r14)
                    r6[r8] = r11
                    java.lang.String r11 = "start new task fail, query %s,maxMatch %d"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r11, r6)
                    goto L_0x01cd
                L_0x01be:
                    java.lang.Object[] r6 = new java.lang.Object[r3]
                    r6[r7] = r11
                    java.lang.Integer r11 = java.lang.Integer.valueOf(r14)
                    r6[r8] = r11
                    java.lang.String r11 = "have a running task ,wait for result, query %s,maxMatch %d"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r11, r6)
                L_0x01cd:
                    if (r0 == 0) goto L_0x01dd
                    java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x01d5 }
                    r0.await(r12, r6)     // Catch:{ Exception -> 0x01d5 }
                    goto L_0x01dd
                L_0x01d5:
                    r0 = move-exception
                    java.lang.Object[] r6 = new java.lang.Object[r7]
                    java.lang.String r11 = ""
                    com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r11, r6)
                L_0x01dd:
                    java.util.Map<b83.a, java.util.concurrent.CountDownLatch> r0 = r15.f793a
                    java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
                    r0.remove(r5)
                    long r11 = java.lang.System.currentTimeMillis()
                    long r11 = r11 - r9
                    java.lang.Object[] r0 = new java.lang.Object[r8]
                    java.lang.Long r4 = java.lang.Long.valueOf(r11)
                    r0[r7] = r4
                    java.lang.String r4 = "match contact cost %d ms"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r0)
                    com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                    r4 = 14717(0x397d, float:2.0623E-41)
                    r6 = 5
                    java.lang.Object[] r6 = new java.lang.Object[r6]
                    u73.a0 r9 = r1.f282812d
                    java.lang.String r9 = r9.f300187b
                    r6[r7] = r9
                    int r9 = eb0.C45628s0.m50790o()
                    java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                    r6[r8] = r9
                    java.util.List<b83.e$a> r9 = r5.f263922c
                    int r9 = r9.size()
                    java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                    r6[r3] = r9
                    java.lang.Long r9 = java.lang.Long.valueOf(r11)
                    r10 = 3
                    r6[r10] = r9
                    u73.a0 r9 = r1.f282812d
                    int r9 = r9.f300191f
                    java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                    r10 = 4
                    r6[r10] = r9
                    r0.mo160131h(r4, r6)
                    goto L_0x0231
                L_0x0230:
                    r5 = 0
                L_0x0231:
                    boolean r0 = r1.f282813e
                    if (r0 == 0) goto L_0x023c
                    java.lang.String r0 = "was cancelled"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
                    return
                L_0x023c:
                    java.lang.Class<com.tencent.mm.plugin.websearch.l> r0 = com.tencent.p014mm.plugin.websearch.C96603l.class
                    di3.d r0 = di3.C86312j.m106911c(r0)
                    com.tencent.mm.plugin.websearch.l r0 = (com.tencent.p014mm.plugin.websearch.C96603l) r0
                    com.tencent.mm.plugin.websearch.FTSWebViewLogic r4 = r0.f282816j
                    if (r4 != 0) goto L_0x024f
                    com.tencent.mm.plugin.websearch.FTSWebViewLogic r4 = new com.tencent.mm.plugin.websearch.FTSWebViewLogic
                    r4.<init>()
                    r0.f282816j = r4
                L_0x024f:
                    com.tencent.mm.plugin.websearch.FTSWebViewLogic r0 = r0.f282816j
                    u73.i r0 = r0.f282766n
                    u73.a0 r4 = r1.f282812d
                    int r6 = r4.f300191f
                    java.lang.String r9 = r4.f300187b
                    int r10 = r4.f300189d
                    r0.f39534b = r9
                    r0.f39538f = r6
                    r0.f39535c = r7
                    r0.f39537e = r10
                    r0.f39536d = r7
                    r0.f39533a = r7
                    com.tencent.mm.plugin.websearch.h$d r0 = com.tencent.p014mm.plugin.websearch.C96598h.C96601d.this
                    r0.getClass()
                    int r6 = r4.f300179A
                    if (r6 != r3) goto L_0x0276
                    u73.u r3 = new u73.u
                    r3.<init>(r4)
                    goto L_0x027b
                L_0x0276:
                    u73.f0 r3 = new u73.f0
                    r3.<init>(r4)
                L_0x027b:
                    int r4 = r4.f300202q
                    r3.f300174d = r4
                    r0.f282808d = r3
                    if (r5 == 0) goto L_0x02c7
                    java.util.LinkedList r0 = new java.util.LinkedList
                    r0.<init>()
                    java.util.ArrayList r3 = new java.util.ArrayList
                    java.util.List<b83.e$a> r4 = r5.f263922c
                    r3.<init>(r4)
                    java.util.Iterator r3 = r3.iterator()
                L_0x0293:
                    boolean r4 = r3.hasNext()
                    if (r4 == 0) goto L_0x02c0
                    java.lang.Object r4 = r3.next()
                    b83.e$a r4 = (b83.C92209e.C92210a) r4
                    te3.zo4 r5 = new te3.zo4
                    r5.<init>()
                    java.lang.String r6 = r4.f263923a
                    r5.f146154d = r6
                    java.lang.String r6 = r4.f263924b
                    r5.f146155e = r6
                    java.lang.String r6 = r4.f263925c
                    r5.f146156f = r6
                    java.lang.String r6 = r4.f263926d
                    r5.f146157g = r6
                    java.lang.String r6 = r4.f263927e
                    r5.f146158h = r6
                    java.lang.String r4 = r4.f263928f
                    r5.f146159i = r4
                    r0.add(r5)
                    goto L_0x0293
                L_0x02c0:
                    com.tencent.mm.plugin.websearch.h$d r3 = com.tencent.p014mm.plugin.websearch.C96598h.C96601d.this
                    u73.a r3 = r3.f282808d
                    r3.mo141489l1(r0)
                L_0x02c7:
                    ob0.b0 r0 = f40.C86709a0.m107524d()
                    com.tencent.mm.plugin.websearch.h$d r3 = com.tencent.p014mm.plugin.websearch.C96598h.C96601d.this
                    u73.a r3 = r3.f282808d
                    int r3 = r3.getType()
                    com.tencent.mm.plugin.websearch.h$d r4 = com.tencent.p014mm.plugin.websearch.C96598h.C96601d.this
                    com.tencent.mm.plugin.websearch.h r4 = com.tencent.p014mm.plugin.websearch.C96598h.this
                    r0.mo123455a(r3, r4)
                    ob0.b0 r0 = f40.C86709a0.m107524d()
                    com.tencent.mm.plugin.websearch.h$d r3 = com.tencent.p014mm.plugin.websearch.C96598h.C96601d.this
                    u73.a r3 = r3.f282808d
                    r0.mo123460f(r3)
                    java.lang.Object[] r0 = new java.lang.Object[r8]
                    com.tencent.mm.plugin.websearch.h$d r3 = com.tencent.p014mm.plugin.websearch.C96598h.C96601d.this
                    u73.a r3 = r3.f282808d
                    int r3 = r3.getType()
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    r0[r7] = r3
                    java.lang.String r3 = "doScene(type : %s)"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.websearch.C96598h.C96601d.C96602a.run():void");
            }
        }

        public C96601d(C5826e eVar) {
        }

        /* renamed from: a */
        public void mo134679a(C101968a0 a0Var) {
            C96602a aVar = this.f282810f;
            if (aVar != null) {
                aVar.f282813e = true;
            }
            C96602a aVar2 = new C96602a((C5826e) null);
            this.f282810f = aVar2;
            aVar2.f282812d = a0Var;
            C96598h.this.f282792h = a0Var;
            this.f282809e.execute(this.f282810f);
        }

        public int compareTo(Object obj) {
            return 0;
        }
    }

    public C96598h() {
        Log.m105918d("MicroMsg.WebSearch.FTSWebSearchLogic", "create WebSearchLogic");
        MMHandler mMHandler = new MMHandler("WebSearchLogic_worker");
        this.f282795n = mMHandler;
        this.f282796o = new C96604n(mMHandler);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005d, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ca, code lost:
        r5 = r4;
        r6 = null;
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0031, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0035, code lost:
        r7 = r1.getNickname();
        r13 = r6;
        r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext().getString(com.tencent.p014mm.C0966R.string.igx);
        r1 = r3;
        r3 = r13;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject m123946a(lv1.C99681n r14, lv1.C99672i r15) {
        /*
            lv1.f$a r0 = lv1.C99667f.C99668a.CustomTag
            java.lang.Class<f62.k0> r1 = f62.C75700k0.class
            k40.a r1 = f40.C86709a0.m107533q(r1)
            f62.k0 r1 = (f62.C75700k0) r1
            com.tencent.mm.storage.u3 r1 = r1.mo96097Ni()
            java.lang.String r2 = r14.f292151e
            com.tencent.mm.storage.z1 r1 = r1.get(r2)
            java.lang.String r2 = r14.f292151e
            java.lang.String r2 = kv1.C99251g.m129283d(r2)
            int r3 = r14.f292149c
            r4 = 1
            r5 = 0
            r6 = 11
            r7 = 0
            if (r3 == r6) goto L_0x00cf
            switch(r3) {
                case 1: goto L_0x0060;
                case 2: goto L_0x005c;
                case 3: goto L_0x005a;
                case 4: goto L_0x004a;
                case 5: goto L_0x0033;
                case 6: goto L_0x0030;
                case 7: goto L_0x002e;
                default: goto L_0x0026;
            }
        L_0x0026:
            switch(r3) {
                case 15: goto L_0x00ad;
                case 16: goto L_0x007f;
                case 17: goto L_0x0071;
                case 18: goto L_0x0063;
                default: goto L_0x0029;
            }
        L_0x0029:
            r1 = 0
            r3 = 0
            r4 = 0
            goto L_0x00ca
        L_0x002e:
            r3 = 1
            goto L_0x0031
        L_0x0030:
            r3 = 0
        L_0x0031:
            r6 = 1
            goto L_0x0035
        L_0x0033:
            r3 = 0
            r6 = 0
        L_0x0035:
            java.lang.String r7 = r1.getNickname()
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r8 = 2131835407(0x7f113a0f, float:1.9303952E38)
            java.lang.String r1 = r1.getString(r8)
            r13 = r6
            r6 = r1
            r1 = r3
            r3 = r13
            goto L_0x0145
        L_0x004a:
            java.lang.String r1 = r1.f149513S0
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r6 = 2131835402(0x7f113a0a, float:1.9303942E38)
            java.lang.String r3 = r3.getString(r6)
        L_0x0057:
            r7 = r1
            goto L_0x0142
        L_0x005a:
            r1 = 1
            goto L_0x005d
        L_0x005c:
            r1 = 0
        L_0x005d:
            r3 = 1
            goto L_0x00ca
        L_0x0060:
            r1 = 0
            r3 = 0
            goto L_0x00ca
        L_0x0063:
            java.lang.String r1 = r14.f292154h
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r6 = 2131835408(0x7f113a10, float:1.9303954E38)
            java.lang.String r3 = r3.getString(r6)
            goto L_0x0057
        L_0x0071:
            java.lang.String r1 = r14.f292154h
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r6 = 2131835401(0x7f113a09, float:1.930394E38)
            java.lang.String r3 = r3.getString(r6)
            goto L_0x0057
        L_0x007f:
            java.lang.String r1 = r14.f292154h
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r3 != 0) goto L_0x00a1
            java.lang.String r3 = "​"
            java.lang.String[] r3 = r1.split(r3)
            int r6 = r3.length
            r7 = 0
        L_0x0090:
            if (r7 >= r6) goto L_0x00a1
            r8 = r3[r7]
            java.lang.String r9 = r15.f292120a
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x009e
            r1 = r8
            goto L_0x00a1
        L_0x009e:
            int r7 = r7 + 1
            goto L_0x0090
        L_0x00a1:
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r6 = 2131835406(0x7f113a0e, float:1.930395E38)
            java.lang.String r3 = r3.getString(r6)
            goto L_0x0057
        L_0x00ad:
            java.lang.String r3 = r1.mo62913l2()
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r6 == 0) goto L_0x00bb
            java.lang.String r3 = r1.getUsername()
        L_0x00bb:
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r6 = 2131835413(0x7f113a15, float:1.9303964E38)
            java.lang.String r1 = r1.getString(r6)
            r7 = r3
            r3 = r1
            goto L_0x0142
        L_0x00ca:
            r5 = r4
            r6 = r7
            r4 = 0
            goto L_0x0145
        L_0x00cf:
            java.lang.Class<kv1.q> r3 = kv1.C99260q.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            kv1.q r3 = (kv1.C99260q) r3
            kv1.m r3 = r3.mo128761xc()
            java.lang.String r1 = r1.mo73974r2()
            com.tencent.mm.plugin.fts.g r3 = (com.tencent.p014mm.plugin.fts.C68985g) r3
            java.util.List r1 = r3.mo94942c(r1)
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            java.lang.String[] r6 = r15.f292122c
            int r7 = r6.length
            r8 = 0
        L_0x00ee:
            if (r8 >= r7) goto L_0x011f
            r9 = r6[r8]
            r10 = r1
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            java.util.Iterator r10 = r10.iterator()
        L_0x00f9:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x011c
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r12 = r11.toLowerCase()
            java.lang.String r12 = kv1.C99255j.m129319c(r12)
            boolean r12 = r12.contains(r9)
            if (r12 == 0) goto L_0x00f9
            r3.append(r11)
            java.lang.String r11 = ","
            r3.append(r11)
            goto L_0x00f9
        L_0x011c:
            int r8 = r8 + 1
            goto L_0x00ee
        L_0x011f:
            r3.trimToSize()
            int r1 = r3.length()
            if (r1 != 0) goto L_0x012b
            java.lang.String r1 = ""
            goto L_0x0135
        L_0x012b:
            int r1 = r3.length()
            int r1 = r1 + -1
            java.lang.String r1 = r3.substring(r5, r1)
        L_0x0135:
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r6 = 2131835412(0x7f113a14, float:1.9303962E38)
            java.lang.String r3 = r3.getString(r6)
            goto L_0x0057
        L_0x0142:
            r6 = r3
            r1 = 0
            r3 = 0
        L_0x0145:
            java.lang.String r8 = "</em>"
            java.lang.String r9 = "<em class=\"highlight\">"
            if (r5 == 0) goto L_0x015f
            lv1.f r2 = lv1.C99667f.m130091d(r2, r15, r3, r1)
            r2.f292092e = r0
            r2.f292098k = r9
            r2.f292099l = r8
            lv1.g r2 = kv1.C99254i.m129308e(r2)
            java.lang.CharSequence r2 = r2.f292107a
            java.lang.String r2 = r2.toString()
        L_0x015f:
            if (r4 == 0) goto L_0x0184
            lv1.f r15 = lv1.C99667f.m130091d(r7, r15, r3, r1)
            r15.f292092e = r0
            r15.f292098k = r9
            r15.f292099l = r8
            lv1.g r15 = kv1.C99254i.m129308e(r15)
            java.lang.CharSequence r15 = r15.f292107a
            java.lang.String r15 = r15.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            r0.append(r15)
            java.lang.String r7 = r0.toString()
        L_0x0184:
            org.json.JSONObject r15 = new org.json.JSONObject
            r15.<init>()
            java.lang.String r0 = "nickName"
            java.lang.String r1 = r14.f292151e     // Catch:{ JSONException -> 0x01ac }
            java.lang.String r1 = kv1.C99251g.m129283d(r1)     // Catch:{ JSONException -> 0x01ac }
            r15.put(r0, r1)     // Catch:{ JSONException -> 0x01ac }
            java.lang.String r0 = "userName"
            java.lang.String r14 = r14.f292151e     // Catch:{ JSONException -> 0x01ac }
            r15.put(r0, r14)     // Catch:{ JSONException -> 0x01ac }
            if (r5 == 0) goto L_0x01a5
            java.lang.String r14 = "nickNameHighlight"
            r15.put(r14, r2)     // Catch:{ JSONException -> 0x01ac }
        L_0x01a5:
            if (r4 == 0) goto L_0x01ac
            java.lang.String r14 = "extraHighlight"
            r15.put(r14, r7)     // Catch:{ JSONException -> 0x01ac }
        L_0x01ac:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.websearch.C96598h.m123946a(lv1.n, lv1.i):org.json.JSONObject");
    }

    /* renamed from: b */
    public final C101968a0 mo134676b(Map<String, Object> map) {
        t25 t25;
        int e = C43471q.m46981e(map, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        C101968a0 a0Var = new C101968a0();
        a0Var.f300187b = C43471q.m46982f(map, SearchIntents.EXTRA_QUERY);
        a0Var.f300188c = C43471q.m46981e(map, "offset", 0);
        a0Var.f300189d = C43471q.m46981e(map, "type", 0);
        a0Var.f300191f = e;
        a0Var.f300194i = C43471q.m46982f(map, "sugId");
        a0Var.f300196k = C43471q.m46981e(map, "sugType", 0);
        a0Var.f300195j = C43471q.m46982f(map, "prefixSug");
        a0Var.f300209x = C43471q.m46982f(map, "poiInfo");
        a0Var.f300186a = C43471q.m46980d(map, "isHomePage", false) ? 1 : 0;
        a0Var.f300192g = C43471q.m46982f(map, "searchId");
        if (map.containsKey("sessionId")) {
            a0Var.f300207v = C43471q.m46982f(map, "sessionId");
        }
        a0Var.f300193h = C43471q.m46981e(map, "sceneActionType", 1);
        C43471q.m46981e(map, "displayPattern", 2);
        a0Var.f300198m = C43471q.m46981e(map, "sugPosition", 0);
        C43471q.m46982f(map, "sugBuffer");
        a0Var.f300210y = C43471q.m46982f(map, "requestId");
        a0Var.f300207v = C43471q.m46982f(map, "sessionId");
        a0Var.f300208w = C43471q.m46982f(map, "subSessionId");
        C43471q.m46982f(map, "tagId");
        a0Var.f300182D = C43471q.m46980d(map, "fromTagSearch", false);
        try {
            JSONObject jSONObject = new JSONObject(URLDecoder.decode(C43471q.m46982f(map, "extClientParams"), "utf-8"));
            a0Var.f300184F = jSONObject.optString("ShareSceneId");
            a0Var.f300185G = jSONObject.optInt("SnsContentType");
            String optString = jSONObject.optString("exposedFingerWord");
            String optString2 = jSONObject.optString("matchedFingerWord");
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                C49768hy hyVar = new C49768hy();
                hyVar.f134951d = "exposedFingerWord";
                hyVar.f134953f = optString;
                C49768hy hyVar2 = new C49768hy();
                hyVar2.f134951d = "matchedFingerWord";
                hyVar2.f134953f = optString2;
                a0Var.f300200o.add(hyVar);
                a0Var.f300200o.add(hyVar2);
            }
        } catch (Throwable unused) {
        }
        String f = C43471q.m46982f(map, "extReqParams");
        if (!Util.isNullOrNil(f)) {
            try {
                JSONArray jSONArray = new JSONArray(f);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    C49768hy hyVar3 = new C49768hy();
                    hyVar3.f134951d = jSONObject2.optString("key", "");
                    hyVar3.f134952e = (long) jSONObject2.optInt("uintValue", 0);
                    hyVar3.f134953f = jSONObject2.optString("textValue", "");
                    a0Var.f300200o.add(hyVar3);
                }
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.WebSearch.FTSWebSearchLogic", e2, "commKvJSONArray", new Object[0]);
            }
        }
        String f2 = C43471q.m46982f(map, "matchUser");
        if (!Util.isNullOrNil(f2)) {
            try {
                JSONObject jSONObject3 = new JSONObject(f2);
                zo4 zo4 = new zo4();
                zo4.f146154d = jSONObject3.optString("userName");
                zo4.f146155e = jSONObject3.optString("matchWord");
                if (!TextUtils.isEmpty(zo4.f146154d)) {
                    a0Var.f300190e.add(zo4);
                }
            } catch (Exception e3) {
                Log.printErrStackTrace("MicroMsg.WebSearch.FTSWebSearchLogic", e3, "matchUserJSONArray", new Object[0]);
            }
        }
        String f3 = C43471q.m46982f(map, "prefixQuery");
        if (!Util.isNullOrNil(f3)) {
            try {
                JSONArray jSONArray2 = new JSONArray(f3);
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    a0Var.f300197l.add(jSONArray2.getString(i2));
                }
            } catch (Exception e4) {
                Log.printErrStackTrace("MicroMsg.WebSearch.FTSWebSearchLogic", e4, "prefixQueryJSONArray", new Object[0]);
            }
        }
        String f4 = C43471q.m46982f(map, "tagInfo");
        if (!Util.isNullOrNil(f4)) {
            try {
                JSONObject jSONObject4 = new JSONObject(f4);
                ye4 ye4 = new ye4();
                a0Var.f300199n = ye4;
                ye4.f186507e = jSONObject4.optString("tagText");
                a0Var.f300199n.f186506d = jSONObject4.optInt("tagType");
                a0Var.f300199n.f186508f = jSONObject4.optString("tagExtValue");
            } catch (Exception e5) {
                Log.printErrStackTrace("MicroMsg.WebSearch.FTSWebSearchLogic", e5, "tagInfoObj", new Object[0]);
            }
        }
        String f5 = C43471q.m46982f(map, "numConditions");
        if (!Util.isNullOrNil(f5)) {
            try {
                JSONArray jSONArray3 = new JSONArray(f5);
                for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                    JSONObject optJSONObject = jSONArray3.optJSONObject(i3);
                    C64569n43 n432 = new C64569n43();
                    n432.f184431e = optJSONObject.optLong("from");
                    n432.f184432f = optJSONObject.optLong("to");
                    n432.f184430d = optJSONObject.optInt("field");
                    a0Var.f300201p.add(n432);
                }
            } catch (Exception e6) {
                Log.printErrStackTrace("MicroMsg.WebSearch.FTSWebSearchLogic", e6, "numConditionsArray", new Object[0]);
            }
        }
        a0Var.f300202q = Util.nullAsInt(map.get("webview_instance_id"), -1);
        a0Var.f300203r = LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext());
        C43471q.m46981e(map, "subType", 0);
        int e7 = C43471q.m46981e(map, "isWeAppMore", 0);
        a0Var.f300204s = e7;
        if (e7 == 1) {
            d75 d75 = new d75();
            a0Var.f300205t = d75;
            d75.f182647d = C43471q.m46977a(3);
            d75 d752 = a0Var.f300205t;
            d752.f182650g = C9575d.f29814a;
            d752.f182648e = C43471q.m46981e(map, "subType", 0);
            d75 d753 = a0Var.f300205t;
            d753.f182649f = null;
            d753.f182652i = a0Var.f300198m;
            Object f6 = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WXA_SEARCH_INPUT_HINT_CONTENT_ID_STRING_SYNC, (Object) null);
            if (f6 != null && (f6 instanceof String)) {
                a0Var.f300205t.f182651h = (String) f6;
            }
        }
        if (this.f282788d == 1) {
            a0Var.f300206u = this.f282789e;
        } else {
            a0Var.f300206u = null;
        }
        if (a0Var.f300191f == 33 && this.f282790f != null) {
            if (a0Var.f300206u == null) {
                a0Var.f300206u = new t25();
            }
            t25 t252 = a0Var.f300206u;
            if (t252.f185478e == null) {
                t252.f185478e = new C64342ej();
            }
            C64342ej ejVar = this.f282790f.f185478e;
            if (ejVar != null) {
                a0Var.f300206u.f185478e.f182981p = ejVar.f182981p;
                Log.m105925i("MicroMsg.WebSearch.FTSWebSearchLogic", "websearch from url [%s]", ejVar.f182981p);
            }
            this.f282790f = null;
        }
        if (a0Var.f300189d == 262144 && (t25 = this.f282790f) != null && t25.f185478e.f182978j == 1) {
            Bundle bundle = new Bundle();
            bundle.putInt("isRefresh", 1);
            bundle.putString("widgetId", C43471q.m46982f(map, "widgetId"));
            a0Var.f300211z = bundle;
            a0Var.f300206u = this.f282790f;
            this.f282790f = null;
        }
        String f7 = C43471q.m46982f(map, "specialSearch");
        if (!Util.isNullOrNil(f7)) {
            try {
                JSONObject jSONObject5 = new JSONObject(f7);
                a0Var.f300179A = jSONObject5.optInt("type", 0);
                a0Var.f300180B = jSONObject5.optJSONObject("params").optString("reqKey");
            } catch (Exception unused2) {
            }
        }
        return a0Var;
    }

    /* renamed from: c */
    public Map<String, String> mo134677c(String str) {
        C101979m0 m0Var;
        HashMap hashMap = new HashMap();
        C96604n nVar = (C96604n) this.f282796o;
        nVar.getClass();
        Log.m105925i("MicroMsg.WebSearch.PGetController", "tryGet type:%s, reqTag:%s", 1, str);
        Object obj = null;
        if (!(str == null || (m0Var = (C101979m0) ((Map) ((ArrayList) nVar.f282821b).get(1)).get(str)) == null || !m0Var.f300279c)) {
            obj = m0Var.f300281e;
        }
        C96600c cVar = (C96600c) obj;
        if (cVar != null && !TextUtils.isEmpty(cVar.f282804b)) {
            hashMap.put("data", cVar.f282804b);
        }
        return hashMap;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Class cls = C7575o0.class;
        Object[] objArr = new Object[4];
        objArr[0] = Integer.valueOf(yVar != null ? yVar.getType() : 0);
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = str;
        Log.m105927v("MicroMsg.WebSearch.FTSWebSearchLogic", "onSceneEnd websearch (type : %s), errType : %s, errCode : %s, errMsg : %s", objArr);
        if (yVar instanceof C101967a) {
            C86709a0.m107524d().mo123470p(yVar.getType(), this);
            C101967a aVar = (C101967a) yVar;
            if (i == 0 && i2 == 0) {
                String j1 = aVar.mo73412j1();
                int k1 = aVar.mo73413k1();
                Log.m105925i("MicroMsg.WebSearch.FTSWebSearchLogic", "callback %s", aVar.f300175e);
                int i3 = aVar.f300174d;
                boolean z = aVar.f300176f == 0;
                String str2 = aVar.f300177g;
                ((C96604n) this.f282796o).mo134695b(1, str2, new C96600c(i3, j1, z, str2, aVar.f300178h), this.f282798q);
                if (k1 > 0) {
                    Log.m105925i("MicroMsg.WebSearch.FTSWebSearchLogic", "updateCode %d, need update", Integer.valueOf(k1));
                    ((C32147e) C86312j.m106911c(C32147e.class)).Yi0(27);
                    return;
                }
                return;
            }
            Log.m105925i("MicroMsg.WebSearch.FTSWebSearchLogic", "net scene fail %s", aVar.f300175e);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("ret", -1);
            } catch (JSONException unused) {
            }
            String jSONObject2 = jSONObject.toString();
            int i4 = aVar.f300174d;
            boolean z2 = aVar.f300176f == 0;
            String str3 = aVar.f300177g;
            ((C96604n) this.f282796o).mo134695b(1, str3, new C96600c(i4, jSONObject2, z2, str3, (Bundle) null), this.f282798q);
        } else if (yVar instanceof C101969b) {
            C86709a0.m107524d().mo123470p(yVar.getType(), this);
            C101969b bVar = (C101969b) yVar;
            if (i == 0 && i2 == 0) {
                ((C7575o0) C86312j.m106911c(cls)).mo8687iT(bVar.f300213e, bVar.mo141491j1());
                return;
            }
            Log.m105925i("MicroMsg.WebSearch.FTSWebSearchLogic", "net scene fail %s", bVar.f300212d);
            ((C7575o0) C86312j.m106911c(cls)).mo8687iT(bVar.f300213e, "{}");
        }
    }
}
