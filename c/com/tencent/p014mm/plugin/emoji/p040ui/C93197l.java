package com.tencent.p014mm.plugin.emoji.p040ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import x51.C102559e;

/* renamed from: com.tencent.mm.plugin.emoji.ui.l */
public class C93197l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f268754d;

    /* renamed from: e */
    public final /* synthetic */ int f268755e;

    /* renamed from: f */
    public final /* synthetic */ CustomSmileyPreviewUI f268756f;

    public C93197l(CustomSmileyPreviewUI customSmileyPreviewUI, String str, int i) {
        this.f268756f = customSmileyPreviewUI;
        this.f268754d = str;
        this.f268755e = i;
    }

    public void run() {
        if (Util.isNullOrNil(this.f268754d)) {
            Log.m105928w("MicroMsg.emoji.CustomSmileyPreviewUI", "product id is null.");
            return;
        }
        C102559e eVar = this.f268756f.f268343e;
        if (eVar != null && eVar.f301966e != null) {
            eVar.mo142178q(this.f268754d, this.f268755e);
            this.f268756f.f268343e.mo142175k();
        }
    }
}
