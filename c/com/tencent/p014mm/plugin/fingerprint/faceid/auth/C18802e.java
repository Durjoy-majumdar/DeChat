package com.tencent.p014mm.plugin.fingerprint.faceid.auth;

import android.view.animation.Animation;
import com.tencent.p014mm.plugin.fingerprint.faceid.auth.WalletFaceIdDialog;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.fingerprint.faceid.auth.e */
public class C18802e implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ WalletFaceIdDialog.C18798c f52638a;

    public C18802e(WalletFaceIdDialog.C18798c cVar) {
        this.f52638a = cVar;
    }

    public void onAnimationEnd(Animation animation) {
        Log.m105918d("MicroMsg.WalletFaceIdDialog", "fail anim end");
        this.f52638a.mo23728b(-1);
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
        Log.m105918d("MicroMsg.WalletFaceIdDialog", "fail anim start");
    }
}
