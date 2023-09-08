package fh1;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import cj1.C54741c;
import cl1.C55001u;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import jq3.C60898l;
import jq3.C60905o;
import jq3.C9493c;
import org.json.JSONObject;
import te3.C48978cb0;
import te3.C49712hj1;
import te3.C64331dw0;
import tf0.C64916p1;

/* renamed from: fh1.c2 */
public final class C59003c2 implements C60898l.C9502b<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ C59018f2 f168820d;

    /* renamed from: e */
    public final /* synthetic */ ViewGroup f168821e;

    public C59003c2(C59018f2 f2Var, ViewGroup viewGroup) {
        this.f168820d = f2Var;
        this.f168821e = viewGroup;
    }

    /* renamed from: q */
    public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        C60905o oVar = (C60905o) zVar;
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(oVar, "holder");
        if (oVar.f44859i == 1 && this.f168820d.f168889y.size() > 0 && i != -1) {
            ArrayList<C9493c> arrayList = this.f168820d.f168889y;
            C9493c cVar = arrayList.get(i % arrayList.size());
            C54741c cVar2 = cVar instanceof C54741c ? (C54741c) cVar : null;
            HashMap<String, Bitmap> hashMap = C59018f2.f168857P;
            Log.m105924i("Finder.LivePromoteBannerController", "onClick jump");
            long currentTimeMillis = System.currentTimeMillis();
            C59018f2 f2Var = this.f168820d;
            if (currentTimeMillis - f2Var.f168886v < 500) {
                Log.m105924i("Finder.LivePromoteBannerController", "don't click again in 500ms");
                return;
            }
            f2Var.f168886v = currentTimeMillis;
            if (cVar2 != null) {
                if (!f2Var.mo9310g3()) {
                    C59018f2 f2Var2 = this.f168820d;
                    Context context = this.f168821e.getContext();
                    C87412m.m108593f(context, "root.context");
                    C59018f2.m68936m3(f2Var2, context, cVar2);
                } else if (C85875k4.m106167X()) {
                    C59018f2 f2Var3 = this.f168820d;
                    Context context2 = this.f168821e.getContext();
                    C87412m.m108593f(context2, "root.context");
                    C59018f2.m68936m3(f2Var3, context2, cVar2);
                } else {
                    C59018f2 f2Var4 = this.f168820d;
                    f2Var4.mo9312j3(new C58998b2(f2Var4, this.f168821e, cVar2));
                }
            }
            C59018f2 f2Var5 = this.f168820d;
            f2Var5.mo84248P3(f2Var5.mo84244L3(cVar2, 2));
            C59018f2 f2Var6 = this.f168820d;
            Class cls = C55001u.class;
            C9493c cVar3 = f2Var6.f168882r;
            C54741c cVar4 = cVar3 instanceof C54741c ? (C54741c) cVar3 : null;
            C64331dw0 dw02 = cVar4 != null ? cVar4.f153444h : null;
            boolean z = false;
            if (dw02 != null && dw02.f182888s == 1) {
                z = true;
            }
            if (z && dw02.f182887r == 1) {
                C48978cb0 cb02 = new C48978cb0();
                cb02.f131607d = ((C55001u) f2Var6.business(cls)).f154416j;
                cb02.f131609f = ((C55001u) f2Var6.business(cls)).f154424u;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("feedActionType", 70);
                jSONObject.put("id", dw02.f182876d);
                cb02.f131610g = jSONObject.toString();
                ((C64916p1) C86312j.m106911c(C64916p1.class)).mo76728y((C49712hj1) null, 18054, cb02);
            }
        }
    }
}
