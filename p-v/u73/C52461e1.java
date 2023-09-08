package u73;

import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;

/* renamed from: u73.e1 */
public class C52461e1 implements ValueCallback<String> {

    /* renamed from: a */
    public final /* synthetic */ MMWebView f146586a;

    /* renamed from: b */
    public final /* synthetic */ C52462f1 f146587b;

    /* renamed from: c */
    public final /* synthetic */ C52473z0 f146588c;

    public C52461e1(C52473z0 z0Var, MMWebView mMWebView, C52462f1 f1Var) {
        this.f146588c = z0Var;
        this.f146586a = mMWebView;
        this.f146587b = f1Var;
    }

    public void onReceiveValue(Object obj) {
        Log.m105925i(this.f146588c.f146616a, "loadJS, sys:attach_runOn3rd_apis callback %s,view %s preloadBiz:%d", (String) obj, this.f146586a.toString(), Integer.valueOf(this.f146588c.f146617b));
        long currentTimeMillis = System.currentTimeMillis();
        C52473z0 z0Var = this.f146588c;
        long j = currentTimeMillis - z0Var.f146620e;
        C115669n.INSTANCE.mo160131h(15005, Integer.valueOf(z0Var.f146617b), 2, Long.valueOf(j), 2);
        ((LinkedList) this.f146588c.f146619d).add(this.f146587b);
        this.f146588c.f146618c.set(false);
        Log.m105925i(this.f146588c.f146616a, "preload webview done, cost: %s scene:%s coreType:%s", Long.valueOf(j), Integer.valueOf(this.f146587b.f146589a), this.f146587b.f146590b.getCurrentInstanceWebCoreType());
    }
}
