package kd0;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import kd0.C21323o;
import p910lj.C76701a;

public class o$c$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C21323o.C21326c f60269d;

    public o$c$$b(C21323o.C21326c cVar) {
        this.f60269d = cVar;
    }

    public void run() {
        Context context = MMApplicationContext.getContext();
        C76701a.makeText(context, (CharSequence) "Save to: " + C21323o.this.f60252n.f260481a, 1).show();
    }
}
