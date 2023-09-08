package p981ie;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p981ie.C87710u;

/* renamed from: ie.x */
public final class C87713x {

    /* renamed from: a */
    public static List<C87715b> f253991a = new ArrayList();

    /* renamed from: b */
    public static boolean f253992b;

    /* renamed from: c */
    public static C87710u f253993c = new C87710u("wifi", "android.net.wifi.IWifiManager", new C87714a());

    /* renamed from: ie.x$a */
    public class C87714a implements C87710u.C87712b {
        /* renamed from: a */
        public Object mo122125a(Object obj, Method method, Object[] objArr) {
            return null;
        }

        /* renamed from: b */
        public void mo122126b(Method method, Object[] objArr) {
            if ("startScan".equals(method.getName())) {
                Iterator it = ((ArrayList) C87713x.f253991a).iterator();
                while (it.hasNext()) {
                    ((C87715b) it.next()).mo111827a();
                }
            } else if ("getScanResults".equals(method.getName())) {
                Iterator it4 = ((ArrayList) C87713x.f253991a).iterator();
                while (it4.hasNext()) {
                    ((C87715b) it4.next()).mo111828b();
                }
            }
        }
    }

    /* renamed from: ie.x$b */
    public interface C87715b {
        /* renamed from: a */
        void mo111827a();

        /* renamed from: b */
        void mo111828b();
    }
}
