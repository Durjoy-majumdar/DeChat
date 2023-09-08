package com.tencent.p014mm.p136ui;

import android.text.Layout;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.c */
public class C73247c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C74753e f215147d;

    public C73247c(C74753e eVar) {
        this.f215147d = eVar;
    }

    public void run() {
        ViewGroup.LayoutParams layoutParams = this.f215147d.f219806h.getLayoutParams();
        if (-2 != layoutParams.width) {
            layoutParams.width = -2;
            this.f215147d.f219806h.setLayoutParams(layoutParams);
        }
        ViewGroup.LayoutParams layoutParams2 = this.f215147d.f219802d.getLayoutParams();
        if (-2 != layoutParams2.width) {
            Log.m105924i("MicroMsg.ActionBarCustomArea", "fixWhenTitleTooLong, already fix title");
            return;
        }
        Layout layout = this.f215147d.f219802d.getLayout();
        if (layout == null) {
            Log.m105928w("MicroMsg.ActionBarCustomArea", "fixWhenTitleTooLong, layout is null");
        } else if (layout.getEllipsisCount(0) <= 0) {
            Log.m105924i("MicroMsg.ActionBarCustomArea", "fixWhenTitleTooLong, title is not too long");
        } else {
            int width = this.f215147d.f219802d.getWidth();
            int width2 = this.f215147d.f219805g.getWidth();
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f215147d.f219805g.getLayoutParams();
            int marginStart = layoutParams3.getMarginStart();
            int marginEnd = layoutParams3.getMarginEnd();
            Log.m105925i("MicroMsg.ActionBarCustomArea", "fixWhenTitleTooLong, titleWidth: %d, titleGotoBtnWidth: %d, titleGotoBtnMarginStart: %d, titleGotoBtnMarginEnd: %d", Integer.valueOf(width), Integer.valueOf(width2), Integer.valueOf(marginStart), Integer.valueOf(marginEnd));
            layoutParams2.width = ((width - width2) - marginStart) - marginEnd;
            this.f215147d.f219802d.setLayoutParams(layoutParams2);
        }
    }
}
