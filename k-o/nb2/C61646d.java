package nb2;

import gy3.C87412m;
import hb2.C59822f;
import jq3.C9493c;

/* renamed from: nb2.d */
public final class C61646d implements C9493c {

    /* renamed from: d */
    public C59822f f175298d;

    public C61646d(C59822f fVar) {
        C87412m.m108594g(fVar, "mv");
        this.f175298d = fVar;
    }

    /* renamed from: c */
    public int mo75c() {
        return 0;
    }

    public long getItemId() {
        C59822f fVar = this.f175298d;
        Long l = fVar.f170753a;
        if (l != null) {
            return l.longValue();
        }
        Long l2 = fVar.f170755c;
        if (l2 != null) {
            return l2.longValue();
        }
        return 0;
    }
}
