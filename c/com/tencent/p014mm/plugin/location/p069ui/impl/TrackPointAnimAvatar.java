package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import p196ln.C76705f;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.TrackPointAnimAvatar */
public class TrackPointAnimAvatar extends RelativeLayout {

    /* renamed from: d */
    public Context f346486d;

    /* renamed from: e */
    public LinearLayout f346487e;

    /* renamed from: f */
    public ImageView f346488f;

    /* renamed from: g */
    public String f346489g;

    /* renamed from: h */
    public Animation f346490h;

    /* renamed from: i */
    public Animation f346491i;

    public TrackPointAnimAvatar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f346486d = context;
        mo175563a();
    }

    /* renamed from: a */
    public final void mo175563a() {
        View inflate = View.inflate(this.f346486d, C0966R.C0971layout.cap, this);
        this.f346487e = (LinearLayout) inflate.findViewById(C0966R.C0970id.f5841q3);
        this.f346488f = (ImageView) inflate.findViewById(C0966R.C0970id.f5840q2);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -0.5f);
        this.f346490h = translateAnimation;
        translateAnimation.setDuration(500);
        this.f346490h.setFillAfter(true);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -0.5f, 1, 0.0f);
        this.f346491i = translateAnimation2;
        translateAnimation2.setDuration(500);
        this.f346491i.setFillAfter(true);
        this.f346490h.setAnimationListener(new C115585z0(this));
        this.f346491i.setAnimationListener(new C115536a1(this));
    }

    public void setUser(String str) {
        if (!Util.isNullOrNil(str)) {
            this.f346489g = str;
            if (this.f346488f != null) {
                ((C76705f) C86312j.m106911c(C76705f.class)).mo106822J5(this.f346488f, this.f346489g);
            }
        }
    }

    public TrackPointAnimAvatar(Context context) {
        super(context);
        this.f346486d = context;
        mo175563a();
    }
}
