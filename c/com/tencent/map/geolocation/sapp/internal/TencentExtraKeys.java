package com.tencent.map.geolocation.sapp.internal;

import android.content.Context;
import android.location.Location;
import com.tencent.map.geolocation.sapp.TencentLocation;
import com.tencent.map.geolocation.sapp.TencentLocationManagerOptions;
import com.tencent.map.geolocation.sapp.TencentLocationRequest;
import dalvik.system.DexClassLoader;
import java.io.File;
import p429c.p790t.p791m.sapp.p792c.C113223e;
import p429c.p790t.p791m.sapp.p792c.C113225f;
import p429c.p790t.p791m.sapp.p792c.C113229j;
import p429c.p790t.p791m.sapp.p792c.C113233r;

public class TencentExtraKeys {
    public static final boolean ALLOW_NLP_LOCATION = true;
    public static final boolean DIDI_INTERNAL = false;
    public static final String LOCATION_KEY_ADMIN_LEVEL1 = "admin_level_1";
    public static final String LOCATION_KEY_ADMIN_LEVEL2 = "admin_level_2";
    public static final String LOCATION_KEY_ADMIN_LEVEL3 = "admin_level_3";
    public static final String LOCATION_KEY_LOCALITY = "locality";
    public static final String LOCATION_KEY_NATION = "nation";
    public static final String LOCATION_KEY_ROUTE = "route";
    public static final String LOCATION_KEY_SUBLOCALITY = "sublocality";
    public static final String LOCATION_SOURCE_CELL = "cell";
    public static final String LOCATION_SOURCE_GPS = "gps";
    public static final String LOCATION_SOURCE_WIFI = "wifi";
    public static final String RAW_DATA = "raw_data";
    public static final String REQUEST_RAW_DATA = "request_raw_data";
    public static final boolean STRICT_CELL_FILTER = true;
    public static final String TAG = "TencentExtraKeys";
    public static final boolean TENCENT_INTERNAL = true;
    public static Context mContext;
    public static DexClassLoader mLoader;
    public static Object mProxyObj;
    public static Class mProxyclass;

    /* renamed from: a */
    public static boolean m155366a(Context context, int i) {
        if (i > 0) {
            try {
                C113233r.m155002a(C113233r.m155013c(context));
                C113233r.m155002a(C113233r.m155028h(context));
                C113233r.m154995a();
                C113225f.m154950a(context).mo165767c();
            } catch (Throwable th) {
                C113223e b = C113223e.m154940b();
                b.mo165758a("EKS", "init error 3," + i + "," + th.toString());
                return false;
            }
        }
        DexClassLoader a = C113225f.m154950a(context).mo165765a();
        if (a == null) {
            C113229j.m154971a("EKS,loader is null");
            C113223e b2 = C113223e.m154940b();
            StringBuilder sb = new StringBuilder();
            sb.append("init error 2,");
            sb.append(i);
            b2.mo165758a("EKS", sb.toString());
            return false;
        }
        if (mProxyclass == null || mProxyObj == null) {
            Class<?> loadClass = a.loadClass("com.tencent.map.geolocation.sapp.proxy.TencentExtraKeysProxy");
            mProxyclass = loadClass;
            mProxyObj = loadClass.newInstance();
        }
        C113223e b3 = C113223e.m154940b();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("init ok 0,");
        sb4.append(i);
        b3.mo165758a("EKS", sb4.toString());
        return true;
    }

    public static void enableMockLocationFilter(boolean z) {
        try {
            if (initProxy()) {
                Class cls = mProxyclass;
                cls.getDeclaredMethod("enableMockLocationFilter", new Class[]{Boolean.TYPE}).invoke(mProxyObj, new Object[]{Boolean.valueOf(z)});
                return;
            }
            throw new Exception("proxy is error");
        } catch (Throwable th) {
            throw new Exception(th.toString());
        }
    }

    public static String getLocationSource(TencentLocation tencentLocation) {
        try {
            if (initProxy()) {
                return (String) mProxyclass.getDeclaredMethod("getLocationSource", new Class[]{TencentLocation.class}).invoke(mProxyObj, new Object[]{tencentLocation});
            }
            throw new Exception("proxy is error");
        } catch (Throwable th) {
            throw new Exception(th.toString());
        }
    }

    public static synchronized File getLogDir() {
        File file;
        synchronized (TencentExtraKeys.class) {
            try {
                if (initProxy()) {
                    file = (File) mProxyclass.getDeclaredMethod("getLogDir", new Class[0]).invoke(mProxyObj, new Object[0]);
                } else {
                    throw new Exception("proxy is error");
                }
            } catch (Throwable th) {
                throw new Exception(th.toString());
            }
        }
        return file;
    }

    public static byte[] getRawData(TencentLocation tencentLocation) {
        try {
            if (initProxy()) {
                return (byte[]) mProxyclass.getDeclaredMethod("getRawData", new Class[]{TencentLocation.class}).invoke(mProxyObj, new Object[]{tencentLocation});
            }
            throw new Exception("proxy is error");
        } catch (Throwable th) {
            throw new Exception(th.toString());
        }
    }

    public static Location getRawGps(TencentLocation tencentLocation) {
        try {
            if (initProxy()) {
                return (Location) mProxyclass.getDeclaredMethod("getRawGps", new Class[]{TencentLocation.class}).invoke(mProxyObj, new Object[]{tencentLocation});
            }
            throw new Exception("proxy is error");
        } catch (Throwable th) {
            throw new Exception(th.toString());
        }
    }

    public static String getRawQuery(TencentLocation tencentLocation) {
        try {
            if (initProxy()) {
                return (String) mProxyclass.getDeclaredMethod("getRawQuery", new Class[]{TencentLocation.class}).invoke(mProxyObj, new Object[]{tencentLocation});
            }
            throw new Exception("proxy is error");
        } catch (Throwable th) {
            throw new Exception(th.toString());
        }
    }

    public static boolean initProxy() {
        if (mContext == null) {
            return false;
        }
        for (int i = 0; i < 3; i++) {
            if (m155366a(mContext, i)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAllowedLevel(int i) {
        try {
            if (initProxy()) {
                Class cls = mProxyclass;
                return ((Boolean) cls.getDeclaredMethod("isAllowedLevel", new Class[]{Integer.TYPE}).invoke(mProxyObj, new Object[]{Integer.valueOf(i)})).booleanValue();
            }
            throw new Exception("proxy is error");
        } catch (Throwable th) {
            throw new Exception(th.toString());
        }
    }

    @Deprecated
    public static synchronized boolean isDebugEnabled() {
        boolean booleanValue;
        synchronized (TencentExtraKeys.class) {
            try {
                if (initProxy()) {
                    booleanValue = ((Boolean) mProxyclass.getDeclaredMethod("isDebugEnabled", new Class[0]).invoke(mProxyObj, new Object[0])).booleanValue();
                } else {
                    throw new Exception("proxy is error");
                }
            } catch (Throwable th) {
                throw new Exception(th.toString());
            }
        }
        return booleanValue;
    }

    public static int isInsIllegalApp(Context context) {
        try {
            mContext = context;
            if (initProxy()) {
                return ((Integer) mProxyclass.getDeclaredMethod("isInsIllegalApp", new Class[]{Context.class}).invoke(mProxyObj, new Object[]{context})).intValue();
            }
            throw new Exception("proxy is error");
        } catch (Throwable th) {
            throw new Exception(th.toString());
        }
    }

    public static boolean isRequestRawData(TencentLocationRequest tencentLocationRequest) {
        try {
            if (initProxy()) {
                return ((Boolean) mProxyclass.getDeclaredMethod("isRequestRawData", new Class[]{TencentLocationRequest.class}).invoke(mProxyObj, new Object[]{tencentLocationRequest})).booleanValue();
            }
            throw new Exception("proxy is error");
        } catch (Throwable th) {
            throw new Exception(th.toString());
        }
    }

    public static void loadLibrary(String str) {
        try {
            System.load(str);
        } catch (Throwable th) {
            throw new Exception(th.toString());
        }
    }

    public static void setContext(Context context) {
        mContext = context;
        C113223e.m154939a(context).mo165761c();
    }

    public static synchronized void setLogDir(File file) {
        synchronized (TencentExtraKeys.class) {
            try {
                if (initProxy()) {
                    mProxyclass.getDeclaredMethod("setLogDir", new Class[]{File.class}).invoke(mProxyObj, new Object[]{file});
                } else {
                    throw new Exception("proxy is error");
                }
            } catch (Throwable th) {
                throw new Exception(th.toString());
            }
        }
    }

    public static TencentLocation setRawData(TencentLocation tencentLocation, byte[] bArr) {
        try {
            if (initProxy()) {
                return (TencentLocation) mProxyclass.getDeclaredMethod("setRawData", new Class[]{TencentLocation.class, byte[].class}).invoke(mProxyObj, new Object[]{tencentLocation, bArr});
            }
            throw new Exception("proxy is error");
        } catch (Throwable th) {
            throw new Exception(th.toString());
        }
    }

    public static void setRawGps(TencentLocation tencentLocation, Location location) {
        try {
            if (initProxy()) {
                mProxyclass.getDeclaredMethod("setRawGps", new Class[]{TencentLocation.class, Location.class}).invoke(mProxyObj, new Object[]{tencentLocation, location});
                return;
            }
            throw new Exception("proxy is error");
        } catch (Throwable th) {
            throw new Exception(th.toString());
        }
    }

    public static void setRawQuery(TencentLocation tencentLocation, String str) {
        try {
            if (initProxy()) {
                mProxyclass.getDeclaredMethod("setRawQuery", new Class[]{TencentLocation.class, String.class}).invoke(mProxyObj, new Object[]{tencentLocation, str});
                return;
            }
            throw new Exception("proxy is error");
        } catch (Throwable th) {
            throw new Exception(th.toString());
        }
    }

    public static TencentLocationRequest setRequestRawData(TencentLocationRequest tencentLocationRequest, boolean z) {
        try {
            if (initProxy()) {
                Class cls = mProxyclass;
                return (TencentLocationRequest) cls.getDeclaredMethod("setRequestRawData", new Class[]{TencentLocationRequest.class, Boolean.TYPE}).invoke(mProxyObj, new Object[]{tencentLocationRequest, Boolean.valueOf(z)});
            }
            throw new Exception("proxy is error");
        } catch (Throwable th) {
            throw new Exception(th.toString());
        }
    }

    public static void setTencentLog(Context context, File file) {
        try {
            mContext = context;
            if (initProxy()) {
                mProxyclass.getDeclaredMethod("setTencentLog", new Class[]{Context.class, File.class}).invoke(mProxyObj, new Object[]{context, file});
                return;
            }
            throw new Exception("proxy is error");
        } catch (Throwable th) {
            throw new Exception(th.toString());
        }
    }

    public static void setTencentLogCallback(LocationLogCallback locationLogCallback) {
        try {
            C113229j.m154970a(locationLogCallback);
            if (initProxy()) {
                mProxyclass.getDeclaredMethod("setTencentLogCallback", new Class[]{LocationLogCallback.class}).invoke(mProxyObj, new Object[]{locationLogCallback});
                return;
            }
            throw new Exception("proxy is error");
        } catch (Throwable th) {
            throw new Exception(th.toString());
        }
    }

    public static boolean wgs84ToGcj02(double[] dArr, double[] dArr2) {
        Class<double[]> cls = double[].class;
        try {
            if (TencentLocationManagerOptions.isLoadLibraryEnabled()) {
                System.loadLibrary("tencentlocsapp");
            }
            if (initProxy()) {
                return ((Boolean) mProxyclass.getDeclaredMethod("wgs84ToGcj02", new Class[]{cls, cls}).invoke(mProxyObj, new Object[]{dArr, dArr2})).booleanValue();
            }
            throw new Exception("proxy is error");
        } catch (Throwable th) {
            throw new Exception(th.toString());
        }
    }
}
