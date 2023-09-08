package kf1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import hp3.C87581a;
import java.util.LinkedList;
import ob0.C89132b;
import pe3.C89349b;
import te3.C51994xm0;

/* renamed from: kf1.i1 */
public final class C46702i1<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C61028h1 f125726a;

    public C46702i1(C61028h1 h1Var) {
        this.f125726a = h1Var;
    }

    public Object call(Object obj) {
        T t;
        String str;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (cVar == null) {
            Log.m105920e("Finder.FavListDrawerPresenter", "loadMoreData resp null");
            return new LinkedList();
        } else if (cVar.f256793a != 0 || cVar.f256794b != 0 || (t = cVar.f256796d) == null) {
            return new LinkedList();
        } else {
            C61028h1 h1Var = this.f125726a;
            boolean z = true;
            if (((C51994xm0) t).f144746f != 1) {
                z = false;
            }
            h1Var.mo85988k(z);
            this.f125726a.f173800f = ((C51994xm0) cVar.f256796d).f144745e;
            StringBuilder sb = new StringBuilder();
            sb.append("loadMoreData after lastBuffer ");
            if (this.f125726a.f173800f == null) {
                str = "null";
            } else {
                C89349b bVar = this.f125726a.f173800f;
                str = MD5Util.getMD5String(bVar != null ? bVar.mo123703f() : null);
            }
            sb.append(str);
            Log.m105924i("Finder.FavListDrawerPresenter", sb.toString());
            return ((C51994xm0) cVar.f256796d).f144744d;
        }
    }
}
