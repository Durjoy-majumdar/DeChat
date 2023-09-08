package il1;

import ak1.C0073g0;
import ak1.C54108o;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import cj1.C54733a1;
import cl1.C54963d0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import org.json.JSONObject;
import qj1.C62660c;
import rx3.C13598b0;
import wc1.C15064b;

/* renamed from: il1.v0 */
public final class C60535v0 {

    /* renamed from: a */
    public final ViewGroup f172547a;

    /* renamed from: b */
    public final C58124b f172548b;

    /* renamed from: c */
    public final C62660c f172549c;

    /* renamed from: d */
    public final View f172550d;

    /* renamed from: e */
    public final View f172551e;

    /* renamed from: f */
    public final View f172552f;

    /* renamed from: g */
    public final View f172553g;

    /* renamed from: il1.v0$a */
    public static final class C60536a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60535v0 f172554d;

        public C60536a(C60535v0 v0Var) {
            this.f172554d = v0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleAnchorTipWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            String str = null;
            C58124b.C7172a.m7372a(this.f172554d.f172548b, C58124b.C58125b.FINDER_LIVE_LINK_MIC_ACCEPT_BATTLE, (Bundle) null, 2, (Object) null);
            C7335d c = C86312j.m106911c(C54108o.class);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5 j5Var = (C8777j5) c;
            C0073g0 g0Var = C0073g0.ANCHOR_BATTLE;
            JSONObject jSONObject = new JSONObject();
            C60535v0 v0Var = this.f172554d;
            jSONObject.putOpt("type", 3);
            C54733a1 a1Var = ((C54963d0) v0Var.f172549c.mo87684A0().mo71262a(C54963d0.class)).f154051E;
            if (a1Var != null) {
                str = a1Var.f153388a;
            }
            jSONObject.putOpt("result", str);
            C13598b0 b0Var = C13598b0.f38549a;
            C8777j5.C8778a.m8605f(j5Var, g0Var, jSONObject.toString(), (String) null, 4, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleAnchorTipWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C60535v0(ViewGroup viewGroup, C58124b bVar, C62660c cVar) {
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        C87412m.m108594g(cVar, "basePlugin");
        this.f172547a = viewGroup;
        this.f172548b = bVar;
        this.f172549c = cVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.del);
        this.f172550d = findViewById;
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.dee);
        this.f172551e = findViewById2;
        View findViewById3 = viewGroup.findViewById(C0966R.C0970id.deg);
        this.f172552f = findViewById3;
        this.f172553g = viewGroup.findViewById(C0966R.C0970id.dei);
        findViewById.setTranslationX(((float) (-C75044y4.m89990b(viewGroup.getContext()).x)) / 2.0f);
        findViewById2.setTranslationX(((float) C75044y4.m89990b(viewGroup.getContext()).x) / 2.0f);
        findViewById3.setOnClickListener(new C60536a(this));
        C15064b bVar2 = C15064b.f41199a;
        Context context = viewGroup.getContext();
        C87412m.m108593f(context, "root.context");
        float c = bVar2.mo14078c(context, 16.0f);
        ((TextView) viewGroup.findViewById(C0966R.C0970id.deo)).setTextSize(1, c);
        ((TextView) viewGroup.findViewById(C0966R.C0970id.dep)).setTextSize(1, c);
        ((TextView) viewGroup.findViewById(C0966R.C0970id.dek)).setTextSize(1, c);
        ((TextView) viewGroup.findViewById(C0966R.C0970id.dej)).setTextSize(1, c);
        Context context2 = viewGroup.getContext();
        C87412m.m108593f(context2, "root.context");
        ((TextView) viewGroup.findViewById(C0966R.C0970id.deg)).setTextSize(1, bVar2.mo14078c(context2, 14.0f));
    }

    /* renamed from: a */
    public final void mo85502a(int i) {
        this.f172547a.setVisibility(i);
    }
}
