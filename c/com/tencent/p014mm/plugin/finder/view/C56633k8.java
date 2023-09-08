package com.tencent.p014mm.plugin.finder.view;

import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import gy3.C87412m;
import j20.C117292a;
import java.util.Iterator;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.finder.view.k8 */
public final class C56633k8 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ TestPreloadPreview f162352d;

    public C56633k8(TestPreloadPreview testPreloadPreview) {
        this.f162352d = testPreloadPreview;
    }

    public final void run() {
        boolean z;
        int i;
        TestPreloadPreview testPreloadPreview = this.f162352d;
        DataBuffer<C0740i2> dataBuffer = testPreloadPreview.f162162h;
        if (dataBuffer != null) {
            Iterator<E> it = dataBuffer.iterator();
            int i2 = 0;
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (((C0740i2) it.next()).getItemId() == testPreloadPreview.f162164j) {
                    break;
                }
                i2++;
            }
            if (i2 >= 0) {
                TestPreloadPreview testPreloadPreview2 = this.f162352d;
                if (testPreloadPreview2.f162165n > i2) {
                    z = false;
                }
                testPreloadPreview2.f162165n = i2;
                RecyclerView recyclerView = testPreloadPreview2.getRecyclerView();
                if (z) {
                    int i3 = i2 + 3;
                    DataBuffer<C0740i2> dataBuffer2 = this.f162352d.f162162h;
                    if (dataBuffer2 != null) {
                        i = Math.min(i3, dataBuffer2.size());
                    } else {
                        C87412m.m108603p("data");
                        throw null;
                    }
                } else {
                    i = Math.max(i2 - 3, 0);
                }
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i));
                RecyclerView recyclerView2 = recyclerView;
                C117292a.m165358d(recyclerView2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/TestPreloadPreview$observer$1$onEventHappen$2$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
                recyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/finder/view/TestPreloadPreview$observer$1$onEventHappen$2$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
                return;
            }
            return;
        }
        C87412m.m108603p("data");
        throw null;
    }
}
