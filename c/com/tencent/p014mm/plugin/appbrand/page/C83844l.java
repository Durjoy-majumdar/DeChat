package com.tencent.p014mm.plugin.appbrand.page;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.widget.C85008l;
import kg3.C76577a;
import lb0.C88394b;
import lb0.C88431k;
import p963fc.C86812g;

/* renamed from: com.tencent.mm.plugin.appbrand.page.l */
public class C83844l extends LinearLayout {

    /* renamed from: d */
    public ImageView f244723d = ((ImageView) findViewById(C0966R.C0970id.f5884rc));

    /* renamed from: e */
    public TextView f244724e = ((TextView) findViewById(C0966R.C0970id.f5886re));

    /* renamed from: f */
    public Button f244725f = ((Button) findViewById(C0966R.C0970id.f5883rb));

    public C83844l(Context context, C86812g gVar) {
        super(context);
        View.inflate(getContext(), C0966R.C0971layout.f6400dt, this);
        boolean z = true;
        this.f244724e.setText(getResources().getString(C0966R.string.gk5, new Object[]{gVar.mo113051d0().f261061d}));
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f244723d.getLayoutParams();
        if ((gVar.mo113008F() == null || gVar.mo113008F().mo113982a() == null || !"custom".equalsIgnoreCase(gVar.mo113008F().mo113982a().f239653c)) ? false : z) {
            layoutParams.topMargin = C76577a.m92155f(getContext(), C0966R.dimen.f4083qx);
            this.f244723d.setLayoutParams(layoutParams);
            requestLayout();
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        this.f244723d.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        String str = C88394b.f255384g;
        C88394b.C88418q.f255427a.mo122786b(this.f244723d, gVar.mo113051d0().f261063f, ((C85008l) gVar.mo113027R0(C85008l.class)).Dj0(), C88431k.f255437d);
        this.f244725f.setVisibility(8);
        setBackgroundColor(-1);
    }
}
