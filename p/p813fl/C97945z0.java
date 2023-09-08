package p813fl;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30769q2;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import p490dl.C97489o;
import sx3.C64186f0;
import te3.C49978jd3;

/* renamed from: fl.z0 */
public final class C97945z0 extends C97887a {

    /* renamed from: d */
    public final List<EmojiInfo> f287283d;

    /* renamed from: e */
    public int f287284e;

    /* renamed from: f */
    public boolean f287285f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97945z0(C97928r rVar, boolean z) {
        super(rVar);
        C87412m.m108594g(rVar, "groupInfo");
        if (!mo137256c()) {
            this.f287283d = C64186f0.f181907d;
            this.f287179c.add(new C97897d0(rVar.f287256b));
            return;
        }
        if (z) {
            this.f287283d = C64186f0.f181907d;
        } else {
            this.f287283d = C97489o.m125592g().mo136765f(rVar.f287256b.field_productID);
            C49978jd3 c = C97489o.m125592g().mo136762c(rVar.f287256b.field_productID);
            if (c != null) {
                C97903f0 f0Var = this.f287178b;
                f0Var.f287198c = c;
                f0Var.f287199d = C30769q2.C30770a.f82743a.mo57693a(c.f136019d).mo57692a();
                this.f287285f = this.f287178b.f287199d;
            }
            this.f287179c.add(this.f287178b);
        }
        this.f287284e = this.f287283d.size();
        for (EmojiInfo gVar : this.f287283d) {
            this.f287179c.add(new C97904g(gVar, 2, (String) null, 0, 12, (C8480h) null));
        }
    }

    /* renamed from: c */
    public final boolean mo137256c() {
        C97923p pVar = this.f287177a;
        C87412m.m108592e(pVar, "null cannot be cast to non-null type com.tencent.mm.emoji.model.panel.EmojiPanelGroupItemGroup");
        return ((C97928r) pVar).f287256b.field_sync == 2 || Util.isEqual(((C97928r) this.f287177a).f287256b.field_productID, "17");
    }

    public int getDataCount() {
        return this.f287284e;
    }
}
