package e93;

import android.webkit.JavascriptInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMKVSlotManager;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import gy3.C87412m;
import t73.C48558d;
import z04.C112551y;

/* renamed from: e93.b */
public final class C45568b {

    /* renamed from: a */
    public final /* synthetic */ String f123265a;

    /* renamed from: b */
    public final /* synthetic */ C45562a f123266b;

    public C45568b(String str, C45562a aVar) {
        this.f123265a = str;
        this.f123266b = aVar;
    }

    @JavascriptInterface
    public final void forceH5(String str) {
        this.f123266b.mo71086z();
        boolean z = true;
        this.f123266b.mo67777c().f117549W = true;
        this.f123266b.mo67777c().mo67692R();
        if (str != null && !C112551y.m153811k(str)) {
            z = false;
        }
        if (z) {
            this.f123266b.mo67777c().reload();
        } else {
            this.f123266b.mo67777c().mo67691Q0(str);
        }
    }

    @JavascriptInterface
    public final String getLocalData(String str) {
        C87412m.m108594g(str, "key");
        try {
            C48558d.C48560b bVar = C48558d.f129896H;
            MMKVSlotManager mMKVSlotManager = C48558d.f129898J;
            String decodeString = mMKVSlotManager.decodeString(this.f123265a + '-' + str, "");
            Log.m105918d("MicroMsg.WebPrefetcherInterceptor", "getLocalData:" + str + ", " + decodeString);
            return decodeString;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WebPrefetcherInterceptor", e, "getLocalData:" + str, new Object[0]);
            return null;
        }
    }

    @JavascriptInterface
    public final void setLocalData(String str, String str2) {
        C87412m.m108594g(str, "key");
        C87412m.m108594g(str2, "data");
        try {
            C48558d.C48560b bVar = C48558d.f129896H;
            ((MultiProcessMMKV) C48558d.f129898J.getSlotForWrite()).encode(this.f123265a + '-' + str, str2);
            Log.m105918d("MicroMsg.WebPrefetcherInterceptor", "setLocalData:" + str + ", " + str2);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WebPrefetcherInterceptor", e, "setLocalData:" + str + ", " + str2, new Object[0]);
        }
    }
}
