package oa0;

import ca0.C54683f0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87413o;
import p175j0.C60690y0;
import rx3.C13598b0;

/* renamed from: oa0.r */
public final class C61979r extends C87413o implements C32227p<Boolean, Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C54683f0 f176184d;

    /* renamed from: e */
    public final /* synthetic */ C60690y0<Boolean> f176185e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61979r(C54683f0 f0Var, C60690y0<Boolean> y0Var) {
        super(2);
        this.f176184d = f0Var;
        this.f176185e = y0Var;
    }

    public Object invoke(Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        if (this.f176185e.getValue().booleanValue()) {
            Log.m105924i("MicroMsg.SnsTemplateUIPage", "TemplateUIPage: no need to mute music");
        } else {
            C54683f0 f0Var = this.f176184d;
            Log.m105924i("MicroMsg.SnsTemplateUIPage", "TemplateUIPage: muteMusic " + booleanValue);
            if (booleanValue2) {
                f0Var.f153256h.invoke(Boolean.valueOf(booleanValue), f0Var.f153253e.getValue());
            } else {
                f0Var.f153255g.invoke(Boolean.valueOf(booleanValue), f0Var.f153253e.getValue());
            }
        }
        return C13598b0.f38549a;
    }
}
