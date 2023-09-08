package com.tencent.p014mm.p136ui;

import android.view.View;
import com.tencent.p014mm.p136ui.BaseActivity;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.p */
public class C74806p implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ BaseActivity.C73015d f219939d;

    /* renamed from: e */
    public final /* synthetic */ BaseActivity f219940e;

    public C74806p(BaseActivity baseActivity, BaseActivity.C73015d dVar) {
        this.f219940e = baseActivity;
        this.f219939d = dVar;
    }

    public boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/BaseActivity$6", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        BaseActivity baseActivity = this.f219940e;
        BaseActivity.C73015d dVar = this.f219939d;
        int i = BaseActivity.f214170y;
        baseActivity.getClass();
        View.OnLongClickListener onLongClickListener = dVar.f214206k;
        boolean onLongClick = onLongClickListener != null ? onLongClickListener.onLongClick(view) : false;
        C117292a.m165362h(onLongClick, this, "com/tencent/mm/ui/BaseActivity$6", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return onLongClick;
    }
}
