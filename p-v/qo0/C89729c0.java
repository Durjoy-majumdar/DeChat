package qo0;

import com.tencent.p014mm.sdk.platformtools.Log;
import ej0.C58608e;
import fy3.C32226l;
import gy3.C87412m;
import hj0.C87535e;
import qo0.C89750q;
import rx3.C13598b0;

/* renamed from: qo0.c0 */
public final class C89729c0 extends C89750q.C89752b {

    /* renamed from: a */
    public final /* synthetic */ C89750q f258027a;

    /* renamed from: b */
    public final /* synthetic */ C32226l<Boolean, C13598b0> f258028b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89729c0(C89750q qVar, C32226l<? super Boolean, C13598b0> lVar) {
        super(qVar);
        this.f258027a = qVar;
        this.f258028b = lVar;
    }

    /* renamed from: a */
    public void mo88410a(C87535e eVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("stop fail");
        sb.append(eVar != null ? Integer.valueOf(eVar.f253592c) : "");
        Log.m105920e("MicroMsg.VideoCast.VideoCastController", sb.toString());
        this.f258028b.invoke(Boolean.FALSE);
    }

    /* renamed from: b */
    public void mo88411b(C87535e eVar) {
        C87412m.m108594g(eVar, "response");
        Log.m105924i("MicroMsg.VideoCast.VideoCastController", "stop success");
        this.f258027a.f258094e.mo124027b().f251386e.f167798a = C58608e.C58609a.Stopped;
        C89750q qVar = this.f258027a;
        qVar.f258094e.mo124027b().mo121007h();
        qVar.f258094e.mo124027b().mo121008i();
        qVar.f258094e.mo124027b().f251389h = null;
        this.f258027a.f258103n.stopTimer();
        this.f258028b.invoke(Boolean.TRUE);
    }
}
