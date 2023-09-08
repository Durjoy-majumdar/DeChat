package com.tencent.p014mm.plugin.ball.service;

import aw0.C79636p;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.ball.service.c$$f */
public class c$$f implements C79636p {

    /* renamed from: a */
    public final /* synthetic */ BallInfo f311780a;

    /* renamed from: b */
    public final /* synthetic */ C105035c f311781b;

    public c$$f(C105035c cVar, BallInfo ballInfo) {
        this.f311781b = cVar;
        this.f311780a = ballInfo;
    }

    /* renamed from: a */
    public void mo109774a(boolean z) {
        if (z) {
            this.f311781b.mo149179q0(this.f311780a);
        } else {
            Log.m105928w("MicroMsg.FloatBallService", "no float window permission");
        }
    }
}
