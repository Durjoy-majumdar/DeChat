package ko2;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import rq2.C101425k;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: ko2.c */
public class C99152c {

    /* renamed from: a */
    public Map<String, C99154b> f290721a = new ConcurrentHashMap();

    /* renamed from: b */
    public Map<String, C99153a> f290722b = new ConcurrentHashMap();

    /* renamed from: ko2.c$a */
    public static class C99153a {

        /* renamed from: a */
        public String f290723a;

        /* renamed from: b */
        public long f290724b;
    }

    /* renamed from: a */
    public C99154b mo138522a(C99154b bVar) {
        SnsMethodCalculate.markStartTimeMs("offerTask", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
        if (bVar == null || TextUtils.isEmpty(bVar.f290725a)) {
            SnsMethodCalculate.markEndTimeMs("offerTask", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
            return null;
        }
        SnsMethodCalculate.markStartTimeMs("shouldPrefetch", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
        boolean z = false;
        if (TextUtils.isEmpty(bVar.f290725a)) {
            Log.m105924i("SnsAd.H5Prefetch", "the task info is empty!");
            SnsMethodCalculate.markEndTimeMs("shouldPrefetch", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
        } else {
            if (((ConcurrentHashMap) this.f290721a).containsKey(bVar.f290725a)) {
                Log.m105924i("SnsAd.H5Prefetch", "the task key is in pending task, the task key is : " + bVar.f290725a);
                SnsMethodCalculate.markEndTimeMs("shouldPrefetch", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                C99153a aVar = (C99153a) ((ConcurrentHashMap) this.f290722b).get(bVar.f290725a);
                if (aVar == null || currentTimeMillis >= aVar.f290724b + 600000) {
                    int i = bVar.f290726b;
                    if (i == 0) {
                        SnsMethodCalculate.markStartTimeMs("shouldPrefetchOuterInfo", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
                        SnsInfo snsInfo = bVar.f290728d;
                        if (snsInfo == null || !snsInfo.isAd()) {
                            Log.m105924i("SnsAd.H5Prefetch", "the sns info is not ad!");
                            SnsMethodCalculate.markEndTimeMs("shouldPrefetchOuterInfo", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
                        } else {
                            SnsMethodCalculate.markEndTimeMs("shouldPrefetchOuterInfo", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
                            z = true;
                        }
                        SnsMethodCalculate.markEndTimeMs("shouldPrefetch", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
                    } else if (i == 1) {
                        SnsMethodCalculate.markStartTimeMs("shouldPrefetchNativeLanding", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
                        if (C101425k.m133099c(bVar.f290727c)) {
                            Log.m105924i("SnsAd.H5Prefetch", "the urls is empty!");
                            SnsMethodCalculate.markEndTimeMs("shouldPrefetchNativeLanding", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
                        } else {
                            SnsMethodCalculate.markEndTimeMs("shouldPrefetchNativeLanding", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
                            z = true;
                        }
                        SnsMethodCalculate.markEndTimeMs("shouldPrefetch", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
                    } else {
                        SnsMethodCalculate.markEndTimeMs("shouldPrefetch", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
                    }
                } else {
                    Log.m105924i("SnsAd.H5Prefetch", "the task key has been prefetch, the task key is : " + bVar.f290725a);
                    SnsMethodCalculate.markEndTimeMs("shouldPrefetch", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
                }
            }
        }
        if (z) {
            Log.m105924i("SnsAd.H5Prefetch", "the task info is to prefetch, the task key  is : " + bVar.f290725a);
            ((ConcurrentHashMap) this.f290721a).put(bVar.f290725a, bVar);
            SnsMethodCalculate.markEndTimeMs("offerTask", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
            return bVar;
        }
        SnsMethodCalculate.markEndTimeMs("offerTask", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
        return null;
    }

    /* renamed from: b */
    public final void mo138523b(C99154b bVar) {
        C119179t tVar;
        SnsMethodCalculate.markStartTimeMs("publishTask", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
        if (bVar == null || TextUtils.isEmpty(bVar.f290725a) || (tVar = C119157j.f356862d) == null) {
            Log.m105918d("SnsAd.H5Prefetch", "the task info is null");
        } else {
            ((C119157j) tVar).mo183875f(new C99151b(this, bVar.f290725a));
        }
        SnsMethodCalculate.markEndTimeMs("publishTask", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
    }

    /* renamed from: ko2.c$b */
    public static class C99154b {

        /* renamed from: a */
        public String f290725a;

        /* renamed from: b */
        public int f290726b = 0;

        /* renamed from: c */
        public String[] f290727c;

        /* renamed from: d */
        public SnsInfo f290728d;

        /* renamed from: e */
        public int f290729e;

        public C99154b(SnsInfo snsInfo, int i) {
            this.f290728d = snsInfo;
            this.f290729e = i;
            this.f290725a = m129158a(snsInfo != null ? snsInfo.getSnsId() : "", this.f290726b);
        }

        /* renamed from: a */
        public static String m129158a(String str, int i) {
            SnsMethodCalculate.markStartTimeMs("makeKey", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager$TaskInfo");
            if (str != null) {
                String str2 = str + "_" + i;
                SnsMethodCalculate.markEndTimeMs("makeKey", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager$TaskInfo");
                return str2;
            }
            String str3 = " _" + i;
            SnsMethodCalculate.markEndTimeMs("makeKey", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager$TaskInfo");
            return str3;
        }

        public C99154b(String str, String[] strArr) {
            this.f290727c = strArr;
            this.f290725a = m129158a(str, 1);
        }
    }
}
