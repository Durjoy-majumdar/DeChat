package wq0;

import android.text.TextUtils;
import fl0.C86920e;
import wq0.C91065g;
import yq0.C91548e;

/* renamed from: wq0.f */
public class C91064f implements C91548e.C91554e {

    /* renamed from: a */
    public final /* synthetic */ C91065g.C91067b f261237a;

    public C91064f(C91065g gVar, C91065g.C91067b bVar) {
        this.f261237a = bVar;
    }

    /* renamed from: a */
    public void mo115867a() {
        C91065g.C91067b bVar = this.f261237a;
        if (bVar != null) {
            bVar.mo114223a(C91065g.C91066a.f261257h);
        }
    }

    /* renamed from: b */
    public void mo115868b(String str) {
        if (this.f261237a == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f261237a.mo114223a(C91065g.C91066a.f261254e);
            return;
        }
        C91065g.C91067b bVar = this.f261237a;
        bVar.mo114223a(new C91065g.C91066a(-1, "fail " + str, C86920e.f252319i));
    }

    public void onCancel() {
        C91065g.C91067b bVar = this.f261237a;
        if (bVar != null) {
            bVar.mo114223a(C91065g.C91066a.f261253d);
        }
    }
}
