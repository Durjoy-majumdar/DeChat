package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import com.tencent.p014mm.C0966R;
import di3.C86312j;
import dp1.C58417y0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import org.json.JSONObject;
import qo3.C101218e0;
import rs1.C13442s8;
import te3.C49712hj1;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.finder.view.q3 */
public final class C4154q3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C4179t3 f18377d;

    /* renamed from: e */
    public final /* synthetic */ Context f18378e;

    public C4154q3(C4179t3 t3Var, Context context) {
        this.f18377d = t3Var;
        this.f18378e = context;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderPoiClaimPanel$init$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        CheckBox checkBox = this.f18377d.f18431d;
        C49712hj1 hj12 = null;
        if (checkBox == null) {
            C87412m.m108603p("checkBox");
            throw null;
        } else if (checkBox != null) {
            checkBox.setChecked(!checkBox.isChecked());
            C4179t3 t3Var = this.f18377d;
            CheckBox checkBox2 = t3Var.f18431d;
            if (checkBox2 != null) {
                t3Var.f18435h = checkBox2.isChecked();
                C4179t3 t3Var2 = this.f18377d;
                if (t3Var2.f18435h) {
                    C101218e0 e0Var = t3Var2.f18433f;
                    if (e0Var != null) {
                        e0Var.mo140676v(0);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("click_option", "agree");
                        C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
                        String jSONObject2 = jSONObject.toString();
                        C87412m.m108593f(jSONObject2, "kvJson.toString()");
                        String n = C112551y.m153814n(jSONObject2, ",", ";", false);
                        C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f18378e);
                        if (f != null) {
                            hj12 = f.mo12861q3();
                        }
                        y0Var.Cx0(1, "poi_channelclaim_page", n, hj12);
                    } else {
                        C87412m.m108603p("bottomDialog");
                        throw null;
                    }
                } else {
                    C101218e0 e0Var2 = t3Var2.f18433f;
                    if (e0Var2 != null) {
                        e0Var2.mo140676v(1);
                        C4179t3 t3Var3 = this.f18377d;
                        C101218e0 e0Var3 = t3Var3.f18433f;
                        if (e0Var3 != null) {
                            e0Var3.mo140678x(t3Var3.getResources().getColor(C0966R.color.BW_0_Alpha_0_2));
                        } else {
                            C87412m.m108603p("bottomDialog");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("bottomDialog");
                        throw null;
                    }
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderPoiClaimPanel$init$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C87412m.m108603p("checkBox");
            throw null;
        } else {
            C87412m.m108603p("checkBox");
            throw null;
        }
    }
}
