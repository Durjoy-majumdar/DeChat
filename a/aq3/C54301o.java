package aq3;

import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import bp3.C54528r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.mm_compose.MMComposeView;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gq3.C59629h;
import gq3.C59649r;
import gy3.C87412m;
import gy3.C87413o;
import ig3.C60281c;
import ig3.C60283e;
import p157gk.C59481e;
import p157gk.C59491j;
import qo3.C89779i0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: aq3.o */
public final class C54301o extends UIComponent {

    /* renamed from: d */
    public final C13601g f152411d;

    /* renamed from: e */
    public final C13601g f152412e = C36568h.m40985a(new C54302a(this));

    /* renamed from: f */
    public C89779i0 f152413f;

    /* renamed from: g */
    public String f152414g = "";

    /* renamed from: h */
    public boolean f152415h;

    /* renamed from: i */
    public C54528r f152416i;

    /* renamed from: aq3.o$a */
    public static final class C54302a extends C87413o implements C32224a<MMComposeView> {

        /* renamed from: d */
        public final /* synthetic */ C54301o f152417d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54302a(C54301o oVar) {
            super(0);
            this.f152417d = oVar;
        }

        public Object invoke() {
            return (MMComposeView) this.f152417d.findViewById(C0966R.C0970id.mdz);
        }
    }

    /* renamed from: aq3.o$b */
    public static final class C54303b extends C87413o implements C32224a<C59629h> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f152418d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54303b(AppCompatActivity appCompatActivity) {
            super(0);
            this.f152418d = appCompatActivity;
        }

        public Object invoke() {
            return (C59629h) C39818r.f106831a.mo62444c(this.f152418d).mo75002a(C59629h.class);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54301o(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f152411d = C36568h.m40985a(new C54303b(appCompatActivity));
    }

    /* renamed from: c3 */
    public final C59629h mo75099c3() {
        return (C59629h) ((C36570n) this.f152411d).getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00a1, code lost:
        if (p157gk.C59503r.f170053n == r0) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00be, code lost:
        if (p157gk.C59503r.f170053n == r0) goto L_0x00c3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0115  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            gk.c r0 = p157gk.C59479c.STOP
            gk.b r1 = p157gk.C59477b.ALL_OLD
            super.onCreate(r12)
            android.content.Intent r12 = r11.getIntent()
            java.lang.String r2 = "KEY_SUG_QUERY_TEXT"
            java.lang.String r12 = r12.getStringExtra(r2)
            if (r12 != 0) goto L_0x0015
            java.lang.String r12 = ""
        L_0x0015:
            r11.f152414g = r12
            android.content.Intent r12 = r11.getIntent()
            java.lang.String r2 = "KEY_IS_INIT"
            r3 = 0
            boolean r12 = r12.getBooleanExtra(r2, r3)
            r11.f152415h = r12
            p157gk.C59491j.f169996a = r3
            r2 = 0
            if (r12 == 0) goto L_0x005d
            androidx.appcompat.app.AppCompatActivity r12 = r11.getActivity()
            r4 = 2131831388(0x7f112a5c, float:1.92958E38)
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getString(r4)
            qo3.i0 r12 = qo3.C89779i0.m112248e(r12, r4, r3, r3, r2)
            r11.f152413f = r12
            a14.n0 r4 = androidx.lifecycle.C54208j0.m60899a(r11)
            a14.h0 r12 = a14.C53872d1.f151119c
            r6 = 0
            aq3.p r7 = new aq3.p
            r7.<init>(r11, r2)
            r8 = 2
            r9 = 0
            r5 = r12
            a14.C53895h.m60466d(r4, r5, r6, r7, r8, r9)
            a14.n0 r5 = androidx.lifecycle.C54208j0.m60899a(r11)
            r7 = 0
            aq3.q r8 = new aq3.q
            r8.<init>(r11, r2)
            r9 = 2
            r10 = 0
            r6 = r12
            a14.C53895h.m60466d(r5, r6, r7, r8, r9, r10)
            goto L_0x0068
        L_0x005d:
            gk.e r12 = p157gk.C59491j.f169998c
            if (r12 == 0) goto L_0x0068
            androidx.appcompat.app.AppCompatActivity r4 = r11.getActivity()
            r12.mo84579a(r4)
        L_0x0068:
            gq3.h r12 = r11.mo75099c3()
            boolean r4 = r11.f152415h
            r12.f170418y = r4
            gq3.h r12 = r11.mo75099c3()
            r4 = 1
            r12.f170399D = r4
            rx3.g r12 = r11.f152412e
            rx3.n r12 = (rx3.C36570n) r12
            java.lang.Object r12 = r12.getValue()
            com.tencent.mm.mm_compose.MMComposeView r12 = (com.tencent.p014mm.mm_compose.MMComposeView) r12
            r5 = -923171977(0xffffffffc8f98377, float:-511003.72)
            aq3.v r6 = new aq3.v
            r6.<init>(r11)
            q0.a r5 = p415q0.C110261c.m149879c(r5, r4, r6)
            r12.setContent(r5)
            ig3.d r12 = ig3.C60282d.f171857a
            gk.e r5 = p157gk.C59491j.f169998c
            if (r5 == 0) goto L_0x00a4
            gk.b r5 = r5.f169961a
            if (r5 == r1) goto L_0x00a6
            gk.r r5 = p157gk.C59503r.f170040a
            r5.getClass()
            gk.c r5 = p157gk.C59503r.f170053n
            if (r5 != r0) goto L_0x00a4
            goto L_0x00a6
        L_0x00a4:
            r5 = 0
            goto L_0x00a7
        L_0x00a6:
            r5 = 1
        L_0x00a7:
            r6 = 2
            if (r5 == 0) goto L_0x00ac
            r5 = 1
            goto L_0x00ad
        L_0x00ac:
            r5 = 2
        L_0x00ad:
            ig3.C60282d.f171865i = r5
            gk.e r5 = p157gk.C59491j.f169998c
            if (r5 == 0) goto L_0x00c1
            gk.b r5 = r5.f169961a
            if (r5 == r1) goto L_0x00c3
            gk.r r1 = p157gk.C59503r.f170040a
            r1.getClass()
            gk.c r1 = p157gk.C59503r.f170053n
            if (r1 != r0) goto L_0x00c1
            goto L_0x00c3
        L_0x00c1:
            r0 = 0
            goto L_0x00c4
        L_0x00c3:
            r0 = 1
        L_0x00c4:
            if (r0 == 0) goto L_0x00c7
            r6 = 1
        L_0x00c7:
            ig3.C60282d.f171873q = r6
            java.lang.String r0 = r11.f152414g
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x00d3
            r0 = 1
            goto L_0x00d4
        L_0x00d3:
            r0 = 0
        L_0x00d4:
            if (r0 == 0) goto L_0x0115
            gq3.h r0 = r11.mo75099c3()
            r0.f170398C = r4
            gq3.h r0 = r11.mo75099c3()
            java.lang.String r1 = "viewModel"
            gy3.C87412m.m108593f(r0, r1)
            java.lang.String r1 = r11.f152414g
            r0.mo84639e3(r1, r2)
            java.lang.String r0 = r11.f152414g
            java.lang.String r1 = "text"
            gy3.C87412m.m108594g(r0, r1)
            ig3.C60283e.f171892o = r0
            long r0 = (long) r4
            ig3.C60283e.f171890m = r0
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "sessionId"
            gy3.C87412m.m108594g(r0, r1)
            ig3.C60283e.f171889l = r0
            java.lang.String r0 = r11.f152414g
            r12.mo85268e(r0)
            r12.mo85269f()
            r0 = 4
            r12.mo85265b(r0)
            goto L_0x011b
        L_0x0115:
            gq3.h r12 = r11.mo75099c3()
            r12.f170398C = r3
        L_0x011b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: aq3.C54301o.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        C59481e eVar = C59491j.f169998c;
        if (eVar != null) {
            eVar.mo84582d();
        }
        C54528r rVar = this.f152416i;
        if (!(rVar == null || rVar.f152885b == null)) {
            rVar.f152884a.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(rVar.f152885b);
        }
        C59629h c3 = mo75099c3();
        if (c3.f170410q.size() > 0) {
            C60281c cVar = C60281c.f171856a;
            cVar.mo85261d(c3.f170410q.size());
            cVar.mo85263f(c3.f170410q.size());
            C59649r value = c3.f170408o.getValue();
            if (C87412m.m108589b(value != null ? value.name() : null, "PERSON")) {
                cVar.mo85262e(c3.f170411r.size());
            }
        }
        C60281c cVar2 = C60281c.f171856a;
        cVar2.mo85260c(56);
        cVar2.mo85260c(57);
        Log.m105924i("MicroMsg.ImageQueryReportProvider", "reportTecSearchAction " + C59491j.f169996a);
        if (!C59491j.f169996a) {
            C60283e.f171878a.mo85271b(8);
        }
    }
}
