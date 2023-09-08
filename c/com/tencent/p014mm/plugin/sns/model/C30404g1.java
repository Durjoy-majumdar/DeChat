package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.sns.model.g1 */
public enum C30404g1 implements C38174i<C94866e1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f82008d;

    /* renamed from: com.tencent.mm.plugin.sns.model.g1$a */
    public static final class C30405a {

        /* renamed from: a */
        public static final List<Object> f82009a = null;

        static {
            f82009a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.model.SnsCoreProvider");
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.model.SnsCoreProvider");
        Object obj = this.f82008d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f82008d;
                    if (obj == obj2) {
                        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.model.SnsCoreProvider");
                        C94866e1 e1Var = new C94866e1();
                        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.model.SnsCoreProvider");
                        this.f82008d = e1Var;
                        obj = e1Var;
                    }
                } catch (Throwable th) {
                    SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.model.SnsCoreProvider");
                    throw th;
                }
            }
        }
        C94866e1 e1Var2 = (C94866e1) obj;
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.model.SnsCoreProvider");
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.model.SnsCoreProvider");
        return e1Var2;
    }

    public Object getQualifierAttribute(String str) {
        SnsMethodCalculate.markStartTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.model.SnsCoreProvider");
        if ("creator".equals(str)) {
            Class<Void> cls = Void.class;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.model.SnsCoreProvider");
            return cls;
        } else if ("onProcess".equals(str)) {
            List<Object> list = C30405a.f82009a;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.model.SnsCoreProvider");
            return list;
        } else if ("dependencies".equals(str)) {
            List list2 = Collections.EMPTY_LIST;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.model.SnsCoreProvider");
            return list2;
        } else {
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.model.SnsCoreProvider");
            return null;
        }
    }

    public boolean hasKey(Object obj) {
        SnsMethodCalculate.markStartTimeMs("hasKey", "com.tencent.mm.plugin.sns.model.SnsCoreProvider");
        if (Objects.equals(obj, C31607a.ASYNC)) {
            SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.plugin.sns.model.SnsCoreProvider");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.plugin.sns.model.SnsCoreProvider");
        return false;
    }

    public boolean hasNoKeys() {
        SnsMethodCalculate.markStartTimeMs("hasNoKeys", "com.tencent.mm.plugin.sns.model.SnsCoreProvider");
        SnsMethodCalculate.markEndTimeMs("hasNoKeys", "com.tencent.mm.plugin.sns.model.SnsCoreProvider");
        return false;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.model.SnsCoreProvider");
        String str = "provider " + C94866e1.class.getName();
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.model.SnsCoreProvider");
        return str;
    }
}
