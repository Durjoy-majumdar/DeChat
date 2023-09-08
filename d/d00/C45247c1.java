package d00;

import android.content.Context;
import com.tencent.p014mm.plugin.webview.model.C6048m1;
import com.tencent.p014mm.plugin.webview.model.C6052p;
import com.tencent.p014mm.plugin.webview.modeltools.C43754j;
import com.tencent.p014mm.plugin.webview.modeltools.C43758q;
import com.tencent.p014mm.plugin.webview.p128ui.tools.C43856f;
import com.tencent.p014mm.plugin.webview.p128ui.tools.C43976g;
import com.tencent.p014mm.plugin.webview.p128ui.tools.C44395x0;
import com.tencent.p014mm.plugin.webview.p128ui.tools.floatball.C43861d;
import com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C44040v3;
import com.tencent.p014mm.plugin.webview.p128ui.tools.video.samelayer.finder.C44209a;
import com.tencent.p014mm.plugin.webview.stub.C6107m;
import com.tencent.xweb.WebView;
import di3.C86301e;
import e00.C45511f0;
import e00.C45514j0;
import e00.C45515k0;
import e00.C45517q0;
import e00.C45518r0;
import e00.C45529v;
import ei3.C86522b;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import t83.C13846d;
import t93.C48618a;

@C86522b
/* renamed from: d00.c1 */
public class C45247c1 extends C86301e implements C45518r0 {
    public void L80(int i, Context context, C6107m mVar, C6107m mVar2) {
        C44040v3.m48330a(i).mo7177S6(context, mVar, mVar2);
    }

    /* renamed from: Mi */
    public C45529v mo70753Mi() {
        return new C43754j();
    }

    /* renamed from: Pl */
    public C45511f0 mo70754Pl() {
        return C48618a.f130143a;
    }

    /* renamed from: Z7 */
    public void mo70755Z7() {
        C13846d.f38986a.mo13176a();
    }

    public void bk0(String str, Runnable runnable) {
        synchronized (C44395x0.f120338a) {
            C87412m.m108594g(str, "rawUrl");
            C87412m.m108594g(runnable, "callback");
            ConcurrentHashMap<String, ArrayList<Runnable>> concurrentHashMap = C44395x0.f120340c;
            ArrayList arrayList = concurrentHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                concurrentHashMap.put(str, arrayList);
            }
            if (!arrayList.contains(runnable)) {
                arrayList.add(runnable);
            }
        }
    }

    /* renamed from: gO */
    public C43856f mo70757gO(Context context, WebView webView) {
        return new C43976g(context, webView);
    }

    public C45514j0 gi0() {
        return C44209a.f119774a;
    }

    /* renamed from: jq */
    public C6052p mo70759jq() {
        return C6048m1.f22342b;
    }

    public void l80() {
    }

    /* renamed from: lQ */
    public C45515k0 mo70761lQ() {
        return C43861d.f118783a;
    }

    /* renamed from: t3 */
    public C45517q0 mo70762t3() {
        return new C43758q();
    }
}
