package com.tencent.p014mm.plugin.game.p061ui.chat_tab;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.p */
public class C42304p implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: d */
    public final /* synthetic */ ViewGroup f114383d;

    /* renamed from: e */
    public final /* synthetic */ GameWebTabUI f114384e;

    public C42304p(GameWebTabUI gameWebTabUI, ViewGroup viewGroup) {
        this.f114384e = gameWebTabUI;
        this.f114383d = viewGroup;
    }

    public void onChildViewAdded(View view, View view2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(view2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/chat_tab/GameWebTabUI$7", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewAdded", "(Landroid/view/View;Landroid/view/View;)V", this, array);
        if ((view2.getTag() instanceof String) && "game_float_view_tag".equalsIgnoreCase((String) view2.getTag())) {
            int indexOfChild = this.f114383d.indexOfChild(view2);
            Log.m105925i("MicroMsg.GameWebTabUI", "float page index2:%d", Integer.valueOf(indexOfChild));
            if (indexOfChild >= 0) {
                this.f114383d.removeView(this.f114384e.f114317j);
                this.f114383d.addView(this.f114384e.f114317j, indexOfChild - 1);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/chat_tab/GameWebTabUI$7", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewAdded", "(Landroid/view/View;Landroid/view/View;)V");
    }

    public void onChildViewRemoved(View view, View view2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(view2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/chat_tab/GameWebTabUI$7", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewRemoved", "(Landroid/view/View;Landroid/view/View;)V", this, array);
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/chat_tab/GameWebTabUI$7", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewRemoved", "(Landroid/view/View;Landroid/view/View;)V");
    }
}
