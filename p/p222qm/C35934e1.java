package p222qm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.SDKOpenBusiLuckyMoneyEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qm.e1 */
public enum C35934e1 implements C38174i<C89706d1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95850d;

    /* renamed from: qm.e1$a */
    public static final class C35935a {

        /* renamed from: a */
        public static final List<Object> f95851a = null;

        static {
            f95851a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f95850d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95850d;
                if (obj == obj2) {
                    obj = new C89706d1();
                    this.f95850d = obj;
                }
            }
        }
        return (C89706d1) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C35935a.f95851a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, SDKOpenBusiLuckyMoneyEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C89706d1.class.getName();
    }
}
