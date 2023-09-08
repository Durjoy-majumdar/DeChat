package wp3;

import com.tencent.tav.player.Callback;
import yp3.C112478a;

/* renamed from: wp3.f */
public final class C111828f implements Callback {

    /* renamed from: a */
    public final /* synthetic */ C111829g f334833a;

    /* renamed from: b */
    public final /* synthetic */ long f334834b;

    /* renamed from: c */
    public final /* synthetic */ long f334835c;

    public C111828f(C111829g gVar, long j, long j2) {
        this.f334833a = gVar;
        this.f334834b = j;
        this.f334835c = j2;
    }

    public final void call() {
        long currentTimeMillis = System.currentTimeMillis() - this.f334834b;
        C112478a.m153625c("VideoCompositionPlayer", "seekTo:" + this.f334835c + " completed", new Object[0]);
        C111825c cVar = this.f334833a.f334844i;
        if (cVar != null) {
            cVar.mo138708d(currentTimeMillis);
        }
    }
}
