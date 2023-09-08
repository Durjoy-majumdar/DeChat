package u93;

import android.webkit.ValueCallback;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: u93.m */
public final class C52501m<T> implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ C52497i f146658a;

    public C52501m(C52497i iVar) {
        this.f146658a = iVar;
    }

    public void onReceiveValue(Object obj) {
        AtomicBoolean atomicBoolean;
        String str = (String) obj;
        long c = C31543z5.m39453c() - this.f146658a.f146654b;
        C52496h hVar = C52495g.f146647a;
        if (!(hVar == null || (atomicBoolean = hVar.f146652e) == null)) {
            atomicBoolean.set(true);
        }
        Log.m105924i("MicroMsg.WebSearch.WebSearchPreloadLogic", "preload completed cost:" + c);
    }
}
