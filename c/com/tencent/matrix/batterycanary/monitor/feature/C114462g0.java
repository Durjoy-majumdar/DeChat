package com.tencent.matrix.batterycanary.monitor.feature;

import android.os.Process;
import com.tencent.matrix.batterycanary.monitor.feature.C114436a;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import p1190de.C116608a;

/* renamed from: com.tencent.matrix.batterycanary.monitor.feature.g0 */
public final class C114462g0 extends C116608a {

    /* renamed from: b */
    public int f343149b = -1;

    /* renamed from: c */
    public C114436a.C114440d f343150c;

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.g0$a */
    public class C114463a implements Runnable {
        public C114463a() {
        }

        public void run() {
            C114462g0.this.f343149b = Process.myTid();
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.g0$b */
    public interface C114464b {
        /* renamed from: f */
        void mo165851f(C114490k0.C114491a.C114492a<C114436a.C114440d> aVar);
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.g0$c */
    public static class C114465c extends C114436a.C114440d {
    }

    /* renamed from: b */
    public void mo111817b() {
        super.mo111817b();
        this.f349668a.f339059f.post(new C114463a());
    }

    /* renamed from: d */
    public int mo111818d() {
        return Integer.MIN_VALUE;
    }

    /* renamed from: g */
    public String mo111820g() {
        return "Matrix.battery.InternalMonitorFeature";
    }
}
