package qk1;

import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.C0966R;
import qk1.C12816m2;

/* renamed from: qk1.n2 */
public final class C12822n2 implements View.OnCreateContextMenuListener {

    /* renamed from: d */
    public final /* synthetic */ C12816m2.C12817a f36705d;

    public C12822n2(C12816m2.C12817a aVar) {
        this.f36705d = aVar;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 0, 0, this.f36705d.f44854d.getContext().getResources().getString(C0966R.string.f7944x1));
    }
}
