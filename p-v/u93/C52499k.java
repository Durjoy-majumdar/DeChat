package u93;

import android.webkit.ValueCallback;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;

/* renamed from: u93.k */
public final class C52499k<T> implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ C52497i f146656a;

    public C52499k(C52497i iVar) {
        this.f146656a = iVar;
    }

    public void onReceiveValue(Object obj) {
        String str = (String) obj;
        Log.m105924i("MicroMsg.WebSearch.WebSearchPreloadLogic", "sys:init cost:" + (C31543z5.m39453c() - this.f146656a.f146654b));
    }
}
