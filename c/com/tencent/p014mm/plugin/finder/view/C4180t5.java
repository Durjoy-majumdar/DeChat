package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import com.tencent.p014mm.plugin.finder.feed.model.C2815r0;
import di3.C86312j;
import dp1.C7435f2;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import nj3.C11184p0;
import org.json.JSONObject;
import p185kq.C10383h;
import rs1.C13442s8;
import vq1.C14951b0;
import vq1.C14954c0;
import vq1.C14955d0;
import vq1.C14960h0;

/* renamed from: com.tencent.mm.plugin.finder.view.t5 */
public final class C4180t5 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ FinderWordingLayout f18436d;

    /* renamed from: e */
    public final /* synthetic */ C2815r0 f18437e;

    public C4180t5(FinderWordingLayout finderWordingLayout, C2815r0 r0Var) {
        this.f18436d = finderWordingLayout;
        this.f18437e = r0Var;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 1) {
            ArrayList arrayList = new ArrayList();
            ArrayList<C2815r0> dataList = this.f18436d.getDataList();
            C2815r0 r0Var = this.f18437e;
            for (C2815r0 r0Var2 : dataList) {
                if (r0Var2.f131802d == r0Var.f131802d && r0Var2.f14070h == r0Var.f14070h) {
                    arrayList.add(r0Var2);
                }
            }
            FinderWordingLayout finderWordingLayout = this.f18436d;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C2815r0 r0Var3 = (C2815r0) it.next();
                C14951b0 b0Var = C14951b0.f40992g;
                b0Var.getClass();
                C87412m.m108594g(r0Var3, "wordingItem");
                C14960h0 h0Var = new C14960h0(r0Var3, 1);
                b0Var.f40997e.put(new C14951b0.C14952a(r0Var3.f14070h, r0Var3.f131802d), Boolean.TRUE);
                b0Var.f40993a.mo89349c(new C14955d0(h0Var), new C14954c0(b0Var, h0Var));
                FeedUpdateEvent feedUpdateEvent = new FeedUpdateEvent();
                FeedUpdateEvent.C1041a aVar = feedUpdateEvent.f9173d;
                aVar.f9174a = r0Var3.f14070h;
                aVar.f9184k = r0Var3.f131802d;
                aVar.f9175b = 26;
                feedUpdateEvent.publish();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("feedid", ((C10383h) C86312j.m106911c(C10383h.class)).mo10700XQ(r0Var3.f14070h));
                jSONObject.put("buzz_word", r0Var3.f131803e + '|' + r0Var3.f131804f);
                C13442s8.C13443a aVar2 = C13442s8.f38060Q0;
                Context context = finderWordingLayout.getContext();
                C87412m.m108593f(context, "context");
                C13442s8 f = aVar2.mo12873f(context);
                C7435f2.f25626a.mo8580d(f != null ? f.mo12861q3() : null, "buzz_bar_del", true, jSONObject);
            }
        }
    }
}
