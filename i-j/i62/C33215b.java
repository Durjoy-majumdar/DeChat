package i62;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.DoingInitContactEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: i62.b */
public enum C33215b implements C38174i<C8861a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90121d;

    /* renamed from: i62.b$a */
    public static final class C33216a {

        /* renamed from: a */
        public static final List<Object> f90122a = null;

        static {
            f90122a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f90121d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90121d;
                if (obj == obj2) {
                    obj = new C8861a();
                    this.f90121d = obj;
                }
            }
        }
        return (C8861a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C33216a.f90122a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, DoingInitContactEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C8861a.class.getName();
    }
}
