package com.tencent.p014mm.plugin.p316ai.service;

import com.tencent.p014mm.autogen.events.RunAiEvent;
import com.tencent.p014mm.plugin.p316ai.service.AiService;
import com.tencent.p014mm.sdk.platformtools.Log;
import hh0.C20942f;

/* renamed from: com.tencent.mm.plugin.ai.service.a */
public class C29087a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ RunAiEvent f79654d;

    public C29087a(AiService.C178621 r1, RunAiEvent runAiEvent) {
        this.f79654d = runAiEvent;
    }

    public void run() {
        try {
            if ("debug".equals(this.f79654d.f78961d.f78962a)) {
                C20942f.yx0().Gx0(10250);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AiService", e, "ai run error", new Object[0]);
        }
    }
}
