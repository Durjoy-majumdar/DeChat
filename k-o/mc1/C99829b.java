package mc1;

import com.tencent.p014mm.plugin.fav.p047ui.C93666k0;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: mc1.b */
public final class C99829b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f292528d;

    /* renamed from: e */
    public final /* synthetic */ Runnable f292529e;

    public C99829b(int i, Runnable runnable) {
        this.f292528d = i;
        this.f292529e = runnable;
    }

    public final void run() {
        C93666k0 a = C93666k0.f270444c.mo128591a();
        int i = this.f292528d;
        if (!a.mo128588a(i)) {
            Log.m105920e("MicroMsg.FavFinderStorage", "[remove] position invalid return");
        } else {
            Log.m105924i("MicroMsg.FavFinderStorage", "[remove] use pos remove item in favIdList & favItemList, currentThread = " + Thread.currentThread().getName());
            a.f270447b.remove(i);
            a.f270446a.remove(i);
            Log.m105924i("MicroMsg.FavFinderStorage", "[remove] remove success, position = " + i);
        }
        this.f292529e.run();
    }
}
