package xp3;

import com.tencent.tavkit.composition.video.TAVVideoMixEffect;
import gy3.C87412m;

/* renamed from: xp3.b */
public class C112166b implements TAVVideoMixEffect {

    /* renamed from: a */
    public final C112165a f335853a;

    public C112166b(C112165a aVar) {
        C87412m.m108595h(aVar, "filter");
        this.f335853a = aVar;
    }

    public TAVVideoMixEffect.Filter createFilter() {
        return this.f335853a;
    }

    public String effectId() {
        return "CompositionMixEffect_" + hashCode();
    }
}
