package yz2;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusLikeListFragment;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: yz2.l2 */
public final class C53695l2 implements RecyclerView.C16622o {

    /* renamed from: d */
    public final /* synthetic */ TextStatusLikeListFragment f150789d;

    public C53695l2(TextStatusLikeListFragment textStatusLikeListFragment) {
        this.f150789d = textStatusLikeListFragment;
    }

    /* renamed from: c */
    public void mo126c(RecyclerView recyclerView, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListFragment$handleDeleteOrClear$2", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", this, array);
        C87412m.m108594g(recyclerView, "p0");
        C87412m.m108594g(motionEvent, "p1");
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListFragment$handleDeleteOrClear$2", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V");
    }

    /* renamed from: d */
    public void mo127d(boolean z) {
    }

    /* renamed from: e */
    public boolean mo6022e(RecyclerView recyclerView, MotionEvent motionEvent) {
        C87412m.m108594g(recyclerView, "rv");
        C87412m.m108594g(motionEvent, "motionEvent");
        this.f150789d.f116943r[0] = (int) motionEvent.getRawX();
        this.f150789d.f116943r[1] = (int) motionEvent.getRawY();
        return false;
    }
}
