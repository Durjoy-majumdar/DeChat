package mp0;

import android.content.Context;
import android.webkit.ValueCallback;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: mp0.y */
public class C88814y implements ValueCallback<String> {

    /* renamed from: a */
    public final /* synthetic */ Context f256217a;

    public C88814y(C88815z zVar, Context context) {
        this.f256217a = context;
    }

    public void onReceiveValue(Object obj) {
        MMHandlerThread.postToMainThread(new C88813x(this, (String) obj));
    }
}
