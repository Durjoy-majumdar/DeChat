package zq1;

import com.tencent.p014mm.plugin.finder.upload.postlogic.draftstage.MvDraftMediaProcessStage;
import fy3.C32226l;
import gy3.C59741c0;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: zq1.l */
public final class C66971l extends C87413o implements C32226l<Float, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59741c0 f192409d;

    /* renamed from: e */
    public final /* synthetic */ MvDraftMediaProcessStage f192410e;

    /* renamed from: f */
    public final /* synthetic */ int f192411f;

    /* renamed from: g */
    public final /* synthetic */ int f192412g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66971l(C59741c0 c0Var, MvDraftMediaProcessStage mvDraftMediaProcessStage, int i, int i2) {
        super(1);
        this.f192409d = c0Var;
        this.f192410e = mvDraftMediaProcessStage;
        this.f192411f = i;
        this.f192412g = i2;
    }

    public Object invoke(Object obj) {
        float floatValue = ((Number) obj).floatValue();
        if (floatValue - this.f192409d.f170634d > 0.1f) {
            this.f192410e.mo79343h(floatValue, this.f192411f, this.f192412g);
            this.f192409d.f170634d = floatValue;
        }
        return C13598b0.f38549a;
    }
}
