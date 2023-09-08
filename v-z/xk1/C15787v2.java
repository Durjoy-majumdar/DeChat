package xk1;

import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.C0966R;

/* renamed from: xk1.v2 */
public final class C15787v2 implements View.OnCreateContextMenuListener {

    /* renamed from: d */
    public final /* synthetic */ C15771r2 f42548d;

    public C15787v2(C15771r2 r2Var) {
        this.f42548d = r2Var;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1, 0, this.f42548d.getContext().getResources().getString(C0966R.string.e_u));
        contextMenu.add(0, 2, 1, this.f42548d.getContext().getResources().getString(C0966R.string.e_s));
    }
}
