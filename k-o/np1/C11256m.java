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

/* renamed from: np1.m */
public final class C11256m implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C61817a f33184d;

    /* renamed from: e */
    public final /* synthetic */ View f33185e;

    /* renamed from: f */
    public final /* synthetic */ View f33186f;

    /* renamed from: np1.m$a */
    public static final class C11257a extends C87413o implements C32228q<Boolean, Integer, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ View f33187d;

        /* renamed from: e */
        public final /* synthetic */ View f33188e;

        /* renamed from: f */
        public final /* synthetic */ View f33189f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11257a(View view, View view2, View view3) {
            super(3);
            this.f33187d = view;
            this.f33188e = view2;
            this.f33189f = view3;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            ((Number) obj2).intValue();
            ((Number) obj3).intValue();
            if (booleanValue) {
                View view = this.f33187d;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal$onClickReplayOptionView$1$1$2$1", "invoke", "(ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal$onClickReplayOptionView$1$1$2$1", "invoke", "(ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view3 = this.f33188e;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal$onClickReplayOptionView$1$1$2$1", "invoke", "(ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal$onClickReplayOptionView$1$1$2$1", "invoke", "(ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                C76912y0.m92767f(this.f33189f.getContext(), this.f33189f.getContext().getString(C0966R.string.e3m));
            }
            return C13598b0.f38549a;
        }
    }

    public C11256m(C61817a aVar, View view, View view2) {
        this.f33184d = aVar;
        this.f33185e = view;
        this.f33186f = view2;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal$onClickReplayOptionView$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C7335d c = C86312j.m106911c(C54108o.class);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C54108o.Ux0((C54108o) c, 1, 0, 0, 0, 12, (Object) null);
        C61817a.m72533b(this.f33184d, 1, 0, new C11257a(this.f33185e, this.f33186f, view));
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal$onClickReplayOptionView$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
