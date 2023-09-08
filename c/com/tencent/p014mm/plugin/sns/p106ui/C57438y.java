package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.sns.model.C94877g0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.y */
public class C57438y implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C94877g0 f164523d;

    public C57438y(C57394a0 a0Var, C94877g0 g0Var) {
        this.f164523d = g0Var;
    }

    public void onCancel(DialogInterface dialogInterface) {
        SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.CommentDetailMenuManager$4");
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123458d(this.f164523d);
        SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.CommentDetailMenuManager$4");
    }
}
