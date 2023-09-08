package qj1;

import ak1.C0073g0;
import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import al1.C54129i;
import al1.C54130j;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import bl3.C39818r;
import cj1.C54738b1;
import cj1.C54795n5;
import cj1.C54804r0;
import cl1.C54963d0;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveMemebrProfileWidget;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60172g4;
import ht1.C8777j5;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.regex.Pattern;
import ls3.C10649f;
import nj3.C11184p0;
import o40.C61926c;
import ok1.C11471u;
import org.json.JSONObject;
import p185kq.C61130g;
import qo3.C77407n;
import rx3.C13598b0;
import te3.C48770aw0;
import te3.C49712hj1;
import te3.C49765hx0;
import te3.C64347eq2;

/* renamed from: qj1.vb */
public final class C12707vb extends C62660c {

    /* renamed from: A */
    public C77407n f36404A;

    /* renamed from: B */
    public C77407n f36405B;

    /* renamed from: C */
    public String f36406C;

    /* renamed from: D */
    public String f36407D;

    /* renamed from: E */
    public boolean f36408E;

    /* renamed from: F */
    public boolean f36409F;

    /* renamed from: G */
    public boolean f36410G;

    /* renamed from: H */
    public boolean f36411H;

    /* renamed from: I */
    public int f36412I;

    /* renamed from: J */
    public C49765hx0 f36413J;

    /* renamed from: K */
    public C11184p0 f36414K;

    /* renamed from: p */
    public final C58124b f36415p;

    /* renamed from: q */
    public final String f36416q = "FinderLiveNewMemberProfilePlugin";

    /* renamed from: r */
    public final int f36417r = 1;

    /* renamed from: s */
    public final int f36418s = 10;

    /* renamed from: t */
    public final int f36419t = 11;

    /* renamed from: u */
    public final int f36420u = 12;

    /* renamed from: v */
    public final int f36421v = 13;

    /* renamed from: w */
    public final int f36422w = 14;

    /* renamed from: x */
    public final int f36423x = 15;

    /* renamed from: y */
    public final int f36424y = 16;

    /* renamed from: z */
    public FinderLiveMemebrProfileWidget f36425z;

    /* renamed from: qj1.vb$a */
    public static final class C12708a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12707vb f36426d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12708a(C12707vb vbVar) {
            super(0);
            this.f36426d = vbVar;
        }

        public Object invoke() {
            this.f36426d.mo10792g(8);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.vb$b */
    public static final class C12709b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C12709b f36427d = new C12709b();

        public C12709b() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.vb$c */
    public static final class C12710c extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12707vb f36428d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12710c(C12707vb vbVar) {
            super(1);
            this.f36428d = vbVar;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C12707vb vbVar = this.f36428d;
            vbVar.getClass();
            if (!(str == null || str.length() == 0)) {
                boolean g0 = vbVar.mo82893g0();
                String str2 = vbVar.f36416q;
                Log.m105924i(str2, "goToFinderProfile finderUsername:" + str + ",isLandscape:" + g0);
                if (g0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("PORTRAIT_ACTION_KEY_FINDER_USERNAME", str);
                    C62660c.m73644Y0(vbVar, "PORTRAIT_ACTION_GOTO_PROFILE_NEW_MEMBER_PROFILE", bundle, 0, 4, (Object) null);
                } else {
                    C54804r0 r0Var = C54804r0.f153631a;
                    Context context = vbVar.f166287d.getContext();
                    C45795b A0 = vbVar.mo87684A0();
                    C39818r rVar = C39818r.f106831a;
                    Context context2 = vbVar.f166287d.getContext();
                    C87412m.m108593f(context2, "root.context");
                    r0Var.mo75765g(context, A0, false, str, ((C60172g4) rVar.mo62443b(context2).mo62447c(C60172g4.class)).mo12861q3());
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.vb$d */
    public static final class C12711d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12707vb f36429d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12711d(C12707vb vbVar) {
            super(0);
            this.f36429d = vbVar;
        }

        public Object invoke() {
            C12707vb vbVar = this.f36429d;
            if (vbVar.f36405B == null) {
                vbVar.f36405B = new C77407n(vbVar.f166287d.getContext(), 0, false);
            }
            C77407n nVar = vbVar.f36405B;
            if (nVar != null) {
                nVar.f225771i = new C12312dc(vbVar);
            }
            if (nVar != null) {
                nVar.f225782p = vbVar.f36414K;
            }
            if (nVar != null) {
                nVar.f225761d = new C12374ec(vbVar);
            }
            if (nVar != null) {
                nVar.mo107573q();
            }
            C49765hx0 hx02 = vbVar.f36413J;
            if (hx02 != null) {
                int i = vbVar.f36412I;
                int i2 = hx02.f134926n;
                String str = vbVar.f36406C;
                if (str == null) {
                    str = "";
                }
                Log.m105924i("FinderLiveMicReportUtil", "reportProfile21054 result: " + 5 + " scene: " + i + " type: " + i2 + " audienceFinderUsername: " + str);
                ((C54108o) C86312j.m106911c(C54108o.class)).Wx0(5, i, i2, str);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.vb$e */
    public static final class C12712e extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12707vb f36430d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12712e(C12707vb vbVar) {
            super(1);
            this.f36430d = vbVar;
        }

        public Object invoke(Object obj) {
            C54738b1 b1Var;
            String str;
            String str2 = (String) obj;
            C12707vb vbVar = this.f36430d;
            String str3 = vbVar.f36416q;
            Log.m105924i(str3, "goToFinderLive from:" + ((C54991o) vbVar.mo87696x0(C54991o.class)).f154345o + " to:" + str2);
            FinderLiveService.f159376d.getClass();
            C54129i iVar = FinderLiveService.f159398z;
            if (!(iVar == null || (b1Var = iVar.f151991f) == null)) {
                if (b1Var.f153411A == null) {
                    b1Var.f153411A = new C64347eq2();
                }
                C64347eq2 eq22 = b1Var.f153411A;
                if (eq22 != null) {
                    C54130j jVar = ((C54963d0) vbVar.mo87696x0(C54963d0.class)).f154073p;
                    if (jVar == null || (str = jVar.f151999c) == null) {
                        str = "";
                    }
                    eq22.f183025p = str;
                }
                ((C54108o) C86312j.m106911c(C54108o.class)).getClass();
                C54067f0 f0Var = C54108o.f151869h;
                String gK = ((C61130g) C86312j.m106911c(C61130g.class)).mo33244gK();
                C87412m.m108593f(gK, "getService(\n            …ava).getCurCommentscene()");
                f0Var.getClass();
                f0Var.f151445a = gK;
                C10649f fVar = (C10649f) C86312j.m106911c(C10649f.class);
                Context context = vbVar.f166287d.getContext();
                C87412m.m108593f(context, "root.context");
                String str4 = str2 == null ? "" : str2;
                Context context2 = vbVar.f166287d.getContext();
                fVar.mo10917ze(context, (Intent) null, str4, context2 instanceof MMActivity ? (MMActivity) context2 : null, b1Var, (C10649f.C10650a) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.vb$g */
    public static final class C12713g implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C12707vb f36431d;

        /* renamed from: e */
        public final /* synthetic */ ViewGroup f36432e;

        /* renamed from: qj1.vb$g$a */
        public static final class C12714a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C12707vb f36433d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C12714a(C12707vb vbVar) {
                super(0);
                this.f36433d = vbVar;
            }

            public Object invoke() {
                C12707vb vbVar = this.f36433d;
                C54795n5 D0 = vbVar.mo14476D0();
                if (D0 != null) {
                    D0.mo75742j0(vbVar.f36406C, new C12268cc(vbVar));
                }
                return C13598b0.f38549a;
            }
        }

        public C12713g(C12707vb vbVar, ViewGroup viewGroup) {
            this.f36431d = vbVar;
            this.f36432e = viewGroup;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:123:0x03b9, code lost:
            if (r5 == null) goto L_0x03bb;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onMMMenuItemSelected(android.view.MenuItem r20, int r21) {
            /*
                r19 = this;
                r1 = r19
                ak1.f0$h0 r0 = ak1.C54067f0.C0059h0.CLICK_FORBITTEN_USER
                ak1.g0 r2 = ak1.C0073g0.LIVE_ANCHOR_ACTION_AUDIENCE
                ak1.g0 r3 = ak1.C0073g0.LIVE_ANCHOR_ACTION_BARRAGE
                java.lang.Class<ak1.o> r4 = ak1.C54108o.class
                r5 = 0
                if (r20 == 0) goto L_0x0016
                int r6 = r20.getItemId()
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                goto L_0x0017
            L_0x0016:
                r6 = r5
            L_0x0017:
                qj1.vb r7 = r1.f36431d
                int r7 = r7.f36418s
                r8 = 0
                r9 = 1
                r11 = 1
                r12 = 2
                if (r6 != 0) goto L_0x0024
                goto L_0x00a2
            L_0x0024:
                int r13 = r6.intValue()
                if (r13 != r7) goto L_0x00a2
                qj1.vb r5 = r1.f36431d
                cj1.n5 r6 = r5.mo14476D0()
                if (r6 == 0) goto L_0x003c
                java.lang.String r7 = r5.f36406C
                qj1.wb r13 = new qj1.wb
                r13.<init>(r5)
                r6.mo75725b(r7, r8, r12, r13)
            L_0x003c:
                qj1.vb r5 = r1.f36431d
                r5.mo12274Z0()
                qj1.vb r5 = r1.f36431d
                d60.b r5 = r5.f36415p
                int r5 = r5.getLiveRole()
                if (r5 != r11) goto L_0x046a
                di3.d r5 = di3.C86312j.m106911c(r4)
                ak1.o r5 = (ak1.C54108o) r5
                r5.Zx0(r0)
                di3.d r0 = di3.C86312j.m106911c(r4)
                ak1.o r0 = (ak1.C54108o) r0
                r0.getClass()
                ak1.f0 r0 = ak1.C54108o.f151869h
                ak1.m0 r5 = r0.f151443Y
                long r6 = r5.f151842s
                long r6 = r6 + r9
                r5.f151842s = r6
                org.json.JSONObject r5 = new org.json.JSONObject
                r5.<init>()
                java.lang.String r6 = java.lang.String.valueOf(r12)
                qj1.vb r7 = r1.f36431d
                java.lang.String r7 = r7.f36406C
                if (r7 != 0) goto L_0x0077
                java.lang.String r7 = ""
            L_0x0077:
                r5.put(r6, r7)
                di3.d r6 = di3.C86312j.m106911c(r4)
                ak1.o r6 = (ak1.C54108o) r6
                r6.getClass()
                boolean r0 = r0.f151448b0
                if (r0 == 0) goto L_0x0089
                r7 = r2
                goto L_0x008a
            L_0x0089:
                r7 = r3
            L_0x008a:
                di3.d r0 = di3.C86312j.m106911c(r4)
                java.lang.String r2 = "getService(HellLiveReport::class.java)"
                gy3.C87412m.m108593f(r0, r2)
                r6 = r0
                ht1.j5 r6 = (ht1.C8777j5) r6
                java.lang.String r8 = r5.toString()
                r9 = 0
                r10 = 4
                r11 = 0
                ht1.C8777j5.C8778a.m8605f(r6, r7, r8, r9, r10, r11)
                goto L_0x046a
            L_0x00a2:
                qj1.vb r7 = r1.f36431d
                int r7 = r7.f36419t
                r13 = 3
                if (r6 != 0) goto L_0x00ab
                goto L_0x0120
            L_0x00ab:
                int r14 = r6.intValue()
                if (r14 != r7) goto L_0x0120
                qj1.vb r0 = r1.f36431d
                cj1.n5 r5 = r0.mo14476D0()
                if (r5 == 0) goto L_0x00c3
                java.lang.String r6 = r0.f36406C
                qj1.wb r7 = new qj1.wb
                r7.<init>(r0)
                r5.mo75725b(r6, r11, r12, r7)
            L_0x00c3:
                qj1.vb r0 = r1.f36431d
                r0.mo12274Z0()
                qj1.vb r0 = r1.f36431d
                d60.b r0 = r0.f36415p
                int r0 = r0.getLiveRole()
                if (r0 != r11) goto L_0x046a
                di3.d r0 = di3.C86312j.m106911c(r4)
                ak1.o r0 = (ak1.C54108o) r0
                r0.getClass()
                ak1.f0 r0 = ak1.C54108o.f151869h
                ak1.m0 r5 = r0.f151443Y
                long r6 = r5.f151843t
                long r6 = r6 + r9
                r5.f151843t = r6
                org.json.JSONObject r5 = new org.json.JSONObject
                r5.<init>()
                java.lang.String r6 = java.lang.String.valueOf(r13)
                qj1.vb r7 = r1.f36431d
                java.lang.String r7 = r7.f36406C
                if (r7 != 0) goto L_0x00f5
                java.lang.String r7 = ""
            L_0x00f5:
                r5.put(r6, r7)
                di3.d r6 = di3.C86312j.m106911c(r4)
                ak1.o r6 = (ak1.C54108o) r6
                r6.getClass()
                boolean r0 = r0.f151448b0
                if (r0 == 0) goto L_0x0107
                r7 = r2
                goto L_0x0108
            L_0x0107:
                r7 = r3
            L_0x0108:
                di3.d r0 = di3.C86312j.m106911c(r4)
                java.lang.String r2 = "getService(HellLiveReport::class.java)"
                gy3.C87412m.m108593f(r0, r2)
                r6 = r0
                ht1.j5 r6 = (ht1.C8777j5) r6
                java.lang.String r8 = r5.toString()
                r9 = 0
                r10 = 4
                r11 = 0
                ht1.C8777j5.C8778a.m8605f(r6, r7, r8, r9, r10, r11)
                goto L_0x046a
            L_0x0120:
                qj1.vb r7 = r1.f36431d
                int r7 = r7.f36420u
                if (r6 != 0) goto L_0x0128
                goto L_0x01c7
            L_0x0128:
                int r14 = r6.intValue()
                if (r14 != r7) goto L_0x01c7
                di3.d r0 = di3.C86312j.m106911c(r4)
                ak1.o r0 = (ak1.C54108o) r0
                ak1.f0$h0 r2 = ak1.C54067f0.C0059h0.CLICK_BLACK_USER
                r0.Zx0(r2)
                qj1.vb r0 = r1.f36431d
                r2 = 2131828555(0x7f111f4b, float:1.9290054E38)
                r3 = 2131828554(0x7f111f4a, float:1.9290052E38)
                r4 = 2131101045(0x7f060575, float:1.7814489E38)
                qj1.vb$g$a r6 = new qj1.vb$g$a
                r6.<init>(r0)
                qo3.n r7 = r0.f36404A
                if (r7 != 0) goto L_0x0191
                qo3.n r7 = new qo3.n
                android.view.ViewGroup r9 = r0.f166287d
                android.content.Context r9 = r9.getContext()
                r7.<init>((android.content.Context) r9, (int) r11, (boolean) r11)
                r0.f36404A = r7
                r7.f225775k1 = r11
                android.view.ViewGroup r7 = r0.f166287d
                android.content.Context r7 = r7.getContext()
                r9 = 2131496236(0x7f0c0d2c, float:1.8616031E38)
                android.view.View r7 = android.view.View.inflate(r7, r9, r5)
                r9 = 2131307475(0x7f092bd3, float:1.8233178E38)
                android.view.View r9 = r7.findViewById(r9)
                android.widget.TextView r9 = (android.widget.TextView) r9
                android.view.ViewGroup r10 = r0.f166287d
                android.content.Context r10 = r10.getContext()
                java.lang.String r2 = r10.getString(r2)
                r9.setText(r2)
                qo3.n r2 = r0.f36404A
                if (r2 == 0) goto L_0x0186
                r2.mo107569n(r7, r8)
            L_0x0186:
                qo3.n r2 = r0.f36404A
                if (r2 == 0) goto L_0x0191
                qj1.xb r7 = new qj1.xb
                r7.<init>(r0)
                r2.f225761d = r7
            L_0x0191:
                qo3.n r2 = r0.f36404A
                if (r2 == 0) goto L_0x0198
                r2.mo107570o(r11)
            L_0x0198:
                qo3.n r2 = r0.f36404A
                if (r2 == 0) goto L_0x019f
                r2.mo107567l(r5)
            L_0x019f:
                qo3.n r2 = r0.f36404A
                if (r2 == 0) goto L_0x01aa
                qj1.yb r5 = new qj1.yb
                r5.<init>(r4, r0, r3)
                r2.f225771i = r5
            L_0x01aa:
                if (r2 == 0) goto L_0x01b3
                qj1.zb r3 = new qj1.zb
                r3.<init>(r0, r6)
                r2.f225782p = r3
            L_0x01b3:
                if (r2 == 0) goto L_0x01bc
                qj1.ac r3 = new qj1.ac
                r3.<init>(r0)
                r2.f225761d = r3
            L_0x01bc:
                qj1.vb r0 = r1.f36431d
                qo3.n r0 = r0.f36404A
                if (r0 == 0) goto L_0x046a
                r0.mo107573q()
                goto L_0x046a
            L_0x01c7:
                qj1.vb r7 = r1.f36431d
                int r7 = r7.f36421v
                if (r6 != 0) goto L_0x01cf
                goto L_0x0266
            L_0x01cf:
                int r8 = r6.intValue()
                if (r8 != r7) goto L_0x0266
                qj1.vb r0 = r1.f36431d
                java.lang.String r5 = r0.f36406C
                if (r5 == 0) goto L_0x0202
                android.view.ViewGroup r6 = r1.f36432e
                cj1.n5 r12 = r0.mo14476D0()
                if (r12 == 0) goto L_0x0202
                android.content.Context r13 = r6.getContext()
                java.lang.String r6 = "root.context"
                gy3.C87412m.m108593f(r13, r6)
                java.lang.Class<cl1.u> r6 = cl1.C55001u.class
                androidx.lifecycle.i0 r0 = r0.mo87696x0(r6)
                cl1.u r0 = (cl1.C55001u) r0
                te3.c21 r0 = r0.f154420q
                long r14 = r0.f182392d
                r17 = 0
                r18 = 62
                r16 = r5
                r12.mo75698B(r13, r14, r16, r17, r18)
            L_0x0202:
                qj1.vb r0 = r1.f36431d
                d60.b r0 = r0.f36415p
                int r0 = r0.getLiveRole()
                if (r0 != r11) goto L_0x046a
                di3.d r0 = di3.C86312j.m106911c(r4)
                ak1.o r0 = (ak1.C54108o) r0
                ak1.f0$h0 r5 = ak1.C54067f0.C0059h0.CLICK_COMPLAIN_USER
                r0.Zx0(r5)
                di3.d r0 = di3.C86312j.m106911c(r4)
                ak1.o r0 = (ak1.C54108o) r0
                r0.getClass()
                ak1.f0 r0 = ak1.C54108o.f151869h
                ak1.m0 r5 = r0.f151443Y
                long r6 = r5.f151839p
                long r6 = r6 + r9
                r5.f151839p = r6
                org.json.JSONObject r5 = new org.json.JSONObject
                r5.<init>()
                r6 = 4
                java.lang.String r6 = java.lang.String.valueOf(r6)
                qj1.vb r7 = r1.f36431d
                java.lang.String r7 = r7.f36406C
                if (r7 != 0) goto L_0x023b
                java.lang.String r7 = ""
            L_0x023b:
                r5.put(r6, r7)
                di3.d r6 = di3.C86312j.m106911c(r4)
                ak1.o r6 = (ak1.C54108o) r6
                r6.getClass()
                boolean r0 = r0.f151448b0
                if (r0 == 0) goto L_0x024d
                r7 = r2
                goto L_0x024e
            L_0x024d:
                r7 = r3
            L_0x024e:
                di3.d r0 = di3.C86312j.m106911c(r4)
                java.lang.String r2 = "getService(HellLiveReport::class.java)"
                gy3.C87412m.m108593f(r0, r2)
                r6 = r0
                ht1.j5 r6 = (ht1.C8777j5) r6
                java.lang.String r8 = r5.toString()
                r9 = 0
                r10 = 4
                r11 = 0
                ht1.C8777j5.C8778a.m8605f(r6, r7, r8, r9, r10, r11)
                goto L_0x046a
            L_0x0266:
                qj1.vb r2 = r1.f36431d
                int r2 = r2.f36423x
                if (r6 != 0) goto L_0x026d
                goto L_0x0297
            L_0x026d:
                int r3 = r6.intValue()
                if (r3 != r2) goto L_0x0297
                qj1.vb r0 = r1.f36431d
                cj1.n5 r2 = r0.mo14476D0()
                if (r2 == 0) goto L_0x0290
                java.lang.String r3 = r0.f36406C
                boolean r4 = r0.f36411H
                android.view.ViewGroup r0 = r0.f166287d
                android.content.Context r0 = r0.getContext()
                java.lang.String r5 = "root.context"
                gy3.C87412m.m108593f(r0, r5)
                qj1.bc r5 = qj1.C12255bc.f35335d
                r2.mo75704H(r3, r4, r0, r5)
            L_0x0290:
                qj1.vb r0 = r1.f36431d
                r0.mo12274Z0()
                goto L_0x046a
            L_0x0297:
                qj1.vb r2 = r1.f36431d
                int r2 = r2.f36424y
                if (r6 != 0) goto L_0x029f
                goto L_0x03e4
            L_0x029f:
                int r3 = r6.intValue()
                if (r3 != r2) goto L_0x03e4
                qj1.vb r0 = r1.f36431d
                java.lang.Class<cl1.d0> r2 = cl1.C54963d0.class
                androidx.lifecycle.i0 r2 = r0.mo87696x0(r2)
                cl1.d0 r2 = (cl1.C54963d0) r2
                java.util.List<al1.j> r2 = r2.f154074q
                java.lang.String r3 = "business(LiveLinkMicSlic…).audienceLinkMicUserList"
                gy3.C87412m.m108593f(r2, r3)
                monitor-enter(r2)
                java.util.Iterator r3 = r2.iterator()     // Catch:{ all -> 0x03e1 }
            L_0x02bb:
                boolean r6 = r3.hasNext()     // Catch:{ all -> 0x03e1 }
                if (r6 == 0) goto L_0x02d3
                java.lang.Object r6 = r3.next()     // Catch:{ all -> 0x03e1 }
                r7 = r6
                al1.j r7 = (al1.C54130j) r7     // Catch:{ all -> 0x03e1 }
                java.lang.String r7 = r7.f151997a     // Catch:{ all -> 0x03e1 }
                java.lang.String r8 = r0.f36407D     // Catch:{ all -> 0x03e1 }
                boolean r7 = gy3.C87412m.m108589b(r7, r8)     // Catch:{ all -> 0x03e1 }
                if (r7 == 0) goto L_0x02bb
                goto L_0x02d4
            L_0x02d3:
                r6 = r5
            L_0x02d4:
                monitor-exit(r2)
                al1.j r6 = (al1.C54130j) r6
                r2 = 2131756083(0x7f100433, float:1.9143063E38)
                if (r6 == 0) goto L_0x03bb
                int r3 = r6.f152018v
                r7 = 16
                boolean r3 = o40.C61926c.m72696u(r3, r7)
                if (r3 == 0) goto L_0x0352
                int r3 = r6.f152018v
                r3 = r3 & -17
                r6.f152018v = r3
                android.view.ViewGroup r3 = r0.f166287d
                android.content.Context r3 = r3.getContext()
                android.view.ViewGroup r6 = r0.f166287d
                android.content.Context r6 = r6.getContext()
                android.content.res.Resources r6 = r6.getResources()
                r7 = 2131826974(0x7f11191e, float:1.9286848E38)
                java.lang.String r6 = r6.getString(r7)
                r7 = 2131756085(0x7f100435, float:1.9143068E38)
                nj3.C76912y0.m92769h(r3, r6, r7)
                te3.hx0 r3 = r0.f36413J
                if (r3 == 0) goto L_0x03b9
                r5 = 7
                int r6 = r0.f36412I
                int r3 = r3.f134926n
                java.lang.String r7 = r0.f36406C
                if (r7 != 0) goto L_0x0318
                java.lang.String r7 = ""
            L_0x0318:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "reportProfile21054 result: "
                r8.append(r9)
                r8.append(r5)
                java.lang.String r9 = " scene: "
                r8.append(r9)
                r8.append(r6)
                java.lang.String r9 = " type: "
                r8.append(r9)
                r8.append(r3)
                java.lang.String r9 = " audienceFinderUsername: "
                r8.append(r9)
                r8.append(r7)
                java.lang.String r8 = r8.toString()
                java.lang.String r9 = "FinderLiveMicReportUtil"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
                di3.d r4 = di3.C86312j.m106911c(r4)
                ak1.o r4 = (ak1.C54108o) r4
                r4.Wx0(r5, r6, r3, r7)
                rx3.b0 r5 = rx3.C13598b0.f38549a
                goto L_0x03b9
            L_0x0352:
                int r3 = r6.f152018v
                r3 = r3 | r7
                r6.f152018v = r3
                android.view.ViewGroup r3 = r0.f166287d
                android.content.Context r3 = r3.getContext()
                android.view.ViewGroup r6 = r0.f166287d
                android.content.Context r6 = r6.getContext()
                android.content.res.Resources r6 = r6.getResources()
                r7 = 2131827004(0x7f11193c, float:1.9286908E38)
                java.lang.String r6 = r6.getString(r7)
                nj3.C76912y0.m92769h(r3, r6, r2)
                te3.hx0 r3 = r0.f36413J
                if (r3 == 0) goto L_0x03b9
                r5 = 6
                int r6 = r0.f36412I
                int r3 = r3.f134926n
                java.lang.String r7 = r0.f36406C
                if (r7 != 0) goto L_0x0380
                java.lang.String r7 = ""
            L_0x0380:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "reportProfile21054 result: "
                r8.append(r9)
                r8.append(r5)
                java.lang.String r9 = " scene: "
                r8.append(r9)
                r8.append(r6)
                java.lang.String r9 = " type: "
                r8.append(r9)
                r8.append(r3)
                java.lang.String r9 = " audienceFinderUsername: "
                r8.append(r9)
                r8.append(r7)
                java.lang.String r8 = r8.toString()
                java.lang.String r9 = "FinderLiveMicReportUtil"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
                di3.d r4 = di3.C86312j.m106911c(r4)
                ak1.o r4 = (ak1.C54108o) r4
                r4.Wx0(r5, r6, r3, r7)
                rx3.b0 r5 = rx3.C13598b0.f38549a
            L_0x03b9:
                if (r5 != 0) goto L_0x03d5
            L_0x03bb:
                android.view.ViewGroup r3 = r0.f166287d
                android.content.Context r3 = r3.getContext()
                android.view.ViewGroup r4 = r0.f166287d
                android.content.Context r4 = r4.getContext()
                android.content.res.Resources r4 = r4.getResources()
                r5 = 2131827003(0x7f11193b, float:1.9286906E38)
                java.lang.String r4 = r4.getString(r5)
                nj3.C76912y0.m92769h(r3, r4, r2)
            L_0x03d5:
                qo3.n r2 = r0.f36405B
                if (r2 == 0) goto L_0x03dc
                r2.mo107572p()
            L_0x03dc:
                r0.mo12274Z0()
                goto L_0x046a
            L_0x03e1:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L_0x03e4:
                qj1.vb r2 = r1.f36431d
                int r2 = r2.f36422w
                if (r6 != 0) goto L_0x03eb
                goto L_0x045c
            L_0x03eb:
                int r3 = r6.intValue()
                if (r3 != r2) goto L_0x045c
                qj1.vb r2 = r1.f36431d
                cj1.n5 r3 = r2.mo14476D0()
                if (r3 == 0) goto L_0x0405
                java.lang.String r5 = r2.f36406C
                boolean r6 = r2.f36409F
                qj1.fc r7 = new qj1.fc
                r7.<init>(r2)
                r3.mo75725b(r5, r6, r13, r7)
            L_0x0405:
                qj1.vb r2 = r1.f36431d
                r2.mo12274Z0()
                qj1.vb r2 = r1.f36431d
                d60.b r2 = r2.f36415p
                int r2 = r2.getLiveRole()
                if (r2 != r11) goto L_0x046a
                di3.d r2 = di3.C86312j.m106911c(r4)
                ak1.o r2 = (ak1.C54108o) r2
                r2.Zx0(r0)
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                qj1.vb r2 = r1.f36431d
                boolean r2 = r2.f36409F
                if (r2 == 0) goto L_0x0431
                java.lang.String r2 = "type"
                java.lang.String r3 = "2"
                r0.put(r2, r3)
                goto L_0x0439
            L_0x0431:
                java.lang.String r2 = "type"
                java.lang.String r3 = "1"
                r0.put(r2, r3)
            L_0x0439:
                qj1.vb r2 = r1.f36431d
                int r2 = r2.f36412I
                if (r2 != r12) goto L_0x0442
                ak1.g0 r2 = ak1.C0073g0.HALF_SCREEN_FROM_COMMENT
                goto L_0x0444
            L_0x0442:
                ak1.g0 r2 = ak1.C0073g0.HALF_SCREEN_FROM_LIST
            L_0x0444:
                r6 = r2
                di3.d r2 = di3.C86312j.m106911c(r4)
                java.lang.String r3 = "getService(HellLiveReport::class.java)"
                gy3.C87412m.m108593f(r2, r3)
                r5 = r2
                ht1.j5 r5 = (ht1.C8777j5) r5
                java.lang.String r7 = r0.toString()
                r8 = 0
                r9 = 4
                r10 = 0
                ht1.C8777j5.C8778a.m8605f(r5, r6, r7, r8, r9, r10)
                goto L_0x046a
            L_0x045c:
                qj1.vb r0 = r1.f36431d
                qo3.n r0 = r0.f36405B
                if (r0 == 0) goto L_0x0465
                r0.mo107572p()
            L_0x0465:
                qj1.vb r0 = r1.f36431d
                r0.mo12274Z0()
            L_0x046a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qj1.C12707vb.C12713g.onMMMenuItemSelected(android.view.MenuItem, int):void");
        }
    }

    /* renamed from: qj1.vb$h */
    public static final class C12715h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C12707vb f36434d;

        /* renamed from: e */
        public final /* synthetic */ Bundle f36435e;

        /* renamed from: f */
        public final /* synthetic */ Object f36436f;

        /* renamed from: g */
        public final /* synthetic */ long f36437g;

        public C12715h(C12707vb vbVar, Bundle bundle, Object obj, long j) {
            this.f36434d = vbVar;
            this.f36435e = bundle;
            this.f36436f = obj;
            this.f36437g = j;
        }

        public final void run() {
            if (!this.f36434d.mo87688G0()) {
                C54795n5 D0 = this.f36434d.mo14476D0();
                if (D0 != null) {
                    D0.mo75705I(this.f36435e, this.f36436f, "PORTRAIT_ACTION_KEY_FINDER_USERNAME");
                    return;
                }
                return;
            }
            String str = this.f36434d.f36416q;
            Log.m105924i(str, "goToFinderProfileImpl delayMs:" + this.f36437g + ",isFinished!");
        }
    }

    /* renamed from: qj1.vb$i */
    public static final class C12716i extends C87413o implements C32227p<Boolean, C49765hx0, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12707vb f36438d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12716i(C12707vb vbVar) {
            super(2);
            this.f36438d = vbVar;
        }

        public Object invoke(Object obj, Object obj2) {
            LinkedList<C48770aw0> linkedList;
            T t;
            boolean z;
            C49765hx0 hx02 = (C49765hx0) obj2;
            if (((Boolean) obj).booleanValue()) {
                C12707vb vbVar = this.f36438d;
                String str = null;
                if (!(hx02 == null || (linkedList = hx02.f134930r) == null)) {
                    Iterator<T> it = linkedList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        if (((C48770aw0) t).f130789d == 5) {
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
                    C48770aw0 aw02 = (C48770aw0) t;
                    if (aw02 != null) {
                        str = aw02.f130793h;
                    }
                }
                vbVar.f36411H = C87412m.m108589b(str, this.f36438d.f166287d.getContext().getResources().getString(C0966R.string.f360620mg0));
                C61926c.m72668M(new C12426gc(this.f36438d));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.vb$j */
    public static final class C12717j extends C87413o implements C32227p<Boolean, C49765hx0, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12707vb f36439d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12717j(C12707vb vbVar) {
            super(2);
            this.f36439d = vbVar;
        }

        public Object invoke(Object obj, Object obj2) {
            LinkedList<C48770aw0> linkedList;
            T t;
            boolean z;
            C49765hx0 hx02 = (C49765hx0) obj2;
            if (((Boolean) obj).booleanValue()) {
                C12707vb vbVar = this.f36439d;
                String str = null;
                if (!(hx02 == null || (linkedList = hx02.f134930r) == null)) {
                    Iterator<T> it = linkedList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        if (((C48770aw0) t).f130789d == 5) {
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
                    C48770aw0 aw02 = (C48770aw0) t;
                    if (aw02 != null) {
                        str = aw02.f130793h;
                    }
                }
                vbVar.f36411H = C87412m.m108589b(str, this.f36439d.f166287d.getContext().getResources().getString(C0966R.string.f360620mg0));
                C61926c.m72668M(new C12441hc(this.f36439d));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.vb$k */
    public static final class C12718k extends C87413o implements C32227p<Boolean, C49765hx0, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12707vb f36440d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12718k(C12707vb vbVar) {
            super(2);
            this.f36440d = vbVar;
        }

        public Object invoke(Object obj, Object obj2) {
            C49765hx0 hx02 = (C49765hx0) obj2;
            if (((Boolean) obj).booleanValue()) {
                int i = 0;
                this.f36440d.f36408E = C61926c.m72696u(hx02 != null ? hx02.f134921f : 0, 1);
                C12707vb vbVar = this.f36440d;
                if (hx02 != null) {
                    i = hx02.f134921f;
                }
                vbVar.f36409F = C61926c.m72696u(i, 2);
                C61926c.m72668M(new C12451ic(this.f36440d));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.vb$f */
    public /* synthetic */ class C12719f {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36441a;

        static {
            int[] iArr = new int[C58124b.C58125b.values().length];
            C58124b.C58125b bVar = C58124b.C58125b.UNKNOWN;
            iArr[46] = 1;
            f36441a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12707vb(ViewGroup viewGroup, C58124b bVar, C49712hj1 hj12) {
        super(viewGroup, bVar, hj12);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f36415p = bVar;
        Context context = viewGroup.getContext();
        C87412m.m108593f(context, "root.context");
        FinderLiveMemebrProfileWidget finderLiveMemebrProfileWidget = new FinderLiveMemebrProfileWidget(context, this, (C11471u.C11473b) null, 4, (C8480h) null);
        this.f36425z = finderLiveMemebrProfileWidget;
        this.f36407D = "";
        finderLiveMemebrProfileWidget.f15409n = new C12708a(this);
        FinderLiveMemebrProfileWidget finderLiveMemebrProfileWidget2 = this.f36425z;
        finderLiveMemebrProfileWidget2.f15408j = C12709b.f36427d;
        finderLiveMemebrProfileWidget2.f15410o = new C12710c(this);
        this.f36425z.f15411p = new C12711d(this);
        this.f36425z.f15412q = new C12712e(this);
        this.f36414K = new C12713g(this, viewGroup);
    }

    /* renamed from: Z0 */
    public final void mo12274Z0() {
        if (this.f36410G) {
            C58124b bVar = this.f36415p;
            C58124b.C58125b bVar2 = C58124b.C58125b.FINDER_LIVE_MEMBERS_LOADING;
            Bundle bundle = new Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_MEMBER_SKIP_LOADING", true);
            C13598b0 b0Var = C13598b0.f38549a;
            bVar.statusChange(bVar2, bundle);
        }
    }

    /* renamed from: a1 */
    public final void mo12275a1(C49765hx0 hx02, boolean z) {
        String str;
        Class cls = C54108o.class;
        if (hx02 != null) {
            mo10792g(0);
            FinderLiveMemebrProfileWidget finderLiveMemebrProfileWidget = this.f36425z;
            if (finderLiveMemebrProfileWidget != null) {
                finderLiveMemebrProfileWidget.mo3423A(hx02, this.f36412I, this.f177937h, z, this.f36407D);
            }
            String str2 = "";
            if (this.f36415p.getLiveRole() == 1) {
                ((C54108o) C86312j.m106911c(cls)).getClass();
                C54108o.f151869h.f151448b0 = true;
                JSONObject jSONObject = new JSONObject();
                String valueOf = String.valueOf(1);
                FinderContact finderContact = hx02.f134919d;
                if (finderContact == null || (str = finderContact.username) == null) {
                    str = str2;
                }
                jSONObject.put(valueOf, str);
                C7335d c = C86312j.m106911c(cls);
                C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.LIVE_ANCHOR_ACTION_AUDIENCE, jSONObject.toString(), (String) null, 4, (Object) null);
                C54108o oVar = (C54108o) C86312j.m106911c(cls);
                int i = this.f36412I;
                int i2 = hx02.f134926n;
                String str3 = this.f36406C;
                if (str3 != null) {
                    str2 = str3;
                }
                oVar.Wx0(1, i, i2, str2);
                return;
            }
            C54116w wVar = (C54116w) C86312j.m106911c(C54116w.class);
            int i3 = this.f36412I;
            int i4 = hx02.f134926n;
            String str4 = this.f36406C;
            if (str4 != null) {
                str2 = str4;
            }
            wVar.Fy0(1, i3, i4, str2);
            return;
        }
        Log.m105924i(this.f36416q, "show profile fail,contact is null!");
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: e */
    public void mo12022e(Bundle bundle, Object obj, long j) {
        String str = "";
        String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", str) : null;
        if (string != null) {
            str = string;
        }
        if (C87412m.m108589b(str, "PORTRAIT_ACTION_GOTO_PROFILE_NEW_MEMBER_PROFILE")) {
            C12715h hVar = new C12715h(this, bundle, obj, j);
            Pattern pattern = C61926c.f176038a;
            MMHandlerThread.postToMainThreadDelayed(hVar, j);
        }
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        super.mo8357i0();
        this.f36425z.mo3432q();
    }

    /* renamed from: l0 */
    public boolean mo3207l0() {
        if (mo14483f0() != 0) {
            return false;
        }
        this.f36425z.mo9763a();
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    /* JADX WARNING: type inference failed for: r2v10, types: [rx3.b0] */
    /* JADX WARNING: type inference failed for: r2v12, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r10v28, types: [rx3.b0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: u0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3210u0(d60.C58124b.C58125b r9, android.os.Bundle r10) {
        /*
            r8 = this;
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            java.lang.String r1 = "status"
            gy3.C87412m.m108594g(r9, r1)
            int[] r1 = qj1.C12707vb.C12719f.f36441a
            int r9 = r9.ordinal()
            r9 = r1[r9]
            r1 = 1
            if (r9 != r1) goto L_0x0422
            r9 = 0
            if (r10 == 0) goto L_0x001d
            java.lang.String r2 = "PARAM_MEMBERS_PROFILE_NEED_NOTIFY_CLOSE"
            boolean r2 = r10.getBoolean(r2)
            goto L_0x001e
        L_0x001d:
            r2 = 0
        L_0x001e:
            r8.f36410G = r2
            if (r10 == 0) goto L_0x0029
            java.lang.String r2 = "PARAM_MEMBERS_PROFILE_SOURCE_TYPE"
            int r2 = r10.getInt(r2)
            goto L_0x002a
        L_0x0029:
            r2 = 0
        L_0x002a:
            r8.f36412I = r2
            r2 = 0
            if (r10 == 0) goto L_0x0036
            java.lang.String r3 = "PARAM_MEMBERS_PROFILE_USERNAME"
            java.lang.String r3 = r10.getString(r3)
            goto L_0x0037
        L_0x0036:
            r3 = r2
        L_0x0037:
            r8.f36406C = r3
            if (r10 == 0) goto L_0x0042
            java.lang.String r3 = "PARAM_MEMBERS_PROFILE_USER_MIC_ID"
            java.lang.String r3 = r10.getString(r3)
            goto L_0x0043
        L_0x0042:
            r3 = r2
        L_0x0043:
            if (r3 != 0) goto L_0x0047
            java.lang.String r3 = ""
        L_0x0047:
            r8.f36407D = r3
            if (r10 == 0) goto L_0x0052
            java.lang.String r3 = "PARAM_MEMBERS_PROFILE_IS_OTHER_ROOM_USER"
            boolean r3 = r10.getBoolean(r3, r9)
            goto L_0x0053
        L_0x0052:
            r3 = 0
        L_0x0053:
            int r4 = r8.f36412I
            r5 = 2
            if (r4 != r5) goto L_0x01cd
            ok1.e r10 = ok1.C62042e.f176370a
            boolean r10 = r10.mo87027N0()
            if (r10 != 0) goto L_0x0088
            androidx.lifecycle.i0 r10 = r8.mo87696x0(r0)
            cl1.o r10 = (cl1.C54991o) r10
            boolean r10 = r10.f154190D
            if (r10 != 0) goto L_0x0088
            java.lang.String r9 = r8.f36416q
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "LIVE_STATUS_OPEN_MEMBER_PROFILE sourceType:"
            r10.append(r0)
            int r0 = r8.f36412I
            r10.append(r0)
            java.lang.String r0 = ", not anchor!"
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
            return
        L_0x0088:
            java.lang.String r10 = r8.f36406C
            if (r10 == 0) goto L_0x0095
            int r10 = r10.length()
            if (r10 != 0) goto L_0x0093
            goto L_0x0095
        L_0x0093:
            r10 = 0
            goto L_0x0096
        L_0x0095:
            r10 = 1
        L_0x0096:
            if (r10 == 0) goto L_0x00c0
            java.lang.String r9 = r8.f36416q
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "LIVE_STATUS_OPEN_MEMBER_PROFILE sourceType:"
            r10.append(r0)
            int r0 = r8.f36412I
            r10.append(r0)
            java.lang.String r0 = ", username:"
            r10.append(r0)
            java.lang.String r0 = r8.f36406C
            r10.append(r0)
            java.lang.String r0 = " is empty!"
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
            return
        L_0x00c0:
            java.lang.Class<cl1.z0> r10 = cl1.C0702z0.class
            androidx.lifecycle.i0 r10 = r8.mo87696x0(r10)
            cl1.z0 r10 = (cl1.C0702z0) r10
            java.util.List<cj1.o5> r10 = r10.f1672f
            java.lang.String r3 = "business(LiveMsgSlice::class.java).msgList"
            gy3.C87412m.m108593f(r10, r3)
            monitor-enter(r10)
            java.util.Iterator r3 = r10.iterator()     // Catch:{ all -> 0x01ca }
        L_0x00d4:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x01ca }
            if (r4 == 0) goto L_0x00ee
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x01ca }
            r6 = r4
            cj1.o5 r6 = (cj1.C0581o5) r6     // Catch:{ all -> 0x01ca }
            java.lang.String r6 = r6.mo571e()     // Catch:{ all -> 0x01ca }
            java.lang.String r7 = r8.f36406C     // Catch:{ all -> 0x01ca }
            boolean r6 = gy3.C87412m.m108589b(r6, r7)     // Catch:{ all -> 0x01ca }
            if (r6 == 0) goto L_0x00d4
            goto L_0x00ef
        L_0x00ee:
            r4 = r2
        L_0x00ef:
            monitor-exit(r10)
            cj1.o5 r4 = (cj1.C0581o5) r4
            if (r4 == 0) goto L_0x00f9
            te3.hx0 r10 = r4.mo579i()
            goto L_0x00fa
        L_0x00f9:
            r10 = r2
        L_0x00fa:
            r8.f36413J = r10
            androidx.lifecycle.i0 r10 = r8.mo87696x0(r0)
            cl1.o r10 = (cl1.C54991o) r10
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> r10 = r10.f154262U0
            java.lang.String r3 = r8.f36406C
            java.lang.Object r10 = r10.get(r3)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            if (r10 != 0) goto L_0x013c
            java.lang.String r10 = r8.f36416q
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "LIVE_STATUS_OPEN_MEMBER_PROFILE SOURCE_TYPE_COMMENT disableCommentCacheMap:"
            r3.append(r4)
            java.lang.String r4 = r8.f36406C
            r3.append(r4)
            java.lang.String r4 = " is empty!"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r3)
            te3.hx0 r10 = r8.f36413J
            if (r10 == 0) goto L_0x0132
            int r10 = r10.f134921f
            goto L_0x0133
        L_0x0132:
            r10 = 0
        L_0x0133:
            boolean r10 = o40.C61926c.m72696u(r10, r1)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            goto L_0x015d
        L_0x013c:
            te3.hx0 r3 = r8.f36413J
            if (r3 != 0) goto L_0x0141
            goto L_0x015d
        L_0x0141:
            boolean r4 = r10.booleanValue()
            if (r4 == 0) goto L_0x0151
            te3.hx0 r4 = r8.f36413J
            if (r4 == 0) goto L_0x014e
            int r4 = r4.f134921f
            goto L_0x014f
        L_0x014e:
            r4 = 0
        L_0x014f:
            r4 = r4 | r1
            goto L_0x015b
        L_0x0151:
            te3.hx0 r4 = r8.f36413J
            if (r4 == 0) goto L_0x0158
            int r4 = r4.f134921f
            goto L_0x0159
        L_0x0158:
            r4 = 0
        L_0x0159:
            r4 = r4 & -2
        L_0x015b:
            r3.f134921f = r4
        L_0x015d:
            boolean r10 = r10.booleanValue()
            r8.f36408E = r10
            androidx.lifecycle.i0 r10 = r8.mo87696x0(r0)
            cl1.o r10 = (cl1.C54991o) r10
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> r10 = r10.f154267V0
            java.lang.String r0 = r8.f36406C
            java.lang.Object r10 = r10.get(r0)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            if (r10 != 0) goto L_0x0186
            te3.hx0 r10 = r8.f36413J
            if (r10 == 0) goto L_0x017c
            int r10 = r10.f134921f
            goto L_0x017d
        L_0x017c:
            r10 = 0
        L_0x017d:
            boolean r10 = o40.C61926c.m72696u(r10, r5)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            goto L_0x01a7
        L_0x0186:
            te3.hx0 r0 = r8.f36413J
            if (r0 != 0) goto L_0x018b
            goto L_0x01a7
        L_0x018b:
            boolean r3 = r10.booleanValue()
            if (r3 == 0) goto L_0x019b
            te3.hx0 r3 = r8.f36413J
            if (r3 == 0) goto L_0x0198
            int r3 = r3.f134921f
            goto L_0x0199
        L_0x0198:
            r3 = 0
        L_0x0199:
            r3 = r3 | r5
            goto L_0x01a5
        L_0x019b:
            te3.hx0 r3 = r8.f36413J
            if (r3 == 0) goto L_0x01a2
            int r3 = r3.f134921f
            goto L_0x01a3
        L_0x01a2:
            r3 = 0
        L_0x01a3:
            r3 = r3 & -3
        L_0x01a5:
            r0.f134921f = r3
        L_0x01a7:
            boolean r10 = r10.booleanValue()
            r8.f36409F = r10
            cj1.n5 r10 = r8.mo14476D0()
            if (r10 == 0) goto L_0x01c3
            java.lang.String r0 = r8.f36406C
            te3.hx0 r3 = r8.f36413J
            if (r3 == 0) goto L_0x01bb
            pe3.b r2 = r3.f134928p
        L_0x01bb:
            qj1.vb$i r3 = new qj1.vb$i
            r3.<init>(r8)
            r10.mo75733f(r0, r9, r2, r3)
        L_0x01c3:
            te3.hx0 r10 = r8.f36413J
            r8.mo12275a1(r10, r9)
            goto L_0x03ed
        L_0x01ca:
            r9 = move-exception
            monitor-exit(r10)
            throw r9
        L_0x01cd:
            if (r4 != r1) goto L_0x029f
            ok1.e r10 = ok1.C62042e.f176370a
            boolean r10 = r10.mo87027N0()
            if (r10 != 0) goto L_0x01ff
            androidx.lifecycle.i0 r10 = r8.mo87696x0(r0)
            cl1.o r10 = (cl1.C54991o) r10
            boolean r10 = r10.f154190D
            if (r10 != 0) goto L_0x01ff
            java.lang.String r9 = r8.f36416q
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "LIVE_STATUS_OPEN_MEMBER_PROFILE sourceType:"
            r10.append(r0)
            int r0 = r8.f36412I
            r10.append(r0)
            java.lang.String r0 = ", not anchor!"
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
            return
        L_0x01ff:
            java.lang.String r10 = r8.f36406C
            if (r10 == 0) goto L_0x020c
            int r10 = r10.length()
            if (r10 != 0) goto L_0x020a
            goto L_0x020c
        L_0x020a:
            r10 = 0
            goto L_0x020d
        L_0x020c:
            r10 = 1
        L_0x020d:
            if (r10 == 0) goto L_0x0237
            java.lang.String r9 = r8.f36416q
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "LIVE_STATUS_OPEN_MEMBER_PROFILE sourceType:"
            r10.append(r0)
            int r0 = r8.f36412I
            r10.append(r0)
            java.lang.String r0 = ", username:"
            r10.append(r0)
            java.lang.String r0 = r8.f36406C
            r10.append(r0)
            java.lang.String r0 = " is empty!"
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
            return
        L_0x0237:
            java.lang.Class<cl1.e1> r10 = cl1.C0656e1.class
            androidx.lifecycle.i0 r10 = r8.mo87696x0(r10)
            cl1.e1 r10 = (cl1.C0656e1) r10
            java.util.ArrayList<te3.hx0> r10 = r10.f1549f
            java.util.Iterator r10 = r10.iterator()
        L_0x0245:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0263
            java.lang.Object r0 = r10.next()
            r3 = r0
            te3.hx0 r3 = (te3.C49765hx0) r3
            com.tencent.mm.protocal.protobuf.FinderContact r3 = r3.f134919d
            if (r3 == 0) goto L_0x0259
            java.lang.String r3 = r3.username
            goto L_0x025a
        L_0x0259:
            r3 = r2
        L_0x025a:
            java.lang.String r4 = r8.f36406C
            boolean r3 = gy3.C87412m.m108589b(r3, r4)
            if (r3 == 0) goto L_0x0245
            goto L_0x0264
        L_0x0263:
            r0 = r2
        L_0x0264:
            te3.hx0 r0 = (te3.C49765hx0) r0
            r8.f36413J = r0
            if (r0 == 0) goto L_0x026d
            int r10 = r0.f134921f
            goto L_0x026e
        L_0x026d:
            r10 = 0
        L_0x026e:
            boolean r10 = o40.C61926c.m72696u(r10, r1)
            r8.f36408E = r10
            te3.hx0 r10 = r8.f36413J
            if (r10 == 0) goto L_0x027b
            int r10 = r10.f134921f
            goto L_0x027c
        L_0x027b:
            r10 = 0
        L_0x027c:
            boolean r10 = o40.C61926c.m72696u(r10, r5)
            r8.f36409F = r10
            cj1.n5 r10 = r8.mo14476D0()
            if (r10 == 0) goto L_0x0298
            java.lang.String r0 = r8.f36406C
            te3.hx0 r3 = r8.f36413J
            if (r3 == 0) goto L_0x0290
            pe3.b r2 = r3.f134928p
        L_0x0290:
            qj1.vb$j r3 = new qj1.vb$j
            r3.<init>(r8)
            r10.mo75733f(r0, r9, r2, r3)
        L_0x0298:
            te3.hx0 r10 = r8.f36413J
            r8.mo12275a1(r10, r9)
            goto L_0x03ed
        L_0x029f:
            r5 = 3
            r6 = 2131827038(0x7f11195e, float:1.9286977E38)
            if (r4 != r5) goto L_0x0354
            if (r10 == 0) goto L_0x0334
            java.lang.String r4 = "PARAM_MEMBERS_PROFILE_CONTACT"
            byte[] r10 = r10.getByteArray(r4)
            if (r10 == 0) goto L_0x0334
            te3.hx0 r4 = new te3.hx0
            r4.<init>()
            r4.parseFrom(r10)     // Catch:{ Exception -> 0x02b8 }
            goto L_0x02c6
        L_0x02b8:
            r10 = move-exception
            java.lang.String r4 = "safeParser"
            java.lang.String r5 = ""
            java.lang.Object[] r7 = new java.lang.Object[r1]
            r7[r9] = r10
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r4, r5, r7)
            r4 = r2
        L_0x02c6:
            r8.f36413J = r4
            ok1.e r10 = ok1.C62042e.f176370a
            boolean r10 = r10.mo87027N0()
            if (r10 != 0) goto L_0x0316
            androidx.lifecycle.i0 r10 = r8.mo87696x0(r0)
            cl1.o r10 = (cl1.C54991o) r10
            boolean r10 = r10.mo75998e3()
            if (r10 == 0) goto L_0x0316
            androidx.lifecycle.i0 r10 = r8.mo87696x0(r0)
            cl1.o r10 = (cl1.C54991o) r10
            java.lang.String r10 = r10.f154345o
            te3.hx0 r0 = r8.f36413J
            if (r0 == 0) goto L_0x02ef
            com.tencent.mm.protocal.protobuf.FinderContact r0 = r0.f134919d
            if (r0 == 0) goto L_0x02ef
            java.lang.String r0 = r0.username
            goto L_0x02f0
        L_0x02ef:
            r0 = r2
        L_0x02f0:
            boolean r10 = gy3.C87412m.m108589b(r10, r0)
            if (r10 != 0) goto L_0x0316
            java.lang.String r9 = r8.f36416q
            java.lang.String r10 = "ur visitor and anonymous mode now. don't check others."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
            android.view.ViewGroup r9 = r8.f166287d
            android.content.Context r9 = r9.getContext()
            android.view.ViewGroup r10 = r8.f166287d
            android.content.Context r10 = r10.getContext()
            android.content.res.Resources r10 = r10.getResources()
            java.lang.String r10 = r10.getString(r6)
            nj3.C76912y0.m92767f(r9, r10)
            return
        L_0x0316:
            te3.hx0 r10 = r8.f36413J
            r8.mo12275a1(r10, r3)
            cj1.n5 r10 = r8.mo14476D0()
            if (r10 == 0) goto L_0x0334
            java.lang.String r0 = r8.f36406C
            te3.hx0 r3 = r8.f36413J
            if (r3 == 0) goto L_0x0329
            pe3.b r2 = r3.f134928p
        L_0x0329:
            qj1.vb$k r3 = new qj1.vb$k
            r3.<init>(r8)
            r10.mo75733f(r0, r9, r2, r3)
            rx3.b0 r10 = rx3.C13598b0.f38549a
            r2 = r10
        L_0x0334:
            if (r2 != 0) goto L_0x03ed
            java.lang.String r9 = r8.f36416q
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "LIVE_STATUS_OPEN_MEMBER_PROFILE sourceType:"
            r10.append(r0)
            int r0 = r8.f36412I
            r10.append(r0)
            java.lang.String r0 = ", contact is empty!"
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
            return
        L_0x0354:
            r5 = 4
            if (r4 != r5) goto L_0x03ed
            if (r10 == 0) goto L_0x03cd
            java.lang.String r4 = "PARAM_MEMBERS_PROFILE_CONTACT"
            byte[] r10 = r10.getByteArray(r4)
            if (r10 == 0) goto L_0x03cd
            te3.hx0 r4 = new te3.hx0
            r4.<init>()
            r4.parseFrom(r10)     // Catch:{ Exception -> 0x036a }
            goto L_0x0378
        L_0x036a:
            r10 = move-exception
            java.lang.String r4 = "safeParser"
            java.lang.String r5 = ""
            java.lang.Object[] r7 = new java.lang.Object[r1]
            r7[r9] = r10
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r4, r5, r7)
            r4 = r2
        L_0x0378:
            r8.f36413J = r4
            ok1.e r10 = ok1.C62042e.f176370a
            boolean r10 = r10.mo87027N0()
            if (r10 != 0) goto L_0x03c6
            androidx.lifecycle.i0 r10 = r8.mo87696x0(r0)
            cl1.o r10 = (cl1.C54991o) r10
            boolean r10 = r10.mo75998e3()
            if (r10 == 0) goto L_0x03c6
            androidx.lifecycle.i0 r10 = r8.mo87696x0(r0)
            cl1.o r10 = (cl1.C54991o) r10
            java.lang.String r10 = r10.f154345o
            te3.hx0 r0 = r8.f36413J
            if (r0 == 0) goto L_0x03a0
            com.tencent.mm.protocal.protobuf.FinderContact r0 = r0.f134919d
            if (r0 == 0) goto L_0x03a0
            java.lang.String r2 = r0.username
        L_0x03a0:
            boolean r10 = gy3.C87412m.m108589b(r10, r2)
            if (r10 != 0) goto L_0x03c6
            java.lang.String r9 = r8.f36416q
            java.lang.String r10 = "ur visitor and anonymous mode now. don't check others."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
            android.view.ViewGroup r9 = r8.f166287d
            android.content.Context r9 = r9.getContext()
            android.view.ViewGroup r10 = r8.f166287d
            android.content.Context r10 = r10.getContext()
            android.content.res.Resources r10 = r10.getResources()
            java.lang.String r10 = r10.getString(r6)
            nj3.C76912y0.m92767f(r9, r10)
            return
        L_0x03c6:
            te3.hx0 r10 = r8.f36413J
            r8.mo12275a1(r10, r3)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x03cd:
            if (r2 != 0) goto L_0x03ed
            java.lang.String r9 = r8.f36416q
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "LIVE_STATUS_OPEN_MEMBER_PROFILE sourceType:"
            r10.append(r0)
            int r0 = r8.f36412I
            r10.append(r0)
            java.lang.String r0 = ", contact is empty!"
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
            return
        L_0x03ed:
            java.lang.String r10 = r8.f36416q
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "LIVE_STATUS_OPEN_MEMBER_PROFILE sourceType:"
            r0.append(r2)
            int r2 = r8.f36412I
            r0.append(r2)
            java.lang.String r2 = ",disableComment:"
            r0.append(r2)
            boolean r2 = r8.f36408E
            r0.append(r2)
            java.lang.String r2 = ",liveCustomerContact is empty:"
            r0.append(r2)
            te3.hx0 r2 = r8.f36413J
            if (r2 != 0) goto L_0x0412
            goto L_0x0413
        L_0x0412:
            r1 = 0
        L_0x0413:
            r0.append(r1)
            r9 = 33
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r9)
        L_0x0422:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C12707vb.mo3210u0(d60.b$b, android.os.Bundle):void");
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        this.f36425z.mo3433r();
    }
}
