package ef1;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ef1.g */
public final class C58563g extends RecyclerView.C0130p {

    /* renamed from: d */
    public final /* synthetic */ C58556f f167635d;

    public C58563g(C58556f fVar) {
        this.f167635d = fVar;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/event/base/FinderFeedFlowEventSubscriber$getBehavior$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        C87412m.m108594g(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        C58556f fVar = this.f167635d;
        if (fVar.f167610d.isEmpty()) {
            recyclerView.getGlobalVisibleRect(fVar.f167610d);
        }
        if (fVar.f167615i != i) {
            fVar.f167615i = i;
        }
        fVar.mo83457f(recyclerView, i);
        if (fVar.f167615i == 0) {
            fVar.f167618l = new int[5];
            fVar.f167617k = 0;
            fVar.f167619m = 0;
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/event/base/FinderFeedFlowEventSubscriber$getBehavior$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        RecyclerView.LayoutManager layoutManager;
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/event/base/FinderFeedFlowEventSubscriber$getBehavior$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        C87412m.m108594g(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        C58556f fVar = this.f167635d;
        if (fVar.f167614h && (layoutManager = recyclerView.getLayoutManager()) != null) {
            if (!layoutManager.canScrollHorizontally()) {
                i = i2;
            }
            int abs = Math.abs(i);
            fVar.f167616j += abs;
            int[] iArr = fVar.f167618l;
            int i3 = fVar.f167617k;
            iArr[i3] = abs;
            fVar.f167617k = (i3 + 1) % iArr.length;
            int i4 = fVar.f167615i;
            if (i4 == 1) {
                int i5 = fVar.f167619m + i;
                fVar.f167619m = i5;
                if (Math.abs(i5) > fVar.f167609c / 2) {
                    Log.m105924i(fVar.f167608b, "pushEvent handleOnScrolled draggingDistance:" + fVar.f167619m + " offset:" + i + " heightPixels:" + fVar.f167609c);
                    fVar.mo83457f(recyclerView, 3);
                    fVar.f167619m = 0;
                }
            } else if (i4 == 2) {
                double d = 0.0d;
                double d2 = 0.0d;
                int i6 = 0;
                for (int i7 : iArr) {
                    d2 += (double) i7;
                    i6++;
                }
                double d3 = i6 == 0 ? Double.NaN : d2 / ((double) i6);
                int[] iArr2 = fVar.f167618l;
                for (int i8 : iArr2) {
                    d += Math.pow(((double) i8) - d3, (double) 2);
                }
                double length = d / ((double) iArr2.length);
                if (d3 < 50.0d && length < 50.0d && fVar.f167616j > fVar.f167613g * 5) {
                    Log.m105924i(fVar.f167608b, "publish LOW_SPEED_FLING");
                    fVar.mo83457f(recyclerView, 8);
                    fVar.f167616j = 0;
                }
                fVar.f167619m = 0;
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/event/base/FinderFeedFlowEventSubscriber$getBehavior$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
