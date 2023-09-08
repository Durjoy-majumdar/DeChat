package com.tencent.p014mm.plugin.appbrand.jsapi.auth.entity;

import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.entity.i */
public final class C1617i implements View.OnCreateContextMenuListener {

    /* renamed from: d */
    public final /* synthetic */ View f11230d;

    public C1617i(View view) {
        this.f11230d = view;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1, 0, this.f11230d.getContext().getResources().getString(C0966R.string.a4w));
    }
}
