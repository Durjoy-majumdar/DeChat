package com.tencent.p014mm.plugin.brandservice.p028ui;

import android.content.Context;
import android.content.DialogInterface;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.brandservice.p028ui.EnterpriseBizContactListView;
import com.tencent.p014mm.sdk.platformtools.Util;
import nj3.C11184p0;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.g */
public class C40664g implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ EnterpriseBizContactListView.C40614e f109251d;

    public C40664g(EnterpriseBizContactListView.C40614e eVar) {
        this.f109251d = eVar;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (!Util.isNullOrNil(this.f109251d.f109105d) && menuItem.getItemId() == 1) {
            EnterpriseBizContactListView.C40614e eVar = this.f109251d;
            String str = eVar.f109105d;
            EnterpriseBizContactListView enterpriseBizContactListView = eVar.f109108g.get();
            if (enterpriseBizContactListView != null) {
                Context context = enterpriseBizContactListView.getContext();
                C76879j.m92707A(context, context.getString(C0966R.string.cay), "", context.getString(C0966R.string.cax), context.getString(C0966R.string.f7926wf), new C40665h(eVar, str, context), (DialogInterface.OnClickListener) null);
            }
        }
    }
}
