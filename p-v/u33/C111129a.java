package u33;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import w80.C111742d;

/* renamed from: u33.a */
public final class C111129a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C111130b f332733d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111129a(C111130b bVar) {
        super(0);
        this.f332733d = bVar;
    }

    public Object invoke() {
        C111742d.C65942b bVar = this.f332733d.f332737d;
        if (bVar != null) {
            C111742d.f334647a.mo163471q(bVar);
        }
        this.f332733d.f332736c.quitSafely();
        MMHandler mMHandler = this.f332733d.f332735b;
        if (mMHandler != null) {
            mMHandler.quitSafely();
        }
        Log.m105924i("MicroMsg.VoipThread", "release: " + this.f332733d.f332736c.getName());
        return C13598b0.f38549a;
    }
}
