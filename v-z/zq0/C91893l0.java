package zq0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: zq0.l0 */
public final class C91893l0 {

    /* renamed from: a */
    public static final C91893l0 f263119a = new C91893l0();

    /* renamed from: b */
    public static final HashMap<String, C91891k0> f263120b = new HashMap<>();

    /* renamed from: c */
    public static final C13601g f263121c = C36568h.m40985a(C39438a.f105935d);

    /* renamed from: zq0.l0$a */
    public static final class C39438a extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C39438a f105935d = new C39438a();

        public C39438a() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getMMKV("MicroMsg.PhoneNumberReporter");
        }
    }

    /* renamed from: a */
    public final synchronized C91891k0 mo125719a(String str) {
        C87412m.m108594g(str, "appId");
        return f263120b.get(str);
    }

    /* renamed from: b */
    public final synchronized void mo125720b(String str) {
        C87412m.m108594g(str, "appId");
        Object value = ((C36570n) f263121c).getValue();
        C87412m.m108593f(value, "<get-mmKv>(...)");
        String string = ((MultiProcessMMKV) value).getString(str, "");
        if (string == null) {
            string = "{}";
        }
        if (string.length() > 0) {
            f263120b.put(str, new C91891k0(string));
        }
    }

    /* renamed from: c */
    public final synchronized void mo125721c(String str) {
        C87412m.m108594g(str, "appId");
        C91891k0 a = mo125719a(str);
        if (a != null) {
            Object value = ((C36570n) f263121c).getValue();
            C87412m.m108593f(value, "<get-mmKv>(...)");
            ((MultiProcessMMKV) value).putString(str, a.toString()).commit();
        }
    }

    /* renamed from: d */
    public final synchronized void mo125722d(String str) {
        C87412m.m108594g(str, "appId");
        StringBuilder sb = new StringBuilder();
        sb.append("report ");
        C91891k0 a = mo125719a(str);
        sb.append(a != null ? a.toString() : null);
        Log.m105926v("MicroMsg.PhoneNumberReporter", sb.toString());
        f263120b.remove(str);
        Object value = ((C36570n) f263121c).getValue();
        C87412m.m108593f(value, "<get-mmKv>(...)");
        ((MultiProcessMMKV) value).remove(str).commit();
    }
}
