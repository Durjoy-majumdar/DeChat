package com.tencent.p014mm.plugin.fingerprint.faceid.auth;

import com.tencent.p014mm.plugin.fingerprint.faceid.auth.FrameAnimatorImageView;
import com.tencent.p014mm.plugin.fingerprint.faceid.auth.WalletFaceIdDialog;
import rt1.C22249a;

/* renamed from: com.tencent.mm.plugin.fingerprint.faceid.auth.d */
public class C18801d implements FrameAnimatorImageView.C105345a {

    /* renamed from: a */
    public final /* synthetic */ int f52636a;

    /* renamed from: b */
    public final /* synthetic */ WalletFaceIdDialog.C18798c f52637b;

    public C18801d(WalletFaceIdDialog.C18798c cVar, int i) {
        this.f52637b = cVar;
        this.f52636a = i;
    }

    public void onStart() {
    }

    public void onStop() {
        WalletFaceIdDialog.C18798c cVar = this.f52637b;
        int i = this.f52636a;
        C22249a aVar = cVar.f52629f;
        if (aVar != null) {
            aVar.onAuthSuccess(i, cVar.f52631h);
            cVar.f52629f = null;
        }
        cVar.f52627d.dismiss();
    }
}
