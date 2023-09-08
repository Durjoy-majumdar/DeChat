package p180jy;

import com.tencent.p014mm.autogen.events.SnsCleanStorageEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: jy.w1 */
public enum C33783w1 implements C38174i<C33779v1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91349d;

    public Object get() {
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.feature.sns.listener.SnsCleanStorageEventListenerProvider");
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.feature.sns.listener.SnsCleanStorageEventListenerProvider");
        Object obj = this.f91349d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f91349d;
                    if (obj == obj2) {
                        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.feature.sns.listener.SnsCleanStorageEventListenerProvider");
                        C33779v1 v1Var = new C33779v1();
                        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.feature.sns.listener.SnsCleanStorageEventListenerProvider");
                        this.f91349d = v1Var;
                        obj = v1Var;
                    }
                } catch (Throwable th) {
                    SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.listener.SnsCleanStorageEventListenerProvider");
                    throw th;
                }
            }
        }
        C33779v1 v1Var2 = (C33779v1) obj;
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.listener.SnsCleanStorageEventListenerProvider");
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.listener.SnsCleanStorageEventListenerProvider");
        return v1Var2;
    }

    public Object getQualifierAttribute(String str) {
        SnsMethodCalculate.markStartTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.listener.SnsCleanStorageEventListenerProvider");
        if ("creator".equals(str)) {
            Class<Void> cls = Void.class;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.listener.SnsCleanStorageEventListenerProvider");
            return cls;
        } else if ("accountAware".equals(str)) {
            Boolean bool = Boolean.FALSE;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.listener.SnsCleanStorageEventListenerProvider");
            return bool;
        } else if ("onProcess".equals(str)) {
            List list = Collections.EMPTY_LIST;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.listener.SnsCleanStorageEventListenerProvider");
            return list;
        } else {
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.listener.SnsCleanStorageEventListenerProvider");
            return null;
        }
    }

    public boolean hasKey(Object obj) {
        SnsMethodCalculate.markStartTimeMs("hasKey", "com.tencent.mm.feature.sns.listener.SnsCleanStorageEventListenerProvider");
        if (Objects.equals(obj, SnsCleanStorageEvent.class)) {
            SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.feature.sns.listener.SnsCleanStorageEventListenerProvider");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.feature.sns.listener.SnsCleanStorageEventListenerProvider");
        return false;
    }

    public boolean hasNoKeys() {
        SnsMethodCalculate.markStartTimeMs("hasNoKeys", "com.tencent.mm.feature.sns.listener.SnsCleanStorageEventListenerProvider");
        SnsMethodCalculate.markEndTimeMs("hasNoKeys", "com.tencent.mm.feature.sns.listener.SnsCleanStorageEventListenerProvider");
        return false;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.feature.sns.listener.SnsCleanStorageEventListenerProvider");
        String str = "provider " + C33779v1.class.getName();
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.feature.sns.listener.SnsCleanStorageEventListenerProvider");
        return str;
    }
}
