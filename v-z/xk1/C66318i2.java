package xk1;

import android.app.ActivityManager;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import er1.C58777u0;
import er1.C58782w0;
import gy3.C87412m;
import hp3.C87581a;
import j20.C117292a;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C50169kr1;
import te3.C50336m11;
import te3.C51006qs1;

/* renamed from: xk1.i2 */
public final class C66318i2<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C66297d2 f190913a;

    public C66318i2(C66297d2 d2Var) {
        this.f190913a = d2Var;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            C58782w0 w0Var = C58782w0.f168290a;
            LinkedList<C51006qs1> linkedList = ((C50336m11) cVar.f256796d).f137744d;
            C87412m.m108593f(linkedList, "it.resp.game_user_info_list");
            Object systemService = MMApplicationContext.getContext().getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
            long j = (long) 1024;
            long j2 = (memoryInfo.totalMem / j) / j;
            LinkedList linkedList2 = new LinkedList();
            Iterator<T> it = linkedList.iterator();
            while (true) {
                int i = 0;
                if (!it.hasNext()) {
                    break;
                }
                C51006qs1 qs12 = (C51006qs1) it.next();
                C50169kr1 kr12 = qs12.f140523e;
                if (kr12 != null) {
                    Integer num = null;
                    if (!Util.isNullOrNil(kr12.f137001d)) {
                        C50169kr1 kr13 = qs12.f140523e;
                        if (kr13 != null) {
                            i = kr13.f137011q;
                        }
                        if (j2 <= 0 || i <= 0) {
                            linkedList2.add(qs12);
                        } else if (j2 > ((long) i)) {
                            linkedList2.add(qs12);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("filter game by mem: ");
                            C50169kr1 kr14 = qs12.f140523e;
                            sb.append(kr14 != null ? kr14.f137002e : null);
                            sb.append(", ");
                            C50169kr1 kr15 = qs12.f140523e;
                            if (kr15 != null) {
                                num = Integer.valueOf(kr15.f137011q);
                            }
                            sb.append(num);
                            sb.append(", totalMem:");
                            sb.append(j2);
                            Log.m105924i("Finder.FinderGameLiveUtil", sb.toString());
                        }
                    }
                }
            }
            boolean z = ((C50336m11) cVar.f256796d).f137746f == 1;
            Log.m105924i("Finder.FinderLivePostUIC", "CgiFinderLiveGetUserGameConfig game list size: " + ((C50336m11) cVar.f256796d).f137744d + ", after filter:" + Integer.valueOf(linkedList2.size()) + ", showSearchLayout:" + z);
            if (linkedList2.isEmpty()) {
                View view = this.f190913a.f190863v;
                if (view != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostUIC$initPostLayout$1", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostUIC$initPostLayout$1", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                C58777u0 u0Var = C58777u0.f168283a;
                C58777u0.f168284b = 18;
                View view3 = this.f190913a.f190863v;
                if (view3 != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(0);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostUIC$initPostLayout$1", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostUIC$initPostLayout$1", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                u0Var.mo83833b(1);
                C66297d2 d2Var = this.f190913a;
                View view5 = d2Var.f190863v;
                if (view5 != null) {
                    view5.setOnClickListener(new C66315h2(z, d2Var, linkedList2));
                }
            }
        }
        return C13598b0.f38549a;
    }
}
