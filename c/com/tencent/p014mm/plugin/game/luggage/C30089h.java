package com.tencent.p014mm.plugin.game.luggage;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.game.luggage.h */
public enum C30089h implements C38174i<C4450g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81383d;

    /* renamed from: com.tencent.mm.plugin.game.luggage.h$a */
    public static final class C30090a {

        /* renamed from: a */
        public static final List<Object> f81384a = null;

        static {
            f81384a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f81383d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81383d;
                if (obj == obj2) {
                    obj = new C4450g();
                    this.f81383d = obj;
                }
            }
        }
        return (C4450g) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C30090a.f81384a;
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
        return "provider " + C4450g.class.getName();
    }
}
