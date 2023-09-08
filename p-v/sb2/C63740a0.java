package sb2;

import com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvMakerFixEditUIC;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import hb2.C59811e;
import hb2.C59826g;
import rx3.C13598b0;

/* renamed from: sb2.a0 */
public final class C63740a0 extends C87413o implements C32226l<C59826g, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ MusicMvMakerFixEditUIC f180689d;

    /* renamed from: e */
    public final /* synthetic */ int f180690e;

    /* renamed from: f */
    public final /* synthetic */ C59811e f180691f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63740a0(MusicMvMakerFixEditUIC musicMvMakerFixEditUIC, int i, C59811e eVar) {
        super(1);
        this.f180689d = musicMvMakerFixEditUIC;
        this.f180690e = i;
        this.f180691f = eVar;
    }

    public Object invoke(Object obj) {
        C59826g gVar = (C59826g) obj;
        C87412m.m108594g(gVar, "animationInfo");
        MusicMvMakerFixEditUIC.C57043d dVar = this.f180689d.f163343r;
        if (dVar != null) {
            dVar.mo80398b(this.f180690e, this.f180691f, true, gVar);
        }
        return C13598b0.f38549a;
    }
}
