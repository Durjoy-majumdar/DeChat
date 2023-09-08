package rm0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.plugin.appbrand.utils.C84792x0;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import java.util.List;
import js0.C88024r;

/* renamed from: rm0.m */
public class C90043m {

    /* renamed from: d */
    public static int f258654d;

    /* renamed from: a */
    public final List<C82919r2> f258655a = new LinkedList();

    /* renamed from: b */
    public C84792x0 f258656b;

    /* renamed from: c */
    public Runnable f258657c;

    /* renamed from: rm0.m$a */
    public static class C90044a {

        /* renamed from: a */
        public static C90043m f258658a = new C90043m((C90041k) null);
    }

    public C90043m(C90041k kVar) {
        int jh02 = C90038i.f258647e.jh0();
        f258654d = jh02;
        this.f258657c = new C90041k(this);
        this.f258656b = new C84792x0((long) jh02, new C90042l(this));
    }

    /* renamed from: a */
    public boolean mo124350a(C82919r2 r2Var, C82381f fVar) {
        boolean isEmpty;
        if (C90038i.f258647e.V20()) {
            if (r2Var == null || fVar == null || !C90038i.f258647e.Ef0(fVar, r2Var)) {
                return false;
            }
            Log.m105927v("MicroMsg.SensorJsEventPublisher", "post direct event(event : %s).", r2Var.mo114779e());
            r2Var.mo115158h();
            return true;
        } else if (r2Var == null || fVar == null || !C90038i.f258647e.Ef0(fVar, r2Var)) {
            return false;
        } else {
            synchronized (this.f258655a) {
                isEmpty = this.f258655a.isEmpty();
                if (this.f258655a.isEmpty()) {
                    ((LinkedList) this.f258655a).add(r2Var);
                } else if (((C82919r2) ((LinkedList) this.f258655a).get(0)).equals(r2Var)) {
                    ((LinkedList) this.f258655a).add(0, r2Var);
                    ((LinkedList) this.f258655a).remove(1);
                } else {
                    ((LinkedList) this.f258655a).remove(r2Var);
                    ((LinkedList) this.f258655a).add(r2Var);
                }
            }
            if (!isEmpty || this.f258656b.mo117507a(new Object[0])) {
                return true;
            }
            Log.m105927v("MicroMsg.SensorJsEventPublisher", "post delay publish event(event : %s).", r2Var.mo114779e());
            C88024r.m109571a().mo122468a(this.f258657c, (long) f258654d);
            return true;
        }
    }
}
