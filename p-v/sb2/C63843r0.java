package sb2;

import com.tencent.p014mm.plugin.p081mv.p082ui.uic.C57067h;
import sx3.C110818d0;

/* renamed from: sb2.r0 */
public final class C63843r0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C57067h f180971d;

    /* renamed from: e */
    public final /* synthetic */ long f180972e;

    /* renamed from: f */
    public final /* synthetic */ long f180973f;

    public C63843r0(C57067h hVar, long j, long j2) {
        this.f180971d = hVar;
        this.f180972e = j;
        this.f180973f = j2;
    }

    public final void run() {
        C57067h hVar = this.f180971d;
        C57067h.C57068a aVar = (C57067h.C57068a) C110818d0.m150917O(hVar.f163408e, hVar.f163411h);
        if (aVar != null) {
            long j = this.f180972e;
            long j2 = this.f180973f;
            C57067h hVar2 = this.f180971d;
            if (aVar.f163418f != null) {
                hVar2.mo80499c3().notifyItemChanged(hVar2.f163411h + hVar2.mo80499c3().mo85796c6(), 2);
            }
            aVar.f163421i = ((float) j) / ((float) j2);
            hVar2.mo80499c3().notifyItemChanged(hVar2.f163411h + hVar2.mo80499c3().mo85796c6(), 2);
        }
    }
}
