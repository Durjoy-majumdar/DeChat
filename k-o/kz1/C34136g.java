package kz1;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.gamelive.GameLiveAppbrandProcessService;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;
import p635os.C89291d;

/* renamed from: kz1.g */
public enum C34136g implements C38174i<GameLiveAppbrandProcessService> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92094d;

    /* renamed from: kz1.g$a */
    public static final class C34137a {

        /* renamed from: a */
        public static final List<Object> f92095a = null;

        static {
            f92095a = Arrays.asList(new Object[]{C89291d.class});
        }
    }

    /* renamed from: kz1.g$b */
    public static final class C34138b {

        /* renamed from: a */
        public static final List<Object> f92096a = null;

        static {
            f92096a = Arrays.asList(new Object[]{C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f92094d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92094d;
                if (obj == obj2) {
                    obj = new GameLiveAppbrandProcessService();
                    this.f92094d = obj;
                }
            }
        }
        return (GameLiveAppbrandProcessService) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34138b.f92096a;
        }
        if ("dependencies".equals(str)) {
            return C34137a.f92095a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return false;
    }

    public boolean hasNoKeys() {
        return true;
    }

    public String toString() {
        return "provider " + GameLiveAppbrandProcessService.class.getName();
    }
}
