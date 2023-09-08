package pl0;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: pl0.v */
public class C118117v {

    /* renamed from: a */
    public static Map<String, HashMap<String, C118080q>> f353117a = new HashMap();

    /* renamed from: b */
    public static Set<C118080q> f353118b = new CopyOnWriteArraySet();

    /* renamed from: c */
    public static Set<C118080q> f353119c = new HashSet();

    /* renamed from: d */
    public static SensorManager f353120d;

    /* renamed from: e */
    public static C118119b f353121e;

    /* renamed from: f */
    public static Runnable f353122f = new C118118a();

    /* renamed from: pl0.v$a */
    public class C118118a implements Runnable {
        public void run() {
            HashSet hashSet = new HashSet(C118117v.f353118b);
            ((CopyOnWriteArraySet) C118117v.f353118b).clear();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((C118080q) it.next()).onDestroy();
            }
        }
    }

    /* renamed from: pl0.v$b */
    public static class C118119b implements SensorEventListener {

        /* renamed from: d */
        public float f353123d = 0.0f;

        /* renamed from: e */
        public long f353124e = 200;

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        /* JADX WARNING: CFG modification limit reached, blocks count: 131 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSensorChanged(android.hardware.SensorEvent r6) {
            /*
                r5 = this;
                android.hardware.Sensor r0 = r6.sensor
                int r0 = r0.getType()
                r1 = 3
                if (r0 != r1) goto L_0x0082
                long r0 = java.lang.System.currentTimeMillis()
                long r2 = r5.f353124e
                long r0 = r0 - r2
                float[] r6 = r6.values
                r2 = 0
                r6 = r6[r2]
                r2 = 1135869952(0x43b40000, float:360.0)
                r3 = 0
                int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                if (r3 <= 0) goto L_0x001d
                goto L_0x0028
            L_0x001d:
                int r3 = (int) r6
                int r3 = r3 * -1
                int r3 = r3 / 360
                int r3 = r3 + 1
                int r3 = r3 * 360
                float r3 = (float) r3
                float r6 = r6 + r3
            L_0x0028:
                float r6 = r6 % r2
                r2 = 200(0xc8, double:9.9E-322)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto L_0x0082
                float r0 = r5.f353123d
                float r0 = r6 - r0
                float r0 = java.lang.Math.abs(r0)
                r1 = 1077936128(0x40400000, float:3.0)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 <= 0) goto L_0x0082
                java.util.Map<java.lang.String, java.util.HashMap<java.lang.String, pl0.q>> r0 = pl0.C118117v.f353117a
                monitor-enter(r0)
                java.util.Map<java.lang.String, java.util.HashMap<java.lang.String, pl0.q>> r1 = pl0.C118117v.f353117a     // Catch:{ all -> 0x0080 }
                java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ all -> 0x0080 }
                java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x0080 }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0080 }
            L_0x004c:
                boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0080 }
                if (r2 == 0) goto L_0x0074
                java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0080 }
                java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ all -> 0x0080 }
                java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x0080 }
                java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0080 }
            L_0x0060:
                boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0080 }
                if (r3 == 0) goto L_0x004c
                java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0080 }
                pl0.q r3 = (pl0.C118080q) r3     // Catch:{ all -> 0x0080 }
                if (r3 == 0) goto L_0x0060
                float r4 = r5.f353123d     // Catch:{ all -> 0x0080 }
                r3.mo182828Y(r4, r6)     // Catch:{ all -> 0x0080 }
                goto L_0x0060
            L_0x0074:
                monitor-exit(r0)     // Catch:{ all -> 0x0080 }
                r5.f353123d = r6
                long r0 = java.lang.System.currentTimeMillis()
                r5.f353124e = r0
                goto L_0x0082
            L_0x007e:
                monitor-exit(r0)     // Catch:{ all -> 0x0080 }
                throw r6
            L_0x0080:
                r6 = move-exception
                goto L_0x007e
            L_0x0082:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: pl0.C118117v.C118119b.onSensorChanged(android.hardware.SensorEvent):void");
        }
    }

    /* renamed from: a */
    public static synchronized boolean m166642a(String str, String str2) {
        synchronized (C118117v.class) {
            HashMap hashMap = (HashMap) ((HashMap) f353117a).get(str);
            if (hashMap == null) {
                return false;
            }
            C118080q qVar = (C118080q) hashMap.get(str2);
            if (qVar == null) {
                Log.m105920e("MicroMsg.AppBrandMapManager", "[destroyMapView] mapview not exist, err");
                return false;
            }
            Log.m105925i("MicroMsg.AppBrandMapManager", "destoryMapView map:%s", qVar);
            hashMap.remove(str2);
            m166648g(qVar);
            if (hashMap.size() <= 0) {
                ((HashMap) f353117a).remove(str);
            }
            ((CopyOnWriteArraySet) f353118b).add(qVar);
            MMHandlerThread.removeRunnable(f353122f);
            MMHandlerThread.postToMainThreadDelayed(f353122f, 100);
            Log.m105925i("MicroMsg.AppBrandMapManager", "[destroyMapView]appid:%s, map count:%d", str, Integer.valueOf(hashMap.size()));
            return true;
        }
    }

    /* renamed from: b */
    public static synchronized C118080q m166643b(String str, String str2) {
        synchronized (C118117v.class) {
            if ("invalid_map_id".equals(str2)) {
                Log.m105920e("MicroMsg.AppBrandMapManager", "[getMapView]INVALID_MAP_ID");
                return null;
            }
            HashMap hashMap = (HashMap) ((HashMap) f353117a).get(str);
            if (hashMap == null) {
                return null;
            }
            C118080q qVar = (C118080q) hashMap.get(str2);
            return qVar;
        }
    }

    /* renamed from: c */
    public static synchronized void m166644c() {
        synchronized (C118117v.class) {
            Log.m105924i("MicroMsg.AppBrandMapManager", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
            if (f353121e == null) {
                f353121e = new C118119b();
                SensorManager sensorManager = (SensorManager) MMApplicationContext.getContext().getSystemService("sensor");
                f353120d = sensorManager;
                f353120d.registerListener(f353121e, sensorManager.getDefaultSensor(3), 1);
            }
        }
    }

    /* renamed from: d */
    public static synchronized boolean m166645d(String str, String str2, C118080q qVar) {
        synchronized (C118117v.class) {
            if ("invalid_map_id".equals(str2)) {
                Log.m105920e("MicroMsg.AppBrandMapManager", "[createMapView]INVALID_MAP_ID");
                return false;
            }
            HashMap hashMap = (HashMap) ((HashMap) f353117a).get(str);
            if (hashMap == null) {
                hashMap = new HashMap();
                ((HashMap) f353117a).put(str, hashMap);
            }
            if (hashMap.containsKey(str2)) {
                Log.m105928w("MicroMsg.AppBrandMapManager", "map is exist, return");
                return false;
            }
            hashMap.put(str2, qVar);
            Log.m105925i("MicroMsg.AppBrandMapManager", "initMapView appId:%s, mapId:%s", str, str2);
            return true;
        }
    }

    /* renamed from: e */
    public static synchronized void m166646e(C118080q qVar) {
        synchronized (C118117v.class) {
            Log.m105925i("MicroMsg.AppBrandMapManager", "registerListener map:%s", qVar);
            ((HashSet) f353119c).add(qVar);
            if (((HashSet) f353119c).size() == 1) {
                m166644c();
            }
        }
    }

    /* renamed from: f */
    public static synchronized void m166647f() {
        synchronized (C118117v.class) {
            Log.m105924i("MicroMsg.AppBrandMapManager", "uninit");
            if (!(f353121e == null || f353120d == null)) {
                Log.m105924i("MicroMsg.AppBrandMapManager", "sensorListener uninit");
                f353120d.unregisterListener(f353121e);
                f353120d = null;
                f353121e = null;
            }
        }
    }

    /* renamed from: g */
    public static synchronized void m166648g(C118080q qVar) {
        synchronized (C118117v.class) {
            Log.m105925i("MicroMsg.AppBrandMapManager", "unregisterListener map:%s", qVar);
            ((HashSet) f353119c).remove(qVar);
            if (((HashSet) f353119c).size() == 0) {
                m166647f();
            }
        }
    }
}
