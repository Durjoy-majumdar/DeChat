package lh2;

import com.tencent.p014mm.plugin.recordvideo.background.VideoMixer;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.sdk.platformtools.Log;
import fh2.C97882i;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C101781gb0;
import zt3.C119157j;

/* renamed from: lh2.d1 */
public final class C99425d1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C99431f1 f291513d;

    /* renamed from: e */
    public final /* synthetic */ VideoMixer f291514e;

    /* renamed from: f */
    public final /* synthetic */ C8479f0<C101781gb0> f291515f;

    /* renamed from: g */
    public final /* synthetic */ RecordConfigProvider f291516g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99425d1(C99431f1 f1Var, VideoMixer videoMixer, C8479f0<C101781gb0> f0Var, RecordConfigProvider recordConfigProvider) {
        super(0);
        this.f291513d = f1Var;
        this.f291514e = videoMixer;
        this.f291515f = f0Var;
        this.f291516g = recordConfigProvider;
    }

    public Object invoke() {
        C99431f1 f1Var = this.f291513d;
        VideoMixer videoMixer = this.f291514e;
        C97882i iVar = f1Var.f291534i;
        C87412m.m108591d(iVar);
        RecordConfigProvider recordConfigProvider = this.f291516g;
        long j = recordConfigProvider.f272909J;
        C97882i.C97883a aVar = this.f291513d.f291535j;
        int i = recordConfigProvider.f272905F;
        Log.m105924i("MicroMsg.RemuxPlugin", "mix in background");
        ((C119157j) C119157j.f356862d).mo183875f(new C99445h1(f1Var, videoMixer, aVar, iVar, (C101781gb0) this.f291515f.f27484d, j, i));
        return C13598b0.f38549a;
    }
}
