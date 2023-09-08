package p279yl;

import android.content.Context;
import ap3.C27996a;
import ap3.C27997b;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p159gw.C8462g;
import p523fp.C32147e;
import zt3.C119157j;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: yl.c */
public class C39030c extends C86301e {

    /* renamed from: yl.c$a */
    public class C39031a implements Runnable {
        public C39031a() {
        }

        public void run() {
            Log.m105924i("MicroMsg.AccountService", "onAccountPostReset is to make ContactBlackListHelper Cache");
            C8462g gVar = (C8462g) C86312j.m106911c(C8462g.class);
            gVar.mo9267og();
            gVar.mo9266gt();
            C39030c cVar = C39030c.this;
            cVar.getClass();
            C27997b.f77270b.mo55747a(C27997b.C27998a.HEAVY_USER_CONTACT, new C39033d(cVar));
            C27997b.f77270b.mo55747a(C27997b.C27998a.HEAVY_USER_SESSION, new C39034e(cVar));
            C27997b.f77270b.mo55747a(C27997b.C27998a.HEAVY_USER_STORAGE, new C39035f(cVar));
            C27997b.f77270b.mo55747a(C27997b.C27998a.HEAVY_USER_GAME, new C39036g(cVar));
        }
    }

    /* renamed from: yl.c$b */
    public class C39032b implements Runnable {
        public C39032b() {
        }

        public void run() {
            C39030c.this.getClass();
            C27997b bVar = C27997b.f77270b;
            bVar.getClass();
            ArrayList arrayList = new ArrayList();
            for (C27997b.C27998a aVar : ((HashMap) bVar.f77271a).keySet()) {
                C27996a aVar2 = (C27996a) ((HashMap) bVar.f77271a).get(aVar);
                if (aVar2 != null) {
                    arrayList.add(aVar2);
                }
            }
            Iterator it = arrayList.iterator();
            boolean z = false;
            while (it.hasNext()) {
                C27996a aVar3 = (C27996a) it.next();
                if (aVar3.mo55746a()) {
                    z = true;
                    if (aVar3.f77269a.equals("HEAVY_USER_CONTACT")) {
                        C115669n.INSTANCE.mo175913w(1987, 10, 1);
                    } else if (aVar3.f77269a.equals("HEAVY_USER_SESSION")) {
                        C115669n.INSTANCE.mo175913w(1987, 11, 1);
                    } else if (aVar3.f77269a.equals("HEAVY_USER_STORAGE")) {
                        C115669n.INSTANCE.mo175913w(1987, 12, 1);
                    } else if (aVar3.f77269a.equals("HEAVY_USER_GAME")) {
                        C115669n.INSTANCE.mo175913w(1987, 13, 1);
                    }
                }
            }
            if (z) {
                C115669n.INSTANCE.mo175913w(1987, 1, 1);
            } else {
                C115669n.INSTANCE.mo175913w(1987, 2, 1);
            }
        }
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        ((C32147e) C86312j.m106911c(C32147e.class)).Yi0(43);
        ((C119157j) C119157j.f356862d).mo183875f(new C39031a());
        if (MMApplicationContext.isMainProcess()) {
            ((C119157j) C119157j.f356862d).mo183878i(new C39032b(), 60000);
        }
    }
}
