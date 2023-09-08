package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.s0$$j */
public class s0$$j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C94167s0 f272035d;

    public s0$$j(C94167s0 s0Var) {
        this.f272035d = s0Var;
    }

    public void run() {
        FrameLayout frameLayout = (FrameLayout) this.f272035d.mo129360m(C0966R.C0970id.goe);
        RelativeLayout relativeLayout = (RelativeLayout) this.f272035d.f272017U.findViewById(C0966R.C0970id.g4_);
        if (frameLayout == null || relativeLayout.getHeight() < 1) {
            Log.m105928w("MicroMsg.TrackMapUI", "mapcontent is null!");
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        }
        layoutParams.height = frameLayout.getHeight() - relativeLayout.getHeight();
        frameLayout.setLayoutParams(layoutParams);
        this.f272035d.f271961t.setLogoMargin(new int[]{24, 24});
    }
}
