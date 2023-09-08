package bv2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: bv2.c */
public class C92313c {

    /* renamed from: b */
    public static volatile C92313c f264149b;

    /* renamed from: a */
    public Set<C92312b> f264150a = new HashSet();

    /* renamed from: a */
    public static C92313c m116089a() {
        SnsMethodCalculate.markStartTimeMs("getInstance", "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager");
        if (f264149b == null) {
            synchronized (C92313c.class) {
                try {
                    if (f264149b == null) {
                        f264149b = new C92313c();
                    }
                } catch (Throwable th) {
                    SnsMethodCalculate.markEndTimeMs("getInstance", "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager");
                    throw th;
                }
            }
        }
        C92313c cVar = f264149b;
        SnsMethodCalculate.markEndTimeMs("getInstance", "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager");
        return cVar;
    }

    /* renamed from: b */
    public void mo126299b() {
        SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager");
        Log.m105924i("MicroMsg.SightPlayViewManager", "onUIDestroy");
        SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager");
        SnsMethodCalculate.markStartTimeMs("stopAll", "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager");
        Iterator it = ((HashSet) this.f264150a).iterator();
        while (it.hasNext()) {
            ((C92312b) it.next()).stop();
        }
        SnsMethodCalculate.markEndTimeMs("stopAll", "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager");
        ((HashSet) this.f264150a).clear();
        SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager");
        SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager");
    }

    /* renamed from: c */
    public void mo126300c() {
        SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager");
        Log.m105924i("MicroMsg.SightPlayViewManager", "onUIPause");
        Iterator it = ((HashSet) this.f264150a).iterator();
        while (it.hasNext()) {
            ((C92312b) it.next()).mo126294b();
        }
        SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager");
    }

    /* renamed from: d */
    public void mo126301d() {
        SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager");
        Iterator it = ((HashSet) this.f264150a).iterator();
        while (it.hasNext()) {
            ((C92312b) it.next()).pause();
        }
        SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager");
    }

    /* renamed from: e */
    public void mo126302e(C92312b bVar) {
        SnsMethodCalculate.markStartTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager");
        ((HashSet) this.f264150a).add(bVar);
        Iterator it = ((HashSet) this.f264150a).iterator();
        while (it.hasNext()) {
            C92312b bVar2 = (C92312b) it.next();
            if (bVar2 != bVar) {
                bVar2.pause();
            }
        }
        SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager");
    }
}
