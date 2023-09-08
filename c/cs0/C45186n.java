package cs0;

import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.C0966R;

/* renamed from: cs0.n */
public final class C45186n implements View.OnCreateContextMenuListener {

    /* renamed from: d */
    public final /* synthetic */ C45181m f122498d;

    public C45186n(C45181m mVar) {
        this.f122498d = mVar;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C45181m mVar = this.f122498d;
        if (contextMenu != null) {
            contextMenu.add(0, 0, 0, mVar.f122487d.getString(C0966R.string.a9e));
        } else {
            mVar.getClass();
        }
    }
}
