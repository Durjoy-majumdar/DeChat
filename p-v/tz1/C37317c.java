package tz1;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: tz1.c */
public enum C37317c implements C38174i<C78113b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98705d;

    /* renamed from: tz1.c$a */
    public static final class C37318a {

        /* renamed from: a */
        public static final List<Object> f98706a = null;

        static {
            f98706a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98705d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98705d;
                if (obj == obj2) {
                    obj = new C78113b();
                    this.f98705d = obj;
                }
            }
        }
        return (C78113b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C37318a.f98706a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
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
        return "provider " + C78113b.class.getName();
    }
}
