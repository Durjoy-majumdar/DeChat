package p368o2;

import java.util.ArrayList;
import p363n2.C21587c;

/* renamed from: o2.p */
public class C21750p extends C21738f {

    /* renamed from: i0 */
    public ArrayList<C21738f> f61673i0 = new ArrayList<>();

    /* renamed from: B */
    public void mo34031B(int i, int i2) {
        this.f61565O = i;
        this.f61566P = i2;
        int size = this.f61673i0.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f61673i0.get(i3).mo34031B(this.f61559I + this.f61565O, this.f61560J + this.f61566P);
        }
    }

    /* renamed from: E */
    public void mo34034E() {
        super.mo34034E();
        ArrayList<C21738f> arrayList = this.f61673i0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C21738f fVar = this.f61673i0.get(i);
                fVar.mo34031B(this.f61563M + this.f61565O, this.f61564N + this.f61566P);
                if (!(fVar instanceof C21740g)) {
                    fVar.mo34034E();
                }
            }
        }
    }

    /* renamed from: G */
    public void mo34058G() {
        mo34034E();
        ArrayList<C21738f> arrayList = this.f61673i0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C21738f fVar = this.f61673i0.get(i);
                if (fVar instanceof C21750p) {
                    ((C21750p) fVar).mo34058G();
                }
            }
        }
    }

    /* renamed from: u */
    public void mo34054u() {
        this.f61673i0.clear();
        super.mo34054u();
    }

    /* renamed from: w */
    public void mo34055w(C21587c cVar) {
        super.mo34055w(cVar);
        int size = this.f61673i0.size();
        for (int i = 0; i < size; i++) {
            this.f61673i0.get(i).mo34055w(cVar);
        }
    }
}
