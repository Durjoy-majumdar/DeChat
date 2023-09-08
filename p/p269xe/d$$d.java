package p269xe;

import android.util.SparseArray;
import com.tencent.matrix.batterycanary.monitor.feature.C114519q0;
import com.tencent.matrix.batterycanary.monitor.feature.C114536x;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.List;
import p269xe.C91179e;
import p981ie.C87705i;

/* renamed from: xe.d$$d */
public final /* synthetic */ class d$$d implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ long f355647a;

    /* renamed from: b */
    public final /* synthetic */ long f355648b;

    /* renamed from: c */
    public final /* synthetic */ C114519q0.C114524d.C114526b f355649c;

    /* renamed from: d */
    public final /* synthetic */ long f355650d;

    /* renamed from: e */
    public final /* synthetic */ String f355651e;

    /* renamed from: f */
    public final /* synthetic */ long f355652f;

    public /* synthetic */ d$$d(long j, long j2, C114519q0.C114524d.C114526b bVar, long j3, String str, long j4) {
        this.f355647a = j;
        this.f355648b = j2;
        this.f355649c = bVar;
        this.f355650d = j3;
        this.f355651e = str;
        this.f355652f = j4;
    }

    public final void accept(Object obj) {
        long j = this.f355647a;
        long j2 = this.f355648b;
        C114519q0.C114524d.C114526b bVar = this.f355649c;
        long j3 = this.f355650d;
        String str = this.f355651e;
        long j4 = this.f355652f;
        C114536x.C114546i k = ((C114536x) obj).mo173711k(j);
        if (k.f343204c) {
            long longValue = ((Long) k.f343318e.f343211a).longValue();
            Log.m105928w("Matrix.battery.listener", "#onBgWakeLockTimeout report as exception!");
            List<String> list = C91179e.C91181b.C91182a.f261437a;
            int c = C118872b.m167606c();
            long j5 = j4;
            int e = C118872b.m167608e();
            Log.m105924i("Matrix.battery.BatteryReporter", "#reportWakeLocksOvertimeBg, mills = " + j2);
            SparseArray<Integer> sparseArray = C91179e.C91181b.f261436a;
            String str2 = str;
            C91179e.C91181b.m114437a(1, 5, C118872b.m167609f(), bVar.f343281c + "-" + bVar.f343280b, c, e, "wakeBgException", j2, "lockMils", bVar.mo173706a(), "flag", (long) bVar.f343279a, str2, bVar.f343282d, j3, longValue, j5, "");
        }
    }
}
