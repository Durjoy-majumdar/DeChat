package com.tencent.p014mm.p136ui;

import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.p136ui.BaseActivity;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.o */
public class C74802o implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BaseActivity.C73015d f219934d;

    /* renamed from: e */
    public final /* synthetic */ BaseActivity f219935e;

    public C74802o(BaseActivity baseActivity, BaseActivity.C73015d dVar) {
        this.f219935e = baseActivity;
        this.f219934d = dVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/BaseActivity$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        MenuItem menuItem = this.f219935e.f214183s;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f219934d.f214205j;
        if (onMenuItemClickListener != null) {
            onMenuItemClickListener.onMenuItemClick(menuItem);
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/BaseActivity$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
