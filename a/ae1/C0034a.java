package ae1;

import android.content.Intent;
import com.tencent.p014mm.plugin.finder.activity.topic.p051ui.FinderNewTopicUI;
import di3.C86312j;
import h81.C59774i;
import java.util.Map;
import p185kq.C10383h;
import p217oq.C11716d;
import q31.C118148a;
import rx3.C13604l;
import sx3.C90364q0;
import u24.C90599h;

/* renamed from: ae1.a */
public final class C0034a implements C118148a {

    /* renamed from: a */
    public final /* synthetic */ FinderNewTopicUI f41a;

    public C0034a(FinderNewTopicUI finderNewTopicUI) {
        this.f41a = finderNewTopicUI;
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
        return false;
    }

    /* renamed from: b */
    public final Map<String, Object> mo37b(String str) {
        Class cls = C10383h.class;
        String stringExtra = this.f41a.getIntent().getStringExtra("key_extra_info");
        if (C90599h.m113511d(stringExtra)) {
            stringExtra = C11716d.f34294a;
        }
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
        lVarArr[3] = new C13604l("extra_info", stringExtra);
        Intent intent = this.f41a.getIntent();
        lVarArr[4] = new C13604l("enter_source_info", String.valueOf(intent != null ? intent.getStringExtra("key_enter_source_info") : null));
        return C90364q0.m113147f(lVarArr);
    }
}
