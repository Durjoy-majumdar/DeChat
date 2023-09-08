package androidx.window.rxjava2.layout;

import a14.C53872d1;
import android.app.Activity;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d14.C45252f;
import gy3.C87412m;
import h14.C108011a;
import h14.C108012c;
import h14.C117008b;
import i14.a$$a;
import kotlin.Metadata;
import ox3.C117900a;
import ox3.C117901b;
import px3.C118143a;
import qx3.C118214a;
import wx3.C66217g;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\b"}, mo182094d2 = {"Landroidx/window/layout/WindowInfoTracker;", "Landroid/app/Activity;", "activity", "Lox3/b;", "Landroidx/window/layout/WindowLayoutInfo;", "windowLayoutInfoObservable", "Lox3/a;", "windowLayoutInfoFlowable", "window-rxjava2_release"}, mo182095k = 2, mo182096mv = {1, 5, 1})
public final class WindowInfoTrackerRx {
    public static final C117900a<WindowLayoutInfo> windowLayoutInfoFlowable(WindowInfoTracker windowInfoTracker, Activity activity) {
        C87412m.m108594g(windowInfoTracker, "<this>");
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C45252f<WindowLayoutInfo> windowLayoutInfo = windowInfoTracker.windowLayoutInfo(activity);
        C66217g gVar = C66217g.f190253d;
        C108011a[] aVarArr = C108012c.f323455a;
        C117008b bVar = new C117008b(windowLayoutInfo, C53872d1.f151118b.plus(gVar));
        int i = C117900a.f352431a;
        return bVar instanceof C117900a ? (C117900a) bVar : new C118143a(bVar);
    }

    public static final C117901b<WindowLayoutInfo> windowLayoutInfoObservable(WindowInfoTracker windowInfoTracker, Activity activity) {
        C87412m.m108594g(windowInfoTracker, "<this>");
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        return new C118214a(new a$$a(C66217g.f190253d, windowInfoTracker.windowLayoutInfo(activity)));
    }
}
