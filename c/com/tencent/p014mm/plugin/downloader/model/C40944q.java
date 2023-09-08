package com.tencent.p014mm.plugin.downloader.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Iterator;

/* renamed from: com.tencent.mm.plugin.downloader.model.q */
public class C40944q implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C40941p f110210d;

    public C40944q(C40941p pVar) {
        this.f110210d = pVar;
    }

    public void run() {
        try {
            Iterator<Long> it = this.f110210d.f110204d.iterator();
            while (it.hasNext()) {
                C40941p.m44351f(this.f110210d, Long.valueOf(it.next().longValue()));
            }
        } catch (Exception e) {
            Log.m105920e("MicroMsg.FileDownloaderImpl23", e.getMessage());
        }
    }
}
