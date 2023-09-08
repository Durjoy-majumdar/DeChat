package p871zj;

import android.os.Handler;
import android.os.Looper;
import p001ak.C54053a;
import p006bk.C54479b;
import p850ek.C58610a;
import p850ek.C58614e;

/* renamed from: zj.m */
public class C66851m {

    /* renamed from: a */
    public Handler f192026a;

    /* renamed from: b */
    public C54479b f192027b;

    /* renamed from: zj.m$a */
    public interface C66852a {
        /* renamed from: a */
        void mo90837a(C54053a aVar);
    }

    public C66851m(C54479b bVar) {
        this.f192027b = bVar;
    }

    /* renamed from: b */
    public static void m78951b(C54479b bVar, C54053a aVar) {
        if (!aVar.mo74722l()) {
            C58610a b = bVar.mo75305a(aVar).mo75811b(aVar);
            aVar.f151351h = b.f167805a + ((float) (C54479b.m61196c().f152758e * 2));
            aVar.f151352i = b.f167806b + ((float) (C54479b.m61196c().f152757d * 2));
            aVar.mo74709a();
        }
    }

    /* renamed from: a */
    public final Handler mo90857a() {
        if (this.f192026a == null) {
            try {
                this.f192026a = new Handler(Looper.getMainLooper());
            } catch (Throwable th) {
                Object[] objArr = {th};
                if (C58614e.f167821b >= 1 && C58614e.f167820a != null) {
                    C58614e.f167822c.setLength(0);
                    for (int i = 0; i < 1; i++) {
                        C58614e.f167822c.append(objArr[i]);
                    }
                    C58614e.f167820a.mo14327e("DanmakuMeasureManager", C58614e.f167822c.toString());
                }
            }
        }
        return this.f192026a;
    }
}
