package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.view.View;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import dp1.C7435f2;
import er1.C58684b;
import er1.C58701c;
import er1.C58706d;
import er1.C58710e;
import er1.C58717f;
import gy3.C45983e0;
import gy3.C87412m;
import ht1.C60179k4;
import j20.C117292a;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import rs1.C13442s8;
import te3.C49712hj1;

/* renamed from: com.tencent.mm.plugin.finder.view.d6 */
public final class C56593d6 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ boolean f162234d;

    /* renamed from: e */
    public final /* synthetic */ View f162235e;

    /* renamed from: f */
    public final /* synthetic */ String f162236f;

    /* renamed from: g */
    public final /* synthetic */ String f162237g;

    /* renamed from: h */
    public final /* synthetic */ long f162238h;

    /* renamed from: i */
    public final /* synthetic */ C49712hj1 f162239i;

    /* renamed from: j */
    public final /* synthetic */ String f162240j;

    /* renamed from: n */
    public final /* synthetic */ boolean f162241n;

    /* renamed from: o */
    public final /* synthetic */ C45983e0 f162242o;

    /* renamed from: p */
    public final /* synthetic */ boolean f162243p;

    /* renamed from: q */
    public final /* synthetic */ boolean f162244q;

    public C56593d6(boolean z, View view, String str, String str2, long j, C49712hj1 hj12, String str3, boolean z2, C45983e0 e0Var, boolean z3, boolean z4) {
        this.f162234d = z;
        this.f162235e = view;
        this.f162236f = str;
        this.f162237g = str2;
        this.f162238h = j;
        this.f162239i = hj12;
        this.f162240j = str3;
        this.f162241n = z2;
        this.f162242o = e0Var;
        this.f162243p = z3;
        this.f162244q = z4;
    }

    public final void onClick(View view) {
        C49712hj1 hj12;
        Class cls = C60179k4.class;
        Class cls2 = C58684b.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderWxProfileHelper$Companion$updateWxProfile$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f162234d) {
            Context context = this.f162235e.getContext();
            C87412m.m108593f(context, "contentView.context");
            String str = this.f162236f;
            C87412m.m108593f(str, "sessionId");
            String str2 = this.f162237g;
            C87412m.m108593f(str2, "username");
            long j = this.f162238h;
            C49712hj1 hj13 = this.f162239i;
            ((C58684b) C86312j.m106911c(cls2)).getClass();
            ((C60179k4) C86312j.m106911c(cls)).mo78774wP(context, str, str2, Long.valueOf(j), new C58701c(context, hj13));
        } else {
            String str3 = this.f162240j;
            if ((str3 == null || str3.length() == 0) && !this.f162241n) {
                Context context2 = this.f162235e.getContext();
                C87412m.m108593f(context2, "contentView.context");
                String str4 = this.f162236f;
                C87412m.m108593f(str4, "sessionId");
                String str5 = this.f162237g;
                C87412m.m108593f(str5, "username");
                long j2 = this.f162238h;
                long j3 = this.f162242o.f124000d;
                boolean z = this.f162243p;
                C49712hj1 hj14 = this.f162239i;
                ((C58684b) C86312j.m106911c(cls2)).getClass();
                ((C60179k4) C86312j.m106911c(cls)).Rm0(context2, str4, str5, Long.valueOf(j2), Long.valueOf(j3), z, new C58710e(context2, hj14));
            } else if (this.f162241n) {
                Context context3 = this.f162235e.getContext();
                C87412m.m108593f(context3, "contentView.context");
                String str6 = this.f162236f;
                C87412m.m108593f(str6, "sessionId");
                String str7 = this.f162237g;
                C87412m.m108593f(str7, "username");
                C49712hj1 hj15 = this.f162239i;
                ((C58684b) C86312j.m106911c(cls2)).getClass();
                ((C60179k4) C86312j.m106911c(cls)).H70(context3, str6, str7, new C58706d(context3, hj15));
            } else {
                Context context4 = this.f162235e.getContext();
                C87412m.m108593f(context4, "contentView.context");
                String str8 = this.f162236f;
                C87412m.m108593f(str8, "sessionId");
                String str9 = this.f162240j;
                C87412m.m108593f(str9, "fansId");
                C49712hj1 hj16 = this.f162239i;
                ((C58684b) C86312j.m106911c(cls2)).getClass();
                ((C60179k4) C86312j.m106911c(cls)).mo78767WT(context4, str8, str9, new C58717f(context4, hj16));
            }
        }
        if (this.f162244q) {
            Context context5 = this.f162235e.getContext();
            C87412m.m108593f(context5, "contentView.context");
            C13442s8 f = C13442s8.f38060Q0.mo12873f(context5);
            if (f != null) {
                hj12 = f.mo12861q3();
                hj12.f134675i = 97;
            } else {
                hj12 = null;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 6);
            } catch (JSONException unused) {
            }
            C7435f2.f25626a.mo8577a(hj12, "", 1, jSONObject);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderWxProfileHelper$Companion$updateWxProfile$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
