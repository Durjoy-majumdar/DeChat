package u93;

import android.webkit.ValueCallback;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;

/* renamed from: u93.l */
public final class C52500l<T> implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ C52497i f146657a;

    public C52500l(C52497i iVar) {
        this.f146657a = iVar;
    }

    public void onReceiveValue(Object obj) {
        String str = (String) obj;
        Log.m105924i("MicroMsg.WebSearch.WebSearchPreloadLogic", "sys:init bridged:" + (C31543z5.m39453c() - this.f146657a.f146654b));
    }
}
