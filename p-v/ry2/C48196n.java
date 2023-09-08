package ry2;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import m02.C46940b;
import nj3.C76879j;
import ob0.C89137b0;
import qo3.C89779i0;
import rx3.C13598b0;
import rx3.C13604l;
import rz2.C48212k;
import sx3.C26236u;
import sy2.C48507a;
import uy2.C52660e;
import uy2.C52665g;
import vy2.C78495a;
import xy2.C53476g;
import xy2.C53477h;
import z04.C112551y;

/* renamed from: ry2.n */
public final class C48196n implements C32228q<View, Integer, C52660e, C13598b0> {

    /* renamed from: d */
    public C32224a<C13598b0> f129169d;

    /* renamed from: e */
    public C89779i0 f129170e;

    public C48196n(C32224a<C13598b0> aVar, int i, C8480h hVar) {
        this.f129169d = (i & 1) != 0 ? null : aVar;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        ((Number) obj2).intValue();
        C52660e eVar = (C52660e) obj3;
        Class cls = C53477h.class;
        C87412m.m108594g(view, "view");
        C87412m.m108594g(eVar, "item");
        boolean z = true;
        String jk = ((C46940b) C86312j.m106911c(C46940b.class)).mo72127jk(eVar.field_hash_username, 1);
        Log.m105925i("MicroMsg.TextStatus.TextStatusGreetingClickListener", "openTextStateChatting hashUserName:%s changeUserName:%s", eVar.field_hash_username, jk);
        if (!(jk == null || C112551y.m153811k(jk))) {
            Context context = view.getContext();
            C87412m.m108593f(context, "view.context");
            C87412m.m108593f(jk, "changeUserName");
            ((C53477h) C86312j.m106911c(cls)).zx0(context, jk);
        } else {
            C48212k wx02 = ((C53477h) C86312j.m106911c(cls)).wx0(eVar.field_session_id);
            if (wx02 == null || wx02.field_canTalk != 1) {
                z = false;
            }
            if (z) {
                String str = eVar.field_session_id;
                String str2 = eVar.field_encUsername;
                Context context2 = view.getContext();
                C87412m.m108593f(context2, "view.context");
                ((C53477h) C86312j.m106911c(cls)).yx0(str, str2, context2);
                C52665g.C52666a aVar = C52665g.f147055f;
                String str3 = eVar.field_session_id;
                C87412m.m108593f(str3, "item.field_session_id");
                aVar.mo73606c(str3, 102);
            } else {
                Context context3 = view.getContext();
                C7335d c = C86312j.m106911c(cls);
                C87412m.m108593f(c, "getService(TextStatusContactService::class.java)");
                C53477h hVar = (C53477h) c;
                C48195m mVar = new C48195m(this, context3, eVar);
                C87412m.m108592e(context3, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                C48507a aVar2 = new C48507a(C26236u.m33719b(new C13604l(eVar.field_session_id, eVar.field_encUsername)), false);
                C89137b0 d = C86709a0.m107524d();
                C87412m.m108593f(d, "getNetSceneQueue()");
                C78495a.m94796a(d, aVar2, (C0125s) context3, new C53476g(aVar2, mVar));
                this.f129170e = C76879j.m92722P(context3, context3.getString(C0966R.string.f360085a04), 3, context3.getString(C0966R.string.f360085a04), false, true, new C13608l(aVar2));
            }
        }
        return C13598b0.f38549a;
    }
}
