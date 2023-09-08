package oi0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import es0.C58801k;
import fy3.C32224a;
import fy3.C32228q;
import gy3.C87413o;
import java.util.LinkedList;
import rx3.C13598b0;
import te3.C90419io3;

/* renamed from: oi0.i */
public final class C89225i extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C89217f f257094d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89225i(C89217f fVar) {
        super(0);
        this.f257094d = fVar;
    }

    public Object invoke() {
        C89217f fVar = this.f257094d;
        fVar.getClass();
        if (Util.nowSecond() - fVar.f257076d > fVar.f257078f) {
            Log.m105924i("MicroMsg.Recommend.AppBrandRecommendLogic", "data is timeout, need to update from server");
            C89217f fVar2 = this.f257094d;
            fVar2.f257079g = 0;
            fVar2.f257080h = 0;
            fVar2.f257082j = 0;
            C89217f.m111507a(fVar2, 0);
            C58801k.m68584b(2);
        } else {
            C89217f fVar3 = this.f257094d;
            LinkedList<C90419io3> c = fVar3.mo123547c();
            int i = this.f257094d.f257079g;
            C32228q<? super Integer, ? super LinkedList<C90419io3>, ? super Integer, C13598b0> qVar = fVar3.f257086n;
            if (qVar != null) {
                qVar.invoke(3, c, Integer.valueOf(i));
            }
            C58801k.m68584b(1);
        }
        return C13598b0.f38549a;
    }
}
