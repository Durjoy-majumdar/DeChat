package z90;

import ca0.C54683f0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: z90.s */
public final class C66772s extends C87413o implements C32227p<Boolean, Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C54683f0 f191868d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66772s(C54683f0 f0Var) {
        super(2);
        this.f191868d = f0Var;
    }

    public Object invoke(Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        C54683f0 f0Var = this.f191868d;
        Log.m105924i("MicroMsg.MultiTemplatePreviewPage", "TemplateUIPage: muteMusic " + booleanValue);
        if (booleanValue2) {
            f0Var.f153256h.invoke(Boolean.valueOf(booleanValue), f0Var.f153253e.getValue());
        } else {
            f0Var.f153255g.invoke(Boolean.valueOf(booleanValue), f0Var.f153253e.getValue());
        }
        return C13598b0.f38549a;
    }
}
