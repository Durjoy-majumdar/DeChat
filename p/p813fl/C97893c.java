package p813fl;

import com.tencent.p014mm.emoji.sync.C92668a;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p490dl.C97489o;

/* renamed from: fl.c */
public final class C97893c extends C97887a {

    /* renamed from: d */
    public final List<EmojiInfo> f287182d;

    /* renamed from: e */
    public int f287183e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97893c(boolean z) {
        super(C97929r0.m126479a());
        ArrayList<EmojiInfo> b = C97489o.m125592g().mo136761b(true);
        this.f287182d = b;
        this.f287183e = b.size();
        if (!b.isEmpty()) {
            this.f287179c.add(this.f287178b);
            if (z) {
                this.f287179c.add(new C97938w(1));
            }
            C92668a.C92674f fVar = C92668a.f266699q;
            int c = fVar.mo126717a(false).mo126701c();
            int b2 = fVar.mo126717a(false).mo126700b();
            int i = 0;
            for (EmojiInfo next : b) {
                if (i >= b2) {
                    break;
                }
                if (i >= c) {
                    LinkedList<C97927q0> linkedList = this.f287179c;
                    C87412m.m108593f(next, "info");
                    C97904g gVar = r8;
                    C97904g gVar2 = new C97904g(next, 3, (String) null, 0, 12, (C8480h) null);
                    linkedList.add(gVar);
                } else {
                    LinkedList<C97927q0> linkedList2 = this.f287179c;
                    C87412m.m108593f(next, "info");
                    linkedList2.add(new C97904g(next, 1, (String) null, 0, 12, (C8480h) null));
                }
                i++;
            }
            if (C92668a.f266699q.mo126717a(false).hasMore()) {
                this.f287179c.add(new C97894c0(1));
            }
        } else if (z) {
            this.f287179c.add(new C97890b());
        }
    }

    public int getDataCount() {
        return this.f287183e;
    }
}
