package k93;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebStorage;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.p014mm.p136ui.base.MMFalseProgressBar;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.webview.core.C43503a;
import com.tencent.p014mm.plugin.webview.core.C43522y;
import com.tencent.p014mm.plugin.webview.core.C43558z;
import com.tencent.p014mm.plugin.webview.model.C85523o0;
import com.tencent.p014mm.plugin.webview.modeltools.C43749d;
import com.tencent.p014mm.plugin.webview.modeltools.C43757o;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.WebViewCallbackClient;
import com.tencent.xweb.XWebSdk;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o40.C61926c;

/* renamed from: k93.f */
public final class C46661f {

    /* renamed from: a */
    public boolean f125614a;

    /* renamed from: b */
    public ViewGroup f125615b;

    /* renamed from: c */
    public View f125616c;

    /* renamed from: d */
    public FrameLayout f125617d;

    /* renamed from: e */
    public ScrollView f125618e;

    /* renamed from: f */
    public MMWebView f125619f;

    /* renamed from: g */
    public View f125620g;

    /* renamed from: h */
    public View f125621h;

    /* renamed from: i */
    public TextView f125622i;

    /* renamed from: j */
    public View f125623j;

    /* renamed from: k */
    public C43522y f125624k;

    /* renamed from: l */
    public WeakReference<WebViewUI> f125625l;

    /* renamed from: m */
    public boolean f125626m;

    /* renamed from: n */
    public C46662a f125627n = new C46662a(this);

    /* renamed from: o */
    public long f125628o;

    /* renamed from: p */
    public WebViewCallbackClient f125629p = new C46663b(this);

    /* renamed from: k93.f$a */
    public static final class C46662a extends C43558z {

        /* renamed from: b */
        public boolean f125630b = true;

        /* renamed from: c */
        public final /* synthetic */ C46661f f125631c;

        public C46662a(C46661f fVar) {
            this.f125631c = fVar;
        }

        /* renamed from: e */
        public void mo64862e() {
        }

        /* renamed from: m */
        public void mo67857m() {
            C43522y yVar;
            C85523o0.C85537c cVar;
            MMFalseProgressBar mMFalseProgressBar;
            WebViewUI a = this.f125631c.mo71919a();
            if (!(a == null || (mMFalseProgressBar = a.f118535j) == null)) {
                mMFalseProgressBar.mo25981a();
            }
            WebViewUI a2 = this.f125631c.mo71919a();
            if (!(a2 == null || (yVar = a2.f118513b1) == null || (cVar = yVar.f117696j1) == null)) {
                ((C43522y.C43550s) cVar).mo67838a();
            }
            this.f125630b = true;
        }

        /* renamed from: n */
        public void mo67858n() {
            WebViewUI a;
            MMFalseProgressBar mMFalseProgressBar;
            C46661f fVar = this.f125631c;
            if (!(fVar.f125626m || (a = fVar.mo71919a()) == null || (mMFalseProgressBar = a.f118535j) == null)) {
                mMFalseProgressBar.mo25983c();
            }
            this.f125630b = false;
        }
    }

    /* renamed from: k93.f$b */
    public static final class C46663b implements WebViewCallbackClient {

        /* renamed from: a */
        public final /* synthetic */ C46661f f125632a;

        public C46663b(C46661f fVar) {
            this.f125632a = fVar;
        }

        public void onContentHeightChanged(int i) {
            C46661f fVar = this.f125632a;
            MMWebView mMWebView = fVar.f125619f;
            if (mMWebView != null) {
                float scale = mMWebView.getScale();
                int i2 = (int) (((float) i) * scale);
                FrameLayout frameLayout = fVar.f125617d;
                int measuredHeight = frameLayout != null ? frameLayout.getMeasuredHeight() : 0;
                if (i2 < measuredHeight) {
                    i2 = measuredHeight;
                }
                Log.m105918d("MicroMsg.WebViewSnapshotHelper", "SnapShotMode, webViewHeight:" + i + ", contentHeight:" + i2 + ", density=" + scale);
                View view = fVar.f125620g;
                ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
                if (layoutParams != null) {
                    layoutParams.height = i2 + 2;
                    View view2 = fVar.f125620g;
                    if (view2 != null) {
                        view2.setLayoutParams(layoutParams);
                    }
                }
            }
        }

        public void onOverScrolled(int i, int i2, boolean z, boolean z2, View view) {
            C87412m.m108594g(view, "view");
        }

        public void onScrollChanged(int i, int i2, int i3, int i4, View view) {
            C87412m.m108594g(view, "view");
        }

        public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, View view) {
            C87412m.m108594g(view, "view");
            return true;
        }
    }

    /* renamed from: a */
    public final WebViewUI mo71919a() {
        WeakReference<WebViewUI> weakReference = this.f125625l;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: b */
    public final void mo71920b() {
        C43522y yVar = this.f125624k;
        if (yVar != null) {
            yVar.mo67756y(this.f125627n);
            C43522y yVar2 = this.f125624k;
            C87412m.m108591d(yVar2);
            C61926c.m72668M(new C43503a(yVar2));
        }
        if (this.f125619f != null) {
            try {
                Object[] objArr = new Object[1];
                ArrayList<String> arrayList = C43757o.f118236a;
                objArr[0] = Integer.valueOf(arrayList != null ? arrayList.size() : 0);
                Log.m105925i("MicroMsg.WebView.SysWebViewDataCleanHelper", "clearWebViewData url list size %d", objArr);
                if (!XWebSdk.isSysWebView()) {
                    Log.m105924i("MicroMsg.WebView.SysWebViewDataCleanHelper", "not system WebView, clear all data.");
                    WebStorage.getInstance().deleteAllData();
                } else if (!Util.isNullOrNil((List) C43757o.f118236a)) {
                    Iterator<String> it = C43757o.f118236a.iterator();
                    while (it.hasNext()) {
                        WebStorage.getInstance().deleteOrigin(C43749d.m47592a(it.next()));
                    }
                    if (!Util.isNullOrNil((List) C43757o.f118236a)) {
                        try {
                            C43757o.m47604a(C43757o.f118236a);
                        } catch (Exception e) {
                            Log.m105921e("MicroMsg.WebView.SysWebViewDataCleanHelper", "clearHostCookies ex %s", e.getMessage());
                        }
                        Log.m105924i("MicroMsg.WebView.SysWebViewDataCleanHelper", "clearHostCookies end");
                    }
                    C43757o.f118236a.clear();
                }
            } catch (Exception e2) {
                Log.m105929w("MicroMsg.WebView.SysWebViewDataCleanHelper", "clearWebViewData ex %s", e2.getMessage());
            }
            MMWebView mMWebView = this.f125619f;
            if (mMWebView != null) {
                mMWebView.setWebViewCallbackClient((WebViewCallbackClient) null);
            }
            MMWebView mMWebView2 = this.f125619f;
            C87412m.m108591d(mMWebView2);
            mMWebView2.destroy();
            this.f125619f = null;
        }
    }
}
