package kf1;

import bl3.C39818r;
import cm1.C55018j0;
import com.tencent.p014mm.plugin.finder.feed.C2829n;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58739j4;
import fe1.C58960c;
import fe1.C58961d;
import fe1.C58969q;
import fy3.C32226l;
import fy3.C32227p;
import hp3.C87581a;
import java.util.LinkedList;
import o40.C61926c;
import ob0.C89132b;
import rs1.C13317l7;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C110818d0;
import te3.C50008jm0;
import te3.C64689rq2;
import vp1.C65834e;
import wp1.C15585f;

/* renamed from: kf1.y5 */
public final class C10055y5<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C2829n f30814a;

    /* renamed from: b */
    public final /* synthetic */ C32227p<Integer, String, C13598b0> f30815b;

    /* renamed from: c */
    public final /* synthetic */ C32226l<FinderObject, C13598b0> f30816c;

    public C10055y5(C2829n nVar, C32227p<? super Integer, ? super String, C13598b0> pVar, C32226l<? super FinderObject, C13598b0> lVar) {
        this.f30814a = nVar;
        this.f30815b = pVar;
        this.f30816c = lVar;
    }

    public Object call(Object obj) {
        C13598b0 b0Var;
        FinderItem o;
        LinkedList<C64689rq2> mediaList;
        C64689rq2 rq22;
        FinderItem o2;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        int i = cVar.f256793a;
        String str = null;
        if (!(i == 0 && cVar.f256794b == 0) && !C58739j4.f168176a.mo83681J(i, cVar.f256794b)) {
            int i2 = cVar.f256794b;
            if (i2 == -4011 || i2 == -4033 || i2 == -4036 || i2 == -5002) {
                C65834e.f189316a.mo89875i(this.f30814a.f14124t);
                C32227p<Integer, String, C13598b0> pVar = this.f30815b;
                if (pVar == null) {
                    return null;
                }
                pVar.invoke(Integer.valueOf(cVar.f256794b), cVar.f256795c);
                return C13598b0.f38549a;
            }
            C32227p<Integer, String, C13598b0> pVar2 = this.f30815b;
            if (pVar2 == null) {
                return null;
            }
            pVar2.invoke(Integer.valueOf(i2), cVar.f256795c);
            return C13598b0.f38549a;
        }
        FinderObject finderObject = ((C50008jm0) cVar.f256796d).f136184e;
        if (finderObject == null) {
            return null;
        }
        C32226l<FinderObject, C13598b0> lVar = this.f30816c;
        C2829n nVar = this.f30814a;
        Log.m105924i("FinderLongVideoShareContract", "get feed detail success");
        FinderContact finderContact = new FinderContact();
        FinderContact finderContact2 = finderObject.contact;
        finderContact.username = finderContact2 != null ? finderContact2.username : null;
        finderContact.nickname = finderContact2 != null ? finderContact2.nickname : null;
        finderContact.headUrl = finderContact2 != null ? finderContact2.headUrl : null;
        finderContact.authInfo = finderContact2 != null ? finderContact2.authInfo : null;
        finderContact.extInfo = finderContact2 != null ? finderContact2.extInfo : null;
        C58961d.C58963b.m68837m(C58961d.f168673a, finderContact, false, 2, (Object) null);
        FinderItem a = FinderItem.Companion.mo79056a(finderObject, 1);
        C55018j0 j0Var = (C55018j0) C15585f.f42211a.mo14348k(a);
        if (lVar != null) {
            lVar.invoke(finderObject);
        }
        nVar.f14124t = finderObject.f164794id;
        ((C13317l7) C39818r.f106831a.mo62444c(nVar.f14111d).mo75002a(C13317l7.class)).mo12758c3("first_feedid", C61926c.m72691p(nVar.f14124t));
        String str2 = finderObject.objectNonceId;
        if (str2 == null) {
            str2 = "";
        }
        nVar.f14126v = str2;
        C65834e.f189316a.mo89878l(a, C65834e.C65836b.f189330j);
        C55018j0 j0Var2 = nVar.f14127w;
        if (j0Var2 != null) {
            j0Var2.mo3513o().setCommentCount(j0Var.mo3513o().getCommentCount());
            j0Var2.mo3513o().setLikeCount(j0Var.mo3513o().getLikeCount());
            j0Var2.mo3513o().setForwardCount(j0Var.mo3513o().getForwardCount());
            FinderContact finderContact3 = j0Var.mo3513o().getFeedObject().contact;
            if (finderContact3 != null) {
                j0Var2.mo3513o().getFeedObject().contact = finderContact3;
                j0Var2.mo3483Q(C58960c.m68834f(finderContact3, (C58969q) null, false, 3, (Object) null));
            }
            C2829n.m2663b(nVar, j0Var2, new C13604l(12, null), 0, 4, (Object) null);
            Log.m105924i("FinderLongVideoShareContract", "cache exit,refresh apart");
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            C2829n.m2663b(nVar, j0Var, (Object) null, 0, 6, (Object) null);
            nVar.mo2930e().getDataListJustForAdapter().clear();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[loadFirstFeed] feed=");
        C55018j0 j0Var3 = nVar.f14127w;
        sb.append((j0Var3 == null || (o2 = j0Var3.mo3513o()) == null) ? null : Long.valueOf(o2.getId()));
        sb.append(" => ");
        C55018j0 j0Var4 = nVar.f14127w;
        sb.append((j0Var4 == null || (o = j0Var4.mo3513o()) == null || (mediaList = o.getMediaList()) == null || (rq22 = (C64689rq2) C110818d0.m150916N(mediaList)) == null) ? null : rq22.f185266d);
        sb.append(" updateFeed=");
        sb.append(j0Var.mo3513o().getId());
        sb.append(" => ");
        C64689rq2 rq23 = (C64689rq2) C110818d0.m150916N(j0Var.mo3513o().getMediaList());
        if (rq23 != null) {
            str = rq23.f185266d;
        }
        sb.append(str);
        Log.m105924i("FinderLongVideoShareContract", sb.toString());
        C61926c.m72668M(new C10041x5(nVar));
        return C13598b0.f38549a;
    }
}
