package kr0;

import android.webkit.ValueCallback;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40480g;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.stubs.logger.Log;
import gy3.C87412m;

/* renamed from: kr0.i1 */
public final class C46735i1<T> implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ C88267e f125813a;

    /* renamed from: b */
    public final /* synthetic */ C40480g f125814b;

    /* renamed from: c */
    public final /* synthetic */ long f125815c;

    public C46735i1(C88267e eVar, C40480g gVar, long j) {
        this.f125813a = eVar;
        this.f125814b = gVar;
        this.f125815c = j;
    }

    public void onReceiveValue(Object obj) {
        String str = (String) obj;
        int i = C87412m.m108589b("ok", str) ? 4 : 6;
        Log.println(i, "MicroMsg.AppBrand.WXNativeInjector", "evaluate wxNative.js end. appId:" + this.f125813a.getAppId() + ", contextId:" + this.f125814b.getContextId() + ", result:'" + str + "', cost:" + (Util.currentTicks() - this.f125815c) + LocaleUtil.MALAY);
    }
}
