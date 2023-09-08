package cr1;

import com.tencent.p014mm.plugin.finder.upload.postlogic.mvstage.MvMediaProcessStage;
import fy3.C32226l;
import gy3.C59741c0;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: cr1.a */
public final class C57977a extends C87413o implements C32226l<Float, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59741c0 f165895d;

    /* renamed from: e */
    public final /* synthetic */ MvMediaProcessStage f165896e;

    /* renamed from: f */
    public final /* synthetic */ int f165897f;

    /* renamed from: g */
    public final /* synthetic */ int f165898g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57977a(C59741c0 c0Var, MvMediaProcessStage mvMediaProcessStage, int i, int i2) {
        super(1);
        this.f165895d = c0Var;
        this.f165896e = mvMediaProcessStage;
        this.f165897f = i;
        this.f165898g = i2;
    }

    public Object invoke(Object obj) {
        float floatValue = ((Number) obj).floatValue();
        if (floatValue - this.f165895d.f170634d > 0.1f) {
            this.f165896e.mo79373h(floatValue, this.f165897f, this.f165898g);
            this.f165895d.f170634d = floatValue;
        }
        return C13598b0.f38549a;
    }
}
