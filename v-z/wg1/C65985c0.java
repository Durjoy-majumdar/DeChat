package wg1;

import android.view.View;
import cj1.C54768h6;
import cl1.C54991o;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import j50.C60735a;
import qk1.C63213g;
import rx3.C13598b0;
import wg1.C66089v;

/* renamed from: wg1.c0 */
public final class C65985c0 extends C87413o implements C32228q<View, Integer, C54768h6, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C65954a0 f189722d;

    /* renamed from: e */
    public final /* synthetic */ C63213g f189723e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65985c0(C65954a0 a0Var, C63213g gVar) {
        super(3);
        this.f189722d = a0Var;
        this.f189723e = gVar;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        TXAudioEffectManager.AudioMusicParam audioMusicParam;
        int intValue = ((Number) obj2).intValue();
        C54768h6 h6Var = (C54768h6) obj3;
        Class cls = C54991o.class;
        C87412m.m108594g((View) obj, "view");
        C87412m.m108594g(h6Var, "musicItem");
        int i = ((C54991o) this.f189722d.f189621e.mo71262a(cls)).f154232N2.f153467d;
        C60735a c = FinderLiveService.f159376d.mo77627c();
        Integer num = null;
        if (!(c == null || (audioMusicParam = c.f172994F) == null)) {
            num = Integer.valueOf(audioMusicParam.f154608id);
        }
        String str = h6Var.f153498a.f144449n;
        String str2 = this.f189723e.f179375e;
        Log.m105924i(str2, "itemClickListener curPlayPos:" + i + " newPos:" + intValue + " bgMusicId:" + num + " songPlayId:" + str);
        if (intValue != i) {
            C66089v.C66090a.m77877a(this.f189722d, h6Var, intValue, false, 4, (Object) null);
            C66107x1.f190022a.mo90147a(((C54991o) this.f189722d.f189621e.mo71262a(cls)).mo75999e4(), 8, ((C54991o) this.f189722d.f189621e.mo71262a(cls)).f154232N2.mo75647d());
        } else {
            C65954a0 a0Var = this.f189722d;
            a0Var.getClass();
            int i2 = h6Var.f153499b;
            Log.m105924i("FinderLiveAnchorMusicPresenter", "changeState " + h6Var + " pos:" + intValue);
            if (i2 == 1) {
                a0Var.mo89990E0(h6Var, intValue);
            } else if (i2 != 2) {
                C66089v.C66090a.m77877a(a0Var, h6Var, intValue, false, 4, (Object) null);
                C66107x1.f190022a.mo90147a(((C54991o) a0Var.f189621e.mo71262a(cls)).mo75999e4(), 8, ((C54991o) a0Var.f189621e.mo71262a(cls)).f154232N2.mo75647d());
            } else {
                a0Var.mo89993N(h6Var, intValue);
                C66107x1.f190022a.mo90147a(((C54991o) a0Var.f189621e.mo71262a(cls)).mo75999e4(), 8, ((C54991o) a0Var.f189621e.mo71262a(cls)).f154232N2.mo75647d());
            }
        }
        C63213g gVar = this.f189723e;
        int size = gVar.f179378h.size();
        gVar.notifyItemChanged(i + size);
        gVar.notifyItemChanged(intValue + size);
        C66096w wVar = this.f189722d.f189624h;
        if (wVar != null) {
            wVar.mo90107u0(true);
        }
        return C13598b0.f38549a;
    }
}
