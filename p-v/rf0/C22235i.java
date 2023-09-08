package rf0;

import jf0.C21234c;
import lf0.C21425b;
import qf0.C22081a;

/* renamed from: rf0.i */
public class C22235i implements C21425b {

    /* renamed from: a */
    public int f62992a;

    /* renamed from: b */
    public final /* synthetic */ C22236j f62993b;

    public C22235i(C22236j jVar) {
        this.f62993b = jVar;
    }

    public void onItemSelected(int i) {
        int intValue = ((Integer) this.f62993b.f63001e.getAdapter().getItem(i)).intValue();
        this.f62992a = ((Integer) this.f62993b.f63002f.getAdapter().getItem(this.f62993b.f63002f.getCurrentItem())).intValue();
        C22236j jVar = this.f62993b;
        if (intValue == jVar.f63015s) {
            jVar.f63002f.setAdapter(new C21234c(0, jVar.f63016t));
            int i2 = this.f62992a;
            C22236j jVar2 = this.f62993b;
            int i3 = jVar2.f63016t;
            if (i2 >= i3) {
                jVar2.f63002f.setCurrentItem(i3);
            } else {
                jVar2.f63002f.setCurrentItem(i2);
            }
        } else if (intValue == jVar.f63013q) {
            jVar.f63002f.setAdapter(new C21234c(jVar.f63014r, 59));
            int i4 = this.f62992a;
            C22236j jVar3 = this.f62993b;
            int i5 = jVar3.f63014r;
            if (i4 < i5) {
                jVar3.f63002f.setCurrentItem(0);
            } else {
                jVar3.f63002f.setCurrentItem(i4 - i5);
            }
        } else {
            jVar.f63002f.setAdapter(new C21234c(0, 59));
            this.f62993b.f63002f.setCurrentItem(this.f62992a);
        }
        C22081a aVar = this.f62993b.f63020x;
        if (aVar != null) {
            ((C22229c) aVar).mo35388a();
        }
    }
}
