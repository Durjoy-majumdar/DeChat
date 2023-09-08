package xs1;

import android.content.Context;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import ok1.C62042e;
import vs1.C15003o;

/* renamed from: xs1.p */
public final class C15889p extends ClickableSpan {

    /* renamed from: d */
    public final /* synthetic */ C15883o f42766d;

    public C15889p(C15883o oVar) {
        this.f42766d = oVar;
    }

    public void onClick(View view) {
        Class cls = C54991o.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/vote/plugin/FinderLiveVoteCardPlugin$setRestartVoteSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        C87412m.m108594g(view, "widget");
        C55001u uVar = (C55001u) this.f42766d.mo87696x0(C55001u.class);
        C15883o oVar = this.f42766d;
        Log.m105924i("FinderLiveVoteCardPlugin", "voteInfo clear by restart");
        oVar.mo10792g(8);
        oVar.mo14534b1(8);
        C58124b.C7172a.m7372a(oVar.f42750p, C58124b.C58125b.FINDER_LIVE_VOTE_BUBBLE_HIDE, (Bundle) null, 2, (Object) null);
        C54991o oVar2 = (C54991o) oVar.mo87696x0(cls);
        oVar2.f154275W3 = null;
        oVar2.f154280X3 = false;
        oVar2.f154285Y3 = false;
        C15003o oVar3 = oVar.f42744A;
        if (oVar3 != null) {
            oVar3.f41122f.clear();
            oVar3.notifyDataSetChanged();
        }
        C62042e eVar = C62042e.f176370a;
        Context context = oVar.f166287d.getContext();
        C87412m.m108593f(context, "root.context");
        eVar.mo87012I0(context, uVar.f154420q.f182392d, uVar.f154416j, uVar.f154423t, ((C54991o) oVar.mo87696x0(cls)).f154345o);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/vote/plugin/FinderLiveVoteCardPlugin$setRestartVoteSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    public void updateDrawState(TextPaint textPaint) {
        C87412m.m108594g(textPaint, "ds");
        textPaint.setColor(this.f42766d.f166287d.getContext().getResources().getColor(C0966R.color.f3417s5));
        textPaint.setUnderlineText(false);
        textPaint.clearShadowLayer();
    }
}
