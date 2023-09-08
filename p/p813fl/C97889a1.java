package p813fl;

import com.tencent.p014mm.storage.C30769q2;
import com.tencent.p014mm.storage.emotion.EmojiGroupInfo;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import p490dl.C97489o;
import sx3.C64197v;
import te3.C49978jd3;

/* renamed from: fl.a1 */
public final class C97889a1 extends C97887a {

    /* renamed from: d */
    public int f287180d;

    /* renamed from: e */
    public int f287181e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97889a1(C97930s sVar, boolean z) {
        super(sVar);
        C97930s sVar2 = sVar;
        C87412m.m108594g(sVar2, "groupInfo");
        if (!z) {
            EmojiGroupInfo first = sVar2.f287258c.getFirst();
            if (first != null) {
                C49978jd3 c = C97489o.m125592g().mo136762c(first.field_productID);
                if (c != null) {
                    C97903f0 f0Var = this.f287178b;
                    f0Var.f287198c = c;
                    f0Var.f287199d = C30769q2.C30770a.f82743a.mo57693a(c.f136019d).mo57692a();
                }
                this.f287179c.add(this.f287178b);
            }
            int i = 0;
            for (T next : sVar2.f287258c) {
                int i2 = i + 1;
                if (i >= 0) {
                    EmojiGroupInfo emojiGroupInfo = (EmojiGroupInfo) next;
                    String str = sVar2.f287259d;
                    if (!(str == null || str.length() == 0) && C87412m.m108589b(sVar2.f287259d, emojiGroupInfo.field_productID)) {
                        this.f287181e = this.f287179c.size();
                    }
                    ArrayList<EmojiInfo> f = C97489o.m125592g().mo136765f(emojiGroupInfo.field_productID);
                    for (EmojiInfo emojiInfo : f) {
                        LinkedList<C97927q0> linkedList = this.f287179c;
                        C87412m.m108593f(emojiInfo, "emoji");
                        C97904g gVar = r10;
                        C97904g gVar2 = new C97904g(emojiInfo, 2, (String) null, 0, 12, (C8480h) null);
                        linkedList.add(gVar);
                    }
                    this.f287180d += f.size();
                    if (i < sVar2.f287258c.size() - 1) {
                        this.f287179c.add(new C97900e0());
                    }
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
    }

    public int getDataCount() {
        return this.f287180d;
    }
}
