package kf1;

import al1.C54130j;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import c30.C104289g;
import c30.C26827e;
import com.tencent.p014mm.plugin.finder.storage.FeedData;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.ratio.RatioLayout;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import er1.C58739j4;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60211v2;
import iq3.C60601c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import mi1.C61482c;
import o40.C61926c;
import ob0.C89132b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p50.C35369i;
import rx3.C13598b0;
import sx3.C110823p;
import te3.C50397mg0;
import ti1.C64941c;
import up1.C37521f;
import z04.C112550d0;
import z04.C119027c;
import zt3.C119157j;

/* renamed from: kf1.o4 */
public final class C61046o4 implements C60211v2 {

    /* renamed from: a */
    public final RatioLayout f173847a;

    /* renamed from: b */
    public C32226l<? super Boolean, C13598b0> f173848b;

    /* renamed from: c */
    public final String f173849c;

    /* renamed from: d */
    public boolean f173850d;

    /* renamed from: e */
    public C33903b f173851e = new C33903b((String) null, false, 3, (C8480h) null);

    /* renamed from: f */
    public C33903b f173852f = new C33903b((String) null, false, 3, (C8480h) null);

    /* renamed from: g */
    public List<String> f173853g = Collections.synchronizedList(new ArrayList());

    /* renamed from: h */
    public final C61066t4 f173854h;

    /* renamed from: i */
    public C104289g f173855i;

    /* renamed from: j */
    public JSONArray f173856j;

    /* renamed from: k */
    public String f173857k;

    /* renamed from: l */
    public HashMap<String, C54130j> f173858l;

    /* renamed from: m */
    public String f173859m;

    /* renamed from: n */
    public FeedData f173860n;

    /* renamed from: o */
    public FinderItem f173861o;

    /* renamed from: p */
    public boolean f173862p;

    /* renamed from: kf1.o4$b */
    public static final class C33903b {

        /* renamed from: a */
        public String f91590a;

        /* renamed from: b */
        public boolean f91591b;

        public C33903b() {
            this((String) null, false, 3, (C8480h) null);
        }

        public C33903b(String str, boolean z, int i, C8480h hVar) {
            str = (i & 1) != 0 ? "" : str;
            z = (i & 2) != 0 ? false : z;
            C87412m.m108594g(str, "sdkUserId");
            this.f91590a = str;
            this.f91591b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C33903b)) {
                return false;
            }
            C33903b bVar = (C33903b) obj;
            return C87412m.m108589b(this.f91590a, bVar.f91590a) && this.f91591b == bVar.f91591b;
        }

        public int hashCode() {
            int hashCode = this.f91590a.hashCode() * 31;
            boolean z = this.f91591b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            return "AnchorData(sdkUserId=" + this.f91590a + ", audioMode=" + this.f91591b + ')';
        }
    }

    /* renamed from: kf1.o4$c */
    public static final class C33904c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ byte[] f91592d;

        /* renamed from: e */
        public final /* synthetic */ C61046o4 f91593e;

        public C33904c(byte[] bArr, C61046o4 o4Var) {
            this.f91592d = bArr;
            this.f91593e = o4Var;
        }

        public final void run() {
            byte[] bArr = this.f91592d;
            String str = bArr != null ? new String(bArr, C119027c.f356488a) : null;
            String str2 = this.f91593e.f173849c;
            Log.m105918d(str2, "handleSeiMessage seiData:" + this.f91592d + " seiMessage:" + str);
            boolean z = true;
            if (!(str != null && C112550d0.m153801u(str, "TencentStreamSEI", false))) {
                if (!(str == null || str.length() == 0)) {
                    z = false;
                }
                if (!z) {
                    try {
                        C104289g gVar = new C104289g(str);
                        int optInt = gVar.optInt("wxT");
                        if (optInt != 0 && !Util.isNullOrNil(gVar.optString("d"))) {
                            C61046o4.m71546f(this.f91593e, optInt, gVar.optString("d"), gVar.optString("m"));
                        }
                    } catch (JSONException e) {
                        Log.printErrStackTrace(this.f91593e.f173849c, e, "", new Object[0]);
                    }
                }
            }
        }
    }

    /* renamed from: kf1.o4$a */
    public static final class C61047a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: d */
        public final /* synthetic */ C61046o4 f173863d;

        public C61047a(C61046o4 o4Var) {
            this.f173863d = o4Var;
        }

        public boolean onPreDraw() {
            ViewTreeObserver viewTreeObserver;
            RatioLayout ratioLayout = this.f173863d.f173847a;
            if (!(ratioLayout == null || (viewTreeObserver = ratioLayout.getViewTreeObserver()) == null)) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
            this.f173863d.f173854h.mo85999i(new Point(this.f173863d.f173847a.getWidth(), this.f173863d.f173847a.getHeight()));
            return true;
        }
    }

    /* renamed from: kf1.o4$d */
    public static final class C61048d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C61046o4 f173864d;

        /* renamed from: e */
        public final /* synthetic */ boolean f173865e;

        /* renamed from: f */
        public final /* synthetic */ String f173866f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61048d(C61046o4 o4Var, boolean z, String str) {
            super(0);
            this.f173864d = o4Var;
            this.f173865e = z;
            this.f173866f = str;
        }

        public Object invoke() {
            C61066t4 t4Var = this.f173864d.f173854h;
            boolean z = this.f173865e;
            String str = this.f173866f;
            t4Var.getClass();
            C87412m.m108594g(str, "userId");
            if (!t4Var.mo85558f()) {
                Log.m105924i(t4Var.f173908d, "onAnchorAudioChange layout isInitialized = false");
            } else {
                int childCount = t4Var.mo85556d().getChildCount();
                for (int i = 0; i < childCount; i++) {
                    if (t4Var.mo85556d().getChildAt(i) instanceof C64941c) {
                        View childAt = t4Var.mo85556d().getChildAt(i);
                        C87412m.m108592e(childAt, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.mic.widget.preview.FinderLiveMicCommonPreviewWidget");
                        C64941c cVar = (C64941c) childAt;
                        if (C87412m.m108589b(cVar.getBindSdkUserId(), str)) {
                            cVar.mo89097f(z);
                        }
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: kf1.o4$e */
    public static final class C61049e extends C87413o implements C32226l<C89132b.C89134c<C50397mg0>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ long f173867d;

        /* renamed from: e */
        public final /* synthetic */ C61046o4 f173868e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61049e(long j, C61046o4 o4Var) {
            super(1);
            this.f173867d = j;
            this.f173868e = o4Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:218:0x0467, code lost:
            if (((r2 == null || (r2 = r2.f182365K) == null) ? null : r2.f137807n) == null) goto L_0x0469;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r67) {
            /*
                r66 = this;
                r0 = r66
                r1 = r67
                ob0.b$c r1 = (ob0.C89132b.C89134c) r1
                long r2 = java.lang.System.currentTimeMillis()
                long r4 = r0.f173867d
                long r2 = r2 - r4
                kf1.o4 r4 = r0.f173868e
                java.lang.String r4 = r4.f173849c
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "tryFetchMicUserInfo rsp feedId : "
                r5.append(r6)
                kf1.o4 r6 = r0.f173868e
                com.tencent.mm.plugin.finder.storage.FeedData r6 = r6.f173860n
                r7 = 0
                if (r6 == 0) goto L_0x0029
                long r9 = r6.getFeedId()
                goto L_0x002a
            L_0x0029:
                r9 = r7
            L_0x002a:
                java.lang.String r6 = o40.C61926c.m72691p(r9)
                r5.append(r6)
                java.lang.String r6 = " consumeTime: "
                r5.append(r6)
                r5.append(r2)
                java.lang.String r2 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
                if (r1 == 0) goto L_0x048e
                kf1.o4 r3 = r0.f173868e
                r4 = 0
                r3.f173850d = r4
                java.lang.String r5 = r3.f173849c
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r9 = "tryFetchMicUserInfoResp errType:"
                r6.append(r9)
                int r9 = r1.f256793a
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r6.append(r9)
                java.lang.String r9 = " errCode:"
                r6.append(r9)
                int r9 = r1.f256794b
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r6.append(r9)
                java.lang.String r9 = " feedId:"
                r6.append(r9)
                com.tencent.mm.plugin.finder.storage.FeedData r9 = r3.f173860n
                if (r9 == 0) goto L_0x0079
                long r9 = r9.getFeedId()
                goto L_0x007a
            L_0x0079:
                r9 = r7
            L_0x007a:
                java.lang.String r9 = o40.C61926c.m72691p(r9)
                r6.append(r9)
                java.lang.String r9 = " nonceId:"
                r6.append(r9)
                com.tencent.mm.plugin.finder.storage.FeedData r9 = r3.f173860n
                java.lang.String r10 = ""
                if (r9 == 0) goto L_0x0092
                java.lang.String r9 = r9.getNonceId()
                if (r9 != 0) goto L_0x0093
            L_0x0092:
                r9 = r10
            L_0x0093:
                r6.append(r9)
                java.lang.String r9 = " result:"
                r6.append(r9)
                T r9 = r1.f256796d
                te3.mg0 r9 = (te3.C50397mg0) r9
                if (r9 == 0) goto L_0x00ae
                java.util.LinkedList<te3.ue1> r9 = r9.f138011d
                if (r9 == 0) goto L_0x00ae
                int r9 = r9.size()
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                goto L_0x00af
            L_0x00ae:
                r9 = 0
            L_0x00af:
                r6.append(r9)
                java.lang.String r6 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
                int r5 = r1.f256793a
                r6 = 1
                if (r5 != 0) goto L_0x00c0
                r5 = 1
                goto L_0x00c1
            L_0x00c0:
                r5 = 0
            L_0x00c1:
                if (r5 == 0) goto L_0x048b
                int r5 = r1.f256794b
                if (r5 != 0) goto L_0x00c9
                r5 = 1
                goto L_0x00ca
            L_0x00c9:
                r5 = 0
            L_0x00ca:
                if (r5 == 0) goto L_0x048b
                T r1 = r1.f256796d
                te3.mg0 r1 = (te3.C50397mg0) r1
                if (r1 == 0) goto L_0x048b
                java.util.LinkedList<te3.ue1> r1 = r1.f138011d
                if (r1 == 0) goto L_0x048b
                java.util.Iterator r1 = r1.iterator()
            L_0x00da:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L_0x0489
                java.lang.Object r5 = r1.next()
                te3.ue1 r5 = (te3.C51533ue1) r5
                long r11 = r5.f142797d
                com.tencent.mm.plugin.finder.storage.FeedData r9 = r3.f173860n
                if (r9 == 0) goto L_0x00f5
                long r13 = r9.getFeedId()
                java.lang.Long r9 = java.lang.Long.valueOf(r13)
                goto L_0x00f6
            L_0x00f5:
                r9 = 0
            L_0x00f6:
                java.lang.String r13 = r3.f173849c
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "tryFetchMicUserInfo respObjId:"
                r14.append(r15)
                r14.append(r11)
                java.lang.String r15 = " localObjId:"
                r14.append(r15)
                r14.append(r9)
                java.lang.String r15 = " anchorUserId:"
                r14.append(r15)
                te3.c21 r15 = r5.f142798e
                if (r15 == 0) goto L_0x011e
                te3.bq2 r15 = r15.f182358D
                if (r15 == 0) goto L_0x011e
                java.lang.String r15 = r15.f182319n
                goto L_0x011f
            L_0x011e:
                r15 = 0
            L_0x011f:
                r14.append(r15)
                java.lang.String r15 = " feedId: "
                r14.append(r15)
                com.tencent.mm.plugin.finder.storage.FeedData r15 = r3.f173860n
                if (r15 == 0) goto L_0x0130
                long r15 = r15.getFeedId()
                goto L_0x0131
            L_0x0130:
                r15 = r7
            L_0x0131:
                java.lang.String r15 = o40.C61926c.m72691p(r15)
                r14.append(r15)
                java.lang.String r15 = " micAudienceSize: "
                r14.append(r15)
                te3.c21 r15 = r5.f142798e
                if (r15 == 0) goto L_0x0152
                te3.m31 r15 = r15.f182365K
                if (r15 == 0) goto L_0x0152
                java.util.LinkedList<te3.l31> r15 = r15.f137806j
                if (r15 == 0) goto L_0x0152
                int r15 = r15.size()
                java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
                goto L_0x0153
            L_0x0152:
                r15 = 0
            L_0x0153:
                r14.append(r15)
                java.lang.String r15 = " pkData: "
                r14.append(r15)
                te3.c21 r15 = r5.f142798e
                if (r15 == 0) goto L_0x016a
                te3.m31 r15 = r15.f182365K
                if (r15 == 0) goto L_0x016a
                te3.o31 r15 = r15.f137807n
                if (r15 == 0) goto L_0x016a
                java.lang.String r15 = r15.f138924f
                goto L_0x016b
            L_0x016a:
                r15 = 0
            L_0x016b:
                r14.append(r15)
                java.lang.String r14 = r14.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r14)
                java.lang.Long r11 = java.lang.Long.valueOf(r11)
                boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.Object) r11, (java.lang.Object) r9)
                if (r9 != 0) goto L_0x0188
                java.lang.String r5 = r3.f173849c
                java.lang.String r9 = "respLiveId != localLiveId, skip!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r9)
                goto L_0x00da
            L_0x0188:
                com.tencent.mm.plugin.finder.storage.FeedData r9 = r3.f173860n
                if (r9 == 0) goto L_0x0199
                java.util.LinkedList r9 = r9.getMediaList()
                if (r9 == 0) goto L_0x0199
                java.lang.Object r9 = sx3.C110818d0.m150916N(r9)
                te3.rq2 r9 = (te3.C64689rq2) r9
                goto L_0x019a
            L_0x0199:
                r9 = 0
            L_0x019a:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                if (r9 == 0) goto L_0x01a4
                java.lang.String r12 = r9.f185283w
                goto L_0x01a5
            L_0x01a4:
                r12 = 0
            L_0x01a5:
                java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r12)
                r11.append(r12)
                if (r9 == 0) goto L_0x01b1
                java.lang.String r12 = r9.f185234A
                goto L_0x01b2
            L_0x01b1:
                r12 = 0
            L_0x01b2:
                java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r12)
                r11.append(r12)
                java.lang.String r11 = r11.toString()
                boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
                if (r12 == 0) goto L_0x01e7
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                if (r9 == 0) goto L_0x01cd
                java.lang.String r12 = r9.f185267e
                goto L_0x01ce
            L_0x01cd:
                r12 = 0
            L_0x01ce:
                java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r12)
                r11.append(r12)
                if (r9 == 0) goto L_0x01db
                java.lang.String r9 = r9.f185288z
                if (r9 != 0) goto L_0x01dc
            L_0x01db:
                r9 = r10
            L_0x01dc:
                java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r9)
                r11.append(r9)
                java.lang.String r11 = r11.toString()
            L_0x01e7:
                r3.f173859m = r11
                te3.c21 r9 = r5.f142798e
                if (r9 == 0) goto L_0x0259
                te3.bq2 r9 = r9.f182358D
                if (r9 == 0) goto L_0x0259
                java.lang.String r9 = r9.f182319n
                if (r9 == 0) goto L_0x0259
                kf1.o4$b r11 = r3.f173851e
                r11.getClass()
                r11.f91590a = r9
                java.util.HashMap<java.lang.String, al1.j> r15 = r3.f173858l
                al1.j r14 = new al1.j
                com.tencent.mm.plugin.finder.storage.FeedData r11 = r3.f173860n
                if (r11 == 0) goto L_0x020b
                java.lang.String r11 = r11.getUserName()
                r38 = r11
                goto L_0x020d
            L_0x020b:
                r38 = 0
            L_0x020d:
                com.tencent.mm.plugin.finder.storage.FeedData r11 = r3.f173860n
                if (r11 == 0) goto L_0x0218
                java.lang.String r11 = r11.getNickname()
                r39 = r11
                goto L_0x021a
            L_0x0218:
                r39 = 0
            L_0x021a:
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 0
                r25 = 0
                java.lang.String r11 = r3.f173859m
                r26 = r11
                r27 = 0
                r28 = 0
                r30 = 0
                r31 = 0
                r32 = 0
                r33 = 0
                r34 = 0
                r35 = 0
                r36 = 8372160(0x7fbfc0, float:1.1731895E-38)
                r37 = 0
                java.lang.String r13 = ""
                r11 = r14
                r12 = r9
                r2 = r14
                r14 = r38
                r4 = r15
                r15 = r39
                r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r31, r32, r33, r34, r35, r36, r37)
                r4.put(r9, r2)
                rx3.b0 r2 = rx3.C13598b0.f38549a
            L_0x0259:
                kf1.o4$b r2 = r3.f173852f
                r2.getClass()
                r2.f91590a = r10
                te3.c21 r2 = r5.f142798e
                java.lang.String r4 = "tryFetchMicUserInfo audienceUserId:"
                if (r2 == 0) goto L_0x03a1
                te3.m31 r2 = r2.f182365K
                if (r2 == 0) goto L_0x03a1
                te3.o31 r2 = r2.f137807n
                if (r2 == 0) goto L_0x03a1
                java.lang.String r9 = r3.f173849c
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = "tryFetchMicUserInfo pkAnchorUserId:"
                r11.append(r12)
                java.lang.String r12 = r2.f138924f
                r11.append(r12)
                java.lang.String r11 = r11.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r11)
                java.lang.String r9 = r2.f138924f
                if (r9 == 0) goto L_0x03a1
                kf1.o4$b r11 = r3.f173852f
                r11.getClass()
                r11.f91590a = r9
                java.util.HashMap<java.lang.String, al1.j> r11 = r3.f173858l
                al1.j r12 = new al1.j
                te3.hx0 r13 = r2.f138925g
                if (r13 == 0) goto L_0x02a4
                com.tencent.mm.protocal.protobuf.FinderContact r14 = r13.f134919d
                if (r14 == 0) goto L_0x02a4
                java.lang.String r14 = r14.headUrl
                r41 = r14
                goto L_0x02a6
            L_0x02a4:
                r41 = 0
            L_0x02a6:
                if (r13 == 0) goto L_0x02b1
                com.tencent.mm.protocal.protobuf.FinderContact r14 = r13.f134919d
                if (r14 == 0) goto L_0x02b1
                java.lang.String r14 = r14.username
                r42 = r14
                goto L_0x02b3
            L_0x02b1:
                r42 = 0
            L_0x02b3:
                if (r13 == 0) goto L_0x02be
                com.tencent.mm.protocal.protobuf.FinderContact r14 = r13.f134919d
                if (r14 == 0) goto L_0x02be
                java.lang.String r14 = r14.nickname
                r43 = r14
                goto L_0x02c0
            L_0x02be:
                r43 = 0
            L_0x02c0:
                te3.c21 r14 = r5.f142798e
                if (r14 == 0) goto L_0x02cd
                te3.m31 r14 = r14.f182365K
                if (r14 == 0) goto L_0x02cd
                int r14 = r14.f137801e
                r44 = r14
                goto L_0x02cf
            L_0x02cd:
                r44 = 0
            L_0x02cf:
                r45 = 0
                r46 = 0
                r47 = 1
                r48 = 0
                r49 = 0
                r50 = 0
                r51 = 0
                r52 = 0
                r53 = 0
                if (r13 == 0) goto L_0x02e8
                java.lang.String r13 = r13.f134927o
                r54 = r13
                goto L_0x02ea
            L_0x02e8:
                r54 = 0
            L_0x02ea:
                r55 = 0
                r56 = 0
                r58 = 0
                r59 = 0
                r60 = 0
                r61 = 0
                r62 = 0
                r63 = 0
                r64 = 8372032(0x7fbf40, float:1.1731716E-38)
                r65 = 0
                r39 = r12
                r40 = r9
                r39.<init>(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r58, r59, r60, r61, r62, r63, r64, r65)
                r11.put(r9, r12)
                java.util.LinkedList<te3.l31> r2 = r2.f138927i
                if (r2 == 0) goto L_0x03a1
                java.util.Iterator r2 = r2.iterator()
            L_0x0311:
                boolean r9 = r2.hasNext()
                if (r9 == 0) goto L_0x039f
                java.lang.Object r9 = r2.next()
                te3.l31 r9 = (te3.C50209l31) r9
                java.lang.String r11 = r3.f173849c
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r4)
                java.lang.String r13 = r9.f137147f
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r12)
                java.lang.String r11 = r9.f137147f
                if (r11 == 0) goto L_0x0311
                java.util.HashMap<java.lang.String, al1.j> r12 = r3.f173858l
                al1.j r13 = new al1.j
                te3.hx0 r14 = r9.f137145d
                if (r14 == 0) goto L_0x0348
                com.tencent.mm.protocal.protobuf.FinderContact r15 = r14.f134919d
                if (r15 == 0) goto L_0x0348
                java.lang.String r15 = r15.headUrl
                r41 = r15
                goto L_0x034a
            L_0x0348:
                r41 = 0
            L_0x034a:
                if (r14 == 0) goto L_0x0355
                com.tencent.mm.protocal.protobuf.FinderContact r15 = r14.f134919d
                if (r15 == 0) goto L_0x0355
                java.lang.String r15 = r15.username
                r42 = r15
                goto L_0x0357
            L_0x0355:
                r42 = 0
            L_0x0357:
                if (r14 == 0) goto L_0x0362
                com.tencent.mm.protocal.protobuf.FinderContact r14 = r14.f134919d
                if (r14 == 0) goto L_0x0362
                java.lang.String r14 = r14.nickname
                r43 = r14
                goto L_0x0364
            L_0x0362:
                r43 = 0
            L_0x0364:
                int r9 = r9.f137146e
                r44 = r9
                r45 = 0
                r46 = 0
                r47 = 0
                r48 = 0
                r49 = 0
                r50 = 0
                r51 = 0
                r52 = 0
                r53 = 0
                r54 = 0
                r55 = 0
                r56 = 0
                r58 = 0
                r59 = 0
                r60 = 0
                r61 = 0
                r62 = 0
                r63 = 0
                r64 = 8388544(0x7fffc0, float:1.1754854E-38)
                r65 = 0
                r39 = r13
                r40 = r11
                r39.<init>(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r58, r59, r60, r61, r62, r63, r64, r65)
                r12.put(r11, r13)
                rx3.b0 r9 = rx3.C13598b0.f38549a
                goto L_0x0311
            L_0x039f:
                rx3.b0 r2 = rx3.C13598b0.f38549a
            L_0x03a1:
                te3.c21 r2 = r5.f142798e
                if (r2 == 0) goto L_0x0441
                te3.m31 r2 = r2.f182365K
                if (r2 == 0) goto L_0x0441
                java.util.LinkedList<te3.l31> r2 = r2.f137806j
                if (r2 == 0) goto L_0x0441
                java.util.Iterator r2 = r2.iterator()
            L_0x03b1:
                boolean r9 = r2.hasNext()
                if (r9 == 0) goto L_0x043f
                java.lang.Object r9 = r2.next()
                te3.l31 r9 = (te3.C50209l31) r9
                java.lang.String r11 = r3.f173849c
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r4)
                java.lang.String r13 = r9.f137147f
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r12)
                java.lang.String r11 = r9.f137147f
                if (r11 == 0) goto L_0x03b1
                java.util.HashMap<java.lang.String, al1.j> r12 = r3.f173858l
                al1.j r13 = new al1.j
                te3.hx0 r14 = r9.f137145d
                if (r14 == 0) goto L_0x03e8
                com.tencent.mm.protocal.protobuf.FinderContact r15 = r14.f134919d
                if (r15 == 0) goto L_0x03e8
                java.lang.String r15 = r15.headUrl
                r41 = r15
                goto L_0x03ea
            L_0x03e8:
                r41 = 0
            L_0x03ea:
                if (r14 == 0) goto L_0x03f5
                com.tencent.mm.protocal.protobuf.FinderContact r15 = r14.f134919d
                if (r15 == 0) goto L_0x03f5
                java.lang.String r15 = r15.username
                r42 = r15
                goto L_0x03f7
            L_0x03f5:
                r42 = 0
            L_0x03f7:
                if (r14 == 0) goto L_0x0402
                com.tencent.mm.protocal.protobuf.FinderContact r14 = r14.f134919d
                if (r14 == 0) goto L_0x0402
                java.lang.String r14 = r14.nickname
                r43 = r14
                goto L_0x0404
            L_0x0402:
                r43 = 0
            L_0x0404:
                int r9 = r9.f137146e
                r44 = r9
                r45 = 0
                r46 = 0
                r47 = 0
                r48 = 0
                r49 = 0
                r50 = 0
                r51 = 0
                r52 = 0
                r53 = 0
                r54 = 0
                r55 = 0
                r56 = 0
                r58 = 0
                r59 = 0
                r60 = 0
                r61 = 0
                r62 = 0
                r63 = 0
                r64 = 8388544(0x7fffc0, float:1.1754854E-38)
                r65 = 0
                r39 = r13
                r40 = r11
                r39.<init>(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r58, r59, r60, r61, r62, r63, r64, r65)
                r12.put(r11, r13)
                rx3.b0 r9 = rx3.C13598b0.f38549a
                goto L_0x03b1
            L_0x043f:
                rx3.b0 r2 = rx3.C13598b0.f38549a
            L_0x0441:
                te3.c21 r2 = r5.f142798e
                if (r2 == 0) goto L_0x044c
                te3.m31 r2 = r2.f182365K
                if (r2 == 0) goto L_0x044c
                java.util.LinkedList<te3.l31> r2 = r2.f137806j
                goto L_0x044d
            L_0x044c:
                r2 = 0
            L_0x044d:
                if (r2 == 0) goto L_0x0458
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L_0x0456
                goto L_0x0458
            L_0x0456:
                r2 = 0
                goto L_0x0459
            L_0x0458:
                r2 = 1
            L_0x0459:
                if (r2 != 0) goto L_0x0469
                te3.c21 r2 = r5.f142798e
                if (r2 == 0) goto L_0x0466
                te3.m31 r2 = r2.f182365K
                if (r2 == 0) goto L_0x0466
                te3.o31 r2 = r2.f137807n
                goto L_0x0467
            L_0x0466:
                r2 = 0
            L_0x0467:
                if (r2 != 0) goto L_0x047e
            L_0x0469:
                te3.c21 r2 = r5.f142798e
                if (r2 == 0) goto L_0x0478
                te3.m31 r2 = r2.f182365K
                if (r2 == 0) goto L_0x0478
                te3.o31 r2 = r2.f137807n
                if (r2 == 0) goto L_0x0478
                java.util.LinkedList<te3.l31> r2 = r2.f138927i
                goto L_0x0479
            L_0x0478:
                r2 = 0
            L_0x0479:
                if (r2 == 0) goto L_0x047e
                r2.isEmpty()
            L_0x047e:
                java.lang.String r2 = r3.f173857k
                r3.mo85994h(r2)
                r3.mo85997k(r6)
                r4 = 0
                goto L_0x00da
            L_0x0489:
                rx3.b0 r1 = rx3.C13598b0.f38549a
            L_0x048b:
                rx3.b0 r2 = rx3.C13598b0.f38549a
                goto L_0x048f
            L_0x048e:
                r2 = 0
            L_0x048f:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: kf1.C61046o4.C61049e.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public C61046o4(int i, RatioLayout ratioLayout, C32226l<? super Boolean, C13598b0> lVar) {
        ViewTreeObserver viewTreeObserver;
        this.f173847a = ratioLayout;
        this.f173848b = lVar;
        String str = "FinderLiveFeedCoverDecorator@" + hashCode();
        this.f173849c = str;
        boolean z = false;
        C61066t4 t4Var = new C61066t4(i, this.f173848b);
        this.f173854h = t4Var;
        this.f173858l = new HashMap<>();
        this.f173859m = "";
        this.f173862p = true;
        C37521f.f99374d.getClass();
        this.f173862p = C37521f.f99539v5.mo60266n().intValue() == 1 ? true : z;
        if (ratioLayout != null) {
            ratioLayout.setAdapter(t4Var);
        }
        if (ratioLayout != null) {
            ratioLayout.setLayoutManager(new C60601c());
        }
        if (!(ratioLayout == null || (viewTreeObserver = ratioLayout.getViewTreeObserver()) == null)) {
            viewTreeObserver.addOnPreDrawListener(new C61047a(this));
        }
        Log.m105924i(str, "feedDecorate enable:" + this.f173862p);
    }

    /* renamed from: f */
    public static final void m71546f(C61046o4 o4Var, int i, String str, String str2) {
        o4Var.getClass();
        if (str != null && C61926c.m72696u(i, 16)) {
            o4Var.mo85994h(str);
            if (str2 != null) {
                String str3 = o4Var.f173851e.f91590a;
                boolean z = false;
                if (!(str3 == null || str3.length() == 0)) {
                    try {
                        String optString = new C104289g(str).optString("userId");
                        if (optString == null) {
                            optString = "";
                        }
                        if (Util.isEqual(optString, o4Var.f173851e.f91590a)) {
                            C104289g gVar = !(str2.length() == 0) ? new C104289g(str2) : new C104289g();
                            C26827e l = gVar.optJSONArray("list");
                            if (l != null || o4Var.f173856j != null) {
                                if (l != null) {
                                    JSONArray jSONArray = o4Var.f173856j;
                                    if (jSONArray != null && jSONArray.length() == l.length()) {
                                        int length = jSONArray.length();
                                        int i2 = 0;
                                        while (true) {
                                            if (i2 >= length) {
                                                break;
                                            }
                                            JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                                            JSONObject optJSONObject2 = l.optJSONObject(i2);
                                            String str4 = null;
                                            if (optJSONObject != null) {
                                                str4 = optJSONObject.optString(DownloadInfo.UID);
                                            }
                                            if (!TextUtils.equals(str4, optJSONObject2.optString(DownloadInfo.UID))) {
                                                break;
                                            }
                                            i2++;
                                        }
                                    }
                                }
                                z = true;
                            }
                            o4Var.f173855i = gVar;
                            o4Var.f173856j = l;
                            if (z) {
                                o4Var.mo85996j();
                            }
                            o4Var.mo85997k(z);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo85203a(byte[] bArr, int i) {
        if (this.f173862p) {
            String str = this.f173851e.f91590a;
            if (!(str == null || str.length() == 0)) {
                Integer[] numArr = C35369i.f94702a;
                if (C110823p.m151009y(C35369i.f94702a, Integer.valueOf(i))) {
                    ((C119157j) C119157j.f356862d).mo183876g(new C33904c(bArr, this), "Sei_Message_Handler");
                } else if (C58739j4.f168176a.mo83692U()) {
                    String str2 = this.f173849c;
                    Log.m105918d(str2, "handleSeiMessage type:" + i + " invalid!");
                }
            }
        }
    }

    /* renamed from: b */
    public void mo85204b() {
        if (this.f173862p) {
            this.f173850d = false;
            this.f173851e = new C33903b((String) null, false, 3, (C8480h) null);
            this.f173852f = new C33903b((String) null, false, 3, (C8480h) null);
            this.f173853g.clear();
            this.f173858l.clear();
        }
    }

    /* renamed from: c */
    public void mo85205c() {
        if (this.f173862p) {
            this.f173850d = false;
            this.f173856j = null;
            this.f173855i = null;
            Log.m105924i(this.f173849c, "resetSeiData");
            C61066t4 t4Var = this.f173854h;
            t4Var.f173909e.clear();
            t4Var.f173916l = null;
            t4Var.f173917m = null;
            t4Var.mo85559g();
            this.f173851e = new C33903b((String) null, false, 3, (C8480h) null);
            this.f173852f = new C33903b((String) null, false, 3, (C8480h) null);
            this.f173853g.clear();
            this.f173858l.clear();
            RatioLayout ratioLayout = this.f173847a;
            if (ratioLayout != null) {
                ratioLayout.removeAllViews();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r3 = (r3 = r3.getLiveInfo()).f182358D;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo85206d(com.tencent.p014mm.plugin.finder.storage.FeedData r3, com.tencent.p014mm.plugin.finder.storage.FinderItem r4) {
        /*
            r2 = this;
            boolean r0 = r2.f173862p
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r2.f173860n = r3
            r2.f173861o = r4
            kf1.o4$b r4 = r2.f173851e
            if (r3 == 0) goto L_0x001a
            te3.c21 r3 = r3.getLiveInfo()
            if (r3 == 0) goto L_0x001a
            te3.bq2 r3 = r3.f182358D
            if (r3 == 0) goto L_0x001a
            java.lang.String r3 = r3.f182319n
            goto L_0x001b
        L_0x001a:
            r3 = 0
        L_0x001b:
            if (r3 != 0) goto L_0x001f
            java.lang.String r3 = ""
        L_0x001f:
            r4.getClass()
            r4.f91590a = r3
            com.tencent.mm.plugin.finder.storage.FeedData r3 = r2.f173860n
            if (r3 == 0) goto L_0x005d
            int r3 = r3.getAnchorStatus()
            r4 = 256(0x100, float:3.59E-43)
            boolean r3 = o40.C61926c.m72696u(r3, r4)
            java.lang.String r4 = r2.f173849c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "checkViewAlpha audioMode: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            if (r3 == 0) goto L_0x0054
            fy3.l<? super java.lang.Boolean, rx3.b0> r3 = r2.f173848b
            if (r3 == 0) goto L_0x005d
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.invoke(r4)
            goto L_0x005d
        L_0x0054:
            fy3.l<? super java.lang.Boolean, rx3.b0> r3 = r2.f173848b
            if (r3 == 0) goto L_0x005d
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r3.invoke(r4)
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf1.C61046o4.mo85206d(com.tencent.mm.plugin.finder.storage.FeedData, com.tencent.mm.plugin.finder.storage.FinderItem):void");
    }

    /* renamed from: e */
    public void mo85207e(int i, int i2) {
        String str = this.f173849c;
        Log.m105924i(str, "checkLinkMicMode videoW: " + i2);
        mo85996j();
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tencent.p014mm.p136ui.MMActivity mo85993g(android.view.View r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x0027
            android.content.Context r1 = r3.getContext()
            boolean r1 = r1 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r1 == 0) goto L_0x0017
            android.content.Context r3 = r3.getContext()
            java.lang.String r0 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r3, r0)
            com.tencent.mm.ui.MMActivity r3 = (com.tencent.p014mm.p136ui.MMActivity) r3
            return r3
        L_0x0017:
            android.view.ViewParent r3 = r3.getParent()
            boolean r1 = r3 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x0022
            r0 = r3
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
        L_0x0022:
            com.tencent.mm.ui.MMActivity r3 = r2.mo85993g(r0)
            return r3
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kf1.C61046o4.mo85993g(android.view.View):com.tencent.mm.ui.MMActivity");
    }

    /* renamed from: h */
    public final void mo85994h(String str) {
        this.f173857k = str;
        if (str != null) {
            C104289g gVar = new C104289g(str);
            String optString = gVar.optString("userId");
            if (optString == null) {
                optString = "";
            }
            boolean u = C61926c.m72696u(gVar.optInt("userStatus"), 2);
            C54130j jVar = this.f173858l.get(optString);
            if (jVar != null) {
                jVar.f152012p = u;
            }
            String str2 = this.f173851e.f91590a;
            boolean z = false;
            if (str2 == null || str2.length() == 0) {
                return;
            }
            if (Util.isEqual(this.f173851e.f91590a, optString)) {
                C33903b bVar = this.f173851e;
                if (bVar.f91591b != u) {
                    bVar.f91591b = u;
                    mo85995i(u, bVar.f91590a);
                    return;
                }
                return;
            }
            String str3 = this.f173852f.f91590a;
            if (str3 == null || str3.length() == 0) {
                z = true;
            }
            if (!z && C87412m.m108589b(optString, this.f173852f.f91590a)) {
                C33903b bVar2 = this.f173852f;
                if (bVar2.f91591b != u) {
                    bVar2.f91591b = u;
                    mo85995i(u, bVar2.f91590a);
                }
            }
        }
    }

    /* renamed from: i */
    public final void mo85995i(boolean z, String str) {
        String str2 = this.f173849c;
        Log.m105924i(str2, "notifyAudioModeChange: isAudioMode" + z + " userId: " + str);
        C61926c.m72668M(new C61048d(this, z, str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r0.getFeedObject();
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo85996j() {
        /*
            r13 = this;
            boolean r0 = r13.f173850d
            if (r0 == 0) goto L_0x000c
            java.lang.String r0 = r13.f173849c
            java.lang.String r1 = "isFetching, skip!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            return
        L_0x000c:
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r13.f173861o
            r1 = 0
            if (r0 == 0) goto L_0x001b
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            if (r0 == 0) goto L_0x001b
            long r3 = r0.block_cgi_flag
            goto L_0x001c
        L_0x001b:
            r3 = r1
        L_0x001c:
            r5 = 1
            long r3 = r3 & r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x002b
            java.lang.String r0 = r13.f173849c
            java.lang.String r1 = "block_cgi_flag"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            return
        L_0x002b:
            r0 = 1
            r13.f173850d = r0
            java.lang.String r0 = r13.f173849c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "tryFetchMicUserInfo feedId: "
            r3.append(r4)
            com.tencent.mm.plugin.finder.storage.FeedData r4 = r13.f173860n
            if (r4 == 0) goto L_0x0044
            long r4 = r4.getFeedId()
            goto L_0x0045
        L_0x0044:
            r4 = r1
        L_0x0045:
            java.lang.String r4 = o40.C61926c.m72691p(r4)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            long r3 = java.lang.System.currentTimeMillis()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            rx3.l r0 = new rx3.l
            com.tencent.mm.plugin.finder.storage.FeedData r5 = r13.f173860n
            if (r5 == 0) goto L_0x0066
            long r1 = r5.getFeedId()
        L_0x0066:
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            com.tencent.mm.plugin.finder.storage.FeedData r2 = r13.f173860n
            if (r2 == 0) goto L_0x0074
            java.lang.String r2 = r2.getNonceId()
            if (r2 != 0) goto L_0x0076
        L_0x0074:
            java.lang.String r2 = ""
        L_0x0076:
            r0.<init>(r1, r2)
            r6.add(r0)
            r7 = 3
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 28
            r12 = 0
            je1.l r0 = new je1.l
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            nr3.e r0 = r0.mo9225i()
            kf1.o4$e r1 = new kf1.o4$e
            r1.<init>(r3, r13)
            lp3.c r0 = o40.C61926c.m72665J(r0, r1)
            com.tencent.mm.view.ratio.RatioLayout r1 = r13.f173847a
            com.tencent.mm.ui.MMActivity r1 = r13.mo85993g(r1)
            if (r1 == 0) goto L_0x00a1
            r0.mo11397F(r1)
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf1.C61046o4.mo85996j():void");
    }

    /* renamed from: k */
    public final void mo85997k(boolean z) {
        C104289g gVar;
        C32226l<? super Boolean, C13598b0> lVar;
        C33903b bVar;
        boolean z2;
        C33903b bVar2;
        boolean z3;
        C61066t4 t4Var = this.f173854h;
        String str = this.f173851e.f91590a;
        String str2 = this.f173852f.f91590a;
        t4Var.getClass();
        C87412m.m108594g(str, "sdkCreateUserId");
        C87412m.m108594g(str2, "pkUserId");
        t4Var.f173913i = str;
        t4Var.f173914j = str2;
        String str3 = this.f173849c;
        Log.m105924i(str3, "updateMicData isMicUserChange:" + z + " size: " + this.f173858l.size() + " ratioAdapter: " + this.f173854h.hashCode() + " lastMicData: " + this.f173855i);
        if (this.f173858l.size() > 0 && (gVar = this.f173855i) != null) {
            if (gVar != null) {
                gVar.optJSONArray("list");
            }
            C54130j jVar = this.f173858l.get(this.f173851e.f91590a);
            if (!(jVar == null || (z3 = bVar2.f91591b) == jVar.f152012p)) {
                jVar.f152012p = z3;
                mo85995i(z3, (bVar2 = this.f173851e).f91590a);
            }
            C54130j jVar2 = this.f173858l.get(this.f173852f.f91590a);
            if (!(jVar2 == null || (z2 = bVar.f91591b) == jVar2.f152012p)) {
                jVar2.f152012p = z2;
                mo85995i(z2, (bVar = this.f173852f).f91590a);
            }
            C61066t4 t4Var2 = this.f173854h;
            C104289g gVar2 = this.f173855i;
            HashMap<String, C54130j> hashMap = this.f173858l;
            t4Var2.getClass();
            C87412m.m108594g(hashMap, "micUserCache");
            boolean b = C61482c.f174809a.mo86455b(t4Var2.f173913i, gVar2, t4Var2.f173916l);
            String str4 = t4Var2.f173908d;
            Log.m105924i(str4, "refreshLayout isMicUserChange: " + z + " diffSeiDataChange: " + b + " scene: " + t4Var2.f173906b);
            if (z || b) {
                C61926c.m72668M(new C61064s4(gVar2, t4Var2, hashMap));
            }
            C54130j jVar3 = this.f173858l.get(this.f173851e.f91590a);
            C54130j jVar4 = this.f173858l.get(this.f173852f.f91590a);
            C104289g gVar3 = this.f173855i;
            if (gVar3 != null) {
                C26827e l = gVar3.optJSONArray("list");
                if ((l != null ? l.length() : 0) == 0 && jVar3 != null && !jVar3.f152012p) {
                    C32226l<? super Boolean, C13598b0> lVar2 = this.f173848b;
                    if (lVar2 != null) {
                        lVar2.invoke(Boolean.TRUE);
                        return;
                    }
                    return;
                }
            }
            if (jVar3 != null && !jVar3.f152012p && jVar4 != null && !jVar4.f152012p && (lVar = this.f173848b) != null) {
                lVar.invoke(Boolean.TRUE);
            }
        }
    }
}
