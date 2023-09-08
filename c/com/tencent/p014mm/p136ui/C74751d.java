package com.tencent.p014mm.p136ui;

import android.text.Layout;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.d */
public class C74751d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C74753e f219798d;

    public C74751d(C74753e eVar) {
        this.f219798d = eVar;
    }

    public void run() {
        ViewGroup.LayoutParams layoutParams = this.f219798d.f219802d.getLayoutParams();
        if (-2 != layoutParams.width) {
            layoutParams.width = -2;
            this.f219798d.f219802d.setLayoutParams(layoutParams);
        }
        ViewGroup.LayoutParams layoutParams2 = this.f219798d.f219806h.getLayoutParams();
        if (-2 != layoutParams2.width) {
            Log.m105924i("MicroMsg.ActionBarCustomArea", "fixWhenTitleTooLong, already fix subTitle");
            return;
        }
        Layout layout = this.f219798d.f219806h.getLayout();
        if (layout == null) {
            Log.m105928w("MicroMsg.ActionBarCustomArea", "fixWhenTitleTooLong, layout is null");
        } else if (layout.getEllipsisCount(0) <= 0) {
            Log.m105924i("MicroMsg.ActionBarCustomArea", "fixWhenTitleTooLong, subTitle is not too long");
        } else {
            int width = this.f219798d.f219806h.getWidth();
            int width2 = this.f219798d.f219808j.getWidth();
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f219798d.f219808j.getLayoutParams();
            int marginStart = layoutParams3.getMarginStart();
            int marginEnd = layoutParams3.getMarginEnd();
            Log.m105925i("MicroMsg.ActionBarCustomArea", "fixWhenTitleTooLong, subTitleWidth: %d, subTitleGotoBtnWidth: %d, subTitleGotoBtnMarginStart: %d, subTitleGotoBtnMarginEnd: %d", Integer.valueOf(width), Integer.valueOf(width2), Integer.valueOf(marginStart), Integer.valueOf(marginEnd));
            layoutParams2.width = ((width - width2) - marginStart) - marginEnd;
            this.f219798d.f219806h.setLayoutParams(layoutParams2);
        }
    }
}
