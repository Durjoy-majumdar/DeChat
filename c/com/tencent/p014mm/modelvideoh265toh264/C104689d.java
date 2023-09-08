package com.tencent.p014mm.modelvideoh265toh264;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.modelvideoh265toh264.d */
public class C104689d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C104690e f310873d;

    public C104689d(C104690e eVar) {
        this.f310873d = eVar;
    }

    public void run() {
        if (this.f310873d.f310879f != null) {
            Log.m105924i("MicroMsg.MediaCodecTranscodeDecoder", "delay to stop decoder");
            try {
                this.f310873d.f310879f.mo148223z();
                this.f310873d.f310879f.mo148214p();
                this.f310873d.f310879f = null;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.MediaCodecTranscodeDecoder", e, "delay to stop decoder error: %s", e.getMessage());
            }
        }
    }
}
