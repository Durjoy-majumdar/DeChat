package p723vf;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.os.Process;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import sx3.C64186f0;

/* renamed from: vf.b */
public final class C90776b {

    /* renamed from: b */
    public static final C90777a f260683b = new C90777a();

    /* renamed from: a */
    public final List<String> f260684a;

    /* renamed from: vf.b$a */
    public static final class C90777a {
    }

    public C90776b() {
        this((List) null, 1, (C8480h) null);
    }

    public C90776b(List list, int i, C8480h hVar) {
        ArrayList arrayList = list;
        if ((i & 1) != 0) {
            f260683b.getClass();
            ArrayList arrayList2 = new ArrayList();
            List<ActivityManager.RunningServiceInfo> list2 = C64186f0.f181907d;
            try {
                List runningServices = C90782f.f260693a.getRunningServices(Integer.MAX_VALUE);
                C87412m.m108593f(runningServices, "MemInfoFactory.activityM…ngServices(Int.MAX_VALUE)");
                list2 = runningServices;
            } catch (Throwable th) {
                C118672d.m167354d("Matrix.MemoryInfoFactory", th, "", new Object[0]);
            }
            for (ActivityManager.RunningServiceInfo runningServiceInfo : list2) {
                if (runningServiceInfo.uid == Process.myUid() && runningServiceInfo.pid == Process.myPid() && runningServiceInfo.foreground) {
                    ComponentName componentName = runningServiceInfo.service;
                    C87412m.m108593f(componentName, "serviceInfo.service");
                    arrayList2.add(componentName.getClassName());
                }
            }
            arrayList = arrayList2;
        }
        C87412m.m108594g(arrayList, "fgServices");
        this.f260684a = arrayList;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C90776b) && C87412m.m108589b(this.f260684a, ((C90776b) obj).f260684a);
        }
        return true;
    }

    public int hashCode() {
        List<String> list = this.f260684a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        Object[] array = this.f260684a.toArray(new String[0]);
        if (array != null) {
            String arrays = Arrays.toString(array);
            C87412m.m108593f(arrays, "java.util.Arrays.toString(this)");
            return arrays;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
