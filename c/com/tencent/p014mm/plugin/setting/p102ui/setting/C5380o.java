package com.tencent.p014mm.plugin.setting.p102ui.setting;

import a14.C53895h;
import a14.C53934p0;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d62.C75339i;
import di3.C86312j;
import eb0.C75590o4;
import eb0.C75592q0;
import em0.C86571q;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import hn2.C8619i;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kg3.C76577a;
import ob0.C11385n;
import ob0.C117747y;
import p196ln.C76705f;
import p200lx.C10661v;
import p629ny.C76979h;
import qo3.C47883u;
import qo3.C77426q;
import qo3.C89779i0;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C64197v;
import sx3.C90364q0;
import tm2.C14049d;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.o */
public final class C5380o extends UIComponent implements C11385n {

    /* renamed from: A */
    public static final List<Integer> f21029A = C64197v.m75537f(Integer.valueOf(C86571q.CTRL_INDEX), 995, 996, 997);

    /* renamed from: B */
    public static final Map<Integer, byte[]> f21030B = new LinkedHashMap();

    /* renamed from: C */
    public static final List<C5383c> f21031C;

    /* renamed from: z */
    public static boolean f21032z;

    /* renamed from: d */
    public final boolean f21033d;

    /* renamed from: e */
    public ImageView f21034e;

    /* renamed from: f */
    public ImageView f21035f;

    /* renamed from: g */
    public ImageView f21036g;

    /* renamed from: h */
    public TextView f21037h;

    /* renamed from: i */
    public TextView f21038i;

    /* renamed from: j */
    public TextView f21039j;

    /* renamed from: n */
    public String f21040n;

    /* renamed from: o */
    public C89779i0 f21041o;

    /* renamed from: p */
    public Bitmap f21042p;

    /* renamed from: q */
    public final Map<Integer, byte[]> f21043q;

    /* renamed from: r */
    public boolean f21044r;

    /* renamed from: s */
    public C32226l<? super C5381a, C13598b0> f21045s;

    /* renamed from: t */
    public C5381a f21046t;

    /* renamed from: u */
    public C32224a<C13598b0> f21047u;

    /* renamed from: v */
    public final Map<Integer, Integer> f21048v;

    /* renamed from: w */
    public int f21049w;

    /* renamed from: x */
    public long f21050x;

    /* renamed from: y */
    public int f21051y;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.o$a */
    public enum C5381a {
        White,
        Normal
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.o$b */
    public static final class C5382b {
        public C5382b(C8480h hVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.o$c */
    public static final class C5383c {

        /* renamed from: a */
        public final int f21055a;

        /* renamed from: b */
        public final int f21056b;

        /* renamed from: c */
        public final int f21057c;

        /* renamed from: d */
        public final int f21058d;

        /* renamed from: e */
        public int f21059e;

        /* renamed from: f */
        public List<Integer> f21060f;

        /* renamed from: g */
        public String f21061g;

        public C5383c(int i, int i2, int i3, int i4, int i5, List<Integer> list, String str, int i6, C8480h hVar) {
            i4 = (i6 & 8) != 0 ? 0 : i4;
            i5 = (i6 & 16) != 0 ? 0 : i5;
            list = (i6 & 32) != 0 ? null : list;
            str = (i6 & 64) != 0 ? "" : str;
            C87412m.m108594g(str, "qrUrl");
            this.f21055a = i;
            this.f21056b = i2;
            this.f21057c = i3;
            this.f21058d = i4;
            this.f21059e = i5;
            this.f21060f = list;
            this.f21061g = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5383c)) {
                return false;
            }
            C5383c cVar = (C5383c) obj;
            return this.f21055a == cVar.f21055a && this.f21056b == cVar.f21056b && this.f21057c == cVar.f21057c && this.f21058d == cVar.f21058d && this.f21059e == cVar.f21059e && C87412m.m108589b(this.f21060f, cVar.f21060f) && C87412m.m108589b(this.f21061g, cVar.f21061g);
        }

        public int hashCode() {
            int i = ((((((((this.f21055a * 31) + this.f21056b) * 31) + this.f21057c) * 31) + this.f21058d) * 31) + this.f21059e) * 31;
            List<Integer> list = this.f21060f;
            return ((i + (list == null ? 0 : list.hashCode())) * 31) + this.f21061g.hashCode();
        }

        public String toString() {
            return "QRInfo(sortIndex=" + this.f21055a + ", qrcodeStyle=" + this.f21056b + ", bgType=" + this.f21057c + ", bgResource=" + this.f21058d + ", bgDominatorColorSize=" + this.f21059e + ", bgDominators=" + this.f21060f + ", qrUrl=" + this.f21061g + ')';
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.o$d */
    public static final class C5384d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C5384d f21062d = new C5384d();

        public C5384d() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.o$e */
    public static final class C5385e implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ C5380o f21063a;

        public C5385e(C5380o oVar) {
            this.f21063a = oVar;
        }

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
            this.f21063a.f21047u.invoke();
        }
    }

    static {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_QRCODE_HAS_SET_INT;
        new C5382b((C8480h) null);
        int e = C79758p.f233760a.mo109882e(C104160f.RepairerConfig_Global_ColorfulQRHardcodeStyle16_Int, 0);
        if (e != 0) {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_QRCODE_NOW_SORT_INDEX_INT, 0);
            C86709a0.m107535s().mo121142i().mo119677K(aVar, 0);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_QRCODE_OLD_STYLE_INT, Integer.valueOf(e));
            C86709a0.m107535s().mo121142i().mo119676J(66561, Integer.valueOf(e));
            Log.m105924i("MicroMsg.Setting.ColorfulSelfQRCodeUIC", "repairerCode set");
        }
        boolean b = C87412m.m108589b(C86709a0.m107535s().mo121142i().mo119685f(aVar, 0), 1);
        Log.m105924i("MicroMsg.Setting.ColorfulSelfQRCodeUIC", "init hasSetQr = " + b);
        f21032z = b;
        C5383c[] cVarArr = new C5383c[10];
        cVarArr[0] = new C5383c(0, C86709a0.m107535s().mo121142i().mo119688i(66561, 0), 0, 0, 0, (List) null, (String) null, 120, (C8480h) null);
        cVarArr[1] = new C5383c(1, 997, 0, 0, 0, (List) null, (String) null, 120, (C8480h) null);
        C5383c cVar = new C5383c(2, 995, 0, 0, 0, (List) null, (String) null, 120, (C8480h) null);
        int i = MultiProcessMMKV.getMMKV("qrcode").getInt("color1", 0);
        int i2 = MultiProcessMMKV.getMMKV("qrcode").getInt("color2", 0);
        if (!(i == 0 || i2 == 0)) {
            cVar.f21060f = C64197v.m75539h(Integer.valueOf(i), Integer.valueOf(i2));
            cVar.f21059e = 2;
        }
        C13598b0 b0Var = C13598b0.f38549a;
        cVarArr[2] = cVar;
        C5383c cVar2 = new C5383c(3, 996, 1, 0, 0, (List) null, (String) null, 120, (C8480h) null);
        int i3 = MultiProcessMMKV.getMMKV("qrcode").getInt("color1", 0);
        int i4 = MultiProcessMMKV.getMMKV("qrcode").getInt("color2", 0);
        if (!(i3 == 0 || i4 == 0)) {
            cVar2.f21060f = C64197v.m75539h(Integer.valueOf(i3), Integer.valueOf(i4));
            cVar2.f21059e = 2;
        }
        cVarArr[3] = cVar2;
        cVarArr[4] = new C5383c(4, 996, 2, C0966R.C0969drawable.cm6, 0, (List) null, (String) null, 112, (C8480h) null);
        cVarArr[5] = new C5383c(5, 996, 2, C0966R.C0969drawable.f357386bs2, 0, (List) null, (String) null, 112, (C8480h) null);
        cVarArr[6] = new C5383c(6, 996, 2, C0966R.C0969drawable.bs7, 0, (List) null, (String) null, 112, (C8480h) null);
        cVarArr[7] = new C5383c(7, 996, 2, C0966R.C0969drawable.bs8, 0, (List) null, (String) null, 112, (C8480h) null);
        cVarArr[8] = new C5383c(8, 996, 2, C0966R.C0969drawable.bs9, 0, (List) null, (String) null, 112, (C8480h) null);
        cVarArr[9] = new C5383c(9, 996, 2, C0966R.C0969drawable.brz, 0, (List) null, (String) null, 112, (C8480h) null);
        f21031C = C64197v.m75537f(cVarArr);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5380o(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        boolean z;
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (MultiProcessMMKV.getMMKV("ColorfulQRConfig").getBoolean("focusDisable", false)) {
            z = false;
        } else {
            z = !(((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_colorful_qrcode_disable_locally_generated, 0) == 1);
            Log.m105924i("MicroMsg.ColorfulQRConfig", "canUseQRCodeLocallyGenerated: " + z);
        }
        this.f21033d = z && MultiProcessMMKV.getMMKV("LocalGenFinishSuccess").getBoolean("LocalGenFinishSuccess", true);
        this.f21040n = "";
        this.f21043q = new LinkedHashMap();
        this.f21044r = true;
        this.f21047u = C5384d.f21062d;
        this.f21048v = C90364q0.m113147f(new C13604l(1, 0), new C13604l(2, 1), new C13604l(3, 2), new C13604l(4, 3), new C13604l(5, 4), new C13604l(6, 5), new C13604l(7, 6), new C13604l(8, 7), new C13604l(9, 8), new C13604l(0, 9));
    }

    /* renamed from: c3 */
    public final void mo6351c3(boolean z) {
        mo6358k3(mo6354f3() + 1);
        mo6359l3(z);
    }

    /* renamed from: d3 */
    public final void mo6352d3(C117747y yVar) {
        this.f21051y++;
        C86709a0.m107524d().mo123460f(yVar);
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [lx.v] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: e3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6353e3() {
        /*
            r11 = this;
            java.lang.Class<lx.e0> r0 = p200lx.C46896e0.class
            r1 = 2
            java.lang.Integer[] r1 = new java.lang.Integer[r1]
            r2 = 997(0x3e5, float:1.397E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            r2 = 996(0x3e4, float:1.396E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 1
            r1[r4] = r2
            java.util.Set r1 = sx3.C110826x0.m151015c(r1)
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            r5 = 66561(0x10401, float:9.3272E-41)
            r6 = 0
            java.lang.Object r2 = r2.mo119684e(r5, r6)
            boolean r5 = r2 instanceof java.lang.Integer
            if (r5 == 0) goto L_0x0032
            java.lang.Integer r2 = (java.lang.Integer) r2
            goto L_0x0033
        L_0x0032:
            r2 = r6
        L_0x0033:
            if (r2 == 0) goto L_0x003a
            int r2 = r2.intValue()
            goto L_0x003b
        L_0x003a:
            r2 = 0
        L_0x003b:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r1.add(r5)
            boolean r5 = r11.f21033d
            java.lang.String r7 = "createQRCode return null!"
            java.lang.String r8 = "MicroMsg.Setting.ColorfulSelfQRCodeUIC"
            if (r5 == 0) goto L_0x0092
            java.util.List<java.lang.Integer> r1 = f21029A
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            boolean r1 = r1.contains(r5)
            if (r1 != 0) goto L_0x0073
            di3.d r1 = di3.C86312j.m106911c(r0)
            lx.e0 r1 = (p200lx.C46896e0) r1
            java.lang.String r5 = r11.f21040n
            lx.v r1 = r1.mo71988dU(r5, r2, r4)
            boolean r2 = r1 instanceof ob0.C117747y
            if (r2 == 0) goto L_0x0069
            ob0.y r1 = (ob0.C117747y) r1
            goto L_0x006a
        L_0x0069:
            r1 = r6
        L_0x006a:
            if (r1 != 0) goto L_0x0070
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r7)
            return
        L_0x0070:
            r11.mo6352d3(r1)
        L_0x0073:
            di3.d r0 = di3.C86312j.m106911c(r0)
            lx.e0 r0 = (p200lx.C46896e0) r0
            java.lang.String r1 = r11.f21040n
            r2 = 994(0x3e2, float:1.393E-42)
            lx.v r0 = r0.mo71988dU(r1, r2, r4)
            boolean r1 = r0 instanceof ob0.C117747y
            if (r1 == 0) goto L_0x0088
            r6 = r0
            ob0.y r6 = (ob0.C117747y) r6
        L_0x0088:
            if (r6 != 0) goto L_0x008e
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r7)
            return
        L_0x008e:
            r11.mo6352d3(r6)
            goto L_0x00ca
        L_0x0092:
            java.util.Iterator r1 = r1.iterator()
        L_0x0096:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00ca
            java.lang.Object r2 = r1.next()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            di3.d r5 = di3.C86312j.m106911c(r0)
            lx.e0 r5 = (p200lx.C46896e0) r5
            java.lang.String r9 = r11.f21040n
            hn2.i r10 = hn2.C8619i.f27728a
            java.lang.String r10 = r10.mo9493e(r2)
            lx.v r2 = r5.et0(r9, r2, r4, r10)
            boolean r5 = r2 instanceof ob0.C117747y
            if (r5 == 0) goto L_0x00bf
            ob0.y r2 = (ob0.C117747y) r2
            goto L_0x00c0
        L_0x00bf:
            r2 = r6
        L_0x00c0:
            if (r2 != 0) goto L_0x00c6
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r7)
            return
        L_0x00c6:
            r11.mo6352d3(r2)
            goto L_0x0096
        L_0x00ca:
            qo3.i0 r0 = r11.f21041o
            if (r0 == 0) goto L_0x00d5
            boolean r0 = r0.isShowing()
            if (r0 != r4) goto L_0x00d5
            r3 = 1
        L_0x00d5:
            if (r3 != 0) goto L_0x00f6
            boolean r0 = r11.f21044r
            if (r0 == 0) goto L_0x00f6
            android.app.Activity r1 = r11.getContext()
            r0 = 2131821704(0x7f110488, float:1.9276159E38)
            java.lang.String r2 = r11.getString(r0)
            r0 = 2131834300(0x7f1135bc, float:1.9301706E38)
            java.lang.String r3 = r11.getString(r0)
            r4 = 1
            r5 = 1
            r6 = 0
            qo3.i0 r0 = nj3.C76879j.m92723Q(r1, r2, r3, r4, r5, r6)
            r11.f21041o = r0
        L_0x00f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.setting.p102ui.setting.C5380o.mo6353e3():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo6354f3() {
        /*
            r4 = this;
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_QRCODE_NOW_SORT_INDEX_INT
            r2 = 0
            java.lang.Object r0 = r0.mo119685f(r1, r2)
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x0016
            r2 = r0
            java.lang.Integer r2 = (java.lang.Integer) r2
        L_0x0016:
            r0 = 0
            if (r2 == 0) goto L_0x001e
            int r1 = r2.intValue()
            goto L_0x001f
        L_0x001e:
            r1 = 0
        L_0x001f:
            r2 = 1
            if (r1 < 0) goto L_0x002c
            java.util.List<com.tencent.mm.plugin.setting.ui.setting.o$c> r3 = f21031C
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x002c
            r3 = 1
            goto L_0x002d
        L_0x002c:
            r3 = 0
        L_0x002d:
            if (r3 != 0) goto L_0x0034
            boolean r3 = f21032z
            if (r3 != 0) goto L_0x0034
            goto L_0x005f
        L_0x0034:
            if (r1 < 0) goto L_0x003f
            java.util.List<com.tencent.mm.plugin.setting.ui.setting.o$c> r3 = f21031C
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x003f
            r0 = 1
        L_0x003f:
            if (r0 != 0) goto L_0x0043
            r0 = 1
            goto L_0x0044
        L_0x0043:
            r0 = r1
        L_0x0044:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getLastIndex:"
            r2.append(r3)
            r2.append(r1)
            r1 = 32
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "MicroMsg.Setting.ColorfulSelfQRCodeUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
        L_0x005f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.setting.p102ui.setting.C5380o.mo6354f3():int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo6355g3() {
        /*
            r6 = this;
            boolean r0 = f21032z
            java.lang.String r1 = "getLastStyle(): "
            java.lang.String r2 = "MicroMsg.Setting.ColorfulSelfQRCodeUIC"
            r3 = 0
            if (r0 != 0) goto L_0x0034
            int r0 = r6.mo6354f3()
            if (r0 != 0) goto L_0x0034
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_QRCODE_OLD_STYLE_INT
            int r0 = r0.mo119689j(r4, r3)
            if (r0 != 0) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r3 = r0
        L_0x0021:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            return r3
        L_0x0034:
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r4 = 66561(0x10401, float:9.3272E-41)
            r5 = 0
            java.lang.Object r0 = r0.mo119684e(r4, r5)
            boolean r4 = r0 instanceof java.lang.Integer
            if (r4 == 0) goto L_0x004b
            r5 = r0
            java.lang.Integer r5 = (java.lang.Integer) r5
        L_0x004b:
            if (r5 == 0) goto L_0x0051
            int r3 = r5.intValue()
        L_0x0051:
            int r0 = r6.mo6354f3()
            if (r0 != 0) goto L_0x006c
            if (r3 == 0) goto L_0x006c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            return r3
        L_0x006c:
            int r0 = r6.mo6354f3()
            if (r0 != 0) goto L_0x0076
            r0 = 1
            r6.mo6358k3(r0)
        L_0x0076:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.util.List<com.tencent.mm.plugin.setting.ui.setting.o$c> r1 = f21031C
            int r3 = r6.mo6354f3()
            java.lang.Object r3 = r1.get(r3)
            com.tencent.mm.plugin.setting.ui.setting.o$c r3 = (com.tencent.p014mm.plugin.setting.p102ui.setting.C5380o.C5383c) r3
            int r3 = r3.f21056b
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            int r0 = r6.mo6354f3()
            java.lang.Object r0 = r1.get(r0)
            com.tencent.mm.plugin.setting.ui.setting.o$c r0 = (com.tencent.p014mm.plugin.setting.p102ui.setting.C5380o.C5383c) r0
            int r0 = r0.f21056b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.setting.p102ui.setting.C5380o.mo6355g3():int");
    }

    /* renamed from: i3 */
    public final int mo6356i3() {
        Integer num = this.f21048v.get(Integer.valueOf(mo6354f3()));
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    /* renamed from: j3 */
    public final void mo6357j3() {
        long currentTimeMillis = System.currentTimeMillis();
        this.f21050x = currentTimeMillis;
        String.valueOf(currentTimeMillis);
        int i = this.f21051y - 1;
        this.f21051y = i;
        int max = Math.max(i, 0);
        this.f21051y = max;
        if (max == 0) {
            C89779i0 i0Var = this.f21041o;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            this.f21041o = null;
            mo6359l3(true);
        }
    }

    /* renamed from: k3 */
    public final void mo6358k3(int i) {
        int i2 = 1;
        boolean z = false;
        if ((i >= 0 && i < f21031C.size()) || f21032z) {
            if (i >= 0 && i < f21031C.size()) {
                z = true;
            }
            if (z) {
                i2 = i;
            }
        } else {
            i2 = 0;
        }
        Log.m105924i("MicroMsg.Setting.ColorfulSelfQRCodeUIC", "saveLastIndex: index:" + i + ", i:" + i2);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_QRCODE_NOW_SORT_INDEX_INT, Integer.valueOf(i2));
    }

    /* renamed from: l3 */
    public final void mo6359l3(boolean z) {
        int i;
        ImageView imageView;
        List<C5383c> list = f21031C;
        C5383c cVar = list.get(mo6354f3());
        if (list.get(3).f21059e == 0 && list.get(3).f21056b == 995) {
            Log.m105920e("MicroMsg.Setting.ColorfulSelfQRCodeUIC", "set COLORSTYLE_COLORFUL error, skip!");
            mo6351c3(z);
        }
        byte[] bArr = (byte[]) ((LinkedHashMap) this.f21043q).get(Integer.valueOf(cVar.f21056b));
        if ((bArr != null ? bArr.length : 0) > 0) {
            byte[] bArr2 = (byte[]) ((LinkedHashMap) this.f21043q).get(Integer.valueOf(cVar.f21056b));
            if (bArr2 != null) {
                this.f21049w = 0;
                f21030B.put(Integer.valueOf(cVar.f21056b), bArr2);
                Bitmap decodeByteArray = BitmapUtil.decodeByteArray(bArr2);
                this.f21042p = decodeByteArray;
                ImageView imageView2 = this.f21035f;
                if (imageView2 != null) {
                    imageView2.setImageBitmap(decodeByteArray);
                }
                this.f21044r = false;
            }
        } else {
            int i2 = cVar.f21056b;
            Map<Integer, byte[]> map = f21030B;
            byte[] bArr3 = (byte[]) ((LinkedHashMap) map).get(Integer.valueOf(i2));
            if ((bArr3 != null ? bArr3.length : 0) > 0) {
                byte[] bArr4 = (byte[]) ((LinkedHashMap) map).get(Integer.valueOf(cVar.f21056b));
                if (bArr4 != null) {
                    ImageView imageView3 = this.f21035f;
                    if (imageView3 != null) {
                        imageView3.setImageBitmap(BitmapUtil.decodeByteArray(bArr4));
                    }
                    this.f21044r = false;
                }
            } else {
                C8619i iVar = C8619i.f27728a;
                byte[] c = iVar.mo9491c(cVar.f21056b);
                if ((c != null ? c.length : 0) > 0) {
                    byte[] c2 = iVar.mo9491c(cVar.f21056b);
                    if (c2 != null) {
                        this.f21049w = 0;
                        ImageView imageView4 = this.f21035f;
                        if (imageView4 != null) {
                            imageView4.setImageBitmap(BitmapUtil.decodeByteArray(c2));
                        }
                        this.f21044r = false;
                    }
                } else if (this.f21049w < list.size()) {
                    this.f21049w++;
                    mo6351c3(z);
                    return;
                } else if (z) {
                    MultiProcessMMKV.getMMKV("qrcode_url").clearAll();
                    int[] iArr = {995, 996, 997};
                    C86009m1[] u = C8619i.f27729b.mo119984u();
                    if (u != null) {
                        for (C86009m1 m1Var : u) {
                            for (int i3 = 0; i3 < 3; i3++) {
                                int i4 = iArr[i3];
                                C8619i.f27728a.mo9490b(i4);
                                if (m1Var.getName().equals(String.valueOf(i4))) {
                                    m1Var.mo119966f();
                                }
                            }
                        }
                    }
                    C77426q qVar = new C77426q(getContext());
                    qVar.mo107595g(getContext().getString(C0966R.string.mxq));
                    qVar.mo107602n(getContext().getString(C0966R.string.mxp));
                    qVar.mo107589a(false);
                    qVar.mo107600l(new C5385e(this));
                    qVar.mo107603o();
                } else {
                    this.f21049w = 0;
                }
            }
        }
        int i5 = cVar.f21057c;
        if (i5 == 0) {
            ImageView imageView5 = this.f21036g;
            if (imageView5 != null) {
                imageView5.setImageResource(C0966R.color.f2975b6);
            }
        } else if (i5 == 1) {
            C13598b0 b0Var = null;
            if (cVar.f21059e == 2) {
                List<Integer> list2 = cVar.f21060f;
                if (list2 != null && list2.size() == 2) {
                    int[] iArr2 = new int[2];
                    List<Integer> list3 = cVar.f21060f;
                    if (list3 != null) {
                        iArr2 = C110818d0.m150952x0(list3);
                        b0Var = C13598b0.f38549a;
                    }
                    if (b0Var == null) {
                        mo6351c3(true);
                        return;
                    }
                    GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BL_TR, iArr2);
                    gradientDrawable.setGradientType(0);
                    gradientDrawable.setGradientRadius(1.0f);
                    ImageView imageView6 = this.f21036g;
                    if (imageView6 != null) {
                        imageView6.setImageDrawable(gradientDrawable);
                    }
                }
            }
            Log.m105920e("MicroMsg.Setting.ColorfulSelfQRCodeUIC", "QR_BG_TYPE_SPECIAL backgroud set error, try next index");
            mo6351c3(true);
            return;
        } else if (!(i5 != 2 || (i = cVar.f21058d) == 0 || (imageView = this.f21036g) == null)) {
            imageView.setImageResource(i);
        }
        C5381a aVar = C5381a.White;
        if (cVar.f21057c == 0) {
            aVar = C5381a.Normal;
        }
        if (aVar != this.f21046t) {
            this.f21046t = aVar;
            int ordinal = aVar.ordinal();
            if (ordinal == 0) {
                TextView textView = this.f21037h;
                if (textView != null) {
                    textView.setTextColor(getActivity().getResources().getColor(C0966R.color.BW_100_Alpha_0_6));
                }
                TextView textView2 = this.f21038i;
                if (textView2 != null) {
                    textView2.setTextColor(getActivity().getResources().getColor(C0966R.color.BW_100_Alpha_0_9));
                }
                TextView textView3 = this.f21039j;
                if (textView3 != null) {
                    textView3.setTextColor(getActivity().getResources().getColor(C0966R.color.BW_100_Alpha_0_6));
                }
            } else if (ordinal == 1) {
                TextView textView4 = this.f21037h;
                if (textView4 != null) {
                    textView4.setTextColor(getActivity().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_3));
                }
                TextView textView5 = this.f21038i;
                if (textView5 != null) {
                    textView5.setTextColor(getActivity().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
                }
                TextView textView6 = this.f21039j;
                if (textView6 != null) {
                    textView6.setTextColor(getActivity().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_3));
                }
            }
            C32226l<? super C5381a, C13598b0> lVar = this.f21045s;
            if (lVar != null) {
                lVar.invoke(aVar);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C86709a0.m107524d().mo123455a(168, this);
        if (!f21032z) {
            Object e = C86709a0.m107535s().mo121142i().mo119684e(66561, (Object) null);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_QRCODE_OLD_STYLE_INT, e);
            Log.m105924i("MicroMsg.Setting.ColorfulSelfQRCodeUIC", "recordOldStyle:" + e);
        }
    }

    public void onCreateAfter(Bundle bundle) {
        Class cls = C75339i.class;
        String s = C75592q0.m90789s();
        C87412m.m108593f(s, "getUsernameFromUserInfo()");
        this.f21040n = s;
        ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(this.f21034e, C75592q0.m90789s());
        C75339i iVar = (C75339i) C86312j.m106911c(cls);
        TextPaint textPaint = null;
        Object e = C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null);
        String str = e instanceof String ? (String) e : null;
        if (str == null) {
            str = "";
        }
        String displayName = iVar.getDisplayName(str);
        Log.m105919d("MicroMsg.Setting.ColorfulSelfQRCodeUIC", "nick name = %s", displayName);
        TextView textView = this.f21038i;
        if (textView != null) {
            textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).op0(getActivity(), displayName, C76577a.m92157h(getContext(), C0966R.dimen.f3881hq)));
        }
        TextView textView2 = this.f21038i;
        if (textView2 != null) {
            textPaint = textView2.getPaint();
        }
        C85875k4.m106191k0(textPaint);
        C75590o4 a = C75590o4.m90740a();
        String nullAsNil = Util.nullAsNil(a.mo105937d());
        String str2 = ((C75339i) C86312j.m106911c(cls)).K90(nullAsNil) + ' ' + Util.nullAsNil(a.mo105936c());
        Log.m105919d("MicroMsg.Setting.ColorfulSelfQRCodeUIC", "display location = %s", str2);
        TextView textView3 = this.f21039j;
        if (textView3 != null) {
            textView3.setText(str2);
        }
        Bitmap bitmap = this.f21042p;
        if (bitmap == null) {
            Log.m105919d("MicroMsg.Setting.ColorfulSelfQRCodeUIC", "%s", "bitmap == null");
            mo6353e3();
            return;
        }
        ImageView imageView = this.f21035f;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        String str = null;
        this.f21034e = null;
        this.f21035f = null;
        this.f21036g = null;
        this.f21037h = null;
        this.f21038i = null;
        this.f21039j = null;
        Bitmap bitmap = this.f21042p;
        if (bitmap != null && !bitmap.isRecycled()) {
            Object[] objArr = new Object[1];
            Bitmap bitmap2 = this.f21042p;
            if (bitmap2 != null) {
                str = bitmap2.toString();
            }
            objArr[0] = str;
            Log.m105925i("MicroMsg.Setting.ColorfulSelfQRCodeUIC", "bitmap recycle %s", objArr);
            Bitmap bitmap3 = this.f21042p;
            if (bitmap3 != null) {
                bitmap3.recycle();
            }
        }
        C86709a0.m107524d().mo123470p(168, this);
        if (mo6354f3() != 0) {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_QRCODE_HAS_SET_INT, 1);
            f21032z = true;
            Log.m105924i("MicroMsg.Setting.ColorfulSelfQRCodeUIC", "checkSetNewQR");
        }
    }

    public void onResume() {
        super.onResume();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        TextView textView;
        if (yVar instanceof C10661v) {
            C10661v vVar = (C10661v) yVar;
            Log.m105924i("MicroMsg.Setting.ColorfulSelfQRCodeUIC", "onGetQRSceneEnd() called with: errType = " + i + ", errCode = " + i2 + ", errMsg = " + str + ", respStyle = " + vVar.mo10928S() + '.');
            if (C14049d.m13402a().mo93165v5(getContext(), i, i2, str)) {
                mo6357j3();
            } else if (i == 0 && i2 == 0) {
                if (!Util.isNullOrNil(vVar.mo10931c()) && (textView = this.f21037h) != null) {
                    textView.setText(vVar.mo10931c());
                }
                C53895h.m60466d(getLifecycleScope(), (C66212f) null, (C53934p0) null, new C5395r(this, vVar, (C15601d<? super C5395r>) null), 3, (Object) null);
            } else {
                mo6357j3();
            }
        }
    }
}
