package lh2;

import com.tencent.p014mm.plugin.recordvideo.model.audio.AudioCacheInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import wh2.C102446b;
import zt3.C119157j;

/* renamed from: lh2.c1 */
public final class C99422c1 extends C87413o implements C32227p<Boolean, String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ AudioCacheInfo f291507d;

    /* renamed from: e */
    public final /* synthetic */ C32224a<C13598b0> f291508e;

    /* renamed from: f */
    public final /* synthetic */ C99431f1 f291509f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99422c1(AudioCacheInfo audioCacheInfo, C32224a<C13598b0> aVar, C99431f1 f1Var) {
        super(2);
        this.f291507d = audioCacheInfo;
        this.f291508e = aVar;
        this.f291509f = f1Var;
    }

    public Object invoke(Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        String str = (String) obj2;
        Log.m105924i("MicroMsg.RemuxPlugin", "cacheAudio callback success " + booleanValue);
        if (booleanValue) {
            this.f291507d.f163818j = true;
            this.f291508e.invoke();
            C102446b bVar = this.f291509f.f291530e;
            if (bVar != null) {
                C10527a1 a1Var = C10527a1.f31794d;
                C87412m.m108594g(a1Var, "onCancel");
                bVar.f301697b = a1Var;
            }
        } else {
            ((C119157j) C119157j.f356862d).mo183895z(new C99419b1(this.f291509f));
            C99431f1.m129761b(this.f291509f);
        }
        return C13598b0.f38549a;
    }
}
