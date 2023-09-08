package sb2;

import eb0.C31543z5;
import g03.C107680o;
import hb2.C59822f;

/* renamed from: sb2.r */
public final class C63842r implements C107680o {

    /* renamed from: a */
    public final /* synthetic */ C59822f f180970a;

    public C63842r(C59822f fVar) {
        this.f180970a = fVar;
    }

    public void onPause() {
        C59822f fVar = this.f180970a;
        if (fVar.f170774v > 0) {
            long j = fVar.f170775w;
            long c = C31543z5.m39453c();
            C59822f fVar2 = this.f180970a;
            fVar.f170775w = j + (c - fVar2.f170774v);
            fVar2.f170774v = 0;
        }
    }

    public void onResume() {
        C59822f fVar = this.f180970a;
        if (fVar.f170774v > 0) {
            fVar.f170775w += C31543z5.m39453c() - this.f180970a.f170774v;
        }
        this.f180970a.f170774v = C31543z5.m39453c();
    }
}
