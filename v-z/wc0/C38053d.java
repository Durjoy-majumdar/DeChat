package wc0;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.modelrecovery.PluginRecovery;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: wc0.d */
public enum C38053d implements C38174i<PluginRecovery> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100598d;

    /* renamed from: wc0.d$a */
    public static final class C38054a {

        /* renamed from: a */
        public static final List<Object> f100599a = null;

        static {
            f100599a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f100598d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100598d;
                if (obj == obj2) {
                    obj = new PluginRecovery();
                    this.f100598d = obj;
                }
            }
        }
        return (PluginRecovery) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        if ("onProcess".equals(str)) {
            return C38054a.f100599a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.ASYNC);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + PluginRecovery.class.getName();
    }
}
