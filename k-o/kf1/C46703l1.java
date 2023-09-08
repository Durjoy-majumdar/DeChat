package kf1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C75592q0;
import hp3.C87581a;
import java.util.LinkedList;
import ob0.C89132b;
import pe3.C89349b;
import rx3.C13604l;
import te3.C51994xm0;

/* renamed from: kf1.l1 */
public final class C46703l1<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C61028h1 f125727a;

    public C46703l1(C61028h1 h1Var) {
        this.f125727a = h1Var;
    }

    public Object call(Object obj) {
        T t;
        String str;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        byte[] bArr = null;
        if (cVar == null) {
            Log.m105920e("Finder.FavListDrawerPresenter", "refreshData resp null");
            return new C13604l(Boolean.FALSE, null);
        } else if (cVar.f256793a != 0 || cVar.f256794b != 0 || (t = cVar.f256796d) == null) {
            return new C13604l(Boolean.FALSE, null);
        } else {
            this.f125727a.f173800f = ((C51994xm0) t).f144745e;
            this.f125727a.f173801g = ((C51994xm0) cVar.f256796d).f144747g;
            StringBuilder sb = new StringBuilder();
            sb.append("refreshData lastBuffer ");
            if (this.f125727a.f173800f == null) {
                str = "null";
            } else {
                C89349b bVar = this.f125727a.f173800f;
                if (bVar != null) {
                    bArr = bVar.mo123703f();
                }
                str = MD5Util.getMD5String(bArr);
            }
            sb.append(str);
            sb.append(" totalCount ");
            sb.append(this.f125727a.f173801g);
            Log.m105924i("Finder.FavListDrawerPresenter", sb.toString());
            boolean z = true;
            this.f125727a.mo85988k(((C51994xm0) cVar.f256796d).f144746f == 1);
            LinkedList linkedList = new LinkedList();
            C72996z1 g = C75592q0.m90777g();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("contact: ");
            if (g != null) {
                z = false;
            }
            sb4.append(z);
            sb4.append(", canShowLikeEdu:");
            this.f125727a.getClass();
            sb4.append(false);
            Log.m105924i("Finder.FavListDrawerPresenter", sb4.toString());
            linkedList.addAll(((C51994xm0) cVar.f256796d).f144744d);
            return new C13604l(Boolean.TRUE, linkedList);
        }
    }
}
