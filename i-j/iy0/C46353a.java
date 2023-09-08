package iy0;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40780x0;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMKVSlotManager;
import com.tencent.p014mm.sdk.platformtools.MMSlotKt;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.WebResourceResponse;
import ex0.C45700h;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import pe3.C89349b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sf0.C48374j0;
import sx3.C110818d0;
import sx3.C26236u;
import sx3.C90363p0;
import t73.C48555a;
import t73.C48556b;
import te3.k25;
import te3.l25;
import te3.m25;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: iy0.a */
public final class C46353a {

    /* renamed from: a */
    public final String f124919a;

    /* renamed from: b */
    public final String f124920b;

    /* renamed from: c */
    public final C48556b f124921c;

    /* renamed from: d */
    public final MMKVSlotManager f124922d;

    /* renamed from: e */
    public final String f124923e;

    /* renamed from: f */
    public final String f124924f;

    /* renamed from: g */
    public final Boolean f124925g;

    /* renamed from: h */
    public final C48555a f124926h;

    /* renamed from: i */
    public final boolean f124927i;

    /* renamed from: j */
    public final String f124928j;

    /* renamed from: k */
    public final String f124929k;

    /* renamed from: l */
    public final C13601g f124930l;

    /* renamed from: m */
    public final C13601g f124931m;

    /* renamed from: n */
    public final C13601g f124932n;

    /* renamed from: o */
    public final C13601g f124933o;

    /* renamed from: p */
    public final C13601g f124934p;

    /* renamed from: q */
    public final C13601g f124935q;

    /* renamed from: r */
    public final C13601g f124936r;

    /* renamed from: s */
    public final C13601g f124937s;

    /* renamed from: t */
    public final C13601g f124938t;

    /* renamed from: u */
    public final C13601g f124939u;

    /* renamed from: v */
    public final C13601g f124940v;

    /* renamed from: w */
    public final C13601g f124941w;

    /* renamed from: x */
    public final C13601g f124942x;

    /* renamed from: iy0.a$a */
    public /* synthetic */ class C46354a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f124943a;

        static {
            int[] iArr = new int[C40717k0.C40719b.values().length];
            iArr[2] = 1;
            f124943a = iArr;
        }
    }

    public C46353a(String str, String str2, C48556b bVar, MMKVSlotManager mMKVSlotManager, String str3, String str4, Boolean bool, C48555a aVar, boolean z, String str5, String str6, int i, C8480h hVar) {
        str3 = (i & 16) != 0 ? null : str3;
        str4 = (i & 32) != 0 ? null : str4;
        bool = (i & 64) != 0 ? Boolean.FALSE : bool;
        aVar = (i & 128) != 0 ? null : aVar;
        z = (i & 256) != 0 ? false : z;
        str5 = (i & 512) != 0 ? null : str5;
        str6 = (i & 1024) != 0 ? null : str6;
        C87412m.m108594g(str, "url");
        C87412m.m108594g(str2, "webId");
        C87412m.m108594g(mMKVSlotManager, "headerSlot");
        this.f124919a = str;
        this.f124920b = str2;
        this.f124921c = bVar;
        this.f124922d = mMKVSlotManager;
        this.f124923e = str3;
        this.f124924f = str4;
        this.f124925g = bool;
        this.f124926h = aVar;
        this.f124927i = z;
        this.f124928j = str5;
        this.f124929k = str6;
        this.f124930l = C36568h.m40985a(new C46363j(this));
        this.f124931m = C36568h.m40985a(new C46356c(this));
        this.f124932n = C36568h.m40985a(new C46355b(this));
        this.f124933o = C36568h.m40985a(new C46360g(this));
        this.f124934p = C36568h.m40985a(new C46359f(this));
        this.f124935q = C36568h.m40985a(new C46357d(this));
        this.f124936r = C36568h.m40985a(new C46367n(this));
        this.f124937s = C36568h.m40985a(new C46366m(this));
        this.f124938t = C36568h.m40985a(new C46362i(this));
        this.f124939u = C36568h.m40985a(new C46364k(this));
        this.f124940v = C36568h.m40985a(new C46358e(this));
        this.f124941w = C36568h.m40985a(new C46365l(this));
        this.f124942x = C36568h.m40985a(new C46361h(this));
    }

    /* renamed from: a */
    public static final m25 m51676a(C46353a aVar) {
        return (m25) ((C36570n) aVar.f124930l).getValue();
    }

    /* renamed from: b */
    public final C45700h.C45703c mo71760b() {
        String str;
        String str2;
        if (this.f124921c == null) {
            return null;
        }
        int size = mo71770l().size();
        boolean A = this.f124921c.mo73171A(mo71762d());
        if (size == 0 || !A) {
            Log.m105920e("MicroMsg.PrefetchTarget", "createResponse fail headerSize:" + size + ", containsFile:" + A);
            return null;
        }
        C45700h.C45703c cVar = new C45700h.C45703c();
        cVar.f123515a = (String) ((C36570n) this.f124933o).getValue();
        cVar.f123517c = this.f124920b;
        cVar.f123516b = mo71762d();
        cVar.f123520f = mo71778t().f109383d;
        cVar.f123519e = mo71779u();
        cVar.f123518d = mo71763e();
        cVar.f123522h = mo71777s();
        cVar.f123523i = mo71768j();
        cVar.f123524j = (String) ((C36570n) this.f124932n).getValue();
        cVar.f123525k = (C89349b) ((C36570n) this.f124938t).getValue();
        cVar.f123526l = mo71774p();
        cVar.f123528n = C48374j0.m53713b((C89349b) ((C36570n) this.f124940v).getValue());
        HashMap<String, List<String>> l = mo71770l();
        Set<String> keySet = l.keySet();
        C87412m.m108593f(keySet, "headers.keys");
        ArrayList arrayList = new ArrayList();
        for (T next : keySet) {
            String str3 = (String) next;
            Set<String> set = C40780x0.f109630a;
            C87412m.m108593f(str3, LocaleUtil.ITALIAN);
            String lowerCase = str3.toLowerCase();
            C87412m.m108593f(lowerCase, "this as java.lang.String).toLowerCase()");
            if (set.contains(lowerCase)) {
                arrayList.add(next);
            }
        }
        Log.m105924i("MicroMsg.PrefetchTarget", "removeInvalidHeaders size: " + arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            l.remove((String) it.next());
        }
        HashMap<String, List<String>> l2 = mo71770l();
        C40717k0.f109363a.getClass();
        if (!((Boolean) ((C36570n) C40717k0.f109369g).getValue()).booleanValue()) {
            l2.remove("set-cookie");
        }
        C45700h.C45705e eVar = new C45700h.C45705e();
        List list = mo71770l().get("content-type");
        if (list == null || (str2 = (String) C110818d0.m150914L(list)) == null || (str = C112550d0.m153799i0(C112550d0.m153795e0(str2, ";", str2)).toString()) == null) {
            str = "text/html";
        }
        String str4 = str;
        HashMap<String, List<String>> l3 = mo71770l();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C90363p0.m113142a(l3.size()));
        for (Map.Entry entry : l3.entrySet()) {
            Object key = entry.getKey();
            String str5 = (String) entry.getKey();
            linkedHashMap.put(key, (String) C110818d0.m150914L((List) entry.getValue()));
        }
        C13598b0 b0Var = C13598b0.f38549a;
        C48556b bVar = this.f124921c;
        String str6 = cVar.f123516b;
        C87412m.m108593f(str6, "bizId");
        eVar.f123531a = new WebResourceResponse(str4, "UTF-8", 200, "OK", linkedHashMap, C86013q1.m106422D(bVar.mo73172B(str6)));
        cVar.f123521g = eVar;
        return cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        r0 = (java.lang.String) sx3.C110818d0.m150916N(r0);
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo71761c() {
        /*
            r2 = this;
            java.util.HashMap r0 = r2.mo71770l()
            java.lang.String r1 = "x-wx-prefetch-pkg-base-ver"
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0017
            java.lang.Object r0 = sx3.C110818d0.m150916N(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0019
        L_0x0017:
            java.lang.String r0 = ""
        L_0x0019:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: iy0.C46353a.mo71761c():java.lang.String");
    }

    /* renamed from: d */
    public final String mo71762d() {
        return (String) ((C36570n) this.f124931m).getValue();
    }

    /* renamed from: e */
    public final int mo71763e() {
        return ((Number) ((C36570n) this.f124935q).getValue()).intValue();
    }

    /* renamed from: f */
    public final long mo71764f() {
        String str;
        List list = mo71770l().get("x-wx-client-cache-time");
        if (list == null || (str = (String) C110818d0.m150914L(list)) == null) {
            return -1;
        }
        return Long.parseLong(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        r0 = (java.lang.String) sx3.C110818d0.m150914L(r0);
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo71765g() {
        /*
            r5 = this;
            java.util.HashMap r0 = r5.mo71770l()
            java.lang.String r1 = "x-wx-client-check-update-time"
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x001c
            java.lang.Object r0 = sx3.C110818d0.m150914L(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x001c
            long r0 = java.lang.Long.parseLong(r0)
            goto L_0x001e
        L_0x001c:
            r0 = -1
        L_0x001e:
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x002a
            r2 = 60
            long r0 = java.lang.Math.max(r0, r2)
        L_0x002a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: iy0.C46353a.mo71765g():long");
    }

    /* renamed from: h */
    public final long mo71766h() {
        String str;
        List list = mo71770l().get("x-wx-check-update-time-interval");
        if (list == null || (str = (String) C110818d0.m150914L(list)) == null) {
            return -1;
        }
        return Long.parseLong(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r0 = (java.lang.String) sx3.C110818d0.m150914L(r0);
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo71767i() {
        /*
            r2 = this;
            java.util.HashMap r0 = r2.mo71770l()
            java.lang.String r1 = "etag"
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = sx3.C110818d0.m150914L(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0018
        L_0x0016:
            java.lang.String r0 = ""
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: iy0.C46353a.mo71767i():java.lang.String");
    }

    /* renamed from: j */
    public final int mo71768j() {
        return ((Number) ((C36570n) this.f124934p).getValue()).intValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r0 = com.tencent.p014mm.plugin.webview.core.C5857x.m5577a().getString("debugPatchInfo", "");
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo71769k() {
        /*
            r8 = this;
            boolean r0 = com.tencent.p014mm.plugin.brandservice.webprefetcher.debug.C40819a.m44116b()
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0050
            com.tencent.mm.plugin.webview.core.v$b r0 = com.tencent.p014mm.plugin.webview.core.C43520v.f117665a
            boolean r0 = r0.mo67810a()
            if (r0 == 0) goto L_0x001f
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.plugin.webview.core.C5857x.m5577a()
            java.lang.String r2 = "debugPatchInfo"
            java.lang.String r0 = r0.getString(r2, r1)
            if (r0 != 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r2 = r0
            goto L_0x0020
        L_0x001f:
            r2 = r1
        L_0x0020:
            java.lang.String r0 = ","
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            java.util.List r0 = z04.C112550d0.m153785U(r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = sx3.C110818d0.m150916N(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0037
            r0 = r1
        L_0x0037:
            int r2 = r0.length()
            r3 = 0
            r4 = 1
            if (r2 <= 0) goto L_0x0041
            r2 = 1
            goto L_0x0042
        L_0x0041:
            r2 = 0
        L_0x0042:
            if (r2 == 0) goto L_0x0050
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r0
            java.lang.String r2 = "MicroMsg.PrefetchTarget"
            java.lang.String r3 = "debugPatchUrl: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r2, r3, r1)
            return r0
        L_0x0050:
            java.util.HashMap r0 = r8.mo71770l()
            java.lang.String r2 = "x-wx-prefetch-pkg-url"
            java.lang.Object r0 = r0.get(r2)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0069
            java.lang.Object r0 = sx3.C110818d0.m150914L(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0068
            goto L_0x0069
        L_0x0068:
            r1 = r0
        L_0x0069:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: iy0.C46353a.mo71769k():java.lang.String");
    }

    /* renamed from: l */
    public final HashMap<String, List<String>> mo71770l() {
        return (HashMap) ((C36570n) this.f124942x).getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r0 = (java.lang.String) sx3.C110818d0.m150914L(r0);
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo71771m() {
        /*
            r2 = this;
            java.util.HashMap r0 = r2.mo71770l()
            java.lang.String r1 = "location"
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = sx3.C110818d0.m150914L(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0018
        L_0x0016:
            java.lang.String r0 = ""
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: iy0.C46353a.mo71771m():java.lang.String");
    }

    /* renamed from: n */
    public final int mo71772n() {
        String str;
        String str2;
        List list = mo71770l().get("x-wx-max-cache");
        if (list != null && (str2 = (String) C110818d0.m150914L(list)) != null) {
            return Integer.parseInt(str2);
        }
        List list2 = mo71770l().get("max-age");
        if (list2 == null || (str = (String) C110818d0.m150914L(list2)) == null) {
            return 600;
        }
        return Integer.parseInt(str);
    }

    /* renamed from: o */
    public final boolean mo71773o() {
        if (mo71766h() < 0 || mo71765g() < 0) {
            return false;
        }
        return MMSlotKt.isExpire(mo71765g(), mo71766h());
    }

    /* renamed from: p */
    public final String mo71774p() {
        return (String) ((C36570n) this.f124939u).getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r0 = com.tencent.p014mm.plugin.webview.core.C5857x.m5577a().getString("debugPatchInfo", "");
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo71775q() {
        /*
            r8 = this;
            boolean r0 = com.tencent.p014mm.plugin.brandservice.webprefetcher.debug.C40819a.m44116b()
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0050
            com.tencent.mm.plugin.webview.core.v$b r0 = com.tencent.p014mm.plugin.webview.core.C43520v.f117665a
            boolean r0 = r0.mo67810a()
            if (r0 == 0) goto L_0x001f
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.plugin.webview.core.C5857x.m5577a()
            java.lang.String r2 = "debugPatchInfo"
            java.lang.String r0 = r0.getString(r2, r1)
            if (r0 != 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r2 = r0
            goto L_0x0020
        L_0x001f:
            r2 = r1
        L_0x0020:
            java.lang.String r0 = ","
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            java.util.List r0 = z04.C112550d0.m153785U(r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = sx3.C110818d0.m150925W(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0037
            r0 = r1
        L_0x0037:
            int r2 = r0.length()
            r3 = 0
            r4 = 1
            if (r2 <= 0) goto L_0x0041
            r2 = 1
            goto L_0x0042
        L_0x0041:
            r2 = 0
        L_0x0042:
            if (r2 == 0) goto L_0x0050
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r0
            java.lang.String r2 = "MicroMsg.PrefetchTarget"
            java.lang.String r3 = "debugPatchPkgVersion: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r2, r3, r1)
            return r0
        L_0x0050:
            java.util.HashMap r0 = r8.mo71770l()
            java.lang.String r2 = "x-wx-prefetch-pkg-ver"
            java.lang.Object r0 = r0.get(r2)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0069
            java.lang.Object r0 = sx3.C110818d0.m150914L(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0068
            goto L_0x0069
        L_0x0068:
            r1 = r0
        L_0x0069:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: iy0.C46353a.mo71775q():java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x03ae  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0582  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final ex0.C45700h.C45703c mo71776r() {
        /*
            r33 = this;
            r1 = r33
            java.lang.String r2 = r33.mo71774p()
            t73.d$b r0 = t73.C48558d.f129896H
            java.lang.String r3 = r1.f124919a
            java.lang.Boolean r4 = r1.f124925g
            java.lang.String r5 = ":"
            java.lang.String r6 = "/resources/"
            java.lang.String r7 = "url"
            gy3.C87412m.m108594g(r3, r7)
            rx3.g<java.lang.Boolean> r8 = t73.C48558d.f129899K
            rx3.n r8 = (rx3.C36570n) r8
            java.lang.Object r8 = r8.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            java.lang.String r9 = ""
            java.lang.String r10 = ", url: %s"
            java.lang.String r11 = ", isForMainFrame: "
            if (r8 != 0) goto L_0x002d
            goto L_0x0051
        L_0x002d:
            if (r2 == 0) goto L_0x0038
            boolean r8 = z04.C112551y.m153811k(r2)
            if (r8 == 0) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r8 = 0
            goto L_0x0039
        L_0x0038:
            r8 = 1
        L_0x0039:
            java.lang.String r15 = "MicroMsg.WebPrefetcherJsEngine"
            if (r8 == 0) goto L_0x0059
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "matchResource fail appId="
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r0)
        L_0x0051:
            r19 = r7
            r18 = r9
        L_0x0055:
            r20 = r11
            goto L_0x02c5
        L_0x0059:
            android.net.Uri r8 = android.net.Uri.parse(r3)
            java.lang.String r12 = q73.C35796c0.m40831h(r2)
            s73.c$b r13 = s73.C48255c.f129277x     // Catch:{ Exception -> 0x02b5 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02b5 }
            r14.<init>()     // Catch:{ Exception -> 0x02b5 }
            r18 = r9
            java.lang.String r9 = "prefetcher/"
            r14.append(r9)     // Catch:{ Exception -> 0x02b1 }
            r14.append(r2)     // Catch:{ Exception -> 0x02b1 }
            java.lang.String r9 = ".wspkg"
            r14.append(r9)     // Catch:{ Exception -> 0x02b1 }
            java.lang.String r9 = r14.toString()     // Catch:{ Exception -> 0x02b1 }
            q73.c0 r14 = q73.C35796c0.f95588a     // Catch:{ Exception -> 0x02b1 }
            int r14 = r14.mo60408j()     // Catch:{ Exception -> 0x02b1 }
            r19 = r7
            r7 = 1
            if (r14 != r7) goto L_0x0089
            r7 = 1
            goto L_0x008a
        L_0x0089:
            r7 = 0
        L_0x008a:
            s73.c$b$a r7 = r13.mo60770a(r9, r7, r12, r2)     // Catch:{ Exception -> 0x02ad }
            java.lang.String r9 = r7.f97384c     // Catch:{ Exception -> 0x02ad }
            boolean r9 = com.tencent.p014mm.vfs.C86013q1.m106450k(r9)     // Catch:{ Exception -> 0x02ad }
            if (r9 == 0) goto L_0x0055
            t73.f r9 = new t73.f     // Catch:{ Exception -> 0x02ad }
            r9.<init>(r7)     // Catch:{ Exception -> 0x02ad }
            java.lang.String r7 = r7.f97384c     // Catch:{ Exception -> 0x02ad }
            com.tencent.mm.plugin.appbrand.appcache.l0 r7 = r0.mo73180b(r7, r9)     // Catch:{ Exception -> 0x02ad }
            if (r7 != 0) goto L_0x00a9
            java.lang.String r0 = "matchResource failed readPkg null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)     // Catch:{ Exception -> 0x02ad }
            goto L_0x0055
        L_0x00a9:
            int r9 = com.tencent.p014mm.plugin.webview.webcompt.C44404a.m48766c(r7)     // Catch:{ Exception -> 0x02ad }
            int r0 = r0.mo73179a(r2)     // Catch:{ Exception -> 0x02ad }
            if (r9 >= r0) goto L_0x00d0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02ad }
            r3.<init>()     // Catch:{ Exception -> 0x02ad }
            java.lang.String r4 = "matchResource fail, pkgVersion="
            r3.append(r4)     // Catch:{ Exception -> 0x02ad }
            r3.append(r9)     // Catch:{ Exception -> 0x02ad }
            java.lang.String r4 = ", minPkgVersion="
            r3.append(r4)     // Catch:{ Exception -> 0x02ad }
            r3.append(r0)     // Catch:{ Exception -> 0x02ad }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x02ad }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)     // Catch:{ Exception -> 0x02ad }
            goto L_0x0055
        L_0x00d0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02ad }
            r0.<init>()     // Catch:{ Exception -> 0x02ad }
            r0.append(r6)     // Catch:{ Exception -> 0x02ad }
            java.lang.String r12 = r8.getHost()     // Catch:{ Exception -> 0x02ad }
            r0.append(r12)     // Catch:{ Exception -> 0x02ad }
            java.lang.String r12 = r8.getPath()     // Catch:{ Exception -> 0x02ad }
            r0.append(r12)     // Catch:{ Exception -> 0x02ad }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02ad }
            com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info r0 = r7.openReadPartialInfo(r0)     // Catch:{ Exception -> 0x02ad }
            if (r0 != 0) goto L_0x0152
            o90.d<java.lang.String, c30.g> r12 = s73.C48255c.f129276A     // Catch:{ Exception -> 0x02ad }
            java.lang.String r13 = r7.mo63190c()     // Catch:{ Exception -> 0x02ad }
            java.lang.Object r12 = r12.mo139556b(r13)     // Catch:{ Exception -> 0x02ad }
            c30.g r12 = (c30.C104289g) r12     // Catch:{ Exception -> 0x02ad }
            if (r12 != 0) goto L_0x0112
            c30.g r12 = new c30.g     // Catch:{ Exception -> 0x02ad }
            java.lang.String r13 = "/config.json"
            java.lang.String r13 = com.tencent.p014mm.plugin.appbrand.appcache.C81291m0.m99666b(r7, r13)     // Catch:{ Exception -> 0x02ad }
            r12.<init>((java.lang.String) r13)     // Catch:{ Exception -> 0x02ad }
            o90.d<java.lang.String, c30.g> r13 = s73.C48255c.f129276A     // Catch:{ Exception -> 0x02ad }
            java.lang.String r14 = r7.mo63190c()     // Catch:{ Exception -> 0x02ad }
            r13.mo139557c(r14, r12)     // Catch:{ Exception -> 0x02ad }
        L_0x0112:
            java.lang.String r13 = "file"
            c30.g r12 = r12.optJSONObject(r13)     // Catch:{ Exception -> 0x02ad }
            if (r12 == 0) goto L_0x0128
            c30.g r12 = r12.optJSONObject(r3)     // Catch:{ Exception -> 0x02ad }
            if (r12 == 0) goto L_0x0128
            java.lang.String r13 = "path"
            java.lang.String r12 = r12.optString(r13)     // Catch:{ Exception -> 0x02ad }
            goto L_0x0129
        L_0x0128:
            r12 = 0
        L_0x0129:
            if (r12 != 0) goto L_0x012d
            r12 = r18
        L_0x012d:
            int r13 = r12.length()     // Catch:{ Exception -> 0x02ad }
            if (r13 <= 0) goto L_0x0135
            r13 = 1
            goto L_0x0136
        L_0x0135:
            r13 = 0
        L_0x0136:
            if (r13 == 0) goto L_0x0152
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02ad }
            r0.<init>()     // Catch:{ Exception -> 0x02ad }
            r0.append(r6)     // Catch:{ Exception -> 0x02ad }
            java.lang.String r6 = r8.getHost()     // Catch:{ Exception -> 0x02ad }
            r0.append(r6)     // Catch:{ Exception -> 0x02ad }
            r0.append(r12)     // Catch:{ Exception -> 0x02ad }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02ad }
            com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info r0 = r7.openReadPartialInfo(r0)     // Catch:{ Exception -> 0x02ad }
        L_0x0152:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x02ad }
            boolean r6 = gy3.C87412m.m108589b(r4, r6)     // Catch:{ Exception -> 0x02ad }
            java.lang.String r12 = ", pkgVersion: "
            java.lang.String r13 = "matchResource appId: "
            if (r6 == 0) goto L_0x0190
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02ad }
            r6.<init>()     // Catch:{ Exception -> 0x02ad }
            r6.append(r13)     // Catch:{ Exception -> 0x02ad }
            r6.append(r2)     // Catch:{ Exception -> 0x02ad }
            r6.append(r11)     // Catch:{ Exception -> 0x02ad }
            r6.append(r4)     // Catch:{ Exception -> 0x02ad }
            java.lang.String r14 = ", resInfo: "
            r6.append(r14)     // Catch:{ Exception -> 0x02ad }
            r6.append(r0)     // Catch:{ Exception -> 0x02ad }
            r6.append(r12)     // Catch:{ Exception -> 0x02ad }
            r6.append(r9)     // Catch:{ Exception -> 0x02ad }
            r6.append(r10)     // Catch:{ Exception -> 0x02ad }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x02ad }
            r20 = r11
            r14 = 1
            java.lang.Object[] r11 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x0240 }
            r14 = 0
            r11[r14] = r3     // Catch:{ Exception -> 0x0240 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r6, r11)     // Catch:{ Exception -> 0x0240 }
            goto L_0x0192
        L_0x0190:
            r20 = r11
        L_0x0192:
            if (r0 == 0) goto L_0x02c5
            java.lang.String r6 = r8.toString()     // Catch:{ Exception -> 0x0240 }
            java.lang.String r6 = android.webkit.MimeTypeMap.getFileExtensionFromUrl(r6)     // Catch:{ Exception -> 0x0240 }
            if (r6 == 0) goto L_0x01a8
            android.webkit.MimeTypeMap r11 = android.webkit.MimeTypeMap.getSingleton()     // Catch:{ Exception -> 0x0240 }
            java.lang.String r6 = r11.getMimeTypeFromExtension(r6)     // Catch:{ Exception -> 0x0240 }
            if (r6 != 0) goto L_0x01be
        L_0x01a8:
            java.lang.String r6 = r8.getPath()     // Catch:{ Exception -> 0x0240 }
            if (r6 == 0) goto L_0x01bd
            java.lang.String r8 = "."
            java.lang.String r6 = z04.C112550d0.m153794d0(r6, r8, r6)     // Catch:{ Exception -> 0x0240 }
            java.util.Map<java.lang.String, java.lang.String> r8 = t73.C48558d.f129905R     // Catch:{ Exception -> 0x0240 }
            java.lang.Object r6 = r8.get(r6)     // Catch:{ Exception -> 0x0240 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0240 }
            goto L_0x01be
        L_0x01bd:
            r6 = 0
        L_0x01be:
            if (r6 != 0) goto L_0x01c3
            java.lang.String r6 = "text/plain"
        L_0x01c3:
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ Exception -> 0x0240 }
            r8.<init>()     // Catch:{ Exception -> 0x0240 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0240 }
            r11.<init>()     // Catch:{ Exception -> 0x0240 }
            java.lang.String r14 = r0.f238570e     // Catch:{ Exception -> 0x0240 }
            r11.append(r14)     // Catch:{ Exception -> 0x0240 }
            java.lang.String r14 = ".headers"
            r11.append(r14)     // Catch:{ Exception -> 0x0240 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0240 }
            com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info r11 = r7.openReadPartialInfo(r11)     // Catch:{ Exception -> 0x0240 }
            if (r11 == 0) goto L_0x0245
            java.lang.String r11 = r11.f238570e     // Catch:{ Exception -> 0x0240 }
            java.lang.String r14 = "it.fileName"
            gy3.C87412m.m108593f(r11, r14)     // Catch:{ Exception -> 0x0240 }
            java.lang.String r11 = com.tencent.p014mm.plugin.appbrand.appcache.C81291m0.m99666b(r7, r11)     // Catch:{ Exception -> 0x0240 }
            java.util.List r11 = z04.C112550d0.m153773I(r11)     // Catch:{ Exception -> 0x0240 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ Exception -> 0x0240 }
        L_0x01f4:
            boolean r14 = r11.hasNext()     // Catch:{ Exception -> 0x0240 }
            if (r14 == 0) goto L_0x0243
            java.lang.Object r14 = r11.next()     // Catch:{ Exception -> 0x0240 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Exception -> 0x0240 }
            java.lang.String r21 = z04.C112550d0.m153795e0(r14, r5, r14)     // Catch:{ Exception -> 0x0240 }
            java.lang.CharSequence r21 = z04.C112550d0.m153799i0(r21)     // Catch:{ Exception -> 0x0240 }
            java.lang.String r21 = r21.toString()     // Catch:{ Exception -> 0x0240 }
            r22 = r6
            java.lang.String r6 = r21.toLowerCase()     // Catch:{ Exception -> 0x0240 }
            r21 = r11
            java.lang.String r11 = "this as java.lang.String).toLowerCase()"
            gy3.C87412m.m108593f(r6, r11)     // Catch:{ Exception -> 0x0240 }
            java.lang.String r11 = z04.C112550d0.m153791a0(r14, r5, r14)     // Catch:{ Exception -> 0x0240 }
            java.lang.CharSequence r11 = z04.C112550d0.m153799i0(r11)     // Catch:{ Exception -> 0x0240 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0240 }
            java.util.Set<java.lang.String> r14 = t73.C48558d.f129897I     // Catch:{ Exception -> 0x0240 }
            boolean r14 = r14.contains(r6)     // Catch:{ Exception -> 0x0240 }
            if (r14 != 0) goto L_0x0231
            r8.put(r6, r11)     // Catch:{ Exception -> 0x0240 }
        L_0x0231:
            java.lang.String r14 = "content-type"
            boolean r6 = gy3.C87412m.m108589b(r6, r14)     // Catch:{ Exception -> 0x0240 }
            if (r6 == 0) goto L_0x023b
            r6 = r11
            goto L_0x023d
        L_0x023b:
            r6 = r22
        L_0x023d:
            r11 = r21
            goto L_0x01f4
        L_0x0240:
            r0 = move-exception
            goto L_0x02bb
        L_0x0243:
            r22 = r6
        L_0x0245:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0240 }
            gy3.C87412m.m108589b(r4, r5)     // Catch:{ Exception -> 0x0240 }
            t73.d$b r4 = t73.C48558d.f129896H     // Catch:{ Exception -> 0x0240 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0240 }
            r4.<init>()     // Catch:{ Exception -> 0x0240 }
            r4.append(r13)     // Catch:{ Exception -> 0x0240 }
            r4.append(r2)     // Catch:{ Exception -> 0x0240 }
            java.lang.String r5 = ", fileName: "
            r4.append(r5)     // Catch:{ Exception -> 0x0240 }
            java.lang.String r5 = r0.f238570e     // Catch:{ Exception -> 0x0240 }
            r4.append(r5)     // Catch:{ Exception -> 0x0240 }
            r4.append(r12)     // Catch:{ Exception -> 0x0240 }
            r4.append(r9)     // Catch:{ Exception -> 0x0240 }
            r4.append(r10)     // Catch:{ Exception -> 0x0240 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0240 }
            r5 = 1
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0240 }
            r5 = 0
            r11[r5] = r3     // Catch:{ Exception -> 0x0240 }
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r15, r4, r11)     // Catch:{ Exception -> 0x0240 }
            ex0.h$e r3 = new ex0.h$e     // Catch:{ Exception -> 0x0240 }
            r3.<init>()     // Catch:{ Exception -> 0x0240 }
            r3.f123533c = r9     // Catch:{ Exception -> 0x0240 }
            q73.c0 r4 = q73.C35796c0.f95588a     // Catch:{ Exception -> 0x0240 }
            te3.dn r4 = r4.mo60405f(r2)     // Catch:{ Exception -> 0x0240 }
            if (r4 == 0) goto L_0x0289
            java.lang.String r4 = r4.f132428i     // Catch:{ Exception -> 0x0240 }
            goto L_0x028a
        L_0x0289:
            r4 = 0
        L_0x028a:
            r3.f123534d = r4     // Catch:{ Exception -> 0x0240 }
            java.lang.String r0 = r0.f238570e     // Catch:{ Exception -> 0x0240 }
            r3.f123532b = r0     // Catch:{ Exception -> 0x0240 }
            com.tencent.xweb.WebResourceResponse r4 = new com.tencent.xweb.WebResourceResponse     // Catch:{ Exception -> 0x0240 }
            r23 = 0
            r24 = 200(0xc8, float:2.8E-43)
            java.lang.String r25 = "OK"
            java.io.InputStream r27 = r7.mo63188a(r0)     // Catch:{ Exception -> 0x0240 }
            r21 = r4
            r22 = r6
            r26 = r8
            r21.<init>(r22, r23, r24, r25, r26, r27)     // Catch:{ Exception -> 0x0240 }
            r3.f123531a = r4     // Catch:{ Exception -> 0x0240 }
            rx3.l r0 = new rx3.l     // Catch:{ Exception -> 0x0240 }
            r0.<init>(r3, r6)     // Catch:{ Exception -> 0x0240 }
            goto L_0x02c6
        L_0x02ad:
            r0 = move-exception
        L_0x02ae:
            r20 = r11
            goto L_0x02bb
        L_0x02b1:
            r0 = move-exception
            r19 = r7
            goto L_0x02ae
        L_0x02b5:
            r0 = move-exception
            r19 = r7
            r18 = r9
            goto L_0x02ae
        L_0x02bb:
            t73.d$b r3 = t73.C48558d.f129896H
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r3 = "matchResource exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r0, r3, r4)
        L_0x02c5:
            r0 = 0
        L_0x02c6:
            java.lang.String r3 = ", "
            java.lang.String r4 = "MicroMsg.PrefetchTarget"
            if (r0 == 0) goto L_0x03a6
            A r5 = r0.f38555d
            if (r5 == 0) goto L_0x02d2
            r5 = 1
            goto L_0x02d3
        L_0x02d2:
            r5 = 0
        L_0x02d3:
            if (r5 == 0) goto L_0x02d6
            goto L_0x02d7
        L_0x02d6:
            r0 = 0
        L_0x02d7:
            if (r0 == 0) goto L_0x03a6
            A r5 = r0.f38555d
            ex0.h$e r5 = (ex0.C45700h.C45705e) r5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "matchResource get response #"
            r6.append(r7)
            java.lang.String r7 = r1.f124920b
            r6.append(r7)
            java.lang.String r7 = ", contentType: "
            r6.append(r7)
            B r7 = r0.f38556e
            java.lang.String r7 = (java.lang.String) r7
            r6.append(r7)
            java.lang.String r7 = ", appId: "
            r6.append(r7)
            rx3.g r7 = r1.f124932n
            rx3.n r7 = (rx3.C36570n) r7
            java.lang.Object r7 = r7.getValue()
            java.lang.String r7 = (java.lang.String) r7
            r6.append(r7)
            java.lang.String r7 = ", pkgFileKey: "
            r6.append(r7)
            r6.append(r2)
            r2 = r20
            r6.append(r2)
            java.lang.Boolean r2 = r1.f124925g
            r6.append(r2)
            r6.append(r3)
            java.lang.String r2 = r1.f124923e
            r6.append(r2)
            r6.append(r10)
            java.lang.String r2 = r6.toString()
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r6 = r1.f124919a
            r7 = 0
            r3[r7] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r3)
            ex0.h$c r2 = new ex0.h$c
            r2.<init>()
            rx3.g r3 = r1.f124933o
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            r2.f123515a = r3
            java.lang.String r3 = r1.f124920b
            r2.f123517c = r3
            java.lang.String r3 = r33.mo71762d()
            r2.f123516b = r3
            B r0 = r0.f38556e
            java.lang.String r0 = (java.lang.String) r0
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0$b r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0.m43987e(r0)
            java.lang.String r0 = r0.f109383d
            r2.f123520f = r0
            long r3 = r33.mo71779u()
            r2.f123519e = r3
            int r0 = r33.mo71763e()
            r2.f123518d = r0
            int r0 = r33.mo71777s()
            r2.f123522h = r0
            int r0 = r33.mo71768j()
            r2.f123523i = r0
            r2.f123521g = r5
            rx3.g r0 = r1.f124932n
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r2.f123524j = r0
            rx3.g r0 = r1.f124938t
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            pe3.b r0 = (pe3.C89349b) r0
            r2.f123525k = r0
            java.lang.String r0 = r33.mo71774p()
            r2.f123526l = r0
            rx3.g r0 = r1.f124940v
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            pe3.b r0 = (pe3.C89349b) r0
            java.lang.String r0 = sf0.C48374j0.m53713b(r0)
            r2.f123528n = r0
            return r2
        L_0x03a6:
            r2 = r20
            boolean r0 = r33.mo71781w()
            if (r0 == 0) goto L_0x0582
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "fetch cached: #"
            r0.append(r5)
            java.lang.String r5 = r1.f124920b
            r0.append(r5)
            r0.append(r2)
            java.lang.Boolean r2 = r1.f124925g
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r1.f124919a
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0$b r0 = r33.mo71778t()
            int[] r2 = iy0.C46353a.C46354a.f124943a
            int r0 = r0.ordinal()
            r0 = r2[r0]
            r2 = 1
            if (r0 != r2) goto L_0x057d
            boolean r0 = r33.mo71783y()
            if (r0 == 0) goto L_0x0436
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "HTML redirect, location:"
            r0.append(r2)
            java.lang.String r2 = r33.mo71771m()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            iy0.a r0 = new iy0.a
            java.lang.String r18 = r33.mo71771m()
            java.lang.String r2 = r33.mo71771m()
            r3 = 0
            java.lang.String r19 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40714i.m43960i(r2, r3)
            t73.b r20 = t73.C48558d.f129901M
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0 r2 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0.f109363a
            r2.getClass()
            com.tencent.mm.sdk.platformtools.MMKVSlotManager r21 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0.f109365c
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 2032(0x7f0, float:2.847E-42)
            r30 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            ex0.h$c r12 = r0.mo71776r()
            goto L_0x0581
        L_0x0436:
            java.lang.String r0 = r1.f124919a
            rx3.g r2 = r1.f124941w
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r5 = r19
            gy3.C87412m.m108594g(r0, r5)
            te3.m25 r0 = iy0.C46368o.C46369a.m51704a(r0, r2)
            if (r0 == 0) goto L_0x044f
            r13 = 1
            goto L_0x0450
        L_0x044f:
            r13 = 0
        L_0x0450:
            if (r13 == 0) goto L_0x0538
            boolean r0 = r33.mo71782x()
            if (r0 != 0) goto L_0x0487
            java.util.HashMap r0 = r33.mo71770l()
            java.lang.String r2 = "set-cookie"
            java.lang.Object r0 = r0.get(r2)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0481
            java.util.Iterator r0 = r0.iterator()
        L_0x046b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0481
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            com.tencent.xweb.CookieManager r3 = com.tencent.xweb.CookieManager.getInstance()
            java.lang.String r4 = r1.f124919a
            r3.setCookie(r4, r2)
            goto L_0x046b
        L_0x0481:
            ex0.h$c r12 = r33.mo71760b()
            goto L_0x0581
        L_0x0487:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "getResponse doc expired refresh cached: #"
            r0.append(r2)
            java.lang.String r2 = r1.f124920b
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r1.f124919a
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
            rx3.g r0 = r1.f124937s
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x057b
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0$b r0 = r33.mo71778t()
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0$b r2 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0.C40719b.HTML
            if (r0 != r2) goto L_0x057b
            long r2 = r33.mo71764f()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x057b
            int r0 = r33.mo71772n()
            if (r0 <= 0) goto L_0x057b
            long r2 = r33.mo71764f()
            int r0 = r33.mo71772n()
            r4 = 60
            int r0 = r0 - r4
            int r0 = java.lang.Math.max(r0, r4)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMSlotKt.isExpire((long) r2, (int) r0)
            if (r0 == 0) goto L_0x057b
            int r0 = r33.mo71768j()
            r2 = 10
            r4 = 1
            i93.C46206e.m51496c(r2, r4, r0)
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0 r19 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0.f109363a
            r20 = -1
            java.lang.String r0 = r1.f124919a
            java.util.HashMap r2 = r33.mo71770l()
            java.lang.String r3 = "x-wx-client-prefetch-url"
            java.lang.Object r2 = r2.get(r3)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x050e
            java.lang.Object r2 = sx3.C110818d0.m150914L(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x050b
            goto L_0x050e
        L_0x050b:
            r23 = r2
            goto L_0x0510
        L_0x050e:
            r23 = r18
        L_0x0510:
            rx3.g r2 = r1.f124932n
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            r24 = r2
            java.lang.String r24 = (java.lang.String) r24
            int r27 = r33.mo71763e()
            int r28 = r33.mo71777s()
            int r29 = r33.mo71768j()
            r25 = 0
            r26 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r22 = r0
            r19.mo63619l(r20, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            goto L_0x057b
        L_0x0538:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "getResponse preauth expired preauth: #"
            r0.append(r2)
            java.lang.String r2 = r1.f124920b
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r1.f124919a
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
            java.lang.String r0 = r1.f124919a
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            rx3.g r2 = r1.f124941w
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            r25 = r2
            java.lang.String r25 = (java.lang.String) r25
            r26 = 254(0xfe, float:3.56E-43)
            r27 = 0
            r16 = r0
            com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0.m43990i(r16, r17, r18, r19, r20, r21, r22, r23, r25, r26, r27)
        L_0x057b:
            r12 = 0
            goto L_0x0581
        L_0x057d:
            ex0.h$c r12 = r33.mo71760b()
        L_0x0581:
            return r12
        L_0x0582:
            r2 = 1
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = r1.f124919a
            r3 = 0
            r0[r3] = r2
            java.lang.String r2 = "matchResource get response null, url: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r2, r0)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: iy0.C46353a.mo71776r():ex0.h$c");
    }

    /* renamed from: s */
    public final int mo71777s() {
        return ((Number) ((C36570n) this.f124936r).getValue()).intValue();
    }

    /* renamed from: t */
    public final C40717k0.C40719b mo71778t() {
        String str;
        List list = mo71770l().get("x-wx-client-prefetch-type");
        if (!(list == null || (str = (String) C110818d0.m150914L(list)) == null)) {
            String upperCase = str.toUpperCase();
            C87412m.m108593f(upperCase, "this as java.lang.String).toUpperCase()");
            C40717k0.C40719b valueOf = C40717k0.C40719b.valueOf(upperCase);
            if (valueOf != null) {
                return valueOf;
            }
        }
        return C40717k0.C40719b.HTML;
    }

    /* renamed from: u */
    public final long mo71779u() {
        String str;
        List list = mo71770l().get("x-wx-version");
        if (list == null || (str = (String) C110818d0.m150914L(list)) == null) {
            return -1;
        }
        return Long.parseLong(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        r0 = (java.lang.String) sx3.C110818d0.m150914L(r0);
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo71780v() {
        /*
            r2 = this;
            java.util.HashMap r0 = r2.mo71770l()
            java.lang.String r1 = "x-wx-etag"
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0017
            java.lang.Object r0 = sx3.C110818d0.m150914L(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0019
        L_0x0017:
            java.lang.String r0 = ""
        L_0x0019:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: iy0.C46353a.mo71780v():java.lang.String");
    }

    /* renamed from: w */
    public final boolean mo71781w() {
        C48556b bVar;
        List list = mo71770l().get("status");
        String str = list != null ? (String) C110818d0.m150916N(list) : null;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case 49586:
                if (str.equals("200") && (bVar = this.f124921c) != null) {
                    return bVar.mo73171A(mo71762d());
                }
                return false;
            case 50548:
                if (!str.equals("301")) {
                    return false;
                }
                break;
            case 50549:
                if (!str.equals("302")) {
                    return false;
                }
                break;
            default:
                return false;
        }
        return !C112551y.m153811k(mo71771m());
    }

    /* renamed from: x */
    public final boolean mo71782x() {
        return mo71764f() > 0 && mo71772n() > 0 && MMSlotKt.isExpire(mo71764f(), mo71772n());
    }

    /* renamed from: y */
    public final boolean mo71783y() {
        List list = mo71770l().get("status");
        String str = list != null ? (String) C110818d0.m150914L(list) : null;
        if (C87412m.m108589b(str, "301")) {
            return true;
        }
        return C87412m.m108589b(str, "302");
    }

    /* renamed from: z */
    public final void mo71784z(C40717k0.C40719b bVar, String str) {
        C87412m.m108594g(bVar, "type");
        C87412m.m108594g(str, "host");
        String valueOf = String.valueOf(MMSlotKt.now());
        mo71770l().put("x-wx-client-cache-time", C26236u.m33719b(valueOf));
        mo71770l().put("x-wx-client-check-update-time", C26236u.m33719b(valueOf));
        mo71770l().put("x-wx-client-prefetch-url", C26236u.m33719b(this.f124919a));
        if (!C112551y.m153811k(str)) {
            mo71770l().put("x-wx-client-prefetch-host", C26236u.m33719b(str));
        }
        mo71770l().put("x-wx-client-prefetch-type", C26236u.m33719b(bVar.f109383d));
        l25 l25 = new l25();
        LinkedList<k25> linkedList = l25.f137140d;
        HashMap<String, List<String>> l = mo71770l();
        ArrayList arrayList = new ArrayList(l.size());
        for (Map.Entry next : l.entrySet()) {
            String str2 = (String) next.getKey();
            List list = (List) next.getValue();
            k25 k25 = new k25();
            String lowerCase = str2.toLowerCase();
            C87412m.m108593f(lowerCase, "this as java.lang.String).toLowerCase()");
            int hashCode = lowerCase.hashCode();
            if (hashCode != 785670158) {
                if (hashCode != 1237214767) {
                    if (hashCode == 1901043637 && lowerCase.equals(FirebaseAnalytics.C113379b.LOCATION)) {
                        str2 = FirebaseAnalytics.C113379b.LOCATION;
                        k25.f136526d = str2;
                        k25.f136527e.addAll(list);
                        arrayList.add(k25);
                    }
                } else if (lowerCase.equals("set-cookie")) {
                    str2 = "set-cookie";
                    k25.f136526d = str2;
                    k25.f136527e.addAll(list);
                    arrayList.add(k25);
                }
            } else if (lowerCase.equals("content-type")) {
                str2 = "content-type";
                k25.f136526d = str2;
                k25.f136527e.addAll(list);
                arrayList.add(k25);
            }
            if (C112551y.m153809i(str2, "max-age", false) || C112551y.m153809i(str2, "x-wx-max-cache", false) || C112551y.m153809i(str2, "x-wx-check-update-time-interval", false) || C112551y.m153809i(str2, "etag", false) || C112551y.m153809i(str2, "x-wx-etag", false) || C112551y.m153809i(str2, "x-wx-version", false)) {
                Log.m105924i("MicroMsg.PrefetchTarget", "saveHeaders key: " + str2 + ", value: " + list);
                k25.f136526d = str2;
                k25.f136527e.addAll(list);
                arrayList.add(k25);
            } else {
                k25.f136526d = str2;
                k25.f136527e.addAll(list);
                arrayList.add(k25);
            }
        }
        linkedList.addAll(arrayList);
        ((MultiProcessMMKV) this.f124922d.getSlotForWrite()).encode(mo71762d(), l25.toByteArray());
        Log.m105926v("MicroMsg.PrefetchTarget", "saveHeaders " + bVar + " : webId:" + this.f124920b + ", bizId:" + mo71762d() + ", header size:" + mo71770l().size());
    }
}
