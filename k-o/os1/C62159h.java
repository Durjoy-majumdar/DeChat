package os1;

import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0;
import gy3.C87412m;

/* renamed from: os1.h */
public final class C62159h<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C62163m f176733d;

    public C62159h(C62163m mVar) {
        this.f176733d = mVar;
    }

    public void onChanged(Object obj) {
        C2479n0.C2480a aVar = (C2479n0.C2480a) obj;
        boolean z = true;
        if (aVar == null || !aVar.f12908a) {
            z = false;
        }
        if (!z || !this.f176733d.mo87208c3().f176761f) {
            this.f176733d.mo87210e3();
            return;
        }
        C62163m mVar = this.f176733d;
        C87412m.m108593f(aVar, "result");
        mVar.mo87215k3(aVar);
    }
}
