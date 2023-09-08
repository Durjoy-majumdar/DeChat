package np1;

import ak1.C54108o;
import android.view.View;
import com.tencent.p014mm.C0966R;
import di3.C7335d;
import di3.C86312j;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import nj3.C76912y0;
import rx3.C13598b0;

/* renamed from: np1.n */
public final class C11258n implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C61817a f33190d;

    /* renamed from: e */
    public final /* synthetic */ View f33191e;

    /* renamed from: f */
    public final /* synthetic */ View f33192f;

    /* renamed from: np1.n$a */
    public static final class C11259a extends C87413o implements C32228q<Boolean, Integer, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ View f33193d;

        /* renamed from: e */
        public final /* synthetic */ View f33194e;

        /* renamed from: f */
        public final /* synthetic */ View f33195f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11259a(View view, View view2, View view3) {
            super(3);
            this.f33193d = view;
            this.f33194e = view2;
            this.f33195f = view3;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            ((Number) obj2).intValue();
            ((Number) obj3).intValue();
            if (booleanValue) {
                View view = this.f33193d;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal$onClickReplayOptionView$1$1$3$1", "invoke", "(ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal$onClickReplayOptionView$1$1$3$1", "invoke", "(ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view2 = this.f33194e;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal$onClickReplayOptionView$1$1$3$1", "invoke", "(ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal$onClickReplayOptionView$1$1$3$1", "invoke", "(ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                C76912y0.m92767f(this.f33195f.getContext(), this.f33195f.getContext().getString(C0966R.string.e3m));
            }
            return C13598b0.f38549a;
        }
    }

    public C11258n(C61817a aVar, View view, View view2) {
        this.f33190d = aVar;
        this.f33191e = view;
        this.f33192f = view2;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal$onClickReplayOptionView$1$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C7335d c = C86312j.m106911c(C54108o.class);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C54108o.Ux0((C54108o) c, 1, 1, 0, 0, 12, (Object) null);
        C61817a.m72533b(this.f33190d, 1, 1, new C11259a(this.f33191e, this.f33192f, view));
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal$onClickReplayOptionView$1$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
