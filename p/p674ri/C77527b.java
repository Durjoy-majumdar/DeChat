package p674ri;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.roomsdk.model.factory.C72940a;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f62.C31950v0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import p530fx.C45819c;
import p654pw.C100971c;
import pg3.C47504d;

/* renamed from: ri.b */
public final class C77527b implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C77520a f226043d;

    /* renamed from: e */
    public final /* synthetic */ C47504d f226044e;

    /* renamed from: f */
    public final /* synthetic */ List<String> f226045f;

    /* renamed from: g */
    public final /* synthetic */ List<String> f226046g;

    /* renamed from: h */
    public final /* synthetic */ List<String> f226047h;

    public C77527b(C77520a aVar, C47504d dVar, List<String> list, List<String> list2, List<String> list3) {
        this.f226043d = aVar;
        this.f226044e = dVar;
        this.f226045f = list;
        this.f226046g = list2;
        this.f226047h = list3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (C72996z1.m85807K5(this.f226043d.f226030b)) {
            C77520a aVar = this.f226043d;
            String str = this.f226044e.f127466h;
            C87412m.m108593f(str, "scene.getChatroomName()");
            aVar.mo107679e(str, this.f226045f);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f226046g);
        arrayList.addAll(this.f226047h);
        C77520a aVar2 = this.f226043d;
        aVar2.getClass();
        C72940a h = ((C45819c) C86312j.m106911c(C45819c.class)).mo71192mK(aVar2.f226030b).mo71497h(aVar2.f226030b, arrayList, 0, aVar2.f226032d);
        h.f212613b = new C77530f(aVar2);
        h.f212614c = new C77531g(aVar2);
        h.mo100867d(aVar2.f226029a, aVar2.mo107677c(C0966R.string.a3h), aVar2.mo107677c(C0966R.string.f361213i71), true, true, new C77532h(h));
        ((C31950v0) C86312j.m106911c(C31950v0.class)).mo58434ql(1);
        C77520a aVar3 = this.f226043d;
        ((C100971c) C86312j.m106911c(C100971c.class)).Jf0(aVar3.f226033e, aVar3.f226030b);
    }
}
