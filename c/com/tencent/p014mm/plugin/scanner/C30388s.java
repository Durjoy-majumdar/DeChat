package com.tencent.p014mm.plugin.scanner;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.scanner.s */
public enum C30388s implements C38174i<C30387r> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81987d;

    /* renamed from: com.tencent.mm.plugin.scanner.s$a */
    public static final class C30389a {

        /* renamed from: a */
        public static final List<Object> f81988a = null;

        static {
            f81988a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f81987d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81987d;
                if (obj == obj2) {
                    obj = new C30387r();
                    this.f81987d = obj;
                }
            }
        }
        return (C30387r) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C30389a.f81988a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
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
        return "provider " + C30387r.class.getName();
    }
}
