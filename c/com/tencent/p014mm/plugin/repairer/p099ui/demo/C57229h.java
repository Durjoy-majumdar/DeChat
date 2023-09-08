package com.tencent.p014mm.plugin.repairer.p099ui.demo;

import bj2.C54471p;
import bj2.C54473v;
import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import com.tencent.p014mm.sdk.storage.observer.StorageEventId;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.h */
public final class C57229h extends C87413o implements C32226l<StorageObserverEvent<C54473v>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ RepairerMvvmDBDemoUI f163960d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57229h(RepairerMvvmDBDemoUI repairerMvvmDBDemoUI) {
        super(1);
        this.f163960d = repairerMvvmDBDemoUI;
    }

    public Object invoke(Object obj) {
        C54473v vVar;
        StorageObserverEvent storageObserverEvent = (StorageObserverEvent) obj;
        C87412m.m108594g(storageObserverEvent, "event");
        StorageEventId eventId = storageObserverEvent.getEventId();
        StorageEventId.Companion companion = StorageEventId.Companion;
        if (C87412m.m108589b(eventId, companion.getINSERT())) {
            C54473v vVar2 = (C54473v) storageObserverEvent.getObj();
            if (vVar2 != null) {
                MvvmList.m119209l((MvvmList) ((C36570n) this.f163960d.f163937f).getValue(), new C54471p(vVar2), false, 2, (Object) null);
            }
        } else if (C87412m.m108589b(eventId, companion.getUPDATE())) {
            C54473v vVar3 = (C54473v) storageObserverEvent.getObj();
            if (vVar3 != null) {
                MvvmList.m119210t((MvvmList) ((C36570n) this.f163960d.f163937f).getValue(), new C54471p(vVar3), false, 2, (Object) null);
            }
        } else if (C87412m.m108589b(eventId, companion.getDELETE()) && (vVar = (C54473v) storageObserverEvent.getObj()) != null) {
            ((MvvmList) ((C36570n) this.f163960d.f163937f).getValue()).mo129612p(new C54471p(vVar));
        }
        return C13598b0.f38549a;
    }
}
