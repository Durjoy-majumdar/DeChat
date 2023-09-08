package p1071ae;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;

/* renamed from: ae.a$$c */
public final /* synthetic */ class a$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C112785a f337710d;

    public /* synthetic */ a$$c(C112785a aVar) {
        this.f337710d = aVar;
    }

    public final void run() {
        C112785a aVar = this.f337710d;
        aVar.getClass();
        long j = 0;
        long j2 = MultiProcessMMKV.getDefault().getLong("battery-accpower-lastreportms", 0);
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - j2;
        if (j3 >= ((long) C112785a.f337704e) * 3600000) {
            synchronized (aVar.f337706a) {
                if (j2 != 0) {
                    j = j3;
                }
                aVar.mo164542e(j);
            }
            MultiProcessMMKV.getDefault().putLong("battery-accpower-lastreportms", currentTimeMillis).apply();
        }
        aVar.mo164543f();
    }
}
