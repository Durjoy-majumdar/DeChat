package rf0;

import lf0.C21425b;
import qf0.C22081a;

/* renamed from: rf0.g */
public class C22233g implements C21425b {

    /* renamed from: a */
    public final /* synthetic */ C22236j f62990a;

    public C22233g(C22236j jVar) {
        this.f62990a = jVar;
    }

    public void onItemSelected(int i) {
        int i2 = i + 1;
        C22236j jVar = this.f62990a;
        int i3 = jVar.f63007k;
        int i4 = jVar.f63008l;
        if (i3 == i4) {
            int i5 = jVar.f63009m;
            int i6 = (i2 + i5) - 1;
            int i7 = jVar.f63010n;
            if (i5 == i7) {
                C22236j.m25765a(jVar, jVar.f63017u, i6, jVar.f63011o, jVar.f63012p, jVar.f63022z, jVar.f62995A);
            } else if (i5 == i6) {
                C22236j.m25765a(jVar, jVar.f63017u, i6, jVar.f63011o, 31, jVar.f63022z, jVar.f62995A);
            } else if (i7 == i6) {
                C22236j.m25765a(jVar, jVar.f63017u, i6, 1, jVar.f63012p, jVar.f63022z, jVar.f62995A);
            } else {
                C22236j.m25765a(jVar, jVar.f63017u, i6, 1, 31, jVar.f63022z, jVar.f62995A);
            }
        } else {
            int i8 = jVar.f63017u;
            if (i8 == i3) {
                int i9 = jVar.f63009m;
                int i15 = (i2 + i9) - 1;
                if (i15 == i9) {
                    C22236j.m25765a(jVar, i8, i15, jVar.f63011o, 31, jVar.f63022z, jVar.f62995A);
                } else {
                    C22236j.m25765a(jVar, i8, i15, 1, 31, jVar.f63022z, jVar.f62995A);
                }
            } else if (i8 != i4) {
                C22236j.m25765a(jVar, i8, i2, 1, 31, jVar.f63022z, jVar.f62995A);
            } else if (i2 == jVar.f63010n) {
                int currentItem = jVar.f62999c.getCurrentItem() + 1;
                C22236j jVar2 = this.f62990a;
                C22236j.m25765a(jVar, i8, currentItem, 1, jVar2.f63012p, jVar2.f63022z, jVar2.f62995A);
            } else {
                int currentItem2 = jVar.f62999c.getCurrentItem() + 1;
                C22236j jVar3 = this.f62990a;
                C22236j.m25765a(jVar, i8, currentItem2, 1, 31, jVar3.f63022z, jVar3.f62995A);
            }
        }
        C22081a aVar = this.f62990a.f63020x;
        if (aVar != null) {
            ((C22229c) aVar).mo35388a();
        }
    }
}
