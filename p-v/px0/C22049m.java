package px0;

import android.content.Context;
import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.storage.C19623o0;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60200t1;
import jq3.C60897k;
import jq3.C9493c;
import o40.C61926c;
import rx0.C22260f;
import te3.C22521pi1;
import zt3.C119157j;

/* renamed from: px0.m */
public final class C22049m implements C60897k<C22039d> {

    /* renamed from: a */
    public final /* synthetic */ C22055p f62395a;

    public C22049m(C22055p pVar) {
        this.f62395a = pVar;
    }

    /* renamed from: a */
    public boolean mo2039a(View view, C9493c cVar, int i) {
        C22039d dVar = (C22039d) cVar;
        C87412m.m108594g(view, "itemView");
        C87412m.m108594g(dVar, "data");
        boolean z = dVar.f62373d.f64430j != 2;
        C22055p pVar = this.f62395a;
        C22260f fVar = pVar.f62414a.f50954d.f51436d.f50233d;
        C19623o0 b = pVar.mo35161b();
        C22521pi1 pi12 = dVar.f62373d;
        C87412m.m108593f(fVar, "popMenuManager");
        fVar.mo35420c(view, b, pi12, i, z, true, new C22047k(this.f62395a, dVar, i), new C22048l(dVar, this.f62395a));
        return true;
    }

    /* renamed from: b */
    public boolean mo2040b(View view, MotionEvent motionEvent, C9493c cVar, int i) {
        C60897k.C9501a.m9193b(this, view, motionEvent, (C22039d) cVar, i);
        return false;
    }

    /* renamed from: c */
    public void mo2041c(View view, C9493c cVar, int i) {
        long j;
        C22039d dVar = (C22039d) cVar;
        C87412m.m108594g(view, "itemView");
        C87412m.m108594g(dVar, "data");
        ((C119157j) C119157j.f356862d).mo183876g(new C22046j(this.f62395a, dVar, i), "BizTimeLineExpose");
        C22055p pVar = this.f62395a;
        pVar.f62414a.f50954d.mo23141f(pVar.mo35161b(), i);
        C22521pi1 pi12 = dVar.f62373d;
        Intent intent = new Intent();
        String str = pi12.f64435r;
        int i2 = 0;
        if (!(str == null || str.length() == 0)) {
            j = C61926c.m72671P(pi12.f64435r);
            intent.putExtra("feed_object_id", j);
        } else {
            j = 0;
        }
        if (j == 0) {
            intent.putExtra("feedID", pi12.f64436s);
        }
        intent.putExtra("nonceID", pi12.f64437t);
        intent.putExtra("key_session_id", dVar.f62375f);
        intent.putExtra("allow_pull_top", true);
        if (pi12.f64438u == 9) {
            i2 = 1;
        }
        intent.putExtra("key_need_related_list", i2);
        intent.putExtra("from_user", pi12.f64432o);
        intent.putExtra("key_extra_info", pi12.f64416K);
        C60200t1 t1Var = (C60200t1) C86312j.m106911c(C60200t1.class);
        if (t1Var != null) {
            Context context = view.getContext();
            C87412m.m108593f(context, "itemView.context");
            t1Var.mo76787NL(26, 2, 25, context, intent, view, false);
        }
    }
}
