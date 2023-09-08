package p212oe;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: oe.j$$e$$a */
public final /* synthetic */ class j$$e$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f352170d;

    public /* synthetic */ j$$e$$a(Context context) {
        this.f352170d = context;
    }

    public final void run() {
        Context context = this.f352170d;
        Log.m105924i("Matrix.battery.LifeCycle", "onRefreshHealthStats");
        C117774q.m166122e(context);
    }
}
