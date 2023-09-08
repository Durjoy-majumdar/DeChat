package mx1;

import a14.C53916l;
import ax1.C39639c;
import ax1.C39641d;
import cx1.C45223e;
import gy3.C87412m;
import java.util.Map;
import kotlin.Result;

/* renamed from: mx1.b */
public final class C47121b implements C39639c.C39640a {

    /* renamed from: a */
    public final /* synthetic */ String f126614a;

    /* renamed from: b */
    public final /* synthetic */ C53916l<C45223e> f126615b;

    public C47121b(String str, C53916l<? super C45223e> lVar) {
        this.f126614a = str;
        this.f126615b = lVar;
    }

    /* renamed from: a */
    public final void mo62195a(Map<String, C39641d> map) {
        C39641d dVar = map.get(this.f126614a);
        if (dVar != null) {
            String userName = dVar.getUserName();
            C87412m.m108593f(userName, "contact.userName");
            String nickName = dVar.getNickName();
            C87412m.m108593f(nickName, "contact.nickName");
            String avatarUrl = dVar.getAvatarUrl();
            C87412m.m108593f(avatarUrl, "contact.avatarUrl");
            this.f126615b.resumeWith(Result.m168114constructorimpl(new C45223e(userName, nickName, avatarUrl)));
            return;
        }
        this.f126615b.resumeWith(Result.m168114constructorimpl((Object) null));
    }
}
