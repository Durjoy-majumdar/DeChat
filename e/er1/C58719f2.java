package er1;

import a14.C0000n0;
import android.content.Context;
import bi1.C0287e;
import bi1.C0288f;
import cj1.C54789l6;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderFeedDataStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.LiveAudienceCommodityLogStruct;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import di0.C86295k;
import di0.C86299o;
import di3.C86312j;
import eb0.C31543z5;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C87412m;
import hp3.C87581a;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import je1.C46528o0;
import kotlin.ResultKt;
import kr0.C76629w0;
import o40.C61926c;
import org.json.JSONObject;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C50858pp0;
import te3.C64287ci1;
import te3.C64370fp1;
import te3.C64513l40;
import te3.C64834xn2;
import te3.bs4;
import te3.z44;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112551y;

/* renamed from: er1.f2 */
public final class C58719f2 {

    /* renamed from: a */
    public static final C58719f2 f168110a = new C58719f2();

    /* renamed from: b */
    public static final ConcurrentHashMap<String, C64287ci1> f168111b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public static C64287ci1 f168112c;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.utils.FinderProductShareUtil$requestProductInfo$$inlined$success$default$1", mo125469f = "FinderProductShareUtil.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: er1.f2$a */
    public static final class C58720a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0287e f168113d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0 f168114e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58720a(C0287e eVar, C15601d dVar, C8479f0 f0Var) {
            super(2, dVar);
            this.f168113d = eVar;
            this.f168114e = f0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C58720a(this.f168113d, dVar, this.f168114e);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C58720a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            this.f168114e.f27484d = (C50858pp0) ((C0288f) this.f168113d).f855b;
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.utils.FinderProductShareUtil", mo125469f = "FinderProductShareUtil.kt", mo125470l = {107, 328}, mo125471m = "requestProductInfo")
    /* renamed from: er1.f2$b */
    public static final class C58721b extends C66704d {

        /* renamed from: d */
        public Object f168115d;

        /* renamed from: e */
        public Object f168116e;

        /* renamed from: f */
        public /* synthetic */ Object f168117f;

        /* renamed from: g */
        public final /* synthetic */ C58719f2 f168118g;

        /* renamed from: h */
        public int f168119h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58721b(C58719f2 f2Var, C15601d<? super C58721b> dVar) {
            super(dVar);
            this.f168118g = f2Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f168117f = obj;
            this.f168119h |= Integer.MIN_VALUE;
            return this.f168118g.mo83637j((Context) null, (String) null, 0, (String) null, false, this);
        }
    }

    /* renamed from: er1.f2$c */
    public static final class C58722c<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C64287ci1 f168120a;

        /* renamed from: b */
        public final /* synthetic */ C32226l<C50858pp0, C13598b0> f168121b;

        public C58722c(C64287ci1 ci12, C32226l<? super C50858pp0, C13598b0> lVar) {
            this.f168120a = ci12;
            this.f168121b = lVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: te3.xn2} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: byte[]} */
        /* JADX WARNING: type inference failed for: r8v0 */
        /* JADX WARNING: type inference failed for: r8v15 */
        /* JADX WARNING: type inference failed for: r8v16 */
        /* JADX WARNING: type inference failed for: r8v17 */
        /* JADX WARNING: type inference failed for: r8v18 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object call(java.lang.Object r13) {
            /*
                r12 = this;
                ob0.b$c r13 = (ob0.C89132b.C89134c) r13
                int r0 = r13.f256793a
                if (r0 != 0) goto L_0x01fa
                int r0 = r13.f256794b
                if (r0 != 0) goto L_0x01fa
                T r0 = r13.f256796d
                te3.pp0 r0 = (te3.C50858pp0) r0
                te3.fp1 r0 = r0.f139889d
                if (r0 == 0) goto L_0x01fa
                te3.ci1 r1 = r12.f168120a
                te3.l40 r2 = r0.f183185p
                java.lang.String r3 = ""
                if (r2 == 0) goto L_0x001e
                java.lang.String r4 = r2.f184031d
                if (r4 != 0) goto L_0x001f
            L_0x001e:
                r4 = r3
            L_0x001f:
                r1.f182500i = r4
                if (r2 == 0) goto L_0x0027
                java.lang.String r2 = r2.f184032e
                if (r2 != 0) goto L_0x0028
            L_0x0027:
                r2 = r3
            L_0x0028:
                r1.f182501j = r2
                long r4 = r0.f183176d
                java.lang.String r2 = o40.C61926c.m72691p(r4)
                r1.f182502n = r2
                java.util.LinkedList<java.lang.String> r2 = r0.f183178f
                java.lang.String r4 = "productInfo.img_urls"
                gy3.C87412m.m108593f(r2, r4)
                r4 = 0
                java.lang.Object r2 = sx3.C110818d0.m150917O(r2, r4)
                java.lang.String r2 = (java.lang.String) r2
                if (r2 != 0) goto L_0x0043
                r2 = r3
            L_0x0043:
                r1.f182503o = r2
                java.lang.String r2 = r0.f183177e
                if (r2 != 0) goto L_0x004a
                r2 = r3
            L_0x004a:
                r1.f182504p = r2
                int r2 = r0.f183181i
                r1.f182506r = r2
                int r2 = r0.f183173S
                r5 = 1
                if (r2 == 0) goto L_0x0057
                r2 = 1
                goto L_0x0058
            L_0x0057:
                r2 = 0
            L_0x0058:
                r1.f182494H = r2
                T r2 = r13.f256796d
                te3.pp0 r2 = (te3.C50858pp0) r2
                java.lang.String r2 = r2.f139893h
                r1.f182514z = r2
                java.util.LinkedList<java.lang.String> r2 = r0.f183171Q
                java.lang.String r6 = "productInfo.icon_urls"
                gy3.C87412m.m108593f(r2, r6)
                java.lang.Object r2 = sx3.C110818d0.m150916N(r2)
                java.lang.String r2 = (java.lang.String) r2
                r1.f182487A = r2
                java.util.LinkedList<java.lang.String> r2 = r0.f183171Q
                gy3.C87412m.m108593f(r2, r6)
                java.lang.Object r2 = sx3.C110818d0.m150917O(r2, r5)
                java.lang.String r2 = (java.lang.String) r2
                r1.f182489C = r2
                int r2 = r0.f183168M
                if (r2 == 0) goto L_0x0086
                int r2 = r0.f183180h
                r1.f182505q = r2
            L_0x0086:
                java.util.LinkedList<te3.z44> r2 = r0.f183165J
                java.lang.String r6 = "productInfo.show_box_items"
                gy3.C87412m.m108593f(r2, r6)
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                java.util.Iterator r2 = r2.iterator()
            L_0x0096:
                boolean r7 = r2.hasNext()
                if (r7 == 0) goto L_0x00b1
                java.lang.Object r7 = r2.next()
                r8 = r7
                te3.z44 r8 = (te3.z44) r8
                int r8 = r8.f186625d
                r9 = 6
                if (r8 != r9) goto L_0x00aa
                r8 = 1
                goto L_0x00ab
            L_0x00aa:
                r8 = 0
            L_0x00ab:
                if (r8 == 0) goto L_0x0096
                r6.add(r7)
                goto L_0x0096
            L_0x00b1:
                java.util.Iterator r2 = r6.iterator()
                r6 = 0
            L_0x00b6:
                boolean r7 = r2.hasNext()
                r8 = 0
                if (r7 == 0) goto L_0x0113
                java.lang.Object r7 = r2.next()
                int r9 = r6 + 1
                if (r6 < 0) goto L_0x010f
                te3.z44 r7 = (te3.z44) r7
                if (r6 == 0) goto L_0x00f9
                if (r6 == r5) goto L_0x00e4
                r10 = 2
                if (r6 == r10) goto L_0x00cf
                goto L_0x010d
            L_0x00cf:
                te3.ge2 r6 = new te3.ge2
                r6.<init>()
                pe3.b r7 = r7.f186626e
                if (r7 == 0) goto L_0x00dc
                byte[] r8 = r7.mo123703f()
            L_0x00dc:
                r6.parseFrom(r8)
                java.lang.String r6 = r6.f183317d
                r1.f182493G = r6
                goto L_0x010d
            L_0x00e4:
                te3.ge2 r6 = new te3.ge2
                r6.<init>()
                pe3.b r7 = r7.f186626e
                if (r7 == 0) goto L_0x00f1
                byte[] r8 = r7.mo123703f()
            L_0x00f1:
                r6.parseFrom(r8)
                java.lang.String r6 = r6.f183317d
                r1.f182492F = r6
                goto L_0x010d
            L_0x00f9:
                te3.ge2 r6 = new te3.ge2
                r6.<init>()
                pe3.b r7 = r7.f186626e
                if (r7 == 0) goto L_0x0106
                byte[] r8 = r7.mo123703f()
            L_0x0106:
                r6.parseFrom(r8)
                java.lang.String r6 = r6.f183317d
                r1.f182491E = r6
            L_0x010d:
                r6 = r9
                goto L_0x00b6
            L_0x010f:
                sx3.C64197v.m75542k()
                throw r8
            L_0x0113:
                pl1.e0 r2 = pl1.C11978e0.f34938a
                k60.d r6 = r2.mo11850b()
                pl1.n0 r7 = new pl1.n0
                java.lang.String r9 = r1.f182487A
                up1.y r10 = up1.C27696y.THUMB_IMAGE
                r7.<init>(r9, r10)
                pl1.e0$a r9 = pl1.C11978e0.C11979a.DEFAULT
                n60.f r11 = r2.mo11851c(r9)
                l60.b r6 = r6.mo85956b(r7, r11)
                er1.g2 r7 = new er1.g2
                r7.<init>(r1)
                r6.getClass()
                r6.f291320d = r7
                r6.mo85951a()
                k60.d r6 = r2.mo11850b()
                pl1.n0 r7 = new pl1.n0
                java.lang.String r11 = r1.f182489C
                r7.<init>(r11, r10)
                n60.f r2 = r2.mo11851c(r9)
                l60.b r2 = r6.mo85956b(r7, r2)
                er1.h2 r6 = new er1.h2
                r6.<init>(r1)
                r2.getClass()
                r2.f291320d = r6
                r2.mo85951a()
                java.util.LinkedList<te3.z44> r2 = r0.f183165J
                java.lang.String r6 = "this.show_box_items"
                gy3.C87412m.m108593f(r2, r6)
                java.util.Iterator r2 = r2.iterator()
            L_0x0165:
                boolean r6 = r2.hasNext()
                if (r6 == 0) goto L_0x017c
                java.lang.Object r6 = r2.next()
                r7 = r6
                te3.z44 r7 = (te3.z44) r7
                int r7 = r7.f186625d
                if (r7 != r5) goto L_0x0178
                r7 = 1
                goto L_0x0179
            L_0x0178:
                r7 = 0
            L_0x0179:
                if (r7 == 0) goto L_0x0165
                goto L_0x017d
            L_0x017c:
                r6 = r8
            L_0x017d:
                te3.z44 r6 = (te3.z44) r6
                if (r6 == 0) goto L_0x0191
                pe3.b r2 = r6.f186626e
                if (r2 == 0) goto L_0x0191
                te3.xn2 r8 = new te3.xn2
                r8.<init>()
                byte[] r2 = r2.mo123703f()
                r8.parseFrom(r2)
            L_0x0191:
                java.lang.String r2 = "Finder.FinderProductShareUtil"
                if (r8 == 0) goto L_0x01d9
                long r4 = eb0.C31543z5.m39453c()
                long r6 = r8.f186353e
                int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r9 <= 0) goto L_0x01a6
                int r6 = r8.f186352d
                if (r6 <= 0) goto L_0x01a6
                r1.f182510v = r6
                goto L_0x01d5
            L_0x01a6:
                er1.f2 r6 = er1.C58719f2.f168110a
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = r0.f183177e
                r6.append(r7)
                java.lang.String r7 = ",discount_price:"
                r6.append(r7)
                int r7 = r8.f186352d
                r6.append(r7)
                java.lang.String r7 = ", serverTime:"
                r6.append(r7)
                r6.append(r4)
                java.lang.String r4 = ",end_time_ms:"
                r6.append(r4)
                long r4 = r8.f186353e
                r6.append(r4)
                java.lang.String r4 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            L_0x01d5:
                long r4 = r8.f186353e
                r1.f182511w = r4
            L_0x01d9:
                java.lang.String r0 = r0.f183193x
                if (r0 != 0) goto L_0x01de
                goto L_0x01df
            L_0x01de:
                r3 = r0
            L_0x01df:
                er1.f2 r0 = er1.C58719f2.f168110a
                java.lang.String r4 = "Finder.FinderProductShareUtil_requestProductInfoOk"
                r0.mo83634g(r1, r4)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "requestId:"
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            L_0x01fa:
                er1.i2 r0 = new er1.i2
                fy3.l<te3.pp0, rx3.b0> r1 = r12.f168121b
                r0.<init>(r1, r13)
                o40.C61926c.m72668M(r0)
                rx3.b0 r13 = rx3.C13598b0.f38549a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: er1.C58719f2.C58722c.call(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: d */
    public static /* synthetic */ String m68198d(C58719f2 f2Var, C64287ci1 ci12, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        return f2Var.mo83631c(ci12, str, str2, num);
    }

    /* renamed from: a */
    public final void mo83629a(String str, String str2, C86299o oVar) {
        C87412m.m108594g(str, "finderUsername");
        C87412m.m108594g(str2, XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
        C87412m.m108594g(oVar, "bundle");
        Log.m105924i("Finder.FinderProductShareUtil", "fillShareJsApiParams finderUsername:" + str + ", token:" + str2);
        if (oVar.f250937i == null) {
            oVar.f250937i = new C54789l6();
        }
        C86295k kVar = oVar.f250937i;
        C54789l6 l6Var = kVar instanceof C54789l6 ? (C54789l6) kVar : null;
        if (l6Var != null) {
            l6Var.f153588i = str2;
            l6Var.f153589j = str;
        }
    }

    /* renamed from: b */
    public final String mo83630b(C64287ci1 ci12, String str, int i) {
        C87412m.m108594g(ci12, "value");
        C87412m.m108594g(str, "live_id");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("live_id", str);
        jSONObject.put("live_status", i);
        int i2 = 1;
        jSONObject.put("seckill", ci12.f182510v > 0 ? 1 : 0);
        if (ci12.f182511w <= C31543z5.m39453c()) {
            i2 = 0;
        }
        jSONObject.put("seckilling", i2);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "json.toString()");
        return jSONObject2;
    }

    /* renamed from: c */
    public final String mo83631c(C64287ci1 ci12, String str, String str2, Integer num) {
        C87412m.m108594g(ci12, "value");
        String str3 = ci12.f182502n;
        JSONObject jSONObject = new JSONObject();
        if (str3 == null) {
            str3 = "";
        }
        jSONObject.put("commodity_id", str3);
        if (str != null) {
            jSONObject.put("to_username", str);
        }
        if (str2 != null) {
            jSONObject.put("share_way", str2);
        }
        if (num != null) {
            num.intValue();
            jSONObject.put("commodity_status", num.intValue());
        }
        int i = 1;
        jSONObject.put("seckill", ci12.f182510v > 0 ? 1 : 0);
        if (ci12.f182511w <= C31543z5.m39453c()) {
            i = 0;
        }
        jSONObject.put("seckilling", i);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "json.toString()");
        return jSONObject2;
    }

    /* renamed from: e */
    public final C64287ci1 mo83632e(String str, long j, String str2, C64370fp1 fp12, String str3, C64513l40 l402) {
        String str4;
        String str5;
        String str6;
        String str7;
        T t;
        int i;
        C89349b bVar;
        boolean z;
        String str8;
        String str9;
        C87412m.m108594g(str, "finderUsername");
        C87412m.m108594g(str2, "nonceId");
        C87412m.m108594g(fp12, "productInfo");
        C87412m.m108594g(str3, "liveId");
        C64287ci1 ci12 = new C64287ci1();
        ci12.f182495d = str3;
        ci12.f182496e = str;
        ci12.f182497f = C61926c.m72691p(j);
        ci12.f182498g = str2;
        ci12.f182499h = "";
        C64513l40 l403 = fp12.f183185p;
        if (l403 == null || (str4 = l403.f184031d) == null) {
            str4 = "";
        }
        ci12.f182500i = str4;
        if (l403 == null || (str5 = l403.f184032e) == null) {
            str5 = "";
        }
        ci12.f182501j = str5;
        ci12.f182502n = C61926c.m72691p(fp12.f183176d);
        LinkedList<String> linkedList = fp12.f183178f;
        C87412m.m108593f(linkedList, "productInfo.img_urls");
        String str10 = (String) C110818d0.m150917O(linkedList, 0);
        if (str10 == null) {
            str10 = "";
        }
        ci12.f182503o = str10;
        String str11 = fp12.f183177e;
        if (str11 == null) {
            str11 = "";
        }
        ci12.f182504p = str11;
        ci12.f182506r = fp12.f183181i;
        ci12.f182494H = fp12.f183173S != 0;
        WxaAttributes XX = ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106881XX(ci12.f182500i);
        if (XX == null || (str6 = XX.field_bigHeadURL) == null) {
            str6 = "";
        }
        ci12.f182507s = str6;
        if (XX == null || (str7 = XX.field_nickname) == null) {
            str7 = "";
        }
        ci12.f182508t = str7;
        bs4 bs4 = fp12.f183169N;
        C64834xn2 xn22 = null;
        ci12.f182513y = bs4 != null ? bs4.f131295f : null;
        LinkedList<String> linkedList2 = fp12.f183171Q;
        ci12.f182487A = linkedList2 != null ? (String) C110818d0.m150916N(linkedList2) : null;
        LinkedList<String> linkedList3 = fp12.f183171Q;
        ci12.f182489C = linkedList3 != null ? (String) C110818d0.m150917O(linkedList3, 1) : null;
        String str12 = l402 != null ? l402.f184033f : null;
        if (!(str12 == null || str12.length() == 0)) {
            String str13 = l402 != null ? l402.f184034g : null;
            if (!(str13 == null || str13.length() == 0)) {
                if (l402 == null || (str8 = l402.f184033f) == null) {
                    str8 = ci12.f182507s;
                }
                ci12.f182507s = str8;
                if (l402 == null || (str9 = l402.f184034g) == null) {
                    str9 = ci12.f182508t;
                }
                ci12.f182508t = str9;
            }
        }
        if (fp12.f183168M != 0) {
            ci12.f182505q = fp12.f183180h;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("platformHeadImg:");
        sb.append(ci12.f182507s);
        sb.append(" platformName: ");
        sb.append(ci12.f182508t);
        sb.append(", page:");
        sb.append(l402 != null ? l402.f184033f : null);
        sb.append(", ");
        sb.append(l402 != null ? l402.f184034g : null);
        Log.m105924i("Finder.FinderProductShareUtil", sb.toString());
        ci12.f182509u = "";
        LinkedList<z44> linkedList4 = fp12.f183165J;
        C87412m.m108593f(linkedList4, "this.show_box_items");
        Iterator<T> it = linkedList4.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((z44) t).f186625d == 1) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        z44 z44 = (z44) t;
        if (!(z44 == null || (bVar = z44.f186626e) == null)) {
            xn22 = new C64834xn2();
            xn22.parseFrom(bVar.mo123703f());
        }
        if (xn22 != null) {
            long c = C31543z5.m39453c();
            long j2 = xn22.f186353e;
            if (j2 > c && (i = xn22.f186352d) > 0) {
                ci12.f182510v = i;
                ci12.f182511w = j2;
            }
            Log.m105924i("Finder.FinderProductShareUtil", fp12.f183177e + ",discount_price:" + xn22.f186352d + ", serverTime:" + c + ",end_time_ms:" + xn22.f186353e);
        }
        return ci12;
    }

    /* renamed from: f */
    public final C64287ci1 mo83633f(String str) {
        C87412m.m108594g(str, "key");
        ConcurrentHashMap<String, C64287ci1> concurrentHashMap = f168111b;
        if (concurrentHashMap.get(str) == null) {
            Log.m105924i("Finder.FinderProductShareUtil", "getProduct key:" + str + ", result is null");
        }
        return concurrentHashMap.get(str);
    }

    /* renamed from: g */
    public final void mo83634g(C64287ci1 ci12, String str) {
        C87412m.m108594g(ci12, "<this>");
        C87412m.m108594g(str, "TAG");
        Log.m105924i(str, "FinderProductShareObject LogInfo, " + ", liveId:" + ci12.f182495d + ", finderUsername:" + ci12.f182496e + ", finderObjectID:" + ci12.f182497f + ", finderNonceID: " + ci12.f182498g);
        Log.m105924i(str, "FinderProductShareObject LogInfo, " + ", appId:" + ci12.f182500i + ", pagePath:" + ci12.f182501j + ", productId:" + ci12.f182502n + ", ecSource:" + ci12.f182512x);
        Log.m105924i(str, "FinderProductShareObject LogInfo, " + ", productTitle:" + ci12.f182504p + ", marketPrice:" + ci12.f182505q + ", sellingPrice:" + ci12.f182506r + ", coverUrl:" + ci12.f182503o);
        StringBuilder sb = new StringBuilder();
        sb.append("FinderProductShareObject LogInfo, ");
        sb.append(", platformName:");
        sb.append(ci12.f182508t);
        sb.append(", shopWindowId:");
        sb.append(ci12.f182509u);
        sb.append(", platformHeadImg:");
        sb.append(ci12.f182507s);
        Log.m105924i(str, sb.toString());
    }

    /* renamed from: h */
    public final String mo83635h(C64287ci1 ci12) {
        C87412m.m108594g(ci12, "value");
        f168112c = ci12;
        String p = C61926c.m72691p(C31543z5.m39451a());
        f168111b.put(p, ci12);
        mo83634g(ci12, "Finder.FinderProductShareUtilput");
        return p;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: i */
    public final void mo83636i(C64287ci1 ci12, String str, String str2) {
        C87412m.m108594g(ci12, "value");
        C87412m.m108594g(str, "eventName");
        C87412m.m108594g(str2, "params");
        LiveAudienceCommodityLogStruct liveAudienceCommodityLogStruct = new LiveAudienceCommodityLogStruct();
        String str3 = ci12.f182495d;
        String str4 = "";
        if (str3 == null) {
            str3 = str4;
        }
        boolean z = true;
        liveAudienceCommodityLogStruct.f156354d = liveAudienceCommodityLogStruct.mo86045b("LiveID", str3, true);
        String str5 = ci12.f182497f;
        if (str5 == null) {
            str5 = str4;
        }
        liveAudienceCommodityLogStruct.f156355e = liveAudienceCommodityLogStruct.mo86045b("FeedID", str5, true);
        String str6 = ci12.f182496e;
        if (str6 != null) {
            str4 = str6;
        }
        liveAudienceCommodityLogStruct.f156356f = liveAudienceCommodityLogStruct.mo86045b("UserName", str4, true);
        liveAudienceCommodityLogStruct.mo76270s(str);
        liveAudienceCommodityLogStruct.mo76271t(C112551y.m153814n(str2, ",", ";", false));
        liveAudienceCommodityLogStruct.mo86054n();
        if (liveAudienceCommodityLogStruct instanceof FinderFeedDataStruct) {
            FinderFeedDataStruct finderFeedDataStruct = (FinderFeedDataStruct) liveAudienceCommodityLogStruct;
            String str7 = finderFeedDataStruct.f155238k;
            try {
                FinderFeedDataStruct finderFeedDataStruct2 = (FinderFeedDataStruct) liveAudienceCommodityLogStruct;
                String str8 = ((FinderFeedDataStruct) liveAudienceCommodityLogStruct).f155238k;
                if (str8 != null) {
                    if (str8.length() != 0) {
                        z = false;
                    }
                }
                finderFeedDataStruct2.mo76252s(!z ? "..." : str7);
                StringBuilder sb = new StringBuilder();
                sb.append("report");
                FinderFeedDataStruct finderFeedDataStruct3 = (FinderFeedDataStruct) liveAudienceCommodityLogStruct;
                sb.append(18054);
                sb.append(' ');
                String q = liveAudienceCommodityLogStruct.mo1006q();
                C87412m.m108593f(q, "struct.toShowString()");
                sb.append(C112551y.m153814n(q, APLogFileUtil.SEPARATOR_LINE, " ", false));
                Log.m105924i("Finder.FinderProductShareUtil", sb.toString());
                finderFeedDataStruct.mo76252s(str7);
            } catch (Throwable th) {
                finderFeedDataStruct.mo76252s(str7);
                throw th;
            }
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("report");
            sb4.append(23782);
            sb4.append(' ');
            String q2 = liveAudienceCommodityLogStruct.mo1006q();
            C87412m.m108593f(q2, "struct.toShowString()");
            sb4.append(C112551y.m153814n(q2, APLogFileUtil.SEPARATOR_LINE, " ", false));
            Log.m105924i("Finder.FinderProductShareUtil", sb4.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo83637j(android.content.Context r18, java.lang.String r19, long r20, java.lang.String r22, boolean r23, wx3.C15601d<? super te3.C50858pp0> r24) {
        /*
            r17 = this;
            r0 = r24
            boolean r1 = r0 instanceof er1.C58719f2.C58721b
            if (r1 == 0) goto L_0x0017
            r1 = r0
            er1.f2$b r1 = (er1.C58719f2.C58721b) r1
            int r2 = r1.f168119h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.f168119h = r2
            r2 = r17
            goto L_0x001e
        L_0x0017:
            er1.f2$b r1 = new er1.f2$b
            r2 = r17
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r0 = r1.f168117f
            xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
            int r4 = r1.f168119h
            r5 = 2
            r6 = 0
            r7 = 1
            if (r4 == 0) goto L_0x004a
            if (r4 == r7) goto L_0x0042
            if (r4 != r5) goto L_0x003a
            java.lang.Object r3 = r1.f168116e
            bi1.e r3 = (bi1.C0287e) r3
            java.lang.Object r1 = r1.f168115d
            gy3.f0 r1 = (gy3.C8479f0) r1
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x00ac
        L_0x003a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0042:
            java.lang.Object r4 = r1.f168115d
            gy3.f0 r4 = (gy3.C8479f0) r4
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x008b
        L_0x004a:
            kotlin.ResultKt.throwOnFailure(r0)
            gy3.f0 r0 = new gy3.f0
            r0.<init>()
            je1.o0 r4 = new je1.o0
            r10 = 0
            r14 = 0
            if (r22 != 0) goto L_0x005d
            java.lang.String r8 = ""
            r15 = r8
            goto L_0x005f
        L_0x005d:
            r15 = r22
        L_0x005f:
            r8 = r4
            r9 = r19
            r12 = r20
            r8.<init>(r9, r10, r12, r14, r15)
            if (r23 == 0) goto L_0x007b
            android.content.res.Resources r8 = r18.getResources()
            r9 = 2131830090(0x7f11254a, float:1.9293168E38)
            java.lang.String r8 = r8.getString(r9)
            r9 = 500(0x1f4, double:2.47E-321)
            r11 = r18
            r4.mo85582k(r11, r8, r9)
        L_0x007b:
            r1.f168115d = r0
            r1.f168119h = r7
            java.lang.Object r4 = bi1.C0283d.m245c(r4, r6, r1, r7, r6)
            if (r4 != r3) goto L_0x0086
            return r3
        L_0x0086:
            r16 = r4
            r4 = r0
            r0 = r16
        L_0x008b:
            bi1.e r0 = (bi1.C0287e) r0
            boolean r7 = r0 instanceof bi1.C0288f
            if (r7 == 0) goto L_0x00ad
            wx3.f r7 = r0.f854a
            if (r7 != 0) goto L_0x0099
            wx3.f r7 = r1.getContext()
        L_0x0099:
            er1.f2$a r8 = new er1.f2$a
            r8.<init>(r0, r6, r4)
            r1.f168115d = r4
            r1.f168116e = r0
            r1.f168119h = r5
            java.lang.Object r0 = a14.C53895h.m60469g(r7, r8, r1)
            if (r0 != r3) goto L_0x00ab
            return r3
        L_0x00ab:
            r1 = r4
        L_0x00ac:
            r4 = r1
        L_0x00ad:
            T r0 = r4.f27484d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: er1.C58719f2.mo83637j(android.content.Context, java.lang.String, long, java.lang.String, boolean, wx3.d):java.lang.Object");
    }

    /* renamed from: k */
    public final void mo83638k(Context context, C64287ci1 ci12, C32226l<? super C50858pp0, C13598b0> lVar, boolean z) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(ci12, "shareObject");
        C87412m.m108594g(lVar, "callback");
        mo83634g(ci12, "Finder.FinderProductShareUtil_requestProductInfo");
        String str = ci12.f182496e;
        String str2 = str == null ? "" : str;
        String str3 = ci12.f182497f;
        String str4 = "0";
        if (str3 == null) {
            str3 = str4;
        }
        long P = C61926c.m72671P(str3);
        String str5 = ci12.f182502n;
        if (str5 != null) {
            str4 = str5;
        }
        long P2 = C61926c.m72671P(str4);
        String str6 = ci12.f182495d;
        int i = (str6 == null || str6.length() == 0) ^ true ? 1 : 2;
        String str7 = ci12.f182512x;
        C46528o0 o0Var = new C46528o0(str2, P, P2, i, str7 == null ? "" : str7);
        if (z) {
            o0Var.mo85582k(context, context.getResources().getString(C0966R.string.ett), 500);
        }
        o0Var.mo9225i().mo123420E(new C58722c(ci12, lVar));
    }
}
