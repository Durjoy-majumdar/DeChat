package hg2;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75584h4;
import eb0.C75592q0;
import te3.C101801kd0;
import te3.C101834rc0;
import te3.C101835rd0;

/* renamed from: hg2.e */
public class C98451e {
    /* renamed from: a */
    public static boolean m127894a(DoFavoriteEvent doFavoriteEvent, C75584h4 h4Var, int i) {
        if (doFavoriteEvent == null || h4Var == null) {
            Log.m105928w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or readerAppInfo is null");
            if (doFavoriteEvent == null) {
                return false;
            }
            doFavoriteEvent.f264674d.f264687l = C0966R.string.f360421co1;
            return false;
        }
        C101801kd0 kd02 = new C101801kd0();
        C101835rd0 rd02 = new C101835rd0();
        C101834rc0 rc02 = new C101834rc0();
        rd02.mo141275k("newsapp");
        rd02.mo141279o(C75592q0.m90789s());
        rd02.mo141279o(C75592q0.m90789s());
        rd02.mo141277m(1);
        rd02.mo141273f(h4Var.f222044i);
        rd02.f299358s = h4Var.f222051p + "";
        rd02.f299359t = true;
        rd02.mo141276l(h4Var.mo105926h());
        rd02.f299344B = "newsapp";
        rd02.f299345C = true;
        rc02.mo141242Q(h4Var.mo105926h());
        rc02.mo141246U(h4Var.mo105924f());
        rc02.mo141265u(h4Var.mo105923d());
        rc02.mo141267w(h4Var.mo105922c());
        rc02.mo141231E(true);
        rc02.mo141232F(true);
        rc02.mo141260p(5);
        kd02.mo141219q(rd02);
        kd02.f298618f.add(rc02);
        doFavoriteEvent.f264674d.f264680e = h4Var.mo105924f();
        DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
        aVar.f264676a = kd02;
        aVar.f264678c = 5;
        return true;
    }
}
