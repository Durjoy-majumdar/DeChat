package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.a0 */
public final class C82691a0 implements View.OnCreateContextMenuListener {

    /* renamed from: d */
    public final /* synthetic */ C82777y f241973d;

    public C82691a0(C82777y yVar) {
        this.f241973d = yVar;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1, 0, this.f241973d.f242124a.getContext().getString(C0966R.string.f7980y8));
        contextMenu.add(0, 2, 1, this.f241973d.f242124a.getContext().getString(C0966R.string.f7989yh));
    }
}
