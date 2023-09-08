package uk1;

import al1.C54130j;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import cl1.C54963d0;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.ratio.RatioLayout;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import dl1.C58321a;
import fj1.C45795b;
import fy3.C32224a;
import gi1.C32458d;
import gi1.C59463a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import iq3.C60600b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import mi1.C61482c;
import o40.C61926c;
import org.json.JSONArray;
import org.json.JSONObject;
import rx3.C13598b0;
import te3.C64265bq2;
import te3.C64756up2;
import ti1.C64941c;
import w50.C65928b;

/* renamed from: uk1.j */
public final class C65409j extends C60600b<C59463a> {

    /* renamed from: v */
    public static int f188221v;

    /* renamed from: w */
    public static JSONObject f188222w;

    /* renamed from: b */
    public final int f188223b;

    /* renamed from: c */
    public final String f188224c;

    /* renamed from: d */
    public C54130j f188225d;

    /* renamed from: e */
    public ArrayList<C54130j> f188226e;

    /* renamed from: f */
    public LinkedList<C59463a> f188227f;

    /* renamed from: g */
    public JSONArray f188228g;

    /* renamed from: h */
    public boolean f188229h;

    /* renamed from: i */
    public Bitmap f188230i;

    /* renamed from: j */
    public C64756up2 f188231j;

    /* renamed from: k */
    public boolean f188232k;

    /* renamed from: l */
    public C58321a f188233l;

    /* renamed from: m */
    public Point f188234m;

    /* renamed from: n */
    public String f188235n;

    /* renamed from: o */
    public String f188236o;

    /* renamed from: p */
    public int f188237p;

    /* renamed from: q */
    public ArrayList<RectF> f188238q;

    /* renamed from: r */
    public Boolean f188239r;

    /* renamed from: s */
    public C32458d f188240s;

    /* renamed from: t */
    public C45795b f188241t;

    /* renamed from: u */
    public boolean f188242u;

    /* renamed from: uk1.j$a */
    public static final class C65410a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ JSONObject f188243d;

        /* renamed from: e */
        public final /* synthetic */ C65409j f188244e;

        /* renamed from: f */
        public final /* synthetic */ C45795b f188245f;

        /* renamed from: g */
        public final /* synthetic */ boolean f188246g;

        /* renamed from: h */
        public final /* synthetic */ int f188247h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65410a(JSONObject jSONObject, C65409j jVar, C45795b bVar, boolean z, int i) {
            super(0);
            this.f188243d = jSONObject;
            this.f188244e = jVar;
            this.f188245f = bVar;
            this.f188246g = z;
            this.f188247h = i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:105:0x0244 A[EDGE_INSN: B:105:0x0244->B:83:0x0244 ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x0201  */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x0262  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r15 = this;
                java.lang.Class<cl1.o> r0 = cl1.C54991o.class
                java.lang.Class<cl1.d0> r1 = cl1.C54963d0.class
                org.json.JSONObject r2 = r15.f188243d
                r3 = 0
                if (r2 == 0) goto L_0x0010
                java.lang.String r4 = "m"
                int r2 = r2.optInt(r4)
                goto L_0x0011
            L_0x0010:
                r2 = 0
            L_0x0011:
                uk1.j r4 = r15.f188244e
                r5 = 1
                if (r2 != r5) goto L_0x0018
                r6 = 1
                goto L_0x0019
            L_0x0018:
                r6 = 0
            L_0x0019:
                r4.f188232k = r6
                org.json.JSONObject r4 = r15.f188243d
                r6 = 0
                if (r4 == 0) goto L_0x0033
                java.lang.String r7 = "a"
                java.lang.String r4 = r4.optString(r7)
                if (r4 == 0) goto L_0x0033
                java.lang.Float r4 = z04.C66730w.m78730d(r4)
                if (r4 == 0) goto L_0x0033
                float r4 = r4.floatValue()
                goto L_0x0034
            L_0x0033:
                r4 = 0
            L_0x0034:
                uk1.j r7 = r15.f188244e
                fj1.b r8 = r15.f188245f
                r7.getClass()
                androidx.lifecycle.i0 r9 = r8.mo71262a(r0)
                cl1.o r9 = (cl1.C54991o) r9
                com.tencent.mm.protocal.protobuf.FinderObject r9 = r9.f154341n
                r10 = 0
                if (r9 == 0) goto L_0x0051
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r9 = r9.objectDesc
                if (r9 == 0) goto L_0x0051
                te3.px0 r9 = r9.liveDesc
                if (r9 == 0) goto L_0x0051
                java.lang.String r9 = r9.f184911d
                goto L_0x0052
            L_0x0051:
                r9 = r10
            L_0x0052:
                if (r9 == 0) goto L_0x005d
                int r11 = r9.length()
                if (r11 != 0) goto L_0x005b
                goto L_0x005d
            L_0x005b:
                r11 = 0
                goto L_0x005e
            L_0x005d:
                r11 = 1
            L_0x005e:
                java.lang.String r12 = ""
                if (r11 == 0) goto L_0x0081
                androidx.lifecycle.i0 r9 = r8.mo71262a(r0)
                cl1.o r9 = (cl1.C54991o) r9
                com.tencent.mm.protocal.protobuf.FinderObject r9 = r9.f154341n
                if (r9 == 0) goto L_0x0080
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r9 = r9.objectDesc
                if (r9 == 0) goto L_0x0080
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r9 = r9.media
                if (r9 == 0) goto L_0x0080
                java.lang.Object r9 = sx3.C110818d0.m150916N(r9)
                com.tencent.mm.protocal.protobuf.FinderMedia r9 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r9
                if (r9 == 0) goto L_0x0080
                java.lang.String r9 = r9.url
                if (r9 != 0) goto L_0x0081
            L_0x0080:
                r9 = r12
            L_0x0081:
                androidx.lifecycle.i0 r8 = r8.mo71262a(r0)
                cl1.o r8 = (cl1.C54991o) r8
                java.lang.String r8 = r8.mo76010l3(r9)
                if (r8 != 0) goto L_0x008e
                goto L_0x008f
            L_0x008e:
                r12 = r8
            L_0x008f:
                r7.f188236o = r12
                uk1.j r7 = r15.f188244e
                fj1.b r8 = r15.f188245f
                androidx.lifecycle.i0 r8 = r8.mo71262a(r1)
                cl1.d0 r8 = (cl1.C54963d0) r8
                java.util.List<al1.j> r8 = r8.f154074q
                java.lang.String r9 = "buContext.business(LiveL…).audienceLinkMicUserList"
                gy3.C87412m.m108593f(r8, r9)
                fj1.b r9 = r15.f188245f
                monitor-enter(r8)
                java.util.Iterator r11 = r8.iterator()     // Catch:{ all -> 0x02e0 }
            L_0x00a9:
                boolean r12 = r11.hasNext()     // Catch:{ all -> 0x02e0 }
                if (r12 == 0) goto L_0x00c9
                java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x02e0 }
                r13 = r12
                al1.j r13 = (al1.C54130j) r13     // Catch:{ all -> 0x02e0 }
                java.lang.String r13 = r13.f151997a     // Catch:{ all -> 0x02e0 }
                androidx.lifecycle.i0 r14 = r9.mo71262a(r0)     // Catch:{ all -> 0x02e0 }
                cl1.o r14 = (cl1.C54991o) r14     // Catch:{ all -> 0x02e0 }
                java.lang.String r14 = r14.mo76015n4()     // Catch:{ all -> 0x02e0 }
                boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r13, (java.lang.String) r14)     // Catch:{ all -> 0x02e0 }
                if (r13 == 0) goto L_0x00a9
                goto L_0x00ca
            L_0x00c9:
                r12 = r10
            L_0x00ca:
                monitor-exit(r8)
                if (r12 == 0) goto L_0x00cf
                r8 = 1
                goto L_0x00d0
            L_0x00cf:
                r8 = 0
            L_0x00d0:
                r7.f188229h = r8
                uk1.j r7 = r15.f188244e
                java.lang.String r7 = r7.f188224c
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "refreshLayout sdkCreateUserId: "
                r8.append(r9)
                uk1.j r9 = r15.f188244e
                java.lang.String r9 = r9.f188235n
                r8.append(r9)
                java.lang.String r9 = " videoRate: "
                r8.append(r9)
                r8.append(r4)
                java.lang.String r9 = " windowSize: "
                r8.append(r9)
                uk1.j r9 = r15.f188244e
                android.graphics.Point r9 = r9.f188234m
                r8.append(r9)
                java.lang.String r9 = " isFocusMode: "
                r8.append(r9)
                uk1.j r9 = r15.f188244e
                boolean r9 = r9.f188232k
                r8.append(r9)
                java.lang.String r9 = " isMicingByLocal:"
                r8.append(r9)
                uk1.j r9 = r15.f188244e
                boolean r9 = r9.f188229h
                r8.append(r9)
                java.lang.String r9 = ", checkDiff:"
                r8.append(r9)
                boolean r9 = r15.f188246g
                r8.append(r9)
                java.lang.String r9 = ", sourceType:"
                r8.append(r9)
                int r9 = r15.f188247h
                r8.append(r9)
                java.lang.String r9 = ", micData:"
                r8.append(r9)
                org.json.JSONObject r9 = r15.f188243d
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
                fj1.b r7 = r15.f188245f
                androidx.lifecycle.i0 r7 = r7.mo71262a(r1)
                cl1.d0 r7 = (cl1.C54963d0) r7
                al1.j r7 = r7.f154073p
                fj1.b r8 = r15.f188245f
                androidx.lifecycle.i0 r8 = r8.mo71262a(r1)
                cl1.d0 r8 = (cl1.C54963d0) r8
                java.util.List<al1.j> r8 = r8.f154074q
                uk1.j r9 = r15.f188244e
                r9.f188225d = r7
                java.util.ArrayList<al1.j> r7 = r9.f188226e
                r7.clear()
                uk1.j r7 = r15.f188244e
                java.util.ArrayList<al1.j> r7 = r7.f188226e
                r7.addAll(r8)
                uk1.j r7 = r15.f188244e
                r7.getClass()
                r7 = 2
                if (r2 == 0) goto L_0x01a2
                if (r2 == r5) goto L_0x01a2
                if (r2 == r7) goto L_0x016d
                r5 = 3
                if (r2 == r5) goto L_0x016d
                goto L_0x028d
            L_0x016d:
                uk1.j r5 = r15.f188244e
                org.json.JSONObject r6 = r15.f188243d
                fj1.b r7 = r15.f188245f
                r5.getClass()
                mi1.c r8 = mi1.C61482c.f174809a
                androidx.lifecycle.i0 r1 = r7.mo71262a(r1)
                cl1.d0 r1 = (cl1.C54963d0) r1
                al1.j r1 = r1.mo75930m3()
                uk1.h r9 = new uk1.h
                r9.<init>(r7)
                java.util.LinkedList r1 = r8.mo86458e(r6, r1, r9)
                gi1.d r6 = new gi1.d
                r6.<init>(r1, r2, r4)
                r5.f188240s = r6
                r5.f188227f = r1
                r8.mo86461h(r1)
                r5.f188237p = r3
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r5.f188238q = r1
                goto L_0x028d
            L_0x01a2:
                uk1.j r8 = r15.f188244e
                org.json.JSONObject r9 = r15.f188243d
                fj1.b r11 = r15.f188245f
                r8.getClass()
                mi1.c r12 = mi1.C61482c.f174809a
                androidx.lifecycle.i0 r1 = r11.mo71262a(r1)
                cl1.d0 r1 = (cl1.C54963d0) r1
                al1.j r1 = r1.mo75930m3()
                uk1.i r13 = new uk1.i
                r13.<init>(r11)
                java.util.LinkedList r1 = r12.mo86460g(r9, r1, r13)
                gi1.d r9 = new gi1.d
                r9.<init>(r1, r2, r4)
                r8.f188240s = r9
                boolean r9 = r8.f188232k
                if (r9 == 0) goto L_0x01e3
                int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r6 != 0) goto L_0x01d0
                goto L_0x01d1
            L_0x01d0:
                r5 = 0
            L_0x01d1:
                if (r5 == 0) goto L_0x01d4
                goto L_0x01e3
            L_0x01d4:
                android.graphics.Point r5 = r8.f188234m
                java.util.LinkedHashMap r4 = r12.mo86456c(r11, r5, r1, r4)
                android.graphics.Point r5 = r8.f188234m
                java.util.LinkedList r1 = r12.mo86454a(r5, r1, r4)
                r8.f188227f = r1
                goto L_0x01e5
            L_0x01e3:
                r8.f188227f = r1
            L_0x01e5:
                java.util.LinkedList<gi1.a> r1 = r8.f188227f
                r12.mo86461h(r1)
                android.graphics.Point r1 = r8.f188234m
                int r4 = r1.x
                if (r4 <= 0) goto L_0x0244
                int r1 = r1.y
                if (r1 > 0) goto L_0x01f5
                goto L_0x0244
            L_0x01f5:
                java.util.LinkedList<gi1.a> r1 = r8.f188227f
                java.util.Iterator r1 = r1.iterator()
            L_0x01fb:
                boolean r4 = r1.hasNext()
                if (r4 == 0) goto L_0x0244
                java.lang.Object r4 = r1.next()
                gi1.a r4 = (gi1.C59463a) r4
                gi1.f r4 = r4.f169895b
                int r5 = r4.f169903g
                if (r5 != r7) goto L_0x01fb
                android.graphics.Point r1 = r8.f188234m
                int r1 = r1.x
                float r3 = r4.f165729a
                float r1 = (float) r1
                float r3 = r3 * r1
                float r4 = r4.f165731c
                float r4 = r4 * r1
                float r1 = r1 - r3
                float r1 = r1 - r4
                java.lang.String r5 = r8.f188224c
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r9 = "getRightOffestSize margin: "
                r6.append(r9)
                r6.append(r1)
                java.lang.String r9 = " windowWidth:"
                r6.append(r9)
                r6.append(r4)
                java.lang.String r9 = " left: "
                r6.append(r9)
                r6.append(r3)
                java.lang.String r3 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
                float r4 = r4 + r1
                int r3 = (int) r4
            L_0x0244:
                r8.f188237p = r3
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                android.graphics.Point r3 = r8.f188234m
                int r4 = r3.x
                if (r4 <= 0) goto L_0x028b
                int r3 = r3.y
                if (r3 > 0) goto L_0x0256
                goto L_0x028b
            L_0x0256:
                java.util.LinkedList<gi1.a> r5 = r8.f188227f
                java.util.Iterator r5 = r5.iterator()
            L_0x025c:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L_0x028b
                java.lang.Object r6 = r5.next()
                gi1.a r6 = (gi1.C59463a) r6
                gi1.f r6 = r6.f169895b
                int r9 = r6.f169903g
                if (r9 != r7) goto L_0x025c
                float r9 = r6.f165729a
                float r11 = (float) r4
                float r9 = r9 * r11
                float r12 = r6.f165730b
                float r13 = (float) r3
                float r12 = r12 * r13
                float r14 = r6.f165731c
                float r14 = r14 * r11
                float r6 = r6.f165732d
                float r6 = r6 * r13
                android.graphics.RectF r11 = new android.graphics.RectF
                float r14 = r14 + r9
                float r6 = r6 + r12
                r11.<init>(r9, r12, r14, r6)
                r1.add(r11)
                goto L_0x025c
            L_0x028b:
                r8.f188238q = r1
            L_0x028d:
                uk1.j r1 = r15.f188244e
                fj1.b r3 = r15.f188245f
                java.lang.Class<cl1.c0> r4 = cl1.C54949c0.class
                androidx.lifecycle.i0 r3 = r3.mo71262a(r4)
                cl1.c0 r3 = (cl1.C54949c0) r3
                uk1.j r4 = r15.f188244e
                java.util.LinkedList<gi1.a> r4 = r4.f188227f
                int r4 = r4.size()
                dl1.a r2 = r3.mo75863d3(r2, r4)
                r1.f188233l = r2
                uk1.j r1 = r15.f188244e
                org.json.JSONObject r2 = r15.f188243d
                if (r2 == 0) goto L_0x02b3
                java.lang.String r3 = "list"
                org.json.JSONArray r10 = r2.optJSONArray(r3)
            L_0x02b3:
                r1.f188228g = r10
                uk1.j r1 = r15.f188244e
                r1.getClass()
                uk1.j r1 = r15.f188244e
                fj1.b r2 = r15.f188245f
                androidx.lifecycle.i0 r2 = r2.mo71262a(r0)
                cl1.o r2 = (cl1.C54991o) r2
                android.graphics.Bitmap r2 = r2.f154254S2
                r1.f188230i = r2
                uk1.j r1 = r15.f188244e
                fj1.b r2 = r15.f188245f
                androidx.lifecycle.i0 r0 = r2.mo71262a(r0)
                cl1.o r0 = (cl1.C54991o) r0
                te3.up2 r0 = r0.mo75973N3()
                r1.f188231j = r0
                uk1.j r0 = r15.f188244e
                r0.mo85559g()
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            L_0x02e0:
                r0 = move-exception
                monitor-exit(r8)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: uk1.C65409j.C65410a.invoke():java.lang.Object");
        }
    }

    public C65409j() {
        this(0, 1, (C8480h) null);
    }

    public C65409j(int i) {
        this.f188223b = i;
        this.f188224c = "Finder.FinderMiniWindowFloatLayoutAdapter";
        this.f188226e = new ArrayList<>();
        this.f188227f = new LinkedList<>();
        this.f188233l = C58321a.NORMAL_4_MODE;
        this.f188234m = new Point(0, 0);
        this.f188235n = "";
        this.f188236o = "";
        this.f188238q = new ArrayList<>();
    }

    /* renamed from: m */
    public static /* synthetic */ void m77016m(C65409j jVar, boolean z, C45795b bVar, int i, JSONObject jSONObject, Point point, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            point = null;
        }
        jVar.mo89491l(z, bVar, i, jSONObject, point);
    }

    /* renamed from: a */
    public int mo85553a() {
        if (this.f188229h) {
            return 0;
        }
        return this.f188227f.size();
    }

    /* renamed from: b */
    public Object mo85554b(int i) {
        C59463a aVar = this.f188227f.get(i);
        C87412m.m108593f(aVar, "audienceLinkMicDataList[pos]");
        return aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:77:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x046a  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo85555c(int r34, java.lang.Object r35) {
        /*
            r33 = this;
            r0 = r33
            r2 = r35
            gi1.a r2 = (gi1.C59463a) r2
            up1.y r1 = up1.C27696y.THUMB_IMAGE
            java.lang.Class<ht1.t1> r3 = ht1.C60200t1.class
            java.lang.Class<pl1.s0> r4 = pl1.C11990s0.class
            java.lang.Class<cl1.o> r5 = cl1.C54991o.class
            java.lang.String r6 = "data"
            gy3.C87412m.m108594g(r2, r6)
            boolean r6 = r0.f188232k
            r7 = 8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r11 = 1
            r12 = 0
            if (r6 != 0) goto L_0x05e7
            fj1.b r6 = r0.f188241t
            if (r6 == 0) goto L_0x0033
            java.lang.Class<cl1.d0> r13 = cl1.C54963d0.class
            androidx.lifecycle.i0 r6 = r6.mo71262a(r13)
            cl1.d0 r6 = (cl1.C54963d0) r6
            boolean r6 = r6.mo75912T3()
            if (r6 != r11) goto L_0x0033
            r6 = 1
            goto L_0x0034
        L_0x0033:
            r6 = 0
        L_0x0034:
            if (r6 != 0) goto L_0x05e7
            fj1.b r6 = r0.f188241t
            if (r6 == 0) goto L_0x004a
            java.lang.Class<cl1.c0> r13 = cl1.C54949c0.class
            androidx.lifecycle.i0 r6 = r6.mo71262a(r13)
            cl1.c0 r6 = (cl1.C54949c0) r6
            boolean r6 = r6.mo75866g3()
            if (r6 != r11) goto L_0x004a
            r6 = 1
            goto L_0x004b
        L_0x004a:
            r6 = 0
        L_0x004b:
            if (r6 == 0) goto L_0x004f
            goto L_0x05e7
        L_0x004f:
            java.lang.String r6 = r2.mo84561a()
            java.lang.String r13 = r0.f188235n
            boolean r6 = gy3.C87412m.m108589b(r6, r13)
            r13 = 2131297734(0x7f0905c6, float:1.8213421E38)
            r14 = 2131495010(0x7f0c0862, float:1.8613545E38)
            r15 = 2131297390(0x7f09046e, float:1.8212724E38)
            r7 = 2131316183(0x7f094dd7, float:1.825084E38)
            if (r6 == 0) goto L_0x023c
            fj1.b r2 = r0.f188241t
            if (r2 == 0) goto L_0x0079
            androidx.lifecycle.i0 r2 = r2.mo71262a(r5)
            cl1.o r2 = (cl1.C54991o) r2
            boolean r2 = r2.mo75960G3()
            if (r2 != r11) goto L_0x0079
            r2 = 1
            goto L_0x007a
        L_0x0079:
            r2 = 0
        L_0x007a:
            if (r2 == 0) goto L_0x0236
            fj1.b r2 = r0.f188241t
            if (r2 == 0) goto L_0x008c
            androidx.lifecycle.i0 r2 = r2.mo71262a(r5)
            cl1.o r2 = (cl1.C54991o) r2
            boolean r2 = r2.f154305d3
            if (r2 != 0) goto L_0x008c
            r2 = 1
            goto L_0x008d
        L_0x008c:
            r2 = 0
        L_0x008d:
            if (r2 == 0) goto L_0x0236
            android.graphics.Bitmap r2 = r0.f188230i
            if (r2 == 0) goto L_0x013e
            com.tencent.mm.view.ratio.RatioLayout r1 = r33.mo85556d()
            android.content.Context r1 = r1.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            com.tencent.mm.view.ratio.RatioLayout r3 = r33.mo85556d()
            android.view.View r1 = r1.inflate(r14, r3, r12)
            android.view.View r3 = r1.findViewById(r13)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r3.setVisibility(r12)
            r3.setImageBitmap(r2)
            android.view.View r2 = r1.findViewById(r15)
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            r3.mo10233c(r8)
            java.lang.Object[] r17 = r3.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/live/view/mini/FinderMiniWindowFloatLayoutAdapter"
            java.lang.String r19 = "createAnchorAudioItemView"
            java.lang.String r20 = "(Landroid/graphics/Bitmap;)Landroid/view/View;"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r2
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r3 = r3.mo10231a(r12)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/live/view/mini/FinderMiniWindowFloatLayoutAdapter"
            java.lang.String r18 = "createAnchorAudioItemView"
            java.lang.String r19 = "(Landroid/graphics/Bitmap;)Landroid/view/View;"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            android.view.View r2 = r1.findViewById(r7)
            k20.a r3 = new k20.a
            r3.<init>()
            r3.mo10233c(r8)
            java.lang.Object[] r24 = r3.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/finder/live/view/mini/FinderMiniWindowFloatLayoutAdapter"
            java.lang.String r26 = "createAnchorAudioItemView"
            java.lang.String r27 = "(Landroid/graphics/Bitmap;)Landroid/view/View;"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r2
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            java.lang.Object r3 = r3.mo10231a(r12)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r24 = "com/tencent/mm/plugin/finder/live/view/mini/FinderMiniWindowFloatLayoutAdapter"
            java.lang.String r25 = "createAnchorAudioItemView"
            java.lang.String r26 = "(Landroid/graphics/Bitmap;)Landroid/view/View;"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
            int r2 = r33.mo85553a()
            if (r2 > r11) goto L_0x068f
            r0.mo89488i(r1)
            goto L_0x068f
        L_0x013e:
            te3.up2 r2 = r0.f188231j
            if (r2 == 0) goto L_0x0229
            ok1.e r5 = ok1.C62042e.f176370a
            java.lang.String r2 = r5.mo86995C0(r2)
            int r5 = r2.length()
            if (r5 <= 0) goto L_0x0150
            r5 = 1
            goto L_0x0151
        L_0x0150:
            r5 = 0
        L_0x0151:
            if (r5 == 0) goto L_0x0155
            r10 = r2
            goto L_0x0156
        L_0x0155:
            r10 = 0
        L_0x0156:
            if (r10 == 0) goto L_0x0229
            com.tencent.mm.view.ratio.RatioLayout r2 = r33.mo85556d()
            android.content.Context r2 = r2.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            com.tencent.mm.view.ratio.RatioLayout r5 = r33.mo85556d()
            android.view.View r2 = r2.inflate(r14, r5, r12)
            android.view.View r5 = r2.findViewById(r13)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r5.setVisibility(r12)
            bl3.r r6 = bl3.C39818r.f106831a
            bl3.r$a r9 = r6.mo62446e(r3)
            bl3.c r9 = r9.mo62447c(r4)
            pl1.s0 r9 = (pl1.C11990s0) r9
            k60.d r9 = r9.mo11871f2()
            pl1.o r13 = new pl1.o
            r13.<init>(r10, r1)
            pl1.e0$a r1 = pl1.C11978e0.C11979a.PROFILE_COVER
            bl3.r$a r3 = r6.mo62446e(r3)
            bl3.c r3 = r3.mo62447c(r4)
            pl1.s0 r3 = (pl1.C11990s0) r3
            n60.f r1 = r3.mo11867O2(r1)
            r9.mo85957c(r13, r5, r1)
            android.view.View r1 = r2.findViewById(r15)
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            r3.mo10233c(r8)
            java.lang.Object[] r17 = r3.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/live/view/mini/FinderMiniWindowFloatLayoutAdapter"
            java.lang.String r19 = "createAnchorAudioItemView"
            java.lang.String r20 = "(Ljava/lang/String;)Landroid/view/View;"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r1
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r3 = r3.mo10231a(r12)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/live/view/mini/FinderMiniWindowFloatLayoutAdapter"
            java.lang.String r18 = "createAnchorAudioItemView"
            java.lang.String r19 = "(Ljava/lang/String;)Landroid/view/View;"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            android.view.View r1 = r2.findViewById(r7)
            k20.a r3 = new k20.a
            r3.<init>()
            r3.mo10233c(r8)
            java.lang.Object[] r24 = r3.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/finder/live/view/mini/FinderMiniWindowFloatLayoutAdapter"
            java.lang.String r26 = "createAnchorAudioItemView"
            java.lang.String r27 = "(Ljava/lang/String;)Landroid/view/View;"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r1
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            java.lang.Object r3 = r3.mo10231a(r12)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r24 = "com/tencent/mm/plugin/finder/live/view/mini/FinderMiniWindowFloatLayoutAdapter"
            java.lang.String r25 = "createAnchorAudioItemView"
            java.lang.String r26 = "(Ljava/lang/String;)Landroid/view/View;"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
            int r1 = r33.mo85553a()
            if (r1 > r11) goto L_0x0226
            r0.mo89488i(r2)
        L_0x0226:
            r1 = r2
            goto L_0x068f
        L_0x0229:
            java.lang.String r1 = r0.f188224c
            java.lang.String r2 = "muteVideoBitmap is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            android.view.View r1 = r33.mo89489j()
            goto L_0x068f
        L_0x0236:
            android.view.View r1 = r33.mo89489j()
            goto L_0x068f
        L_0x023c:
            al1.j r2 = r2.f169894a
            if (r2 == 0) goto L_0x05e1
            int r5 = r2.f152001e
            if (r5 == r11) goto L_0x024a
            boolean r5 = r2.f152012p
            if (r5 == 0) goto L_0x0249
            goto L_0x024a
        L_0x0249:
            r11 = 0
        L_0x024a:
            pl1.e0$a r5 = pl1.C11978e0.C11979a.WX_AVATAR
            java.lang.Class<tf0.p1> r6 = tf0.C64916p1.class
            pl1.e0$a r9 = pl1.C11978e0.C11979a.AVATAR
            com.tencent.mm.view.ratio.RatioLayout r17 = r33.mo85556d()
            android.content.Context r17 = r17.getContext()
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r17)
            com.tencent.mm.view.ratio.RatioLayout r7 = r33.mo85556d()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r12)
            android.view.View r7 = r10.inflate(r14, r7, r12)
            android.view.View r10 = r7.findViewById(r13)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r13 = 2131297390(0x7f09046e, float:1.8212724E38)
            android.view.View r13 = r7.findViewById(r13)
            r14 = 2131316183(0x7f094dd7, float:1.825084E38)
            android.view.View r14 = r7.findViewById(r14)
            java.lang.String r12 = r2.f151999c
            java.lang.String r19 = ""
            r27 = r7
            if (r12 != 0) goto L_0x0286
            r12 = r19
        L_0x0286:
            te3.up2 r7 = r2.f152017u
            r28 = r1
            if (r7 == 0) goto L_0x029d
            ok1.e r1 = ok1.C62042e.f176370a
            boolean r20 = r1.mo87097m1(r7)
            if (r20 == 0) goto L_0x0295
            goto L_0x0296
        L_0x0295:
            r7 = 0
        L_0x0296:
            if (r7 == 0) goto L_0x029d
            java.lang.String r1 = r1.mo86995C0(r7)
            goto L_0x02a7
        L_0x029d:
            java.lang.String r1 = r2.f152011o
            if (r1 != 0) goto L_0x02a7
            java.lang.String r1 = r2.f151998b
            if (r1 != 0) goto L_0x02a7
            r1 = r19
        L_0x02a7:
            java.lang.String r7 = r2.f152000d
            if (r7 != 0) goto L_0x02ad
            r7 = r19
        L_0x02ad:
            java.lang.String r2 = r2.f151998b
            r29 = r1
            if (r2 != 0) goto L_0x02b5
            r2 = r19
        L_0x02b5:
            java.lang.String r1 = "nicknameTv"
            java.lang.String r0 = "getService(IFinderCommon…atureService::class.java)"
            r30 = r5
            java.lang.String r5 = "avatarIv"
            r31 = r9
            r9 = 1086324736(0x40c00000, float:6.0)
            if (r11 == 0) goto L_0x046a
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r19 = k20.C60958c.f173611a
            r11.mo10233c(r8)
            java.lang.Object[] r20 = r11.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/finder/live/view/mini/FinderMiniWindowFloatLayoutAdapter"
            java.lang.String r22 = "createItemView"
            java.lang.String r23 = "(IZLcom/tencent/mm/plugin/finder/live/viewmodel/data/FinderLiveLinkMicUser;)Landroid/view/View;"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r14
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            r8 = 0
            java.lang.Object r11 = r11.mo10231a(r8)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r8 = r11.intValue()
            r14.setVisibility(r8)
            java.lang.String r20 = "com/tencent/mm/plugin/finder/live/view/mini/FinderMiniWindowFloatLayoutAdapter"
            java.lang.String r21 = "createItemView"
            java.lang.String r22 = "(IZLcom/tencent/mm/plugin/finder/live/viewmodel/data/FinderLiveLinkMicUser;)Landroid/view/View;"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
            r8 = 0
            r10.setVisibility(r8)
            k20.a r8 = new k20.a
            r8.<init>()
            r8.mo10233c(r15)
            java.lang.Object[] r20 = r8.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/finder/live/view/mini/FinderMiniWindowFloatLayoutAdapter"
            java.lang.String r22 = "createItemView"
            java.lang.String r23 = "(IZLcom/tencent/mm/plugin/finder/live/viewmodel/data/FinderLiveLinkMicUser;)Landroid/view/View;"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r13
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            r11 = 0
            java.lang.Object r8 = r8.mo10231a(r11)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r13.setVisibility(r8)
            java.lang.String r20 = "com/tencent/mm/plugin/finder/live/view/mini/FinderMiniWindowFloatLayoutAdapter"
            java.lang.String r21 = "createItemView"
            java.lang.String r22 = "(IZLcom/tencent/mm/plugin/finder/live/viewmodel/data/FinderLiveLinkMicUser;)Landroid/view/View;"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
            r8 = 2131297391(0x7f09046f, float:1.8212726E38)
            android.view.View r8 = r13.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r11 = 2131297385(0x7f090469, float:1.8212713E38)
            android.view.View r11 = r13.findViewById(r11)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            di3.d r6 = di3.C86312j.m106911c(r6)
            gy3.C87412m.m108593f(r6, r0)
            r19 = r6
            tf0.p1 r19 = (tf0.C64916p1) r19
            gy3.C87412m.m108593f(r8, r1)
            er1.j4 r20 = er1.C58739j4.f168176a
            r23 = 0
            r24 = 4
            r25 = 0
            r21 = r12
            r22 = r7
            java.lang.String r21 = er1.C58739j4.m68253s(r20, r21, r22, r23, r24, r25)
            r22 = 0
            r23 = 4
            r24 = 0
            r20 = r8
            java.lang.CharSequence r0 = tf0.C64916p1.C64917a.m76442i(r19, r20, r21, r22, r23, r24)
            r8.setText(r0)
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85817T4(r12)
            if (r0 == 0) goto L_0x03b4
            bl3.r r0 = bl3.C39818r.f106831a
            bl3.r$a r1 = r0.mo62446e(r3)
            bl3.c r1 = r1.mo62447c(r4)
            pl1.s0 r1 = (pl1.C11990s0) r1
            k60.d r1 = r1.mo11872i2()
            pl1.f r6 = new pl1.f
            r13 = 2
            r14 = 0
            r6.<init>(r2, r14, r13, r14)
            gy3.C87412m.m108593f(r11, r5)
            bl3.r$a r0 = r0.mo62446e(r3)
            bl3.c r0 = r0.mo62447c(r4)
            pl1.s0 r0 = (pl1.C11990s0) r0
            r13 = r31
            n60.f r0 = r0.mo11867O2(r13)
            r1.mo85957c(r6, r11, r0)
            goto L_0x03e3
        L_0x03b4:
            r13 = r31
            bl3.r r0 = bl3.C39818r.f106831a
            bl3.r$a r1 = r0.mo62446e(r3)
            bl3.c r1 = r1.mo62447c(r4)
            pl1.s0 r1 = (pl1.C11990s0) r1
            k60.d r1 = r1.mo11865K1()
            pl1.f r6 = new pl1.f
            r14 = 2
            r15 = 0
            r6.<init>(r2, r15, r14, r15)
            gy3.C87412m.m108593f(r11, r5)
            bl3.r$a r0 = r0.mo62446e(r3)
            bl3.c r0 = r0.mo62447c(r4)
            pl1.s0 r0 = (pl1.C11990s0) r0
            r5 = r30
            n60.f r0 = r0.mo11867O2(r5)
            r1.mo85957c(r6, r11, r0)
        L_0x03e3:
            r0 = r33
            java.lang.String r1 = r0.f188224c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "showBlurBg username:"
            r5.append(r6)
            r5.append(r12)
            java.lang.String r6 = ",bgUrl:"
            r5.append(r6)
            r6 = r29
            r5.append(r6)
            java.lang.String r14 = " blurBgView.elevation:"
            r5.append(r14)
            float r14 = r10.getElevation()
            r5.append(r14)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r5)
            bl3.r r1 = bl3.C39818r.f106831a
            bl3.r$a r5 = r1.mo62446e(r3)
            bl3.c r5 = r5.mo62447c(r4)
            pl1.s0 r5 = (pl1.C11990s0) r5
            k60.d r5 = r5.mo11873j2()
            pl1.o r14 = new pl1.o
            r15 = r28
            r14.<init>(r6, r15)
            bl3.r$a r1 = r1.mo62446e(r3)
            bl3.c r1 = r1.mo62447c(r4)
            pl1.s0 r1 = (pl1.C11990s0) r1
            n60.f r1 = r1.mo11867O2(r13)
            r5.mo85957c(r14, r10, r1)
            int r1 = r0.f188223b
            r3 = 2
            if (r1 != r3) goto L_0x0466
            android.view.ViewGroup$LayoutParams r1 = r11.getLayoutParams()
            boolean r3 = r1 instanceof android.view.ViewGroup.LayoutParams
            if (r3 == 0) goto L_0x0449
            r10 = r1
            goto L_0x044a
        L_0x0449:
            r10 = 0
        L_0x044a:
            if (r10 == 0) goto L_0x0463
            android.content.Context r1 = r27.getContext()
            r3 = 2131165324(0x7f07008c, float:1.7944862E38)
            int r1 = kg3.C76577a.m92157h(r1, r3)
            r10.width = r1
            android.content.Context r1 = r27.getContext()
            int r1 = kg3.C76577a.m92157h(r1, r3)
            r10.height = r1
        L_0x0463:
            r8.setTextSize(r9)
        L_0x0466:
            r32 = r6
            goto L_0x0597
        L_0x046a:
            r32 = r29
            r9 = r31
            r11 = 8
            r10.setVisibility(r11)
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            r10.mo10233c(r8)
            java.lang.Object[] r20 = r10.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/finder/live/view/mini/FinderMiniWindowFloatLayoutAdapter"
            java.lang.String r22 = "createItemView"
            java.lang.String r23 = "(IZLcom/tencent/mm/plugin/finder/live/viewmodel/data/FinderLiveLinkMicUser;)Landroid/view/View;"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r13
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            r8 = 0
            java.lang.Object r10 = r10.mo10231a(r8)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r8 = r10.intValue()
            r13.setVisibility(r8)
            java.lang.String r20 = "com/tencent/mm/plugin/finder/live/view/mini/FinderMiniWindowFloatLayoutAdapter"
            java.lang.String r21 = "createItemView"
            java.lang.String r22 = "(IZLcom/tencent/mm/plugin/finder/live/viewmodel/data/FinderLiveLinkMicUser;)Landroid/view/View;"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
            k20.a r8 = new k20.a
            r8.<init>()
            r8.mo10233c(r15)
            java.lang.Object[] r20 = r8.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/finder/live/view/mini/FinderMiniWindowFloatLayoutAdapter"
            java.lang.String r22 = "createItemView"
            java.lang.String r23 = "(IZLcom/tencent/mm/plugin/finder/live/viewmodel/data/FinderLiveLinkMicUser;)Landroid/view/View;"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r14
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            r10 = 0
            java.lang.Object r8 = r8.mo10231a(r10)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r14.setVisibility(r8)
            java.lang.String r20 = "com/tencent/mm/plugin/finder/live/view/mini/FinderMiniWindowFloatLayoutAdapter"
            java.lang.String r21 = "createItemView"
            java.lang.String r22 = "(IZLcom/tencent/mm/plugin/finder/live/viewmodel/data/FinderLiveLinkMicUser;)Landroid/view/View;"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
            r8 = 2131316193(0x7f094de1, float:1.825086E38)
            android.view.View r8 = r14.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            di3.d r6 = di3.C86312j.m106911c(r6)
            gy3.C87412m.m108593f(r6, r0)
            r19 = r6
            tf0.p1 r19 = (tf0.C64916p1) r19
            gy3.C87412m.m108593f(r8, r1)
            er1.j4 r20 = er1.C58739j4.f168176a
            r23 = 0
            r24 = 4
            r25 = 0
            r21 = r12
            r22 = r7
            java.lang.String r21 = er1.C58739j4.m68253s(r20, r21, r22, r23, r24, r25)
            r22 = 0
            r23 = 4
            r24 = 0
            r20 = r8
            java.lang.CharSequence r0 = tf0.C64916p1.C64917a.m76442i(r19, r20, r21, r22, r23, r24)
            r8.setText(r0)
            r0 = 2131316131(0x7f094da3, float:1.8250735E38)
            android.view.View r0 = r14.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85817T4(r12)
            if (r1 == 0) goto L_0x055f
            bl3.r r1 = bl3.C39818r.f106831a
            bl3.r$a r6 = r1.mo62446e(r3)
            bl3.c r6 = r6.mo62447c(r4)
            pl1.s0 r6 = (pl1.C11990s0) r6
            k60.d r6 = r6.mo11872i2()
            pl1.f r10 = new pl1.f
            r11 = 2
            r13 = 0
            r10.<init>(r2, r13, r11, r13)
            gy3.C87412m.m108593f(r0, r5)
            bl3.r$a r1 = r1.mo62446e(r3)
            bl3.c r1 = r1.mo62447c(r4)
            pl1.s0 r1 = (pl1.C11990s0) r1
            n60.f r1 = r1.mo11867O2(r9)
            r6.mo85957c(r10, r0, r1)
            r10 = 2
            goto L_0x058c
        L_0x055f:
            bl3.r r1 = bl3.C39818r.f106831a
            bl3.r$a r6 = r1.mo62446e(r3)
            bl3.c r6 = r6.mo62447c(r4)
            pl1.s0 r6 = (pl1.C11990s0) r6
            k60.d r6 = r6.mo11865K1()
            pl1.f r9 = new pl1.f
            r10 = 2
            r11 = 0
            r9.<init>(r2, r11, r10, r11)
            gy3.C87412m.m108593f(r0, r5)
            bl3.r$a r1 = r1.mo62446e(r3)
            bl3.c r1 = r1.mo62447c(r4)
            pl1.s0 r1 = (pl1.C11990s0) r1
            r3 = r30
            n60.f r1 = r1.mo11867O2(r3)
            r6.mo85957c(r9, r0, r1)
        L_0x058c:
            r0 = r33
            int r1 = r0.f188223b
            if (r1 != r10) goto L_0x0597
            r1 = 1086324736(0x40c00000, float:6.0)
            r8.setTextSize(r1)
        L_0x0597:
            java.lang.String r1 = r0.f188224c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "createItemView, index:"
            r3.append(r4)
            r4 = r34
            r3.append(r4)
            java.lang.String r4 = ", totalCount:"
            r3.append(r4)
            int r4 = r33.mo85553a()
            r3.append(r4)
            java.lang.String r4 = ", username:"
            r3.append(r4)
            r3.append(r12)
            java.lang.String r4 = ", nickname:"
            r3.append(r4)
            r3.append(r7)
            java.lang.String r4 = ", bgUrl:"
            r3.append(r4)
            r4 = r32
            r3.append(r4)
            java.lang.String r4 = ", avatarUrl:"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            r1 = r27
            goto L_0x068f
        L_0x05e1:
            android.view.View r1 = r33.mo89489j()
            goto L_0x068f
        L_0x05e7:
            gi1.f r1 = r2.f169895b
            boolean r1 = r1.f169904h
            java.lang.String r3 = "layout.context"
            if (r1 == 0) goto L_0x0624
            si1.i r1 = new si1.i
            com.tencent.mm.view.ratio.RatioLayout r4 = r33.mo85556d()
            android.content.Context r4 = r4.getContext()
            gy3.C87412m.m108593f(r4, r3)
            r5 = 0
            r1.<init>(r4, r5)
            dl1.a r3 = r0.f188233l
            r1.mo86637c(r3, r2)
            int r2 = r0.f188223b
            r3 = 2
            if (r2 == r3) goto L_0x061f
            r8 = 0
            r1.setNeedAutoAdjust(r8)
            android.content.Context r2 = r1.getContext()
            r3 = 8
            int r2 = kg3.C76577a.m92151b(r2, r3)
            r3 = 1084227584(0x40a00000, float:5.0)
            r1.mo88692h(r2, r3)
            goto L_0x068f
        L_0x061f:
            r1.setNeedAutoAdjust(r11)
            goto L_0x068f
        L_0x0624:
            r5 = 0
            r8 = 0
            al1.j r1 = r2.f169894a
            if (r1 == 0) goto L_0x062d
            java.lang.String r10 = r1.f151997a
            goto L_0x062e
        L_0x062d:
            r10 = r5
        L_0x062e:
            java.lang.String r1 = r0.f188235n
            boolean r1 = gy3.C87412m.m108589b(r10, r1)
            if (r1 == 0) goto L_0x0638
            r9 = 3
            goto L_0x0650
        L_0x0638:
            al1.j r1 = r2.f169894a
            if (r1 == 0) goto L_0x064f
            gi1.f r1 = r2.f169895b
            boolean r4 = r1.f169904h
            if (r4 != 0) goto L_0x064f
            int r1 = r1.f169905i
            r4 = 2
            boolean r1 = o40.C61926c.m72696u(r1, r4)
            if (r1 == 0) goto L_0x064d
            r9 = 1
            goto L_0x0650
        L_0x064d:
            r9 = 2
            goto L_0x0650
        L_0x064f:
            r9 = 0
        L_0x0650:
            al1.j r1 = r2.f169894a
            if (r1 == 0) goto L_0x065a
            int r4 = r1.f152001e
            if (r4 != r11) goto L_0x065a
            r4 = 1
            goto L_0x065b
        L_0x065a:
            r4 = 0
        L_0x065b:
            if (r4 != 0) goto L_0x066b
            if (r1 == 0) goto L_0x0665
            boolean r1 = r1.f152012p
            if (r1 != r11) goto L_0x0665
            r1 = 1
            goto L_0x0666
        L_0x0665:
            r1 = 0
        L_0x0666:
            if (r1 == 0) goto L_0x0669
            goto L_0x066b
        L_0x0669:
            r4 = 0
            goto L_0x066c
        L_0x066b:
            r4 = 1
        L_0x066c:
            ti1.c r8 = new ti1.c
            com.tencent.mm.view.ratio.RatioLayout r1 = r33.mo85556d()
            android.content.Context r1 = r1.getContext()
            gy3.C87412m.m108593f(r1, r3)
            java.lang.String r3 = r0.f188236o
            r8.<init>(r1, r9, r3, r11)
            ti1.f r9 = new ti1.f
            dl1.a r3 = r0.f188233l
            int r5 = r0.f188237p
            java.util.ArrayList<android.graphics.RectF> r6 = r0.f188238q
            r7 = 0
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.mo89093a(r9)
            r1 = r8
        L_0x068f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: uk1.C65409j.mo85555c(int, java.lang.Object):android.view.View");
    }

    /* renamed from: e */
    public RatioLayout.C57914a mo85557e(int i) {
        return this.f188227f.get(i).f169895b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: com.tencent.mm.plugin.finder.live.plugin.view.audio.FinderLiveAudioWaveRootView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: com.tencent.mm.plugin.finder.live.plugin.view.audio.FinderLiveAudioWaveRootView} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo89488i(android.view.View r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof android.view.ViewGroup
            r1 = 0
            if (r0 == 0) goto L_0x0008
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            goto L_0x0009
        L_0x0008:
            r9 = r1
        L_0x0009:
            if (r9 == 0) goto L_0x00a6
            java.lang.Class<ir.n> r0 = p565ir.C60606n.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ir.n r0 = (p565ir.C60606n) r0
            android.view.View r0 = r0.h40()
            boolean r2 = r0 instanceof com.tencent.p014mm.plugin.finder.live.plugin.view.audio.FinderLiveAudioWaveRootView
            if (r2 == 0) goto L_0x001e
            r1 = r0
            com.tencent.mm.plugin.finder.live.plugin.view.audio.FinderLiveAudioWaveRootView r1 = (com.tencent.p014mm.plugin.finder.live.plugin.view.audio.FinderLiveAudioWaveRootView) r1
        L_0x001e:
            if (r1 == 0) goto L_0x00a3
            int r1 = r8.f188223b
            r2 = 2
            if (r1 != r2) goto L_0x00a3
            r1 = r0
            com.tencent.mm.plugin.finder.live.plugin.view.audio.FinderLiveAudioWaveRootView r1 = (com.tencent.p014mm.plugin.finder.live.plugin.view.audio.FinderLiveAudioWaveRootView) r1
            android.widget.TextView r3 = r1.f159497i
            r4 = 1
            r5 = 1091567616(0x41100000, float:9.0)
            r3.setTextSize(r4, r5)
            android.content.Context r3 = r1.getContext()
            r4 = 2131165324(0x7f07008c, float:1.7944862E38)
            int r3 = kg3.C76577a.m92157h(r3, r4)
            com.tencent.mm.plugin.finder.live.plugin.view.audio.FinderLiveAudioWaveView r4 = r1.f159495g
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r5.<init>(r3, r3)
            android.content.Context r6 = r1.getContext()
            r7 = -5
            int r6 = kg3.C76577a.m92151b(r6, r7)
            r5.leftMargin = r6
            r4.setLayoutParams(r5)
            com.tencent.mm.plugin.finder.live.plugin.view.audio.FinderLiveAudioWaveView r4 = r1.f159496h
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r5.<init>(r3, r3)
            r4.setLayoutParams(r5)
            android.content.Context r3 = r1.getContext()
            int r3 = kg3.C76577a.m92151b(r3, r2)
            float r3 = (float) r3
            android.content.Context r4 = r1.getContext()
            r5 = 2131165281(0x7f070061, float:1.7944775E38)
            int r4 = kg3.C76577a.m92157h(r4, r5)
            float r4 = (float) r4
            com.tencent.mm.plugin.finder.live.plugin.view.audio.FinderLiveAudioWaveView r5 = r1.f159495g
            android.content.Context r6 = r1.getContext()
            int r6 = kg3.C76577a.m92151b(r6, r2)
            float r6 = (float) r6
            r5.setTranslationX(r6)
            com.tencent.mm.plugin.finder.live.plugin.view.audio.FinderLiveAudioWaveView r5 = r1.f159496h
            android.content.Context r6 = r1.getContext()
            int r2 = kg3.C76577a.m92151b(r6, r2)
            float r2 = (float) r2
            float r2 = -r2
            r5.setTranslationX(r2)
            com.tencent.mm.plugin.finder.live.plugin.view.audio.FinderLiveAudioWaveView r2 = r1.f159495g
            r2.setArcWidth(r4)
            com.tencent.mm.plugin.finder.live.plugin.view.audio.FinderLiveAudioWaveView r2 = r1.f159496h
            r2.setArcWidth(r4)
            com.tencent.mm.plugin.finder.live.plugin.view.audio.FinderLiveAudioWaveView r2 = r1.f159495g
            r2.setWaveWidth(r3)
            com.tencent.mm.plugin.finder.live.plugin.view.audio.FinderLiveAudioWaveView r2 = r1.f159496h
            r2.setWaveWidth(r3)
            r1.mo77689a()
        L_0x00a3:
            r9.addView(r0)
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: uk1.C65409j.mo89488i(android.view.View):void");
    }

    /* renamed from: j */
    public final View mo89489j() {
        View inflate = LayoutInflater.from(mo85556d().getContext()).inflate(C0966R.C0971layout.ahm, mo85556d(), false);
        View findViewById = inflate.findViewById(C0966R.C0970id.a8j);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/view/mini/FinderMiniWindowFloatLayoutAdapter", "createEmptyItemView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/view/mini/FinderMiniWindowFloatLayoutAdapter", "createEmptyItemView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById2 = inflate.findViewById(C0966R.C0970id.f357468a01);
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view2 = findViewById2;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/view/mini/FinderMiniWindowFloatLayoutAdapter", "createEmptyItemView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/view/mini/FinderMiniWindowFloatLayoutAdapter", "createEmptyItemView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById3 = inflate.findViewById(C0966R.C0970id.l65);
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(8);
        View view3 = findViewById3;
        C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/view/mini/FinderMiniWindowFloatLayoutAdapter", "createEmptyItemView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/view/mini/FinderMiniWindowFloatLayoutAdapter", "createEmptyItemView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return inflate;
    }

    /* renamed from: k */
    public final void mo89490k(boolean z) {
        if (!mo85558f()) {
            Log.m105924i(this.f188224c, "onAnchorAudioChange layout isInitialized = false");
            return;
        }
        int childCount = mo85556d().getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (mo85556d().getChildAt(i) instanceof C64941c) {
                View childAt = mo85556d().getChildAt(i);
                C87412m.m108592e(childAt, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.mic.widget.preview.FinderLiveMicCommonPreviewWidget");
                ((C64941c) childAt).mo89097f(z);
            }
        }
    }

    /* renamed from: l */
    public final void mo89491l(boolean z, C45795b bVar, int i, JSONObject jSONObject, Point point) {
        String str;
        C45795b bVar2 = bVar;
        int i2 = i;
        JSONObject jSONObject2 = jSONObject;
        Class cls = C54963d0.class;
        Class cls2 = C54991o.class;
        C87412m.m108594g(bVar2, "buContext");
        Point a = point == null ? C65928b.f189533a.mo89963a(((C54991o) bVar2.mo71262a(cls2)).f154335l1, ((C54991o) bVar2.mo71262a(cls2)).f154338m1) : point;
        Point point2 = this.f188234m;
        boolean z2 = true;
        boolean z3 = (point2.x == a.x && point2.y == a.y) ? false : true;
        this.f188234m = a;
        C64265bq2 bq22 = ((C55001u) bVar2.mo71262a(C55001u.class)).f154419p;
        if (bq22 == null || (str = bq22.f182319n) == null) {
            str = "";
        }
        this.f188235n = str;
        boolean b = C61482c.f174809a.mo86455b(str, jSONObject2, this.f188240s);
        Boolean bool = this.f188239r;
        boolean z4 = bool != null && C87412m.m108589b(bool, Boolean.valueOf(((C54991o) bVar2.mo71262a(cls2)).mo75960G3()));
        this.f188241t = bVar2;
        C54130j jVar = ((C54963d0) bVar2.mo71262a(cls)).f154073p;
        boolean z5 = (jVar != null ? jVar.f152012p : false) != this.f188242u;
        if (!z3 && z) {
            if (this.f188235n != null) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            JSONArray optJSONArray = jSONObject2 != null ? jSONObject2.optJSONArray("list") : null;
                            if (optJSONArray != null || this.f188228g != null) {
                                if (optJSONArray != null) {
                                    JSONArray jSONArray = this.f188228g;
                                    if (jSONArray != null && jSONArray.length() == optJSONArray.length()) {
                                        int length = jSONArray.length();
                                        int i3 = 0;
                                        while (true) {
                                            if (i3 >= length) {
                                                break;
                                            }
                                            JSONObject optJSONObject = jSONArray.optJSONObject(i3);
                                            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i3);
                                            if (!TextUtils.equals(optJSONObject != null ? optJSONObject.optString(DownloadInfo.UID) : null, optJSONObject2 != null ? optJSONObject2.optString(DownloadInfo.UID) : null)) {
                                                break;
                                            }
                                            i3++;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (this.f188226e.size() == ((C54963d0) bVar2.mo71262a(cls)).f154074q.size()) {
                        int size = this.f188226e.size();
                        z2 = false;
                        for (int i4 = 0; i4 < size; i4++) {
                            if (!Util.isEqual(this.f188226e.get(i4).f152002f, ((C54963d0) bVar2.mo71262a(cls)).f154074q.get(i4).f152002f)) {
                                z2 = true;
                            }
                        }
                    }
                    z2 = true;
                } else {
                    C54130j jVar2 = this.f188225d;
                    String str2 = jVar2 != null ? jVar2.f152002f : null;
                    C54130j jVar3 = ((C54963d0) bVar2.mo71262a(cls)).f154073p;
                    z2 = !Util.isEqual(str2, jVar3 != null ? jVar3.f152002f : null);
                }
                if (!z2 && !b && z4 && !z5) {
                    return;
                }
            }
            z2 = false;
            return;
        }
        this.f188239r = Boolean.valueOf(((C54991o) bVar2.mo71262a(cls2)).mo75960G3());
        C54130j jVar4 = ((C54963d0) bVar2.mo71262a(cls)).f154073p;
        this.f188242u = jVar4 != null ? jVar4.f152012p : false;
        C61926c.m72668M(new C65410a(jSONObject, this, bVar, z, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C65409j(int i, int i2, C8480h hVar) {
        this((i2 & 1) != 0 ? 1 : i);
    }
}
