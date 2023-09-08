package mp0;

import android.content.Context;
import android.webkit.ValueCallback;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: mp0.w */
public class C88812w implements ValueCallback<String> {

    /* renamed from: a */
    public final /* synthetic */ Context f256214a;

    public C88812w(C88815z zVar, Context context) {
        this.f256214a = context;
    }

    public void onReceiveValue(Object obj) {
        String str = (String) obj;
        MMHandlerThread.postToMainThread(new C88811v(this));
    }
}
