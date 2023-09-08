package com.tencent.p014mm.plugin.sns.p104ad.widget.living;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import rq2.C101425k;
import te3.C49364f2;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.living.a */
public class C94762a {

    /* renamed from: c */
    public static volatile C94762a f274429c;

    /* renamed from: a */
    public final Map<String, Integer> f274430a = new ArrayMap();

    /* renamed from: b */
    public final Map<String, WeakReference<C94763a>> f274431b = new ArrayMap();

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.living.a$a */
    public interface C94763a {
        /* renamed from: b */
        void mo130554b(String str, int i, int i2);
    }

    /* renamed from: a */
    public static void m120034a(String str, C94763a aVar) {
        SnsMethodCalculate.markStartTimeMs("addStatusChangedListener", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
        try {
            m120035b().mo130552e(str, aVar);
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("addStatusChangedListener", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
    }

    /* renamed from: b */
    public static C94762a m120035b() {
        SnsMethodCalculate.markStartTimeMs("instance", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
        if (f274429c == null) {
            synchronized (C94762a.class) {
                try {
                    if (f274429c == null) {
                        f274429c = new C94762a();
                    }
                } catch (Throwable th) {
                    SnsMethodCalculate.markEndTimeMs("instance", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
                    throw th;
                }
            }
        }
        C94762a aVar = f274429c;
        SnsMethodCalculate.markEndTimeMs("instance", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
        return aVar;
    }

    /* renamed from: c */
    public static int m120036c(String str, int i) {
        SnsMethodCalculate.markStartTimeMs("optLivingStatus", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
        int i2 = 0;
        try {
            C94762a b = m120035b();
            b.getClass();
            SnsMethodCalculate.markStartTimeMs("getLivingStatus", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
            Integer num = (Integer) ((ArrayMap) b.f274430a).get(str);
            if (num != null) {
                int intValue = num.intValue();
                SnsMethodCalculate.markEndTimeMs("getLivingStatus", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
                i2 = intValue;
            } else {
                SnsMethodCalculate.markEndTimeMs("getLivingStatus", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
            }
            if (i2 == 0) {
                if (i == 1) {
                    i2 = 257;
                } else if (i == 2) {
                    i2 = 770;
                }
            }
            SnsMethodCalculate.markEndTimeMs("optLivingStatus", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
            return i2;
        } catch (Throwable unused) {
            SnsMethodCalculate.markEndTimeMs("optLivingStatus", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
            return 0;
        }
    }

    /* renamed from: d */
    public static int m120037d(String str, List<C49364f2> list) {
        int i;
        SnsMethodCalculate.markStartTimeMs("parseAndPutLivingStatus", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
        C49364f2 f2Var = null;
        try {
            Iterator<C49364f2> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C49364f2 next = it.next();
                if (next.f133246d == 2) {
                    f2Var = next;
                    break;
                }
            }
            if (f2Var != null) {
                String str2 = f2Var.f133247e;
                SnsMethodCalculate.markStartTimeMs("parseLivingStatus", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
                i = new JSONObject(str2).optInt("liveStatus", 0);
                SnsMethodCalculate.markEndTimeMs("parseLivingStatus", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
                Log.m105918d("SnsAd.LivingStatusManager", "parseAndPutLivingStatus:: the sns id is " + str + ", the living status is " + i);
                m120035b().mo130553f(str, i);
                SnsMethodCalculate.markEndTimeMs("parseAndPutLivingStatus", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
                return i;
            }
            Log.m105918d("SnsAd.LivingStatusManager", "parseAndPutLivingStatus:: the sns id is " + str + " and the living item is null!!");
            SnsMethodCalculate.markEndTimeMs("parseAndPutLivingStatus", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
            return 0;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: g */
    public static void m120038g(String str, int i) {
        SnsMethodCalculate.markStartTimeMs("saveLivingStatus", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
        try {
            if (!TextUtils.isEmpty(str)) {
                m120035b().mo130553f(str, i);
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("saveLivingStatus", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
    }

    /* renamed from: e */
    public void mo130552e(String str, C94763a aVar) {
        SnsMethodCalculate.markStartTimeMs("putListener", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (aVar != null && !TextUtils.isEmpty(str)) {
            SnsMethodCalculate.markStartTimeMs("isKeyAndValueExist", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
            WeakReference weakReference = (WeakReference) ((ArrayMap) this.f274431b).get(str);
            boolean z = weakReference != null && aVar == weakReference.get();
            SnsMethodCalculate.markEndTimeMs("isKeyAndValueExist", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
            if (!z) {
                SnsMethodCalculate.markStartTimeMs("clearExpiredListeners", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
                if (C101425k.m133101e(this.f274431b)) {
                    try {
                        Iterator it = ((ArrayMap) this.f274431b).entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            if (entry == null || entry.getValue() == null || ((WeakReference) entry.getValue()).get() == null) {
                                it.remove();
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                SnsMethodCalculate.markEndTimeMs("clearExpiredListeners", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
                if (!C101425k.m133098b(this.f274431b)) {
                    String str2 = null;
                    Iterator it4 = ((ArrayMap) this.f274431b).entrySet().iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        Map.Entry entry2 = (Map.Entry) it4.next();
                        WeakReference weakReference2 = (WeakReference) entry2.getValue();
                        if (weakReference2 != null && weakReference2.get() == aVar) {
                            str2 = (String) entry2.getKey();
                            break;
                        }
                    }
                    if (str2 != null) {
                        ((ArrayMap) this.f274431b).remove(str2);
                    }
                }
                ((ArrayMap) this.f274431b).put(str, new WeakReference(aVar));
                Log.m105918d("SnsAd.LivingStatusManager", "addStatusChangedListener new take times is " + (SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos) + "ns");
                SnsMethodCalculate.markEndTimeMs("putListener", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
                return;
            }
        }
        Log.m105924i("SnsAd.LivingStatusManager", "the input sns id or listener is invalid, or there is same key-value of them.");
        SnsMethodCalculate.markEndTimeMs("putListener", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
    }

    /* renamed from: f */
    public final void mo130553f(String str, int i) {
        WeakReference weakReference;
        C94763a aVar;
        SnsMethodCalculate.markStartTimeMs("putLivingStatus", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
        Integer num = (Integer) ((ArrayMap) this.f274430a).put(str, Integer.valueOf(i));
        if (!((num != null && num.equals(Integer.valueOf(i))) || (weakReference = (WeakReference) ((ArrayMap) this.f274431b).get(str)) == null || (aVar = (C94763a) weakReference.get()) == null)) {
            aVar.mo130554b(str, num != null ? num.intValue() : 0, i);
        }
        SnsMethodCalculate.markEndTimeMs("putLivingStatus", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusManager");
    }
}
