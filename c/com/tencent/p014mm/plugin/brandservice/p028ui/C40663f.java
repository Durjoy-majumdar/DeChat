package com.tencent.p014mm.plugin.brandservice.p028ui;

import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.brandservice.p028ui.EnterpriseBizContactListView;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.f */
public class C40663f implements View.OnCreateContextMenuListener {

    /* renamed from: d */
    public final /* synthetic */ int f109249d;

    /* renamed from: e */
    public final /* synthetic */ EnterpriseBizContactListView.C40614e f109250e;

    public C40663f(EnterpriseBizContactListView.C40614e eVar, int i) {
        this.f109250e = eVar;
        this.f109249d = i;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(this.f109249d, 1, 0, C0966R.string.cb7);
    }
}
