package eq1;

import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.C0966R;

/* renamed from: eq1.f */
public final class C58671f implements View.OnCreateContextMenuListener {

    /* renamed from: d */
    public final /* synthetic */ C58666b f167967d;

    public C58671f(C58666b bVar) {
        this.f167967d = bVar;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1, 0, this.f167967d.f167947a.getString(C0966R.string.i4e));
        contextMenu.add(0, 2, 0, this.f167967d.f167947a.getString(C0966R.string.b7o));
        contextMenu.add(0, 3, 0, this.f167967d.f167947a.getString(C0966R.string.f8160q1));
    }
}
