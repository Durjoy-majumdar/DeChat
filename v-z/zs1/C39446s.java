package zs1;

import android.content.DialogInterface;
import fy3.C32226l;
import qo3.C77398g;
import rx3.C13598b0;
import zs1.C53815m;

/* renamed from: zs1.s */
public final class C39446s implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C53815m f105952d;

    public C39446s(C53815m mVar) {
        this.f105952d = mVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str = null;
        C77398g gVar = dialogInterface instanceof C77398g ? (C77398g) dialogInterface : null;
        if (gVar != null) {
            str = gVar.mo107527g();
        }
        if (str == null) {
            str = "";
        }
        C32226l<? super C53815m.C39445a, C13598b0> lVar = this.f105952d.f151030m;
        if (lVar != null) {
            C13598b0 invoke = lVar.invoke(new C53815m.C39445a(str));
        }
    }
}
