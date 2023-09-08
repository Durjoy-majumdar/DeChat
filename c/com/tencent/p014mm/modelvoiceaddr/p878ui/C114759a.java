package com.tencent.p014mm.modelvoiceaddr.p878ui;

import com.tencent.p014mm.modelvoiceaddr.p878ui.C114760b;
import com.tencent.p014mm.sdk.platformtools.Log;
import md0.C117546e;

/* renamed from: com.tencent.mm.modelvoiceaddr.ui.a */
public class C114759a implements C117546e.C117550d {

    /* renamed from: a */
    public final /* synthetic */ VoiceSearchLayout f344096a;

    public C114759a(VoiceSearchLayout voiceSearchLayout) {
        this.f344096a = voiceSearchLayout;
    }

    /* renamed from: a */
    public void mo174406a(String[] strArr, long j) {
        try {
            Log.m105918d("MicroMsg.VoiceSearchLayout", "dkaddr onRes ");
            if (strArr != null) {
                Log.m105918d("MicroMsg.VoiceSearchLayout", "dkaddr onRes size:" + strArr.length + " " + strArr.toString());
                for (String str : strArr) {
                    Log.m105918d("MicroMsg.VoiceSearchLayout", "search username  :" + str);
                }
            }
            this.f344096a.mo174398f();
            ((C114760b.C114761a) this.f344096a.f344083e).mo174408a(true, strArr, j);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.VoiceSearchLayout", e, "", new Object[0]);
        }
    }
}
