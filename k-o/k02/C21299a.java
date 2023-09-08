package k02;

import a70.C112760b;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.p014mm.compatible.deviceinfo.C104619a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import f40.C86709a0;
import hp3.C87581a;
import j02.C21146a;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import kr0.C34019v0;
import lp3.C46888b;
import lp3.C88643g;
import p156gj.C107835h0;
import p156gj.C87201q;
import p156gj.C87203t;
import te3.C118436gr1;
import te3.C22492da;
import te3.C22496fe0;
import te3.C22504jw2;
import te3.C22519om;
import te3.C22526qf2;
import te3.C51168rx;
import te3.C51171rx2;
import te3.C64841xw3;
import te3.mb4;

/* renamed from: k02.a */
public class C21299a implements C87581a<C22526qf2, Context> {

    /* renamed from: a */
    public Context f60157a = null;

    /* renamed from: j */
    public static String m23820j(String str) {
        C104619a aVar = null;
        try {
            C104619a d = C104619a.m140212d(str, true);
            String k = d.mo148209k();
            try {
                d.mo148214p();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.TaskFindHardwareInfo", e, "codec release exception", new Object[0]);
            }
            return k;
        } catch (Exception e2) {
            Log.printErrStackTrace("MicroMsg.TaskFindHardwareInfo", e2, "hy: error in handle media codec", new Object[0]);
            if (aVar != null) {
                try {
                    aVar.mo148214p();
                } catch (Exception e3) {
                    Log.printErrStackTrace("MicroMsg.TaskFindHardwareInfo", e3, "codec release exception", new Object[0]);
                }
            }
            return "undefined";
        } catch (Throwable th) {
            if (aVar != null) {
                try {
                    aVar.mo148214p();
                } catch (Exception e4) {
                    Log.printErrStackTrace("MicroMsg.TaskFindHardwareInfo", e4, "codec release exception", new Object[0]);
                }
            }
            throw th;
        }
    }

    /* renamed from: b */
    public final void mo33274b() {
        C22492da daVar = new C22492da();
        daVar.f63738d = C87203t.m108270f(false);
        daVar.f63739e = Build.MANUFACTURER;
        daVar.f63740f = C87203t.m108275k();
        daVar.f63741g = Build.VERSION.INCREMENTAL;
        C21146a.m23560b().mo33104a().f64492d = daVar;
        Log.m105919d("MicroMsg.TaskFindHardwareInfo", "hy: hardwareinfo: imei: %s, manufacrtureName: %s, modelName: %s, incremental: %s", daVar.f63738d, daVar.f63739e, daVar.f63740f, daVar.f63741g);
    }

    /* renamed from: c */
    public final void mo33275c() {
        C22519om omVar = new C22519om();
        omVar.f64359f = Build.CPU_ABI;
        Map<String, String> c = C87201q.m108259c();
        omVar.f64357d = Util.nullAs(c.get("Processor"), "");
        omVar.f64360g = c.get("model name");
        omVar.f64361h = c.get("Hardware");
        RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile = C86013q1.m106420B("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq", false);
            omVar.f64358e = Util.getInt(randomAccessFile.readLine(), -1) / 1000;
            try {
                randomAccessFile.close();
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.TaskFindHardwareInfo", e, "hy: error when close read cpu files", new Object[0]);
            }
        } catch (IOException e2) {
            Log.printErrStackTrace("MicroMsg.TaskFindHardwareInfo", e2, "hy: error when reading cpu frequency", new Object[0]);
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException e3) {
                    Log.printErrStackTrace("MicroMsg.TaskFindHardwareInfo", e3, "hy: error when close read cpu files", new Object[0]);
                }
            }
        } catch (Throwable th) {
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException e4) {
                    Log.printErrStackTrace("MicroMsg.TaskFindHardwareInfo", e4, "hy: error when close read cpu files", new Object[0]);
                }
            }
            throw th;
        }
        C21146a.m23560b().mo33104a().f64493e = omVar;
        Log.m105919d("MicroMsg.TaskFindHardwareInfo", "hy: hardwareinfo: abi: %s, cpuModel: %s, cpuClockSpeedInHz: %d, modelName: %s, platform: %s", omVar.f64359f, omVar.f64357d, Integer.valueOf(omVar.f64358e), omVar.f64360g, omVar.f64361h);
    }

    public Object call(Object obj) {
        this.f60157a = (Context) obj;
        long nanoTime = System.nanoTime();
        try {
            mo33274b();
            mo33275c();
            mo33279g();
            mo33281i();
            mo33277e();
            mo33280h();
            mo33278f();
            mo33276d();
            Log.m105925i("MicroMsg.TaskFindHardwareInfo", "hy: calc hardware using: %d ms", Long.valueOf(((System.nanoTime() - nanoTime) / 1000) / 1000));
            mo33282k();
            return C21146a.m23560b().mo33104a();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.TaskFindHardwareInfo", e, "hy: exception when find hardware info", new Object[0]);
            C46888b c = C88643g.m110545c();
            if (c != null) {
                c.mo72091a((Object) null);
            }
            return null;
        }
    }

    /* renamed from: d */
    public final void mo33276d() {
        C22496fe0 fe02 = new C22496fe0();
        fe02.f63803d = this.f60157a.getPackageManager().hasSystemFeature("android.hardware.bluetooth");
        int i = Build.VERSION.SDK_INT;
        fe02.f63804e = this.f60157a.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
        fe02.f63805f = this.f60157a.getPackageManager().hasSystemFeature("android.hardware.location.gps");
        fe02.f63806g = this.f60157a.getPackageManager().hasSystemFeature("android.hardware.camera.flash");
        fe02.f63807h = this.f60157a.getPackageManager().hasSystemFeature("android.hardware.camera.front");
        fe02.f63808i = this.f60157a.getPackageManager().hasSystemFeature("android.hardware.microphone");
        fe02.f63809j = this.f60157a.getPackageManager().hasSystemFeature("android.hardware.nfc");
        fe02.f63820x = this.f60157a.getPackageManager().hasSystemFeature("android.hardware.nfc.hce");
        fe02.f63810n = this.f60157a.getPackageManager().hasSystemFeature("android.hardware.nfc");
        if (i >= 23) {
            fe02.f63811o = this.f60157a.getPackageManager().hasSystemFeature("android.hardware.fingerprint");
        } else if (C107835h0.f322849f.f322932a == 1) {
            fe02.f63811o = true;
        } else {
            fe02.f63811o = false;
        }
        fe02.f63812p = this.f60157a.getPackageManager().hasSystemFeature("android.hardware.telephony.cdma");
        fe02.f63813q = this.f60157a.getPackageManager().hasSystemFeature("android.hardware.telephony.gsm");
        fe02.f63814r = this.f60157a.getPackageManager().hasSystemFeature("android.software.sip");
        fe02.f63815s = this.f60157a.getPackageManager().hasSystemFeature("android.software.sip.voip");
        fe02.f63816t = this.f60157a.getPackageManager().hasSystemFeature("android.hardware.sensor.stepdetector");
        fe02.f63817u = this.f60157a.getPackageManager().hasSystemFeature("android.hardware.sensor.stepcounter");
        fe02.f63818v = this.f60157a.getPackageManager().hasSystemFeature("android.hardware.sensor.accelerometer");
        fe02.f63819w = this.f60157a.getPackageManager().hasSystemFeature("android.hardware.sensor.light");
        C21146a.m23560b().mo33104a().f64498j = fe02;
        Log.m105919d("MicroMsg.TaskFindHardwareInfo", "hy: hy: hardwareinfo: hasBluetooth: %b, hasBluetoothLE: %b, hasGPS: %b, hasCameraFlash: %b, hasCameraFront: %b, hasMic: %b, hasNFC: %b, hasNfcHce: %b, hasHifiSensor: %b, hasFingerprintSensor: %b, hasCDMA: %b, hasGSM: %b, hasSIP: %b, hasSIPBasedVoIP: %b, hasStepDitector: %b , hasStepCounter: %b, hasAcceloratorSensor: %b, hasLightSensor: %b", Boolean.valueOf(fe02.f63803d), Boolean.valueOf(fe02.f63804e), Boolean.valueOf(fe02.f63805f), Boolean.valueOf(fe02.f63806g), Boolean.valueOf(fe02.f63807h), Boolean.valueOf(fe02.f63808i), Boolean.valueOf(fe02.f63809j), Boolean.valueOf(fe02.f63820x), Boolean.valueOf(fe02.f63810n), Boolean.valueOf(fe02.f63811o), Boolean.valueOf(fe02.f63812p), Boolean.valueOf(fe02.f63813q), Boolean.valueOf(fe02.f63814r), Boolean.valueOf(fe02.f63815s), Boolean.valueOf(fe02.f63816t), Boolean.valueOf(fe02.f63817u), Boolean.valueOf(fe02.f63818v), Boolean.valueOf(fe02.f63819w));
    }

    /* renamed from: e */
    public final void mo33277e() {
        ConfigurationInfo deviceConfigurationInfo = ((ActivityManager) this.f60157a.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getDeviceConfigurationInfo();
        C118436gr1 gr12 = new C118436gr1();
        int i = deviceConfigurationInfo.reqGlEsVersion;
        gr12.f354036d = i >= 131072;
        gr12.f354037e = i >= 196608;
        try {
            gr12.f354038f = ((C34019v0) C86312j.m106911c(C34019v0.class)).mo59406Ek();
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.TaskFindHardwareInfo", th, "hy: error when retrieve vulkan support!", new Object[0]);
            gr12.f354038f = false;
        }
        C21146a.m23560b().mo33104a().f64499n = gr12;
        Log.m105919d("MicroMsg.TaskFindHardwareInfo", "hy: hardwareinfo: hasOpenGL20: %b, hasOpenGL30: %b, esversion: %s, isSupportVulkan: %b", Boolean.valueOf(gr12.f354036d), Boolean.valueOf(gr12.f354037e), Integer.valueOf(deviceConfigurationInfo.reqGlEsVersion), Boolean.valueOf(gr12.f354038f));
    }

    /* renamed from: f */
    public final void mo33278f() {
        C51168rx rxVar = new C51168rx();
        rxVar.f141193d = m23820j("video/avc");
        rxVar.f141194e = m23820j("video/hevc");
        int codecCount = MediaCodecList.getCodecCount();
        LinkedList<C51171rx2> linkedList = new LinkedList<>();
        HashMap hashMap = new HashMap();
        int i = 0;
        for (int i2 = 0; i2 < codecCount; i2++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
            if (codecInfoAt.isEncoder()) {
                for (String str : codecInfoAt.getSupportedTypes()) {
                    Set set = (Set) hashMap.get(str.toLowerCase());
                    if (set == null) {
                        set = new HashSet();
                    }
                    set.add(codecInfoAt.getName());
                    hashMap.put(str.toLowerCase(), set);
                }
            }
        }
        Log.m105925i("MicroMsg.TaskFindHardwareInfo", "hy: allCodecNames: %s", hashMap);
        for (Map.Entry entry : hashMap.entrySet()) {
            C51171rx2 rx22 = new C51171rx2();
            rx22.f141204d = (String) entry.getKey();
            LinkedList<String> linkedList2 = new LinkedList<>();
            if (entry.getValue() != null) {
                linkedList2.addAll((Collection) entry.getValue());
            }
            rx22.f141205e = linkedList2;
            linkedList.add(rx22);
        }
        rxVar.f141195f = linkedList;
        C21146a.m23560b().mo33104a().f64497i = rxVar;
        Object[] objArr = new Object[3];
        objArr[0] = rxVar.f141193d;
        objArr[1] = rxVar.f141194e;
        LinkedList<C51171rx2> linkedList3 = rxVar.f141195f;
        if (linkedList3 != null) {
            i = linkedList3.size();
        }
        objArr[2] = Integer.valueOf(i);
        Log.m105919d("MicroMsg.TaskFindHardwareInfo", "hy: hardwareinfo: default codec name avc: %s, default hevc names: %s, codec number: %d", objArr);
    }

    /* renamed from: g */
    public final void mo33279g() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) this.f60157a.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getMemoryInfo(memoryInfo);
        C22504jw2 jw22 = new C22504jw2();
        jw22.f64083d = (int) ((memoryInfo.totalMem / 1024) / 1024);
        jw22.f64084e = (int) ((memoryInfo.threshold / 1024) / 1024);
        jw22.f64085f = ((ActivityManager) this.f60157a.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getLargeMemoryClass();
        jw22.f64086g = ((ActivityManager) this.f60157a.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getMemoryClass();
        C21146a.m23560b().mo33104a().f64494f = jw22;
        Log.m105919d("MicroMsg.TaskFindHardwareInfo", "hy: hardwareinfo: totalMemInMB: %d, thresholdInMB: %d, large memory class; %d, memory class: %d", Integer.valueOf(jw22.f64083d), Integer.valueOf(jw22.f64084e), Integer.valueOf(jw22.f64085f), Integer.valueOf(jw22.f64086g));
    }

    /* renamed from: h */
    public final void mo33280h() {
        Display defaultDisplay = ((WindowManager) this.f60157a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        int i = point.x;
        int i2 = point.y;
        C64841xw3 xw32 = new C64841xw3();
        xw32.f186412d = String.valueOf(i) + "x" + i2;
        xw32.f186413e = (int) this.f60157a.getResources().getDisplayMetrics().density;
        C21146a.m23560b().mo33104a().f64496h = xw32;
        Log.m105919d("MicroMsg.TaskFindHardwareInfo", "hy: hardwareinfo: resolution: %s, ppi: %d", xw32.f186412d, Integer.valueOf(xw32.f186413e));
    }

    /* renamed from: i */
    public final void mo33281i() {
        StatFs statFs = new StatFs(C112760b.m154230f0());
        mb4 mb4 = new mb4();
        mb4.f137943d = (int) ((statFs.getTotalBytes() / 1024) / 1024);
        mb4.f137944e = Environment.getExternalStorageState().equals("mounted");
        C21146a.m23560b().mo33104a().f64495g = mb4;
        Log.m105919d("MicroMsg.TaskFindHardwareInfo", "hy: hardwareinfo: totalStorageInMB: %d, hasExternalStorage: %b", Integer.valueOf(mb4.f137943d), Boolean.valueOf(mb4.f137944e));
    }

    /* renamed from: k */
    public final void mo33282k() {
        try {
            C22526qf2 a = C21146a.m23560b().mo33104a();
            if (a != null) {
                if (a.f64493e != null) {
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_HARDWARE_CPU_FREQUENCY_MHZ_INT_SYNC, Integer.valueOf(a.f64493e.f64358e));
                }
                if (a.f64494f != null) {
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_HARDWARE_MEMORY_IN_MB_INT_SYNC, Integer.valueOf(a.f64494f.f64083d));
                }
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.TaskFindHardwareInfo", e, "alvinluo save hardware info to config storage exception", new Object[0]);
        }
    }
}
