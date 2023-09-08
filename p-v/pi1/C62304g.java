package pi1;

import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: pi1.g */
public final class C62304g extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C62305h f177113d;

    /* renamed from: e */
    public final /* synthetic */ boolean f177114e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62304g(C62305h hVar, boolean z) {
        super(0);
        this.f177113d = hVar;
        this.f177114e = z;
    }

    public Object invoke() {
        this.f177113d.f177116w = Boolean.valueOf(this.f177114e);
        if (this.f177114e) {
            this.f177113d.f177115v.f175492k.setVisibility(0);
            if (!this.f177113d.f177115v.f175492k.isPlaying()) {
                this.f177113d.f177115v.f175492k.play();
            }
        } else {
            this.f177113d.f177115v.f175492k.setVisibility(4);
            this.f177113d.f177115v.f175492k.stop();
        }
        return C13598b0.f38549a;
    }
}
