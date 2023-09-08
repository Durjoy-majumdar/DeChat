package d00;

import android.content.Context;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44361u;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C6606x;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.HalfScreenWebView;
import di3.C86301e;
import e00.C7578x;
import ei3.C86522b;
import gy3.C87412m;

@C86522b
/* renamed from: d00.y */
public final class C31032y extends C86301e implements C7578x {
    /* renamed from: Ws */
    public C6606x mo8699Ws(Context context, String str, MMWebView mMWebView, C44361u uVar) {
        C87412m.m108594g(context, "activityContext");
        C87412m.m108594g(str, "url");
        C87412m.m108594g(uVar, "option");
        return new HalfScreenWebView(context, str, mMWebView, uVar);
    }
}
