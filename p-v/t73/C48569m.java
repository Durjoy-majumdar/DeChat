package t73;

import android.webkit.ValueCallback;
import com.tencent.mapsdk.rastercore.tools.C40004IO;
import com.tencent.p014mm.plugin.appbrand.appcache.C40427l0;
import com.tencent.p014mm.plugin.webview.webcompt.C44404a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMKVSlotManager;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import gy3.C87412m;
import java.io.Closeable;
import r73.C47940m;
import t73.C48558d;
import t83.C13848e;
import t83.C13851h1;
import t83.C48586h;

/* renamed from: t73.m */
public final class C48569m implements C47940m {

    /* renamed from: d */
    public final /* synthetic */ C48558d f129941d;

    /* renamed from: e */
    public final /* synthetic */ String f129942e;

    /* renamed from: t73.m$a */
    public static final class C48570a implements C48586h {
        /* renamed from: h */
        public void mo63613h(C13851h1 h1Var, C13848e eVar) {
        }
    }

    public C48569m(C48558d dVar, String str) {
        this.f129941d = dVar;
        this.f129942e = str;
    }

    /* renamed from: B0 */
    public C48586h mo63606B0() {
        return new C48570a();
    }

    /* renamed from: I0 */
    public void mo60865I0(String str, String str2, ValueCallback<String> valueCallback) {
        C87412m.m108594g(str, "eventType");
        C87412m.m108594g(str2, "event");
        this.f129941d.mo60865I0(str, str2, valueCallback);
    }

    /* renamed from: d0 */
    public boolean mo63607d0(int i, String str) {
        C87412m.m108594g(str, "cgiUrl");
        return false;
    }

    public String getLocalData(String str) {
        C87412m.m108594g(str, "key");
        try {
            C48558d.C48560b bVar = C48558d.f129896H;
            MMKVSlotManager mMKVSlotManager = C48558d.f129898J;
            String decodeString = mMKVSlotManager.decodeString(this.f129942e + '-' + str, "");
            String str2 = this.f129941d.f129908B;
            Log.m105918d(str2, "getLocalData:" + str + ", " + decodeString);
            return decodeString;
        } catch (Exception e) {
            String str3 = this.f129941d.f129908B;
            Log.printErrStackTrace(str3, e, "getLocalData:" + str, new Object[0]);
            return null;
        }
    }

    /* renamed from: i0 */
    public int mo63609i0() {
        return C44404a.m48766c(this.f129941d.mo72996G1());
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
            C48558d.C48560b bVar = C48558d.f129896H;
            ((MultiProcessMMKV) C48558d.f129898J.getSlotForWrite()).encode(this.f129942e + '-' + str, str2);
            String str3 = this.f129941d.f129908B;
            Log.m105918d(str3, "setLocalData:" + str + ", " + str2);
        } catch (Exception e) {
            String str4 = this.f129941d.f129908B;
            Log.printErrStackTrace(str4, e, "setLocalData:" + str + ", " + str2, new Object[0]);
        }
    }

    /* renamed from: u0 */
    public int mo63612u0() {
        C40427l0 O1 = this.f129941d.mo73175O1(this.f129942e, false);
        int c = C44404a.m48766c(O1);
        C40004IO.safeClose((Closeable) O1);
        return c;
    }
}
