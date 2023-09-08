package com.tencent.p014mm.plugin.sns.model;

import a70.C112760b;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C96983o3;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import te3.C101804kv2;
import vr2.C102236a0;
import vr2.C102268v;

/* renamed from: com.tencent.mm.plugin.sns.model.t */
public class C94946t implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ List f275210d;

    /* renamed from: e */
    public final /* synthetic */ int f275211e;

    /* renamed from: f */
    public final /* synthetic */ C96983o3 f275212f;

    /* renamed from: g */
    public final /* synthetic */ C94901o f275213g;

    /* renamed from: com.tencent.mm.plugin.sns.model.t$a */
    public class C94947a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f275214d;

        public C94947a(String str) {
            this.f275214d = str;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$5$1");
            new C94963w(C102236a0.m134780y(0, this.f275214d), this.f275214d, C94946t.this.f275210d).mo131292d("");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$5$1");
        }
    }

    public C94946t(C94901o oVar, List list, int i, C96983o3 o3Var) {
        this.f275213g = oVar;
        this.f275210d = list;
        this.f275211e = i;
        this.f275212f = o3Var;
    }

    public void run() {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$5");
        long currentTicks = Util.currentTicks();
        C102268v vVar = new C102268v((List<C101804kv2>) this.f275210d);
        vVar.mo141833e(C102236a0.m134721P(this.f275210d));
        vVar.mo141832d(this.f275211e);
        int i = 0;
        boolean z2 = true;
        while (true) {
            int i2 = 5;
            if (i >= this.f275210d.size() || i >= 4) {
                long ticksToNow = Util.ticksToNow(currentTicks);
            } else {
                C101804kv2 kv22 = (C101804kv2) this.f275210d.get(i);
                C94853e Vx0 = C94866e1.Vx0();
                String str = kv22.f298689d;
                Vx0.getClass();
                SnsMethodCalculate.markStartTimeMs("checkMediaIdDownloading", "com.tencent.mm.plugin.sns.model.DownloadManager");
                synchronized (Vx0.f274820g) {
                    try {
                        if (((ConcurrentHashMap) Vx0.f274827n).containsKey(C102236a0.m134714I(1, str))) {
                            SnsMethodCalculate.markEndTimeMs("checkMediaIdDownloading", "com.tencent.mm.plugin.sns.model.DownloadManager");
                        } else {
                            if (((ConcurrentHashMap) Vx0.f274827n).containsKey(C102236a0.m134714I(5, str))) {
                                SnsMethodCalculate.markEndTimeMs("checkMediaIdDownloading", "com.tencent.mm.plugin.sns.model.DownloadManager");
                            } else {
                                SnsMethodCalculate.markEndTimeMs("checkMediaIdDownloading", "com.tencent.mm.plugin.sns.model.DownloadManager");
                                z = false;
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        while (true) {
                            SnsMethodCalculate.markEndTimeMs("checkMediaIdDownloading", "com.tencent.mm.plugin.sns.model.DownloadManager");
                            throw th;
                        }
                    }
                }
                if (!z) {
                    if (!C86013q1.m106450k(C94938q1.m120518e(C94866e1.m120262YO(), kv22.f298689d) + C102236a0.m134729X(kv22))) {
                        if (!C86013q1.m106450k(C94938q1.m120518e(C94866e1.m120262YO(), kv22.f298689d) + C102236a0.m134717L(kv22))) {
                            if (!C86013q1.m106450k(C94938q1.m120518e(C94866e1.m120262YO(), kv22.f298689d) + C102236a0.m134731Z(kv22))) {
                                C94853e Vx02 = C94866e1.Vx0();
                                if (kv22.f298690e != 6) {
                                    i2 = 1;
                                }
                                Vx02.mo130979d(kv22, i2, vVar, this.f275212f);
                            }
                        }
                    }
                    i++;
                }
                z2 = false;
                i++;
            }
        }
        long ticksToNow2 = Util.ticksToNow(currentTicks);
        if (ticksToNow2 > 100) {
            StringBuilder sb = new StringBuilder();
            sb.append("fileexist check2  endtime ");
            sb.append(ticksToNow2);
            sb.append(" ");
            sb.append(Thread.currentThread().getName());
            sb.append(" ");
            sb.append(C112760b.m154230f0());
            sb.append(" ");
            C94866e1.Ex0();
            sb.append("");
            sb.append(" ");
            sb.append(vVar.mo141831c());
            Log.m105924i("MicroMsg.LazyerImageLoader2", sb.toString());
        }
        C94901o oVar = this.f275213g;
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        long j = oVar.f274995a;
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (Util.ticksToNow(j) > 60000) {
            C115669n nVar = C115669n.INSTANCE;
            C94866e1.Ex0();
            nVar.mo160131h(11696, 1, Long.valueOf(ticksToNow2), 0, Thread.currentThread().getName(), "", C112760b.m154230f0());
            C94901o oVar2 = this.f275213g;
            long currentTicks2 = Util.currentTicks();
            SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            oVar2.f274995a = currentTicks2;
            SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        }
        String P = C102236a0.m134721P(this.f275210d);
        if (z2) {
            C94866e1.ly0().post(new C94947a(P));
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$5");
    }
}
