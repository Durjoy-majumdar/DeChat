package com.tencent.p014mm.plugin.appbrand.ipc;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.p427v4.p1171os.ResultReceiver;
import androidx.core.app.ComponentActivity;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.ipc.ResultReceiverFixLeak */
public class ResultReceiverFixLeak {

    /* renamed from: com.tencent.mm.plugin.appbrand.ipc.ResultReceiverFixLeak$ResultReceiverLifecycleWrapper */
    public static final class ResultReceiverLifecycleWrapper extends ResultReceiver implements C0124r {

        /* renamed from: g */
        public ResultReceiver f240355g;

        /* renamed from: com.tencent.mm.plugin.appbrand.ipc.ResultReceiverFixLeak$ResultReceiverLifecycleWrapper$a */
        public class C81955a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C0125s f240356d;

            public C81955a(C0125s sVar) {
                this.f240356d = sVar;
            }

            public void run() {
                this.f240356d.getLifecycle().addObserver(ResultReceiverLifecycleWrapper.this);
            }
        }

        public ResultReceiverLifecycleWrapper(ResultReceiver resultReceiver, C0125s sVar) {
            super(resultReceiver.f337811e);
            this.f240355g = resultReceiver;
            if (Looper.getMainLooper() == Looper.myLooper()) {
                sVar.getLifecycle().addObserver(this);
                return;
            }
            ((C119157j) C119157j.f356862d).mo183895z(new C81955a(sVar));
        }

        /* renamed from: a */
        public void mo883a(int i, Bundle bundle) {
            ResultReceiver resultReceiver = this.f240355g;
            if (resultReceiver != null) {
                resultReceiver.mo883a(i, bundle);
            }
        }

        @C112974b0(C39623j.C39625b.ON_DESTROY)
        public void onDestroy() {
            this.f240355g = null;
        }
    }

    /* renamed from: a */
    public static ResultReceiver m100671a(ResultReceiver resultReceiver, Context context) {
        return (resultReceiver == null || !(context instanceof ComponentActivity)) ? resultReceiver : new ResultReceiverLifecycleWrapper(resultReceiver, (C0125s) context);
    }
}
