package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.s0$$c */
public final /* synthetic */ class s0$$c implements C32226l {

    /* renamed from: d */
    public final /* synthetic */ C94167s0 f272028d;

    public /* synthetic */ s0$$c(C94167s0 s0Var) {
        this.f272028d = s0Var;
    }

    public final Object invoke(Object obj) {
        C94167s0 s0Var = this.f272028d;
        float floatValue = ((Float) obj).floatValue();
        s0Var.getClass();
        Log.m105918d("MicroMsg.TrackMapUI", "peek height change");
        ViewGroup.LayoutParams layoutParams = s0Var.f272014S.getLayoutParams();
        if (layoutParams != null) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += (int) floatValue;
            s0Var.f272014S.setLayoutParams(layoutParams);
        }
        FrameLayout frameLayout = (FrameLayout) s0Var.mo129360m(C0966R.C0970id.goe);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        }
        layoutParams2.height = frameLayout.getHeight() - ((int) floatValue);
        frameLayout.setLayoutParams(layoutParams2);
        s0Var.f271961t.setLogoMargin(new int[]{24, 24});
        return Boolean.TRUE;
    }
}
