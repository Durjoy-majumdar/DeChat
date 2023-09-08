package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

import com.tencent.p014mm.sdk.platformtools.Log;
import p576jp.C33610c;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 */
public class C29811p0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C105181w f80823d;

    public C29811p0(C105181w wVar) {
        this.f80823d = wVar;
    }

    public void run() {
        Log.m105924i("MicroMsg.OpenVoice.OpenVoiceService", "wechat VoIP call is coming and broken. exit room if in room");
        this.f80823d.mo149499f(C33610c.C33611a.ReasonInCommingCall);
    }
}
