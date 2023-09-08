package com.tencent.p014mm.plugin.finder.p056ui;

import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.plugin.finder.ui.z */
public final class C3893z implements View.OnCreateContextMenuListener {

    /* renamed from: d */
    public final /* synthetic */ FinderBlockListSearchUI f17473d;

    public C3893z(FinderBlockListSearchUI finderBlockListSearchUI) {
        this.f17473d = finderBlockListSearchUI;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        if (contextMenu != null) {
            this.f17473d.getClass();
            contextMenu.add(0, 0, 0, C0966R.string.ecc);
        }
    }
}
