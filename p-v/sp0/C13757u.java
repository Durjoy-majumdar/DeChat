package sp0;

import android.net.Network;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.reflect.Method;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: sp0.u */
public final class C13757u implements C13763x {

    /* renamed from: a */
    public static final C13757u f38859a = new C13757u();

    /* renamed from: b */
    public static final C13601g f38860b = C36568h.m40985a(C13759b.f38864d);

    /* renamed from: c */
    public static final C13601g f38861c = C36568h.m40985a(C13760c.f38865d);

    /* renamed from: d */
    public static final C13601g f38862d = C36568h.m40985a(C13758a.f38863d);

    /* renamed from: sp0.u$a */
    public static final class C13758a extends C87413o implements C32224a<Method> {

        /* renamed from: d */
        public static final C13758a f38863d = new C13758a();

        public C13758a() {
            super(0);
        }

        public Object invoke() {
            C13757u uVar = C13757u.f38859a;
            Class cls = (Class) ((C36570n) C13757u.f38860b).getValue();
            if (cls == null) {
                return null;
            }
            try {
                Class cls2 = Integer.TYPE;
                return cls.getDeclaredMethod("bindSocketToNetwork", new Class[]{cls2, cls2});
            } catch (Exception e) {
                Log.m105920e("MicroMsg.BindSocketToNetworkBelowApi23Ability", "reflect bindSocketToNetworkMethod fail since " + e);
                return null;
            }
        }
    }

    /* renamed from: sp0.u$b */
    public static final class C13759b extends C87413o implements C32224a<Class<?>> {

        /* renamed from: d */
        public static final C13759b f38864d = new C13759b();

        public C13759b() {
            super(0);
        }

        public Object invoke() {
            try {
                return Class.forName("android.net.NetworkUtils");
            } catch (Exception e) {
                Log.m105920e("MicroMsg.BindSocketToNetworkBelowApi23Ability", "reflect networkUtilsClass fail since " + e);
                return null;
            }
        }
    }

    /* renamed from: sp0.u$c */
    public static final class C13760c extends C87413o implements C32224a<Object> {

        /* renamed from: d */
        public static final C13760c f38865d = new C13760c();

        public C13760c() {
            super(0);
        }

        public final Object invoke() {
            C13757u uVar = C13757u.f38859a;
            Class cls = (Class) ((C36570n) C13757u.f38860b).getValue();
            if (cls == null) {
                return null;
            }
            try {
                return cls.newInstance();
            } catch (Exception e) {
                Log.m105920e("MicroMsg.BindSocketToNetworkBelowApi23Ability", "new networkUtils fail since " + e);
                return null;
            }
        }
    }

    /* renamed from: a */
    public boolean mo13124a(int i, Network network) {
        Method method;
        C87412m.m108594g(network, "network");
        Object value = ((C36570n) f38861c).getValue();
        if (value == null || (method = (Method) ((C36570n) f38862d).getValue()) == null) {
            return false;
        }
        try {
            Object invoke = method.invoke(value, new Object[]{Integer.valueOf(i), Integer.valueOf(network.hashCode() / 11)});
            Integer num = invoke instanceof Integer ? (Integer) invoke : null;
            Log.m105924i("MicroMsg.BindSocketToNetworkBelowApi23Ability", "doBind, bindRet: " + num);
            if (num == null) {
                return false;
            }
            return num.intValue() == 0;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.BindSocketToNetworkBelowApi23Ability", "call bindSocketToNetworkMethod fail since " + e);
            return false;
        }
    }
}
