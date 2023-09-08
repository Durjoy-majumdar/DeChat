package p849e3;

import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103764p;
import androidx.lifecycle.C39623j;

/* renamed from: e3.f$$b */
public final /* synthetic */ class f$$b implements C103764p {

    /* renamed from: d */
    public final /* synthetic */ C116677f f349934d;

    /* renamed from: e */
    public final /* synthetic */ C39623j.C39626c f349935e;

    /* renamed from: f */
    public final /* synthetic */ C116678i f349936f;

    public /* synthetic */ f$$b(C116677f fVar, C39623j.C39626c cVar, C116678i iVar) {
        this.f349934d = fVar;
        this.f349935e = cVar;
        this.f349936f = iVar;
    }

    /* renamed from: k4 */
    public final void mo104k4(C0125s sVar, C39623j.C39625b bVar) {
        C116677f fVar = this.f349934d;
        C39623j.C39626c cVar = this.f349935e;
        C116678i iVar = this.f349936f;
        fVar.getClass();
        int[] iArr = C39623j.C39624a.f106385a;
        int i = iArr[cVar.ordinal()];
        C39623j.C39625b bVar2 = null;
        if (bVar == (i != 1 ? i != 2 ? i != 3 ? null : C39623j.C39625b.ON_RESUME : C39623j.C39625b.ON_START : C39623j.C39625b.ON_CREATE)) {
            fVar.f349930b.add(iVar);
            fVar.f349929a.run();
            return;
        }
        C39623j.C39625b bVar3 = C39623j.C39625b.ON_DESTROY;
        if (bVar == bVar3) {
            fVar.mo180679a(iVar);
            return;
        }
        int i2 = iArr[cVar.ordinal()];
        if (i2 == 1) {
            bVar2 = bVar3;
        } else if (i2 == 2) {
            bVar2 = C39623j.C39625b.ON_STOP;
        } else if (i2 == 3) {
            bVar2 = C39623j.C39625b.ON_PAUSE;
        }
        if (bVar == bVar2) {
            fVar.f349930b.remove(iVar);
            fVar.f349929a.run();
        }
    }
}
