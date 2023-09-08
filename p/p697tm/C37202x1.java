package p697tm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.UpdateWxaOptionsEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: tm.x1 */
public enum C37202x1 implements C38174i<C78042w1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98485d;

    /* renamed from: tm.x1$a */
    public static final class C37203a {

        /* renamed from: a */
        public static final List<Object> f98486a = null;

        static {
            f98486a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98485d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98485d;
                if (obj == obj2) {
                    obj = new C78042w1();
                    this.f98485d = obj;
                }
            }
        }
        return (C78042w1) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C37203a.f98486a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, UpdateWxaOptionsEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C78042w1.class.getName();
    }
}
