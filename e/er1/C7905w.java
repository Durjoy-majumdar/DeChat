package er1;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import hp3.C87581a;
import java.util.HashMap;
import java.util.LinkedList;
import nj3.C76912y0;
import ob0.C89132b;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C48893bq0;

/* renamed from: er1.w */
public final class C7905w<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ String f26561a;

    /* renamed from: b */
    public final /* synthetic */ Context f26562b;

    /* renamed from: c */
    public final /* synthetic */ String f26563c;

    public C7905w(String str, Context context, String str2) {
        this.f26561a = str;
        this.f26562b = context;
        this.f26563c = str2;
    }

    public Object call(Object obj) {
        String str;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            LinkedList<FinderContact> linkedList = ((C48893bq0) cVar.f256796d).f131256d;
            C87412m.m108593f(linkedList, "it.resp.contactList");
            FinderContact finderContact = (FinderContact) C110818d0.m150916N(linkedList);
            String str2 = "";
            if (finderContact == null || (str = finderContact.username) == null) {
                str = str2;
            }
            C58775t tVar = C58775t.f168276a;
            HashMap<String, FinderContact> hashMap = C58775t.f168278c;
            String str3 = this.f26561a;
            LinkedList<FinderContact> linkedList2 = ((C48893bq0) cVar.f256796d).f131256d;
            C87412m.m108593f(linkedList2, "it.resp.contactList");
            hashMap.put(str3, C110818d0.m150916N(linkedList2));
            if (!Util.isNullOrNil(str)) {
                Context context = this.f26562b;
                tVar.mo83824e(str, context, context);
                C115669n nVar = C115669n.INSTANCE;
                StringBuilder sb = new StringBuilder();
                sb.append("0,2,");
                sb.append(this.f26561a);
                sb.append(",1,");
                String str4 = this.f26563c;
                if (str4 != null) {
                    str2 = str4;
                }
                sb.append(str2);
                nVar.kvStat(21172, sb.toString());
            } else {
                Log.m105924i("Finder.FinderAtUtil", "username nil");
                C76912y0.makeText(this.f26562b, (int) C0966R.string.d1_, 0).show();
                C115669n nVar2 = C115669n.INSTANCE;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("0,2,");
                sb4.append(this.f26561a);
                sb4.append(",2,");
                String str5 = this.f26563c;
                if (str5 != null) {
                    str2 = str5;
                }
                sb4.append(str2);
                nVar2.kvStat(21172, sb4.toString());
            }
        } else {
            C58775t tVar2 = C58775t.f168276a;
            Log.m105924i("Finder.FinderAtUtil", "cgi failed.");
        }
        return C13598b0.f38549a;
    }
}
