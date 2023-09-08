package yh0;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.storage.C30740g;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: yh0.b */
public class C39021b extends C86301e {

    /* renamed from: d */
    public volatile C30740g f105084d;

    public static C39021b wx0() {
        return (C39021b) C86312j.m106911c(C39021b.class);
    }

    public C30740g vx0() {
        C86709a0.m107523b().mo121108c();
        if (this.f105084d == null) {
            synchronized (this) {
                if (this.f105084d == null) {
                    this.f105084d = new C30740g(C86709a0.m107535s().f251811i);
                }
            }
        }
        return this.f105084d;
    }
}
