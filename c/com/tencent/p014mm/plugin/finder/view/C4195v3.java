package com.tencent.p014mm.plugin.finder.view;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.p056ui.FinderPostAtUI;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import er1.C58684b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.view.v3 */
public final class C4195v3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MMActivity f18483d;

    /* renamed from: e */
    public final /* synthetic */ int f18484e;

    public C4195v3(MMActivity mMActivity, int i) {
        this.f18483d = mMActivity;
        this.f18484e = i;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderPostFooter$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        intent.putExtra("key_scene", 1);
        MMActivity mMActivity = this.f18483d;
        int i = this.f18484e;
        ((C58684b) C86312j.m106911c(C58684b.class)).getClass();
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        intent.setClass(mMActivity, FinderPostAtUI.class);
        mMActivity.startActivityForResult(intent, i);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderPostFooter$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
