package p180jy;

import com.tencent.p014mm.autogen.events.ChattingUIStatusEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: jy.f */
public enum C33721f implements C38174i<C33717e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91210d;

    public Object get() {
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.feature.sns.listener.ChattingUIStatusListenerProvider");
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.feature.sns.listener.ChattingUIStatusListenerProvider");
        Object obj = this.f91210d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f91210d;
                    if (obj == obj2) {
                        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.feature.sns.listener.ChattingUIStatusListenerProvider");
                        C33717e eVar = new C33717e();
                        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.feature.sns.listener.ChattingUIStatusListenerProvider");
                        this.f91210d = eVar;
                        obj = eVar;
                    }
                } catch (Throwable th) {
                    SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.listener.ChattingUIStatusListenerProvider");
                    throw th;
                }
            }
        }
        C33717e eVar2 = (C33717e) obj;
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.listener.ChattingUIStatusListenerProvider");
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.listener.ChattingUIStatusListenerProvider");
        return eVar2;
    }

    public Object getQualifierAttribute(String str) {
        SnsMethodCalculate.markStartTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.listener.ChattingUIStatusListenerProvider");
        if ("creator".equals(str)) {
            Class<Void> cls = Void.class;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.listener.ChattingUIStatusListenerProvider");
            return cls;
        } else if ("accountAware".equals(str)) {
            Boolean bool = Boolean.FALSE;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.listener.ChattingUIStatusListenerProvider");
            return bool;
        } else if ("onProcess".equals(str)) {
            List list = Collections.EMPTY_LIST;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.listener.ChattingUIStatusListenerProvider");
            return list;
        } else {
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.listener.ChattingUIStatusListenerProvider");
            return null;
        }
    }

    public boolean hasKey(Object obj) {
        SnsMethodCalculate.markStartTimeMs("hasKey", "com.tencent.mm.feature.sns.listener.ChattingUIStatusListenerProvider");
        if (Objects.equals(obj, ChattingUIStatusEvent.class)) {
            SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.feature.sns.listener.ChattingUIStatusListenerProvider");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.feature.sns.listener.ChattingUIStatusListenerProvider");
        return false;
    }

    public boolean hasNoKeys() {
        SnsMethodCalculate.markStartTimeMs("hasNoKeys", "com.tencent.mm.feature.sns.listener.ChattingUIStatusListenerProvider");
        SnsMethodCalculate.markEndTimeMs("hasNoKeys", "com.tencent.mm.feature.sns.listener.ChattingUIStatusListenerProvider");
        return false;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.feature.sns.listener.ChattingUIStatusListenerProvider");
        String str = "provider " + C33717e.class.getName();
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.feature.sns.listener.ChattingUIStatusListenerProvider");
        return str;
    }
}
