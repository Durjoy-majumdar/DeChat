package de3;

import android.view.ContextMenu;
import android.view.View;
import java.util.List;

/* renamed from: de3.w */
public class C7318w implements View.OnCreateContextMenuListener {

    /* renamed from: d */
    public final /* synthetic */ List f25433d;

    public C7318w(List list) {
        this.f25433d = list;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        for (String add : this.f25433d) {
            contextMenu.add(0, 0, 0, add);
        }
    }
}
