package ud0;

import ud0.C22624a;
import wd0.C22894a;
import zd0.C23466p;

/* renamed from: ud0.f */
public final class C22640f implements C23466p.C23485o {

    /* renamed from: a */
    public final /* synthetic */ C22624a.C22626b f65129a;

    public C22640f(C22624a.C22626b bVar) {
        this.f65129a = bVar;
    }

    public void onDismiss() {
        C22624a.C22625a aVar = this.f65129a.f65085h;
        if (aVar != null) {
            aVar.mo21981a();
        }
    }

    public void onShow() {
        C22624a.C22626b bVar = this.f65129a;
        C22624a.C22625a aVar = bVar.f65085h;
        if (aVar != null) {
            aVar.mo21986f(bVar.f65089l, bVar.f65090m);
        }
        C22894a.f65798a.mo36069a(1, this.f65129a.f65096s);
    }
}
