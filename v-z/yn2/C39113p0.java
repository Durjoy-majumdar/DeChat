package yn2;

import com.tencent.p014mm.autogen.events.RecentlySnsMediaObjEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: yn2.p0 */
public enum C39113p0 implements C38174i<C102881o0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105281d;

    public Object get() {
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListenerProvider");
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListenerProvider");
        Object obj = this.f105281d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f105281d;
                    if (obj == obj2) {
                        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListenerProvider");
                        C102881o0 o0Var = new C102881o0();
                        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListenerProvider");
                        this.f105281d = o0Var;
                        obj = o0Var;
                    }
                } catch (Throwable th) {
                    SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListenerProvider");
                    throw th;
                }
            }
        }
        C102881o0 o0Var2 = (C102881o0) obj;
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListenerProvider");
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListenerProvider");
        return o0Var2;
    }

    public Object getQualifierAttribute(String str) {
        SnsMethodCalculate.markStartTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListenerProvider");
        if ("creator".equals(str)) {
            Class<Void> cls = Void.class;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListenerProvider");
            return cls;
        } else if ("accountAware".equals(str)) {
            Boolean bool = Boolean.FALSE;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListenerProvider");
            return bool;
        } else if ("onProcess".equals(str)) {
            List list = Collections.EMPTY_LIST;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListenerProvider");
            return list;
        } else {
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListenerProvider");
            return null;
        }
    }

    public boolean hasKey(Object obj) {
        SnsMethodCalculate.markStartTimeMs("hasKey", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListenerProvider");
        if (Objects.equals(obj, RecentlySnsMediaObjEvent.class)) {
            SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListenerProvider");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListenerProvider");
        return false;
    }

    public boolean hasNoKeys() {
        SnsMethodCalculate.markStartTimeMs("hasNoKeys", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListenerProvider");
        SnsMethodCalculate.markEndTimeMs("hasNoKeys", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListenerProvider");
        return false;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListenerProvider");
        String str = "provider " + C102881o0.class.getName();
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.RecentlySnsMediaObjListenerProvider");
        return str;
    }
}
