package com.tencent.p014mm.plugin.finder.view;

import android.animation.Animator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.finder.view.e8 */
public final class C56601e8 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ View f162271d;

    /* renamed from: e */
    public final /* synthetic */ View f162272e;

    /* renamed from: f */
    public final /* synthetic */ View f162273f;

    /* renamed from: g */
    public final /* synthetic */ TestPreloadPreview f162274g;

    /* renamed from: com.tencent.mm.plugin.finder.view.e8$a */
    public static final class C56602a implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ TestPreloadPreview f162275d;

        public C56602a(TestPreloadPreview testPreloadPreview) {
            this.f162275d = testPreloadPreview;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            this.f162275d.getRecyclerView().setLayoutFrozen(true);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.e8$b */
    public static final class C56603b implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ View f162276d;

        /* renamed from: e */
        public final /* synthetic */ TestPreloadPreview f162277e;

        public C56603b(View view, TestPreloadPreview testPreloadPreview) {
            this.f162276d = view;
            this.f162277e = testPreloadPreview;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            this.f162276d.setTranslationX(0.0f);
            this.f162277e.getRecyclerView().setLayoutFrozen(false);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.e8$c */
    public static final class C56604c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ TestPreloadPreview f162278d;

        public C56604c(TestPreloadPreview testPreloadPreview) {
            this.f162278d = testPreloadPreview;
        }

        public final void run() {
            TestPreloadPreview testPreloadPreview = this.f162278d;
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
                RecyclerView.LayoutManager layoutManager = this.f162278d.getRecyclerView().getLayoutManager();
                C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int max = Math.max(0, i);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                aVar.mo10233c(Integer.valueOf(max));
                LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
                C117292a.m165358d(linearLayoutManager2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/TestPreloadPreview$clickListener$1$3", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                linearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                C117292a.m165359e(linearLayoutManager2, "com/tencent/mm/plugin/finder/view/TestPreloadPreview$clickListener$1$3", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                return;
            }
            C87412m.m108603p("data");
            throw null;
        }
    }

    public C56601e8(View view, View view2, View view3, TestPreloadPreview testPreloadPreview) {
        this.f162271d = view;
        this.f162272e = view2;
        this.f162273f = view3;
        this.f162274g = testPreloadPreview;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/TestPreloadPreview$clickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Object tag = this.f162271d.getTag();
        Boolean bool = Boolean.TRUE;
        if (C87412m.m108589b(tag, bool)) {
            this.f162272e.animate().cancel();
            View view2 = this.f162272e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(0.0f));
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/TestPreloadPreview$clickListener$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/view/TestPreloadPreview$clickListener$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            this.f162272e.animate().alpha(1.0f).setDuration(360).start();
            this.f162271d.animate().cancel();
            this.f162271d.animate().alpha(0.0f).setDuration(360).start();
            this.f162273f.animate().cancel();
            this.f162273f.animate().translationX(-this.f162274g.getTranslateOffset()).setListener(new C56602a(this.f162274g)).setInterpolator(new DecelerateInterpolator(1.6f)).setDuration(250).start();
            this.f162271d.setTag(Boolean.FALSE);
        } else {
            this.f162271d.animate().cancel();
            View view4 = this.f162271d;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(Float.valueOf(0.0f));
            View view5 = view4;
            C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/TestPreloadPreview$clickListener$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view4.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/view/TestPreloadPreview$clickListener$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            this.f162271d.animate().alpha(1.0f).setDuration(360).start();
            this.f162272e.animate().cancel();
            this.f162272e.animate().alpha(0.0f).setDuration(360).start();
            this.f162273f.animate().cancel();
            this.f162273f.animate().translationX(0.0f).setListener(new C56603b(this.f162273f, this.f162274g)).setInterpolator(new DecelerateInterpolator(1.6f)).setDuration(250).start();
            TestPreloadPreview testPreloadPreview = this.f162274g;
            testPreloadPreview.f162174w.postDelayed(new C56604c(testPreloadPreview), 20);
            this.f162271d.setTag(bool);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/TestPreloadPreview$clickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
