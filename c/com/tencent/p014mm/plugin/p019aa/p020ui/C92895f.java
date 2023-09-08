package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.GroupPayPfClickReportStruct;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import com.tencent.p014mm.vfs.C86013q1;
import p823sg.C90193h;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.aa.ui.f */
public class C92895f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AAImagPreviewUI f267588d;

    public C92895f(AAImagPreviewUI aAImagPreviewUI) {
        this.f267588d = aAImagPreviewUI;
    }

    public void run() {
        if (C86013q1.m106450k(this.f267588d.f267563g)) {
            String str = AndroidMediaUtil.getSysCameraDirPath() + "img_" + C90193h.m112876d(this.f267588d.f267563g) + System.currentTimeMillis() + ".jpg";
            C86013q1.m106447h(str);
            C86013q1.m106442c(this.f267588d.f267563g, str);
            AndroidMediaUtil.refreshMediaScanner(str, this.f267588d.getContext());
            C76701a.makeText((Context) this.f267588d.getContext(), (CharSequence) this.f267588d.getContext().getString(C0966R.string.fen, new Object[]{AndroidMediaUtil.getSysCameraDirPath()}), 1).show();
            if (this.f267588d.f267561e == 2) {
                C115669n.INSTANCE.mo160131h(13721, 4, 13, Integer.valueOf(this.f267588d.f267571r));
            }
        } else {
            C76701a.makeText((Context) this.f267588d.getContext(), (CharSequence) this.f267588d.getContext().getString(C0966R.string.g48), 1).show();
        }
        GroupPayPfClickReportStruct groupPayPfClickReportStruct = new GroupPayPfClickReportStruct();
        groupPayPfClickReportStruct.f156281d = (long) 15;
        groupPayPfClickReportStruct.mo86054n();
    }
}
