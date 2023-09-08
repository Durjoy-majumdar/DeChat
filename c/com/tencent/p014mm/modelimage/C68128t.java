package com.tencent.p014mm.modelimage;

import com.tencent.p014mm.modelimage.C68129u;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;

/* renamed from: com.tencent.mm.modelimage.t */
public class C68128t implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C68129u.C68130a f195787d;

    public C68128t(C68129u.C68130a aVar) {
        this.f195787d = aVar;
    }

    public void run() {
        Log.m105924i("MicroMsg.ImgService", "on image upload end. queue size : " + C68129u.this.f195789d.size());
        C68129u uVar = C68129u.this;
        uVar.f195791f = false;
        if (uVar.f195789d.size() > 0) {
            C92809c0 poll = C68129u.this.f195789d.poll();
            if (poll != null) {
                Log.m105924i("MicroMsg.ImgService", "upload image scene hashcode : " + poll.hashCode());
                C86709a0.m107529k().f251779b.mo123460f(poll);
                C68129u.this.f195791f = true;
                return;
            }
            Log.m105928w("MicroMsg.ImgService", "poll image scene is null");
        }
    }
}
