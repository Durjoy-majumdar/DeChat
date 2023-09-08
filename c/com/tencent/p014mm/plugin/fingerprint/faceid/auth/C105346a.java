package com.tencent.p014mm.plugin.fingerprint.faceid.auth;

import com.tencent.p014mm.plugin.fingerprint.faceid.auth.FrameAnimatorImageView;

/* renamed from: com.tencent.mm.plugin.fingerprint.faceid.auth.a */
public class C105346a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FrameAnimatorImageView.C105345a f313122d;

    public C105346a(FrameAnimatorImageView frameAnimatorImageView, FrameAnimatorImageView.C105345a aVar) {
        this.f313122d = aVar;
    }

    public void run() {
        this.f313122d.onStop();
    }
}
