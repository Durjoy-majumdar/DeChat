package os1;

import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0;
import gy3.C87412m;

/* renamed from: os1.j */
public final class C62161j<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C62163m f176735d;

    public C62161j(C62163m mVar) {
        this.f176735d = mVar;
    }

    public void onChanged(Object obj) {
        C2479n0.C2480a aVar = (C2479n0.C2480a) obj;
        boolean z = true;
        if (aVar == null || !aVar.f12908a) {
            z = false;
        }
        if (!z || !this.f176735d.mo87208c3().f176757b) {
            this.f176735d.mo87211f3();
            return;
        }
        C62163m mVar = this.f176735d;
        C87412m.m108593f(aVar, "result");
        mVar.mo87216l3(aVar);
    }
}
