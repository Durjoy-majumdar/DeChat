package ry1;

import android.view.View;
import android.widget.AbsListView;
import com.tencent.p014mm.plugin.game.p061ui.GameCenterListView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ry1.o */
public class C48140o implements AbsListView.OnScrollListener {

    /* renamed from: d */
    public final /* synthetic */ GameCenterListView f129037d;

    public C48140o(GameCenterListView gameCenterListView) {
        this.f129037d = gameCenterListView;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        View view;
        ArrayList arrayList = new ArrayList();
        arrayList.add(absListView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        arrayList.add(Integer.valueOf(i3));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameCenterListView$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        if (i == 0 && (view = this.f129037d.f113703p) != null && view.getTop() == 0) {
            this.f129037d.f113698h = true;
        } else {
            this.f129037d.f113698h = false;
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameCenterListView$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(absListView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameCenterListView$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameCenterListView$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
