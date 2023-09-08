package com.tencent.map.geolocation.sapp;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import com.tencent.xweb.WCWebUpdater;
import dalvik.system.DexClassLoader;
import p429c.p790t.p791m.sapp.p792c.C113223e;
import p429c.p790t.p791m.sapp.p792c.C113225f;
import p429c.p790t.p791m.sapp.p792c.C113229j;
import p429c.p790t.p791m.sapp.p792c.C113233r;

public final class TencentLocationManager {
    public static final int COORDINATE_TYPE_GCJ02 = 1;
    public static final int COORDINATE_TYPE_WGS84 = 0;
    public static final boolean DEBUG = false;
    public static final String TAG = "TencentLocationManager";
    public static final String TYPE_OAID = "oaId";
    public static final String TYPE_QIMEI = "qImei";
    public static Context mContext;
    public static Pair<String, String> mPair;
    public static Class mProxyClass;
    public static Object mProxyObj;
    public static TencentLocationManager sInstance;
    public int mInitStatus = 0;
    public final byte[] mLock = new byte[0];

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        r1 = mPair;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TencentLocationManager(android.content.Context r4, android.util.Pair<java.lang.String, java.lang.String> r5) {
        /*
            r3 = this;
            r3.<init>()
            r0 = 0
            byte[] r1 = new byte[r0]
            r3.mLock = r1
            r3.mInitStatus = r0
            boolean r1 = com.tencent.map.geolocation.sapp.TencentLocationManagerOptions.isLoadLibraryEnabled()
            r2 = 3
            if (r1 == 0) goto L_0x0025
            java.lang.String r1 = "tencentlocsapp"
            java.lang.System.loadLibrary(r1)     // Catch:{ all -> 0x001c }
            java.lang.String r1 = "jnirtk"
            java.lang.System.loadLibrary(r1)     // Catch:{ all -> 0x001c }
            goto L_0x0025
        L_0x001c:
            r4 = move-exception
            java.lang.String r5 = "libtencentloc"
            p429c.p790t.p791m.sapp.p792c.C113229j.m154972a(r5, r4)
            r3.mInitStatus = r2
            return
        L_0x0025:
            mContext = r4
            p429c.p790t.p791m.sapp.p792c.C113233r.m154998a((android.content.Context) r4, (android.util.Pair<java.lang.String, java.lang.String>) r5)
            c.t.m.sapp.c.e r1 = p429c.p790t.p791m.sapp.p792c.C113223e.m154939a((android.content.Context) r4)
            r1.mo165761c()
        L_0x0031:
            if (r0 >= r2) goto L_0x0048
            if (r5 != 0) goto L_0x003e
            android.util.Pair<java.lang.String, java.lang.String> r1 = mPair
            if (r1 == 0) goto L_0x003e
            boolean r1 = r3.m155365a(r4, r1, r0)
            goto L_0x0042
        L_0x003e:
            boolean r1 = r3.m155365a(r4, r5, r0)
        L_0x0042:
            if (r1 == 0) goto L_0x0045
            goto L_0x0048
        L_0x0045:
            int r0 = r0 + 1
            goto L_0x0031
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.map.geolocation.sapp.TencentLocationManager.<init>(android.content.Context, android.util.Pair):void");
    }

    /* renamed from: a */
    private boolean m155365a(Context context, Pair<String, String> pair, int i) {
        if (i > 0) {
            C113233r.m155002a(C113233r.m155013c(context));
            C113233r.m155002a(C113233r.m155028h(context));
            C113233r.m154995a();
            C113225f.m154950a(context).mo165767c();
        }
        try {
            DexClassLoader a = C113225f.m154950a(context).mo165765a();
            if (a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("class loader is null,");
                sb.append(i);
                C113229j.m154971a(sb.toString());
                C113223e.m154940b().mo165758a("LMI", "41");
                this.mInitStatus = 4;
                return false;
            }
            Class<?> loadClass = a.loadClass("com.tencent.map.geolocation.sapp.proxy.TencentLocationManagerProxy");
            mProxyClass = loadClass;
            if (pair != null) {
                mProxyObj = loadClass.getConstructor(new Class[]{Context.class, Pair.class}).newInstance(new Object[]{context, pair});
            } else {
                mProxyObj = loadClass.getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
            }
            if (mProxyObj == null) {
                this.mInitStatus = 4;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Mgr init failed,");
                sb4.append(i);
                C113229j.m154971a(sb4.toString());
                C113223e b = C113223e.m154940b();
                StringBuilder sb5 = new StringBuilder();
                sb5.append("42,");
                sb5.append(i);
                b.mo165758a("LMI", sb5.toString());
                return false;
            }
            C113223e b2 = C113223e.m154940b();
            StringBuilder sb6 = new StringBuilder();
            sb6.append("0,");
            sb6.append(i);
            b2.mo165758a("LMI", sb6.toString());
            return true;
        } catch (Throwable th) {
            this.mInitStatus = 5;
            C113229j.m154972a("initLocManager", th);
            C113223e b3 = C113223e.m154940b();
            b3.mo165758a("LMI", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY + th.toString());
            return false;
        }
    }

    public static synchronized TencentLocationManager getInstance(Context context) {
        TencentLocationManager tencentLocationManager;
        synchronized (TencentLocationManager.class) {
            if (sInstance == null) {
                if (context == null) {
                    throw new NullPointerException("context is null");
                } else if (context.getApplicationContext() != null) {
                    System.currentTimeMillis();
                    sInstance = new TencentLocationManager(context.getApplicationContext(), (Pair<String, String>) null);
                } else {
                    throw new NullPointerException("application context is null");
                }
            }
            tencentLocationManager = sInstance;
        }
        return tencentLocationManager;
    }

    public static boolean isOtherIdIllegal(String str) {
        return str.matches("^[a-z0-9A-Z]{6,32}$");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void setDeviceID(android.util.Pair<java.lang.String, java.lang.String> r7) {
        /*
            if (r7 == 0) goto L_0x005e
            java.lang.Object r0 = r7.first
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "qImei"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x002d
            java.lang.Object r0 = r7.first
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "oaId"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x002d
            java.lang.Object r0 = r7.first
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = isOtherIdIllegal(r0)
            if (r0 == 0) goto L_0x0025
            goto L_0x002d
        L_0x0025:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "your deviceID is illegal!"
            r7.<init>(r0)
            throw r7
        L_0x002d:
            android.content.Context r0 = mContext     // Catch:{  }
            if (r0 == 0) goto L_0x005b
            java.lang.Class r0 = mProxyClass     // Catch:{  }
            if (r0 == 0) goto L_0x005d
            java.lang.String r1 = "uploadLimeiInfo"
            r2 = 2
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ all -> 0x005d }
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r5 = 0
            r3[r5] = r4     // Catch:{ all -> 0x005d }
            java.lang.Class<android.util.Pair> r4 = android.util.Pair.class
            r6 = 1
            r3[r6] = r4     // Catch:{ all -> 0x005d }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r3)     // Catch:{ all -> 0x005d }
            r0.setAccessible(r6)     // Catch:{ all -> 0x005d }
            java.lang.Object r1 = mProxyObj     // Catch:{ all -> 0x005d }
            if (r1 == 0) goto L_0x005d
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x005d }
            android.content.Context r3 = mContext     // Catch:{ all -> 0x005d }
            r2[r5] = r3     // Catch:{ all -> 0x005d }
            r2[r6] = r7     // Catch:{ all -> 0x005d }
            r0.invoke(r1, r2)     // Catch:{ all -> 0x005d }
            goto L_0x005d
        L_0x005b:
            mPair = r7     // Catch:{  }
        L_0x005d:
            return
        L_0x005e:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "deviceID is null!"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.map.geolocation.sapp.TencentLocationManager.setDeviceID(android.util.Pair):void");
    }

    public String getBuild() {
        try {
            return (String) mProxyClass.getDeclaredMethod("getBuild", new Class[0]).invoke(mProxyObj, new Object[0]);
        } catch (Throwable unused) {
            return "error";
        }
    }

    public int getCoordinateType() {
        try {
            return ((Integer) mProxyClass.getDeclaredMethod("getCoordinateType", new Class[0]).invoke(mProxyObj, new Object[0])).intValue();
        } catch (Throwable unused) {
            return -1;
        }
    }

    public TencentLocation getLastKnownLocation() {
        try {
            return (TencentLocation) mProxyClass.getDeclaredMethod("getLastKnownLocation", new Class[0]).invoke(mProxyObj, new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getVersion() {
        try {
            return (String) mProxyClass.getDeclaredMethod("getVersion", new Class[0]).invoke(mProxyObj, new Object[0]);
        } catch (Throwable unused) {
            return "error";
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0023 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void removeUpdates(com.tencent.map.geolocation.sapp.TencentLocationListener r8) {
        /*
            r7 = this;
            byte[] r0 = r7.mLock
            monitor-enter(r0)
            java.lang.Class r1 = mProxyClass     // Catch:{ all -> 0x0023 }
            java.lang.String r2 = "removeUpdates"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x0023 }
            java.lang.Class<com.tencent.map.geolocation.sapp.TencentLocationListener> r5 = com.tencent.map.geolocation.sapp.TencentLocationListener.class
            r6 = 0
            r4[r6] = r5     // Catch:{ all -> 0x0023 }
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r4)     // Catch:{ all -> 0x0023 }
            java.lang.Object r2 = mProxyObj     // Catch:{ all -> 0x0023 }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0023 }
            r3[r6] = r8     // Catch:{ all -> 0x0023 }
            r1.invoke(r2, r3)     // Catch:{ all -> 0x0023 }
            c.t.m.sapp.c.e r8 = p429c.p790t.p791m.sapp.p792c.C113223e.m154940b()     // Catch:{ all -> 0x0023 }
            r8.mo165762d()     // Catch:{ all -> 0x0023 }
        L_0x0023:
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            return
        L_0x0025:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.map.geolocation.sapp.TencentLocationManager.removeUpdates(com.tencent.map.geolocation.sapp.TencentLocationListener):void");
    }

    public int requestLocationUpdates(TencentLocationRequest tencentLocationRequest, TencentLocationListener tencentLocationListener) {
        int i = this.mInitStatus;
        if (i > 0) {
            return i;
        }
        try {
            return ((Integer) mProxyClass.getDeclaredMethod("requestLocationUpdates", new Class[]{TencentLocationRequest.class, TencentLocationListener.class}).invoke(mProxyObj, new Object[]{tencentLocationRequest, tencentLocationListener})).intValue();
        } catch (Throwable th) {
            C113229j.m154972a("reqLocUpdates error. ", th);
            return 5;
        }
    }

    public int requestSingleFreshLocation(TencentLocationRequest tencentLocationRequest, TencentLocationListener tencentLocationListener, Looper looper, boolean z) {
        int intValue;
        if (tencentLocationListener == null) {
            throw new NullPointerException("listener is null");
        } else if (looper != null) {
            int i = this.mInitStatus;
            if (i > 0) {
                return i;
            }
            synchronized (this.mLock) {
                try {
                    Class cls = mProxyClass;
                    intValue = ((Integer) cls.getDeclaredMethod("requestSingleFreshLocation", new Class[]{TencentLocationRequest.class, TencentLocationListener.class, Looper.class, Boolean.TYPE}).invoke(mProxyObj, new Object[]{tencentLocationRequest, tencentLocationListener, looper, Boolean.valueOf(z)})).intValue();
                } catch (Throwable th) {
                    C113229j.m154972a("reqSigLoc error. ", th);
                    return 5;
                }
            }
            return intValue;
        } else {
            throw new NullPointerException("looper is null");
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x003c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setCoordinateType(int r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 == r0) goto L_0x001d
            if (r8 != 0) goto L_0x0006
            goto L_0x001d
        L_0x0006:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0041 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0041 }
            r1.<init>()     // Catch:{ Exception -> 0x0041 }
            java.lang.String r2 = "unknown coordinate type: "
            r1.append(r2)     // Catch:{ Exception -> 0x0041 }
            r1.append(r8)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r8 = r1.toString()     // Catch:{ Exception -> 0x0041 }
            r0.<init>(r8)     // Catch:{ Exception -> 0x0041 }
            throw r0     // Catch:{ Exception -> 0x0041 }
        L_0x001d:
            byte[] r1 = r7.mLock     // Catch:{ Exception -> 0x0041 }
            monitor-enter(r1)     // Catch:{ Exception -> 0x0041 }
            java.lang.Class r2 = mProxyClass     // Catch:{ all -> 0x003c }
            java.lang.String r3 = "setCoordinateType"
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch:{ all -> 0x003c }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ all -> 0x003c }
            r6 = 0
            r4[r6] = r5     // Catch:{ all -> 0x003c }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch:{ all -> 0x003c }
            java.lang.Object r3 = mProxyObj     // Catch:{ all -> 0x003c }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x003c }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x003c }
            r0[r6] = r8     // Catch:{ all -> 0x003c }
            r2.invoke(r3, r0)     // Catch:{ all -> 0x003c }
        L_0x003c:
            monitor-exit(r1)     // Catch:{ all -> 0x003e }
            goto L_0x0041
        L_0x003e:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x003e }
            throw r8     // Catch:{ Exception -> 0x0041 }
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.map.geolocation.sapp.TencentLocationManager.setCoordinateType(int):void");
    }

    public boolean startIndoorLocation() {
        try {
            return ((Boolean) mProxyClass.getDeclaredMethod("startIndoorLocation", new Class[0]).invoke(mProxyObj, new Object[0])).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean stopIndoorLocation() {
        try {
            return ((Boolean) mProxyClass.getDeclaredMethod("stopIndoorLocation", new Class[0]).invoke(mProxyObj, new Object[0])).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public int requestLocationUpdates(TencentLocationRequest tencentLocationRequest, TencentLocationListener tencentLocationListener, Looper looper) {
        int intValue;
        System.currentTimeMillis();
        if (tencentLocationRequest == null) {
            throw new NullPointerException("request is null");
        } else if (tencentLocationListener == null) {
            throw new NullPointerException("listener is null");
        } else if (looper != null) {
            int i = this.mInitStatus;
            if (i > 0) {
                return i;
            }
            synchronized (this.mLock) {
                try {
                    Integer num = (Integer) mProxyClass.getDeclaredMethod("requestLocationUpdates", new Class[]{TencentLocationRequest.class, TencentLocationListener.class, Looper.class}).invoke(mProxyObj, new Object[]{tencentLocationRequest, tencentLocationListener, looper});
                    C113223e.m154940b().mo165758a("RLU", num.toString());
                    intValue = num.intValue();
                } catch (Throwable th) {
                    C113223e b = C113223e.m154940b();
                    StringBuilder sb = new StringBuilder();
                    sb.append("5,");
                    sb.append(th.toString());
                    b.mo165758a("RLU", sb.toString());
                    C113229j.m154972a("reqLocUpdates looper error. ", th);
                    return 5;
                }
            }
            return intValue;
        } else {
            throw new NullPointerException("looper is null");
        }
    }

    public static synchronized TencentLocationManager getInstance(Context context, Pair<String, String> pair) {
        TencentLocationManager tencentLocationManager;
        synchronized (TencentLocationManager.class) {
            if (sInstance == null) {
                if (context == null) {
                    throw new NullPointerException("context is null");
                } else if (context.getApplicationContext() != null) {
                    System.currentTimeMillis();
                    sInstance = new TencentLocationManager(context.getApplicationContext(), pair);
                } else {
                    throw new NullPointerException("application context is null");
                }
            }
            tencentLocationManager = sInstance;
        }
        return tencentLocationManager;
    }

    public int requestSingleFreshLocation(TencentLocationRequest tencentLocationRequest, TencentLocationListener tencentLocationListener, Looper looper) {
        return requestSingleFreshLocation(tencentLocationRequest, tencentLocationListener, looper, false);
    }
}
