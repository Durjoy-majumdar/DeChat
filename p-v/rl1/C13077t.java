package rl1;

import android.content.Context;
import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.C0966R;

/* renamed from: rl1.t */
public final class C13077t implements View.OnCreateContextMenuListener {

    /* renamed from: d */
    public final /* synthetic */ Context f37231d;

    public C13077t(Context context) {
        this.f37231d = context;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1000, 0, this.f37231d.getResources().getString(C0966R.string.e7u));
    }
}
