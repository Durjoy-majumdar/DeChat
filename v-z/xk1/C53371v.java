package xk1;

import a14.C53930o0;
import android.content.Context;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import fj1.C45795b;
import gy3.C87412m;
import hp3.C87581a;
import java.util.concurrent.CancellationException;
import nj3.C76879j;
import nj3.C76912y0;
import o40.C61926c;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C49430fj0;
import te3.C52120yi0;

/* renamed from: xk1.v */
public final class C53371v<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C66355w f150190a;

    /* renamed from: b */
    public final /* synthetic */ C45795b f150191b;

    public C53371v(C66355w wVar, C45795b bVar) {
        this.f150190a = wVar;
        this.f150191b = bVar;
    }

    public Object call(Object obj) {
        String str;
        String str2;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Class cls = C66331m.class;
        C39818r rVar = C39818r.f106831a;
        boolean z = true;
        C53930o0.m60558e(((C66331m) rVar.mo62443b(this.f150190a.getContext()).mo75002a(cls)).mo90443d3().getSecurityDataScope(), (CancellationException) null, 1, (Object) null);
        boolean z2 = false;
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            C66355w wVar = this.f150190a;
            wVar.f191018E = ((C52120yi0) cVar.f256796d).f145309g;
            String str3 = wVar.f191025d;
            Log.m105924i(str3, "not_pass_openid_to_game:" + ((C52120yi0) cVar.f256796d).f145309g);
            C39622i0 a = rVar.mo62444c(this.f150190a.getActivity()).mo75002a(cls);
            C87412m.m108593f(a, "UICProvider.of(activity)…stContextUIC::class.java)");
            C66331m mVar = (C66331m) a;
            C66355w wVar2 = this.f150190a;
            if (wVar2.f191040v != 1) {
                C52120yi0 yi02 = (C52120yi0) cVar.f256796d;
                if (yi02 != null && yi02.f145307e == 1) {
                    z2 = true;
                }
                if (!z2) {
                    if (yi02 == null || (str2 = yi02.f145306d) == null) {
                        str2 = "";
                    }
                    C61926c.m72656A((String) null, new C53370u(wVar2, this.f150191b, cVar, str2));
                }
            }
            String string = wVar2.getResources().getString(C0966R.string.f361634le2);
            C87412m.m108593f(string, "resources.getString(R.st…livesuccess_pagesubtitle)");
            wVar2.mo90465n3(true, C0966R.string.f361635le3, string);
        } else {
            this.f150190a.mo90462k3().setEnabled(true);
            C66355w wVar3 = this.f150190a;
            int i = cVar.f256794b;
            T t = cVar.f256796d;
            C87412m.m108593f(t, "it.resp");
            C52120yi0 yi03 = (C52120yi0) t;
            wVar3.getClass();
            if (i == -200196) {
                C49430fj0 fj02 = yi03.f145308f;
                if (fj02 != null) {
                    wVar3.mo90463l3(fj02);
                }
            } else if (i == -200093) {
                if (wVar3.mo90464m3()) {
                    str = wVar3.getResources().getString(C0966R.string.le6, new Object[]{Integer.valueOf(C0966R.string.le_)});
                } else {
                    str = wVar3.getResources().getString(C0966R.string.le6, new Object[]{Integer.valueOf(C0966R.string.le4)});
                }
                C87412m.m108593f(str, "if (isMiniGameLive()) {\n…icense)\n                }");
                wVar3.mo90465n3(false, C0966R.string.g7i, str);
            } else if (i != -200057) {
                z = false;
            } else {
                C76879j.m92707A(wVar3.getContext(), wVar3.getContext().getString(C0966R.string.f361633le1), "", wVar3.getContext().getString(C0966R.string.a18), "", C38735x.f104505d, C38736y.f104506d);
            }
            if (!z) {
                C76912y0.makeText((Context) this.f150190a.getContext(), (int) C0966R.string.dnr, 0).show();
            }
        }
        return C13598b0.f38549a;
    }
}
