package p191l2;

import com.tencent.p014mm.C0966R;
import p175j0.C108509q;
import p175j0.C60647d0;

/* renamed from: l2.b */
public final class C109140b implements C60647d0 {

    /* renamed from: a */
    public final /* synthetic */ C109148j f326799a;

    public C109140b(C109148j jVar) {
        this.f326799a = jVar;
    }

    public void dispose() {
        C109148j jVar = this.f326799a;
        C108509q qVar = jVar.f305948f;
        if (qVar != null) {
            qVar.dispose();
        }
        jVar.f305948f = null;
        jVar.requestLayout();
        C109148j jVar2 = this.f326799a;
        jVar2.setTag(C0966R.C0970id.l8r, (Object) null);
        jVar2.f326815s.removeViewImmediate(jVar2);
    }
}
