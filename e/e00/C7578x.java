package e00;

import android.content.Context;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44361u;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C6606x;
import di3.C7335d;
import gy3.C8480h;

/* renamed from: e00.x */
public interface C7578x extends C7335d {

    /* renamed from: e00.x$a */
    public static final class C7579a {
        /* renamed from: a */
        public static /* synthetic */ C6606x m7714a(C7578x xVar, Context context, String str, MMWebView mMWebView, C44361u uVar, int i, Object obj) {
            String str2;
            Context context2;
            C7578x xVar2;
            C44361u uVar2;
            if (obj == null) {
                MMWebView mMWebView2 = (i & 4) != 0 ? null : mMWebView;
                if ((i & 8) != 0) {
                    uVar2 = new C44361u(0.0f, (String) null, false, false, 0, false, 0, false, false, 0, false, false, false, (String) null, false, 32767, (C8480h) null);
                    xVar2 = xVar;
                    context2 = context;
                    str2 = str;
                } else {
                    xVar2 = xVar;
                    context2 = context;
                    str2 = str;
                    uVar2 = uVar;
                }
                return xVar2.mo8699Ws(context2, str2, mMWebView2, uVar2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createHalfScreenWebView");
        }
    }

    /* renamed from: Ws */
    C6606x mo8699Ws(Context context, String str, MMWebView mMWebView, C44361u uVar);
}
