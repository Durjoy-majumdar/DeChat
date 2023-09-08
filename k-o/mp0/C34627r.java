package mp0;

import android.content.Context;
import android.webkit.ValueCallback;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: mp0.r */
public class C34627r implements ValueCallback<String> {

    /* renamed from: a */
    public final /* synthetic */ Context f93130a;

    /* renamed from: b */
    public final /* synthetic */ String f93131b;

    public C34627r(C88808s sVar, Context context, String str) {
        this.f93130a = context;
        this.f93131b = str;
    }

    public void onReceiveValue(Object obj) {
        String str = (String) obj;
        MMHandlerThread.postToMainThread(new C34626q(this));
    }
}
