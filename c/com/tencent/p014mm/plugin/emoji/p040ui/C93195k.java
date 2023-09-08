package com.tencent.p014mm.plugin.emoji.p040ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import p244tt.C14088e;

/* renamed from: com.tencent.mm.plugin.emoji.ui.k */
public class C93195k implements C14088e.C14090b {

    /* renamed from: a */
    public final /* synthetic */ CustomSmileyPreviewUI f268752a;

    public C93195k(CustomSmileyPreviewUI customSmileyPreviewUI) {
        this.f268752a = customSmileyPreviewUI;
    }

    /* renamed from: a */
    public void mo1717a() {
        Log.m105924i("MicroMsg.emoji.CustomSmileyPreviewUI", "OpenLiteApp success");
    }

    /* renamed from: b */
    public void mo1718b() {
        Log.m105924i("MicroMsg.emoji.CustomSmileyPreviewUI", "OpenLiteApp fail");
        CustomSmileyPreviewUI customSmileyPreviewUI = this.f268752a;
        int i = CustomSmileyPreviewUI.f268306a1;
        customSmileyPreviewUI.mo127673J7();
    }
}
