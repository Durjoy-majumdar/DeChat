package a61;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.CheckResUpdatePreOperationEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: a61.s */
public enum C27788s implements C38174i<C39497r> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f76862d;

    /* renamed from: a61.s$a */
    public static final class C27789a {

        /* renamed from: a */
        public static final List<Object> f76863a = null;

        static {
            f76863a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f76862d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f76862d;
                if (obj == obj2) {
                    obj = new C39497r();
                    this.f76862d = obj;
                }
            }
        }
        return (C39497r) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C27789a.f76863a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, CheckResUpdatePreOperationEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C39497r.class.getName();
    }
}
