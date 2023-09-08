package u93;

import android.webkit.ValueCallback;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;

/* renamed from: u93.j */
public final class C52498j<T> implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ C52497i f146655a;

    public C52498j(C52497i iVar) {
        this.f146655a = iVar;
    }

    public void onReceiveValue(Object obj) {
        String str = (String) obj;
        Log.m105924i("MicroMsg.WebSearch.WebSearchPreloadLogic", "load wxjs cost:" + (C31543z5.m39453c() - this.f146655a.f146654b));
    }
}
