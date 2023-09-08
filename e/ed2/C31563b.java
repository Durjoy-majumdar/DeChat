package ed2;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.storage.C30757l4;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import u90.C37355b;
import u90.C37356d;
import u90.C78140c;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: ed2.b */
public class C31563b extends C86301e implements C78140c {

    /* renamed from: d */
    public C30757l4 f84365d;

    public C37355b ab0() {
        C86709a0.m107523b().mo121108c();
        if (this.f84365d == null) {
            C86709a0.m107528h();
            this.f84365d = new C30757l4(C86709a0.m107535s().f251811i, C37356d.f98772t, "NotifyMessageRecord", (String[]) null);
        }
        return this.f84365d;
    }
}
