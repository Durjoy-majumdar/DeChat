package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.GroupPayPfClickReportStruct;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.aa.ui.g */
public class C55424g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AAImagPreviewUI f157895d;

    public C55424g(AAImagPreviewUI aAImagPreviewUI) {
        this.f157895d = aAImagPreviewUI;
    }

    public void run() {
        C76701a.makeText((Context) this.f157895d.getContext(), (CharSequence) this.f157895d.getContext().getString(C0966R.string.g49), 1).show();
        GroupPayPfClickReportStruct groupPayPfClickReportStruct = new GroupPayPfClickReportStruct();
        groupPayPfClickReportStruct.f156281d = (long) 15;
        groupPayPfClickReportStruct.mo86054n();
    }
}
