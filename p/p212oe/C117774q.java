package p212oe;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.health.HealthStats;
import android.os.health.TimerStat;
import android.text.TextUtils;
import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import h81.C32735h;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import oa1.C117731d;
import p1195ge.C116947b;
import p1195ge.C116951c;
import p329d3.C58104c;
import p329d3.C86165a;
import p761yd.C91441c;
import p933be.C113173i;
import p933be.C79691a;
import p981ie.C117159b;
import p981ie.C117173p;
import p988jj.C87968a;
import zt3.C119157j;

/* renamed from: oe.q */
public final class C117774q {

    /* renamed from: a */
    public static long f352217a;

    /* renamed from: a */
    public static void m166118a(C58104c cVar) {
        String str;
        String str2;
        int i;
        String str3;
        String str4;
        C58104c cVar2 = cVar;
        String str5 = (String) cVar2.f166179a;
        HealthStats healthStats = (HealthStats) cVar2.f166180b;
        StringBuilder sb = new StringBuilder();
        int measurementKeyCount = healthStats.getMeasurementKeyCount();
        int i2 = 0;
        while (true) {
            str = "";
            str2 = ",";
            if (i2 >= measurementKeyCount) {
                break;
            }
            int measurementKeyAt = healthStats.getMeasurementKeyAt(i2);
            if (healthStats.hasMeasurement(measurementKeyAt)) {
                long measurement = healthStats.getMeasurement(measurementKeyAt);
                if (sb.length() != 0) {
                    str = str2;
                }
                sb.append(str);
                sb.append(measurementKeyAt);
                sb.append("=");
                sb.append(measurement);
            }
            i2++;
        }
        if (sb.length() > 0) {
            Log.m105924i("HealthStatsHelper", healthStats.getDataType() + " " + str5 + " measure: " + sb);
        }
        StringBuilder sb4 = new StringBuilder();
        int measurementsKeyCount = healthStats.getMeasurementsKeyCount();
        for (int i3 = 0; i3 < measurementsKeyCount; i3++) {
            int measurementsKeyAt = healthStats.getMeasurementsKeyAt(i3);
            if (healthStats.hasMeasurements(measurementsKeyAt)) {
                StringBuilder sb5 = new StringBuilder();
                for (Map.Entry next : healthStats.getMeasurements(measurementsKeyAt).entrySet()) {
                    sb5.append(sb5.length() == 0 ? str : str2);
                    sb5.append((String) next.getKey());
                    sb5.append("=");
                    sb5.append(next.getValue());
                }
                sb4.append(sb4.length() == 0 ? str : str2);
                sb4.append(measurementsKeyAt);
                sb4.append("=");
                sb4.append("[");
                sb4.append(sb5);
                sb4.append("]");
            }
        }
        if (sb4.length() > 0) {
            Log.m105924i("HealthStatsHelper", healthStats.getDataType() + " " + str5 + " measureList: " + sb4);
        }
        StringBuilder sb6 = new StringBuilder();
        int timerKeyCount = healthStats.getTimerKeyCount();
        for (int i4 = 0; i4 < timerKeyCount; i4++) {
            int timerKeyAt = healthStats.getTimerKeyAt(i4);
            if (healthStats.hasTimer(timerKeyAt)) {
                TimerStat timer = healthStats.getTimer(timerKeyAt);
                sb6.append(sb6.length() == 0 ? str : str2);
                sb6.append(timerKeyAt);
                sb6.append("=");
                sb6.append(timer.getCount());
                sb6.append(XVFSFile.PATH_SEPARATOR);
                sb6.append(timer.getTime());
            }
        }
        if (sb6.length() > 0) {
            Log.m105924i("HealthStatsHelper", healthStats.getDataType() + " " + str5 + " timer: " + sb6);
        }
        StringBuilder sb7 = new StringBuilder();
        int timersKeyCount = healthStats.getTimersKeyCount();
        int i5 = 0;
        while (i5 < timersKeyCount) {
            int timersKeyAt = healthStats.getTimersKeyAt(i5);
            if (healthStats.hasTimers(timersKeyAt)) {
                StringBuilder sb8 = new StringBuilder();
                for (Map.Entry next2 : healthStats.getTimers(timersKeyAt).entrySet()) {
                    int i6 = timersKeyCount;
                    sb8.append(sb8.length() == 0 ? str : str2);
                    sb8.append((String) next2.getKey());
                    sb8.append("=");
                    sb8.append(((TimerStat) next2.getValue()).getCount());
                    sb8.append(XVFSFile.PATH_SEPARATOR);
                    sb8.append(((TimerStat) next2.getValue()).getTime());
                    timersKeyCount = i6;
                    str = str;
                    str2 = str2;
                }
                i = timersKeyCount;
                str4 = str;
                str3 = str2;
                sb7.append(sb7.length() == 0 ? str4 : str3);
                sb7.append(timersKeyAt);
                sb7.append("=");
                sb7.append("[");
                sb7.append(sb8);
                sb7.append("]");
            } else {
                i = timersKeyCount;
                str4 = str;
                str3 = str2;
            }
            i5++;
            timersKeyCount = i;
            str = str4;
            str2 = str3;
        }
        if (sb7.length() > 0) {
            Log.m105924i("HealthStatsHelper", healthStats.getDataType() + " " + str5 + " timerList: " + sb7);
        }
    }

    /* renamed from: b */
    public static void m166119b(AtomicReference atomicReference, C116947b.C116948a aVar, Context context, CpuStatFeature cpuStatFeature) {
        int i;
        C117173p pVar = cpuStatFeature.f343048k;
        if (pVar != null && pVar.mo181094l()) {
            StringBuilder sb = new StringBuilder("estimatePower ");
            sb.append((String) atomicReference.get());
            sb.append(": ");
            sb.append("cpuPower=");
            sb.append(C116951c.m165015p(((Double) aVar.f350471g.f343211a).doubleValue(), 2));
            sb.append(",wakelocksPower=");
            sb.append(C116951c.m165015p(((Double) aVar.f350473h.f343211a).doubleValue(), 2));
            sb.append(",mobilePower=");
            sb.append(C116951c.m165015p(((Double) aVar.f350475i.f343211a).doubleValue(), 2));
            sb.append(",wifiPower=");
            sb.append(C116951c.m165015p(((Double) aVar.f350477j.f343211a).doubleValue(), 2));
            sb.append(",blueToothPower=");
            sb.append(C116951c.m165015p(((Double) aVar.f350479k.f343211a).doubleValue(), 2));
            sb.append(",gpsPower=");
            sb.append(C116951c.m165015p(((Double) aVar.f350481l.f343211a).doubleValue(), 2));
            sb.append(",sensorsPower=");
            sb.append(C116951c.m165015p(((Double) aVar.f350483m.f343211a).doubleValue(), 2));
            sb.append(",cameraPower=");
            sb.append(C116951c.m165015p(((Double) aVar.f350485n.f343211a).doubleValue(), 2));
            sb.append(",flashLightPower=");
            sb.append(C116951c.m165015p(((Double) aVar.f350487o.f343211a).doubleValue(), 2));
            sb.append(",audioPower=");
            sb.append(C116951c.m165015p(((Double) aVar.f350489p.f343211a).doubleValue(), 2));
            sb.append(",videoPower=");
            sb.append(C116951c.m165015p(((Double) aVar.f350491q.f343211a).doubleValue(), 2));
            sb.append(",screenPower=");
            sb.append(C116951c.m165015p(((Double) aVar.f350493r.f343211a).doubleValue(), 2));
            sb.append(",systemServicePower=");
            sb.append(C116951c.m165015p(((Double) aVar.f350495s.f343211a).doubleValue(), 2));
            sb.append(",idlePower=");
            sb.append(C116951c.m165015p(((Double) aVar.f350497t.f343211a).doubleValue(), 2));
            sb.append(",totalPower=");
            sb.append(C116951c.m165015p(aVar.mo180934d(), 2));
            sb.append(",capacity=");
            C117159b.C117160a aVar2 = (C117159b.C117160a) C117159b.f351002a;
            C117159b.C117161b.C117162a<Integer> aVar3 = aVar2.f351009g;
            if (aVar3 == null || aVar3.mo181083a()) {
                Integer valueOf = Integer.valueOf(C117159b.m165203d(context));
                aVar2.f351009g = new C117159b.C117161b.C117162a<>(valueOf, 60000);
                i = valueOf.intValue();
            } else {
                i = ((Integer) aVar2.f351009g.f351011a).intValue();
            }
            sb.append(C116951c.m165015p((double) i, 2));
            String str = "";
            sb.append(str);
            Log.m105924i("HealthStatsHelper", sb.toString());
            Log.m105924i("HealthStatsHelper", "estimateMeta " + ((String) atomicReference.get()) + ": " + "cpuPowerMams=" + aVar.f350499u.f343211a + ",cpuUsrTimeMs=" + aVar.f350501v.f343211a + ",cpuSysTimeMs=" + aVar.f350503w.f343211a + ",realTimeMs=" + aVar.f350505x.f343211a + ",upTimeMs=" + aVar.f350507y.f343211a + ",offRealTimeMs=" + aVar.f350509z.f343211a + ",offUpTimeMs=" + aVar.f350436A.f343211a + ",mobilePowerMams=" + aVar.f350437B.f343211a + ",mobileRadioActiveMs=" + aVar.f350438C.f343211a + ",mobileIdleMs=" + aVar.f350439D.f343211a + ",mobileRxMs=" + aVar.f350440E.f343211a + ",mobileTxMs=" + aVar.f350441F.f343211a + ",mobileRxBytes=" + aVar.f350442G.f343211a + ",mobileTxBytes=" + aVar.f350443H.f343211a + ",mobileRxPackets=" + aVar.f350444I.f343211a + ",mobileTxPackets=" + aVar.f350445J.f343211a + ",wifiPowerMams=" + aVar.f350446K.f343211a + ",wifiIdleMs=" + aVar.f350447L.f343211a + ",wifiRxMs=" + aVar.f350448M.f343211a + ",wifiTxMs=" + aVar.f350449N.f343211a + ",wifiRunningMs=" + aVar.f350450O.f343211a + ",wifiLockMs=" + aVar.f350451P.f343211a + ",wifiScanMs=" + aVar.f350452Q.f343211a + ",wifiMulticastMs=" + aVar.f350453R.f343211a + ",wifiRxBytes=" + aVar.f350454S.f343211a + ",wifiTxBytes=" + aVar.f350455T.f343211a + ",wifiRxPackets=" + aVar.f350456U.f343211a + ",wifiTxPackets=" + aVar.f350457V.f343211a + ",blueToothPowerMams=" + aVar.f350458W.f343211a + ",blueToothIdleMs=" + aVar.f350459X.f343211a + ",blueToothRxMs=" + aVar.f350460Y.f343211a + ",blueToothTxMs=" + aVar.f350461Z.f343211a + ",wakelocksPartialMs=" + aVar.f350462a0.f343211a + ",wakelocksFullMs=" + aVar.f350463b0.f343211a + ",wakelocksWindowMs=" + aVar.f350464c0.f343211a + ",wakelocksDrawMs=" + aVar.f350466d0.f343211a + ",wakelocksPidSum=" + aVar.f350468e0.f343211a + ",gpsMs=" + aVar.f350470f0.f343211a + ",sensorsPowerMams=" + aVar.f350472g0.f343211a + ",cameraMs=" + aVar.f350474h0.f343211a + ",flashLightMs=" + aVar.f350476i0.f343211a + ",audioMs=" + aVar.f350478j0.f343211a + ",videoMs=" + aVar.f350480k0.f343211a + ",jobsMs=" + aVar.f350482l0.f343211a + ",syncMs=" + aVar.f350484m0.f343211a + ",fgActMs=" + aVar.f350486n0.f343211a + ",procTopAppMs=" + aVar.f350488o0.f343211a + ",procTopSleepMs=" + aVar.f350490p0.f343211a + ",procFgMs=" + aVar.f350492q0.f343211a + ",procFgSrvMs=" + aVar.f350494r0.f343211a + ",procBgMs=" + aVar.f350496s0.f343211a + ",procCacheMs=" + aVar.f350498t0.f343211a + str);
            HealthStats healthStats = aVar.f350467e;
            if (healthStats != null) {
                String str2 = (!healthStats.hasMeasurement(10064) || healthStats.getMeasurement(10064) <= 0) ? str : "cpuMams";
                if (healthStats.hasMeasurement(10027) && healthStats.getMeasurement(10027) > 0) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str2);
                    sb4.append(str2.length() == 0 ? str : ";");
                    sb4.append("mobileMams");
                    str2 = sb4.toString();
                }
                if (healthStats.hasMeasurement(10019) && healthStats.getMeasurement(10019) > 0) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(str2);
                    sb5.append(str2.length() == 0 ? str : ";");
                    sb5.append("wifiMams");
                    str2 = sb5.toString();
                }
                if (healthStats.hasMeasurement(10023) && healthStats.getMeasurement(10023) > 0) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(str2);
                    if (str2.length() != 0) {
                        str = ";";
                    }
                    sb6.append(str);
                    sb6.append("bleMams");
                    str2 = sb6.toString();
                }
                if (!TextUtils.isEmpty(str2) || b$$f.m166058c()) {
                    C87968a.C87969a.C87970a.m109467a("etmPower", (Throwable) null, m166121d(pVar, aVar, (C114467i) null, (C86165a<Map<String, Object>>) null), String.valueOf(aVar.mo180934d()), str2);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a7 A[EDGE_INSN: B:54:0x00a7->B:27:0x00a7 ?: BREAK  , SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map<java.lang.String, java.lang.Object> m166120c(java.lang.String r12, p212oe.C117781x r13) {
        /*
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            r12.<init>()
            java.lang.String r0 = "cpu.suspend"
            double r1 = r13.mo182538c(r0)
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r12.put(r0, r1)
            java.lang.String r0 = "cpu.idle"
            double r1 = r13.mo182538c(r0)
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r12.put(r0, r1)
            java.lang.String r0 = "cpu.active"
            double r1 = r13.mo182538c(r0)
            r3 = 5
            double r1 = p1195ge.C116951c.m165015p(r1, r3)
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r12.put(r0, r1)
            oe.x$b[] r0 = r13.f352298a
            int r0 = r0.length
            r1 = 0
            r4 = 0
            r6 = r4
            r2 = 0
        L_0x0039:
            if (r2 >= r0) goto L_0x0050
            if (r2 < 0) goto L_0x004b
            oe.x$b[] r8 = r13.f352298a
            int r9 = r8.length
            if (r2 >= r9) goto L_0x004b
            r8 = r8[r2]
            java.lang.String r8 = r8.f352300b
            double r8 = r13.mo182536a(r8)
            goto L_0x004c
        L_0x004b:
            r8 = r4
        L_0x004c:
            double r6 = r6 + r8
            int r2 = r2 + 1
            goto L_0x0039
        L_0x0050:
            double r8 = (double) r0
            double r6 = r6 / r8
            double r6 = p1195ge.C116951c.m165015p(r6, r3)
            java.lang.Double r0 = java.lang.Double.valueOf(r6)
            java.lang.String r2 = "cpu.clusters"
            r12.put(r2, r0)
            r6 = r4
            r0 = 0
            r2 = 0
        L_0x0062:
            oe.x$b[] r8 = r13.f352298a
            int r8 = r8.length
            r9 = 1
            if (r0 >= r8) goto L_0x00aa
            r8 = 0
        L_0x0069:
            if (r0 < 0) goto L_0x008d
            oe.x$b[] r10 = r13.f352298a
            int r11 = r10.length
            if (r0 < r11) goto L_0x0071
            goto L_0x008d
        L_0x0071:
            java.util.HashMap<java.lang.String, java.lang.Double[]> r11 = p212oe.C117781x.f352297c
            r10 = r10[r0]
            java.lang.String r10 = r10.f352299a
            boolean r10 = r11.containsKey(r10)
            if (r10 == 0) goto L_0x008b
            oe.x$b[] r10 = r13.f352298a
            r10 = r10[r0]
            java.lang.String r10 = r10.f352299a
            java.lang.Object r10 = r11.get(r10)
            java.lang.Double[] r10 = (java.lang.Double[]) r10
            int r10 = r10.length
            goto L_0x008e
        L_0x008b:
            r10 = 1
            goto L_0x008e
        L_0x008d:
            r10 = 0
        L_0x008e:
            if (r8 >= r10) goto L_0x00a7
            if (r0 < 0) goto L_0x00a0
            oe.x$b[] r10 = r13.f352298a
            int r11 = r10.length
            if (r0 >= r11) goto L_0x00a0
            r10 = r10[r0]
            java.lang.String r10 = r10.f352301c
            double r10 = r13.mo182537b(r10, r8)
            goto L_0x00a1
        L_0x00a0:
            r10 = r4
        L_0x00a1:
            double r6 = r6 + r10
            int r2 = r2 + 1
            int r8 = r8 + 1
            goto L_0x0069
        L_0x00a7:
            int r0 = r0 + 1
            goto L_0x0062
        L_0x00aa:
            double r10 = (double) r2
            double r6 = r6 / r10
            double r6 = p1195ge.C116951c.m165015p(r6, r3)
            java.lang.Double r0 = java.lang.Double.valueOf(r6)
            java.lang.String r2 = "cpu.cores"
            r12.put(r2, r0)
            java.lang.String r0 = "modem.controller.idle"
            double r6 = r13.mo182538c(r0)
            java.lang.Double r2 = java.lang.Double.valueOf(r6)
            r12.put(r0, r2)
            java.lang.String r0 = "modem.controller.rx"
            double r6 = r13.mo182538c(r0)
            java.lang.Double r2 = java.lang.Double.valueOf(r6)
            r12.put(r0, r2)
            java.lang.String r2 = "modem.controller.tx"
            double r6 = r13.mo182538c(r2)
            java.lang.Double r6 = java.lang.Double.valueOf(r6)
            r12.put(r2, r6)
            java.lang.String r6 = "radio.active"
            double r7 = r13.mo182538c(r6)
            int r10 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r10 > 0) goto L_0x0123
            double r7 = r13.mo182536a(r0)
            double r7 = r7 + r4
            java.util.HashMap<java.lang.String, java.lang.Double> r0 = p212oe.C117781x.f352296b
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x00f9
            r0 = 1
            goto L_0x010a
        L_0x00f9:
            java.util.HashMap<java.lang.String, java.lang.Double[]> r0 = p212oe.C117781x.f352297c
            boolean r4 = r0.containsKey(r2)
            if (r4 == 0) goto L_0x0109
            java.lang.Object r0 = r0.get(r2)
            java.lang.Double[] r0 = (java.lang.Double[]) r0
            int r0 = r0.length
            goto L_0x010a
        L_0x0109:
            r0 = 0
        L_0x010a:
            r4 = 0
        L_0x010b:
            if (r4 >= r0) goto L_0x0115
            double r10 = r13.mo182537b(r2, r4)
            double r7 = r7 + r10
            int r4 = r4 + 1
            goto L_0x010b
        L_0x0115:
            int r0 = r0 + r9
            double r4 = (double) r0
            double r7 = r7 / r4
            double r4 = p1195ge.C116951c.m165015p(r7, r3)
            java.lang.Double r0 = java.lang.Double.valueOf(r4)
            r12.put(r6, r0)
        L_0x0123:
            java.lang.String r0 = "wifi.controller.idle"
            double r4 = r13.mo182538c(r0)
            java.lang.Double r2 = java.lang.Double.valueOf(r4)
            r12.put(r0, r2)
            java.lang.String r0 = "wifi.controller.rx"
            double r4 = r13.mo182538c(r0)
            java.lang.Double r2 = java.lang.Double.valueOf(r4)
            r12.put(r0, r2)
            java.lang.String r0 = "wifi.controller.tx"
            double r4 = r13.mo182538c(r0)
            java.lang.Double r2 = java.lang.Double.valueOf(r4)
            r12.put(r0, r2)
            java.lang.String r0 = "wifi.active"
            double r4 = r13.mo182538c(r0)
            r6 = 4660134898793709568(0x40ac200000000000, double:3600.0)
            double r4 = r4 / r6
            r6 = 4633786751901499392(0x404e848000000000, double:61.03515625)
            double r4 = r4 / r6
            double r4 = p1195ge.C116951c.m165015p(r4, r3)
            java.lang.Double r0 = java.lang.Double.valueOf(r4)
            java.lang.String r2 = "powerPp"
            r12.put(r2, r0)
            java.lang.String r0 = "bluetooth.controller.idle"
            double r4 = r13.mo182538c(r0)
            java.lang.Double r2 = java.lang.Double.valueOf(r4)
            r12.put(r0, r2)
            java.lang.String r0 = "bluetooth.controller.rx"
            double r4 = r13.mo182538c(r0)
            java.lang.Double r2 = java.lang.Double.valueOf(r4)
            r12.put(r0, r2)
            java.lang.String r0 = "bluetooth.controller.tx"
            double r4 = r13.mo182538c(r0)
            java.lang.Double r2 = java.lang.Double.valueOf(r4)
            r12.put(r0, r2)
            java.lang.String r0 = "gps.voltage"
            double r4 = r13.mo182538c(r0)
            java.lang.Double r2 = java.lang.Double.valueOf(r4)
            r12.put(r0, r2)
            java.lang.String r0 = "gps.on"
            double r4 = r13.mo182538c(r0)
            java.lang.Double r2 = java.lang.Double.valueOf(r4)
            r12.put(r0, r2)
            java.lang.String r0 = "gps.signalqualitybased"
            double r4 = r13.mo182538c(r0)
            double r4 = p1195ge.C116951c.m165015p(r4, r3)
            java.lang.Double r2 = java.lang.Double.valueOf(r4)
            r12.put(r0, r2)
            java.lang.String r0 = "camera.avg"
            double r4 = r13.mo182538c(r0)
            java.lang.Double r2 = java.lang.Double.valueOf(r4)
            r12.put(r0, r2)
            java.lang.String r0 = "camera.flashlight"
            double r4 = r13.mo182538c(r0)
            java.lang.Double r2 = java.lang.Double.valueOf(r4)
            r12.put(r0, r2)
            java.lang.String r0 = "audio"
            double r4 = r13.mo182538c(r0)
            java.lang.Double r2 = java.lang.Double.valueOf(r4)
            r12.put(r0, r2)
            java.lang.String r0 = "video"
            double r4 = r13.mo182538c(r0)
            java.lang.Double r2 = java.lang.Double.valueOf(r4)
            r12.put(r0, r2)
            java.lang.String r0 = "screen.on"
            double r4 = r13.mo182538c(r0)
            java.lang.Double r13 = java.lang.Double.valueOf(r4)
            r12.put(r0, r13)
            oe.q$$u r13 = new oe.q$$u
            r13.<init>()
            java.util.Map r13 = p981ie.C117159b.m165221v(r12, r13)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.LinkedHashMap r13 = (java.util.LinkedHashMap) r13
            java.util.Set r13 = r13.entrySet()
            java.util.Iterator r13 = r13.iterator()
        L_0x0214:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x0236
            java.lang.Object r2 = r13.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r2 = r2.getValue()
            boolean r2 = r2 instanceof java.lang.Double
            if (r2 != 0) goto L_0x022f
            goto L_0x0214
        L_0x022f:
            r0.add(r4)
            int r1 = r1 + 1
            if (r1 < r3) goto L_0x0214
        L_0x0236:
            java.lang.String r13 = "power-ranks"
            r12.put(r13, r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p212oe.C117774q.m166120c(java.lang.String, oe.x):java.util.Map");
    }

    /* renamed from: d */
    public static Map<String, Object> m166121d(C117173p pVar, C116947b.C116948a aVar, C114467i iVar, C86165a<Map<String, Object>> aVar2) {
        q$$w q__w = new q$$w(aVar2);
        return (Map) q__w.apply(new q$$x(aVar, q__w, iVar));
    }

    /* renamed from: e */
    public static void m166122e(Context context) {
        C113173i iVar;
        C114490k0 e;
        synchronized (C117774q.class) {
            try {
                if (Build.VERSION.SDK_INT >= 24) {
                    if (MMApplicationContext.isMainProcess()) {
                        Log.m105924i("HealthStatsHelper", "dump");
                        f352217a = System.currentTimeMillis();
                        m166128k("root", C116951c.m165012m(context), new q$$a());
                        Class cls = C116947b.class;
                        if (!(!C91441c.m114729c() || (iVar = (C113173i) C91441c.m114730d().mo125377a(C113173i.class)) == null || (e = iVar.f338613h.mo165880e(cls)) == null)) {
                            m166127j(context, ((C116947b) e).mo180931i(), (C114467i) null);
                        }
                    }
                }
                Log.m105924i("HealthStatsHelper", "skip dump");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: f */
    public static void m166123f(Context context) {
        long currentTimeMillis = System.currentTimeMillis();
        int i = 30;
        try {
            if (((C32735h) C86312j.m106911c(C32735h.class)) != null) {
                i = Math.max(Util.safeParseInt(C117731d.m166007c().mo182444f("clicfg_battery_stats_dump", String.valueOf(30), false, true)), 1);
            }
        } catch (Exception unused) {
        }
        long j = (long) (i * CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL);
        if (currentTimeMillis - f352217a > j) {
            synchronized (C117774q.class) {
                if (currentTimeMillis - f352217a > j) {
                    m166122e(context);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
        r8 = r8 + 1;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m166124g(p981ie.C117173p r18) {
        /*
            r1 = r18
            java.lang.String r2 = ""
            java.lang.String r3 = "cpuStatsCompat"
            java.lang.String r4 = ";"
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r7 = 0
            r8 = 0
        L_0x0014:
            r9 = 100
            r12 = 2
            r13 = 1
            int r0 = r18.mo181090g()     // Catch:{ all -> 0x0062 }
            if (r8 >= r0) goto L_0x00cf
            int r0 = r1.mo181089f(r8)     // Catch:{ all -> 0x0062 }
            int r14 = r1.mo181092i(r0)     // Catch:{ all -> 0x0062 }
            boolean r0 = p212oe.b$$f.m166057b()     // Catch:{ all -> 0x0062 }
            if (r0 == 0) goto L_0x002e
            r15 = 5
            goto L_0x002f
        L_0x002e:
            r15 = 1
        L_0x002f:
            r16 = 0
        L_0x0031:
            ie.k r0 = new ie.k     // Catch:{ IOException -> 0x003c }
            r0.<init>(r8, r14)     // Catch:{ IOException -> 0x003c }
            r0.mo158998b()     // Catch:{ IOException -> 0x003c }
            int r8 = r8 + 1
            goto L_0x0014
        L_0x003c:
            r0 = move-exception
            int r11 = r16 + 1
            java.lang.Thread.sleep(r9)     // Catch:{ all -> 0x0062 }
            if (r11 >= r15) goto L_0x0047
            r16 = r11
            goto L_0x0031
        L_0x0047:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x0062 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0062 }
            r11.<init>()     // Catch:{ all -> 0x0062 }
            java.lang.String r14 = "KernelCpuSpeedReader err: "
            r11.append(r14)     // Catch:{ all -> 0x0062 }
            java.lang.String r14 = r0.getMessage()     // Catch:{ all -> 0x0062 }
            r11.append(r14)     // Catch:{ all -> 0x0062 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0062 }
            r8.<init>(r11, r0)     // Catch:{ all -> 0x0062 }
            throw r8     // Catch:{ all -> 0x0062 }
        L_0x0062:
            r0 = move-exception
            r6.add(r0)
            java.lang.String r8 = r0.getMessage()
            java.io.File r11 = new java.io.File
            java.lang.String r14 = "/sys/devices/system/cpu/cpu0/cpufreq/stats/time_in_state"
            r11.<init>(r14)
            boolean r14 = r11.exists()
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            java.lang.String r15 = "cpu_time_in_state_exist"
            r5.put(r15, r14)
            boolean r14 = r11.canRead()
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            java.lang.String r15 = "cpu_time_in_state_read"
            r5.put(r15, r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.io.File r11 = r11.getParentFile()     // Catch:{ Exception -> 0x00b7 }
            java.io.File[] r11 = r11.listFiles()     // Catch:{ Exception -> 0x00b7 }
            if (r11 == 0) goto L_0x00b7
            int r15 = r11.length     // Catch:{ Exception -> 0x00b7 }
            r9 = 0
        L_0x009c:
            if (r9 >= r15) goto L_0x00b7
            r10 = r11[r9]     // Catch:{ Exception -> 0x00b7 }
            int r16 = r14.length()     // Catch:{ Exception -> 0x00b7 }
            if (r16 != 0) goto L_0x00a8
            r13 = r2
            goto L_0x00a9
        L_0x00a8:
            r13 = r4
        L_0x00a9:
            r14.append(r13)     // Catch:{ Exception -> 0x00b7 }
            java.lang.String r10 = r10.getName()     // Catch:{ Exception -> 0x00b7 }
            r14.append(r10)     // Catch:{ Exception -> 0x00b7 }
            int r9 = r9 + 1
            r13 = 1
            goto L_0x009c
        L_0x00b7:
            java.lang.String r9 = r14.toString()
            java.lang.String r10 = "cpu_time_in_state_ls"
            r5.put(r10, r9)
            java.lang.String[] r9 = new java.lang.String[r12]
            java.lang.String r10 = "err-KernelCpuSpeedReader"
            r9[r7] = r10
            r10 = 1
            r9[r10] = r8
            p988jj.C87968a.C87969a.C87970a.m109467a(r3, r0, r5, r9)
            r5.clear()
        L_0x00cf:
            r8 = 3
            ie.p$b[] r0 = r1.f351033a     // Catch:{ all -> 0x011f }
            int r0 = r0.length     // Catch:{ all -> 0x011f }
            int[] r9 = new int[r0]     // Catch:{ all -> 0x011f }
            r10 = 0
        L_0x00d6:
            if (r10 >= r0) goto L_0x00e1
            int r11 = r1.mo181092i(r10)     // Catch:{ all -> 0x011f }
            r9[r10] = r11     // Catch:{ all -> 0x011f }
            int r10 = r10 + 1
            goto L_0x00d6
        L_0x00e1:
            boolean r0 = p212oe.b$$f.m166057b()     // Catch:{ all -> 0x011f }
            if (r0 == 0) goto L_0x00e9
            r11 = 5
            goto L_0x00ea
        L_0x00e9:
            r11 = 1
        L_0x00ea:
            r1 = 0
        L_0x00eb:
            ie.l r0 = new ie.l     // Catch:{ IOException -> 0x00f9 }
            int r10 = android.os.Process.myPid()     // Catch:{ IOException -> 0x00f9 }
            r0.<init>(r10, r9)     // Catch:{ IOException -> 0x00f9 }
            r0.mo159000b()     // Catch:{ IOException -> 0x00f9 }
            goto L_0x0220
        L_0x00f9:
            r0 = move-exception
            r10 = 1
            int r1 = r1 + r10
            r13 = 100
            java.lang.Thread.sleep(r13)     // Catch:{ all -> 0x011f }
            if (r1 >= r11) goto L_0x0104
            goto L_0x00eb
        L_0x0104:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x011f }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x011f }
            r9.<init>()     // Catch:{ all -> 0x011f }
            java.lang.String r10 = "KernelCpuUidFreqTimeReader err: "
            r9.append(r10)     // Catch:{ all -> 0x011f }
            java.lang.String r10 = r0.getMessage()     // Catch:{ all -> 0x011f }
            r9.append(r10)     // Catch:{ all -> 0x011f }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x011f }
            r1.<init>(r9, r0)     // Catch:{ all -> 0x011f }
            throw r1     // Catch:{ all -> 0x011f }
        L_0x011f:
            r0 = move-exception
            r1 = r0
            r6.add(r1)
            java.lang.String r0 = r1.getMessage()
            java.lang.String r9 = java.lang.String.valueOf(r0)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "time_in_state"
            boolean r0 = r9.contains(r0)
            java.lang.String r11 = "/time_in_state"
            java.lang.String r13 = "/proc/"
            if (r0 == 0) goto L_0x01a8
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r13)
            int r13 = android.os.Process.myPid()
            r14.append(r13)
            r14.append(r11)
            java.lang.String r11 = r14.toString()
            r0.<init>(r11)
            boolean r11 = r0.exists()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            java.lang.String r13 = "prc_time_in_state_exist"
            r5.put(r13, r11)
            boolean r11 = r0.canRead()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            java.lang.String r13 = "prc_time_in_state_read"
            r5.put(r13, r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.io.File r0 = r0.getParentFile()     // Catch:{ Exception -> 0x019e }
            java.io.File[] r0 = r0.listFiles()     // Catch:{ Exception -> 0x019e }
            if (r0 == 0) goto L_0x019e
            int r13 = r0.length     // Catch:{ Exception -> 0x019e }
            r14 = 0
        L_0x0183:
            if (r14 >= r13) goto L_0x019e
            r15 = r0[r14]     // Catch:{ Exception -> 0x019e }
            int r17 = r11.length()     // Catch:{ Exception -> 0x019e }
            if (r17 != 0) goto L_0x018f
            r12 = r2
            goto L_0x0190
        L_0x018f:
            r12 = r4
        L_0x0190:
            r11.append(r12)     // Catch:{ Exception -> 0x019e }
            java.lang.String r12 = r15.getName()     // Catch:{ Exception -> 0x019e }
            r11.append(r12)     // Catch:{ Exception -> 0x019e }
            int r14 = r14 + 1
            r12 = 2
            goto L_0x0183
        L_0x019e:
            java.lang.String r0 = r11.toString()
            java.lang.String r11 = "prc_time_in_state_ls"
            r5.put(r11, r0)
            goto L_0x020a
        L_0x01a8:
            java.io.FileInputStream r12 = new java.io.FileInputStream     // Catch:{ Exception -> 0x020a }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x020a }
            r0.<init>()     // Catch:{ Exception -> 0x020a }
            r0.append(r13)     // Catch:{ Exception -> 0x020a }
            int r13 = android.os.Process.myPid()     // Catch:{ Exception -> 0x020a }
            r0.append(r13)     // Catch:{ Exception -> 0x020a }
            r0.append(r11)     // Catch:{ Exception -> 0x020a }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x020a }
            r12.<init>(r0)     // Catch:{ Exception -> 0x020a }
            java.io.StringWriter r0 = new java.io.StringWriter     // Catch:{ all -> 0x01fe }
            r0.<init>()     // Catch:{ all -> 0x01fe }
            java.io.InputStreamReader r11 = new java.io.InputStreamReader     // Catch:{ all -> 0x01fe }
            r11.<init>(r12)     // Catch:{ all -> 0x01fe }
            r13 = 4096(0x1000, float:5.74E-42)
            char[] r13 = new char[r13]     // Catch:{ all -> 0x01fe }
        L_0x01d1:
            int r14 = r11.read(r13)     // Catch:{ all -> 0x01fe }
            r15 = -1
            if (r15 == r14) goto L_0x01dc
            r0.write(r13, r7, r14)     // Catch:{ all -> 0x01fe }
            goto L_0x01d1
        L_0x01dc:
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01fe }
            java.lang.String r11 = "prc_time_in_state_cat"
            r5.put(r11, r0)     // Catch:{ all -> 0x01fe }
            java.lang.String r11 = "\n"
            java.lang.String[] r0 = r0.split(r11)     // Catch:{ all -> 0x01fe }
            int r11 = r0.length     // Catch:{ all -> 0x01fe }
            r13 = 0
        L_0x01ed:
            if (r13 >= r11) goto L_0x01fa
            r14 = r0[r13]     // Catch:{ all -> 0x01fe }
            r10.append(r14)     // Catch:{ all -> 0x01fe }
            r10.append(r4)     // Catch:{ all -> 0x01fe }
            int r13 = r13 + 1
            goto L_0x01ed
        L_0x01fa:
            r12.close()     // Catch:{ Exception -> 0x020a }
            goto L_0x020a
        L_0x01fe:
            r0 = move-exception
            r11 = r0
            r12.close()     // Catch:{ all -> 0x0204 }
            goto L_0x0209
        L_0x0204:
            r0 = move-exception
            r12 = r0
            r11.addSuppressed(r12)     // Catch:{ Exception -> 0x020a }
        L_0x0209:
            throw r11     // Catch:{ Exception -> 0x020a }
        L_0x020a:
            java.lang.String[] r0 = new java.lang.String[r8]
            java.lang.String r11 = "err-KernelCpuUidFreqTimeReader"
            r0[r7] = r11
            r11 = 1
            r0[r11] = r9
            java.lang.String r9 = r10.toString()
            r10 = 2
            r0[r10] = r9
            p988jj.C87968a.C87969a.C87970a.m109467a(r3, r1, r5, r0)
            r5.clear()
        L_0x0220:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r1 = r6.iterator()
        L_0x0229:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L_0x0249
            java.lang.Object r9 = r1.next()
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            int r10 = r0.length()
            if (r10 != 0) goto L_0x023d
            r10 = r2
            goto L_0x023e
        L_0x023d:
            r10 = r4
        L_0x023e:
            r0.append(r10)
            java.lang.String r9 = r9.getMessage()
            r0.append(r9)
            goto L_0x0229
        L_0x0249:
            r1 = 0
            java.lang.String[] r2 = new java.lang.String[r8]
            boolean r4 = r6.isEmpty()
            if (r4 == 0) goto L_0x0255
            java.lang.String r4 = "scc"
            goto L_0x0257
        L_0x0255:
            java.lang.String r4 = "err"
        L_0x0257:
            r2[r7] = r4
            int r4 = r6.size()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r6 = 1
            r2[r6] = r4
            java.lang.String r0 = r0.toString()
            r4 = 2
            r2[r4] = r0
            p988jj.C87968a.C87969a.C87970a.m109467a(r3, r1, r5, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p212oe.C117774q.m166124g(ie.p):void");
    }

    /* renamed from: h */
    public static void m166125h(Context context) {
        if (b$$f.m166057b() || b$$f.m166058c()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                C117173p j = C117173p.m165234j(context);
                for (Map.Entry next : C117173p.f351029c.entrySet()) {
                    linkedHashMap.put("powerItem-" + ((String) next.getKey()), next.getValue());
                }
                for (Map.Entry next2 : C117173p.f351030d.entrySet()) {
                    Double[] dArr = (Double[]) next2.getValue();
                    int i = 0;
                    while (i < dArr.length) {
                        Double d = dArr[i];
                        StringBuilder sb = new StringBuilder();
                        sb.append("powerArray-");
                        sb.append((String) next2.getKey());
                        sb.append("-");
                        i++;
                        sb.append(i);
                        linkedHashMap.put(sb.toString(), d);
                    }
                }
                int k = C117159b.m165210k();
                int g = j.mo181090g();
                int length = j.f351033a.length;
                StringBuilder sb4 = new StringBuilder();
                for (int i2 = 0; i2 < j.f351033a.length; i2++) {
                    int i3 = j.mo181092i(i2);
                    sb4.append(sb4.length() == 0 ? "" : ";");
                    sb4.append(i3);
                }
                linkedHashMap.put("resType", C117173p.f351032f);
                C87968a.C87969a.C87970a.m109467a("powerProfCompat", (Throwable) null, linkedHashMap, String.valueOf(k), String.valueOf(g), String.valueOf(length), sb4.toString());
                m166124g(j);
            } catch (Throwable th) {
                C87968a.C87969a.C87970a.m109467a("powerProfCompat", th, linkedHashMap, "err", th.getMessage());
            }
            ((C119157j) C119157j.f356862d).mo183878i(new q$$r(context), 10000);
        }
    }

    /* renamed from: i */
    public static void m166126i(Context context) {
        List<Sensor> sensorList = ((SensorManager) context.getSystemService("sensor")).getSensorList(-1);
        if (C117750b.m166050h() || C117750b.m166049g()) {
            StringBuilder sb = new StringBuilder();
            for (Sensor next : sensorList) {
                String name = next.getName();
                int id = next.getId();
                int type = next.getType();
                float power = next.getPower();
                int i = 0;
                try {
                    i = ((Integer) next.getClass().getDeclaredMethod("getHandle", new Class[0]).invoke(next, new Object[0])).intValue();
                } catch (Throwable th) {
                    Log.m105928w("HealthStatsHelper", "getSensorHandle err: " + th.getMessage());
                }
                sb.append(sb.length() == 0 ? "" : ",");
                sb.append(name);
                sb.append(XVFSFile.PATH_SEPARATOR);
                sb.append(id);
                sb.append(XVFSFile.PATH_SEPARATOR);
                sb.append(type);
                sb.append(XVFSFile.PATH_SEPARATOR);
                sb.append(i);
                sb.append(XVFSFile.PATH_SEPARATOR);
                sb.append(power);
            }
            Log.m105924i("HealthStatsHelper", "Sensors = " + sb);
        }
    }

    /* renamed from: j */
    public static void m166127j(Context context, C116947b.C116948a aVar, C114467i iVar) {
        try {
            AtomicReference atomicReference = new AtomicReference("");
            if (iVar == null && !aVar.f343203b) {
                atomicReference.set("curr");
            } else if (iVar != null && aVar.f343203b) {
                iVar.mo173664h(new q$$l(atomicReference, iVar));
            }
            if (TextUtils.isEmpty((CharSequence) atomicReference.get())) {
                Log.m105928w("HealthStatsHelper", "skip invalid scope");
            } else {
                C79691a.m96805b(CpuStatFeature.class, new q$$v(atomicReference, aVar, context));
            }
        } catch (Throwable th) {
            Log.m105928w("HealthStatsHelper", "load powerProfile err: " + th.getMessage());
        }
    }

    /* renamed from: k */
    public static void m166128k(String str, HealthStats healthStats, C86165a<C58104c<String, HealthStats>> aVar) {
        if (healthStats != null) {
            aVar.accept(new C58104c(str, healthStats));
            int statsKeyCount = healthStats.getStatsKeyCount();
            for (int i = 0; i < statsKeyCount; i++) {
                int statsKeyAt = healthStats.getStatsKeyAt(i);
                if (healthStats.hasStats(statsKeyAt)) {
                    for (Map.Entry next : healthStats.getStats(statsKeyAt).entrySet()) {
                        m166128k(str + "-" + ((String) next.getKey()), (HealthStats) next.getValue(), aVar);
                    }
                }
            }
        }
    }
}
