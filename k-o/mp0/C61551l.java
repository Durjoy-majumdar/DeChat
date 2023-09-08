package mp0;

import android.content.Context;
import android.webkit.ValueCallback;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: mp0.l */
public class C61551l implements ValueCallback<String> {

    /* renamed from: a */
    public final /* synthetic */ Context f174950a;

    /* renamed from: b */
    public final /* synthetic */ C88804j f174951b;

    public C61551l(C88804j jVar, Context context) {
        this.f174951b = jVar;
        this.f174950a = context;
    }

    public void onReceiveValue(Object obj) {
        String str = (String) obj;
        MMHandlerThread.postToMainThread(new C61550k(this));
        this.f174951b.f256209a = true;
    }
}
