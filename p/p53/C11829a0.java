package p53;

import android.content.DialogInterface;
import m53.C10762h;

/* renamed from: p53.a0 */
public final class C11829a0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C11828a f34587d;

    /* renamed from: e */
    public final /* synthetic */ C10762h<Void> f34588e;

    public C11829a0(C11828a aVar, C10762h<Void> hVar) {
        this.f34587d = aVar;
        this.f34588e = hVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C10762h<Void> hVar;
        C11828a aVar = this.f34587d;
        if (aVar != null && (hVar = this.f34588e) != null) {
            hVar.mo605a(aVar.f34583a, aVar.f34584b, aVar.f34585c);
        }
    }
}
