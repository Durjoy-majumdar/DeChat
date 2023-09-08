package er1;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
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

/* renamed from: er1.v */
public final class C7887v<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ String f26510a;

    /* renamed from: b */
    public final /* synthetic */ Context f26511b;

    /* renamed from: c */
    public final /* synthetic */ FinderItem f26512c;

    public C7887v(String str, Context context, FinderItem finderItem) {
        this.f26510a = str;
        this.f26511b = context;
        this.f26512c = finderItem;
    }

    public Object call(Object obj) {
        String str;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            LinkedList<FinderContact> linkedList = ((C48893bq0) cVar.f256796d).f131256d;
            C87412m.m108593f(linkedList, "it.resp.contactList");
            FinderContact finderContact = (FinderContact) C110818d0.m150916N(linkedList);
            if (finderContact == null || (str = finderContact.username) == null) {
                str = "";
            }
            C58775t tVar = C58775t.f168276a;
            HashMap<String, FinderContact> hashMap = C58775t.f168278c;
            String str2 = this.f26510a;
            LinkedList<FinderContact> linkedList2 = ((C48893bq0) cVar.f256796d).f131256d;
            C87412m.m108593f(linkedList2, "it.resp.contactList");
            hashMap.put(str2, C110818d0.m150916N(linkedList2));
            if (!Util.isNullOrNil(str)) {
                Context context = this.f26511b;
                tVar.mo83823d(str, context, this.f26512c, context);
            } else {
                Log.m105924i("Finder.FinderAtUtil", "username nil");
                C76912y0.makeText(this.f26511b, (int) C0966R.string.d1_, 0).show();
            }
        } else {
            C58775t tVar2 = C58775t.f168276a;
            Log.m105924i("Finder.FinderAtUtil", "cgi failed.");
        }
        return C13598b0.f38549a;
    }
}
