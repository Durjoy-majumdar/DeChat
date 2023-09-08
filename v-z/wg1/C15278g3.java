package wg1;

import a14.C53934p0;
import ak1.C54067f0;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C0317e;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.RoundCornerRelativeLayout;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84701w0;
import com.tencent.p014mm.plugin.finder.view.C4077j3;
import com.tencent.p014mm.plugin.finder.view.notice.BigGreenNoticeStatusView;
import com.tencent.p014mm.plugin.finder.view.notice.NoticeGetCouponView;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C7335d;
import di3.C86312j;
import er1.C7776a;
import er1.C7788c1;
import er1.C7802g1;
import f40.C86709a0;
import fe1.C58969q;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import ht1.C8777j5;
import j20.C117292a;
import java.util.LinkedList;
import je1.C33558n2;
import je1.C9363p2;
import je1.C9386w4;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import nj3.C76912y0;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import p200lx.C76736w;
import p565ir.C60606n;
import pe3.C89349b;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import qo3.C89779i0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C48729ak3;
import te3.C49098d51;
import te3.C49359f1;
import te3.C49386f61;
import te3.C49516g51;
import te3.C51559uk1;
import tf0.C13887q1;
import up1.C27696y;
import wx3.C15601d;
import wx3.C66212f;
import zc1.C66785b;

/* renamed from: wg1.g3 */
public final class C15278g3 extends UIComponent implements C11385n {

    /* renamed from: A */
    public String f41546A;

    /* renamed from: B */
    public C58969q f41547B;

    /* renamed from: C */
    public C49098d51 f41548C;

    /* renamed from: D */
    public C89779i0 f41549D;

    /* renamed from: E */
    public String f41550E;

    /* renamed from: d */
    public final C13601g f41551d;

    /* renamed from: e */
    public final C13601g f41552e;

    /* renamed from: f */
    public final C13601g f41553f;

    /* renamed from: g */
    public final C13601g f41554g;

    /* renamed from: h */
    public final C13601g f41555h;

    /* renamed from: i */
    public final C13601g f41556i;

    /* renamed from: j */
    public final C13601g f41557j;

    /* renamed from: n */
    public final C13601g f41558n;

    /* renamed from: o */
    public final C13601g f41559o;

    /* renamed from: p */
    public final C13601g f41560p;

    /* renamed from: q */
    public final C13601g f41561q;

    /* renamed from: r */
    public final C13601g f41562r;

    /* renamed from: s */
    public final C13601g f41563s;

    /* renamed from: t */
    public final C13601g f41564t;

    /* renamed from: u */
    public final C13601g f41565u;

    /* renamed from: v */
    public final C13601g f41566v;

    /* renamed from: w */
    public final C13601g f41567w;

    /* renamed from: x */
    public final C13601g f41568x;

    /* renamed from: y */
    public C49516g51 f41569y;

    /* renamed from: z */
    public int f41570z;

    /* renamed from: wg1.g3$a */
    public static final class C15279a extends C87413o implements C32224a<BigGreenNoticeStatusView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41571d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15279a(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41571d = appCompatActivity;
        }

        public Object invoke() {
            return (BigGreenNoticeStatusView) this.f41571d.findViewById(C0966R.C0970id.okc);
        }
    }

    /* renamed from: wg1.g3$b */
    public static final class C15280b extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41572d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15280b(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41572d = appCompatActivity;
        }

        public Object invoke() {
            return (ImageView) this.f41572d.findViewById(C0966R.C0970id.du9);
        }
    }

    /* renamed from: wg1.g3$c */
    public static final class C15281c extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41573d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15281c(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41573d = appCompatActivity;
        }

        public Object invoke() {
            return (ImageView) this.f41573d.findViewById(C0966R.C0970id.du_);
        }
    }

    /* renamed from: wg1.g3$d */
    public static final class C15282d extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41574d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15282d(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41574d = appCompatActivity;
        }

        public Object invoke() {
            return this.f41574d.findViewById(C0966R.C0970id.a2y);
        }
    }

    /* renamed from: wg1.g3$e */
    public static final class C15283e extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41575d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15283e(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41575d = appCompatActivity;
        }

        public Object invoke() {
            return (ImageView) this.f41575d.findViewById(C0966R.C0970id.o8x);
        }
    }

    /* renamed from: wg1.g3$f */
    public static final class C15284f extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41576d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15284f(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41576d = appCompatActivity;
        }

        public Object invoke() {
            return (ImageView) this.f41576d.findViewById(C0966R.C0970id.nns);
        }
    }

    /* renamed from: wg1.g3$g */
    public static final class C15285g extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41577d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15285g(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41577d = appCompatActivity;
        }

        public Object invoke() {
            return (TextView) this.f41577d.findViewById(C0966R.C0970id.duh);
        }
    }

    /* renamed from: wg1.g3$h */
    public static final class C15286h extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41578d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15286h(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41578d = appCompatActivity;
        }

        public Object invoke() {
            return (WeImageView) this.f41578d.findViewById(C0966R.C0970id.o7n);
        }
    }

    /* renamed from: wg1.g3$i */
    public static final class C15287i extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41579d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15287i(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41579d = appCompatActivity;
        }

        public Object invoke() {
            return (LinearLayout) this.f41579d.findViewById(C0966R.C0970id.o9i);
        }
    }

    /* renamed from: wg1.g3$j */
    public static final class C15288j extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41580d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15288j(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41580d = appCompatActivity;
        }

        public Object invoke() {
            return (TextView) this.f41580d.findViewById(C0966R.C0970id.dus);
        }
    }

    /* renamed from: wg1.g3$k */
    public static final class C15289k extends C87413o implements C32224a<RoundCornerRelativeLayout> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41581d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15289k(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41581d = appCompatActivity;
        }

        public Object invoke() {
            return (RoundCornerRelativeLayout) this.f41581d.findViewById(C0966R.C0970id.duo);
        }
    }

    /* renamed from: wg1.g3$l */
    public static final class C15290l extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41582d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15290l(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41582d = appCompatActivity;
        }

        public Object invoke() {
            return (ImageView) this.f41582d.findViewById(C0966R.C0970id.duu);
        }
    }

    /* renamed from: wg1.g3$m */
    public static final class C15291m extends C87413o implements C32224a<ScrollView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41583d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15291m(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41583d = appCompatActivity;
        }

        public Object invoke() {
            return (ScrollView) this.f41583d.findViewById(C0966R.C0970id.oa9);
        }
    }

    /* renamed from: wg1.g3$n */
    public static final class C15292n extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41584d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15292n(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41584d = appCompatActivity;
        }

        public Object invoke() {
            return (TextView) this.f41584d.findViewById(C0966R.C0970id.duz);
        }
    }

    /* renamed from: wg1.g3$o */
    public static final class C15293o extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41585d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15293o(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41585d = appCompatActivity;
        }

        public Object invoke() {
            return (TextView) this.f41585d.findViewById(C0966R.C0970id.o7c);
        }
    }

    /* renamed from: wg1.g3$p */
    public static final class C15294p extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41586d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15294p(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41586d = appCompatActivity;
        }

        public Object invoke() {
            return (TextView) this.f41586d.findViewById(C0966R.C0970id.f358211m03);
        }
    }

    /* renamed from: wg1.g3$q */
    public static final class C15295q implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C15278g3 f41587d;

        public C15295q(C15278g3 g3Var) {
            this.f41587d = g3Var;
        }

        public final void run() {
            String str;
            C15278g3 g3Var = this.f41587d;
            g3Var.getClass();
            C61926c.m72668M(new C15266d4(true, g3Var, new C15343q3(g3Var)));
            C58969q qVar = g3Var.f41547B;
            String str2 = "";
            String username = qVar != null ? qVar.getUsername() : str2;
            C49098d51 d512 = g3Var.f41548C;
            if (!(d512 == null || (str = d512.f132122h) == null)) {
                str2 = str;
            }
            C86709a0.m107524d().mo123460f(new C9386w4(username, str2));
        }
    }

    /* renamed from: wg1.g3$r */
    public static final class C15296r extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C51559uk1 f41588d;

        /* renamed from: e */
        public final /* synthetic */ C49098d51 f41589e;

        /* renamed from: f */
        public final /* synthetic */ C51559uk1 f41590f;

        /* renamed from: g */
        public final /* synthetic */ C15278g3 f41591g;

        /* renamed from: h */
        public final /* synthetic */ C8479f0<NoticeGetCouponView> f41592h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15296r(C51559uk1 uk12, C49098d51 d512, C51559uk1 uk13, C15278g3 g3Var, C8479f0<NoticeGetCouponView> f0Var) {
            super(0);
            this.f41588d = uk12;
            this.f41589e = d512;
            this.f41590f = uk13;
            this.f41591g = g3Var;
            this.f41592h = f0Var;
        }

        public Object invoke() {
            String str;
            C7788c1 c1Var = C7788c1.f26289a;
            String str2 = this.f41588d.f142894e;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = this.f41589e.f132122h;
            if (str3 == null) {
                str3 = "";
            }
            c1Var.mo8898a(str2, str3, false);
            C51559uk1 uk12 = this.f41590f;
            if (!(uk12 == null || (str = uk12.f142894e) == null)) {
                C15278g3 g3Var = this.f41591g;
                C49098d51 d512 = this.f41589e;
                C8479f0<NoticeGetCouponView> f0Var = this.f41592h;
                String str4 = g3Var.f41550E;
                if (str4 != null) {
                    String str5 = d512.f132122h;
                    String str6 = str5 == null ? "" : str5;
                    C15404z3 z3Var = new C15404z3(str, uk12, d512, f0Var);
                    C7335d c = C86312j.m106911c(C60606n.class);
                    C87412m.m108593f(c, "getService(IFinderLiveFeatureService::class.java)");
                    String O5 = C66785b.f191882e.mo90662O5();
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(str);
                    C13598b0 b0Var = C13598b0.f38549a;
                    C60606n.C60607a.m70860d((C60606n) c, 0, 0, str4, O5, (C89349b) null, linkedList, str6, g3Var.getActivity(), false, z3Var, 256, (Object) null);
                } else {
                    C87412m.m108603p("username");
                    throw null;
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: wg1.g3$s */
    public static final class C15297s extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41593d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15297s(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41593d = appCompatActivity;
        }

        public Object invoke() {
            return this.f41593d.findViewById(C0966R.C0970id.nmb);
        }
    }

    /* renamed from: wg1.g3$t */
    public static final class C15298t extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41594d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15298t(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41594d = appCompatActivity;
        }

        public Object invoke() {
            return (TextView) this.f41594d.findViewById(C0966R.C0970id.iyu);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15278g3(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f41551d = C36568h.m40985a(new C15291m(appCompatActivity));
        this.f41552e = C36568h.m40985a(new C15281c(appCompatActivity));
        this.f41553f = C36568h.m40985a(new C15286h(appCompatActivity));
        this.f41554g = C36568h.m40985a(new C15283e(appCompatActivity));
        this.f41555h = C36568h.m40985a(new C15287i(appCompatActivity));
        this.f41556i = C36568h.m40985a(new C15288j(appCompatActivity));
        this.f41557j = C36568h.m40985a(new C15280b(appCompatActivity));
        this.f41558n = C36568h.m40985a(new C15285g(appCompatActivity));
        this.f41559o = C36568h.m40985a(new C15292n(appCompatActivity));
        this.f41560p = C36568h.m40985a(new C15290l(appCompatActivity));
        this.f41561q = C36568h.m40985a(new C15289k(appCompatActivity));
        this.f41562r = C36568h.m40985a(new C15284f(appCompatActivity));
        this.f41563s = C36568h.m40985a(new C15282d(appCompatActivity));
        this.f41564t = C36568h.m40985a(new C15293o(appCompatActivity));
        this.f41565u = C36568h.m40985a(new C15294p(appCompatActivity));
        this.f41566v = C36568h.m40985a(new C15298t(appCompatActivity));
        this.f41567w = C36568h.m40985a(new C15279a(appCompatActivity));
        this.f41568x = C36568h.m40985a(new C15297s(appCompatActivity));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        if (a14.C53965x0.m60607b(100, r0) == r1) goto L_0x0071;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: c3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m14309c3(wg1.C15278g3 r6, wx3.C15601d r7) {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof wg1.C15352s3
            if (r0 == 0) goto L_0x0016
            r0 = r7
            wg1.s3 r0 = (wg1.C15352s3) r0
            int r1 = r0.f41704g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f41704g = r1
            goto L_0x001b
        L_0x0016:
            wg1.s3 r0 = new wg1.s3
            r0.<init>(r6, r7)
        L_0x001b:
            java.lang.Object r7 = r0.f41702e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f41704g
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r6 = r0.f41701d
            wg1.g3 r6 = (wg1.C15278g3) r6
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0050
        L_0x002e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0036:
            kotlin.ResultKt.throwOnFailure(r7)
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout r7 = r6.mo14161e3()
            if (r7 == 0) goto L_0x0043
            r2 = 0
            r7.setRadius(r2)
        L_0x0043:
            r4 = 100
            r0.f41701d = r6
            r0.f41704g = r3
            java.lang.Object r7 = a14.C53965x0.m60607b(r4, r0)
            if (r7 != r1) goto L_0x0050
            goto L_0x0071
        L_0x0050:
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout r7 = r6.mo14161e3()
            android.graphics.Bitmap r1 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getBitmapFromView(r7)
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout r7 = r6.mo14161e3()
            if (r7 == 0) goto L_0x006c
            android.app.Activity r6 = r6.getContext()
            r0 = 20
            int r6 = com.tencent.p014mm.plugin.appbrand.p026ui.C84701w0.m104350a(r6, r0)
            float r6 = (float) r6
            r7.setRadius(r6)
        L_0x006c:
            java.lang.String r6 = "b"
            gy3.C87412m.m108593f(r1, r6)
        L_0x0071:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wg1.C15278g3.m14309c3(wg1.g3, wx3.d):java.lang.Object");
    }

    /* renamed from: d3 */
    public final TextView mo14160d3() {
        return (TextView) ((C36570n) this.f41558n).getValue();
    }

    /* renamed from: e3 */
    public final RoundCornerRelativeLayout mo14161e3() {
        return (RoundCornerRelativeLayout) ((C36570n) this.f41561q).getValue();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f7189vt;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x015c, code lost:
        if ((r2.length() > 0) == true) goto L_0x0160;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x02d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r37) {
        /*
            r36 = this;
            r6 = r36
            super.onCreate(r37)
            androidx.appcompat.app.AppCompatActivity r0 = r36.getActivity()
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r1 = "KEY_FINDER_LIVE_NOTICE_QR_CONTACT"
            java.lang.String r0 = r0.getStringExtra(r1)
            if (r0 == 0) goto L_0x001f
            fe1.d$b r1 = fe1.C58961d.f168673a
            fe1.q r1 = r1.mo84155b(r0)
            r6.f41547B = r1
            r6.f41550E = r0
        L_0x001f:
            androidx.appcompat.app.AppCompatActivity r0 = r36.getActivity()
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r1 = "KEY_FINDER_LIVE_NOTICE_QR_INFO"
            byte[] r0 = r0.getByteArrayExtra(r1)
            if (r0 == 0) goto L_0x0039
            te3.d51 r1 = new te3.d51
            r1.<init>()
            r6.f41548C = r1
            r1.parseFrom(r0)
        L_0x0039:
            java.lang.Class<pl1.s0> r0 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r1 = ht1.C60200t1.class
            rx3.g r2 = r6.f41551d
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            android.widget.ScrollView r2 = (android.widget.ScrollView) r2
            wg1.w3 r3 = wg1.C15365w3.f41719d
            r2.setOnTouchListener(r3)
            fe1.q r2 = r6.f41547B
            r7 = 0
            r3 = 1
            r8 = 0
            if (r2 == 0) goto L_0x00ee
            java.lang.String r4 = r2.getUsername()
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x005f
            r4 = 1
            goto L_0x0060
        L_0x005f:
            r4 = 0
        L_0x0060:
            if (r4 == 0) goto L_0x0063
            goto L_0x0064
        L_0x0063:
            r2 = r7
        L_0x0064:
            if (r2 == 0) goto L_0x00ee
            bl3.r r4 = bl3.C39818r.f106831a
            bl3.r$a r5 = r4.mo62446e(r1)
            bl3.c r5 = r5.mo62447c(r0)
            pl1.s0 r5 = (pl1.C11990s0) r5
            k60.d r5 = r5.mo11872i2()
            pl1.f r9 = new pl1.f
            java.lang.String r10 = r2.getAvatarUrl()
            r11 = 2
            r9.<init>(r10, r7, r11, r7)
            rx3.g r10 = r6.f41552e
            rx3.n r10 = (rx3.C36570n) r10
            java.lang.Object r10 = r10.getValue()
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            java.lang.String r11 = "mAvatarView"
            gy3.C87412m.m108593f(r10, r11)
            pl1.e0$a r11 = pl1.C11978e0.C11979a.AVATAR
            bl3.r$a r1 = r4.mo62446e(r1)
            bl3.c r0 = r1.mo62447c(r0)
            pl1.s0 r0 = (pl1.C11990s0) r0
            n60.f r0 = r0.mo11867O2(r11)
            r5.mo85957c(r9, r10, r0)
            rx3.g r0 = r6.f41556i
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.Class<ny.h> r1 = p629ny.C76979h.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ny.h r1 = (p629ny.C76979h) r1
            androidx.appcompat.app.AppCompatActivity r4 = r36.getActivity()
            java.lang.String r5 = r2.getNickname()
            android.text.SpannableString r1 = r1.mo107057T1(r4, r5)
            r0.setText(r1)
            java.lang.Class<tf0.p1> r0 = tf0.C64916p1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            java.lang.String r1 = "getService(IFinderCommon…atureService::class.java)"
            gy3.C87412m.m108593f(r0, r1)
            r9 = r0
            tf0.p1 r9 = (tf0.C64916p1) r9
            rx3.g r0 = r6.f41557j
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            r10 = r0
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            java.lang.String r0 = "mAuthView"
            gy3.C87412m.m108593f(r10, r0)
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r11 = r2.field_authInfo
            r12 = 0
            r13 = 0
            r14 = 12
            r15 = 0
            tf0.C64916p1.C64917a.m76444k(r9, r10, r11, r12, r13, r14, r15)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x00ef
        L_0x00ee:
            r0 = r7
        L_0x00ef:
            if (r0 != 0) goto L_0x00f8
            androidx.appcompat.app.AppCompatActivity r0 = r36.getActivity()
            r0.finish()
        L_0x00f8:
            te3.d51 r0 = r6.f41548C
            if (r0 == 0) goto L_0x01a8
            java.lang.String r1 = r0.f132122h
            if (r1 == 0) goto L_0x010d
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0108
            r1 = 1
            goto L_0x0109
        L_0x0108:
            r1 = 0
        L_0x0109:
            if (r1 != r3) goto L_0x010d
            r1 = 1
            goto L_0x010e
        L_0x010d:
            r1 = 0
        L_0x010e:
            if (r1 == 0) goto L_0x0111
            goto L_0x0112
        L_0x0111:
            r0 = r7
        L_0x0112:
            if (r0 == 0) goto L_0x01a8
            androidx.appcompat.app.AppCompatActivity r1 = r36.getActivity()
            android.content.res.Resources r1 = r1.getResources()
            te3.nc3 r2 = r0.f132128q
            if (r2 == 0) goto L_0x0126
            boolean r2 = r2.f138532d
            if (r2 != r3) goto L_0x0126
            r2 = 1
            goto L_0x0127
        L_0x0126:
            r2 = 0
        L_0x0127:
            if (r2 == 0) goto L_0x012d
            r2 = 2131828273(0x7f111e31, float:1.9289482E38)
            goto L_0x0130
        L_0x012d:
            r2 = 2131828272(0x7f111e30, float:1.928948E38)
        L_0x0130:
            java.lang.Object[] r4 = new java.lang.Object[r3]
            er1.j4 r9 = er1.C58739j4.f168176a
            int r5 = r0.f132118d
            long r10 = (long) r5
            r12 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r12
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            r13 = 0
            r14 = 4
            r15 = 0
            java.lang.String r5 = er1.C58739j4.m68254u(r9, r10, r12, r13, r14, r15)
            r4[r8] = r5
            java.lang.String r1 = r1.getString(r2, r4)
            java.lang.String r2 = "activity.resources.getSt…000L, true)\n            )"
            gy3.C87412m.m108593f(r1, r2)
            java.lang.String r2 = r0.f132121g
            if (r2 == 0) goto L_0x015f
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x015b
            r2 = 1
            goto L_0x015c
        L_0x015b:
            r2 = 0
        L_0x015c:
            if (r2 != r3) goto L_0x015f
            goto L_0x0160
        L_0x015f:
            r3 = 0
        L_0x0160:
            if (r3 == 0) goto L_0x0179
            android.widget.TextView r2 = r36.mo14160d3()
            java.lang.String r0 = r0.f132121g
            r2.setText(r0)
            rx3.g r0 = r6.f41559o
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r1)
            goto L_0x018f
        L_0x0179:
            android.widget.TextView r0 = r36.mo14160d3()
            r0.setText(r1)
            rx3.g r0 = r6.f41559o
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 8
            r0.setVisibility(r1)
        L_0x018f:
            android.widget.TextView r0 = r36.mo14160d3()
            r1 = 4
            r0.setVisibility(r1)
            wg1.r3 r3 = new wg1.r3
            r3.<init>(r6, r7)
            r1 = 0
            r2 = 0
            r4 = 3
            r5 = 0
            r0 = r36
            bl3.C0317e.launchUI$default(r0, r1, r2, r3, r4, r5)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x01a9
        L_0x01a8:
            r0 = r7
        L_0x01a9:
            if (r0 != 0) goto L_0x01b2
            androidx.appcompat.app.AppCompatActivity r0 = r36.getActivity()
            r0.finish()
        L_0x01b2:
            androidx.appcompat.app.AppCompatActivity r0 = r36.getActivity()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131165371(0x7f0700bb, float:1.7944957E38)
            int r0 = r0.getDimensionPixelOffset(r1)
            rx3.g r1 = r6.f41563s
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.view.View r1 = (android.view.View) r1
            androidx.appcompat.app.AppCompatActivity r2 = r36.getActivity()
            int r2 = com.tencent.p014mm.p136ui.C75044y4.m89994f(r2)
            r1.setPadding(r0, r2, r0, r8)
            rx3.g r0 = r6.f41563s
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            wg1.x3 r1 = new wg1.x3
            r1.<init>(r6)
            r0.setOnClickListener(r1)
            java.lang.Class<mr.m> r0 = p204mr.C61568m.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            java.lang.String r1 = "getService(IHellLiveVisitorReoprter::class.java)"
            gy3.C87412m.m108593f(r0, r1)
            r8 = r0
            mr.m r8 = (p204mr.C61568m) r8
            ak1.k0 r9 = ak1.C0077k0.ExposeProfile
            java.lang.String r10 = r6.f41550E
            if (r10 == 0) goto L_0x02d5
            r11 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            te3.d51 r0 = r6.f41548C
            if (r0 == 0) goto L_0x0213
            java.lang.String r0 = r0.f132122h
            r21 = r0
            goto L_0x0215
        L_0x0213:
            r21 = r7
        L_0x0215:
            r22 = 0
            r23 = 0
            r25 = 0
            r26 = 30688(0x77e0, float:4.3003E-41)
            r27 = 0
            java.lang.String r14 = "200"
            p204mr.C61568m.C61569a.m72263a(r8, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r25, r26, r27)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            te3.d51 r1 = r6.f41548C
            if (r1 == 0) goto L_0x0231
            java.lang.String r1 = r1.f132122h
            if (r1 != 0) goto L_0x0233
        L_0x0231:
            java.lang.String r1 = ""
        L_0x0233:
            java.lang.String r2 = "notice_id"
            r0.put(r2, r1)
            java.lang.Class<ht1.j5> r1 = ht1.C8777j5.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            java.lang.String r2 = "getService(IHellLiveReport::class.java)"
            gy3.C87412m.m108593f(r1, r2)
            r28 = r1
            ht1.j5 r28 = (ht1.C8777j5) r28
            ak1.f0$n r29 = ak1.C54067f0.C0066n.LIVE_VISITOR_POSTER
            r31 = 0
            r33 = 0
            r34 = 20
            r35 = 0
            java.lang.String r32 = "200"
            r30 = r0
            ht1.C8777j5.C8778a.m8609j(r28, r29, r30, r31, r32, r33, r34, r35)
            rx3.g r0 = r6.f41566v
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = "shareBtn"
            gy3.C87412m.m108593f(r0, r1)
            er1.C7919x.m8091a(r0)
            rx3.g r0 = r6.f41566v
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            android.widget.TextView r0 = (android.widget.TextView) r0
            wg1.y3 r1 = new wg1.y3
            r1.<init>(r6)
            r0.setOnClickListener(r1)
            te3.d51 r0 = r6.f41548C
            if (r0 == 0) goto L_0x029b
            rx3.g r1 = r6.f41567w
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            com.tencent.mm.plugin.finder.view.notice.BigGreenNoticeStatusView r1 = (com.tencent.p014mm.plugin.finder.view.notice.BigGreenNoticeStatusView) r1
            fe1.q r2 = r6.f41547B
            if (r2 == 0) goto L_0x0293
            java.lang.String r7 = r2.getUsername()
        L_0x0293:
            wg1.a4 r2 = new wg1.a4
            r2.<init>(r0)
            r1.mo5009f(r7, r2)
        L_0x029b:
            rx3.g r0 = r6.f41567w
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            com.tencent.mm.plugin.finder.view.notice.BigGreenNoticeStatusView r0 = (com.tencent.p014mm.plugin.finder.view.notice.BigGreenNoticeStatusView) r0
            wg1.v3 r1 = new wg1.v3
            r1.<init>(r6)
            r0.setProgressDoneAndNextAction(r1)
            ob0.b0 r0 = f40.C86709a0.m107524d()
            r1 = 6276(0x1884, float:8.795E-42)
            r0.mo123455a(r1, r6)
            ob0.b0 r0 = f40.C86709a0.m107524d()
            r1 = 4214(0x1076, float:5.905E-42)
            r0.mo123455a(r1, r6)
            ob0.b0 r0 = f40.C86709a0.m107524d()
            r1 = 6653(0x19fd, float:9.323E-42)
            r0.mo123455a(r1, r6)
            android.view.View r0 = r36.getRootView()
            wg1.g3$q r1 = new wg1.g3$q
            r1.<init>(r6)
            r0.post(r1)
            return
        L_0x02d5:
            java.lang.String r0 = "username"
            gy3.C87412m.m108603p(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: wg1.C15278g3.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107524d().mo123470p(6276, this);
        C86709a0.m107524d().mo123470p(4214, this);
        C86709a0.m107524d().mo123470p(6653, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C49098d51 d512;
        String str2;
        String str3;
        String str4;
        Bitmap bitmap;
        LinkedList<C48729ak3> linkedList;
        String str5;
        int i3 = i2;
        C117747y yVar2 = yVar;
        C11978e0.C11979a aVar = C11978e0.C11979a.DEFAULT;
        C27696y yVar3 = C27696y.THUMB_IMAGE;
        Class cls = C60200t1.class;
        Class cls2 = C11990s0.class;
        boolean z = false;
        C13598b0 b0Var = null;
        C61926c.m72668M(new C15266d4(false, this, (DialogInterface.OnCancelListener) null));
        String str6 = "";
        boolean z2 = true;
        if (yVar2 instanceof C9386w4) {
            if (i == 0 && i3 == 0) {
                C49516g51 l1 = ((C9386w4) yVar2).mo10114l1();
                this.f41569y = l1;
                String str7 = l1.f133860g;
                this.f41546A = str7;
                if (str7 == null || str7.length() == 0) {
                    ImageView imageView = (ImageView) ((C36570n) this.f41562r).getValue();
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                    ((LinearLayout) ((C36570n) this.f41555h).getValue()).setPadding(C84701w0.m104350a(getContext(), 32), C84701w0.m104350a(getContext(), 80), C84701w0.m104350a(getContext(), 32), C84701w0.m104350a(getContext(), 40));
                    ViewGroup.LayoutParams layoutParams = mo14160d3().getLayoutParams();
                    if (layoutParams != null && (layoutParams instanceof LinearLayout.LayoutParams)) {
                        ((LinearLayout.LayoutParams) layoutParams).topMargin = C84701w0.m104350a(getContext(), 64);
                        mo14160d3().setLayoutParams(layoutParams);
                    }
                } else {
                    C39818r rVar = C39818r.f106831a;
                    C60979d<C100810g0> f2 = ((C11990s0) rVar.mo62446e(cls).mo62447c(cls2)).mo11871f2();
                    C11984n0 n0Var = new C11984n0(this.f41546A, yVar3);
                    ImageView imageView2 = (ImageView) ((C36570n) this.f41562r).getValue();
                    C87412m.m108593f(imageView2, "mCoverImageView");
                    f2.mo85957c(n0Var, imageView2, ((C11990s0) rVar.mo62446e(cls).mo62447c(cls2)).mo11867O2(aVar));
                    ImageView imageView3 = (ImageView) ((C36570n) this.f41562r).getValue();
                    if (imageView3 != null) {
                        imageView3.setVisibility(0);
                    }
                    ((LinearLayout) ((C36570n) this.f41555h).getValue()).setPadding(C84701w0.m104350a(getContext(), 32), C84701w0.m104350a(getContext(), 40), C84701w0.m104350a(getContext(), 32), C84701w0.m104350a(getContext(), 40));
                    ViewGroup.LayoutParams layoutParams2 = mo14160d3().getLayoutParams();
                    if (layoutParams2 != null && (layoutParams2 instanceof LinearLayout.LayoutParams)) {
                        ((LinearLayout.LayoutParams) layoutParams2).topMargin = C84701w0.m104350a(getContext(), 40);
                        mo14160d3().setLayoutParams(layoutParams2);
                    }
                }
                mo14160d3().setVisibility(4);
                C0317e.launchUI$default(this, (C66212f) null, (C53934p0) null, new C15348r3(this, (C15601d<? super C15348r3>) null), 3, (Object) null);
                StringBuilder sb = new StringBuilder();
                sb.append("qrcode url ");
                C49516g51 g512 = this.f41569y;
                sb.append(g512 != null ? g512.f133859f : null);
                Log.m105924i("FinderLiveNoticeQRCodeUIC", sb.toString());
                C15320l4 l4Var = C15320l4.f41639a;
                C49516g51 g513 = this.f41569y;
                C49386f61 b = l4Var.mo14171b(g513 != null ? g513.f133864n : 0);
                if (b != null) {
                    Log.m105924i("FinderLiveNoticeQRCodeUIC", "#setStyleToUI bg_type=" + b.f133310e + " bg_sub_type=" + b.f133311f + " fg_color=" + b.f133312g + " finder_logo_color=" + b.f133313h + " auth_icon_url=" + b.f133314i);
                    this.f41570z = b.f133309d;
                    int i4 = b.f133310e;
                    if (i4 == 0) {
                        String str8 = b.f133311f;
                        if (str8 != null) {
                            if (!(str8.length() > 0)) {
                                str8 = null;
                            }
                            if (str8 != null) {
                                try {
                                    ((ImageView) ((C36570n) this.f41554g).getValue()).setImageBitmap((Bitmap) null);
                                    ((ImageView) ((C36570n) this.f41554g).getValue()).setBackgroundColor(Color.parseColor(str8));
                                } catch (Exception e) {
                                    Log.m105920e("FinderLiveNoticeQRCodeUIC", e.toString());
                                }
                            }
                        }
                    } else if (i4 == 1) {
                        C58969q qVar = this.f41547B;
                        if (qVar != null) {
                            if (!(qVar.getUsername().length() > 0)) {
                                qVar = null;
                            }
                            if (qVar != null) {
                                C7335d c = C86312j.m106911c(cls);
                                C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
                                C60200t1.C60201a.m70367e((C60200t1) c, qVar.getAvatarUrl(), (ImageView) ((C36570n) this.f41554g).getValue(), (C11978e0.C11979a) null, 4, (Object) null);
                            }
                        }
                    } else if (i4 == 2 && (str5 = b.f133311f) != null) {
                        if (!(str5.length() > 0)) {
                            str5 = null;
                        }
                        if (str5 != null) {
                            C39818r rVar2 = C39818r.f106831a;
                            C60979d<C100810g0> f25 = ((C11990s0) rVar2.mo62446e(cls).mo62447c(cls2)).mo11871f2();
                            C11984n0 n0Var2 = new C11984n0(str5, yVar3);
                            ImageView imageView4 = (ImageView) ((C36570n) this.f41554g).getValue();
                            C87412m.m108593f(imageView4, "mContentStyleBg");
                            f25.mo85957c(n0Var2, imageView4, ((C11990s0) rVar2.mo62446e(cls).mo62447c(cls2)).mo11867O2(aVar));
                        }
                    }
                    String str9 = b.f133312g;
                    if (str9 != null) {
                        if (!(str9.length() > 0)) {
                            str9 = null;
                        }
                        if (str9 != null) {
                            try {
                                int parseColor = Color.parseColor(str9);
                                ((TextView) ((C36570n) this.f41556i).getValue()).setTextColor(parseColor);
                                mo14160d3().setTextColor(parseColor);
                                ((TextView) ((C36570n) this.f41559o).getValue()).setTextColor(parseColor);
                                ((TextView) ((C36570n) this.f41564t).getValue()).setTextColor(parseColor);
                                ((TextView) ((C36570n) this.f41565u).getValue()).setTextColor(parseColor);
                            } catch (Exception e2) {
                                Log.m105920e("FinderLiveNoticeQRCodeUIC", e2.toString());
                            }
                        }
                    }
                    String str10 = b.f133313h;
                    if (str10 != null) {
                        if (!(str10.length() > 0)) {
                            str10 = null;
                        }
                        if (str10 != null) {
                            try {
                                ((WeImageView) ((C36570n) this.f41553f).getValue()).setIconColor(Color.parseColor(str10));
                            } catch (Exception e3) {
                                Log.m105920e("FinderLiveNoticeQRCodeUIC", e3.toString());
                            }
                        }
                    }
                    String str11 = b.f133314i;
                    if (str11 != null) {
                        if (str11.length() <= 0) {
                            z2 = false;
                        }
                        if (!z2) {
                            str11 = null;
                        }
                        if (str11 != null) {
                            C39818r rVar3 = C39818r.f106831a;
                            C60979d<C100810g0> f26 = ((C11990s0) rVar3.mo62446e(cls).mo62447c(cls2)).mo11871f2();
                            C11984n0 n0Var3 = new C11984n0(str11, yVar3);
                            ImageView imageView5 = (ImageView) ((C36570n) this.f41557j).getValue();
                            C87412m.m108593f(imageView5, "mAuthView");
                            f26.mo85957c(n0Var3, imageView5, ((C11990s0) rVar3.mo62446e(cls).mo62447c(cls2)).mo11867O2(aVar));
                        }
                    }
                }
                C49516g51 g514 = this.f41569y;
                if (g514 == null || (linkedList = g514.f133862i) == null) {
                    bitmap = null;
                } else {
                    bitmap = null;
                    for (C48729ak3 ak32 : linkedList) {
                        if (ak32.f130595e.contains(Integer.valueOf(this.f41570z))) {
                            C89349b bVar = ak32.f130594d;
                            bitmap = BitmapUtil.decodeByteArray(bVar != null ? bVar.f257327a : null);
                        }
                    }
                }
                if (bitmap == null) {
                    C49516g51 g515 = this.f41569y;
                    if (!Util.isNullOrNil(g515 != null ? g515.f133859f : null)) {
                        C49516g51 g516 = this.f41569y;
                        String str12 = g516 != null ? g516.f133859f : null;
                        bitmap = str12 == null ? null : ((C76736w) C86312j.m106911c(C76736w.class)).mo106913qj(getActivity(), str12, 12, 0);
                    }
                    C13598b0 b0Var2 = C13598b0.f38549a;
                }
                if (bitmap != null) {
                    ((ImageView) ((C36570n) this.f41560p).getValue()).setImageBitmap(bitmap);
                    View view = (View) ((C36570n) this.f41568x).getValue();
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar2.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorNoticeQRCodeUIC", "setQrCodeStyle", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorNoticeQRCodeUIC", "setQrCodeStyle", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    b0Var = C13598b0.f38549a;
                }
                if (b0Var == null) {
                    C76912y0.m92769h(getActivity(), getActivity().getResources().getString(C0966R.string.dzr), C0966R.raw.icons_filled_close);
                }
            } else {
                C76912y0.m92769h(getActivity(), getActivity().getResources().getString(C0966R.string.dzr), C0966R.raw.icons_filled_close);
            }
            C8777j5 j5Var = (C8777j5) C86312j.m106911c(C8777j5.class);
            C54067f0.C0050b0 b0Var3 = C54067f0.C0050b0.LIVE_GO_IN_NOTICE_ACTIVITY;
            C49098d51 d513 = this.f41548C;
            if (d513 == null || (str4 = d513.f132121g) == null) {
                str4 = str6;
            }
            j5Var.mo9608aH(b0Var3, str6, str4);
        } else if (yVar2 instanceof C9363p2) {
            if (i == 0 && i3 == 0) {
                C13887q1 q1Var = (C13887q1) C86312j.m106911c(C13887q1.class);
                C49098d51 d514 = this.f41548C;
                if (d514 == null || (str2 = d514.f132122h) == null) {
                    str2 = str6;
                }
                q1Var.Cg0(str2);
                Intent intent = new Intent();
                C49098d51 d515 = this.f41548C;
                if (!(d515 == null || (str3 = d515.f132122h) == null)) {
                    str6 = str3;
                }
                intent.putExtra("ACTIVITY_RESULT_REMOVE_NOTICE_KEY", str6);
                getActivity().setResult(1000, intent);
                getActivity().finish();
                C76912y0.m92768g(getContext(), getActivity().getResources().getString(C0966R.string.lrz));
            } else if (i3 == -200211) {
                if (str == null || str.length() == 0) {
                    z = true;
                }
                String string = z ? getActivity().getResources().getString(C0966R.string.f360648n24) : str;
                C87412m.m108593f(string, "if (errMsg.isNullOrEmpty…              else errMsg");
                C76912y0.m92767f(getContext(), string);
            } else {
                C76912y0.m92767f(getContext(), getActivity().getResources().getString(C0966R.string.n25));
            }
        } else if ((yVar2 instanceof C33558n2) && i == 0 && i3 == 0 && (d512 = this.f41548C) != null) {
            C51559uk1 a = C7802g1.m7949a(d512);
            if (C7802g1.m7950b(d512) && a != null) {
                C49359f1 f1Var = a.f142912z;
                if (f1Var == null || C7776a.m7931a(f1Var)) {
                    z2 = false;
                }
                if (z2) {
                    b0Var = a;
                }
                if (b0Var != null) {
                    C7788c1 c1Var = C7788c1.f26289a;
                    String str13 = a.f142894e;
                    if (str13 == null) {
                        str13 = str6;
                    }
                    String str14 = d512.f132122h;
                    if (str14 != null) {
                        str6 = str14;
                    }
                    c1Var.mo8899b(str13, str6, false);
                }
                C8479f0 f0Var = new C8479f0();
                f0Var.f27484d = C4077j3.f18208a.mo4972a(getActivity(), d512.f132121g, ((long) d512.f132118d) * 1000, a, new C15296r(a, d512, a, this, f0Var));
            }
        }
    }
}
