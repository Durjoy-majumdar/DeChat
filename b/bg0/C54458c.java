package bg0;

import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C98494b;
import java.util.List;
import lp3.C46888b;
import lp3.C88643g;
import mp3.C88820e;
import op3.C117877b;
import op3.C117878c;
import zf0.C66790c;

/* renamed from: bg0.c */
public class C54458c implements C98494b<C54457b> {

    /* renamed from: a */
    public C54457b f152725a;

    /* renamed from: b */
    public final C54459a f152726b = new C54459a();

    /* renamed from: bg0.c$a */
    public class C54459a implements C88820e<C117878c<List, String, Boolean>, C117877b<Boolean, Integer>> {
        public C54459a() {
        }

        /* renamed from: a */
        public String mo55914a() {
            return "Vending.ANY";
        }

        public Object call(Object obj) {
            int i;
            C117877b bVar = (C117877b) obj;
            C54457b bVar2 = C54458c.this.f152725a;
            boolean booleanValue = ((Boolean) bVar.mo182596a(0)).booleanValue();
            int intValue = ((Integer) bVar.mo182596a(1)).intValue();
            if (!booleanValue || (i = bVar2.f152718q) <= 0) {
                i = 20;
            } else {
                bVar2.f152718q = 0;
                bVar2.f152723v = false;
            }
            int i2 = (bVar2.f152724w != intValue || i > 20) ? 20 : i;
            bVar2.f152724w = intValue;
            Log.m105925i("MicroMsg.AAQueryListInteractor", "getNextAAQueryPage, currentPageOffset: %s, force: %s", Integer.valueOf(bVar2.f152718q), Boolean.valueOf(booleanValue));
            C46888b b = C88643g.m110544b();
            b.mo72092b();
            (bVar2.f152723v ? new C66790c(i2, bVar2.f152718q, intValue, bVar2.f152719r, bVar2.f152720s, bVar2.f152721t, bVar2.f152722u) : new C66790c(i2, bVar2.f152718q, intValue)).mo9225i().mo123064p(new C54456a(bVar2, b));
            return null;
        }
    }

    public C54458c() {
        C54457b bVar = new C54457b();
        this.f152725a = bVar;
    }

    /* renamed from: a */
    public Object mo67527a() {
        return this.f152725a;
    }
}
