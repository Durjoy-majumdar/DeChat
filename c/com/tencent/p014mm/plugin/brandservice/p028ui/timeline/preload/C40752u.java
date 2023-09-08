package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload;

import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.C44545a;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32228q;
import g93.C32355a;
import gy3.C45984j0;
import gy3.C87412m;
import gy3.C87413o;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import my3.C34690i;
import my3.C61594j;
import org.xwalk.core.XWalkEnvironment;
import p206nj.C117627q;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C110823p;
import sx3.C36904l0;
import sx3.C64197v;
import te3.C48812b6;
import te3.ah4;
import z04.C112551y;
import z04.C66725r;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.u */
public final class C40752u {

    /* renamed from: A */
    public long f109505A = -1;

    /* renamed from: B */
    public long f109506B = -1;

    /* renamed from: C */
    public long f109507C;

    /* renamed from: D */
    public long f109508D;

    /* renamed from: E */
    public long f109509E;

    /* renamed from: F */
    public long f109510F;

    /* renamed from: G */
    public long f109511G;

    /* renamed from: H */
    public long f109512H;

    /* renamed from: I */
    public long f109513I;

    /* renamed from: J */
    public long f109514J;

    /* renamed from: K */
    public long f109515K;

    /* renamed from: L */
    public boolean f109516L;

    /* renamed from: M */
    public boolean f109517M;

    /* renamed from: N */
    public boolean f109518N;

    /* renamed from: O */
    public boolean f109519O;

    /* renamed from: P */
    public boolean f109520P;

    /* renamed from: Q */
    public boolean f109521Q;

    /* renamed from: R */
    public boolean f109522R;

    /* renamed from: S */
    public boolean f109523S;

    /* renamed from: T */
    public boolean f109524T;

    /* renamed from: U */
    public boolean f109525U;

    /* renamed from: V */
    public int f109526V;

    /* renamed from: W */
    public boolean f109527W;

    /* renamed from: X */
    public boolean f109528X;

    /* renamed from: Y */
    public int f109529Y;

    /* renamed from: Z */
    public long f109530Z;

    /* renamed from: a */
    public ah4 f109531a;

    /* renamed from: a0 */
    public long f109532a0;

    /* renamed from: b */
    public String f109533b = "";

    /* renamed from: b0 */
    public long f109534b0;

    /* renamed from: c */
    public String f109535c = "";

    /* renamed from: c0 */
    public long f109536c0;

    /* renamed from: d */
    public int f109537d;

    /* renamed from: d0 */
    public long f109538d0;

    /* renamed from: e */
    public final C13601g f109539e = C36568h.m40985a(new C40753a(this));

    /* renamed from: e0 */
    public long f109540e0;

    /* renamed from: f */
    public final C13601g f109541f = C36568h.m40985a(new C40756d(this));

    /* renamed from: f0 */
    public long f109542f0;

    /* renamed from: g */
    public final C13601g f109543g = C36568h.m40985a(new C40754b(this));

    /* renamed from: g0 */
    public long f109544g0;

    /* renamed from: h */
    public final C13601g f109545h = C36568h.m40985a(new C40755c(this));

    /* renamed from: h0 */
    public long f109546h0;

    /* renamed from: i */
    public long f109547i = -1;

    /* renamed from: i0 */
    public long f109548i0;

    /* renamed from: j */
    public long f109549j;

    /* renamed from: j0 */
    public String f109550j0 = "";

    /* renamed from: k */
    public long f109551k;

    /* renamed from: k0 */
    public final C13601g f109552k0 = C36568h.m40985a(C40758f.f109578d);

    /* renamed from: l */
    public long f109553l;

    /* renamed from: l0 */
    public boolean f109554l0;

    /* renamed from: m */
    public long f109555m;

    /* renamed from: m0 */
    public boolean f109556m0;

    /* renamed from: n */
    public long f109557n;

    /* renamed from: n0 */
    public int f109558n0 = 10000;

    /* renamed from: o */
    public long f109559o;

    /* renamed from: o0 */
    public final C13601g f109560o0 = C36568h.m40985a(new C40757e(this));

    /* renamed from: p */
    public long f109561p;

    /* renamed from: p0 */
    public long f109562p0 = 3600000;

    /* renamed from: q */
    public long f109563q;

    /* renamed from: r */
    public long f109564r;

    /* renamed from: s */
    public long f109565s;

    /* renamed from: t */
    public long f109566t;

    /* renamed from: u */
    public long f109567u = -1;

    /* renamed from: v */
    public long f109568v = -1;

    /* renamed from: w */
    public long f109569w = -1;

    /* renamed from: x */
    public long f109570x = -1;

    /* renamed from: y */
    public long f109571y = -1;

    /* renamed from: z */
    public long f109572z = -1;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.u$a */
    public static final class C40753a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C40752u f109573d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40753a(C40752u uVar) {
            super(0);
            this.f109573d = uVar;
        }

        public Object invoke() {
            return C40714i.m43955d(this.f109573d.f109535c);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.u$b */
    public static final class C40754b extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ C40752u f109574d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40754b(C40752u uVar) {
            super(0);
            this.f109574d = uVar;
        }

        public Object invoke() {
            C40789z zVar = C40789z.f109640a;
            String str = this.f109574d.f109535c;
            C87412m.m108594g(str, "url");
            String l = C40714i.m43963l(str);
            MultiProcessMMKV multiProcessMMKV = (MultiProcessMMKV) C40789z.f109643d.findSlot(l);
            long j = 0;
            if (multiProcessMMKV != null) {
                j = multiProcessMMKV.getLong(l, 0);
            }
            return Long.valueOf(j);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.u$c */
    public static final class C40755c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C40752u f109575d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40755c(C40752u uVar) {
            super(0);
            this.f109575d = uVar;
        }

        public Object invoke() {
            C48812b6 a = C40789z.f109646g.mo63725a(this.f109575d.f109535c);
            return Integer.valueOf(a != null ? a.f130968j : 0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.u$d */
    public static final class C40756d extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C40752u f109576d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40756d(C40752u uVar) {
            super(0);
            this.f109576d = uVar;
        }

        public Object invoke() {
            String str = (String) ((C36570n) this.f109576d.f109539e).getValue();
            C87412m.m108594g(str, "<this>");
            C86009m1 c = C40714i.m43954c(C40789z.f109644e, str);
            return Integer.valueOf(c != null ? (int) c.mo119980r() : 0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.u$e */
    public static final class C40757e extends C87413o implements C32224a<Long[]> {

        /* renamed from: d */
        public final /* synthetic */ C40752u f109577d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40757e(C40752u uVar) {
            super(0);
            this.f109577d = uVar;
        }

        /* renamed from: a */
        public static final Long[] m44035a(C40752u uVar, long j, long j2) {
            Long[] lArr = {Long.valueOf(j2 - j), Long.valueOf(j2 - uVar.f109549j)};
            C40752u.m44021a(uVar, lArr, j, j2);
            return lArr;
        }

        public Object invoke() {
            this.f109577d.getClass();
            Log.m105926v("MicroMsg.Preload.Kv15862", "terry trace speedMatrix");
            C40752u uVar = this.f109577d;
            if (uVar.f109549j == -1) {
                uVar.f109549j = uVar.f109567u;
            }
            C45984j0 j0Var = new C45984j0(19);
            j0Var.mo71372a(Long.valueOf(this.f109577d.f109555m));
            j0Var.mo71372a(Long.valueOf(this.f109577d.f109553l));
            C40752u uVar2 = this.f109577d;
            C40752u uVar3 = this.f109577d;
            Long[] lArr = {Long.valueOf(uVar2.f109567u - uVar2.f109549j), Long.valueOf(uVar3.f109567u - uVar3.f109549j)};
            C40752u.m44021a(uVar2, lArr, this.f109577d.f109567u);
            j0Var.mo71373b(lArr);
            C40752u uVar4 = this.f109577d;
            C40752u uVar5 = this.f109577d;
            Long[] lArr2 = {Long.valueOf(uVar4.f109568v - uVar4.f109567u), Long.valueOf(uVar5.f109568v - uVar5.f109549j)};
            C40752u uVar6 = this.f109577d;
            C40752u.m44021a(uVar4, lArr2, uVar6.f109567u, uVar6.f109568v);
            j0Var.mo71373b(lArr2);
            C40752u uVar7 = this.f109577d;
            uVar7.getClass();
            this.f109577d.getClass();
            this.f109577d.getClass();
            Long[] lArr3 = {0L, Long.valueOf(0 - this.f109577d.f109549j)};
            this.f109577d.getClass();
            this.f109577d.getClass();
            C40752u.m44021a(uVar7, lArr3, 0, 0);
            j0Var.mo71373b(lArr3);
            C40752u uVar8 = this.f109577d;
            C40752u uVar9 = this.f109577d;
            Long[] lArr4 = {Long.valueOf(uVar8.f109505A - uVar8.f109572z), Long.valueOf(uVar9.f109505A - uVar9.f109549j)};
            C40752u uVar10 = this.f109577d;
            C40752u.m44021a(uVar8, lArr4, uVar10.f109572z, uVar10.f109505A);
            j0Var.mo71373b(lArr4);
            C40752u uVar11 = this.f109577d;
            uVar11.getClass();
            this.f109577d.getClass();
            this.f109577d.getClass();
            Long[] lArr5 = {0L, Long.valueOf(0 - this.f109577d.f109549j)};
            this.f109577d.getClass();
            this.f109577d.getClass();
            C40752u.m44021a(uVar11, lArr5, 0, 0);
            j0Var.mo71373b(lArr5);
            C40752u uVar12 = this.f109577d;
            uVar12.getClass();
            this.f109577d.getClass();
            this.f109577d.getClass();
            Long[] lArr6 = {0L, Long.valueOf(0 - this.f109577d.f109549j)};
            this.f109577d.getClass();
            this.f109577d.getClass();
            C40752u.m44021a(uVar12, lArr6, 0, 0);
            j0Var.mo71373b(lArr6);
            C40752u uVar13 = this.f109577d;
            C40752u uVar14 = this.f109577d;
            Long[] lArr7 = {Long.valueOf(uVar13.f109566t - 0), Long.valueOf(uVar14.f109566t - uVar14.f109549j)};
            this.f109577d.getClass();
            C40752u.m44021a(uVar13, lArr7, 0, this.f109577d.f109566t);
            j0Var.mo71373b(lArr7);
            C40752u uVar15 = this.f109577d;
            C40752u uVar16 = this.f109577d;
            Long[] lArr8 = {Long.valueOf(uVar15.f109565s - uVar15.f109564r), Long.valueOf(uVar16.f109565s - uVar16.f109549j)};
            C40752u uVar17 = this.f109577d;
            C40752u.m44021a(uVar15, lArr8, uVar17.f109564r, uVar17.f109565s);
            j0Var.mo71373b(lArr8);
            C40752u uVar18 = this.f109577d;
            C40752u uVar19 = this.f109577d;
            Long[] lArr9 = {Long.valueOf(uVar18.f109570x - uVar18.f109569w), Long.valueOf(uVar19.f109570x - uVar19.f109549j)};
            C40752u uVar20 = this.f109577d;
            C40752u.m44021a(uVar18, lArr9, uVar20.f109569w, uVar20.f109570x);
            j0Var.mo71373b(lArr9);
            C40752u uVar21 = this.f109577d;
            j0Var.mo71373b(m44035a(uVar21, uVar21.f109507C, uVar21.f109508D));
            C40752u uVar22 = this.f109577d;
            j0Var.mo71373b(m44035a(uVar22, uVar22.f109508D, uVar22.f109509E));
            C40752u uVar23 = this.f109577d;
            j0Var.mo71373b(m44035a(uVar23, uVar23.f109509E, uVar23.f109510F));
            C40752u uVar24 = this.f109577d;
            j0Var.mo71373b(m44035a(uVar24, uVar24.f109510F, uVar24.f109511G));
            C40752u uVar25 = this.f109577d;
            j0Var.mo71373b(m44035a(uVar25, uVar25.f109511G, uVar25.f109512H));
            C40752u uVar26 = this.f109577d;
            j0Var.mo71373b(m44035a(uVar26, uVar26.f109512H, uVar26.f109513I));
            C40752u uVar27 = this.f109577d;
            j0Var.mo71373b(m44035a(uVar27, uVar27.f109513I, uVar27.f109514J));
            C40752u uVar28 = this.f109577d;
            j0Var.mo71373b(m44035a(uVar28, uVar28.f109514J, uVar28.f109515K));
            return (Long[]) j0Var.mo71375d(new Long[j0Var.mo71374c()]);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.u$f */
    public static final class C40758f extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C40758f f109578d = new C40758f();

        public C40758f() {
            super(0);
        }

        public Object invoke() {
            return MMApplicationContext.isMMProcess() ? XWalkEnvironment.MODULE_MM : MMApplicationContext.isToolsProcess() ? XWalkEnvironment.MODULE_TOOLS : "unknow";
        }
    }

    /* renamed from: a */
    public static final Long[] m44021a(C40752u uVar, Long[] lArr, long... jArr) {
        uVar.getClass();
        int i = 0;
        if (!(jArr.length == 0)) {
            long j = jArr[0];
            C36904l0 i2 = new C61594j(1, jArr.length - 1).iterator();
            while (((C34690i) i2).f93287f) {
                j *= jArr[i2.mo59695a()];
            }
            if (j == 0) {
                C87412m.m108594g(lArr, "<this>");
                int length = lArr.length - 1;
                if (length >= 0) {
                    while (true) {
                        lArr[i] = -1L;
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
            }
            return lArr;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* renamed from: n */
    public static final String m44022n(long j, C40752u uVar) {
        return (uVar.mo63651f(j) > j ? 1 : (uVar.mo63651f(j) == j ? 0 : -1)) == 0 ? String.valueOf(j) : "NaN";
    }

    /* renamed from: b */
    public final String mo63647b(float f, int i) {
        return String.format("%." + i + 'f', new Object[]{Float.valueOf(f)});
    }

    /* renamed from: c */
    public final int mo63648c() {
        return ((Number) ((C36570n) this.f109541f).getValue()).intValue();
    }

    /* renamed from: d */
    public final ah4 mo63649d() {
        ah4 ah4 = this.f109531a;
        if (ah4 != null) {
            return ah4;
        }
        C87412m.m108603p("tmplParams");
        throw null;
    }

    /* renamed from: e */
    public final String mo63650e() {
        return (String) ((C36570n) this.f109552k0).getValue();
    }

    /* renamed from: f */
    public final long mo63651f(long j) {
        return Math.min(Math.max(-this.f109562p0, j), this.f109562p0);
    }

    /* renamed from: g */
    public final String mo63652g() {
        StringBuilder sb = new StringBuilder();
        if (!this.f109516L) {
            sb.append("async;");
        }
        if (this.f109520P) {
            sb.append("mounted;");
        }
        if (this.f109524T) {
            sb.append("cache_tmpl;");
        }
        if (C112551y.m153811k(sb)) {
            sb.append("ok;");
        }
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "sb.toString()");
        return sb4;
    }

    /* renamed from: h */
    public final String mo63653h(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder();
        if (C29783w.m38875a().getBoolean("preload_tmpl_test_noredir", false)) {
            sb.append(charSequence + "no re-direct;");
        }
        boolean z = C29783w.m38875a().getBoolean("preload_data", true);
        if (!z) {
            Log.m105924i("MicroMsg.UseNewProfile", "//mppagefastopen data false");
        }
        if (!z) {
            sb.append(charSequence + "no preload data;");
        }
        if (C29783w.m38875a().getBoolean("preload_tmpl_test_no_preload_next", false)) {
            sb.append(charSequence + "no preload webview;");
        }
        if (C29783w.m38875a().getBoolean("preload_data_noexpire", false)) {
            sb.append(charSequence + "data no expire;");
        }
        if (C29783w.m38875a().getBoolean("preload_tmpl_test_no_red", false)) {
            sb.append(charSequence + "no red;");
        }
        String str = mo63649d().f130542j;
        C87412m.m108593f(str, "tmplParams.headers");
        if (!C112551y.m153811k(str)) {
            sb.append(mo63649d().f130542j);
        }
        if (C112551y.m153811k(sb)) {
            sb.append("none;");
        }
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "sb.toString()");
        return sb4;
    }

    /* renamed from: i */
    public final String mo63654i() {
        StringBuilder sb = new StringBuilder();
        if (this.f109526V == 1) {
            sb.append("relanuch;");
        }
        if (!this.f109525U) {
            sb.append("cold;");
        }
        if (C112551y.m153811k(sb)) {
            sb.append("ok;");
        }
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "sb.toString()");
        return sb4;
    }

    /* renamed from: j */
    public final String mo63655j() {
        StringBuilder sb = new StringBuilder();
        if (this.f109521Q) {
            sb.append("zip;");
        }
        if (this.f109522R) {
            sb.append("prefixMP;");
        }
        if (C112551y.m153811k(sb)) {
            sb.append("none;");
        }
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "sb.toString()");
        return sb4;
    }

    /* renamed from: k */
    public final String mo63656k() {
        StringBuilder sb = new StringBuilder();
        if (this.f109526V == 2) {
            sb.append("relanuch;");
        }
        if (!this.f109517M) {
            sb.append("cold;");
        }
        if (!this.f109519O) {
            sb.append("tmpl fail;");
        } else if (!this.f109518N) {
            sb.append("inject fail;");
        }
        if (this.f109556m0) {
            sb.append("timeout;");
        } else if (this.f109554l0) {
            sb.append("h5;");
        }
        if (this.f109523S) {
            sb.append("xweb_cc;");
        }
        if (C112551y.m153811k(sb)) {
            sb.append("ok;");
        }
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "sb.toString()");
        return sb4;
    }

    /* renamed from: l */
    public final void mo63657l(C32228q<? super String, ? super String, ? super List<C13604l<String, String>>, C13598b0> qVar) {
        String str;
        int i;
        C32228q<? super String, ? super String, ? super List<C13604l<String, String>>, C13598b0> qVar2 = qVar;
        C87412m.m108594g(qVar2, "data");
        if (this.f109527W && this.f109528X) {
            C32355a.m39690b(mo63649d().f130544o, 132, 1, true);
            String a = C44545a.f120794a.mo69323a();
            long max = Math.max(this.f109551k, this.f109566t);
            long j = this.f109551k;
            long j2 = this.f109566t;
            this.f109529Y = j < j2 ? 1 : 2;
            long j3 = this.f109549j;
            this.f109530Z = max - j3;
            this.f109542f0 = this.f109559o - j3;
            long j4 = this.f109570x;
            long j5 = j4 - this.f109571y;
            this.f109540e0 = j5;
            this.f109544g0 = j2 - j3;
            this.f109546h0 = j2 - 0;
            this.f109553l = j - j3;
            long j6 = this.f109567u;
            long j7 = j6 - j3;
            this.f109532a0 = j7;
            long j8 = this.f109568v - j6;
            this.f109534b0 = j8;
            long j9 = this.f109563q - this.f109561p;
            this.f109538d0 = j9;
            long j15 = j4 - this.f109569w;
            this.f109536c0 = j15;
            this.f109547i = j5;
            this.f109548i0 = j7 + j8 + j9 + j15 + this.f109557n + this.f109555m;
            Log.m105919d("MicroMsg.Preload.Kv15862", "templateVersion:%d, url:%s, size:%d, networkType:%s, pageFinishTime:%d, pageFinishTimeType:%d, ctWebFirstScreen:%d, a8KeyFinishTime:%d, isWebViewCreated:%b, ctTmplLoad:%d, isSyncGetPageData:%b, getPageDataCostTime:%d, getA8KeyCostTime:%d, webReceivePageDataTime:%d, ctWebCompile:%d, ctWebFirstScreen:%d, tmplType:%d tmplUid:%s webviewKind:%s webviewProcess:%s scene:%d evalPageDataCostTime:%d isWebViewProcessCreated:%b", Integer.valueOf(mo63649d().f130537e), this.f109535c, Integer.valueOf(mo63648c()), a, Long.valueOf(this.f109530Z), Integer.valueOf(this.f109529Y), Long.valueOf(this.f109555m), Long.valueOf(this.f109544g0), Boolean.valueOf(this.f109517M), Long.valueOf(this.f109505A - this.f109572z), Boolean.valueOf(this.f109516L), Long.valueOf(this.f109538d0), Long.valueOf(this.f109546h0), Long.valueOf(this.f109542f0), Long.valueOf(this.f109557n), Long.valueOf(this.f109555m), Integer.valueOf(mo63649d().f130536d), mo63649d().f130541i, this.f109550j0, mo63650e(), Integer.valueOf(this.f109558n0), Long.valueOf(this.f109540e0), Boolean.valueOf(this.f109525U));
            boolean z = BuildInfo.DEBUG;
            try {
                String str2 = this.f109535c;
                C87412m.m108591d(str2);
                str = C117627q.m165909b(str2, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                Log.printErrStackTrace("MicroMsg.Preload.Kv15862", e, "url:%d", this.f109535c);
                str = null;
            }
            C115669n nVar = C115669n.INSTANCE;
            String str3 = "MicroMsg.Preload.Kv15862";
            nVar.mo160131h(15862, Integer.valueOf(mo63649d().f130537e), str, Integer.valueOf(mo63648c()), a, Long.valueOf(mo63651f(this.f109530Z)), Integer.valueOf(this.f109529Y), Long.valueOf(mo63651f(this.f109553l)), Long.valueOf(mo63651f(this.f109544g0)), Integer.valueOf(this.f109517M ? 1 : 0), Long.valueOf(mo63651f(this.f109505A - this.f109572z)), Integer.valueOf(this.f109516L ? 1 : 0), Long.valueOf(mo63651f(this.f109538d0)), Long.valueOf(mo63651f(this.f109546h0)), Long.valueOf(mo63651f(this.f109542f0)), Long.valueOf(mo63651f(this.f109557n)), Long.valueOf(mo63651f(this.f109555m)), Integer.valueOf(mo63649d().f130536d), mo63649d().f130541i, this.f109550j0, mo63650e(), Integer.valueOf(this.f109558n0), Long.valueOf(mo63651f(this.f109540e0)), Integer.valueOf(this.f109525U ? 1 : 0), Long.valueOf(mo63651f(this.f109532a0)), Long.valueOf(mo63651f(this.f109534b0)), Long.valueOf(mo63651f(this.f109536c0)));
            C45984j0 j0Var = new C45984j0(19);
            j0Var.mo71372a(str);
            j0Var.mo71372a(Integer.valueOf(this.f109558n0));
            j0Var.mo71372a(a);
            j0Var.mo71372a(Integer.valueOf(mo63648c()));
            j0Var.mo71372a(mo63649d().f130541i);
            j0Var.mo71372a(mo63650e());
            j0Var.mo71372a(this.f109550j0);
            j0Var.mo71372a(Integer.valueOf(this.f109516L ? 1 : 0));
            j0Var.mo71372a(Integer.valueOf(this.f109525U ^ true ? 1 : 0));
            j0Var.mo71372a(Integer.valueOf(this.f109517M ^ true ? 1 : 0));
            j0Var.mo71372a(Integer.valueOf(this.f109526V));
            j0Var.mo71372a(Integer.valueOf(this.f109520P ? 1 : 0));
            j0Var.mo71372a(Integer.valueOf(this.f109518N ? 1 : 0));
            j0Var.mo71372a(Long.valueOf(this.f109530Z));
            j0Var.mo71373b((Long[]) ((C36570n) this.f109560o0).getValue());
            j0Var.mo71372a(this.f109533b);
            j0Var.mo71372a(Integer.valueOf(this.f109521Q ? 1 : 0));
            j0Var.mo71372a(Integer.valueOf(this.f109523S ? 1 : 0));
            j0Var.mo71372a(Long.valueOf(this.f109506B));
            nVar.mo160131h(16874, j0Var.mo71375d(new Object[j0Var.mo71374c()]));
            C32355a.m39691c(0);
            if (this.f109521Q) {
                C32355a.m39691c(111);
                i = 1;
                C32355a.m39690b(mo63649d().f130544o, 232, 1, true);
            } else {
                i = 1;
            }
            if (this.f109523S) {
                C32355a.m39691c(113);
            }
            C32355a.m39692d(i, this.f109530Z);
            C32355a.m39692d(2, this.f109553l);
            long j16 = this.f109567u - this.f109549j;
            if (this.f109525U) {
                C32355a.m39692d(10, this.f109530Z);
                C32355a.m39692d(11, this.f109553l);
                C32355a.m39692d(12, j16);
                C32355a.m39692d(13, 0);
                C32355a.m39692d(14, this.f109505A - this.f109572z);
                C32355a.m39692d(15, this.f109570x - this.f109569w);
            } else {
                C32355a.m39692d(20, this.f109530Z);
                C32355a.m39692d(21, this.f109553l);
                C32355a.m39692d(22, j16);
                C32355a.m39692d(23, 0);
                if (!this.f109516L) {
                    C32355a.m39692d(24, this.f109565s - this.f109564r);
                    C32355a.m39691c(107);
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f109537d);
            sb.append('s');
            qVar2.invoke("['FirstScreen', 'BindMP', 'WebView', 'WebViewUI', null, 'BindMM', 'JsAPI', 'GetA8Key', 'GetData', 'InjectData']", '[' + C110818d0.m150921S(C110823p.m150996V((Long[]) ((C36570n) this.f109560o0).getValue(), 20), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 63, (Object) null) + ']', C64197v.m75537f(new C13604l("section", "[debug]"), new C13604l("info", (String) ((C36570n) this.f109539e).getValue()), new C13604l("settings", mo63653h("")), new C13604l("section", "[process]"), new C13604l("process", mo63650e()), new C13604l("state", mo63654i()), new C13604l("section", "[webview]"), new C13604l("kind", this.f109550j0), new C13604l("state", mo63656k()), new C13604l("section", "[tmpl]"), new C13604l("uid", mo63649d().f130541i), new C13604l("tmplType", String.valueOf(mo63649d().f130536d)), new C13604l(ProviderConstants.API_COLNAME_FEATURE_VERSION, String.valueOf(mo63649d().f130537e)), new C13604l("md5", mo63649d().f130540h), new C13604l("time", mo63658m(mo63649d().f130543n)), new C13604l("state", mo63655j()), new C13604l("section", "[data]"), new C13604l("dataSize", mo63647b(((float) mo63648c()) / 1024.0f, 2) + "Kb"), new C13604l("dataTime", String.valueOf(this.f109538d0)), new C13604l("cached", mo63658m(((Number) ((C36570n) this.f109543g).getValue()).longValue())), new C13604l(ProviderConstants.API_COLNAME_FEATURE_VERSION, String.valueOf(((Number) ((C36570n) this.f109545h).getValue()).intValue())), new C13604l("expire in", sb.toString()), new C13604l(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, String.valueOf(this.f109558n0)), new C13604l("state", mo63652g())));
            Log.m105924i(str3, "terry performance report:" + this.f109549j + 10 + C110823p.m150987M((Long[]) ((C36570n) this.f109560o0).getValue(), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 63, (Object) null));
        }
    }

    /* renamed from: m */
    public final String mo63658m(long j) {
        String format = new SimpleDateFormat("MM/dd HH:mm:ss").format(new Date(j));
        C87412m.m108593f(format, "SimpleDateFormat(\"MM/dd …m:ss\").format(Date(this))");
        return format;
    }

    public String toString() {
        String str;
        Log.m105926v("MicroMsg.Preload.Kv15862", "terry performance log:\n" + this.f109532a0 + ',' + this.f109534b0 + ',' + (0 - this.f109568v) + ',' + (Math.max(0, this.f109505A) - 0) + ',' + (this.f109569w - Math.max(0, this.f109505A)) + ',' + this.f109536c0);
        StringBuilder sb = new StringBuilder();
        sb.append("terry performance timestamp:\n ");
        sb.append(C110823p.m150987M((Long[]) ((C36570n) this.f109560o0).getValue(), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 63, (Object) null));
        Log.m105926v("MicroMsg.Preload.Kv15862", sb.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("\n            [debug]\n            info: ");
        sb4.append((String) ((C36570n) this.f109539e).getValue());
        sb4.append("\n            settings: ");
        sb4.append(mo63653h("\n"));
        sb4.append("\n\n            [process]\n            process: ");
        sb4.append(mo63650e());
        sb4.append("\n            state: ");
        sb4.append(mo63654i());
        sb4.append("\n\n            [webview]\n            kind: ");
        sb4.append(this.f109550j0);
        sb4.append("\n            state: ");
        sb4.append(mo63656k());
        sb4.append("\n\n            [tmpl]\n            uid: ");
        sb4.append(mo63649d().f130541i);
        sb4.append("\n            tmplType: ");
        sb4.append(mo63649d().f130536d);
        sb4.append("\n            version: ");
        sb4.append(mo63649d().f130537e);
        sb4.append("\n            md5: ");
        sb4.append(mo63649d().f130540h);
        sb4.append("\n            time: ");
        sb4.append(mo63658m(mo63649d().f130543n));
        sb4.append("\n            state: ");
        sb4.append(mo63655j());
        sb4.append("\n\n            [data]\n            dataSize: ");
        sb4.append(mo63647b(((float) mo63648c()) / 1024.0f, 2));
        sb4.append("Kb\n            dataTime: ");
        sb4.append(this.f109538d0);
        sb4.append("\n            cached: ");
        sb4.append(mo63658m(((Number) ((C36570n) this.f109543g).getValue()).longValue()));
        sb4.append("\n            version: ");
        sb4.append(((Number) ((C36570n) this.f109545h).getValue()).intValue());
        sb4.append("\n            expire in: ");
        sb4.append(this.f109537d);
        sb4.append("s\n            scene: ");
        sb4.append(this.f109558n0);
        sb4.append("\n            state: ");
        sb4.append(mo63652g());
        sb4.append("\n\n            [performance](ms)\n            finishType: ");
        sb4.append(this.f109529Y);
        sb4.append("\n            finishTime: ");
        sb4.append(this.f109530Z);
        if (this.f109530Z != Math.max(this.f109544g0, this.f109548i0)) {
            str = XVFSFile.SEPARATOR_CHAR + m44022n(this.f109548i0, this);
        } else {
            str = "";
        }
        sb4.append(str);
        sb4.append("\n            firstScreenFinish: ");
        sb4.append(m44022n(this.f109553l, this));
        sb4.append(XVFSFile.SEPARATOR_CHAR);
        sb4.append(m44022n(this.f109548i0, this));
        sb4.append("\n            a8keyFinish: ");
        sb4.append(this.f109544g0);
        sb4.append("\n\n            client:\n            TmplCostTime: ");
        sb4.append(this.f109505A - this.f109572z);
        sb4.append("\n            WebViewUICostTime: ");
        sb4.append(0);
        sb4.append("\n            NotifyPageCostTime: ");
        sb4.append(this.f109506B - this.f109570x);
        sb4.append("\n\n            1.bindWebViewCostTime: ");
        sb4.append(this.f109532a0);
        sb4.append("\n            2.createWebViewCostTime: ");
        sb4.append(this.f109534b0);
        sb4.append("\n            3.getPageDataCostTime: ");
        sb4.append(this.f109538d0);
        sb4.append("\n            4.injectCostTime: ");
        sb4.append(m44022n(this.f109536c0, this));
        sb4.append("\n            eval cost: ");
        sb4.append(this.f109547i);
        sb4.append("\n\n            js:\n            4.1.onReceivePageData: ");
        sb4.append(this.f109571y - this.f109559o);
        sb4.append("\n            5.ctWebCompile: ");
        sb4.append(this.f109557n);
        sb4.append("\n            6.renderTime: ");
        sb4.append(this.f109555m);
        sb4.append("\n\n            [js]webReceivePageDataTime: ");
        sb4.append(this.f109542f0);
        sb4.append("\n            a8KeyFinishTime: ");
        sb4.append(this.f109544g0);
        sb4.append("\n            getA8KeyCostTime: ");
        sb4.append(this.f109546h0);
        sb4.append("\n        ");
        return C66725r.m78728b(sb4.toString());
    }
}
