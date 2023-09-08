package p53;

import m53.C10762h;

/* renamed from: p53.e */
public final class C11836e implements C10762h<Void> {

    /* renamed from: a */
    public final /* synthetic */ C11840h f34606a;

    public C11836e(C11840h hVar) {
        this.f34606a = hVar;
    }

    /* renamed from: a */
    public void mo605a(int i, int i2, String str) {
        this.f34606a.f34616i.postValue(Boolean.FALSE);
        C10762h<Void> hVar = this.f34606a.f34611d.f32225d;
        if (hVar != null) {
            hVar.mo605a(i, i2, str);
        }
    }

    public void onSuccess(Object obj) {
        Void voidR = (Void) obj;
        this.f34606a.f34616i.postValue(Boolean.FALSE);
        C10762h<Void> hVar = this.f34606a.f34611d.f32225d;
        if (hVar != null) {
            hVar.onSuccess(voidR);
        }
    }
}
