package op1;

import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.C0966R;

/* renamed from: op1.x */
public final class C62117x implements View.OnCreateContextMenuListener {

    /* renamed from: d */
    public final /* synthetic */ C62084h f176635d;

    public C62117x(C62084h hVar) {
        this.f176635d = hVar;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 100, 0, this.f176635d.f176531e.getResources().getString(C0966R.string.e8l));
        contextMenu.add(0, 101, 1, this.f176635d.f176531e.getResources().getString(C0966R.string.e7u));
    }
}
