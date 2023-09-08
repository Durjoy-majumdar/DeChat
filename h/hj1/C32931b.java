package hj1;

import cj1.C28574j6;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import fj1.C45795b;
import gy3.C8480h;

/* renamed from: hj1.b */
public abstract class C32931b implements Runnable {

    /* renamed from: d */
    public final C28574j6 f89506d = new C28574j6(mo58873b(), (String) null, this, 2, (C8480h) null);

    /* renamed from: a */
    public abstract void mo58872a(C45795b bVar);

    /* renamed from: b */
    public abstract String mo58873b();

    /* renamed from: c */
    public final void mo58874c(long j) {
        Log.m105924i("LoopTask", "startTaskLoop delay: " + j + " task: " + mo58873b());
        this.f89506d.mo56067c(Long.valueOf(j));
    }

    /* renamed from: d */
    public final void mo58875d() {
        Log.m105924i("LoopTask", "stopTaskLoop task: " + mo58873b());
        this.f89506d.mo56066b();
    }

    public void run() {
        FinderLiveService.f159376d.getClass();
        C45795b bVar = FinderLiveService.f159348A;
        if (bVar != null) {
            mo58872a(bVar);
        }
    }
}
