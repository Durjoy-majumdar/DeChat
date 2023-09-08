package com.tencent.p014mm.plugin.voip.p475ui;

import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.plugin.voip.ui.u */
public class C106471u implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ VideoActivityController f318018d;

    public C106471u(VideoActivityController videoActivityController) {
        this.f318018d = videoActivityController;
    }

    public void run() {
        VoipBaseFragment voipBaseFragment = this.f318018d.f317878g;
        if (voipBaseFragment != null) {
            voipBaseFragment.mo152888Z(C0966R.string.kir, -1);
        }
        this.f318018d.mo152937a();
    }
}
