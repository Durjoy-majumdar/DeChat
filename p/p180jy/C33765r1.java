package p180jy;

import com.tencent.p014mm.autogen.events.ResendSnsByUpdateXmlEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: jy.r1 */
public enum C33765r1 implements C38174i<C33761q1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91309d;

    public Object get() {
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.feature.sns.listener.ResendSnsByUpdateXmlListenerProvider");
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.feature.sns.listener.ResendSnsByUpdateXmlListenerProvider");
        Object obj = this.f91309d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f91309d;
                    if (obj == obj2) {
                        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.feature.sns.listener.ResendSnsByUpdateXmlListenerProvider");
                        C33761q1 q1Var = new C33761q1();
                        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.feature.sns.listener.ResendSnsByUpdateXmlListenerProvider");
                        this.f91309d = q1Var;
                        obj = q1Var;
                    }
                } catch (Throwable th) {
                    SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.listener.ResendSnsByUpdateXmlListenerProvider");
                    throw th;
                }
            }
        }
        C33761q1 q1Var2 = (C33761q1) obj;
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.listener.ResendSnsByUpdateXmlListenerProvider");
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.listener.ResendSnsByUpdateXmlListenerProvider");
        return q1Var2;
    }

    public Object getQualifierAttribute(String str) {
        SnsMethodCalculate.markStartTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.listener.ResendSnsByUpdateXmlListenerProvider");
        if ("creator".equals(str)) {
            Class<Void> cls = Void.class;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.listener.ResendSnsByUpdateXmlListenerProvider");
            return cls;
        } else if ("accountAware".equals(str)) {
            Boolean bool = Boolean.FALSE;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.listener.ResendSnsByUpdateXmlListenerProvider");
            return bool;
        } else if ("onProcess".equals(str)) {
            List list = Collections.EMPTY_LIST;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.listener.ResendSnsByUpdateXmlListenerProvider");
            return list;
        } else {
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.listener.ResendSnsByUpdateXmlListenerProvider");
            return null;
        }
    }

    public boolean hasKey(Object obj) {
        SnsMethodCalculate.markStartTimeMs("hasKey", "com.tencent.mm.feature.sns.listener.ResendSnsByUpdateXmlListenerProvider");
        if (Objects.equals(obj, ResendSnsByUpdateXmlEvent.class)) {
            SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.feature.sns.listener.ResendSnsByUpdateXmlListenerProvider");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.feature.sns.listener.ResendSnsByUpdateXmlListenerProvider");
        return false;
    }

    public boolean hasNoKeys() {
        SnsMethodCalculate.markStartTimeMs("hasNoKeys", "com.tencent.mm.feature.sns.listener.ResendSnsByUpdateXmlListenerProvider");
        SnsMethodCalculate.markEndTimeMs("hasNoKeys", "com.tencent.mm.feature.sns.listener.ResendSnsByUpdateXmlListenerProvider");
        return false;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.feature.sns.listener.ResendSnsByUpdateXmlListenerProvider");
        String str = "provider " + C33761q1.class.getName();
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.feature.sns.listener.ResendSnsByUpdateXmlListenerProvider");
        return str;
    }
}
