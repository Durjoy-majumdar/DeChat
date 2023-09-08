package np1;

import android.app.Activity;
import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import di0.C86299o;

/* renamed from: np1.s */
public final class C61878s implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C61817a f175956d;

    /* renamed from: e */
    public final /* synthetic */ Object f175957e;

    /* renamed from: f */
    public final /* synthetic */ long f175958f;

    public C61878s(C61817a aVar, Object obj, long j) {
        this.f175956d = aVar;
        this.f175957e = obj;
        this.f175958f = j;
    }

    public final void run() {
        boolean z;
        Context context = this.f175956d.f175772e.getContext();
        if (context == null || !(context instanceof Activity)) {
            z = false;
        } else {
            Activity activity = (Activity) context;
            z = activity.isDestroyed() | activity.isFinishing();
        }
        if (!z) {
            Object obj = this.f175957e;
            if ((obj instanceof C86299o ? (C86299o) obj : null) != null) {
                this.f175956d.mo86738E((C86299o) obj);
                return;
            }
            return;
        }
        Log.m105924i("Finder.LiveShoppingListPlugin", "openHalfScreenMiniprogramImpl delayMs:" + this.f175958f + ",isFinished!");
    }
}
