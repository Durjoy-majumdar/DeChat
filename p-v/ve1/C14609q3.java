package ve1;

import android.view.View;
import cm1.C0758o0;
import com.tencent.p014mm.C0966R;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import jq3.C60896i;
import k20.C60958c;
import k20.C9556a;
import kf1.C9878n9;

/* renamed from: ve1.q3 */
public class C14609q3 extends C60896i<C0758o0> {

    /* renamed from: e */
    public static final C14610a f40444e = new C14610a((C8480h) null);

    /* renamed from: f */
    public static boolean[] f40445f = new boolean[3];

    /* renamed from: ve1.q3$a */
    public static final class C14610a {
        public C14610a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo13829a(View view, C9878n9 n9Var, int i) {
            View view2 = view;
            int i2 = i;
            C87412m.m108594g(n9Var, "viewCallback");
            boolean[] zArr = C14609q3.f40445f;
            if (zArr[i2 != 1 ? i2 != 3 ? (char) 2 : 0 : 1]) {
                if (view2 != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedTipConvert$Companion", "changeToItemView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/FinderTimelineContract$ViewCallback;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderFeedTipConvert$Companion", "changeToItemView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/FinderTimelineContract$ViewCallback;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                View findViewById = n9Var.mo10415b().findViewById(C0966R.C0970id.e7r);
                if (findViewById != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    C117292a.m165358d(findViewById, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedTipConvert$Companion", "changeToItemView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/FinderTimelineContract$ViewCallback;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/convert/FinderFeedTipConvert$Companion", "changeToItemView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/FinderTimelineContract$ViewCallback;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                zArr[i2 != 1 ? i2 != 3 ? (char) 2 : 0 : 1] = false;
            }
        }
    }
}
