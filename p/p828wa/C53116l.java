package p828wa;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.concurrent.ConcurrentHashMap;
import p824tc.C48619a;

/* renamed from: wa.l */
public class C53116l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C53106j f148226d;

    public C53116l(C53106j jVar) {
        this.f148226d = jVar;
    }

    public void run() {
        if (!((Activity) this.f148226d.f148202b).isFinishing()) {
            C53106j jVar = this.f148226d;
            Context applicationContext = jVar.f148202b.getApplicationContext();
            Class<? extends C48619a> c = this.f148226d.mo73789c();
            ConcurrentHashMap<Integer, C53133t> concurrentHashMap = C53136v.f148255a;
            C53133t tVar = new C53133t(applicationContext, c);
            if (!TextUtils.isEmpty((CharSequence) null)) {
                tVar.mo73821i((String) null);
            }
            C53136v.f148255a.put(Integer.valueOf(tVar.hashCode()), tVar);
            Log.m105925i(C53136v.class.getSimpleName(), "preload, url: %s, holding size: %d", null, Integer.valueOf(C53136v.f148255a.size()));
            jVar.f148208h = Integer.valueOf(tVar.hashCode());
        }
    }
}
