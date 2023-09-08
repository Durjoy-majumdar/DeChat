package com.tencent.tmsqmsp.oaid2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.tencent.tmsqmsp.oaid2.k */
public final class C86062k implements ServiceConnection {

    /* renamed from: c */
    public static final ThreadPoolExecutor f250532c = new ThreadPoolExecutor(0, 3, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(2048), new ThreadPoolExecutor.DiscardPolicy());

    /* renamed from: a */
    public boolean f250533a = false;

    /* renamed from: b */
    public final LinkedBlockingQueue<IBinder> f250534b = new LinkedBlockingQueue<>(1);

    /* renamed from: com.tencent.tmsqmsp.oaid2.k$a */
    public class C86063a implements Runnable {

        /* renamed from: a */
        public final IBinder f250535a;

        public C86063a(IBinder iBinder) {
            this.f250535a = iBinder;
        }

        public final void run() {
            try {
                C86062k.this.f250534b.offer(this.f250535a);
            } catch (Throwable unused) {
            }
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            f250532c.execute(new C86063a(iBinder));
        } catch (Throwable unused) {
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
