package x22;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: x22.h */
public class C112027h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f335355d;

    /* renamed from: e */
    public final /* synthetic */ C112028i f335356e;

    public C112027h(C112028i iVar, int i) {
        this.f335356e = iVar;
        this.f335355d = i;
    }

    public void run() {
        Log.m105919d("MicroMsg.ShareHeaderAvatarViewMgr", "scrollToTalker pos=%d", Integer.valueOf(this.f335355d));
        this.f335356e.f335357a.mo153476c(this.f335355d);
    }
}
