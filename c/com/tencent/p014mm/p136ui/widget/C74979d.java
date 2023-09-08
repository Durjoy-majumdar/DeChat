package com.tencent.p014mm.p136ui.widget;

import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.p136ui.tools.C106742j1;
import com.tencent.p014mm.p136ui.widget.WXActionMenuView;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.widget.d */
public class C74979d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ boolean f220545d;

    /* renamed from: e */
    public final /* synthetic */ C106742j1.C74846m f220546e;

    /* renamed from: f */
    public final /* synthetic */ WXActionMenuView.C74962b f220547f;

    /* renamed from: g */
    public final /* synthetic */ Activity f220548g;

    /* renamed from: h */
    public final /* synthetic */ MenuItem f220549h;

    public C74979d(boolean z, C106742j1.C74846m mVar, WXActionMenuView.C74962b bVar, Activity activity, MenuItem menuItem) {
        this.f220545d = z;
        this.f220546e = mVar;
        this.f220547f = bVar;
        this.f220548g = activity;
        this.f220549h = menuItem;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/WXActionMenuView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105925i("MicroMsg.WXActionMenuView", "makeMMActionSearchMenuView, onclick, isSearchViewIsSameUI: %s.", Boolean.valueOf(this.f220545d));
        if (this.f220545d) {
            C106742j1.C74846m mVar = this.f220546e;
            if (mVar != null) {
                mVar.expandActionView();
            }
        } else {
            WXActionMenuView.C74962b bVar = this.f220547f;
            if (bVar != null) {
                bVar.mo104358a(this.f220548g, this.f220549h);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/widget/WXActionMenuView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
