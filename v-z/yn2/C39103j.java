package yn2;

import com.tencent.p014mm.autogen.events.ExtStartSnsServerAndCallbackOnFpSetSizeEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: yn2.j */
public enum C39103j implements C38174i<C102880i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105254d;

    public Object get() {
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListenerProvider");
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListenerProvider");
        Object obj = this.f105254d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f105254d;
                    if (obj == obj2) {
                        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListenerProvider");
                        C102880i iVar = new C102880i();
                        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListenerProvider");
                        this.f105254d = iVar;
                        obj = iVar;
                    }
                } catch (Throwable th) {
                    SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListenerProvider");
                    throw th;
                }
            }
        }
        C102880i iVar2 = (C102880i) obj;
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListenerProvider");
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListenerProvider");
        return iVar2;
    }

    public Object getQualifierAttribute(String str) {
        SnsMethodCalculate.markStartTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListenerProvider");
        if ("creator".equals(str)) {
            Class<Void> cls = Void.class;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListenerProvider");
            return cls;
        } else if ("accountAware".equals(str)) {
            Boolean bool = Boolean.FALSE;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListenerProvider");
            return bool;
        } else if ("onProcess".equals(str)) {
            List list = Collections.EMPTY_LIST;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListenerProvider");
            return list;
        } else {
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListenerProvider");
            return null;
        }
    }

    public boolean hasKey(Object obj) {
        SnsMethodCalculate.markStartTimeMs("hasKey", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListenerProvider");
        if (Objects.equals(obj, ExtStartSnsServerAndCallbackOnFpSetSizeEvent.class)) {
            SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListenerProvider");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListenerProvider");
        return false;
    }

    public boolean hasNoKeys() {
        SnsMethodCalculate.markStartTimeMs("hasNoKeys", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListenerProvider");
        SnsMethodCalculate.markEndTimeMs("hasNoKeys", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListenerProvider");
        return false;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListenerProvider");
        String str = "provider " + C102880i.class.getName();
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListenerProvider");
        return str;
    }
}
