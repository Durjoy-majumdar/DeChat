package com.tencent.p014mm.booter;

import com.tencent.p014mm.sdk.platformtools.Log;
import zt3.C119146d;

/* renamed from: com.tencent.mm.booter.i0 */
public class C114713i0 implements C119146d.C119152g {
    public C114713i0(C80824k0 k0Var) {
    }

    /* renamed from: a */
    public void mo174280a(Thread thread, String str, long j) {
        Log.m105924i("MicroMsg.ThreadBootDelegate", "[onInterrupt] name=" + str + " id=" + j);
    }

    /* renamed from: b */
    public void mo174281b(Thread thread, String str, long j) {
        Log.m105924i("MicroMsg.ThreadBootDelegate", "[onThreadStart] name=" + str + " id=" + j);
    }

    /* renamed from: c */
    public void mo174282c(Thread thread, String str, long j) {
        Log.m105924i("MicroMsg.ThreadBootDelegate", "[onThreadExit] name=" + str + " id=" + j);
    }
}
