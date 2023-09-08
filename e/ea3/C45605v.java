package ea3;

import com.tencent.p014mm.pluginsdk.model.C44594n1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.XWebSdk;

/* renamed from: ea3.v */
public final class C45605v {

    /* renamed from: a */
    public long f123358a;

    /* renamed from: b */
    public final int f123359b;

    /* renamed from: c */
    public final int f123360c;

    /* renamed from: d */
    public long f123361d;

    /* renamed from: e */
    public boolean f123362e;

    /* renamed from: f */
    public long f123363f;

    /* renamed from: g */
    public long f123364g;

    /* renamed from: h */
    public long f123365h;

    /* renamed from: i */
    public long f123366i;

    /* renamed from: j */
    public boolean f123367j;

    /* renamed from: k */
    public boolean f123368k;

    /* renamed from: l */
    public long f123369l;

    /* renamed from: m */
    public boolean f123370m;

    /* renamed from: n */
    public boolean f123371n;

    /* renamed from: o */
    public boolean f123372o;

    public C45605v() {
        int i;
        if (C44594n1.f120907b >= 0) {
            Log.m105924i("XWeb.MM.WebViewKernelTestSwitcher", "webViewKernelMode, value:" + C44594n1.f120907b + " (0-render&gpu/1-origin/2-render)");
            i = C44594n1.f120907b;
        } else {
            XWebSdk.WebViewModeForMM webViewModeCommandForMM = XWebSdk.getWebViewModeCommandForMM();
            Log.m105924i("XWeb.MM.WebViewKernelTestSwitcher", "webViewKernelMode, webviewMode:" + webViewModeCommandForMM);
            if (webViewModeCommandForMM == XWebSdk.WebViewModeForMM.RENDER_SANDBOX || webViewModeCommandForMM == XWebSdk.WebViewModeForMM.RENDER_UNSANDBOX) {
                i = 2;
                C44594n1.f120907b = 2;
            } else if (webViewModeCommandForMM == XWebSdk.WebViewModeForMM.GPU_RENDER_SANDBOX || webViewModeCommandForMM == XWebSdk.WebViewModeForMM.GPU_RENDER_UNSANDBOX) {
                i = 0;
                C44594n1.f120907b = 0;
            } else {
                i = 1;
                C44594n1.f120907b = 1;
            }
        }
        this.f123359b = i;
        this.f123360c = C44594n1.m49047c();
    }
}
