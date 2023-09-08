package com.tencent.p014mm.pluginsdk.model;

import com.tencent.p014mm.pluginsdk.model.C19449k;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import jc0.C21210b;
import zt3.C119157j;

/* renamed from: com.tencent.mm.pluginsdk.model.m */
public final class C19456m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f54981d;

    /* renamed from: e */
    public final /* synthetic */ long f54982e;

    /* renamed from: f */
    public final /* synthetic */ C21210b f54983f;

    public C19456m(String str, long j, C21210b bVar) {
        this.f54981d = str;
        this.f54982e = j;
        this.f54983f = bVar;
    }

    public final void run() {
        HashMap<String, C19449k.C19451b> hashMap;
        C19449k.C19451b bVar;
        if (!(this.f54981d.length() == 0) && (bVar = hashMap.get(this.f54981d)) != null) {
            C19449k.C19450a aVar = bVar.f54969t.get(1);
            if (aVar == null || aVar.f54946b == 4) {
                Log.m105929w("MicroMsg.BizImageBlankReporter", "alvinluo finishAndReport id: %s TOTAL is finished", C19449k.f54939a.mo25209b(this.f54981d));
                (hashMap = C19449k.f54940b).remove(this.f54981d);
                return;
            }
            bVar.mo25214b(1, this.f54982e);
            Set<Integer> keySet = bVar.f54969t.keySet();
            C87412m.m108593f(keySet, "actionTimePointMap.keys");
            Iterator<T> it = keySet.iterator();
            loop0:
            while (true) {
                boolean z = true;
                while (true) {
                    if (it.hasNext()) {
                        Integer num = (Integer) it.next();
                        C19449k.C19450a aVar2 = bVar.f54969t.get(num);
                        if (aVar2 == null) {
                            break loop0;
                        }
                        if (aVar2.f54946b == 4) {
                            C87412m.m108593f(num, "action");
                            bVar.mo25213a(num.intValue(), aVar2.f54947c);
                        } else if (num != null && num.intValue() == 8 && !bVar.f54966q) {
                            bVar.mo25213a(num.intValue(), 0);
                            break;
                        } else if (num != null && num.intValue() == 9 && !bVar.f54966q) {
                            bVar.mo25213a(num.intValue(), 0);
                            break;
                        } else {
                            Log.m105921e("MicroMsg.BizImageBlankReporter", "alvinluo blankReportInfo fillResult invalid action: %d, id: %s", num, bVar.f54968s);
                            z = false;
                        }
                    } else {
                        bVar.f54970u = z;
                        Object[] objArr = new Object[3];
                        objArr[0] = Boolean.valueOf(z);
                        C19449k.C19450a aVar3 = bVar.f54969t.get(1);
                        objArr[1] = aVar3 != null ? Long.valueOf(aVar3.f54947c) : null;
                        objArr[2] = bVar.f54968s;
                        Log.m105919d("MicroMsg.BizImageBlankReporter", "alvinluo blankReportInfo fillResult resultValid: %b, timeTotal: %s, id: %s", objArr);
                    }
                }
            }
            C19449k.f54940b.remove(this.f54981d);
            ((C119157j) C119157j.f356862d).mo183876g(new C19457n(bVar, this.f54983f), "biz_image_blank_report");
        }
    }
}
