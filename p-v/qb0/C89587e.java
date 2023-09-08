package qb0;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.sdk.observer.IMvvmObserver;
import com.tencent.p014mm.sdk.observer.MvvmTypeObserverOwner;
import com.tencent.p014mm.sdk.platformtools.ListenerInstanceMonitor;
import gy3.C87412m;

/* renamed from: qb0.e */
public final class C89587e extends MvvmTypeObserverOwner<C77306a, C77307c, Integer> {
    /* renamed from: a */
    public void mo123895a(int i, C0125s sVar, String str, C77306a aVar) {
        C87412m.m108594g(sVar, "lifecycleOwner");
        C87412m.m108594g(str, "threadTag");
        C87412m.m108594g(aVar, "observer");
        super.observe(Integer.valueOf(i), sVar, str, aVar);
        ListenerInstanceMonitor.markInstanceRegistered(aVar);
    }

    public Object getAllKey() {
        return -1;
    }

    public String getLogTag() {
        return "MicroMsg.Mvvm.NetSceneObserverOwner";
    }

    public void observe(Object obj, C0125s sVar, IMvvmObserver iMvvmObserver) {
        int intValue = ((Number) obj).intValue();
        C77306a aVar = (C77306a) iMvvmObserver;
        C87412m.m108594g(sVar, "lifecycleOwner");
        C87412m.m108594g(aVar, "observer");
        super.observe(Integer.valueOf(intValue), sVar, aVar);
        ListenerInstanceMonitor.markInstanceRegistered(aVar);
    }

    public void onRemoveObserver(Object obj, IMvvmObserver iMvvmObserver) {
        ((Number) obj).intValue();
        C77306a aVar = (C77306a) iMvvmObserver;
        C87412m.m108594g(aVar, "observer");
        ListenerInstanceMonitor.markInstanceUnregistered(aVar);
    }

    public /* bridge */ /* synthetic */ void observe(Object obj, C0125s sVar, String str, IMvvmObserver iMvvmObserver) {
        mo123895a(((Number) obj).intValue(), sVar, str, (C77306a) iMvvmObserver);
    }
}
