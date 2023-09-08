package p1053ve;

import android.util.Log;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ve.e */
public class C90771e {

    /* renamed from: a */
    public static final Map<Integer, Throwable> f260666a = new ConcurrentHashMap();

    /* renamed from: b */
    public static final Map<String, C90772a> f260667b = new ConcurrentHashMap();

    /* renamed from: a */
    public static C90772a m113833a(int i) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f260666a;
        Throwable th = (Throwable) concurrentHashMap.get(Integer.valueOf(i));
        if (th == null) {
            return new C90772a();
        }
        String stackTraceString = Log.getStackTraceString(th);
        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) f260667b;
        C90772a aVar = (C90772a) concurrentHashMap2.get(stackTraceString);
        if (aVar == null) {
            C90772a aVar2 = new C90772a(stackTraceString);
            aVar2.f260669b++;
            concurrentHashMap2.put(stackTraceString, aVar2);
            concurrentHashMap.remove(Integer.valueOf(i));
            return aVar2;
        }
        concurrentHashMap.remove(Integer.valueOf(i));
        aVar.f260669b++;
        return aVar;
    }

    /* renamed from: ve.e$a */
    public static class C90772a {

        /* renamed from: a */
        public final String f260668a;

        /* renamed from: b */
        public int f260669b;

        public C90772a() {
            this.f260669b = 0;
            this.f260668a = "";
        }

        /* renamed from: a */
        public void mo124896a() {
            int i = this.f260669b - 1;
            this.f260669b = i;
            if (i == 0) {
                ((ConcurrentHashMap) C90771e.f260667b).remove(this.f260668a);
            }
        }

        public C90772a(String str) {
            this.f260669b = 0;
            this.f260668a = str;
        }
    }
}
