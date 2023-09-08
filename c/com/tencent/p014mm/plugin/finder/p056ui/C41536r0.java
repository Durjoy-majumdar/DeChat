package com.tencent.p014mm.plugin.finder.p056ui;

import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.plugin.finder.ui.r0 */
public final class C41536r0 implements View.OnCreateContextMenuListener {

    /* renamed from: d */
    public final /* synthetic */ FinderFansListUI f111844d;

    public C41536r0(FinderFansListUI finderFansListUI) {
        this.f111844d = finderFansListUI;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1001, 0, this.f111844d.getString(C0966R.string.d6d));
    }
}
