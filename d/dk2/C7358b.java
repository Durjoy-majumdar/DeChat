package dk2;

import android.content.Context;
import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.C0966R;

/* renamed from: dk2.b */
public final class C7358b implements View.OnCreateContextMenuListener {

    /* renamed from: d */
    public final /* synthetic */ Context f25485d;

    public C7358b(Context context) {
        this.f25485d = context;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1, 0, this.f25485d.getString(C0966R.string.f7944x1));
    }
}
