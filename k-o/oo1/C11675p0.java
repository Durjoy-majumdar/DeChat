package oo1;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC;
import di3.C86312j;
import hp3.C87581a;
import java.util.ArrayList;
import java.util.LinkedList;
import nj3.C76912y0;
import ob0.C89132b;
import oo1.C11614d0;
import qo3.C89779i0;
import rx3.C13598b0;
import sx3.C64175a0;
import te3.C49098d51;
import te3.C49236e51;
import tf0.C13887q1;

/* renamed from: oo1.p0 */
public final class C11675p0<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C89779i0 f34211a;

    /* renamed from: b */
    public final /* synthetic */ C11614d0 f34212b;

    /* renamed from: c */
    public final /* synthetic */ C11614d0.C11618c f34213c;

    public C11675p0(C89779i0 i0Var, C11614d0 d0Var, C11614d0.C11618c cVar) {
        this.f34211a = i0Var;
        this.f34212b = d0Var;
        this.f34213c = cVar;
    }

    public Object call(Object obj) {
        C49236e51 e512;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        this.f34211a.dismiss();
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            Context context = this.f34212b.f34037b;
            C76912y0.m92768g(context, ((MMActivity) context).getResources().getString(C0966R.string.lrr));
            FinderProfileHeaderUIC.C3463b bVar = (FinderProfileHeaderUIC.C3463b) FinderProfileHeaderUIC.f16192h1.get(this.f34212b.f34036a);
            if (!(bVar == null || (e512 = bVar.f16272k) == null)) {
                C11614d0.C11618c cVar2 = this.f34213c;
                LinkedList<C49098d51> linkedList = e512.f132697d;
                if (linkedList != null) {
                    C64175a0.m75512t(linkedList, new C11673o0(cVar2));
                }
                e512.f132699f = e512.f132697d.size();
            }
            ((ArrayList) this.f34212b.f34045j).remove(this.f34213c);
            C11614d0.C11619d dVar = this.f34212b.f34046k;
            if (dVar != null) {
                dVar.notifyDataSetChanged();
            }
            C13887q1 q1Var = (C13887q1) C86312j.m106911c(C13887q1.class);
            String str = this.f34213c.f34065a.f132122h;
            if (str == null) {
                str = "";
            }
            q1Var.Cg0(str);
        }
        return C13598b0.f38549a;
    }
}
