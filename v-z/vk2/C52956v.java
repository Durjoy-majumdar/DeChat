package vk2;

import com.tencent.p014mm.plugin.webview.core.C43519u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.WebView;

/* renamed from: vk2.v */
public final class C52956v extends C43519u {

    /* renamed from: a */
    public final /* synthetic */ C52958x f147799a;

    public C52956v(C52958x xVar) {
        this.f147799a = xVar;
    }

    /* renamed from: b */
    public void mo64752b(WebView webView, String str) {
        mo73696i();
    }

    /* renamed from: d */
    public void mo62156d(WebView webView, String str) {
        mo73696i();
    }

    /* renamed from: i */
    public final void mo73696i() {
        C52958x xVar = this.f147799a;
        if (!xVar.f147805E) {
            xVar.f147805E = true;
            Log.m105925i("MicroMsg.ScanBoxDialog", "alvinluo webViewReady showAfterWebViewReady: %b, pendingShow: %b", Boolean.valueOf(xVar.f147804D), Boolean.valueOf(this.f147799a.f147806F));
            C52958x xVar2 = this.f147799a;
            if (xVar2.f147804D && xVar2.f147806F) {
                xVar2.f147806F = false;
                xVar2.show();
            }
        }
    }
}
