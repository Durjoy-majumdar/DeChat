package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.view.ContextMenu;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.i1 */
public class C6180i1 implements View.OnCreateContextMenuListener {

    /* renamed from: d */
    public final /* synthetic */ ArrayList f22650d;

    public C6180i1(C43977g1 g1Var, ArrayList arrayList) {
        this.f22650d = arrayList;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Iterator it = this.f22650d.iterator();
        while (it.hasNext()) {
            contextMenu.add((String) it.next());
        }
    }
}
