package ni2;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.C103422m;
import bx0.C39846d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.box.webview.BoxWebView;
import com.tencent.p014mm.plugin.webview.core.C43558z;
import com.tencent.p014mm.plugin.webview.stub.C43783b;
import com.tencent.p014mm.plugin.webview.stub.C43791l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.WebSettings;
import cx0.C45212a;
import cx0.C45214c;
import cx0.C45215d;
import cx0.C45218e;
import di3.C86312j;
import e00.C45513i0;
import e00.C45520t;
import e00.C7574m0;
import gy3.C8480h;
import gy3.C87412m;
import mi2.C10897e;
import p256vw.C53002g;
import rx3.C48096k;
import te3.C52267zi;
import zt3.C119157j;

/* renamed from: ni2.d */
public final class C47260d extends C103422m implements C39846d {

    /* renamed from: f */
    public C52267zi f126871f;

    /* renamed from: g */
    public Context f126872g;

    /* renamed from: h */
    public C45520t f126873h;

    /* renamed from: i */
    public C47262b f126874i = new C47262b(this);

    /* renamed from: j */
    public C47261a f126875j = new C47261a(this);

    /* renamed from: n */
    public View f126876n;

    /* renamed from: o */
    public Button f126877o;

    /* renamed from: p */
    public TextView f126878p;

    /* renamed from: q */
    public TextView f126879q;

    /* renamed from: r */
    public FrameLayout f126880r;

    /* renamed from: s */
    public FrameLayout f126881s;

    /* renamed from: t */
    public BoxWebView f126882t;

    /* renamed from: u */
    public C53002g f126883u;

    /* renamed from: ni2.d$a */
    public static final class C47261a extends C43783b {

        /* renamed from: e */
        public final /* synthetic */ C47260d f126884e;

        public C47261a(C47260d dVar) {
            this.f126884e = dVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
            r1 = r2.mo67716e3();
         */
        /* renamed from: e3 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String mo7037e3() {
            /*
                r5 = this;
                java.lang.String r0 = ""
                java.lang.String r1 = "MicroMsg.SelectTextDialog"
                java.lang.String r2 = " getCommitUrl"
                com.tencent.p014mm.sdk.platformtools.Log.m105926v(r1, r2)
                ni2.d r2 = r5.f126884e     // Catch:{ all -> 0x0018 }
                e00.t r2 = r2.f126873h     // Catch:{ all -> 0x0018 }
                if (r2 == 0) goto L_0x0017
                java.lang.String r1 = r2.mo67716e3()     // Catch:{ all -> 0x0018 }
                if (r1 != 0) goto L_0x0016
                goto L_0x0017
            L_0x0016:
                r0 = r1
            L_0x0017:
                return r0
            L_0x0018:
                r2 = move-exception
                r3 = 0
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.String r4 = "getCommitUrl exception"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r4, r3)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ni2.C47260d.C47261a.mo7037e3():java.lang.String");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
            r1 = r2.getCurrentUrl();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String getCurrentUrl() {
            /*
                r5 = this;
                java.lang.String r0 = ""
                java.lang.String r1 = "MicroMsg.SelectTextDialog"
                java.lang.String r2 = "getCurrentUrl"
                com.tencent.p014mm.sdk.platformtools.Log.m105926v(r1, r2)
                ni2.d r2 = r5.f126884e     // Catch:{ all -> 0x0018 }
                e00.t r2 = r2.f126873h     // Catch:{ all -> 0x0018 }
                if (r2 == 0) goto L_0x0017
                java.lang.String r1 = r2.getCurrentUrl()     // Catch:{ all -> 0x0018 }
                if (r1 != 0) goto L_0x0016
                goto L_0x0017
            L_0x0016:
                r0 = r1
            L_0x0017:
                return r0
            L_0x0018:
                r2 = move-exception
                r3 = 0
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.String r4 = "getCommitUrl exception"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r4, r3)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ni2.C47260d.C47261a.getCurrentUrl():java.lang.String");
        }
    }

    /* renamed from: ni2.d$b */
    public static final class C47262b extends C43558z {

        /* renamed from: b */
        public final /* synthetic */ C47260d f126885b;

        public C47262b(C47260d dVar) {
            this.f126885b = dVar;
        }

        /* renamed from: e */
        public void mo64862e() {
            C43791l m;
            try {
                C45520t tVar = this.f126885b.f126873h;
                if (tVar != null && (m = tVar.mo67731m()) != null) {
                    C47260d dVar = this.f126885b;
                    C47261a aVar = dVar.f126875j;
                    C45520t tVar2 = dVar.f126873h;
                    m.Np0(aVar, tVar2 != null ? tVar2.mo67719g() : 0);
                }
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.SelectTextDialog", th, "initWebViewController exception", new Object[0]);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47260d(Context context, C52267zi ziVar, C53002g gVar) {
        super(context, C0966R.style.f8366fw);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(ziVar, "homeContext");
        C10897e eVar = C10897e.f32521b;
        ((C7574m0) C86312j.m106911c(C7574m0.class)).mo8345PO(eVar);
        this.f126872g = context;
        this.f126871f = ziVar;
        this.f126883u = gVar;
        Log.m105919d("MicroMsg.SelectTextDialog", "url: %s", ziVar.f145968f);
        Context context2 = this.f126872g;
        Drawable drawable = null;
        if (context2 != null) {
            BoxWebView boxWebView = new BoxWebView(context2);
            this.f126882t = boxWebView;
            boxWebView.mo63455c0((C45212a) null, (C45214c) null);
            if (C85875k4.m106211z()) {
                BoxWebView boxWebView2 = this.f126882t;
                WebSettings settings = boxWebView2 != null ? boxWebView2.getSettings() : null;
                if (settings != null) {
                    settings.setForceDarkMode(2);
                }
                BoxWebView boxWebView3 = this.f126882t;
                if (boxWebView3 != null) {
                    boxWebView3.setBackgroundColor(0);
                }
                BoxWebView boxWebView4 = this.f126882t;
                drawable = boxWebView4 != null ? boxWebView4.getBackground() : drawable;
                if (drawable != null) {
                    drawable.setAlpha(0);
                }
            }
            FrameLayout frameLayout = this.f126881s;
            if (frameLayout != null) {
                frameLayout.addView(this.f126882t);
            }
            setCancelable(true);
            BoxWebView boxWebView5 = this.f126882t;
            C87412m.m108591d(boxWebView5);
            C45520t Q3 = ((C45513i0) C86312j.m106911c(C45513i0.class)).mo70780Q3(boxWebView5, new C45520t.C45522b((C45520t.C45523c) null, true, false, false, true, 0, false, 105, (C8480h) null), eVar);
            this.f126873h = Q3;
            if (Q3 != null) {
                Q3.mo67741p(this.f126874i);
            }
            C45520t tVar = this.f126873h;
            if (tVar != null) {
                tVar.init();
            }
            ((C119157j) C119157j.f356862d).mo183895z(new C47259c(this));
            return;
        }
        C87412m.m108603p("mContext");
        throw null;
    }

    /* renamed from: k0 */
    public Context mo62488k0() {
        Context context = this.f126872g;
        if (context != null) {
            return context;
        }
        C87412m.m108603p("mContext");
        throw null;
    }

    /* renamed from: l0 */
    public BoxWebView mo62489l0() {
        return this.f126882t;
    }

    /* renamed from: m0 */
    public C45218e mo62490m0() {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    /* renamed from: n0 */
    public void mo62491n0() {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    /* renamed from: o0 */
    public C45215d mo62492o0() {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            super.onCreate(r6)
            android.view.Window r6 = r5.getWindow()
            r0 = -1
            if (r6 == 0) goto L_0x000d
            r6.setLayout(r0, r0)
        L_0x000d:
            android.view.Window r6 = r5.getWindow()
            if (r6 == 0) goto L_0x0018
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r6.addFlags(r1)
        L_0x0018:
            android.view.Window r6 = r5.getWindow()
            if (r6 == 0) goto L_0x0023
            r1 = 1056964608(0x3f000000, float:0.5)
            r6.setDimAmount(r1)
        L_0x0023:
            android.view.Window r6 = r5.getWindow()
            if (r6 == 0) goto L_0x002f
            r1 = 2131886334(0x7f1200fe, float:1.9407244E38)
            r6.setWindowAnimations(r1)
        L_0x002f:
            r6 = 1
            r5.mo143460C(r6)
            android.content.Context r1 = r5.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r2 = 2131497377(0x7f0c11a1, float:1.8618345E38)
            r3 = 0
            r4 = 0
            android.view.View r1 = r1.inflate(r2, r3, r4)
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r2.<init>(r0, r0)
            r5.setContentView(r1, r2)
            r5.f126876n = r1
            if (r1 == 0) goto L_0x005a
            r0 = 2131316944(0x7f0950d0, float:1.8252384E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            goto L_0x005b
        L_0x005a:
            r0 = r3
        L_0x005b:
            r5.f126881s = r0
            android.view.View r0 = r5.f126876n
            if (r0 == 0) goto L_0x006b
            r1 = 2131305878(0x7f092596, float:1.822994E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            goto L_0x006c
        L_0x006b:
            r0 = r3
        L_0x006c:
            r5.f126880r = r0
            android.view.View r0 = r5.f126876n
            if (r0 == 0) goto L_0x007c
            r1 = 2131302415(0x7f09180f, float:1.8222915E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.Button r0 = (android.widget.Button) r0
            goto L_0x007d
        L_0x007c:
            r0 = r3
        L_0x007d:
            r5.f126877o = r0
            android.view.View r0 = r5.f126876n
            if (r0 == 0) goto L_0x008d
            r1 = 2131301012(0x7f091294, float:1.822007E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            goto L_0x008e
        L_0x008d:
            r0 = r3
        L_0x008e:
            r5.f126878p = r0
            android.view.View r0 = r5.f126876n
            if (r0 == 0) goto L_0x009e
            r1 = 2131301037(0x7f0912ad, float:1.822012E38)
            android.view.View r0 = r0.findViewById(r1)
            r3 = r0
            android.widget.TextView r3 = (android.widget.TextView) r3
        L_0x009e:
            r5.f126879q = r3
            android.widget.TextView r0 = r5.f126878p
            if (r0 == 0) goto L_0x00ac
            ni2.a r1 = new ni2.a
            r1.<init>(r5)
            r0.setOnClickListener(r1)
        L_0x00ac:
            android.widget.FrameLayout r0 = r5.f126881s
            if (r0 == 0) goto L_0x00b5
            com.tencent.mm.plugin.box.webview.BoxWebView r1 = r5.f126882t
            r0.addView(r1)
        L_0x00b5:
            ni2.b r0 = new ni2.b
            r0.<init>(r5)
            r5.setOnDismissListener(r0)
            r5.setCancelable(r6)
            vw.g r0 = r5.f126883u
            if (r0 == 0) goto L_0x0126
            java.lang.String r1 = r0.getTitle()
            if (r1 == 0) goto L_0x00d3
            int r2 = r1.length()
            if (r2 != 0) goto L_0x00d1
            goto L_0x00d3
        L_0x00d1:
            r2 = 0
            goto L_0x00d4
        L_0x00d3:
            r2 = 1
        L_0x00d4:
            if (r2 == 0) goto L_0x00e1
            android.widget.TextView r1 = r5.f126879q
            if (r1 != 0) goto L_0x00db
            goto L_0x0101
        L_0x00db:
            r2 = 8
            r1.setVisibility(r2)
            goto L_0x0101
        L_0x00e1:
            android.widget.TextView r2 = r5.f126879q
            if (r2 == 0) goto L_0x00f1
            android.text.TextPaint r2 = r2.getPaint()
            if (r2 == 0) goto L_0x00f1
            r3 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r2, r3)
        L_0x00f1:
            android.widget.TextView r2 = r5.f126879q
            if (r2 != 0) goto L_0x00f6
            goto L_0x00f9
        L_0x00f6:
            r2.setText(r1)
        L_0x00f9:
            android.widget.TextView r1 = r5.f126879q
            if (r1 != 0) goto L_0x00fe
            goto L_0x0101
        L_0x00fe:
            r1.setVisibility(r4)
        L_0x0101:
            java.lang.String r1 = r0.mo8618a()
            if (r1 == 0) goto L_0x010f
            int r2 = r1.length()
            if (r2 != 0) goto L_0x010e
            goto L_0x010f
        L_0x010e:
            r6 = 0
        L_0x010f:
            if (r6 != 0) goto L_0x0119
            android.widget.Button r6 = r5.f126877o
            if (r6 != 0) goto L_0x0116
            goto L_0x0119
        L_0x0116:
            r6.setText(r1)
        L_0x0119:
            android.view.View r6 = r0.mo8619b()
            if (r6 == 0) goto L_0x0126
            android.widget.FrameLayout r0 = r5.f126880r
            if (r0 == 0) goto L_0x0126
            r0.addView(r6)
        L_0x0126:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni2.C47260d.onCreate(android.os.Bundle):void");
    }

    public void show() {
        Window window = getWindow();
        if (window != null) {
            window.addFlags(Integer.MIN_VALUE);
        }
        try {
            if (getContext() instanceof Activity) {
                Context context = getContext();
                C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
                if (((Activity) context).isFinishing()) {
                    Log.m105928w("MicroMsg.SelectTextDialog", "realShowDialog ui is finishing and ignore");
                    return;
                }
            }
            super.show();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SelectTextDialog", e, "realShowDialog exception", new Object[0]);
        }
    }
}
