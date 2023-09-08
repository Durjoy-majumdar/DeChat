package xk1;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import ft1.C59319a;
import fy3.C32224a;
import gy3.C87412m;
import hp3.C87581a;
import java.util.Iterator;
import java.util.LinkedList;
import nj3.C76912y0;
import o40.C11348f;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C48757as1;
import te3.C50169kr1;
import te3.C50336m11;
import te3.C51006qs1;
import te3.cg4;
import tf0.C13883o1;

/* renamed from: xk1.c */
public final class C66292c<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C66309g f190833a;

    /* renamed from: b */
    public final /* synthetic */ int f190834b;

    public C66292c(C66309g gVar, int i) {
        this.f190833a = gVar;
        this.f190834b = i;
    }

    public Object call(Object obj) {
        C51006qs1 qs12;
        String str;
        String str2;
        LinkedList<C51006qs1> linkedList;
        T t;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            C50336m11 m112 = (C50336m11) cVar.f256796d;
            C48757as1 as12 = null;
            if (m112 == null || (linkedList = m112.f137744d) == null) {
                qs12 = null;
            } else {
                C66309g gVar = this.f190833a;
                Iterator<T> it = linkedList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    C50169kr1 kr12 = ((C51006qs1) t).f140523e;
                    if (C87412m.m108589b(kr12 != null ? kr12.f137001d : null, gVar.f190892f)) {
                        break;
                    }
                }
                qs12 = (C51006qs1) t;
            }
            if (qs12 != null) {
                as12 = qs12.f140525g;
            }
            if (as12 == null) {
                Log.m105928w(this.f190833a.f190890d, "detail null");
                C11348f.C11349a.m11178b(C59319a.f169618b, "AUTH_ERROR_USERCONFIG_NULL", false, (C11348f.C11352b) null, false, false, (C32224a) null, 60, (Object) null);
                C76912y0.makeText((Context) this.f190833a.getContext(), (int) C0966R.string.dnr, 0).show();
            } else {
                C48757as1 as13 = qs12.f140525g;
                String str3 = "";
                if (as13 == null || (str = as13.f130749e) == null) {
                    str = str3;
                }
                if (!(as13 == null || (str2 = as13.f130748d) == null)) {
                    str3 = str2;
                }
                Intent intent = new Intent();
                intent.putExtra("COVER_URL", str);
                intent.putExtra("DESC", str3);
                intent.putExtra("TICKET", this.f190833a.f190893g);
                intent.putExtra("APPID", this.f190833a.f190892f);
                intent.putExtra("POST_FROM_SCENE", this.f190834b);
                intent.putExtra("GameUserInfo", qs12.toByteArray());
                cg4 cg4 = this.f190833a.f190896j;
                if (cg4 != null) {
                    intent.putExtra("KEY_FROM_THIRD_PARTY_SHARE", cg4.toByteArray());
                }
                ((C13883o1) C86312j.m106911c(C13883o1.class)).mo13281h6(this.f190833a.getContext(), intent);
                this.f190833a.getActivity().finish();
            }
        } else {
            Log.m105928w(this.f190833a.f190890d, "CgiFinderLiveGetUserGameConfig failed.");
            C11348f.C11349a.m11178b(C59319a.f169618b, "AUTH_ERROR_USERCONFIG_FAILED", false, (C11348f.C11352b) null, false, false, (C32224a) null, 60, (Object) null);
            C76912y0.makeText((Context) this.f190833a.getContext(), (int) C0966R.string.dnr, 0).show();
        }
        return C13598b0.f38549a;
    }
}
