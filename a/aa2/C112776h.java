package aa2;

import com.tencent.p014mm.plugin.multitask.C105923s;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87413o;
import java.util.List;
import m92.C61444a;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: aa2.h */
public final class C112776h extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C112765c f337687d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112776h(C112765c cVar) {
        super(0);
        this.f337687d = cVar;
    }

    public Object invoke() {
        C61444a vx02 = ((C105923s) C86312j.m106911c(C105923s.class)).vx0();
        List<MultiTaskInfo> d3 = vx02 != null ? vx02.mo86418d3() : null;
        C112765c cVar = this.f337687d;
        cVar.getClass();
        C61926c.m72668M(new C112777i(cVar, d3, false, true, false));
        C112765c cVar2 = this.f337687d;
        cVar2.getClass();
        Log.m105924i("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", "initBallInfo");
        cVar2.mo164524o3();
        return C13598b0.f38549a;
    }
}
