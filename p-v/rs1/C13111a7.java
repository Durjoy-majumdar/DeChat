package rs1;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.FinderNpsSurveyView;
import com.tencent.p014mm.plugin.finder.feed.model.C2783g0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import gy3.C87412m;
import jq3.C60898l;
import jq3.C60905o;
import te3.C50949qe1;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: rs1.a7 */
public final class C13111a7 implements C60898l.C9502b<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ C13502w6 f37321d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f37322e;

    /* renamed from: f */
    public final /* synthetic */ FinderNpsSurveyView f37323f;

    public C13111a7(C13502w6 w6Var, C60905o oVar, FinderNpsSurveyView finderNpsSurveyView) {
        this.f37321d = w6Var;
        this.f37322e = oVar;
        this.f37323f = finderNpsSurveyView;
    }

    /* renamed from: q */
    public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        C60905o oVar = (C60905o) zVar;
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(oVar, "itemHolder");
        C2783g0 g0Var = (C2783g0) oVar.f173503E;
        C50949qe1 qe12 = g0Var.f13982n;
        Log.m105924i("Finder.FinderNpsSurveyUIC", "onItemClick wording = " + g0Var.f139111e + " answerId = " + g0Var.f139110d);
        this.f37321d.mo12915V3(this.f37322e, qe12, g0Var, false);
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.kab);
        if (textView != null) {
            C60905o oVar2 = this.f37322e;
            FinderNpsSurveyView finderNpsSurveyView = this.f37323f;
            C13502w6 w6Var = this.f37321d;
            textView.setTextColor(oVar2.f173499A.getResources().getColor(C0966R.color.BW_0_Alpha_0_9));
            textView.setBackgroundResource(C0966R.C0969drawable.f5105wy);
            WxRecyclerView wxRecyclerView = finderNpsSurveyView.f13126d;
            if (wxRecyclerView != null) {
                int childCount = wxRecyclerView.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    wxRecyclerView.getChildAt(i2).setEnabled(false);
                }
            }
            C119179t tVar = C119157j.f356862d;
            C13569z6 z6Var = new C13569z6(w6Var, oVar2, qe12, g0Var);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(z6Var, 500, false);
        }
    }
}
