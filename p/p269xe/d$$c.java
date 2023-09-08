package p269xe;

import android.text.TextUtils;
import android.text.format.DateFormat;
import com.tencent.p014mm.sdk.platformtools.Log;
import kj2.C117407d;
import p1177ce.C113287a;
import p212oe.C117750b;
import p981ie.C87705i;

/* renamed from: xe.d$$c */
public final /* synthetic */ class d$$c implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ C118873d f355646a;

    public /* synthetic */ d$$c(C118873d dVar) {
        this.f355646a = dVar;
    }

    public final void accept(Object obj) {
        C118873d dVar = this.f355646a;
        dVar.getClass();
        long j = ((C113287a) obj).f338976n;
        if (j < C117750b.m166045c()) {
            Log.m105928w("Matrix.battery.BatteryReporter", "#batteryDumpError, minWindowMillis = " + C117750b.m166045c() + ", actual = " + j);
            if (j <= 0) {
                Log.m105920e("Matrix.battery.BatteryReporter", "#batteryDumpError fatal, windowMillis = " + j);
                C117407d.INSTANCE.idkeyStat(1540, 9, 1, false);
            } else {
                C117407d.INSTANCE.idkeyStat(1540, 10, 1, false);
            }
        } else if (j <= 600000) {
            C117407d.INSTANCE.idkeyStat(1540, 11, 1, false);
        } else if (j <= 1200000) {
            C117407d.INSTANCE.idkeyStat(1540, 12, 1, false);
        } else if (j <= 1800000) {
            C117407d.INSTANCE.idkeyStat(1540, 13, 1, false);
        } else {
            C117407d.INSTANCE.idkeyStat(1540, 14, 1, false);
        }
        String valueOf = String.valueOf(DateFormat.format("yyyyMMdd", System.currentTimeMillis()));
        if (!TextUtils.isEmpty(dVar.f355598h) && !dVar.f355598h.equalsIgnoreCase(valueOf)) {
            dVar.f355597g = 0;
        }
        dVar.f355598h = valueOf;
        int i = dVar.f355597g + 1;
        dVar.f355597g = i;
        int i2 = i + 200;
        if (i2 <= 256) {
            C117407d.INSTANCE.idkeyStat(1540, (long) i2, 1, false);
        }
    }
}
