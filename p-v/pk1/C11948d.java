package pk1;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import eb0.C75592q0;
import ei3.C86522b;
import gy3.C87412m;
import ht1.C8814x2;
import java.util.LinkedList;
import java.util.Map;
import pk1.C11952i;

@C86522b
/* renamed from: pk1.d */
public final class C11948d extends C86301e implements C8814x2 {
    /* renamed from: oR */
    public void mo9640oR(Intent intent) {
        C11952i.C11957d dVar;
        C87412m.m108594g(intent, "intent");
        String stringExtra = intent.getStringExtra("gift_id");
        int safeParseInt = Util.safeParseInt(intent.getStringExtra("count"));
        if (safeParseInt < 1) {
            safeParseInt = 1;
        }
        long safeParseLong = Util.safeParseLong(intent.getStringExtra("delay"));
        boolean z = Util.safeParseInt(intent.getStringExtra("isSelf")) == 1;
        String stringExtra2 = intent.getStringExtra("comboId");
        Log.m105924i("FinderLiveGiftCmd", "gift_id " + stringExtra + " count " + safeParseInt + " delay: " + safeParseLong + " isSelf:" + z + " comboId:" + stringExtra2);
        Object obj = C11973o.LOVE;
        for (Map.Entry next : C11952i.f34890c.entrySet()) {
            if (C87412m.m108589b(((C11952i.C11954b) next.getValue()).f34893a, stringExtra)) {
                obj = next.getKey();
            }
        }
        LinkedList linkedList = new LinkedList();
        C11952i iVar = C11952i.f34888a;
        C11952i.C11955c cVar = C11952i.f34891d.get(obj);
        if (cVar == null || (dVar = cVar.mo11820a(safeParseInt)) == null) {
            dVar = null;
        } else {
            dVar.f34898d = safeParseLong;
        }
        if (z && dVar != null) {
            dVar.f34900f = true;
            dVar.f34899e = C75592q0.m90783m();
        }
        if (!Util.isNullOrNil(stringExtra2) && dVar != null) {
            C87412m.m108591d(stringExtra2);
            dVar.f34897c = stringExtra2;
        }
        linkedList.offerLast(dVar);
        iVar.mo11819a(linkedList, false);
    }
}
