package zb2;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusOtherTopicFriendsActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jq3.C9500j;
import k20.C60958c;
import k20.C9556a;
import zb2.C103001d;

/* renamed from: zb2.m */
public class C103009m<T extends C103001d<T>> extends WxRecyclerAdapter<T> implements C103006g<T> {

    /* renamed from: G */
    public final MvvmList<T> f303959G;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C103009m(ac2.C54000f r9, androidx.lifecycle.C0125s r10, jq3.C9500j r11, boolean r12, int r13, gy3.C8480h r14) {
        /*
            r8 = this;
            r13 = r13 & 8
            if (r13 == 0) goto L_0x0005
            r12 = 0
        L_0x0005:
            java.lang.String r13 = "dataSource"
            gy3.C87412m.m108594g(r9, r13)
            java.lang.String r13 = "lifecycleOwner"
            gy3.C87412m.m108594g(r10, r13)
            java.lang.String r13 = "itemConvertFactory"
            gy3.C87412m.m108594g(r11, r13)
            com.tencent.mm.plugin.mvvmlist.MvvmList r13 = new com.tencent.mm.plugin.mvvmlist.MvvmList
            zb2.h r2 = new zb2.h
            r2.<init>()
            r4 = 0
            r5 = 0
            r6 = 24
            r7 = 0
            r0 = r13
            r1 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.<init>(r13, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zb2.C103009m.<init>(ac2.f, androidx.lifecycle.s, jq3.j, boolean, int, gy3.h):void");
    }

    /* renamed from: A3 */
    public void mo141611A3(C103007j<T> jVar) {
        boolean z;
        int i;
        boolean z2;
        C87412m.m108594g(jVar, "pendingData");
        if (this.f173491r) {
            for (C102999b bVar : jVar.f303955c) {
                int ordinal = bVar.f303934a.ordinal();
                if (ordinal == 0) {
                    int c6 = bVar.f303935b + mo85796c6();
                    Log.m105924i("MicroMsg.Mvvm.MvvmRecyclerAdapter", "onInserted pos:" + bVar.f303935b + " fixPos:" + c6 + " count:" + bVar.f303936c);
                    notifyItemRangeInserted(c6, bVar.f303936c);
                } else if (ordinal == 1) {
                    int c64 = bVar.f303935b + mo85796c6();
                    Log.m105924i("MicroMsg.Mvvm.MvvmRecyclerAdapter", "onRemoved pos:" + bVar.f303935b + " fixPos:" + c64 + " count:" + bVar.f303936c);
                    notifyItemRangeRemoved(c64, bVar.f303936c);
                } else if (ordinal == 2) {
                    int c65 = bVar.f303937d + mo85796c6();
                    int c66 = bVar.f303938e + mo85796c6();
                    Log.m105924i("MicroMsg.Mvvm.MvvmRecyclerAdapter", "onMoved fromPos:" + bVar.f303937d + " fromFixPos:" + c65 + " toPos:" + bVar.f303938e + " toFixPos:" + c66);
                    notifyItemMoved(c65, c66);
                } else if (ordinal == 3) {
                    int c67 = bVar.f303935b + mo85796c6();
                    Log.m105924i("MicroMsg.Mvvm.MvvmRecyclerAdapter", "onChanged pos:" + bVar.f303935b + " fixPos:" + c67 + " count:" + bVar.f303936c + ' ' + bVar.f303939f);
                    notifyItemRangeChanged(c67, bVar.f303936c, bVar.f303939f);
                }
            }
            List<? extends MvvmList.C94267d> list = jVar.f303956d;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    MvvmList.C94267d dVar = (MvvmList.C94267d) it.next();
                    if (dVar == MvvmList.C94267d.RefreshAll || dVar == MvvmList.C94267d.Reset || dVar == MvvmList.C94267d.FirstCreate) {
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
            if (z && (i = this.f303959G.f272346e.f150922c) >= 0) {
                Log.m105924i("MicroMsg.Mvvm.MvvmRecyclerAdapter", "scrollToPosition pos:" + i);
                RecyclerView.LayoutManager layoutManager = mo85797d6().getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    aVar.mo10233c(Integer.valueOf(i));
                    LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
                    C117292a.m165358d(linearLayoutManager2, aVar.mo10232b(), "com/tencent/mm/plugin/mvvmlist/MvvmRecyclerAdapter", "onUpdateAdapter", "(Lcom/tencent/mm/plugin/mvvmlist/MvvmListPendingData;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    linearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                    C117292a.m165359e(linearLayoutManager2, "com/tencent/mm/plugin/mvvmlist/MvvmRecyclerAdapter", "onUpdateAdapter", "(Lcom/tencent/mm/plugin/mvvmlist/MvvmListPendingData;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                } else if (layoutManager != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(Integer.valueOf(i));
                    RecyclerView.LayoutManager layoutManager2 = layoutManager;
                    C117292a.m165358d(layoutManager2, aVar2.mo10232b(), "com/tencent/mm/plugin/mvvmlist/MvvmRecyclerAdapter", "onUpdateAdapter", "(Lcom/tencent/mm/plugin/mvvmlist/MvvmListPendingData;)V", "Undefined", "scrollToPosition", "(I)V");
                    layoutManager.scrollToPosition(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(layoutManager2, "com/tencent/mm/plugin/mvvmlist/MvvmRecyclerAdapter", "onUpdateAdapter", "(Lcom/tencent/mm/plugin/mvvmlist/MvvmListPendingData;)V", "Undefined", "scrollToPosition", "(I)V");
                }
            }
        }
    }

    /* renamed from: v6 */
    public boolean mo6267v6() {
        return !(this instanceof TextStatusOtherTopicFriendsActivity.C43233h);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C103009m(MvvmList mvvmList, C9500j jVar, boolean z, int i, C8480h hVar) {
        this(mvvmList, jVar, (i & 4) != 0 ? false : z);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C103009m(com.tencent.p014mm.plugin.mvvmlist.MvvmList<T> r3, jq3.C9500j r4, boolean r5) {
        /*
            r2 = this;
            java.lang.String r0 = "mvvmList"
            gy3.C87412m.m108594g(r3, r0)
            java.lang.String r0 = "itemConvertFactory"
            gy3.C87412m.m108594g(r4, r0)
            java.util.ArrayList<T> r0 = r3.f272353o
            java.lang.String r1 = "null cannot be cast to non-null type java.util.ArrayList<T of com.tencent.mm.plugin.mvvmlist.MvvmRecyclerAdapter>{ kotlin.collections.TypeAliasesKt.ArrayList<T of com.tencent.mm.plugin.mvvmlist.MvvmRecyclerAdapter> }"
            gy3.C87412m.m108592e(r0, r1)
            r2.<init>(r4, r0, r5)
            r2.f303959G = r3
            r3.f272355q = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zb2.C103009m.<init>(com.tencent.mm.plugin.mvvmlist.MvvmList, jq3.j, boolean):void");
    }
}
