package p417qz;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import hd0.C98408n0;
import hd0.C98429r0;
import ic3.C98663a;
import java.util.List;
import p682rz.C101480j;
import p682rz.C101489t;

/* renamed from: qz.k$$d$$a */
public final /* synthetic */ class k$$d$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ k$$d f296826d;

    /* renamed from: e */
    public final /* synthetic */ C101489t.C77595a.C77596a f296827e;

    public /* synthetic */ k$$d$$a(k$$d k__d, C101489t.C77595a.C77596a aVar) {
        this.f296826d = k__d;
        this.f296827e = aVar;
    }

    public final void run() {
        List list;
        C101480j.C101481a aVar;
        List list2;
        boolean equals;
        k$$d k__d = this.f296826d;
        C101489t.C77595a.C77596a aVar2 = this.f296827e;
        k__d.getClass();
        String str = aVar2.f226215a;
        if (str != null && str.contains(FirebaseAnalytics.C113379b.ORIGIN)) {
            str = str.substring(0, str.indexOf(FirebaseAnalytics.C113379b.ORIGIN));
        }
        C98408n0 i = C98429r0.m127818i(str);
        if (i == null) {
            Log.m105928w("MicroMsg.ImportMultiVideoService", "notifyChanged, video info is null, file name = " + str);
            return;
        }
        long j = i.f288567n;
        synchronized (k__d.f296839d) {
            list = k__d.f296839d.f296821d.get(Long.valueOf(j));
            aVar = k__d.f296839d.f296823f.get(Long.valueOf(j));
            list2 = k__d.f296839d.f296822e.get(Long.valueOf(j));
            equals = Boolean.TRUE.equals(k__d.f296839d.f296824g.get(Long.valueOf(j)));
        }
        if (list == null || !list.contains(str)) {
            Log.m105924i("MicroMsg.ImportMultiVideoService", "notifyChanged, video is not in process, file name = " + str + " msg local id = " + j);
            return;
        }
        int i2 = i.f288562i;
        if (i2 == 199 || i2 == 198) {
            synchronized (k__d) {
                list.remove(i.mo137700d());
                Log.m105924i("MicroMsg.ImportMultiVideoService", "remove process, file name = " + i.mo137700d() + " already in process = " + list);
                if (list2 != null) {
                    list2.remove(i.mo137702f());
                }
            }
            if (aVar != null) {
                if (i2 == 199) {
                    C98663a aVar3 = new C98663a();
                    Log.m105925i("MicroMsg.ImportMultiVideoService", "on upload end, recv xml = %s", i.mo137705i());
                    aVar3.mo141099d(i.mo137705i());
                    C101319k.vx0(i, aVar3);
                    aVar.mo139225b(i.mo137700d(), aVar3);
                }
                if (i2 == 198) {
                    aVar.mo139226c(i.mo137700d());
                }
            }
            if (list.size() == 0) {
                synchronized (k__d.f296839d) {
                    k__d.f296839d.f296821d.remove(Long.valueOf(j));
                    k__d.f296839d.f296823f.remove(Long.valueOf(j));
                    k__d.f296839d.f296822e.remove(Long.valueOf(j));
                    if (k__d.f296839d.f296823f.size() == 0) {
                        Log.m105924i("MicroMsg.ImportMultiVideoService", "process list is empty. remove listener");
                    }
                }
            }
        } else if (i2 != 104 && i2 != 103) {
        } else {
            if (equals) {
                C98429r0.m127835z(str);
                Log.m105924i("MicroMsg.ImportMultiVideoService", "video has been paused at remux process, pause upload now");
            } else if (aVar != null) {
                Log.m105925i("MicroMsg.ImportMultiVideoService", "onProgress update, file name = %s, progress = %d", str, Integer.valueOf(C98429r0.m127823n(i)));
                C98663a aVar4 = new C98663a();
                C101319k.vx0(i, aVar4);
                aVar.mo139227d(i.mo137700d(), aVar4);
            }
        }
    }
}
