package com.tencent.p014mm.plugin.repairer.p099ui.demo;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.observer.IStorageObserver;
import com.tencent.p014mm.sdk.storage.observer.StorageEventId;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.i */
public final class C57230i<T extends IAutoDBItem> implements IStorageObserver {

    /* renamed from: d */
    public final /* synthetic */ RepairerMvvmDBDemoUI f163961d;

    public C57230i(RepairerMvvmDBDemoUI repairerMvvmDBDemoUI) {
        this.f163961d = repairerMvvmDBDemoUI;
    }

    public void onChanged(Object obj) {
        StorageObserverEvent storageObserverEvent = (StorageObserverEvent) obj;
        C87412m.m108594g(storageObserverEvent, "event");
        C57229h hVar = new C57229h(this.f163961d);
        if (C87412m.m108589b(storageObserverEvent.getEventId(), StorageEventId.Companion.getBATCH_EVENT())) {
            HashMap objEventMap = storageObserverEvent.getObjEventMap();
            if (objEventMap != null) {
                for (Map.Entry value : objEventMap.entrySet()) {
                    hVar.invoke(value.getValue());
                }
                return;
            }
            return;
        }
        hVar.invoke(storageObserverEvent);
    }
}
