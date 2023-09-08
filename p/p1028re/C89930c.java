package p1028re;

import com.tencent.matrix.lifecycle.C80401d;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import p1028re.C89931d;
import p723vf.C118672d;

/* renamed from: re.c */
public final class C89930c extends C80401d {

    /* renamed from: b */
    public final /* synthetic */ C89931d.C89932a f258423b;

    public C89930c(C89931d.C89932a aVar) {
        this.f258423b = aVar;
    }

    /* renamed from: a */
    public void mo17850a() {
        this.f258423b.f258428e = 0;
        C89931d.C89932a aVar = this.f258423b;
        Long l = aVar.f258432i.f258422b.get(aVar.f258428e);
        C87412m.m108593f(l, "config.delayMillis[delayIndex]");
        long longValue = l.longValue();
        this.f258423b.f258427d.removeCallbacksAndMessages((Object) null);
        C89931d.C89932a aVar2 = this.f258423b;
        if (aVar2.f258433j) {
            C89931d.f258426c.mo124254d(aVar2.f258431h);
            C118672d.m167353c("Matrix.TrimMemoryNotifier", '[' + this.f258423b.f258429f + "] trim immediately", new Object[0]);
        }
        C89931d.C89932a aVar3 = this.f258423b;
        aVar3.f258427d.postDelayed(aVar3, longValue);
        C118672d.m167353c("Matrix.TrimMemoryNotifier", "...[" + this.f258423b.f258429f + "] trim delay[" + (this.f258423b.f258428e + 1) + XVFSFile.SEPARATOR_CHAR + this.f258423b.f258432i.f258422b.size() + "] " + longValue, new Object[0]);
    }

    /* renamed from: b */
    public void mo17851b() {
        C89931d.C89932a aVar = this.f258423b;
        aVar.f258427d.removeCallbacks(aVar);
        this.f258423b.f258428e = 0;
    }
}
