package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.C0966R;
import lg3.C76697h;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$z */
public class MsgHandler$$z implements View.OnCreateContextMenuListener {

    /* renamed from: d */
    public final /* synthetic */ MsgHandler f22874d;

    public MsgHandler$$z(MsgHandler msgHandler) {
        this.f22874d = msgHandler;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1, 0, C76697h.m92348a(this.f22874d.f22697d).getString(C0966R.string.f7980y8));
        contextMenu.add(0, 2, 1, C76697h.m92348a(this.f22874d.f22697d).getString(C0966R.string.f7989yh));
    }
}
