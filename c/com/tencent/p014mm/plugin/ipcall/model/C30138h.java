package com.tencent.p014mm.plugin.ipcall.model;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.ipcall.model.h */
public enum C30138h implements C38174i<C105385g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81474d;

    /* renamed from: com.tencent.mm.plugin.ipcall.model.h$a */
    public static final class C30139a {

        /* renamed from: a */
        public static final List<Object> f81475a = null;

        static {
            f81475a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f81474d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81474d;
                if (obj == obj2) {
                    obj = new C105385g();
                    this.f81474d = obj;
                }
            }
        }
        return (C105385g) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C30139a.f81475a;
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
        return "provider " + C105385g.class.getName();
    }
}
