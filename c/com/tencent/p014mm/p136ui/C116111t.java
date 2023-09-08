package com.tencent.p014mm.p136ui;

import a70.C112760b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ClearCacheEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.storage.C85802w1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C97625j3;
import jr2.C99015i;
import mc0.C34542b;
import p243tn.C14050a;
import p910lj.C76701a;
import rb0.C47966e0;
import vu0.C118698h;

/* renamed from: com.tencent.mm.ui.t */
public class C116111t implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f348459d;

    /* renamed from: com.tencent.mm.ui.t$a */
    public class C30863a implements Runnable {
        public C30863a(C116111t tVar) {
        }

        public void run() {
            C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) MMApplicationContext.getContext().getString(C0966R.string.bfa), 0).show();
        }
    }

    public C116111t(ClearCacheUI clearCacheUI, long j) {
        this.f348459d = j;
    }

    public void run() {
        Log.m105929w("MicroMsg.ClearCacheUI", "doClearCache flag %d", Long.valueOf(this.f348459d));
        if ((this.f348459d & 1) != 0) {
            C86013q1.m106445f(C14050a.m13404a());
        }
        if ((this.f348459d & 2) != 0) {
            C86013q1.m106445f(C34542b.f92924a);
        }
        if ((this.f348459d & 4) != 0) {
            C86013q1.m106445f(C112760b.m154234h0());
        }
        if ((this.f348459d & 8) != 0) {
            C97625j3.m125812b().getClass();
            C86013q1.m106445f(((C47966e0) C86312j.m106911c(C47966e0.class)).mo72738M3());
        }
        if ((this.f348459d & 16) != 0) {
            C86013q1.m106445f(C118698h.m167389a());
        }
        if ((this.f348459d & 32) != 0) {
            C97625j3.m125812b().getClass();
            C86013q1.m106445f(C85802w1.m106019a());
        }
        if ((this.f348459d & 64) != 0) {
            C97625j3.m125812b();
            C86013q1.m106445f(((C99015i) C86312j.m106911c(C99015i.class)).mo61935YO());
        }
        ClearCacheEvent clearCacheEvent = new ClearCacheEvent();
        clearCacheEvent.f343545d.f343546a = this.f348459d;
        clearCacheEvent.publish();
        MMHandlerThread.postToMainThread(new C30863a(this));
    }
}
