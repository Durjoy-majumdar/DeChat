package com.tencent.p014mm.plugin.finder.view;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.finder.view.l8 */
public final class C56635l8 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ TestPreloadPreview f162354d;

    /* renamed from: com.tencent.mm.plugin.finder.view.l8$a */
    public static final class C56636a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ TestPreloadPreview f162355d;

        public C56636a(TestPreloadPreview testPreloadPreview) {
            this.f162355d = testPreloadPreview;
        }

        public final void run() {
            TestPreloadPreview testPreloadPreview = this.f162355d;
            DataBuffer<C0740i2> dataBuffer = testPreloadPreview.f162162h;
            if (dataBuffer != null) {
                Iterator<E> it = dataBuffer.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (((C0740i2) it.next()).getItemId() == testPreloadPreview.f162164j) {
                        break;
                    }
                    i++;
                }
                RecyclerView recyclerView = this.f162355d.getRecyclerView();
                if (i <= 0) {
                    i = 0;
                }
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i));
                RecyclerView recyclerView2 = recyclerView;
                C117292a.m165358d(recyclerView2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/TestPreloadPreview$onAttach$3$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
                recyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/finder/view/TestPreloadPreview$onAttach$3$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
                return;
            }
            C87412m.m108603p("data");
            throw null;
        }
    }

    public C56635l8(TestPreloadPreview testPreloadPreview) {
        this.f162354d = testPreloadPreview;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/TestPreloadPreview$onAttach$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            this.f162354d.f162174w.removeCallbacksAndMessages((Object) null);
        } else if (motionEvent.getAction() == 1) {
            this.f162354d.f162174w.removeCallbacksAndMessages((Object) null);
            TestPreloadPreview testPreloadPreview = this.f162354d;
            testPreloadPreview.f162174w.postDelayed(new C56636a(testPreloadPreview), 3000);
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/finder/view/TestPreloadPreview$onAttach$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
