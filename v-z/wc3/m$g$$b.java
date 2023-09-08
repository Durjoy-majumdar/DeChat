package wc3;

import android.app.Activity;
import android.app.Application;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di0.C86300q;
import di3.C86312j;
import js0.C88015a;
import kr0.C76630x0;
import wc3.C90945m;

public class m$g$$b extends C88015a {

    /* renamed from: d */
    public final /* synthetic */ C86300q f260995d;

    /* renamed from: e */
    public final /* synthetic */ C90945m.C90952g f260996e;

    public m$g$$b(C90945m.C90952g gVar, C86300q qVar) {
        this.f260996e = gVar;
        this.f260995d = qVar;
    }

    public void onActivityDestroyed(Activity activity) {
        if (activity == this.f260996e.f260991a) {
            ((Application) MMApplicationContext.getContext()).unregisterActivityLifecycleCallbacks(this);
            ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106885C6(this.f260995d);
        }
    }
}
