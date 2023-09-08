package to1;

import android.content.DialogInterface;

/* renamed from: to1.f */
public final class C64969f implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C64963d f187074d;

    public C64969f(C64963d dVar) {
        this.f187074d = dVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C64963d dVar = this.f187074d;
        dVar.f187052g.mo86089b();
        dVar.f187058p.mo160558o(dVar.f187052g.f174085d.size());
        if (dVar.f187052g.f174085d.isEmpty()) {
            dVar.reset();
        }
    }
}
