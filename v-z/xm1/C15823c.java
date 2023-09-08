package xm1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.nearby.newlivesquare.FinderLiveSquareNewEntranceUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: xm1.c */
public final class C15823c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveSquareNewEntranceUI f42630d;

    public C15823c(FinderLiveSquareNewEntranceUI finderLiveSquareNewEntranceUI) {
        this.f42630d = finderLiveSquareNewEntranceUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/newlivesquare/FinderLiveSquareNewEntranceUI$initActionBar$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f42630d.onBackPressed();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/FinderLiveSquareNewEntranceUI$initActionBar$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
