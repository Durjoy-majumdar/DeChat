package com.tencent.p014mm.plugin.appbrand.p025ad.p945ui;

import android.content.Context;
import android.graphics.Color;
import android.view.MenuItem;
import android.view.View;
import bt0.C79815i;
import com.tencent.p014mm.plugin.appbrand.menu.C83699y;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import java.util.Iterator;
import java.util.List;
import nj3.C76874e0;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.appbrand.ad.ui.e */
public class C81132e {

    /* renamed from: a */
    public Context f238424a;

    /* renamed from: b */
    public C77407n f238425b;

    /* renamed from: c */
    public C83780d1 f238426c;

    /* renamed from: d */
    public List<C83699y> f238427d;

    public C81132e(Context context, C83780d1 d1Var, List<C83699y> list) {
        this.f238424a = context;
        this.f238426c = d1Var;
        this.f238427d = list;
        this.f238425b = new C77407n(context, false, 0);
        View b1 = this.f238426c.mo116173b1(this.f238424a);
        if (b1 != null) {
            this.f238425b.mo107569n(b1, true);
        }
        C77407n nVar = this.f238425b;
        nVar.f225771i = new C81128a(this);
        nVar.f225782p = new C81129b(this);
        nVar.f225773j = new C81130c(this);
        nVar.f225787r = new C81131d(this);
        if (C79815i.C79816a.BLACK == this.f238426c.f244564Q) {
            nVar.mo107566k(Color.parseColor("#000000"));
        }
    }

    /* renamed from: a */
    public static void m99366a(C81132e eVar, C76874e0 e0Var, boolean z) {
        for (C83699y next : eVar.f238427d) {
            if (next != null && next.f244318b == z) {
                Context context = eVar.f238424a;
                C83780d1 d1Var = eVar.f238426c;
                next.f244321e.mo115966a(context, d1Var, e0Var, d1Var.getAppId());
            }
        }
    }

    /* renamed from: b */
    public static void m99367b(C81132e eVar, MenuItem menuItem) {
        C83699y yVar;
        boolean z;
        List<C83699y> list = eVar.f238427d;
        int itemId = menuItem.getItemId();
        Iterator<C83699y> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                yVar = null;
                break;
            }
            yVar = it.next();
            if (yVar.f244317a == itemId) {
                break;
            }
        }
        Context context = eVar.f238424a;
        C83780d1 d1Var = eVar.f238426c;
        String appId = d1Var.getAppId();
        if (yVar == null) {
            z = false;
        } else {
            yVar.f244321e.mo115967b(context, d1Var, appId, yVar);
            z = true;
        }
        if (z) {
            eVar.f238425b.mo107572p();
        }
    }
}
