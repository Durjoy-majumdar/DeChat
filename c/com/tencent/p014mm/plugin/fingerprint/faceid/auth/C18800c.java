package com.tencent.p014mm.plugin.fingerprint.faceid.auth;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fingerprint.faceid.auth.FrameAnimatorImageView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.fingerprint.faceid.auth.c */
public class C18800c implements FrameAnimatorImageView.C105345a {

    /* renamed from: a */
    public final /* synthetic */ WalletFaceIdDialog f52635a;

    public C18800c(WalletFaceIdDialog walletFaceIdDialog) {
        this.f52635a = walletFaceIdDialog;
    }

    public void onStart() {
    }

    public void onStop() {
        Log.m105918d("MicroMsg.WalletFaceIdDialog", "trigger load finish");
        this.f52635a.f52617d.mo149945a(C0966R.C0969drawable.f4971ss, (FrameAnimatorImageView.C105345a) null);
    }
}
