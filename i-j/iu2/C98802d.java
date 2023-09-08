package iu2;

import android.content.ContentValues;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdSnsInfo;
import com.tencent.p014mm.sdk.storage.mvvm.IMvvmDBProvider;
import com.tencent.p014mm.sdk.storage.mvvm.MvvmStorage;
import com.tencent.p014mm.sdk.storage.observer.StorageEventId;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent;
import fy3.C32224a;
import gu2.C98214b;
import gy3.C24560g0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import os2.C100400e0;
import p749xh.C102654l5;
import rx3.C13601g;
import rx3.C36568h;
import sx3.C64197v;

/* renamed from: iu2.d */
public final class C98802d extends MvvmStorage<C98214b> {

    /* renamed from: e */
    public static final /* synthetic */ int f289652e = 0;

    /* renamed from: d */
    public final C13601g f289653d = C36568h.m40985a(C60630a.f172740d);

    /* renamed from: iu2.d$a */
    public static final class C60630a extends C87413o implements C32224a<ArrayList<String>> {

        /* renamed from: d */
        public static final C60630a f172740d = new C60630a();

        public C60630a() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage$filterList$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage$filterList$2");
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it = C100400e0.v10(C64197v.m75537f(16, 32, 2, 8, 64, 128, 256, 512, 2048)).iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                if ((next.intValue() & 256) != 0) {
                    arrayList.add(String.valueOf(next));
                }
            }
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage$filterList$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage$filterList$2");
            return arrayList;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98802d(IMvvmDBProvider iMvvmDBProvider) {
        super(iMvvmDBProvider);
        C87412m.m108594g(iMvvmDBProvider, "dbProvider");
    }

    /* renamed from: c3 */
    public final C98214b mo138173c3(long j) {
        SnsMethodCalculate.markStartTimeMs("getBaseImproveSnsInfo", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        ContentValues contentValues = new ContentValues();
        contentValues.put("snsId", Long.valueOf(j));
        C98214b bVar = (C98214b) get(contentValues, C24560g0.m30725a(C98214b.class));
        SnsMethodCalculate.markEndTimeMs("getBaseImproveSnsInfo", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        return bVar;
    }

    /* renamed from: d3 */
    public final boolean mo138174d3(int i, StorageEventId storageEventId) {
        SnsMethodCalculate.markStartTimeMs("postADInfoUpdateEventByLocalID", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        C87412m.m108594g(storageEventId, "eventID");
        AdSnsInfo qq = C94866e1.zx0().mo139865qq(i);
        if (qq == null) {
            SnsMethodCalculate.markEndTimeMs("postADInfoUpdateEventByLocalID", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
            return false;
        }
        C98214b bVar = new C98214b();
        bVar.convertFrom(qq.convertTo(), true);
        mo138176f3(bVar, storageEventId);
        SnsMethodCalculate.markEndTimeMs("postADInfoUpdateEventByLocalID", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        return true;
    }

    /* renamed from: e3 */
    public final boolean mo138175e3(long j, StorageEventId storageEventId) {
        SnsMethodCalculate.markStartTimeMs("postADInfoUpdateEventBySnsID", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        C87412m.m108594g(storageEventId, "eventID");
        AdSnsInfo jo = C94866e1.zx0().mo139864jo(j);
        if (jo == null) {
            SnsMethodCalculate.markEndTimeMs("postADInfoUpdateEventBySnsID", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
            return false;
        }
        C98214b bVar = new C98214b();
        bVar.convertFrom(jo.convertTo(), true);
        mo138176f3(bVar, storageEventId);
        SnsMethodCalculate.markEndTimeMs("postADInfoUpdateEventBySnsID", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        return true;
    }

    /* renamed from: f3 */
    public final void mo138176f3(C98214b bVar, StorageEventId storageEventId) {
        SnsMethodCalculate.markStartTimeMs("postEvent", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        String valueOf = String.valueOf(bVar.getPrimaryKeyValue());
        getLogTag();
        StorageObserverEvent storageObserverEvent = new StorageObserverEvent(storageEventId, valueOf, "MicroMsg.Improve.DataFlow");
        storageObserverEvent.setObj(bVar);
        C102654l5.f302594Z.notify(storageObserverEvent);
        SnsMethodCalculate.markEndTimeMs("postEvent", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
    }

    /* renamed from: g3 */
    public final boolean mo138177g3(long j, StorageEventId storageEventId) {
        SnsMethodCalculate.markStartTimeMs("postUpdateEventByLocalID", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        C87412m.m108594g(storageEventId, "eventID");
        SnsMethodCalculate.markStartTimeMs("getBaseImproveSnsInfoByLocalID", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        ContentValues contentValues = new ContentValues();
        contentValues.put("rowid", Long.valueOf(j));
        C98214b bVar = (C98214b) get(contentValues, C24560g0.m30725a(C98214b.class));
        SnsMethodCalculate.markEndTimeMs("getBaseImproveSnsInfoByLocalID", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        if (bVar == null) {
            SnsMethodCalculate.markEndTimeMs("postUpdateEventByLocalID", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
            return false;
        }
        mo138176f3(bVar, storageEventId);
        SnsMethodCalculate.markEndTimeMs("postUpdateEventByLocalID", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        return true;
    }

    public String getLogTag() {
        SnsMethodCalculate.markStartTimeMs("getLogTag", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        SnsMethodCalculate.markEndTimeMs("getLogTag", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        return "MicroMsg.Improve.DataFlow";
    }

    /* renamed from: i3 */
    public final boolean mo138178i3(long j, StorageEventId storageEventId) {
        SnsMethodCalculate.markStartTimeMs("postUpdateEventBySnsID", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        C87412m.m108594g(storageEventId, "eventID");
        C98214b c3 = mo138173c3(j);
        if (c3 == null) {
            SnsMethodCalculate.markEndTimeMs("postUpdateEventBySnsID", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
            return false;
        }
        mo138176f3(c3, storageEventId);
        SnsMethodCalculate.markEndTimeMs("postUpdateEventBySnsID", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        return true;
    }
}
