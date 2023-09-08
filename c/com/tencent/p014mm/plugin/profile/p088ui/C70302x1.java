package com.tencent.p014mm.plugin.profile.p088ui;

import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.plugin.profile.ui.x1 */
public class C70302x1 implements View.OnCreateContextMenuListener {

    /* renamed from: d */
    public final /* synthetic */ NormalProfileHeaderPreference f203080d;

    public C70302x1(NormalProfileHeaderPreference normalProfileHeaderPreference) {
        this.f203080d = normalProfileHeaderPreference;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(this.f203080d.f202574N.getString(C0966R.string.f7936wt));
    }
}
