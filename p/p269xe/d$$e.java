package p269xe;

import android.util.SparseArray;
import com.tencent.matrix.batterycanary.monitor.feature.C114519q0;
import com.tencent.matrix.batterycanary.monitor.feature.C114536x;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.List;
import p269xe.C91179e;
import p981ie.C87705i;

/* renamed from: xe.d$$e */
public final /* synthetic */ class d$$e implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ long f355653a;

    /* renamed from: b */
    public final /* synthetic */ int f355654b;

    /* renamed from: c */
    public final /* synthetic */ C114519q0.C114524d.C114526b f355655c;

    /* renamed from: d */
    public final /* synthetic */ long f355656d;

    /* renamed from: e */
    public final /* synthetic */ String f355657e;

    /* renamed from: f */
    public final /* synthetic */ long f355658f;

    public /* synthetic */ d$$e(long j, int i, C114519q0.C114524d.C114526b bVar, long j2, String str, long j3) {
        this.f355653a = j;
        this.f355654b = i;
        this.f355655c = bVar;
        this.f355656d = j2;
        this.f355657e = str;
        this.f355658f = j3;
    }

    public final void accept(Object obj) {
        long j = this.f355653a;
        int i = this.f355654b;
        C114519q0.C114524d.C114526b bVar = this.f355655c;
        long j2 = this.f355656d;
        String str = this.f355657e;
        long j3 = this.f355658f;
        C114536x.C114546i k = ((C114536x) obj).mo173711k(j);
        if (k.f343204c) {
            long longValue = ((Long) k.f343318e.f343211a).longValue();
            Log.m105928w("Matrix.battery.listener", "#onWakeLockTimeout report as exception!");
            List<String> list = C91179e.C91181b.C91182a.f261437a;
            int c = C118872b.m167606c();
            int e = C118872b.m167608e();
            Log.m105924i("Matrix.battery.BatteryReporter", "#reportWakeLocksOvertime, count = " + i);
            SparseArray<Integer> sparseArray = C91179e.C91181b.f261436a;
            long a = bVar.mo173706a();
            long j4 = (long) bVar.f343279a;
            String str2 = bVar.f343282d;
            C91179e.C91181b.m114437a(1, 5, C118872b.m167609f(), bVar.f343281c + "-" + bVar.f343280b, c, e, "wakeWarningException", (long) i, "lockMils", a, "flag", j4, str, str2, j2, longValue, j3, "");
        }
    }
}
