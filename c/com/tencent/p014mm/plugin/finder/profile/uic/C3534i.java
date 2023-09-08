package com.tencent.p014mm.plugin.finder.profile.uic;

import android.app.Activity;
import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import er1.C58775t;
import er1.C7905w;
import fe1.C58969q;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import je1.C9369r0;
import nj3.C76912y0;
import p823sg.C101614i;
import rx3.C13598b0;
import sx3.C26236u;

/* renamed from: com.tencent.mm.plugin.finder.profile.uic.i */
public final class C3534i extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileHeaderUIC f16389d;

    /* renamed from: e */
    public final /* synthetic */ C58969q f16390e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3534i(FinderProfileHeaderUIC finderProfileHeaderUIC, C58969q qVar) {
        super(1);
        this.f16389d = finderProfileHeaderUIC;
        this.f16390e = qVar;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, "nickname");
        Log.m105924i("Finder.FinderProfileHeaderUIC", "jumpAtProfileUIOfSignature nickname:" + str);
        FinderProfileHeaderUIC finderProfileHeaderUIC = this.f16389d;
        C101614i<String, FinderProfileHeaderUIC.C3463b> iVar = FinderProfileHeaderUIC.f16192h1;
        if (!finderProfileHeaderUIC.mo3815T3()) {
            C58775t tVar = C58775t.f168276a;
            Activity context = this.f16389d.getContext();
            String username = this.f16390e.getUsername();
            if (context != null) {
                HashMap<String, FinderContact> hashMap = C58775t.f168278c;
                if (hashMap.containsKey(str)) {
                    FinderContact finderContact = hashMap.get(str);
                    String str2 = finderContact != null ? finderContact.username : null;
                    if (Util.isNullOrNil(str2) || str2 == null) {
                        Log.m105924i("Finder.FinderAtUtil", "username nil");
                        C76912y0.makeText((Context) context, (int) C0966R.string.d1_, 0).show();
                        C115669n nVar = C115669n.INSTANCE;
                        nVar.kvStat(21172, "0,2," + str + ",2," + username);
                    } else {
                        tVar.mo83824e(str2, context, context);
                        C115669n nVar2 = C115669n.INSTANCE;
                        nVar2.kvStat(21172, "0,2," + str + ",1," + username);
                    }
                } else {
                    new C9369r0(C26236u.m33719b(str)).mo9225i().mo123420E(new C7905w(str, context, username));
                }
            }
        }
        return C13598b0.f38549a;
    }
}
