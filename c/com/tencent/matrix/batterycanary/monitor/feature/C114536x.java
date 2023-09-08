package com.tencent.matrix.batterycanary.monitor.feature;

import android.content.Context;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.xweb.WCWebUpdater;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import p1177ce.C113314g;
import p1190de.C116608a;
import p723vf.C118672d;
import p933be.C113159b;
import p981ie.C117159b;
import p981ie.C117187w;
import p981ie.C87705i;

/* renamed from: com.tencent.matrix.batterycanary.monitor.feature.x */
public final class C114536x extends C116608a {

    /* renamed from: b */
    public C114544h f343303b;

    /* renamed from: c */
    public List<C117187w.C117189b> f343304c = Collections.emptyList();

    /* renamed from: d */
    public Runnable f343305d = new C114537a();

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.x$a */
    public class C114537a implements Runnable {
        public C114537a() {
        }

        public void run() {
            if (C114536x.this.f343304c.size() >= C114536x.this.f349668a.f339057d.f339037h) {
                synchronized ("Matrix.battery.DeviceStatusMonitorFeature") {
                    C117187w.m165274b(C114536x.this.f343304c);
                }
            }
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.x$b */
    public class C114538b implements C87705i<Integer> {
        public C114538b() {
        }

        public void accept(Object obj) {
            String str;
            C114536x xVar = C114536x.this;
            int intValue = ((Integer) obj).intValue();
            xVar.getClass();
            C117159b.C117160a aVar = (C117159b.C117160a) C117159b.f351002a;
            synchronized (aVar) {
                aVar.f351007e = new C117159b.C117161b.C117162a<>(Integer.valueOf(intValue), FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
            }
            synchronized ("Matrix.battery.DeviceStatusMonitorFeature") {
                if (xVar.f343304c != Collections.EMPTY_LIST) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("onStat >> ");
                    switch (intValue) {
                        case 1:
                            str = "charging";
                            break;
                        case 2:
                            str = "non_charge";
                            break;
                        case 3:
                            str = "screen_off";
                            break;
                        case 4:
                            str = "standby_on";
                            break;
                        case 5:
                            str = "screen_on";
                            break;
                        case 6:
                            str = "standby_off";
                            break;
                        case 7:
                            str = "doze_on";
                            break;
                        case 8:
                            str = "doze_off";
                            break;
                        default:
                            str = "unknown";
                            break;
                    }
                    sb.append(str);
                    C118672d.m167353c("Matrix.battery.LifeCycle", sb.toString(), new Object[0]);
                    xVar.f343304c.add(0, new C117187w.C117189b(String.valueOf(intValue)));
                    xVar.f349668a.f339059f.removeCallbacks(xVar.f343305d);
                    xVar.f349668a.f339059f.postDelayed(xVar.f343305d, 1000);
                }
            }
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.x$c */
    public class C114539c implements C117187w.C117189b.C117190a {
        public C114539c() {
        }

        /* renamed from: a */
        public C117187w.C117189b mo173647a(String str) {
            return new C117187w.C117189b(String.valueOf(C117159b.m165213n(C114536x.this.f349668a.mo165879a())));
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.x$d */
    public static class C114540d extends C114490k0.C114491a<C114540d> {

        /* renamed from: d */
        public C114490k0.C114491a.C114494b.C114497b<Long> f343309d;

        /* renamed from: a */
        public C114490k0.C114491a.C114492a mo111825a(C114490k0.C114491a aVar) {
            return new C114549y(this, (C114540d) aVar, this);
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.x$e */
    public static class C114541e extends C114490k0.C114491a<C114541e> {

        /* renamed from: d */
        public C114490k0.C114491a.C114494b.C114497b<Integer> f343310d;

        /* renamed from: a */
        public C114490k0.C114491a.C114492a mo111825a(C114490k0.C114491a aVar) {
            return new C114550z(this, (C114541e) aVar, this);
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.x$f */
    public static class C114542f extends C114490k0.C114491a<C114542f> {

        /* renamed from: d */
        public C114490k0.C114491a.C114494b.C114497b<Integer> f343311d;

        /* renamed from: a */
        public C114490k0.C114491a.C114492a mo111825a(C114490k0.C114491a aVar) {
            return new C114441a0(this, (C114542f) aVar, this);
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.x$g */
    public static class C114543g extends C114490k0.C114491a<C114543g> {

        /* renamed from: d */
        public C114490k0.C114491a.C114494b.C114502c<C114490k0.C114491a.C114494b.C114497b<Integer>> f343312d;

        /* renamed from: a */
        public C114490k0.C114491a.C114492a mo111825a(C114490k0.C114491a aVar) {
            return new C114443b0(this, (C114543g) aVar, this);
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.x$h */
    public static final class C114544h {

        /* renamed from: a */
        public C87705i<Integer> f343313a = new C114545a(this);

        /* renamed from: b */
        public boolean f343314b = true;

        /* renamed from: c */
        public boolean f343315c = false;

        /* renamed from: d */
        public C113159b.C113164d f343316d;

        /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.x$h$a */
        public class C114545a implements C87705i<Integer> {
            public C114545a(C114544h hVar) {
            }

            public /* bridge */ /* synthetic */ void accept(Object obj) {
                Integer num = (Integer) obj;
            }
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.x$i */
    public static final class C114546i extends C114490k0.C114491a<C114546i> {

        /* renamed from: d */
        public C114490k0.C114491a.C114494b.C114497b<Long> f343317d = C114490k0.C114491a.C114494b.C114497b.m161112b(0L);

        /* renamed from: e */
        public C114490k0.C114491a.C114494b.C114497b<Long> f343318e = C114490k0.C114491a.C114494b.C114497b.m161112b(0L);

        /* renamed from: f */
        public C114490k0.C114491a.C114494b.C114497b<Long> f343319f = C114490k0.C114491a.C114494b.C114497b.m161112b(0L);

        /* renamed from: g */
        public C114490k0.C114491a.C114494b.C114497b<Long> f343320g = C114490k0.C114491a.C114494b.C114497b.m161112b(0L);

        /* renamed from: h */
        public C114490k0.C114491a.C114494b.C114497b<Long> f343321h = C114490k0.C114491a.C114494b.C114497b.m161112b(0L);

        /* renamed from: a */
        public C114490k0.C114491a.C114492a mo111825a(C114490k0.C114491a aVar) {
            return new C114450d0(this, (C114546i) aVar, this);
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.x$j */
    public static class C114547j extends C114490k0.C114491a<C114547j> {

        /* renamed from: d */
        public C114490k0.C114491a.C114494b.C114497b<Float> f343322d;

        /* renamed from: a */
        public C114490k0.C114491a.C114492a mo111825a(C114490k0.C114491a aVar) {
            return new C114459e0(this, (C114547j) aVar, this);
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.x$k */
    public static class C114548k extends C114490k0.C114491a<C114548k> {

        /* renamed from: d */
        public C114490k0.C114491a.C114494b.C114497b<Integer> f343323d;

        /* renamed from: a */
        public C114490k0.C114491a.C114492a mo111825a(C114490k0.C114491a aVar) {
            return new C114461f0(this, (C114548k) aVar, this);
        }
    }

    /* renamed from: a */
    public void mo173597a(boolean z) {
        super.mo173597a(z);
    }

    /* renamed from: b */
    public void mo111817b() {
        super.mo111817b();
        C117187w.C117189b bVar = new C117187w.C117189b(String.valueOf(C117159b.m165213n(this.f349668a.mo165879a())));
        synchronized ("Matrix.battery.DeviceStatusMonitorFeature") {
            ArrayList arrayList = new ArrayList();
            this.f343304c = arrayList;
            arrayList.add(0, bVar);
        }
        C114544h hVar = this.f343303b;
        hVar.f343313a = new C114538b();
        if (!hVar.f343315c) {
            Context a = this.f349668a.mo165879a();
            if (hVar.f343315c) {
                return;
            }
            if (C113159b.m154843i()) {
                hVar.f343316d = new C114448c0(hVar);
                hVar.f343314b = C117159b.m165218s(a);
                C113159b h = C113159b.m154842h();
                C113159b.C113164d dVar = hVar.f343316d;
                synchronized (h.f338584b) {
                    if (!((LinkedList) h.f338584b).contains(dVar)) {
                        ((LinkedList) h.f338584b).add(dVar);
                    }
                }
                hVar.f343315c = true;
                return;
            }
            throw new IllegalStateException("BatteryEventDelegate is not yet init!");
        }
    }

    /* renamed from: d */
    public int mo111818d() {
        return Integer.MAX_VALUE;
    }

    /* renamed from: e */
    public void mo173631e(C113314g gVar) {
        super.mo173631e(gVar);
        this.f343303b = new C114544h();
    }

    /* renamed from: f */
    public void mo111819f() {
        super.mo111819f();
        C114544h hVar = this.f343303b;
        if (hVar.f343315c) {
            try {
                if (hVar.f343316d != null && C113159b.m154843i()) {
                    C113159b.m154842h().mo165671j(hVar.f343316d);
                }
            } catch (Throwable unused) {
            }
            hVar.f343315c = false;
        }
    }

    /* renamed from: g */
    public String mo111820g() {
        return "Matrix.battery.DeviceStatusMonitorFeature";
    }

    /* renamed from: i */
    public C114541e mo173709i(Context context) {
        int i;
        C114541e eVar = new C114541e();
        this.f349668a.getClass();
        try {
            i = C117159b.m165207h(context);
            C118672d.m167353c("Matrix.battery.BatteryMonitorCore", "onGetTemperature, battery = " + i, new Object[0]);
        } catch (Throwable th) {
            C118672d.m167354d("Matrix.battery.BatteryMonitorCore", th, "#currentBatteryTemperature error", new Object[0]);
            i = -1;
        }
        eVar.f343310d = C114490k0.C114491a.C114494b.C114497b.m161112b(Integer.valueOf(i));
        return eVar;
    }

    /* renamed from: j */
    public C114543g mo173710j(int[] iArr) {
        C114543g gVar = new C114543g();
        ArrayList arrayList = new ArrayList();
        for (int valueOf : iArr) {
            arrayList.add(C114490k0.C114491a.C114494b.C114497b.m161112b(Integer.valueOf(valueOf)));
        }
        C114490k0.C114491a.C114494b.C114502c<C114490k0.C114491a.C114494b.C114497b<Integer>> cVar = new C114490k0.C114491a.C114494b.C114502c<>();
        cVar.f343212a = arrayList;
        gVar.f343312d = cVar;
        return gVar;
    }

    /* renamed from: k */
    public C114546i mo173711k(long j) {
        try {
            C117187w.C117192d a = C117187w.m165273a(this.f343304c, j, 10, new C114539c());
            C114546i iVar = new C114546i();
            iVar.f343204c = a.f351076c;
            iVar.f343317d = C114490k0.C114491a.C114494b.C114497b.m161112b(Long.valueOf(a.f351074a));
            iVar.f343318e = C114490k0.C114491a.C114494b.C114497b.m161112b(Long.valueOf((long) a.mo181113a("1")));
            iVar.f343319f = C114490k0.C114491a.C114494b.C114497b.m161112b(Long.valueOf((long) a.mo181113a("2")));
            iVar.f343320g = C114490k0.C114491a.C114494b.C114497b.m161112b(Long.valueOf((long) a.mo181113a("3")));
            iVar.f343321h = C114490k0.C114491a.C114494b.C114497b.m161112b(Long.valueOf((long) a.mo181113a(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL)));
            return iVar;
        } catch (Throwable th) {
            C118672d.m167356f("Matrix.battery.DeviceStatusMonitorFeature", "configureSnapshot fail: " + th.getMessage(), new Object[0]);
            C114546i iVar2 = new C114546i();
            iVar2.f343204c = false;
            return iVar2;
        }
    }
}
