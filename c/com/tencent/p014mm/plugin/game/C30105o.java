package com.tencent.p014mm.plugin.game;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.game.o */
public enum C30105o implements C38174i<C41877l> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81414d;

    /* renamed from: com.tencent.mm.plugin.game.o$a */
    public static final class C30106a {

        /* renamed from: a */
        public static final List<Object> f81415a = null;

        static {
            f81415a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f81414d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81414d;
                if (obj == obj2) {
                    obj = new C41877l();
                    this.f81414d = obj;
                }
            }
        }
        return (C41877l) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C30106a.f81415a;
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
        return "provider " + C41877l.class.getName();
    }
}
