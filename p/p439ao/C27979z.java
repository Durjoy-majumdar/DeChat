package p439ao;

import com.tencent.p014mm.storage.C19607d1;
import com.tencent.p014mm.storage.C19636w0;
import com.tencent.p014mm.storage.p0$$f;
import com.tencent.p014mm.storage.p0$$i;
import dx0.C31332a;
import p007bo.C16798c;
import p007bo.C16801f;

/* renamed from: ao.z */
public class C27979z implements p0$$i, C19607d1.C19609b {

    /* renamed from: ao.z$a */
    public class C27980a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Object f77233d;

        public C27980a(C27979z zVar, Object obj) {
            this.f77233d = obj;
        }

        public void run() {
            C19636w0.m21161c();
            if ((this.f77233d instanceof C19607d1) && C16801f.f45399a.mo17845e()) {
                C16798c.f45395a.mo17835a();
            }
        }
    }

    /* renamed from: p */
    public void mo25747p(Object obj, p0$$f p0__f) {
        C31332a.m39373a("UpdateBizMainCellThread", new C27980a(this, obj), 0);
    }
}
