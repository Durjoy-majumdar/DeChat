package np1;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShoppingPanel;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: np1.e */
public final class C61858e implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ C61817a f175884d;

    public C61858e(C61817a aVar) {
        this.f175884d = aVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal$initPortraitShoppingList$4$1$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 2) {
            FinderLiveShoppingPanel finderLiveShoppingPanel = this.f175884d.f175780p;
            if (finderLiveShoppingPanel != null) {
                finderLiveShoppingPanel.mo78812i();
            } else {
                C87412m.m108603p("contentGroup");
                throw null;
            }
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal$initPortraitShoppingList$4$1$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
