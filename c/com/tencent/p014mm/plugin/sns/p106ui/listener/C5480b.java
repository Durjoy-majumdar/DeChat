package com.tencent.p014mm.plugin.sns.p106ui.listener;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.sns.ui.listener.b */
public final class C5480b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f21241d;

    /* renamed from: e */
    public final /* synthetic */ View f21242e;

    public C5480b(Context context, View view) {
        this.f21241d = context;
        this.f21242e = view;
    }

    public final void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.listener.SnsAutoShowVKBOnUICreate$launch$1");
        Context context = this.f21241d;
        Boolean bool = null;
        Object systemService = context != null ? context.getSystemService("input_method") : null;
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            bool = Boolean.valueOf(inputMethodManager.showSoftInput(this.f21242e, 0));
        }
        SnsMethodCalculate.markStartTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ui.listener.SnsAutoShowVKBOnUICreate");
        SnsMethodCalculate.markEndTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ui.listener.SnsAutoShowVKBOnUICreate");
        Log.m105924i("MicroMsg.SnsAutoShowVKBOnUICreate", "launch: result:" + bool + ", from:" + this.f21241d);
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.listener.SnsAutoShowVKBOnUICreate$launch$1");
    }
}
