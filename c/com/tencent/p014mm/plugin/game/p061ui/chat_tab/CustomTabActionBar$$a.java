package com.tencent.p014mm.plugin.game.p061ui.chat_tab;

import android.app.Activity;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.CustomTabActionBar$$a */
public final /* synthetic */ class CustomTabActionBar$$a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CustomTabActionBar f114213d;

    public /* synthetic */ CustomTabActionBar$$a(CustomTabActionBar customTabActionBar) {
        this.f114213d = customTabActionBar;
    }

    public final void onClick(View view) {
        CustomTabActionBar customTabActionBar = this.f114213d;
        int i = CustomTabActionBar.f114209g;
        customTabActionBar.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/chat_tab/CustomTabActionBar", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", customTabActionBar, array);
        ((Activity) customTabActionBar.f114210d).finish();
        C117292a.m165361g(customTabActionBar, "com/tencent/mm/plugin/game/ui/chat_tab/CustomTabActionBar", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
