package com.tencent.p014mm.plugin.appbrand.appusage;

import android.os.DeadObjectException;
import android.os.Looper;
import com.tencent.p014mm.plugin.appbrand.appusage.C81531v;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.storage.MStorage;
import di3.C86312j;
import s20.C90123b;

/* renamed from: com.tencent.mm.plugin.appbrand.appusage.x */
public class C81541x implements C90123b {

    /* renamed from: a */
    public final /* synthetic */ MStorage.IOnStorageChange f239155a;

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.x$a */
    public class C81542a implements Runnable {
        public C81542a() {
        }

        public void run() {
            ((C68587i1) C86312j.m106911c(C68587i1.class)).remove(C81541x.this.f239155a);
        }
    }

    public C81541x(C81531v.C81536d dVar, MStorage.IOnStorageChange iOnStorageChange) {
        this.f239155a = iOnStorageChange;
    }

    /* renamed from: a */
    public void mo113810a(Exception exc) {
        if (exc instanceof DeadObjectException) {
            new MMHandler(Looper.myLooper()).post(new C81542a());
        } else if (!(exc instanceof RuntimeException)) {
            Log.m105921e("MicroMsg.AppBrandLocalUsageStorageIPCImpl", "onExceptionOccur(%s)", android.util.Log.getStackTraceString(exc));
        } else {
            throw ((RuntimeException) exc);
        }
    }
}
