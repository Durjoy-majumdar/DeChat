package p982if;

import com.tencent.matrix.resource.analyzer.model.DestroyedActivityInfo;
import p723vf.C118672d;
import p937cf.C80018a;
import p987jf.C87954a;

/* renamed from: if.h */
public class C87727h extends C87719c {
    public C87727h(C87954a aVar) {
        super(aVar);
    }

    /* renamed from: b */
    public boolean mo112104b(DestroyedActivityInfo destroyedActivityInfo) {
        C118672d.m167353c("Matrix.LeakProcessor.NoDump", "lightweight mode, just report leaked activity name.", new Object[0]);
        this.f253997a.mo125242b(destroyedActivityInfo.mActivityName, true);
        mo122138c(0, C80018a.C80020b.NO_DUMP, destroyedActivityInfo.mActivityName, destroyedActivityInfo.mKey, "no dump", "0");
        return true;
    }
}
