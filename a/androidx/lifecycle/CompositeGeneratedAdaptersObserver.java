package androidx.lifecycle;

import androidx.lifecycle.C39623j;

class CompositeGeneratedAdaptersObserver implements C103764p {

    /* renamed from: d */
    public final C103763h[] f306491d;

    public CompositeGeneratedAdaptersObserver(C103763h[] hVarArr) {
        this.f306491d = hVarArr;
    }

    /* renamed from: k4 */
    public void mo104k4(C0125s sVar, C39623j.C39625b bVar) {
        C103771y yVar = new C103771y();
        for (C103763h a : this.f306491d) {
            a.mo145132a(sVar, bVar, false, yVar);
        }
        for (C103763h a2 : this.f306491d) {
            a2.mo145132a(sVar, bVar, true, yVar);
        }
    }
}
