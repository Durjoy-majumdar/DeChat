package com.tencent.p014mm.plugin.mmsight.p077ui;

import com.tencent.p014mm.plugin.mmsight.p077ui.MMSightRecordButton;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f72.C97842b;
import j72.C108607f;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.w0 */
public class C105586w0 implements MMSightRecordButton.C105504k {

    /* renamed from: a */
    public final /* synthetic */ SightCaptureUI f314034a;

    public C105586w0(SightCaptureUI sightCaptureUI) {
        this.f314034a = sightCaptureUI;
    }

    /* renamed from: a */
    public void mo128045a() {
        Log.m105927v("MicroMsg.TestCaptureUiEvent", "onSimpleTap %s", Util.getStack().toString());
        C108607f fVar = this.f314034a.f313871j;
        if (fVar != null) {
            Log.m105925i("MicroMsg.SightCaptureUI", "onSimpleTap, mediaRecorder.status: %s", fVar.mo159613j());
            this.f314034a.f313871j.cancel();
        }
        C97842b.m126308y("TIME_RECODER_2_PLAY");
        SightCaptureUI.m141707H7(this.f314034a);
    }
}
