package com.tencent.p014mm.p136ui;

import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.p136ui.BaseActivity;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.n */
public class C74798n implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BaseActivity.C73015d f219928d;

    /* renamed from: e */
    public final /* synthetic */ BaseActivity f219929e;

    public C74798n(BaseActivity baseActivity, BaseActivity.C73015d dVar) {
        this.f219929e = baseActivity;
        this.f219928d = dVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/BaseActivity$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        MenuItem menuItem = this.f219929e.f214182r;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f219928d.f214205j;
        if (onMenuItemClickListener != null) {
            onMenuItemClickListener.onMenuItemClick(menuItem);
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/BaseActivity$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
