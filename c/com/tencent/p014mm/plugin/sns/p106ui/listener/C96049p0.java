package com.tencent.p014mm.plugin.sns.p106ui.listener;

import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.sns.ui.listener.p0 */
public abstract class C96049p0 implements View.OnCreateContextMenuListener {
    /* renamed from: a */
    public abstract void mo133570a(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo);

    /* renamed from: b */
    public abstract boolean mo133571b(View view);

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        SnsMethodCalculate.markStartTimeMs("onCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineOnCreateContextMenuListener");
        if (mo133571b(view)) {
            mo133570a(contextMenu, view, contextMenuInfo);
        } else {
            Log.m105920e("MicroMsg.TimelineOnCreateContextMenuListener", "onMMCreateContextMenu error");
        }
        SnsMethodCalculate.markEndTimeMs("onCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineOnCreateContextMenuListener");
    }
}
