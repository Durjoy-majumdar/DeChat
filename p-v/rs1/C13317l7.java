package rs1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import bl3.C113200q;
import c30.C104289g;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8807v3;
import rx3.C13601g;
import rx3.C36568h;

@C113200q(initialMode = 2)
/* renamed from: rs1.l7 */
public final class C13317l7 extends UIComponent implements C8807v3 {

    /* renamed from: d */
    public final C13601g f37787d = C36568h.m40985a(new C13321d(this));

    /* renamed from: e */
    public final C13601g f37788e = C36568h.m40985a(new C13320c(this));

    /* renamed from: f */
    public final C13601g f37789f = C36568h.m40985a(new C13318a(this));

    /* renamed from: g */
    public long f37790g;

    /* renamed from: h */
    public final C13601g f37791h = C36568h.m40985a(new C13319b(this));

    /* renamed from: i */
    public boolean f37792i;

    /* renamed from: rs1.l7$a */
    public static final class C13318a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C13317l7 f37793d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13318a(C13317l7 l7Var) {
            super(0);
            this.f37793d = l7Var;
        }

        public Object invoke() {
            String stringExtra = this.f37793d.getActivity().getIntent().getStringExtra("KEY_RINGTONE_REPORT_JSON");
            return stringExtra == null ? "" : stringExtra;
        }
    }

    /* renamed from: rs1.l7$b */
    public static final class C13319b extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C13317l7 f37794d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13319b(C13317l7 l7Var) {
            super(0);
            this.f37794d = l7Var;
        }

        /* JADX WARNING: type inference failed for: r2v0 */
        /* JADX WARNING: type inference failed for: r2v1, types: [com.tencent.mm.plugin.finder.ui.MMFinderUI] */
        /* JADX WARNING: type inference failed for: r2v4, types: [com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment] */
        /* JADX WARNING: type inference failed for: r2v7 */
        /* JADX WARNING: type inference failed for: r2v8 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r4 = this;
                rs1.l7 r0 = r4.f37794d
                boolean r0 = r0.isBelongFragment()
                r1 = 0
                r2 = 0
                if (r0 == 0) goto L_0x001e
                rs1.l7 r0 = r4.f37794d
                androidx.fragment.app.Fragment r0 = r0.getFragment()
                boolean r3 = r0 instanceof com.tencent.p014mm.plugin.finder.p056ui.fragment.MMFinderFragment
                if (r3 == 0) goto L_0x0017
                r2 = r0
                com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment r2 = (com.tencent.p014mm.plugin.finder.p056ui.fragment.MMFinderFragment) r2
            L_0x0017:
                if (r2 == 0) goto L_0x0031
                int r1 = r2.mo2203R()
                goto L_0x0031
            L_0x001e:
                rs1.l7 r0 = r4.f37794d
                android.app.Activity r0 = r0.getContext()
                boolean r3 = r0 instanceof com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI
                if (r3 == 0) goto L_0x002b
                r2 = r0
                com.tencent.mm.plugin.finder.ui.MMFinderUI r2 = (com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI) r2
            L_0x002b:
                if (r2 == 0) goto L_0x0031
                int r1 = r2.mo2194I7()
            L_0x0031:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: rs1.C13317l7.C13319b.invoke():java.lang.Object");
        }
    }

    /* renamed from: rs1.l7$c */
    public static final class C13320c extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C13317l7 f37795d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13320c(C13317l7 l7Var) {
            super(0);
            this.f37795d = l7Var;
        }

        public Object invoke() {
            String stringExtra = this.f37795d.getActivity().getIntent().getStringExtra("finder_username");
            return stringExtra == null ? "" : stringExtra;
        }
    }

    /* renamed from: rs1.l7$d */
    public static final class C13321d extends C87413o implements C32224a<C104289g> {

        /* renamed from: d */
        public final /* synthetic */ C13317l7 f37796d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13321d(C13317l7 l7Var) {
            super(0);
            this.f37796d = l7Var;
        }

        public Object invoke() {
            String stringExtra = this.f37796d.getIntent().getStringExtra("key_udf_kv");
            if (stringExtra == null) {
                stringExtra = "";
            }
            return stringExtra.length() > 0 ? new C104289g(stringExtra) : new C104289g();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13317l7(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: R2 */
    public void mo9633R2(boolean z) {
        this.f37792i = z;
    }

    /* renamed from: c3 */
    public final void mo12758c3(String str, String str2) {
        C87412m.m108594g(str, "key");
        C87412m.m108594g(str2, "value");
        mo12760e3().put(str, str2);
    }

    /* renamed from: d3 */
    public final int mo12759d3() {
        return ((Number) this.f37791h.getValue()).intValue();
    }

    /* renamed from: e3 */
    public final C104289g mo12760e3() {
        return (C104289g) this.f37787d.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0041 A[EDGE_INSN: B:96:0x0041->B:21:0x0041 ?: BREAK  , SYNTHETIC] */
    /* renamed from: f3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12761f3(boolean r12) {
        /*
            r11 = this;
            boolean r0 = r11.isBelongFragment()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x000a
            goto L_0x0041
        L_0x000a:
            android.app.Activity r0 = r11.getContext()
            boolean r4 = r0 instanceof com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI
            if (r4 == 0) goto L_0x0015
            com.tencent.mm.plugin.finder.ui.MMFinderUI r0 = (com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI) r0
            goto L_0x0016
        L_0x0015:
            r0 = r3
        L_0x0016:
            if (r0 == 0) goto L_0x0041
            boolean r4 = r11.f37792i
            r4 = r4 ^ r1
            if (r4 == 0) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            r0 = r3
        L_0x001f:
            if (r0 == 0) goto L_0x0041
            java.util.HashSet r0 = r0.getUiComponents()
            if (r0 == 0) goto L_0x0041
            java.util.Iterator r0 = r0.iterator()
        L_0x002b:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0041
            java.lang.Object r4 = r0.next()
            com.tencent.mm.ui.component.UIComponent r4 = (com.tencent.p014mm.p136ui.component.UIComponent) r4
            boolean r5 = r4 instanceof com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC
            if (r5 != 0) goto L_0x003f
            boolean r4 = r4 instanceof com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTabUIC
            if (r4 == 0) goto L_0x002b
        L_0x003f:
            r0 = 1
            goto L_0x0042
        L_0x0041:
            r0 = 0
        L_0x0042:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "report21874: isExit = "
            r4.append(r5)
            r4.append(r12)
            java.lang.String r5 = ", commentScene = "
            r4.append(r5)
            int r5 = r11.mo12759d3()
            r4.append(r5)
            java.lang.String r5 = ", visibleTimestamp = "
            r4.append(r5)
            long r5 = r11.f37790g
            r4.append(r5)
            java.lang.String r5 = ", isContainFragment = "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r5 = " udf_kv:"
            r4.append(r5)
            c30.g r5 = r11.mo12760e3()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "FinderPageExposeUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            int r4 = r11.mo12759d3()
            if (r4 == 0) goto L_0x01ee
            if (r0 == 0) goto L_0x008c
            goto L_0x01ee
        L_0x008c:
            r4 = 0
            if (r12 == 0) goto L_0x0096
            long r6 = r11.f37790g
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x009e
        L_0x0096:
            if (r12 != 0) goto L_0x009f
            long r6 = r11.f37790g
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x009f
        L_0x009e:
            return
        L_0x009f:
            androidx.fragment.app.Fragment r0 = r11.getFragment()
            if (r0 == 0) goto L_0x00c1
            bl3.r r0 = bl3.C39818r.f106831a
            androidx.fragment.app.Fragment r6 = r11.getFragment()
            gy3.C87412m.m108591d(r6)
            bl3.r$a r0 = r0.mo62445d(r6)
            java.lang.Class<rs1.s8> r6 = rs1.C13442s8.class
            bl3.t r0 = r0.mo62449e(r6)
            rs1.s8 r0 = (rs1.C13442s8) r0
            if (r0 == 0) goto L_0x00d2
            te3.hj1 r0 = r0.mo12861q3()
            goto L_0x00d3
        L_0x00c1:
            rs1.s8$a r0 = rs1.C13442s8.f38060Q0
            android.app.Activity r6 = r11.getContext()
            rs1.s8 r0 = r0.mo12873f(r6)
            if (r0 == 0) goto L_0x00d2
            te3.hj1 r0 = r0.mo12861q3()
            goto L_0x00d3
        L_0x00d2:
            r0 = r3
        L_0x00d3:
            com.tencent.mm.autogen.mmdata.rpt.FinderPageExposeStruct r6 = new com.tencent.mm.autogen.mmdata.rpt.FinderPageExposeStruct
            r6.<init>()
            if (r0 == 0) goto L_0x00dd
            java.lang.String r7 = r0.f134670d
            goto L_0x00de
        L_0x00dd:
            r7 = r3
        L_0x00de:
            r6.mo1036z(r7)
            if (r0 == 0) goto L_0x00e6
            java.lang.String r7 = r0.f134671e
            goto L_0x00e7
        L_0x00e6:
            r7 = r3
        L_0x00e7:
            r6.mo1032v(r7)
            if (r0 == 0) goto L_0x00ee
            java.lang.String r3 = r0.f134672f
        L_0x00ee:
            r6.mo1029s(r3)
            int r3 = r11.mo12759d3()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r6.mo1030t(r3)
            if (r0 == 0) goto L_0x0101
            int r3 = r0.f134677n
            goto L_0x0102
        L_0x0101:
            r3 = 0
        L_0x0102:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r6.mo1035y(r3)
            r6.f9879g = r12
            long r7 = eb0.C31543z5.m39453c()
            java.lang.String r3 = java.lang.String.valueOf(r7)
            r6.mo1031u(r3)
            rx3.g r3 = r11.f37788e
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            r6.mo1033w(r3)
            if (r12 == 0) goto L_0x012d
            long r7 = eb0.C31543z5.m39453c()
            long r9 = r11.f37790g
            long r7 = r7 - r9
            goto L_0x012e
        L_0x012d:
            r7 = r4
        L_0x012e:
            r6.f9885m = r7
            rx3.g r3 = r11.f37789f
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r7 = "bellInfo"
            gy3.C87412m.m108593f(r3, r7)
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x0147
            r3 = 1
            goto L_0x0148
        L_0x0147:
            r3 = 0
        L_0x0148:
            if (r3 == 0) goto L_0x015d
            c30.g r3 = r11.mo12760e3()
            rx3.g r7 = r11.f37789f
            rx3.n r7 = (rx3.C36570n) r7
            java.lang.Object r7 = r7.getValue()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = "bell_info"
            r3.put(r8, r7)
        L_0x015d:
            if (r12 != 0) goto L_0x0182
            int r3 = r11.mo12759d3()
            r7 = 32
            if (r3 == r7) goto L_0x016f
            int r3 = r11.mo12759d3()
            r7 = 33
            if (r3 != r7) goto L_0x0182
        L_0x016f:
            c30.g r3 = r11.mo12760e3()
            rx3.g r7 = r11.f37788e
            rx3.n r7 = (rx3.C36570n) r7
            java.lang.Object r7 = r7.getValue()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = "finder_username"
            r3.put(r8, r7)
        L_0x0182:
            c30.g r3 = r11.mo12760e3()
            int r3 = r3.length()
            java.lang.String r7 = ";"
            java.lang.String r8 = ","
            java.lang.String r9 = ""
            if (r3 <= 0) goto L_0x01a4
            c30.g r3 = r11.mo12760e3()
            java.lang.String r3 = r3.toString()
            java.lang.String r10 = "kvJson.toString()"
            gy3.C87412m.m108593f(r3, r10)
            java.lang.String r3 = z04.C112551y.m153814n(r3, r8, r7, r2)
            goto L_0x01a5
        L_0x01a4:
            r3 = r9
        L_0x01a5:
            r6.mo1028A(r3)
            if (r0 == 0) goto L_0x01ae
            java.lang.String r0 = r0.f134686w
            if (r0 != 0) goto L_0x01af
        L_0x01ae:
            r0 = r9
        L_0x01af:
            r6.mo1034x(r0)
            android.content.Intent r0 = r11.getIntent()
            java.lang.String r3 = "key_extra_info"
            java.lang.String r0 = r0.getStringExtra(r3)
            if (r0 != 0) goto L_0x01bf
            goto L_0x01c0
        L_0x01bf:
            r9 = r0
        L_0x01c0:
            int r0 = r9.length()
            if (r0 <= 0) goto L_0x01c8
            r0 = 1
            goto L_0x01c9
        L_0x01c8:
            r0 = 0
        L_0x01c9:
            if (r0 == 0) goto L_0x01cf
            java.lang.String r9 = z04.C112551y.m153814n(r9, r8, r7, r2)
        L_0x01cf:
            java.lang.String r0 = "extrainfo"
            java.lang.String r0 = r6.mo86045b(r0, r9, r1)
            r6.f9887o = r0
            r6.mo86054n()
            java.lang.Class<dp1.y0> r0 = dp1.C58417y0.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            dp1.y0 r0 = (dp1.C58417y0) r0
            r0.Ec0(r6)
            if (r12 == 0) goto L_0x01e8
            goto L_0x01ec
        L_0x01e8:
            long r4 = eb0.C31543z5.m39453c()
        L_0x01ec:
            r11.f37790g = r4
        L_0x01ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C13317l7.mo12761f3(boolean):void");
    }

    public void onPause() {
        super.onPause();
        if (isBelongFragment() && isUserVisibleFocused()) {
            mo12761f3(true);
        }
    }

    public void onResume() {
        super.onResume();
        if (isBelongFragment() && isUserVisibleFocused()) {
            mo12761f3(false);
        }
    }

    public void onUserVisibleFocused() {
        super.onUserVisibleFocused();
        mo12761f3(false);
    }

    public void onUserVisibleUnFocused() {
        super.onUserVisibleUnFocused();
        mo12761f3(true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13317l7(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
