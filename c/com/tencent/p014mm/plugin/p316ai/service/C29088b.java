package com.tencent.p014mm.plugin.p316ai.service;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.ai.service.b */
public enum C29088b implements C38174i<AiService> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79657d;

    /* renamed from: com.tencent.mm.plugin.ai.service.b$a */
    public static final class C29089a {

        /* renamed from: a */
        public static final List<Object> f79658a = null;

        static {
            f79658a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f79657d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79657d;
                if (obj == obj2) {
                    obj = new AiService();
                    this.f79657d = obj;
                }
            }
        }
        return (AiService) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        if ("onProcess".equals(str)) {
            return C29089a.f79658a;
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
        return "provider " + AiService.class.getName();
    }
}
