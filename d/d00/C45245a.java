package d00;

import android.app.Activity;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44247d0;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44305j;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44341n0;
import di3.C86301e;
import e00.C45528u;
import ei3.C86522b;
import gy3.C87412m;

@C86522b
/* renamed from: d00.a */
public final class C45245a extends C86301e implements C45528u {
    /* renamed from: qI */
    public C44247d0 mo70751qI(Activity activity, String str, MMWebView mMWebView, C44305j jVar) {
        C87412m.m108594g(activity, "activityContext");
        C87412m.m108594g(str, "url");
        C87412m.m108594g(jVar, "option");
        return new C44341n0(activity, str, mMWebView, jVar);
    }
}
