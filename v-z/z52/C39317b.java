package z52;

import a62.C27810b;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.storage.C30731d4;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: z52.b */
public class C39317b extends C86301e implements C27810b {

    /* renamed from: d */
    public volatile C30731d4 f105709d;

    /* renamed from: A1 */
    public C30731d4 mo55621A1() {
        C86709a0.m107523b().mo121108c();
        if (this.f105709d == null) {
            synchronized (this) {
                if (this.f105709d == null) {
                    this.f105709d = new C30731d4(C86709a0.m107535s().f251811i);
                }
            }
        }
        return this.f105709d;
    }
}
