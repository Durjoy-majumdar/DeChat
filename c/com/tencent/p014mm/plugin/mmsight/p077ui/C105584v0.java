package com.tencent.p014mm.plugin.mmsight.p077ui;

import com.tencent.p014mm.plugin.mmsight.p077ui.MMSightRecordButton;
import i72.C108377g;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.v0 */
public class C105584v0 implements MMSightRecordButton.C105503j {

    /* renamed from: a */
    public final /* synthetic */ SightCaptureUI f314032a;

    public C105584v0(SightCaptureUI sightCaptureUI) {
        this.f314032a = sightCaptureUI;
    }

    /* renamed from: a */
    public void mo128046a(int i) {
        C108377g gVar = this.f314032a.f313870i;
        if (gVar != null) {
            gVar.mo158914q(true, true, i);
        }
    }

    /* renamed from: b */
    public void mo128047b(int i) {
        C108377g gVar = this.f314032a.f313870i;
        if (gVar != null) {
            gVar.mo158914q(false, true, i);
        }
    }
}
