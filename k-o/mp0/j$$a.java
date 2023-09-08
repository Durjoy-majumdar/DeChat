package mp0;

import a70.C112760b;
import android.content.Context;
import android.webkit.ValueCallback;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import q52.C89480u;

public final /* synthetic */ class j$$a implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ C88804j f32843a;

    /* renamed from: b */
    public final /* synthetic */ String f32844b;

    /* renamed from: c */
    public final /* synthetic */ Context f32845c;

    public /* synthetic */ j$$a(C88804j jVar, String str, Context context) {
        this.f32843a = jVar;
        this.f32844b = str;
        this.f32845c = context;
    }

    public final void onReceiveValue(Object obj) {
        C88804j jVar = this.f32843a;
        String str = this.f32844b;
        Context context = this.f32845c;
        jVar.getClass();
        if (C89480u.m111872a(str, (String) obj)) {
            MMHandlerThread.postToMainThread(new j$$b(context, C112760b.m154195C() + "appbrand/trace/" + str));
            jVar.f256209a = false;
            return;
        }
        MMHandlerThread.postToMainThread(new j$$c(context, str));
    }
}
