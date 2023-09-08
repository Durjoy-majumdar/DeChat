package p813fl;

import com.tencent.p014mm.emoji.sync.C92668a;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p490dl.C97489o;
import u61.C101964h;

/* renamed from: fl.e */
public final class C97899e extends C97887a {

    /* renamed from: d */
    public final List<EmojiInfo> f287191d;

    /* renamed from: e */
    public int f287192e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97899e(boolean z, boolean z2) {
        super(C97929r0.m126480b());
        ArrayList<EmojiInfo> a = C97489o.m125592g().mo136760a();
        this.f287191d = a;
        this.f287192e = a.size();
        this.f287179c.add(this.f287178b);
        if (z) {
            this.f287179c.add(new C97938w(0));
        }
        C92668a.C92674f fVar = C92668a.f266699q;
        int c = fVar.mo126718b(false).mo126701c();
        int b = fVar.mo126718b(false).mo126700b();
        int i = 0;
        for (EmojiInfo next : a) {
            if (z2 || !C101964h.m134228j(next)) {
                if (i >= b) {
                    break;
                }
                if (i >= c) {
                    LinkedList<C97927q0> linkedList = this.f287179c;
                    C87412m.m108593f(next, "info");
                    linkedList.add(new C97904g(next, 3, (String) null, 0, 12, (C8480h) null));
                } else {
                    LinkedList<C97927q0> linkedList2 = this.f287179c;
                    C87412m.m108593f(next, "info");
                    linkedList2.add(new C97904g(next, 0, (String) null, 0, 12, (C8480h) null));
                }
                i++;
            }
        }
        if (C92668a.f266699q.mo126718b(false).hasMore()) {
            this.f287179c.add(new C97894c0(0));
        }
    }

    public int getDataCount() {
        return this.f287192e;
    }
}
