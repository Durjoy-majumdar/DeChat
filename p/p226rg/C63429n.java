package p226rg;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.album.p836ui.preview.uic.AlbumPreviewUIC;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import p849e3.C58521d;

/* renamed from: rg.n */
public final class C63429n implements RecyclerView.C16622o {

    /* renamed from: d */
    public final /* synthetic */ AlbumPreviewUIC f179914d;

    public C63429n(AlbumPreviewUIC albumPreviewUIC) {
        this.f179914d = albumPreviewUIC;
    }

    /* renamed from: c */
    public void mo126c(RecyclerView recyclerView, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/album/ui/preview/uic/AlbumPreviewUIC$observeState$1$4", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", this, array);
        C87412m.m108594g(recyclerView, "rv");
        C87412m.m108594g(motionEvent, "e");
        C117292a.m165361g(this, "com/tencent/mm/album/ui/preview/uic/AlbumPreviewUIC$observeState$1$4", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V");
    }

    /* renamed from: d */
    public void mo127d(boolean z) {
    }

    /* renamed from: e */
    public boolean mo6022e(RecyclerView recyclerView, MotionEvent motionEvent) {
        C87412m.m108594g(recyclerView, "rv");
        C87412m.m108594g(motionEvent, "e");
        C58521d dVar = this.f179914d.f154715j;
        if (dVar != null) {
            if (dVar != null && dVar.mo83434a(motionEvent)) {
                return true;
            }
        }
        return false;
    }
}
