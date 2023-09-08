package ie0;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import he0.C46021h;
import he0.C46027q;
import java.util.ArrayList;
import p823sg.C101611g;
import q90.C101062d;
import rx3.C13598b0;
import zt3.C119157j;

/* renamed from: ie0.x */
public final class C46230x implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f124613d;

    /* renamed from: e */
    public final /* synthetic */ boolean f124614e;

    /* renamed from: f */
    public final /* synthetic */ C46021h.C46022a f124615f;

    /* renamed from: g */
    public final /* synthetic */ C32224a<C13598b0> f124616g;

    /* renamed from: ie0.x$a */
    public static final class C46231a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C46021h.C46022a f124617d;

        /* renamed from: e */
        public final /* synthetic */ String f124618e;

        public C46231a(C46021h.C46022a aVar, String str) {
            this.f124617d = aVar;
            this.f124618e = str;
        }

        public final void run() {
            C46021h.C46022a aVar = this.f124617d;
            if (aVar != null) {
                aVar.mo33216b(this.f124618e);
            }
        }
    }

    public C46230x(String str, boolean z, C46021h.C46022a aVar, C32224a<C13598b0> aVar2) {
        this.f124613d = str;
        this.f124614e = z;
        this.f124615f = aVar;
        this.f124616g = aVar2;
    }

    public final void run() {
        ArrayList arrayList;
        C101611g<String, Integer> gVar = C46232y.f124621f;
        Integer num = (Integer) ((C101062d) gVar).mo139556b(this.f124613d);
        int intValue = num == null ? 0 : num.intValue();
        if (!this.f124614e || intValue < 3) {
            ((C119157j) C119157j.f356862d).mo183895z(new C46231a(this.f124615f, this.f124613d));
            C46232y yVar = C46232y.f124619d;
            String str = this.f124613d;
            C46021h.C46022a aVar = this.f124615f;
            if (C46232y.f124623h.get(str) == null) {
                C46232y.f124623h.put(str, new ArrayList());
            }
            if (!(aVar == null || (arrayList = C46232y.f124623h.get(str)) == null)) {
                arrayList.add(aVar);
            }
            if (C46232y.f124622g.contains(this.f124613d)) {
                Log.m105926v("MicroMsg.OpenIMKefuGetContactService", "alvinluo checkAddTask username: " + this.f124613d + " already running");
                return;
            }
            ((C101062d) gVar).mo139557c(this.f124613d, Integer.valueOf(intValue + 1));
            this.f124616g.invoke();
            return;
        }
        Log.m105921e("MicroMsg.OpenIMKefuGetContactService", "alvinluo checkAddTask getContact exceed limit: %s", this.f124613d);
        C46021h.C46022a aVar2 = this.f124615f;
        if (aVar2 != null) {
            aVar2.mo33215a((C46027q) null);
        }
    }
}
