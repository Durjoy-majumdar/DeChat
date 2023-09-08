package com.tencent.p014mm.plugin.voip.p475ui;

import com.tencent.p014mm.plugin.voip.p475ui.VideoActivityController;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;

/* renamed from: com.tencent.mm.plugin.voip.ui.t */
public class C106470t implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ VideoActivityController.C1064171 f318017d;

    public C106470t(VideoActivityController.C1064171 r1) {
        this.f318017d = r1;
    }

    public void run() {
        WeakReference<C106448g> weakReference = VideoActivityController.this.f317879h;
        if (weakReference != null && weakReference.get() != null) {
            Log.m105925i("MicroMsg.Voip.VideoActivityController", "summerkick LogoutEvent ret[%b, %b, %b]", Boolean.valueOf(VideoActivityController.this.f317879h.get().mo152482o()), Boolean.valueOf(VideoActivityController.this.f317879h.get().mo152430J()), Boolean.valueOf(VideoActivityController.this.f317879h.get().mo152484p()));
        }
    }
}
