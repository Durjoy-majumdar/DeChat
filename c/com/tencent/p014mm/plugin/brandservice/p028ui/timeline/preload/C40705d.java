package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload;

import android.webkit.ValueCallback;
import com.tencent.mapsdk.rastercore.tools.C40004IO;
import com.tencent.p014mm.plugin.appbrand.appcache.C40427l0;
import com.tencent.p014mm.plugin.webview.webcompt.C44404a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import gy3.C87412m;
import java.io.Closeable;
import r73.C47940m;
import rx3.C13601g;
import rx3.C36570n;
import t83.C13848e;
import t83.C13851h1;
import t83.C48586h;
import z04.C112550d0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.d */
public final class C40705d implements C47940m {

    /* renamed from: d */
    public final /* synthetic */ C40698a f109353d;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.d$a */
    public static final class C40706a implements C48586h {
        /* renamed from: h */
        public void mo63613h(C13851h1 h1Var, C13848e eVar) {
        }
    }

    public C40705d(C40698a aVar) {
        this.f109353d = aVar;
    }

    /* renamed from: B0 */
    public C48586h mo63606B0() {
        return new C40706a();
    }

    /* renamed from: I0 */
    public void mo60865I0(String str, String str2, ValueCallback<String> valueCallback) {
        C87412m.m108594g(str, "eventType");
        C87412m.m108594g(str2, "event");
        this.f109353d.mo73188e().mo60865I0(str, str2, valueCallback);
    }

    /* renamed from: d0 */
    public boolean mo63607d0(int i, String str) {
        C87412m.m108594g(str, "cgiUrl");
        C13601g<String> gVar = C40698a.f109337e;
        if (C112550d0.m153803w((String) ((C36570n) C40698a.f109337e).getValue(), str, false, 2, (Object) null)) {
            return true;
        }
        Log.m105924i("MicroMsg.AdWebPrefetcherJsEngineInterceptor", "do cgi cmdId=" + i + ", cgiUrl=" + str + " not allowed!!");
        return false;
    }

    public String getLocalData(String str) {
        C87412m.m108594g(str, "key");
        try {
            String decodeString = this.f109353d.f109339d.decodeString(str, "");
            Log.m105918d("MicroMsg.AdWebPrefetcherJsEngineInterceptor", "getLocalData:" + str + ", " + decodeString);
            return decodeString;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AdWebPrefetcherJsEngineInterceptor", e, "getLocalData:" + str, new Object[0]);
            return null;
        }
    }

    /* renamed from: i0 */
    public int mo63609i0() {
        return C44404a.m48766c(this.f109353d.mo73188e().mo72996G1());
    }

    /* renamed from: p0 */
    public void mo63610p0(String str, String str2) {
        C87412m.m108594g(str, "func");
        C87412m.m108594g(str2, StateEvent.Name.MESSAGE);
    }

    public void setLocalData(String str, String str2) {
        C87412m.m108594g(str, "key");
        C87412m.m108594g(str2, "data");
        try {
            ((MultiProcessMMKV) this.f109353d.f109339d.getSlotForWrite()).encode(str, str2);
            Log.m105918d("MicroMsg.AdWebPrefetcherJsEngineInterceptor", "setLocalData:" + str + ", " + str2);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AdWebPrefetcherJsEngineInterceptor", e, "setLocalData:" + str + ", " + str2, new Object[0]);
        }
    }

    /* renamed from: u0 */
    public int mo63612u0() {
        C40427l0 g = this.f109353d.mo63602g();
        int c = C44404a.m48766c(g);
        C40004IO.safeClose((Closeable) g);
        return c;
    }
}
