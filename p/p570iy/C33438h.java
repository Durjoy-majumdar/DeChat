package p570iy;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: iy.h */
public enum C33438h implements C38174i<C33437g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90596d;

    /* renamed from: iy.h$a */
    public static final class C33439a {

        /* renamed from: a */
        public static final List<Object> f90597a = null;

        static {
            f90597a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListenerProvider");
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListenerProvider");
        Object obj = this.f90596d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f90596d;
                    if (obj == obj2) {
                        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListenerProvider");
                        C33437g gVar = new C33437g();
                        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListenerProvider");
                        this.f90596d = gVar;
                        obj = gVar;
                    }
                } catch (Throwable th) {
                    SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListenerProvider");
                    throw th;
                }
            }
        }
        C33437g gVar2 = (C33437g) obj;
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListenerProvider");
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListenerProvider");
        return gVar2;
    }

    public Object getQualifierAttribute(String str) {
        SnsMethodCalculate.markStartTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListenerProvider");
        if ("creator".equals(str)) {
            Class<Void> cls = Void.class;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListenerProvider");
            return cls;
        } else if ("accountAware".equals(str)) {
            Boolean bool = Boolean.FALSE;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListenerProvider");
            return bool;
        } else if ("onProcess".equals(str)) {
            List<Object> list = C33439a.f90597a;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListenerProvider");
            return list;
        } else {
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListenerProvider");
            return null;
        }
    }

    public boolean hasKey(Object obj) {
        SnsMethodCalculate.markStartTimeMs("hasKey", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListenerProvider");
        SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListenerProvider");
        return false;
    }

    public boolean hasNoKeys() {
        SnsMethodCalculate.markStartTimeMs("hasNoKeys", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListenerProvider");
        SnsMethodCalculate.markEndTimeMs("hasNoKeys", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListenerProvider");
        return true;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListenerProvider");
        String str = "provider " + C33437g.class.getName();
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.feature.sns.extension.SnsAppForegroundListenerProvider");
        return str;
    }
}
