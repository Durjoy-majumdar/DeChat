package p570iy;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: iy.r */
public enum C33446r implements C38174i<C98891q> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90610d;

    public Object get() {
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.feature.sns.extension.SnsPostSceneEndProvider");
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.feature.sns.extension.SnsPostSceneEndProvider");
        Object obj = this.f90610d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f90610d;
                    if (obj == obj2) {
                        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.feature.sns.extension.SnsPostSceneEndProvider");
                        C98891q qVar = new C98891q();
                        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.feature.sns.extension.SnsPostSceneEndProvider");
                        this.f90610d = qVar;
                        obj = qVar;
                    }
                } catch (Throwable th) {
                    SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.extension.SnsPostSceneEndProvider");
                    throw th;
                }
            }
        }
        C98891q qVar2 = (C98891q) obj;
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.extension.SnsPostSceneEndProvider");
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.extension.SnsPostSceneEndProvider");
        return qVar2;
    }

    public Object getQualifierAttribute(String str) {
        SnsMethodCalculate.markStartTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.extension.SnsPostSceneEndProvider");
        if ("creator".equals(str)) {
            Class<Void> cls = Void.class;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.extension.SnsPostSceneEndProvider");
            return cls;
        } else if ("accountAware".equals(str)) {
            Boolean bool = Boolean.FALSE;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.extension.SnsPostSceneEndProvider");
            return bool;
        } else if ("onProcess".equals(str)) {
            List list = Collections.EMPTY_LIST;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.extension.SnsPostSceneEndProvider");
            return list;
        } else {
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.extension.SnsPostSceneEndProvider");
            return null;
        }
    }

    public boolean hasKey(Object obj) {
        SnsMethodCalculate.markStartTimeMs("hasKey", "com.tencent.mm.feature.sns.extension.SnsPostSceneEndProvider");
        if (Objects.equals(obj, 209)) {
            SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.feature.sns.extension.SnsPostSceneEndProvider");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.feature.sns.extension.SnsPostSceneEndProvider");
        return false;
    }

    public boolean hasNoKeys() {
        SnsMethodCalculate.markStartTimeMs("hasNoKeys", "com.tencent.mm.feature.sns.extension.SnsPostSceneEndProvider");
        SnsMethodCalculate.markEndTimeMs("hasNoKeys", "com.tencent.mm.feature.sns.extension.SnsPostSceneEndProvider");
        return false;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.feature.sns.extension.SnsPostSceneEndProvider");
        String str = "provider " + C98891q.class.getName();
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.feature.sns.extension.SnsPostSceneEndProvider");
        return str;
    }
}
