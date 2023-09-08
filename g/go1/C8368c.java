package go1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import gy3.C87412m;
import j20.C117292a;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import rx3.C13604l;

/* renamed from: go1.c */
public final class C8368c {

    /* renamed from: a */
    public static final C8368c f27352a = new C8368c();

    /* renamed from: b */
    public static final ConcurrentHashMap<Integer, C8366a> f27353b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public static final ConcurrentHashMap<Integer, C13604l<C8366a, LinkedList<Integer>>> f27354c = new ConcurrentHashMap<>();

    /* renamed from: a */
    public final View mo9334a(View view, int i) {
        if (view.hashCode() == i) {
            return view;
        }
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            C87412m.m108593f(childAt, "child");
            View a = mo9334a(childAt, i);
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo9335b(int i, C8366a aVar) {
        C8366a aVar2 = C8366a.NONE;
        C87412m.m108594g(aVar, DownloadInfo.PRIORITY);
        C8366a aVar3 = f27353b.get(Integer.valueOf(i));
        if (aVar3 == null) {
            aVar3 = aVar2;
        }
        return aVar2 == aVar3 || aVar.compareTo(aVar3) <= 0;
    }

    /* renamed from: c */
    public final void mo9336c(int i, int i2, C8366a aVar, C13604l<? extends C8366a, ? extends LinkedList<Integer>> lVar, int i3) {
        Log.m105924i("FinderFeedViewPriorityManager", "[setPriorityFlag] " + i3 + ", holder:" + i + " viewHash:" + i2 + " priority:" + aVar + " config.first:" + lVar.f38555d + " config.second:" + lVar.f38556e);
    }

    /* renamed from: d */
    public final void mo9337d(C60905o oVar, View view, C8366a aVar) {
        C60905o oVar2 = oVar;
        C8366a aVar2 = aVar;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(aVar2, DownloadInfo.PRIORITY);
        if (view.getVisibility() == 0) {
            int hashCode = view.hashCode();
            int hashCode2 = oVar.hashCode();
            f27353b.put(Integer.valueOf(hashCode2), aVar2);
            ConcurrentHashMap<Integer, C13604l<C8366a, LinkedList<Integer>>> concurrentHashMap = f27354c;
            C13604l lVar = concurrentHashMap.get(Integer.valueOf(hashCode2));
            if (lVar == null) {
                LinkedList linkedList = new LinkedList();
                linkedList.add(Integer.valueOf(hashCode));
                C13604l lVar2 = new C13604l(aVar2, linkedList);
                concurrentHashMap.put(Integer.valueOf(hashCode2), lVar2);
                mo9336c(hashCode2, hashCode, aVar, lVar2, 1);
            } else if (aVar2.compareTo((Enum) lVar.f38555d) < 0) {
                for (Number intValue : (Iterable) lVar.f38556e) {
                    int intValue2 = intValue.intValue();
                    C8368c cVar = f27352a;
                    View view2 = oVar2.f44854d;
                    C87412m.m108593f(view2, "holder.itemView");
                    View a = cVar.mo9334a(view2, intValue2);
                    if (a != null) {
                        C9556a aVar3 = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar3.mo10233c(8);
                        View view3 = a;
                        C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/priority/FinderFeedViewPriorityManager", "setPriorityFlag", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/priority/FinderFeedViewPriority;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        a.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/priority/FinderFeedViewPriorityManager", "setPriorityFlag", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/priority/FinderFeedViewPriority;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                LinkedList linkedList2 = new LinkedList();
                linkedList2.add(Integer.valueOf(hashCode));
                C13604l lVar3 = new C13604l(aVar2, linkedList2);
                f27354c.put(Integer.valueOf(hashCode2), lVar3);
                mo9336c(hashCode2, hashCode, aVar, lVar3, 2);
            } else if (aVar2 == lVar.f38555d) {
                if (!((LinkedList) lVar.f38556e).contains(Integer.valueOf(hashCode))) {
                    ((LinkedList) lVar.f38556e).add(Integer.valueOf(hashCode));
                }
                mo9336c(hashCode2, hashCode, aVar, lVar, 3);
            }
        }
    }
}
