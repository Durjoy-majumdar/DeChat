package ve1;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import er1.C58684b;
import er1.C58739j4;
import fe1.C58961d;
import gy3.C87412m;
import hp3.C87581a;
import jq3.C60905o;
import nj3.C76879j;
import ob0.C89132b;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C50008jm0;
import vp1.C65834e;

/* renamed from: ve1.v */
public final class C14653v<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C60905o f40530a;

    /* renamed from: b */
    public final /* synthetic */ long f40531b;

    public C14653v(C60905o oVar, long j) {
        this.f40530a = oVar;
        this.f40531b = j;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (cVar == null) {
            Log.m105924i("Finder.FeedMsgNotifyConvert", "get feed detail result is null");
            return C76879j.m92738i(this.f40530a.f173499A, C0966R.string.d_8, 0);
        }
        int i = cVar.f256793a;
        if (!(i == 0 && cVar.f256794b == 0) && !C58739j4.f168176a.mo83681J(i, cVar.f256794b)) {
            int i2 = cVar.f256794b;
            return i2 == -4011 ? C76879j.m92738i(this.f40530a.f173499A, C0966R.string.f360503d90, 0) : i2 == -4033 ? C76879j.m92738i(this.f40530a.f173499A, C0966R.string.d_8, 0) : C13598b0.f38549a;
        }
        FinderObject finderObject = ((C50008jm0) cVar.f256796d).f136184e;
        if (finderObject == null) {
            return null;
        }
        long j = this.f40531b;
        C60905o oVar = this.f40530a;
        Log.m105924i("Finder.FeedMsgNotifyConvert", "get feed detail success");
        C58961d.C58963b bVar = C58961d.f168673a;
        if (!bVar.mo84160g(finderObject.username)) {
            FinderContact finderContact = new FinderContact();
            FinderContact finderContact2 = finderObject.contact;
            finderContact.username = finderContact2 != null ? finderContact2.username : null;
            finderContact.nickname = finderContact2 != null ? finderContact2.nickname : null;
            finderContact.headUrl = finderContact2 != null ? finderContact2.headUrl : null;
            C58961d.C58963b.m68837m(bVar, finderContact, false, 2, (Object) null);
        }
        C65834e.f189316a.mo89878l(FinderItem.Companion.mo79056a(finderObject, 32), C65834e.C65836b.f189330j);
        Intent intent = new Intent();
        intent.putExtra("feed_object_id", j);
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        Context context = oVar.f173499A;
        C87412m.m108593f(context, "holder.context");
        C13442s8.C13443a.m12791e(aVar, context, intent, 0, (String) null, 0, 0, false, 0, 252, (Object) null);
        Context context2 = oVar.f173499A;
        C87412m.m108593f(context2, "holder.context");
        ((C58684b) C86312j.m106911c(C58684b.class)).Sx0(context2, intent);
        return C13598b0.f38549a;
    }
}
