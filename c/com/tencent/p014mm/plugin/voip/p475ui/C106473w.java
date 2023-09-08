package com.tencent.p014mm.plugin.voip.p475ui;

import com.tencent.p014mm.C0966R;
import z33.C112604l;

/* renamed from: com.tencent.mm.plugin.voip.ui.w */
public class C106473w implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ VideoActivityController f318020d;

    public C106473w(VideoActivityController videoActivityController) {
        this.f318020d = videoActivityController;
    }

    public void run() {
        VoipBaseFragment voipBaseFragment;
        if (C112604l.m153982e(this.f318020d.f317882n)) {
            VideoActivityController videoActivityController = this.f318020d;
            if (!videoActivityController.f317883o && (voipBaseFragment = videoActivityController.f317878g) != null) {
                voipBaseFragment.mo152888Z(C0966R.string.kfa, 10000);
            }
        }
    }
}
