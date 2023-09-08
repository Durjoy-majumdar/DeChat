package te2;

import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.ISqlColumn;
import com.tencent.p014mm.sdk.storage.sql.ISqlCondition;
import com.tencent.p014mm.sdk.storage.sql.SingleCondition;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import ke2.C99129c;
import o40.C61937h;
import p749xh.C102676x0;
import pe2.C100788h;
import pe3.C89349b;
import sx3.C64197v;
import te3.C50680oh;
import te3.C52281zl3;
import xe2.C102631b;
import xe2.C102633e;
import xe2.C38489c;

/* renamed from: te2.f */
public final class C101749f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C101747e f297827d;

    public C101749f(C101747e eVar) {
        this.f297827d = eVar;
    }

    public final void run() {
        Class cls = C99129c.class;
        C102633e Cx0 = ((C99129c) C86312j.m106911c(cls)).Cx0();
        MultiProcessMMKV multiProcessMMKV = Cx0.f302223f;
        long j = -1;
        if (multiProcessMMKV != null) {
            j = multiProcessMMKV.decodeLong(Cx0.f302224g, -1);
        }
        if (C31543z5.m39453c() < j) {
            C99129c cVar = (C99129c) C86312j.m106911c(cls);
            cVar.requireAccountInitialized();
            C100788h hVar = cVar.f290667t;
            long c = j - C31543z5.m39453c();
            C100788h.C100789a aVar = hVar.f295257b;
            if (aVar != null) {
                aVar.sendEmptyMessageDelayed(2, c);
            }
            Log.m105924i("MicroMsg.PreDownloadCheckPLC", "pre download cgi check time is early, will check later, timeNow:" + C31543z5.m39453c() + ", nextTime:" + j + "， quota：" + CdnLogic.queryAvailableQuota()[0]);
            this.f297827d.getClass();
            C99129c cVar2 = (C99129c) C86312j.m106911c(cls);
            cVar2.requireAccountInitialized();
            C2CMsgPreDownloader c2CMsgPreDownloader = cVar2.f290655A;
            C87412m.m108593f(c2CMsgPreDownloader, "getService(PluginPriorit…java).c2CMsgPreDownloader");
            c2CMsgPreDownloader.mo129639h(false);
            C99129c cVar3 = (C99129c) C86312j.m106911c(cls);
            cVar3.requireAccountInitialized();
            cVar3.f290655A.mo129638g();
            return;
        }
        this.f297827d.f297825f.clear();
        C50680oh ohVar = new C50680oh();
        ohVar.f139174d = 1;
        C102633e Cx02 = ((C99129c) C86312j.m106911c(cls)).Cx0();
        MultiProcessMMKV multiProcessMMKV2 = Cx02.f302223f;
        C89349b bVar = null;
        if (multiProcessMMKV2 != null) {
            byte[] decodeBytes = multiProcessMMKV2.decodeBytes(Cx02.f302225h + 1);
            if (decodeBytes != null) {
                bVar = C61937h.m72710i(decodeBytes);
            }
        }
        ohVar.f139175e = bVar;
        ohVar.f139177g = ((C99129c) C86312j.m106911c(cls)).Cx0().mo142291g3(1) - CdnLogic.queryAvailableQuota()[0];
        C99129c cVar4 = (C99129c) C86312j.m106911c(cls);
        cVar4.requireAccountInitialized();
        C102631b bVar2 = cVar4.f290673z;
        bVar2.getClass();
        SingleCondition largerEqual = C102676x0.f303110C.largerEqual((Number) Long.valueOf(C31543z5.m39453c() - 86400000));
        Column column = C102676x0.f303133y;
        ISqlCondition and = largerEqual.and(column.equal((Number) 1).mo81855or(column.equal((Number) 2)));
        Column column2 = C102676x0.f303108A;
        List<C38489c> multiQuery = C102676x0.f303129u.select((List<? extends ISqlColumn>) C64197v.m75537f(column2, C102676x0.f303134z.sum())).log("MicroMsg.C2CPreDownloadStorage").where(and.and(column2.largerThan((Number) 0)).and(C102676x0.f303109B.notEqual((Number) 1))).groupBy(column2).orderBy(column2.orderDesc()).build().multiQuery(bVar2.getDbProvider().getDB(), C38489c.class);
        LinkedList<C52281zl3> linkedList = new LinkedList<>();
        for (C38489c cVar5 : multiQuery) {
            C52281zl3 zl32 = new C52281zl3();
            zl32.f146090e = cVar5.mo61732m2();
            zl32.f146089d = cVar5.mo61731l2();
            linkedList.add(zl32);
        }
        ohVar.f139176f = linkedList;
        this.f297827d.f297825f.add(ohVar);
        C86709a0.m107524d().mo123455a(10910, this.f297827d);
        C86709a0.m107524d().mo123460f(new C48640d(this.f297827d.f297825f));
        StringBuilder sb = new StringBuilder();
        sb.append("pre download cgi check, timeNow:");
        sb.append(C31543z5.m39453c());
        sb.append(", quotaCost:");
        sb.append(ohVar.f139177g);
        sb.append("， remainQuota：");
        sb.append(CdnLogic.queryAvailableQuota()[0]);
        sb.append(", quotaAsk:");
        LinkedList<C52281zl3> linkedList2 = ohVar.f139176f;
        C87412m.m108593f(linkedList2, "bizReq.quota_asks");
        long j2 = 0;
        for (C52281zl3 zl33 : linkedList2) {
            j2 += zl33.f146090e;
        }
        sb.append(j2);
        Log.m105924i("MicroMsg.PreDownloadCheckPLC", sb.toString());
    }
}
