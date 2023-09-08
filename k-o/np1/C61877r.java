package np1;

import android.app.Activity;
import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import di0.C86299o;

/* renamed from: np1.r */
public final class C61877r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C61817a f175953d;

    /* renamed from: e */
    public final /* synthetic */ Object f175954e;

    /* renamed from: f */
    public final /* synthetic */ long f175955f;

    public C61877r(C61817a aVar, Object obj, long j) {
        this.f175953d = aVar;
        this.f175954e = obj;
        this.f175955f = j;
    }

    public final void run() {
        boolean z;
        Context context = this.f175953d.f175772e.getContext();
        if (context == null || !(context instanceof Activity)) {
            z = false;
        } else {
            Activity activity = (Activity) context;
            z = activity.isDestroyed() | activity.isFinishing();
        }
        if (!z) {
            Object obj = this.f175954e;
            if ((obj instanceof C86299o ? (C86299o) obj : null) != null) {
                this.f175953d.mo86737D((C86299o) obj);
                return;
            }
            return;
        }
        Log.m105924i("Finder.LiveShoppingListPlugin", "openFullScreenMiniprogramImpl delayMs:" + this.f175955f + ",isFinished!");
    }
}
