package q52;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.utils.C84751i1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import zp3.C23564m;

/* renamed from: q52.h */
public final class C89468h extends C62582g {

    /* renamed from: a */
    public final Context f257515a;

    /* renamed from: b */
    public final String f257516b = "WAGameVConsole.html";

    /* renamed from: c */
    public final String f257517c = ("wagame://" + WeChatHosts.domainString(C0966R.string.fme) + XVFSFile.SEPARATOR_CHAR + "WAGameVConsole.html");

    /* renamed from: d */
    public final C13601g f257518d = C36568h.m40985a(C47759a.f128275d);

    /* renamed from: e */
    public FrameLayout f257519e;

    /* renamed from: f */
    public WebView f257520f;

    /* renamed from: g */
    public C77304c f257521g;

    /* renamed from: h */
    public final ArrayList<String> f257522h = new ArrayList<>();

    /* renamed from: i */
    public boolean f257523i;

    /* renamed from: j */
    public boolean f257524j;

    /* renamed from: k */
    public boolean f257525k;

    /* renamed from: l */
    public boolean f257526l;

    /* renamed from: q52.h$a */
    public static final class C47759a extends C87413o implements C32224a<Float> {

        /* renamed from: d */
        public static final C47759a f128275d = new C47759a();

        public C47759a() {
            super(0);
        }

        public Object invoke() {
            return Float.valueOf((float) MMApplicationContext.getContext().getResources().getDisplayMetrics().heightPixels);
        }
    }

    /* renamed from: q52.h$b */
    public static final class C89469b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C89468h f257527d;

        /* renamed from: e */
        public final /* synthetic */ String f257528e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89469b(C89468h hVar, String str) {
            super(0);
            this.f257527d = hVar;
            this.f257528e = str;
        }

        public Object invoke() {
            C89468h hVar = this.f257527d;
            if (!hVar.f257525k || !hVar.f257524j) {
                hVar.f257522h.add(this.f257528e);
            } else {
                C89468h.m111855f(hVar, this.f257528e);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: q52.h$c */
    public static final class C89470c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C89468h f257529d;

        /* renamed from: e */
        public final /* synthetic */ boolean f257530e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89470c(C89468h hVar, boolean z) {
            super(0);
            this.f257529d = hVar;
            this.f257530e = z;
        }

        public Object invoke() {
            C89468h hVar = this.f257529d;
            boolean z = this.f257530e;
            hVar.f257523i = z;
            if (z) {
                FrameLayout frameLayout = hVar.f257519e;
                if (frameLayout != null) {
                    hVar.mo123775g(frameLayout);
                }
            } else {
                hVar.mo87640d();
            }
            return C13598b0.f38549a;
        }
    }

    public C89468h(Context context) {
        C87412m.m108594g(context, "context");
        this.f257515a = context;
    }

    /* renamed from: f */
    public static final void m111855f(C89468h hVar, String str) {
        WebView webView = hVar.f257520f;
        if (webView != null) {
            webView.evaluateJavascript("console._log('" + C84751i1.m104412a(str) + "')", (ValueCallback) null);
        }
    }

    /* renamed from: a */
    public void mo120597a(String str) {
        C87412m.m108594g(str, "str");
        Log.m105926v("MBInspectorImpl", "onJsLog: " + str);
        C23564m.m28136f(new C89469b(this, str));
    }

    /* renamed from: b */
    public void mo120598b(boolean z) {
        Log.m105924i("MBInspectorImpl", "onSwitch: " + z);
        C23564m.m28136f(new C89470c(this, z));
    }

    /* renamed from: c */
    public void mo87639c(FrameLayout frameLayout) {
        C87412m.m108594g(frameLayout, "container");
        this.f257519e = frameLayout;
        if (this.f257523i) {
            mo123775g(frameLayout);
        }
    }

    /* renamed from: d */
    public void mo87640d() {
        FrameLayout frameLayout;
        WebView webView = this.f257520f;
        if (webView != null) {
            FrameLayout frameLayout2 = this.f257519e;
            if (frameLayout2 != null) {
                frameLayout2.removeView(webView);
            }
            webView.destroy();
        }
        C77304c cVar = this.f257521g;
        if (!(cVar == null || (frameLayout = this.f257519e) == null)) {
            frameLayout.removeView(cVar);
        }
        this.f257520f = null;
        this.f257521g = null;
        this.f257522h.clear();
        this.f257524j = false;
        this.f257525k = false;
        this.f257526l = false;
    }

    /* renamed from: e */
    public void mo87641e(FrameLayout frameLayout) {
        C87412m.m108594g(frameLayout, "container");
        this.f257519e = null;
        WebView webView = this.f257520f;
        if (webView != null) {
            frameLayout.removeView(webView);
        }
        C77304c cVar = this.f257521g;
        if (cVar != null) {
            frameLayout.removeView(cVar);
        }
    }

    /* renamed from: g */
    public final void mo123775g(FrameLayout frameLayout) {
        frameLayout.setClipChildren(false);
        if (this.f257520f == null) {
            WebView webView = new WebView(this.f257515a);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setTranslationY(100000.0f);
            webView.setVisibility(8);
            webView.setWebViewClient(new C89475m(this));
            webView.loadUrl(this.f257517c);
            this.f257520f = webView;
            C77304c cVar = new C77304c(this.f257515a);
            cVar.setOnClickListener(new C89474l(this));
            this.f257521g = cVar;
        }
        float f = MMApplicationContext.getResources().getDisplayMetrics().density;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        WebView webView2 = this.f257520f;
        ViewParent viewParent = null;
        if ((webView2 != null ? webView2.getParent() : null) != null) {
            WebView webView3 = this.f257520f;
            ViewGroup viewGroup = (ViewGroup) (webView3 != null ? webView3.getParent() : null);
            if (viewGroup != null) {
                viewGroup.removeView(this.f257520f);
            }
        }
        frameLayout.addView(this.f257520f, layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388693;
        layoutParams2.bottomMargin = (int) (((float) 55) * f);
        layoutParams2.rightMargin = (int) (((float) 15) * f);
        C77304c cVar2 = this.f257521g;
        if ((cVar2 != null ? cVar2.getParent() : null) != null) {
            C77304c cVar3 = this.f257521g;
            if (cVar3 != null) {
                viewParent = cVar3.getParent();
            }
            ViewGroup viewGroup2 = (ViewGroup) viewParent;
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.f257521g);
            }
        }
        frameLayout.addView(this.f257521g, layoutParams2);
    }

    /* renamed from: h */
    public final float mo123776h() {
        return ((Number) ((C36570n) this.f257518d).getValue()).floatValue();
    }
}
