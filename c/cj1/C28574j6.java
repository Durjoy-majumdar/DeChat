package cj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C8480h;

/* renamed from: cj1.j6 */
public final class C28574j6 {

    /* renamed from: a */
    public final String f78439a;

    /* renamed from: b */
    public volatile boolean f78440b;

    /* renamed from: c */
    public final MMHandler.Callback f78441c;

    /* renamed from: d */
    public final MMHandler f78442d;

    public C28574j6(String str, String str2, Runnable runnable, int i, C8480h hVar) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        runnable = (i & 4) != 0 ? null : runnable;
        this.f78439a = str;
        this.f78440b = true;
        C28572i6 i6Var = new C28572i6(this, runnable);
        this.f78441c = i6Var;
        this.f78442d = Util.isNullOrNil(str2) ? new MMHandler((MMHandler.Callback) i6Var) : new MMHandler(str2, (MMHandler.Callback) i6Var);
    }

    /* renamed from: a */
    public final void mo56065a() {
        Log.m105924i("MicroMsg.SingleTaskLooper", this.f78439a + " finishTask isQuit:" + this.f78442d.isQuit());
        this.f78442d.sendEmptyMessage(2);
    }

    /* renamed from: b */
    public final void mo56066b() {
        Log.m105924i("MicroMsg.SingleTaskLooper", this.f78439a + " removeTask");
        this.f78442d.removeCallbacksAndMessages((Object) null);
        this.f78440b = true;
    }

    /* renamed from: c */
    public final void mo56067c(Long l) {
        Log.m105924i("MicroMsg.SingleTaskLooper", this.f78439a + " tryRunTask isQuit:" + this.f78442d.isQuit());
        this.f78442d.obtainMessage(1, l).sendToTarget();
    }
}
