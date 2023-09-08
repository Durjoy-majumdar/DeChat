package mf1;

import android.view.View;
import android.view.ViewGroup;
import fy3.C32224a;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: mf1.w */
public final class C10876w implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f32470d;

    /* renamed from: e */
    public final /* synthetic */ C10882y f32471e;

    /* renamed from: f */
    public final /* synthetic */ View f32472f;

    /* renamed from: g */
    public final /* synthetic */ View f32473g;

    /* renamed from: mf1.w$a */
    public static final class C10877a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ View f32474d;

        /* renamed from: e */
        public final /* synthetic */ View f32475e;

        /* renamed from: f */
        public final /* synthetic */ View f32476f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10877a(View view, View view2, View view3) {
            super(0);
            this.f32474d = view;
            this.f32475e = view2;
            this.f32476f = view3;
        }

        public Object invoke() {
            View view = this.f32474d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver$handleExpand$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver$handleExpand$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = this.f32475e;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(Float.valueOf(1.0f));
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver$handleExpand$1$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver$handleExpand$1$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view4 = this.f32476f;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(8);
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver$handleExpand$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver$handleExpand$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view5 = this.f32475e;
            if (view5 instanceof ViewGroup) {
                int childCount = ((ViewGroup) view5).getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = ((ViewGroup) this.f32475e).getChildAt(i);
                    if (childAt != null) {
                        C9556a aVar4 = new C9556a();
                        aVar4.mo10233c(Float.valueOf(0.0f));
                        View view6 = childAt;
                        C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver$handleExpand$1$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        childAt.setAlpha(((Float) aVar4.mo10231a(0)).floatValue());
                        C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver$handleExpand$1$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        childAt.animate().alpha(1.0f).setDuration(250).start();
                    }
                }
            }
            View view7 = this.f32476f;
            if (view7 instanceof ViewGroup) {
                int childCount2 = ((ViewGroup) view7).getChildCount();
                for (int i2 = 0; i2 < childCount2; i2++) {
                    View childAt2 = ((ViewGroup) this.f32476f).getChildAt(i2);
                    if (childAt2 != null) {
                        C9556a aVar5 = new C9556a();
                        aVar5.mo10233c(Float.valueOf(1.0f));
                        View view8 = childAt2;
                        C117292a.m165358d(view8, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver$handleExpand$1$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        childAt2.setAlpha(((Float) aVar5.mo10231a(0)).floatValue());
                        C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver$handleExpand$1$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C10876w(View view, C10882y yVar, View view2, View view3) {
        this.f32470d = view;
        this.f32471e = yVar;
        this.f32472f = view2;
        this.f32473g = view3;
    }

    public final void run() {
        View view = this.f32470d;
        if (view instanceof ViewGroup) {
            int childCount = ((ViewGroup) view).getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = ((ViewGroup) this.f32470d).getChildAt(i);
                if (childAt != null) {
                    childAt.animate().alpha(0.0f).setDuration(250).start();
                }
            }
        }
        C10882y yVar = this.f32471e;
        View view2 = this.f32470d;
        View view3 = this.f32472f;
        yVar.mo12513v(view2, view3, 250, new C10877a(this.f32473g, view3, view2));
    }
}
