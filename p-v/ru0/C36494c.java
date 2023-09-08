package ru0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: ru0.c */
public enum C36494c implements C38174i<C118231b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97092d;

    /* renamed from: ru0.c$a */
    public static final class C36495a {

        /* renamed from: a */
        public static final List<Object> f97093a = null;

        static {
            f97093a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f97092d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97092d;
                if (obj == obj2) {
                    obj = new C118231b();
                    this.f97092d = obj;
                }
            }
        }
        return (C118231b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C36495a.f97093a;
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
        return "provider " + C118231b.class.getName();
    }
}
