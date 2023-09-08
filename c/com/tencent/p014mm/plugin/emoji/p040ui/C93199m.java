package com.tencent.p014mm.plugin.emoji.p040ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import x51.C102559e;

/* renamed from: com.tencent.mm.plugin.emoji.ui.m */
public class C93199m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f268758d;

    /* renamed from: e */
    public final /* synthetic */ int f268759e;

    /* renamed from: f */
    public final /* synthetic */ CustomSmileyPreviewUI f268760f;

    public C93199m(CustomSmileyPreviewUI customSmileyPreviewUI, String str, int i) {
        this.f268760f = customSmileyPreviewUI;
        this.f268758d = str;
        this.f268759e = i;
    }

    public void run() {
        if (Util.isNullOrNil(this.f268758d)) {
            Log.m105928w("MicroMsg.emoji.CustomSmileyPreviewUI", "product id is null.");
            return;
        }
        C102559e eVar = this.f268760f.f268343e;
        if (eVar != null && eVar.f301966e != null) {
            eVar.mo141911r(this.f268758d, this.f268759e);
        }
    }
}
