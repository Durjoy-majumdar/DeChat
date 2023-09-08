package rl1;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: rl1.q */
public final class C13072q implements RecyclerView.C16622o {

    /* renamed from: d */
    public final /* synthetic */ C13053n f37221d;

    public C13072q(C13053n nVar) {
        this.f37221d = nVar;
    }

    /* renamed from: c */
    public void mo126c(RecyclerView recyclerView, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryPanelWidget$initContent$2$2", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", this, array);
        C87412m.m108594g(recyclerView, "p0");
        C87412m.m108594g(motionEvent, "p1");
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryPanelWidget$initContent$2$2", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V");
    }

    /* renamed from: d */
    public void mo127d(boolean z) {
    }

    /* renamed from: e */
    public boolean mo6022e(RecyclerView recyclerView, MotionEvent motionEvent) {
        C87412m.m108594g(recyclerView, "rv");
        C87412m.m108594g(motionEvent, "motionEvent");
        this.f37221d.f37188x[0] = (int) motionEvent.getRawX();
        this.f37221d.f37188x[1] = (int) motionEvent.getRawY();
        return false;
    }
}
