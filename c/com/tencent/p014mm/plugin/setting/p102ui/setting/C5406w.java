package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import com.tencent.p014mm.vfs.C86013q1;
import p823sg.C90193h;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.w */
public class C5406w implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ PreviewLastHdHeadImg f21092d;

    public C5406w(PreviewLastHdHeadImg previewLastHdHeadImg) {
        this.f21092d = previewLastHdHeadImg;
    }

    public void run() {
        if (C86013q1.m106450k(this.f21092d.f20740h)) {
            String str = AndroidMediaUtil.getSysCameraDirPath() + "hdImg_" + C90193h.m112878f(this.f21092d.f20739g.getBytes()) + System.currentTimeMillis() + ".jpg";
            C86013q1.m106447h(str);
            C86013q1.m106442c(this.f21092d.f20740h, str);
            AndroidMediaUtil.refreshMediaScanner(str, this.f21092d.getContext());
            C76701a.makeText((Context) this.f21092d.getContext(), (CharSequence) this.f21092d.getContext().getString(C0966R.string.fen, new Object[]{AndroidMediaUtil.getSysCameraDirPath()}), 1).show();
            return;
        }
        C76701a.makeText((Context) this.f21092d.getContext(), (CharSequence) this.f21092d.getContext().getString(C0966R.string.iqs), 1).show();
    }
}
