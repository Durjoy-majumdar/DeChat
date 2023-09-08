package com.tencent.p014mm.plugin.appbrand.p025ad.p945ui;

import ai0.C79553f;
import ai0.C79570o;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import lb0.C88394b;
import lb0.C88431k;

/* renamed from: com.tencent.mm.plugin.appbrand.ad.ui.AppBrandMenuFooter */
public class AppBrandMenuFooter extends LinearLayout {

    /* renamed from: d */
    public View f238419d;

    public AppBrandMenuFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f238419d = LayoutInflater.from(context).inflate(C0966R.C0971layout.f6423eg, this);
    }

    public void setPageView(C83928t1 t1Var) {
        String appId = t1Var.getAppId();
        Map<String, Class<? extends AppBrandAdUI>> map = C79553f.f233288a;
        ((TextView) this.f238419d.findViewById(C0966R.C0970id.h_1)).setText(Util.nullAsNil(C79570o.m96622b(appId).f233270d));
        String str = C88394b.f255384g;
        C88394b.C88418q.f255427a.mo122785a((ImageView) this.f238419d.findViewById(C0966R.C0970id.f15), C79570o.m96622b(t1Var.getAppId()).f233269c, C0966R.C0969drawable.f4444cr, C88431k.f255437d);
    }
}
