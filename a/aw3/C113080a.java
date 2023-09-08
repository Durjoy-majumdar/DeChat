package aw3;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.text.TextUtils;
import com.tencent.midas.data.APMidasPluginInfo;
import ew3.C116792b;
import ew3.C116795d;
import gw3.C116997a;
import java.io.File;
import java.util.Map;
import ov3.C117899b;
import rv3.C118245h;
import uv3.C118622l;
import uv3.C14387i;
import vv3.C118702d;
import vv3.C118706h;
import xv3.C118907b;
import zv3.C119181b;

/* renamed from: aw3.a */
public abstract class C113080a implements C117899b {

    /* renamed from: a */
    public C118702d f338483a;

    /* renamed from: b */
    public C116792b f338484b;

    public C113080a(Context context, C118622l lVar) {
        C118245h.f353423a = false;
        C118702d dVar = new C118702d(context, lVar);
        this.f338483a = dVar;
        dVar.f355208d = this;
    }

    /* renamed from: a */
    public boolean mo165607a(C116997a aVar, Map<File, String> map) {
        if (aVar == null || map == null || map.isEmpty()) {
            return false;
        }
        this.f338483a.f355211g.getClass();
        if (TextUtils.isEmpty("")) {
            return false;
        }
        C118245h.m166799a("sensor_AbsTuringSMIImpl", "[method: buildStatisticsField ] statistics : " + "" + ", allStatistics size : " + map.size());
        aVar.f350591E = "";
        return true;
    }

    /* renamed from: b */
    public boolean mo165608b(Throwable th, String str) {
        try {
            return C119181b.m168096b().mo183897c(this.f338483a, th, str);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: c */
    public void mo165609c() {
        C118702d dVar = this.f338483a;
        Context context = dVar.f355205a;
        C118907b bVar = dVar.f355207c;
        if (bVar != null) {
            int[] iArr = {1, 4, 9};
            SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
            boolean z = true;
            int i = 1;
            for (int i2 = 0; i2 < 3; i2++) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(iArr[i2]);
                i |= (defaultSensor == null ? 0 : 1) << i2;
                if (defaultSensor == null) {
                    z = false;
                }
            }
            bVar.f356186a = z;
            bVar.f356187b = i;
        }
        C118702d dVar2 = this.f338483a;
        boolean z2 = dVar2.f355207c.f356186a;
        this.f338484b = new C116795d(dVar2);
        new C118706h(dVar2, "turing_smi", 5);
        this.f338483a.f355211g.getClass();
    }

    /* renamed from: d */
    public boolean mo165610d() {
        boolean z;
        C117899b bVar;
        if (this.f338483a.f355205a != null) {
            try {
                mo165609c();
                z = true;
                try {
                    boolean z2 = this.f338483a.f355207c.f356186a;
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th4) {
                th = th4;
                z = false;
                C118702d dVar = this.f338483a;
                if (!(dVar == null || (bVar = dVar.f355208d) == null)) {
                    ((C113080a) bVar).mo165608b(th, APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
                }
                return z;
            }
            return z;
        }
        throw new C14387i(104, "the context is error");
    }
}
