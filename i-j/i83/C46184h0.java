package i83;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.webview.WebViewTransHelper;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUIStyleHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: i83.h0 */
public final class C46184h0<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ WebViewTransHelper f124486d;

    public C46184h0(WebViewTransHelper webViewTransHelper) {
        this.f124486d = webViewTransHelper;
    }

    public void onChanged(Object obj) {
        C46177b0 b0Var = (C46177b0) obj;
        WebViewTransHelper webViewTransHelper = this.f124486d;
        WebViewUIStyleHelper webViewUIStyleHelper = webViewTransHelper.f117504d;
        String str = webViewTransHelper.mo67655b().f124526f;
        if (webViewUIStyleHelper.f118667d != null) {
            Log.m105925i("MicroMsg.WebViewUIStyleHelper", "trans tips status is %s", b0Var.name());
            View findViewById = webViewUIStyleHelper.f118667d.findViewById(C0966R.C0970id.ktk);
            if (webViewUIStyleHelper.f118669f.f117506f) {
                Log.m105928w("MicroMsg.WebViewUIStyleHelper", "setTransTipsBarText not show transView and ignore");
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "setTransTipsBarText", "(Lcom/tencent/mm/plugin/webview/WebTransTipsStatus;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "setTransTipsBarText", "(Lcom/tencent/mm/plugin/webview/WebTransTipsStatus;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            findViewById.setBackgroundColor(webViewUIStyleHelper.mo68371c());
            TextView textView = (TextView) findViewById.findViewById(C0966R.C0970id.ktm);
            ProgressBar progressBar = (ProgressBar) findViewById.findViewById(C0966R.C0970id.ktl);
            int ordinal = b0Var.ordinal();
            if (ordinal == 0) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view2 = findViewById;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "setTransTipsBarText", "(Lcom/tencent/mm/plugin/webview/WebTransTipsStatus;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "setTransTipsBarText", "(Lcom/tencent/mm/plugin/webview/WebTransTipsStatus;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (ordinal == 1) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(0);
                View view3 = findViewById;
                C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "setTransTipsBarText", "(Lcom/tencent/mm/plugin/webview/WebTransTipsStatus;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "setTransTipsBarText", "(Lcom/tencent/mm/plugin/webview/WebTransTipsStatus;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView.setText(C0966R.string.lgt);
                progressBar.setVisibility(0);
            } else if (ordinal == 2) {
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar4.mo10233c(0);
                View view4 = findViewById;
                C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "setTransTipsBarText", "(Lcom/tencent/mm/plugin/webview/WebTransTipsStatus;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "setTransTipsBarText", "(Lcom/tencent/mm/plugin/webview/WebTransTipsStatus;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (Util.isNullOrNil(str)) {
                    str = webViewUIStyleHelper.f118667d.getResources().getString(C0966R.string.lgr);
                }
                textView.setText(str + webViewUIStyleHelper.f118667d.getResources().getString(C0966R.string.lgq));
                progressBar.setVisibility(4);
            } else if (ordinal == 3) {
                C9556a aVar5 = new C9556a();
                ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                aVar5.mo10233c(0);
                View view5 = findViewById;
                C117292a.m165358d(view5, aVar5.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "setTransTipsBarText", "(Lcom/tencent/mm/plugin/webview/WebTransTipsStatus;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "setTransTipsBarText", "(Lcom/tencent/mm/plugin/webview/WebTransTipsStatus;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView.setText(webViewUIStyleHelper.f118667d.getResources().getString(C0966R.string.lgs));
                progressBar.setVisibility(4);
            }
        }
    }
}
