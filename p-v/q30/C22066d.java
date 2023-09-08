package q30;

import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import k30.C99096a;
import ky2.C10432i;
import sw1.C48477m;

/* renamed from: q30.d */
public class C22066d implements C99096a.C99098b {

    /* renamed from: a */
    public final /* synthetic */ C22073k f62448a;

    public C22066d(C22073k kVar) {
        this.f62448a = kVar;
    }

    public Object getData() {
        C48477m a = C48477m.C13789a.m13091a();
        boolean z = false;
        boolean ju02 = a != null ? a.ju0(MMApplicationContext.getContext()) : false;
        boolean b = C22073k.m25483b(this.f62448a, 8388608);
        boolean e = ((C10432i) C86312j.m106911c(C10432i.class)).mo10750e();
        if (ju02 && !b && !e) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
