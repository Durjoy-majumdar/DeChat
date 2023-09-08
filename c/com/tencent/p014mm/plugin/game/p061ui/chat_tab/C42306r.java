package com.tencent.p014mm.plugin.game.p061ui.chat_tab;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.r */
public class C42306r implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: d */
    public final /* synthetic */ ViewGroup f114385d;

    /* renamed from: e */
    public final /* synthetic */ MMGameWebTabUI f114386e;

    public C42306r(MMGameWebTabUI mMGameWebTabUI, ViewGroup viewGroup) {
        this.f114386e = mMGameWebTabUI;
        this.f114385d = viewGroup;
    }

    public void onChildViewAdded(View view, View view2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(view2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/chat_tab/MMGameWebTabUI$6", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewAdded", "(Landroid/view/View;Landroid/view/View;)V", this, array);
        if ((view2.getTag() instanceof String) && "game_float_view_tag".equalsIgnoreCase((String) view2.getTag())) {
            int indexOfChild = this.f114385d.indexOfChild(view2);
            Log.m105925i("MicroMsg.MMGameWebTabUI", "float page index2:%d", Integer.valueOf(indexOfChild));
            if (indexOfChild >= 0) {
                this.f114385d.removeView(this.f114386e.f114341h);
                this.f114385d.addView(this.f114386e.f114341h, indexOfChild - 1);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/chat_tab/MMGameWebTabUI$6", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewAdded", "(Landroid/view/View;Landroid/view/View;)V");
    }

    public void onChildViewRemoved(View view, View view2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(view2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/chat_tab/MMGameWebTabUI$6", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewRemoved", "(Landroid/view/View;Landroid/view/View;)V", this, array);
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/chat_tab/MMGameWebTabUI$6", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewRemoved", "(Landroid/view/View;Landroid/view/View;)V");
    }
}
