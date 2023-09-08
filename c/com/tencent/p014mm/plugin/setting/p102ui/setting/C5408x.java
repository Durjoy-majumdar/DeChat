package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.x */
public class C5408x implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ PreviewLastHdHeadImg f21094d;

    public C5408x(PreviewLastHdHeadImg previewLastHdHeadImg) {
        this.f21094d = previewLastHdHeadImg;
    }

    public void run() {
        C76701a.makeText((Context) this.f21094d.getContext(), (CharSequence) this.f21094d.getContext().getString(C0966R.string.iak), 1).show();
    }
}
