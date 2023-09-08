package zq1;

import com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.FinderDraftMediaProcessStage;
import fy3.C32226l;
import gy3.C59741c0;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: zq1.d */
public final class C66962d extends C87413o implements C32226l<Float, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59741c0 f192373d;

    /* renamed from: e */
    public final /* synthetic */ FinderDraftMediaProcessStage f192374e;

    /* renamed from: f */
    public final /* synthetic */ int f192375f;

    /* renamed from: g */
    public final /* synthetic */ int f192376g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66962d(C59741c0 c0Var, FinderDraftMediaProcessStage finderDraftMediaProcessStage, int i, int i2) {
        super(1);
        this.f192373d = c0Var;
        this.f192374e = finderDraftMediaProcessStage;
        this.f192375f = i;
        this.f192376g = i2;
    }

    public Object invoke(Object obj) {
        float floatValue = ((Number) obj).floatValue();
        if (floatValue - this.f192373d.f170634d > 0.1f) {
            this.f192374e.mo79333j((((float) this.f192375f) + floatValue) / ((float) this.f192376g));
            this.f192373d.f170634d = floatValue;
        }
        return C13598b0.f38549a;
    }
}
