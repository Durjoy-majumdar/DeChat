package fp2;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.magicbrush.C30211n0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import ei3.C31607a;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: fp2.e */
public enum C32152e implements C38174i<C32150d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85473d;

    /* renamed from: fp2.e$a */
    public static final class C32153a {

        /* renamed from: a */
        public static final List<Object> f85474a = null;

        static {
            f85474a = Arrays.asList(new Object[]{C30211n0.class});
        }
    }

    /* renamed from: fp2.e$b */
    public static final class C32154b {

        /* renamed from: a */
        public static final List<Object> f85475a = null;

        static {
            f85475a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND1});
        }
    }

    public Object get() {
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureServiceProvider");
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureServiceProvider");
        Object obj = this.f85473d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f85473d;
                    if (obj == obj2) {
                        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureServiceProvider");
                        C32150d dVar = new C32150d();
                        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureServiceProvider");
                        this.f85473d = dVar;
                        obj = dVar;
                    }
                } catch (Throwable th) {
                    SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureServiceProvider");
                    throw th;
                }
            }
        }
        C32150d dVar2 = (C32150d) obj;
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureServiceProvider");
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureServiceProvider");
        return dVar2;
    }

    public Object getQualifierAttribute(String str) {
        SnsMethodCalculate.markStartTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureServiceProvider");
        if ("creator".equals(str)) {
            Class<Void> cls = Void.class;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureServiceProvider");
            return cls;
        } else if ("dependencies".equals(str)) {
            List<Object> list = C32153a.f85474a;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureServiceProvider");
            return list;
        } else if ("onProcess".equals(str)) {
            List<Object> list2 = C32154b.f85475a;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureServiceProvider");
            return list2;
        } else {
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureServiceProvider");
            return null;
        }
    }

    public boolean hasKey(Object obj) {
        SnsMethodCalculate.markStartTimeMs("hasKey", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureServiceProvider");
        if (Objects.equals(obj, C31607a.ON_SPLASH)) {
            SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureServiceProvider");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureServiceProvider");
        return false;
    }

    public boolean hasNoKeys() {
        SnsMethodCalculate.markStartTimeMs("hasNoKeys", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureServiceProvider");
        SnsMethodCalculate.markEndTimeMs("hasNoKeys", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureServiceProvider");
        return false;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureServiceProvider");
        String str = "provider " + C32150d.class.getName();
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureServiceProvider");
        return str;
    }
}
