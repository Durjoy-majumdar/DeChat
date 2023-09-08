package rs1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.viewmodel.component.C56711j;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C31543z5;
import ej0.C86525c;
import j20.C117292a;
import java.util.ArrayList;
import l31.C61212e;
import o40.C61926c;
import rx3.C13604l;
import sx3.C90364q0;
import te3.C49712hj1;

/* renamed from: rs1.g8 */
public final class C63554g8 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C56711j f180239d;

    public C63554g8(C56711j jVar) {
        this.f180239d = jVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f180239d.getContext());
        Integer num = null;
        C49712hj1 q3 = f != null ? f.mo12861q3() : null;
        C61212e eVar = (C61212e) C86312j.m106911c(C61212e.class);
        C13604l[] lVarArr = new C13604l[5];
        lVarArr[0] = new C13604l("view_id", "projection_break");
        lVarArr[1] = new C13604l("feed_id", C61926c.m72691p(this.f180239d.f162607y));
        if (q3 != null) {
            num = Integer.valueOf(q3.f134675i);
        }
        lVarArr[2] = new C13604l("comment_scene", num);
        lVarArr[3] = new C13604l("projection_source", Integer.valueOf(this.f180239d.f162580D));
        lVarArr[4] = new C13604l("projection_time", Long.valueOf(C31543z5.m39453c() - this.f180239d.f162581E));
        eVar.mo86168ix("view_clk", C90364q0.m113147f(lVarArr), 25496);
        C56711j jVar = this.f180239d;
        jVar.getClass();
        Log.m105924i("FinderProjectionScreenUIC", "breakDevice: " + jVar.f162605w);
        C86525c cVar = jVar.f162605w;
        if (cVar == null) {
            jVar.mo80098l3();
        } else {
            cVar.mo121003e(new C63618q8(jVar));
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
