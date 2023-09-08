package ut2;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;
import iu2.C98799a;
import j20.C117292a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jq3.C9500j;
import k20.C60958c;
import k20.C9556a;
import zb2.C102999b;
import zb2.C103000c;
import zb2.C103007j;
import zb2.C103009m;

/* renamed from: ut2.w */
public final class C102110w extends C103009m<C98799a> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102110w(MvvmList<C98799a> mvvmList, C9500j jVar) {
        super(mvvmList, jVar, false);
        C87412m.m108594g(mvvmList, "mvvmList");
        C87412m.m108594g(jVar, "itemConvertFactory");
    }

    /* renamed from: A3 */
    public void mo141611A3(C103007j<C98799a> jVar) {
        boolean z;
        boolean z2;
        SnsMethodCalculate.markStartTimeMs("onUpdateAdapter", "com.tencent.mm.plugin.sns.ui.improve.component.SnsRecyclerAdapter");
        C87412m.m108594g(jVar, "pendingData");
        super.mo141611A3(jVar);
        List<C102999b> list = jVar.f303955c;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C102999b bVar = (C102999b) it.next();
                if (bVar.f303934a == C103000c.Insert && bVar.f303935b == 0 && bVar.f303936c > 0) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (z) {
            RecyclerView.LayoutManager layoutManager = mo85797d6().getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                aVar.mo10233c(0);
                LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
                C117292a.m165358d(linearLayoutManager2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/improve/component/SnsRecyclerAdapter", "onUpdateAdapter", "(Lcom/tencent/mm/plugin/mvvmlist/MvvmListPendingData;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                linearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                C117292a.m165359e(linearLayoutManager2, "com/tencent/mm/plugin/sns/ui/improve/component/SnsRecyclerAdapter", "onUpdateAdapter", "(Lcom/tencent/mm/plugin/mvvmlist/MvvmListPendingData;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            } else if (layoutManager != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                RecyclerView.LayoutManager layoutManager2 = layoutManager;
                C117292a.m165358d(layoutManager2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/improve/component/SnsRecyclerAdapter", "onUpdateAdapter", "(Lcom/tencent/mm/plugin/mvvmlist/MvvmListPendingData;)V", "Undefined", "scrollToPosition", "(I)V");
                layoutManager.scrollToPosition(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(layoutManager2, "com/tencent/mm/plugin/sns/ui/improve/component/SnsRecyclerAdapter", "onUpdateAdapter", "(Lcom/tencent/mm/plugin/mvvmlist/MvvmListPendingData;)V", "Undefined", "scrollToPosition", "(I)V");
            }
        }
        SnsMethodCalculate.markEndTimeMs("onUpdateAdapter", "com.tencent.mm.plugin.sns.ui.improve.component.SnsRecyclerAdapter");
    }
}
