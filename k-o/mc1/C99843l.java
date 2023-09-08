package mc1;

import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.C0966R;
import pb1.C100703e0;
import pb1.C100734q;
import pb1.C100755z;

/* renamed from: mc1.l */
public final class C99843l implements View.OnCreateContextMenuListener {

    /* renamed from: d */
    public final /* synthetic */ C100755z f292550d;

    public C99843l(C100755z zVar) {
        this.f292550d = zVar;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        boolean c = new C100703e0().mo140134c(this.f292550d);
        if (!c) {
            contextMenu.add(0, 3, 0, C0966R.string.cqx);
        }
        if (c && C100734q.m131841c0(this.f292550d)) {
            contextMenu.add(0, 3, 0, C0966R.string.cqx);
        }
        contextMenu.add(0, 2, 0, C0966R.string.cnr);
        contextMenu.add(0, 0, 0, C0966R.string.f360418cn2);
        contextMenu.add(0, 1, 0, C0966R.string.cp_);
    }
}
