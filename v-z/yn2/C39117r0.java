package yn2;

import com.tencent.p014mm.autogen.events.RemoveSnsTaskEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: yn2.r0 */
public enum C39117r0 implements C38174i<C39115q0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105290d;

    public Object get() {
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.RemoveSnsTaskEventListenerProvider");
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.RemoveSnsTaskEventListenerProvider");
        Object obj = this.f105290d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f105290d;
                    if (obj == obj2) {
                        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.RemoveSnsTaskEventListenerProvider");
                        C39115q0 q0Var = new C39115q0();
                        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.RemoveSnsTaskEventListenerProvider");
                        this.f105290d = q0Var;
                        obj = q0Var;
                    }
                } catch (Throwable th) {
                    SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.RemoveSnsTaskEventListenerProvider");
                    throw th;
                }
            }
        }
        C39115q0 q0Var2 = (C39115q0) obj;
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.RemoveSnsTaskEventListenerProvider");
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.RemoveSnsTaskEventListenerProvider");
        return q0Var2;
    }

    public Object getQualifierAttribute(String str) {
        SnsMethodCalculate.markStartTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.RemoveSnsTaskEventListenerProvider");
        if ("creator".equals(str)) {
            Class<Void> cls = Void.class;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.RemoveSnsTaskEventListenerProvider");
            return cls;
        } else if ("accountAware".equals(str)) {
            Boolean bool = Boolean.FALSE;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.RemoveSnsTaskEventListenerProvider");
            return bool;
        } else if ("onProcess".equals(str)) {
            List list = Collections.EMPTY_LIST;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.RemoveSnsTaskEventListenerProvider");
            return list;
        } else {
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.RemoveSnsTaskEventListenerProvider");
            return null;
        }
    }

    public boolean hasKey(Object obj) {
        SnsMethodCalculate.markStartTimeMs("hasKey", "com.tencent.mm.plugin.sns.RemoveSnsTaskEventListenerProvider");
        if (Objects.equals(obj, RemoveSnsTaskEvent.class)) {
            SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.plugin.sns.RemoveSnsTaskEventListenerProvider");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.plugin.sns.RemoveSnsTaskEventListenerProvider");
        return false;
    }

    public boolean hasNoKeys() {
        SnsMethodCalculate.markStartTimeMs("hasNoKeys", "com.tencent.mm.plugin.sns.RemoveSnsTaskEventListenerProvider");
        SnsMethodCalculate.markEndTimeMs("hasNoKeys", "com.tencent.mm.plugin.sns.RemoveSnsTaskEventListenerProvider");
        return false;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.RemoveSnsTaskEventListenerProvider");
        String str = "provider " + C39115q0.class.getName();
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.RemoveSnsTaskEventListenerProvider");
        return str;
    }
}
