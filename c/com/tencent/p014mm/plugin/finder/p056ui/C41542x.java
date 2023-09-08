package com.tencent.p014mm.plugin.finder.p056ui;

import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.plugin.finder.ui.x */
public final class C41542x implements View.OnCreateContextMenuListener {

    /* renamed from: d */
    public final /* synthetic */ FinderBlackListUI f111854d;

    public C41542x(FinderBlackListUI finderBlackListUI) {
        this.f111854d = finderBlackListUI;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1001, 0, this.f111854d.getString(C0966R.string.bon));
    }
}
