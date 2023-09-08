package vt2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.observer.IStorageObserver;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent;
import gy3.C87412m;

/* renamed from: vt2.f */
public final class C102286f<T extends IAutoDBItem> implements IStorageObserver {

    /* renamed from: d */
    public final /* synthetic */ C102279c f301261d;

    public C102286f(C102279c cVar) {
        this.f301261d = cVar;
    }

    public void onChanged(Object obj) {
        SnsMethodCalculate.markStartTimeMs("onChanged", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$observeDBChangeEvent$1");
        StorageObserverEvent storageObserverEvent = (StorageObserverEvent) obj;
        SnsMethodCalculate.markStartTimeMs("onChanged", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$observeDBChangeEvent$1");
        C87412m.m108594g(storageObserverEvent, "event");
        C102279c cVar = this.f301261d;
        SnsMethodCalculate.markStartTimeMs("access$handleDBEvent", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        cVar.mo141842e3(storageObserverEvent);
        SnsMethodCalculate.markEndTimeMs("access$handleDBEvent", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        SnsMethodCalculate.markEndTimeMs("onChanged", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$observeDBChangeEvent$1");
        SnsMethodCalculate.markEndTimeMs("onChanged", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$observeDBChangeEvent$1");
    }
}
