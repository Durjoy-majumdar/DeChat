package vf1;

import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderPlayListUI;
import di3.C86312j;
import h81.C59774i;
import java.util.Map;
import p185kq.C10383h;
import q31.C118148a;
import rx3.C13604l;
import sx3.C90364q0;
import zc1.C66785b;

/* renamed from: vf1.g4 */
public final class C14767g4 implements C118148a {

    /* renamed from: a */
    public final /* synthetic */ FinderPlayListUI f40744a;

    public C14767g4(FinderPlayListUI finderPlayListUI) {
        this.f40744a = finderPlayListUI;
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
        return false;
    }

    /* renamed from: b */
    public final Map<String, Object> mo37b(String str) {
        Class cls = C10383h.class;
        C13604l[] lVarArr = new C13604l[5];
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        String str2 = "";
        if (Wb == null) {
            Wb = str2;
        }
        lVarArr[0] = new C13604l("behaviour_session_id", Wb);
        String E = ((C10383h) C86312j.m106911c(cls)).mo10696E();
        if (E == null) {
            E = str2;
        }
        lVarArr[1] = new C13604l("finder_context_id", E);
        String S0 = ((C10383h) C86312j.m106911c(cls)).mo10698S0();
        if (S0 != null) {
            str2 = S0;
        }
        lVarArr[2] = new C13604l("finder_tab_context_id", str2);
        lVarArr[3] = new C13604l("ref_commentscene", Integer.valueOf(this.f40744a.getIntent().getIntExtra("key_from_comment_scene", 0)));
        lVarArr[4] = new C13604l("finder_username", C66785b.f191882e.mo90662O5());
        return C90364q0.m113147f(lVarArr);
    }
}
