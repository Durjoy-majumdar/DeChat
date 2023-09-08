package p738wg;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ExtPlayerEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: wg.f */
public enum C38103f implements C38174i<C102436e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100708d;

    /* renamed from: wg.f$a */
    public static final class C38104a {

        /* renamed from: a */
        public static final List<Object> f100709a = null;

        static {
            f100709a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f100708d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100708d;
                if (obj == obj2) {
                    obj = new C102436e();
                    this.f100708d = obj;
                }
            }
        }
        return (C102436e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C38104a.f100709a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, ExtPlayerEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C102436e.class.getName();
    }
}
