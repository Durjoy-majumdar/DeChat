package p264ww;

import com.tencent.p014mm.autogen.events.GetNewContactEvent;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import gy3.C87412m;
import java.util.ArrayList;
import xc0.C78789e;

/* renamed from: ww.e */
public final class C78731e extends IStaticListener<GetNewContactEvent> {
    public boolean callback(IEvent iEvent) {
        ArrayList arrayList;
        GetNewContactEvent getNewContactEvent = (GetNewContactEvent) iEvent;
        C87412m.m108594g(getNewContactEvent, "event");
        if (C86709a0.m107522a()) {
            GetNewContactEvent.C67712a aVar = getNewContactEvent.f193654d;
            C78728a.f230437a = aVar.f193655a;
            String str = aVar.f193656b;
            C78728a.f230438b = str;
            if (Util.isNullOrNil(str)) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                String[] split = str.split(",");
                if (split != null) {
                    for (String add : split) {
                        arrayList2.add(add);
                    }
                }
                arrayList = arrayList2;
            }
            if (arrayList != null && arrayList.size() > 0) {
                C78789e.C78790a aVar2 = C78789e.f230535a;
                LifecycleScope lifecycleScope = C86709a0.m107523b().f251755f.f123611e;
                C87412m.m108591d(lifecycleScope);
                aVar2.mo108703b(arrayList, lifecycleScope, new C78729d());
            }
            Log.m105919d("MicroMsg.ExtensionsForRemark", "GetNewContactEvent usename:%s, imgPath:%s", C78728a.f230437a, C78728a.f230438b);
        }
        return false;
    }
}
