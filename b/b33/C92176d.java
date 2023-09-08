package b33;

import android.graphics.Rect;
import com.tencent.p014mm.plugin.vlog.model.C106205q0;
import com.tencent.p014mm.plugin.vlog.model.C96551o;
import com.tencent.p014mm.plugin.vlog.model.C96552p0;
import com.tencent.p014mm.videocomposition.play.VideoCompositionPlayView;
import com.tencent.p014mm.xeffect.effect.EffectManager;
import ei2.C31606c;
import gy3.C87412m;
import java.util.Iterator;
import te3.C64899zy;
import w80.C111750i;

/* renamed from: b33.d */
public final class C92176d {

    /* renamed from: a */
    public final VideoCompositionPlayView f263821a;

    /* renamed from: b */
    public final C31606c f263822b;

    /* renamed from: c */
    public final EffectManager f263823c;

    /* renamed from: d */
    public final C96552p0 f263824d;

    public C92176d(C64899zy zyVar, VideoCompositionPlayView videoCompositionPlayView) {
        C87412m.m108594g(zyVar, "compositionInfo");
        C87412m.m108594g(videoCompositionPlayView, "playView");
        this.f263821a = videoCompositionPlayView;
        C31606c e = C96551o.m123875e(zyVar);
        this.f263822b = e;
        EffectManager effectManager = new EffectManager();
        this.f263823c = effectManager;
        e.start();
        C96552p0 d = C96551o.m123874d(zyVar, effectManager);
        this.f263824d = d;
        d.mo134622s(e);
        d.mo81183b(new Rect());
    }

    /* renamed from: a */
    public final void mo126135a() {
        C111750i.C102362a a;
        Iterator<C106205q0> it = this.f263824d.f282570c.iterator();
        while (it.hasNext()) {
            C106205q0 next = it.next();
            if (next.f316491b == 2 && (a = C111750i.f334661a.mo163488a(next.f316490a)) != null) {
                this.f263824d.mo134609f(a.f301462b, a.f301463c);
            }
        }
    }
}
