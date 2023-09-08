package c60;

import android.content.Context;
import android.os.Bundle;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C7241k;
import di3.C86312j;
import gy3.C87412m;
import i60.C46169a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import te3.C50020jp2;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: c60.d */
public final class C39902d {

    /* renamed from: a */
    public static final C39902d f106987a = new C39902d();

    /* renamed from: a */
    public final void mo62509a(ArrayList<C46169a> arrayList) {
        if (arrayList.size() > 3000) {
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size() - 3000;
            for (int i = 0; i < size; i++) {
                arrayList2.add(arrayList.get(i));
            }
            arrayList.removeAll(arrayList2);
        }
    }

    /* renamed from: b */
    public final C46169a mo62510b(C50020jp2 jp22) {
        String str;
        CharSequence charSequence;
        if (!Util.isNullOrNil(jp22.f136241e)) {
            String str2 = jp22.f136241e;
            C87412m.m108593f(str2, "liveMessage.headimgurl");
            if (!C112551y.m153808h(str2, "/0", false, 2, (Object) null)) {
                jp22.f136241e += "/0";
            }
        }
        if (jp22.f136242f == 10001) {
            CharSequence TV = ((C7241k) C86312j.m106911c(C7241k.class)).mo8408TV(0, jp22.f136243g, new Bundle(), (WeakReference<Context>) null, (WeakReference<NeatTextView>) null);
            if (TV == null || (charSequence = C112550d0.m153799i0(TV)) == null) {
                return null;
            }
            int E = C112550d0.m153769E(charSequence, "：", 0, false, 6, (Object) null);
            if (E > 0) {
                str = charSequence.subSequence(0, E).toString();
                charSequence = charSequence.subSequence(E + 1, charSequence.length());
            } else {
                str = "";
            }
        } else {
            String str3 = jp22.f136243g;
            C87412m.m108593f(str3, "liveMessage.content");
            charSequence = C112550d0.m153799i0(str3).toString();
            str = jp22.f136240d;
            C87412m.m108593f(str, "liveMessage.identity_id");
        }
        String str4 = str;
        String str5 = jp22.f136241e;
        C87412m.m108593f(str5, "liveMessage.headimgurl");
        return new C46169a(str4, str5, charSequence, jp22.f136242f, jp22.f136244h);
    }

    /* renamed from: c */
    public final List<C46169a> mo62511c(List<? extends C50020jp2> list) {
        ArrayList arrayList = new ArrayList();
        for (C50020jp2 b : list) {
            C46169a b2 = f106987a.mo62510b(b);
            if (b2 != null) {
                arrayList.add(b2);
            }
        }
        return arrayList;
    }
}
