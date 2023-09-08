package d51;

import com.tencent.p014mm.app.C80625v0;
import di3.C86301e;
import e51.C31421i;
import ei3.C86522b;
import f40.C86709a0;
import i51.C33205c;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: d51.f */
public class C31075f extends C86301e implements C31421i {

    /* renamed from: d */
    public volatile C33205c f83331d;

    /* renamed from: nJ */
    public C33205c mo57972nJ() {
        if (this.f83331d == null) {
            synchronized (this) {
                if (this.f83331d == null) {
                    this.f83331d = new C33205c(C86709a0.m107535s().f251811i);
                }
            }
        }
        return this.f83331d;
    }
}
