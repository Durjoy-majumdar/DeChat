package t42;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import nj3.C76912y0;

/* renamed from: t42.b */
public final class C13824b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C13825c f38959d;

    public C13824b(C13825c cVar) {
        this.f38959d = cVar;
    }

    public final void run() {
        Context context = MMApplicationContext.getContext();
        C76912y0.makeText(context, (CharSequence) "start cpu profiling for biz " + this.f38959d.mo120841d().f26666a, 0).show();
    }
}
