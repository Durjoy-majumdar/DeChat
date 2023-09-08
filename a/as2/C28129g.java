package as2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: as2.g */
public enum C28129g implements C38174i<C92085f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77574d;

    public Object get() {
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsnProvider");
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsnProvider");
        Object obj = this.f77574d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f77574d;
                    if (obj == obj2) {
                        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsnProvider");
                        C92085f fVar = new C92085f();
                        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsnProvider");
                        this.f77574d = fVar;
                        obj = fVar;
                    }
                } catch (Throwable th) {
                    SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsnProvider");
                    throw th;
                }
            }
        }
        C92085f fVar2 = (C92085f) obj;
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsnProvider");
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsnProvider");
        return fVar2;
    }

    public Object getQualifierAttribute(String str) {
        SnsMethodCalculate.markStartTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsnProvider");
        if ("creator".equals(str)) {
            Class<Void> cls = Void.class;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsnProvider");
            return cls;
        } else if ("accountAware".equals(str)) {
            Boolean bool = Boolean.FALSE;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsnProvider");
            return bool;
        } else if ("onProcess".equals(str)) {
            List list = Collections.EMPTY_LIST;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsnProvider");
            return list;
        } else {
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsnProvider");
            return null;
        }
    }

    public boolean hasKey(Object obj) {
        SnsMethodCalculate.markStartTimeMs("hasKey", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsnProvider");
        if (Objects.equals(obj, "SnsAd")) {
            SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsnProvider");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsnProvider");
        return false;
    }

    public boolean hasNoKeys() {
        SnsMethodCalculate.markStartTimeMs("hasNoKeys", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsnProvider");
        SnsMethodCalculate.markEndTimeMs("hasNoKeys", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsnProvider");
        return false;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsnProvider");
        String str = "provider " + C92085f.class.getName();
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsnProvider");
        return str;
    }
}
