package com.tencent.p014mm.modelimage;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.modelimage.v */
public class C68135v implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C68129u f195806d;

    public C68135v(C68129u uVar) {
        this.f195806d = uVar;
    }

    public void run() {
        long currentTimeMillis = System.currentTimeMillis();
        C68129u uVar = this.f195806d;
        long j = currentTimeMillis - uVar.f195796n;
        if (uVar.f195794i) {
            if (j >= 60000) {
                Log.m105920e("MicroMsg.ImgService", "ERR: Try Run service runningFlag:" + this.f195806d.f195794i + " timeWait:" + j + ">=MAX_TIME_WAIT sending:" + this.f195806d.f195794i);
            } else {
                return;
            }
        }
        Log.m105924i("MicroMsg.ImgService", "run from run");
        C68129u uVar2 = this.f195806d;
        uVar2.f195794i = true;
        uVar2.f195795j = 3;
        uVar2.f195798p.mo72289b();
        this.f195806d.f195799q.startTimer(10);
    }

    public String toString() {
        return super.toString() + "|run";
    }
}
