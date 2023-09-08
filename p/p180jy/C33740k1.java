package p180jy;

import com.tencent.p014mm.autogen.events.ReportAdClickEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: jy.k1 */
public enum C33740k1 implements C38174i<C99074j1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91249d;

    public Object get() {
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.feature.sns.listener.ReportAdClickListenerProvider");
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.feature.sns.listener.ReportAdClickListenerProvider");
        Object obj = this.f91249d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f91249d;
                    if (obj == obj2) {
                        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.feature.sns.listener.ReportAdClickListenerProvider");
                        C99074j1 j1Var = new C99074j1();
                        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.feature.sns.listener.ReportAdClickListenerProvider");
                        this.f91249d = j1Var;
                        obj = j1Var;
                    }
                } catch (Throwable th) {
                    SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.listener.ReportAdClickListenerProvider");
                    throw th;
                }
            }
        }
        C99074j1 j1Var2 = (C99074j1) obj;
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.listener.ReportAdClickListenerProvider");
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.listener.ReportAdClickListenerProvider");
        return j1Var2;
    }

    public Object getQualifierAttribute(String str) {
        SnsMethodCalculate.markStartTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.listener.ReportAdClickListenerProvider");
        if ("creator".equals(str)) {
            Class<Void> cls = Void.class;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.listener.ReportAdClickListenerProvider");
            return cls;
        } else if ("accountAware".equals(str)) {
            Boolean bool = Boolean.FALSE;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.listener.ReportAdClickListenerProvider");
            return bool;
        } else if ("onProcess".equals(str)) {
            List list = Collections.EMPTY_LIST;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.listener.ReportAdClickListenerProvider");
            return list;
        } else {
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.listener.ReportAdClickListenerProvider");
            return null;
        }
    }

    public boolean hasKey(Object obj) {
        SnsMethodCalculate.markStartTimeMs("hasKey", "com.tencent.mm.feature.sns.listener.ReportAdClickListenerProvider");
        if (Objects.equals(obj, ReportAdClickEvent.class)) {
            SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.feature.sns.listener.ReportAdClickListenerProvider");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.feature.sns.listener.ReportAdClickListenerProvider");
        return false;
    }

    public boolean hasNoKeys() {
        SnsMethodCalculate.markStartTimeMs("hasNoKeys", "com.tencent.mm.feature.sns.listener.ReportAdClickListenerProvider");
        SnsMethodCalculate.markEndTimeMs("hasNoKeys", "com.tencent.mm.feature.sns.listener.ReportAdClickListenerProvider");
        return false;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.feature.sns.listener.ReportAdClickListenerProvider");
        String str = "provider " + C99074j1.class.getName();
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.feature.sns.listener.ReportAdClickListenerProvider");
        return str;
    }
}
