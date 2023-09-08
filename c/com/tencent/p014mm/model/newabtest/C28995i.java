package com.tencent.p014mm.model.newabtest;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.model.newabtest.i */
public enum C28995i implements C38174i<SubCoreNewABTest> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79492d;

    /* renamed from: com.tencent.mm.model.newabtest.i$a */
    public static final class C28996a {

        /* renamed from: a */
        public static final List<Object> f79493a = null;

        static {
            f79493a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f79492d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79492d;
                if (obj == obj2) {
                    obj = new SubCoreNewABTest();
                    this.f79492d = obj;
                }
            }
        }
        return (SubCoreNewABTest) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C28996a.f79493a;
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
        return "provider " + SubCoreNewABTest.class.getName();
    }
}
