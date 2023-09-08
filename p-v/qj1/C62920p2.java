package qj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: qj1.p2 */
public final class C62920p2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C62905o2 f178544d;

    /* renamed from: e */
    public final /* synthetic */ boolean f178545e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62920p2(C62905o2 o2Var, boolean z) {
        super(0);
        this.f178544d = o2Var;
        this.f178545e = z;
    }

    public Object invoke() {
        String str = this.f178544d.f178513q;
        Log.m105924i(str, "notifyAnchorVolumeChange isTalking:" + this.f178545e);
        if (C61926c.m72696u(this.f178544d.f178522z, 1) && !C61926c.m72696u(this.f178544d.f178522z, 4)) {
            if (this.f178545e) {
                this.f178544d.f178518v.setVisibility(0);
                if (!this.f178544d.f178518v.isPlaying()) {
                    this.f178544d.f178518v.play();
                }
            } else {
                this.f178544d.f178518v.setVisibility(4);
                this.f178544d.f178518v.stop();
            }
        }
        return C13598b0.f38549a;
    }
}
