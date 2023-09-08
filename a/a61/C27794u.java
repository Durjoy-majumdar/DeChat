package a61;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.RevokeMsgEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: a61.u */
public enum C27794u implements C38174i<C27791t> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f76870d;

    /* renamed from: a61.u$a */
    public static final class C27795a {

        /* renamed from: a */
        public static final List<Object> f76871a = null;

        static {
            f76871a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f76870d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f76870d;
                if (obj == obj2) {
                    obj = new C27791t();
                    this.f76870d = obj;
                }
            }
        }
        return (C27791t) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C27795a.f76871a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, RevokeMsgEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C27791t.class.getName();
    }
}
