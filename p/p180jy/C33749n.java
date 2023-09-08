package p180jy;

import com.tencent.p014mm.autogen.events.PostSyncTaskEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: jy.n */
public enum C33749n implements C38174i<C33745m> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91270d;

    public Object get() {
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.feature.sns.listener.DynamicConfigUpdatedListenerProvider");
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.feature.sns.listener.DynamicConfigUpdatedListenerProvider");
        Object obj = this.f91270d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f91270d;
                    if (obj == obj2) {
                        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.feature.sns.listener.DynamicConfigUpdatedListenerProvider");
                        C33745m mVar = new C33745m();
                        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.feature.sns.listener.DynamicConfigUpdatedListenerProvider");
                        this.f91270d = mVar;
                        obj = mVar;
                    }
                } catch (Throwable th) {
                    SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.listener.DynamicConfigUpdatedListenerProvider");
                    throw th;
                }
            }
        }
        C33745m mVar2 = (C33745m) obj;
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.listener.DynamicConfigUpdatedListenerProvider");
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.listener.DynamicConfigUpdatedListenerProvider");
        return mVar2;
    }

    public Object getQualifierAttribute(String str) {
        SnsMethodCalculate.markStartTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.listener.DynamicConfigUpdatedListenerProvider");
        if ("creator".equals(str)) {
            Class<Void> cls = Void.class;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.listener.DynamicConfigUpdatedListenerProvider");
            return cls;
        } else if ("accountAware".equals(str)) {
            Boolean bool = Boolean.FALSE;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.listener.DynamicConfigUpdatedListenerProvider");
            return bool;
        } else if ("onProcess".equals(str)) {
            List list = Collections.EMPTY_LIST;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.listener.DynamicConfigUpdatedListenerProvider");
            return list;
        } else {
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.listener.DynamicConfigUpdatedListenerProvider");
            return null;
        }
    }

    public boolean hasKey(Object obj) {
        SnsMethodCalculate.markStartTimeMs("hasKey", "com.tencent.mm.feature.sns.listener.DynamicConfigUpdatedListenerProvider");
        if (Objects.equals(obj, PostSyncTaskEvent.class)) {
            SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.feature.sns.listener.DynamicConfigUpdatedListenerProvider");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.feature.sns.listener.DynamicConfigUpdatedListenerProvider");
        return false;
    }

    public boolean hasNoKeys() {
        SnsMethodCalculate.markStartTimeMs("hasNoKeys", "com.tencent.mm.feature.sns.listener.DynamicConfigUpdatedListenerProvider");
        SnsMethodCalculate.markEndTimeMs("hasNoKeys", "com.tencent.mm.feature.sns.listener.DynamicConfigUpdatedListenerProvider");
        return false;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.feature.sns.listener.DynamicConfigUpdatedListenerProvider");
        String str = "provider " + C33745m.class.getName();
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.feature.sns.listener.DynamicConfigUpdatedListenerProvider");
        return str;
    }
}
