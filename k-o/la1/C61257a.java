package la1;

import com.tencent.p014mm.autogen.events.KvReportEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import j81.C117302a;
import j81.C87906e;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import o81.C117715c;
import t81.C118403c;
import t81.C118412l;
import u24.C90599h;

/* renamed from: la1.a */
public class C61257a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ KvReportEvent f174349d;

    /* renamed from: e */
    public final /* synthetic */ C61258b f174350e;

    public C61257a(C61258b bVar, KvReportEvent kvReportEvent) {
        this.f174350e = bVar;
        this.f174349d = kvReportEvent;
    }

    public void run() {
        HashMap<String, List<C61259e>> hashMap;
        boolean z;
        C118412l lVar = C117302a.xx0().f351171d;
        KvReportEvent.C28769a aVar = this.f174349d.f78853d;
        String str = aVar.f78855b;
        int i = (int) aVar.f78854a;
        lVar.getClass();
        if (C87906e.m109416j()) {
            if (((HashMap) C117715c.wx0().f352042f).containsKey(String.valueOf(i))) {
                if (i <= 0 || C90599h.m113511d(str)) {
                    Log.m105920e("EdgeComputingDataSourceService", "[EdgeComputingDataSourceService] sendKV data or reportID isEmpty!");
                } else {
                    C87906e.m109407a("EdgeComputingDataSourceService", "[EdgeComputingDataSourceService] sendKV reportID : " + i + ", data : " + str);
                    lVar.f353895b.post(new C118403c(lVar, i, System.currentTimeMillis(), str));
                }
            }
        }
        C61258b bVar = this.f174350e;
        KvReportEvent.C28769a aVar2 = this.f174349d.f78853d;
        long j = aVar2.f78854a;
        String str2 = aVar2.f78855b;
        bVar.getClass();
        if (j != 11110 && j != 11108 && MMApplicationContext.isMMProcess() && (!Util.isNullOrNil(bVar.f174351d))) {
            C46837f fVar = new C46837f();
            fVar.f125985g = str2;
            fVar.f125983e = 10001;
            fVar.f125984f = (int) j;
            C86709a0.m107524d().mo123460f(fVar);
        }
        C61258b bVar2 = this.f174350e;
        KvReportEvent.C28769a aVar3 = this.f174349d.f78853d;
        long j2 = aVar3.f78854a;
        String str3 = aVar3.f78855b;
        if (bVar2.f174352e && (hashMap = bVar2.f174353f) != null) {
            List list = hashMap.get(j2 + "");
            if (list == null) {
                list = new LinkedList();
                z = false;
            } else {
                C61259e eVar = (C61259e) list.get(list.size() - 1);
                boolean z2 = Util.milliSecondsToNow(eVar.f174355b) < 1000;
                if (z2) {
                    eVar.f174357d = true;
                }
                z = z2;
            }
            list.add(0, new C61259e(j2, str3, Util.nowMilliSecond(), z));
            HashMap<String, List<C61259e>> hashMap2 = bVar2.f174353f;
            hashMap2.put(j2 + "", list);
        }
    }
}
