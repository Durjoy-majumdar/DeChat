package com.tencent.p014mm.plugin.shake.shakecard.p321ui;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ShakeAcceptCouponCardEvent;
import com.tencent.p014mm.plugin.shake.shakecard.p321ui.ShakeCardDialog;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.shake.shakecard.ui.a */
public class C19200a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ShakeAcceptCouponCardEvent f54047d;

    /* renamed from: e */
    public final /* synthetic */ ShakeCardDialog f54048e;

    public C19200a(ShakeCardDialog shakeCardDialog, ShakeAcceptCouponCardEvent shakeAcceptCouponCardEvent) {
        this.f54048e = shakeCardDialog;
        this.f54047d = shakeAcceptCouponCardEvent;
    }

    public void run() {
        Log.m105924i("MicroMsg.ShakeCardDialog", "doNetSceneAccept callback");
        ShakeCardDialog shakeCardDialog = this.f54048e;
        ShakeAcceptCouponCardEvent.C17692b bVar = this.f54047d.f48127e;
        shakeCardDialog.f54013D = bVar;
        if (bVar != null) {
            shakeCardDialog.f54028o.setVisibility(8);
            ShakeCardDialog shakeCardDialog2 = this.f54048e;
            ShakeAcceptCouponCardEvent.C17692b bVar2 = shakeCardDialog2.f54013D;
            if (bVar2 != null) {
                shakeCardDialog2.f54014E = bVar2.f48131a;
            }
            if (bVar2 == null || !bVar2.f48132b) {
                shakeCardDialog2.f54016G = ShakeCardDialog.C19198b.ACCEPTED_FAIL;
                shakeCardDialog2.mo24612f();
                this.f54048e.mo24611e();
                return;
            }
            ShakeCardDialog.C19198b bVar3 = ShakeCardDialog.C19198b.ACCEPTED_SUCCES;
            shakeCardDialog2.f54016G = bVar3;
            shakeCardDialog2.mo24612f();
            ShakeCardDialog shakeCardDialog3 = this.f54048e;
            shakeCardDialog3.mo24609d();
            if (shakeCardDialog3.f54016G == bVar3) {
                shakeCardDialog3.f54038y.setText(C0966R.string.j35);
                if (shakeCardDialog3.f54011B == 1) {
                    shakeCardDialog3.f54037x.setImageResource(C0966R.raw.shake_success_icon);
                } else {
                    shakeCardDialog3.f54037x.setImageResource(C0966R.raw.shake_success_icon_no_activity);
                }
            }
            ShakeCardDialog shakeCardDialog4 = this.f54048e;
            shakeCardDialog4.f54039z = true;
            ShakeCardDialog.C19199c cVar = shakeCardDialog4.f54017H;
            if (cVar != null) {
                cVar.mo24617a();
                return;
            }
            return;
        }
        Log.m105924i("MicroMsg.ShakeCardDialog", "doNetSceneAccept callback, mCardAcceptResult == null");
    }
}
