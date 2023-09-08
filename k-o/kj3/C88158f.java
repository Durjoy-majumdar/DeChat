package kj3;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.config.WxaExposedParams;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import kr0.C76629w0;
import nj3.C76874e0;
import qo3.C77407n;

/* renamed from: kj3.f */
public class C88158f {

    /* renamed from: a */
    public C77407n f254944a;

    /* renamed from: b */
    public Context f254945b;

    /* renamed from: c */
    public C88169i f254946c;

    /* renamed from: d */
    public WxaExposedParams f254947d = new WxaExposedParams.C81632b().mo113977a();

    /* renamed from: e */
    public String f254948e;

    /* renamed from: f */
    public String f254949f = "";

    /* renamed from: g */
    public String f254950g = "";

    /* renamed from: h */
    public int f254951h;

    /* renamed from: i */
    public boolean f254952i;

    /* renamed from: kj3.f$a */
    public class C88159a implements C77407n.C12924o {
        public C88159a() {
        }

        /* renamed from: a */
        public void mo2362a() {
            C88158f.this.f254944a.mo107572p();
        }
    }

    /* renamed from: kj3.f$b */
    public class C88160b extends C88162d {
        public C88160b() {
            super();
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.mo107142f(2, C88158f.this.f254945b.getString(C0966R.string.f7864uc));
            e0Var.mo107142f(8, C88158f.this.f254945b.getString(C0966R.string.f7862ua));
            e0Var.mo107142f(7, C88158f.m109823b(C88158f.this));
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            super.onMMMenuItemSelected(menuItem, i);
        }
    }

    /* renamed from: kj3.f$c */
    public class C88161c extends C88162d {
        public C88161c() {
            super();
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.mo107142f(3, C88158f.this.f254945b.getString(C0966R.string.f7866ue));
            e0Var.mo107142f(8, C88158f.this.f254945b.getString(C0966R.string.f7862ua));
            e0Var.mo107142f(7, C88158f.m109823b(C88158f.this));
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            super.onMMMenuItemSelected(menuItem, i);
        }
    }

    /* renamed from: kj3.f$d */
    public class C88162d implements C88169i {

        /* renamed from: kj3.f$d$a */
        public class C88163a implements Runnable {
            public C88163a() {
            }

            public void run() {
                C88158f.this.mo122570e(3);
            }
        }

        /* renamed from: kj3.f$d$b */
        public class C88164b implements Runnable {
            public C88164b() {
            }

            public void run() {
                C88158f.this.mo122570e(4);
            }
        }

        public C88162d() {
        }

        /* renamed from: a */
        public View mo122573a() {
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x0124  */
        /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onMMMenuItemSelected(android.view.MenuItem r9, int r10) {
            /*
                r8 = this;
                int r9 = r9.getItemId()
                r10 = 0
                r0 = 4
                java.lang.String r1 = "MicroMsg.AppBrandServiceActionSheet"
                r2 = 100
                r4 = 0
                r5 = 1
                switch(r9) {
                    case 2: goto L_0x0119;
                    case 3: goto L_0x0110;
                    case 4: goto L_0x0108;
                    case 5: goto L_0x00e4;
                    case 6: goto L_0x00c0;
                    case 7: goto L_0x0076;
                    case 8: goto L_0x0011;
                    default: goto L_0x000f;
                }
            L_0x000f:
                goto L_0x0122
            L_0x0011:
                kj3.f r9 = kj3.C88158f.this
                r9.getClass()
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                com.tencent.mm.plugin.appbrand.config.WxaExposedParams r2 = r9.f254947d
                java.lang.String r3 = r2.f239539d
                java.lang.String r2 = r2.f239549q
                if (r3 == 0) goto L_0x0030
                java.lang.String r4 = r9.mo122569d()
                boolean r4 = r3.equals(r4)
                if (r4 == 0) goto L_0x0030
                java.lang.String r4 = ""
                goto L_0x0034
            L_0x0030:
                java.lang.String r4 = r9.mo122569d()
            L_0x0034:
                com.tencent.mm.plugin.appbrand.config.WxaExposedParams$b r6 = new com.tencent.mm.plugin.appbrand.config.WxaExposedParams$b
                r6.<init>()
                r6.f239557a = r3
                r3 = 10
                r6.f239566j = r3
                r6.f239567k = r2
                r6.f239571o = r4
                com.tencent.mm.plugin.appbrand.config.WxaExposedParams r2 = r6.mo113977a()
                java.lang.String r2 = com.tencent.p014mm.plugin.appbrand.C83727p2.m102772b(r2)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "KRawUrl "
                r3.append(r4)
                r3.append(r2)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105926v(r1, r3)
                java.lang.String r1 = "rawUrl"
                r0.putExtra(r1, r2)
                java.lang.String r1 = "forceHideShare"
                r0.putExtra(r1, r5)
                android.content.Context r9 = r9.f254945b
                java.lang.String r1 = "webview"
                java.lang.String r2 = ".ui.tools.WebViewUI"
                ke3.C88144b.m109791i(r9, r1, r2, r0, r10)
                goto L_0x0121
            L_0x0076:
                kj3.f r9 = kj3.C88158f.this
                android.content.Context r2 = r9.f254945b
                com.tencent.mm.plugin.appbrand.config.WxaExposedParams r3 = r9.f254947d
                r9.getClass()
                if (r3 != 0) goto L_0x0088
                java.lang.String r9 = "exportUrlParams is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r9)
                goto L_0x0121
            L_0x0088:
                java.lang.Object[] r6 = new java.lang.Object[r5]
                java.lang.String r7 = r3.toString()
                r6[r4] = r7
                java.lang.String r4 = "exportUrlParams : %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r6)
                java.lang.String r1 = r3.f239542g
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r1 != 0) goto L_0x0121
                android.content.Intent r1 = new android.content.Intent
                r1.<init>()
                java.lang.String r4 = r3.f239542g
                java.lang.String r6 = "key_username"
                r1.putExtra(r6, r4)
                java.lang.String r4 = "key_from_scene"
                r1.putExtra(r4, r0)
                java.lang.String r0 = "key_scene_exposed_params"
                r1.putExtra(r0, r3)
                java.lang.String r0 = "appbrand"
                java.lang.String r3 = ".ui.AppBrandProfileUI"
                ke3.C88144b.m109791i(r2, r0, r3, r1, r10)
                int r10 = r9.f254951h
                r9.mo122568c(r10, r5)
                goto L_0x0121
            L_0x00c0:
                kj3.f r9 = kj3.C88158f.this
                java.lang.String r9 = r9.f254948e
                boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
                if (r9 != 0) goto L_0x0121
                kj3.f r9 = kj3.C88158f.this
                android.content.Context r10 = r9.f254945b
                java.lang.String r9 = r9.f254948e
                kj3.C76587i.m92184d(r10, r9, r4)
                kj3.f r9 = kj3.C88158f.this
                boolean r10 = r9.f254952i
                if (r10 == 0) goto L_0x00dd
                kj3.C88158f.m109822a(r9, r5)
                goto L_0x0121
            L_0x00dd:
                int r10 = r9.f254951h
                r0 = 2
                r9.mo122568c(r10, r0)
                goto L_0x0121
            L_0x00e4:
                kj3.f r9 = kj3.C88158f.this
                java.lang.String r9 = r9.f254948e
                boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
                if (r9 != 0) goto L_0x0121
                kj3.f r9 = kj3.C88158f.this
                android.content.Context r10 = r9.f254945b
                java.lang.String r9 = r9.f254948e
                kj3.C76587i.m92184d(r10, r9, r5)
                kj3.f r9 = kj3.C88158f.this
                boolean r10 = r9.f254952i
                if (r10 == 0) goto L_0x0102
                r10 = 6
                kj3.C88158f.m109822a(r9, r10)
                goto L_0x0121
            L_0x0102:
                int r10 = r9.f254951h
                r9.mo122568c(r10, r0)
                goto L_0x0121
            L_0x0108:
                kj3.f r9 = kj3.C88158f.this
                qo3.n r9 = r9.f254944a
                r9.mo107572p()
                goto L_0x0121
            L_0x0110:
                kj3.f$d$b r9 = new kj3.f$d$b
                r9.<init>()
                com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r9, r2)
                goto L_0x0121
            L_0x0119:
                kj3.f$d$a r9 = new kj3.f$d$a
                r9.<init>()
                com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r9, r2)
            L_0x0121:
                r4 = 1
            L_0x0122:
                if (r4 == 0) goto L_0x012b
                kj3.f r9 = kj3.C88158f.this
                qo3.n r9 = r9.f254944a
                r9.mo107572p()
            L_0x012b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kj3.C88158f.C88162d.onMMMenuItemSelected(android.view.MenuItem, int):void");
        }
    }

    /* renamed from: kj3.f$e */
    public class C88165e extends C88162d {
        public C88165e() {
            super();
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.mo107142f(2, C88158f.this.f254945b.getString(C0966R.string.f7864uc));
            e0Var.mo107142f(8, C88158f.this.f254945b.getString(C0966R.string.f7862ua));
            e0Var.mo107142f(7, C88158f.m109823b(C88158f.this));
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            super.onMMMenuItemSelected(menuItem, i);
        }
    }

    /* renamed from: kj3.f$f */
    public class C88166f extends C88162d {
        public C88166f() {
            super();
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.mo107142f(3, C88158f.this.f254945b.getString(C0966R.string.f7866ue));
            e0Var.mo107142f(8, C88158f.this.f254945b.getString(C0966R.string.f7862ua));
            e0Var.mo107142f(7, C88158f.m109823b(C88158f.this));
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            super.onMMMenuItemSelected(menuItem, i);
        }
    }

    /* renamed from: kj3.f$g */
    public class C88167g extends C88162d {
        public C88167g() {
            super();
        }

        /* renamed from: a */
        public View mo122573a() {
            View inflate = C85868k2.m106137b(C88158f.this.f254945b).inflate(C0966R.C0971layout.f6824pk, (ViewGroup) null);
            ((TextView) inflate.findViewById(C0966R.C0970id.f6104xe)).setText(C88158f.this.f254945b.getString(C0966R.string.f7863ub));
            return inflate;
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.mo107142f(5, C88158f.this.f254945b.getString(C0966R.string.f7752qh));
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            super.onMMMenuItemSelected(menuItem, i);
        }
    }

    /* renamed from: kj3.f$h */
    public class C88168h extends C88162d {
        public C88168h() {
            super();
        }

        /* renamed from: a */
        public View mo122573a() {
            View inflate = C85868k2.m106137b(C88158f.this.f254945b).inflate(C0966R.C0971layout.f6824pk, (ViewGroup) null);
            ((TextView) inflate.findViewById(C0966R.C0970id.f6104xe)).setText(C88158f.this.f254945b.getString(C0966R.string.f7865ud));
            return inflate;
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.mo107142f(6, C88158f.this.f254945b.getString(C0966R.string.f7754qj));
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            super.onMMMenuItemSelected(menuItem, i);
        }
    }

    /* renamed from: kj3.f$i */
    public interface C88169i {
        /* renamed from: a */
        View mo122573a();

        void onCreateMMMenu(C76874e0 e0Var);

        void onMMMenuItemSelected(MenuItem menuItem, int i);
    }

    public C88158f(Context context) {
        this.f254945b = context;
    }

    /* renamed from: a */
    public static void m109822a(C88158f fVar, int i) {
        if (!Util.isNullOrNil(fVar.mo122569d())) {
            Log.m105919d("MicroMsg.AppBrandServiceActionSheet", "stev report(%s), eventId : %s, appId %s, sceneId %s", 13798, Integer.valueOf(i), fVar.f254949f, fVar.f254950g);
            C115669n.INSTANCE.mo160131h(13798, Integer.valueOf(i), fVar.mo122569d(), 0, fVar.f254950g, Long.valueOf(Util.nowSecond()));
        }
    }

    /* renamed from: b */
    public static String m109823b(C88158f fVar) {
        WxaExposedParams wxaExposedParams = fVar.f254947d;
        if (wxaExposedParams == null) {
            return "";
        }
        if (Util.isNullOrNil(wxaExposedParams.f239543h)) {
            if (!Util.isNullOrNil(fVar.f254947d.f239542g)) {
                WxaExposedParams wxaExposedParams2 = fVar.f254947d;
                wxaExposedParams2.f239543h = C76587i.m92183c(wxaExposedParams2.f239542g);
            }
            if (Util.isNullOrNil(fVar.f254947d.f239543h)) {
                fVar.f254947d.f239543h = "";
            }
        }
        return fVar.f254945b.getString(C0966R.string.f7576k5, new Object[]{fVar.f254947d.f239543h});
    }

    /* renamed from: c */
    public final void mo122568c(int i, int i2) {
        if (!Util.isNullOrNil(mo122569d())) {
            Log.m105919d("MicroMsg.AppBrandServiceActionSheet", "stev report(%s), appId : %s, scene %s, sceneId %s, action %s", 13918, this.f254949f, Integer.valueOf(i), this.f254950g, Integer.valueOf(i2));
            C115669n.INSTANCE.mo160131h(13918, mo122569d(), Integer.valueOf(i), this.f254950g, Integer.valueOf(i2), Long.valueOf(Util.nowSecond()));
        }
    }

    /* renamed from: d */
    public final String mo122569d() {
        WxaAttributes N2;
        if (Util.isNullOrNil(this.f254948e)) {
            return null;
        }
        if (Util.isNullOrNil(this.f254949f) && (N2 = ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106879N2(this.f254948e)) != null) {
            this.f254949f = N2.field_appId;
        }
        return this.f254949f;
    }

    /* renamed from: e */
    public void mo122570e(int i) {
        this.f254944a = new C77407n(this.f254945b, 1, true);
        switch (i) {
            case 1:
                this.f254946c = new C88160b();
                break;
            case 2:
                this.f254946c = new C88161c();
                break;
            case 3:
                this.f254946c = new C88167g();
                break;
            case 4:
                this.f254946c = new C88168h();
                break;
            case 5:
                this.f254946c = new C88165e();
                break;
            case 6:
                this.f254946c = new C88166f();
                break;
            default:
                return;
        }
        C88169i iVar = this.f254946c;
        if (iVar == null) {
            Log.m105920e("MicroMsg.AppBrandServiceActionSheet", "resetTitleView, state is null");
        } else {
            View a = iVar.mo122573a();
            if (a != null) {
                this.f254944a.mo107569n(a, false);
            }
        }
        C77407n nVar = this.f254944a;
        nVar.f225771i = new C88171h(this);
        nVar.f225782p = new C88170g(this);
        nVar.f225802y = new C88159a();
        nVar.mo107573q();
    }
}
