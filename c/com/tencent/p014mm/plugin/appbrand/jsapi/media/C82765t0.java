package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import android.content.Context;
import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.t0 */
public class C82765t0 implements View.OnCreateContextMenuListener {

    /* renamed from: d */
    public final /* synthetic */ Context f242097d;

    public C82765t0(JsApiChooseMedia jsApiChooseMedia, Context context) {
        this.f242097d = context;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1, 0, this.f242097d.getString(C0966R.string.f7980y8));
        contextMenu.add(0, 2, 1, this.f242097d.getString(C0966R.string.f7989yh));
    }
}
