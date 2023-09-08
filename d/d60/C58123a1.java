package d60;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import i60.C33210j;
import i60.C60253g;
import j20.C117292a;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: d60.a1 */
public final class C58123a1 extends C87413o implements C32226l<List<? extends C33210j>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C58229y0 f166291d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58123a1(C58229y0 y0Var) {
        super(1);
        this.f166291d = y0Var;
    }

    public Object invoke(Object obj) {
        List list = (List) obj;
        C87412m.m108594g(list, LocaleUtil.ITALIAN);
        if (list.isEmpty()) {
            C58229y0 y0Var = this.f166291d;
            View view = y0Var.f166746g;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/live/plugin/LiveShareRoomsPlugin", "onNoRooms", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/live/plugin/LiveShareRoomsPlugin", "onNoRooms", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            y0Var.f166747h.setVisibility(0);
            y0Var.f166749j.setVisibility(8);
        } else {
            C58229y0 y0Var2 = this.f166291d;
            View view2 = y0Var2.f166746g;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/live/plugin/LiveShareRoomsPlugin", "onUpdateRooms", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/live/plugin/LiveShareRoomsPlugin", "onUpdateRooms", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            y0Var2.f166747h.setVisibility(8);
            y0Var2.f166749j.setVisibility(0);
            C60253g gVar = y0Var2.f166752p;
            gVar.getClass();
            gVar.f171784d.clear();
            gVar.f171784d.addAll(list);
            y0Var2.f166752p.notifyDataSetChanged();
        }
        return C13598b0.f38549a;
    }
}
