package com.tencent.mapsdk.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.mapsdk.internal.C113865kb;
import com.tencent.xweb.file.XVFSFile;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

/* renamed from: com.tencent.mapsdk.internal.rs */
public class C114181rs {

    /* renamed from: a */
    public static final String f341835a = "china";

    /* renamed from: b */
    public static final String f341836b = "inland";

    /* renamed from: c */
    public static final String f341837c = "taiwan";

    /* renamed from: d */
    public static final String f341838d = "outOfChina";

    /* renamed from: e */
    private static ConcurrentHashMap<String, C113741fw[]> f341839e = new ConcurrentHashMap<>();

    /* renamed from: f */
    private static volatile C114181rs f341840f = null;

    /* renamed from: l */
    private static final String f341841l = "124.240000,39.863000:127.060000,41.420000:128.320000,41.340000:128.338164,41.966811:129.070015,42.006633:129.392187,42.394602:129.544000,42.337000:129.757733,42.443019:129.915455,42.958121:130.581000,42.411000:130.664000,42.409000:130.660000,42.750000:131.056800,42.832500:131.362267,43.147780:131.359097,44.050378:131.184574,44.758711:131.911825,45.219501:133.163642,44.937724:135.144366,48.211013:135.128000,48.597000:131.071828,47.811040:130.773650,49.035551:128.751969,49.726565:125.969075,53.154351:123.347269,53.704738:120.827269,53.390754:119.713597,52.637780:120.321762,52.210396:118.926328,50.226355:117.662701,49.700280:116.622716,49.956516:115.284508,48.000368:116.104389,47.451176:118.485448,47.755809:119.550866,46.911548:117.463642,46.804509:113.640000,45.105329:111.969090,45.243847:111.267254,44.465714:111.589045,43.737317:109.905388,42.763982:107.448179,42.614694:105.337313,41.946215:100.992746,42.800196:96.838239,42.914056:95.070866,44.957807:91.816477,45.242319:91.161836,46.742245:90.130007,47.948495:88.699097,48.336174:87.883642,49.202090:86.809933,49.172099:85.459963,48.255788:85.328157,47.119427:82.919985,47.328453:82.134523,45.619623:82.396343,45.291415:81.735685,45.446091:79.797183,45.018009:80.618157,43.259401:80.112694,42.868284:80.120896,42.260590:77.976351,41.282314:76.788172,41.096389:76.197254,40.491205:75.361880,40.846808:73.365418,39.794560:73.634523,38.503352:74.669067,38.423003:74.896815,37.310540:74.429528,37.294106:74.454501,36.972073:75.734530,36.578999:75.962701,35.784605:77.852731,35.299899:78.205470,34.574291:78.973568,32.910437:78.263619,32.582183:78.649985,30.992536:81.199112,29.930890:81.625396,30.231654:85.988179,27.769037:88.674612,27.787987:88.840910,27.047339:89.241858,27.247275:89.644552,28.077447:90.426358,28.002589:91.425425,27.605415:92.127284,26.721880:93.834582,26.907073:95.855604,28.198876:97.000074,27.593593:97.491836,27.849236:97.700896,28.296779:98.301769,27.394792:98.605433,27.417494:98.502702,26.026786:97.440895,25.088802:97.485448,23.745403:98.497224,24.030523:98.809985,23.174956:99.324515,22.945024:99.099993,22.084196:100.205485,21.391178:101.003735,21.463004:101.278198,21.122876:101.931836,21.129823:101.785481,22.197373:102.650063,22.558783:103.074619,22.382137:103.979093,22.474798:104.809933,22.767793:105.399978,23.049961:106.469971,22.704082:106.610899,21.787060:107.897261,21.372454:107.490036,19.305984:109.748489,14.674666:110.039063,11.480025:107.666016,6.271618:111.752930,3.281824:112.939454,3.413421:115.018257,6.054474:118.674316,10.790140:119.164223,12.212996:119.707031,18.020528:121.959229,21.677848:122.699226,23.809795:127.303391,24.447079:127.390663,31.568056:124.335754,32.823666";

    /* renamed from: m */
    private static final String f341842m = "124.240000,39.863000:127.060000,41.420000:128.320000,41.340000:128.338164,41.966811:129.070015,42.006633:129.392187,42.394602:129.544000,42.337000:129.757733,42.443019:129.915455,42.958121:130.581000,42.411000:130.664000,42.409000:130.660000,42.750000:131.056800,42.832500:131.362267,43.147780:131.359097,44.050378:131.184574,44.758711:131.911825,45.219501:133.163642,44.937724:135.144366,48.211013:135.128000,48.597000:131.071828,47.811040:130.773650,49.035551:128.751969,49.726565:125.969075,53.154351:123.347269,53.704738:120.827269,53.390754:119.713597,52.637780:120.321762,52.210396:118.926328,50.226355:117.662701,49.700280:116.622716,49.956516:115.284508,48.000368:116.104389,47.451176:118.485448,47.755809:119.550866,46.911548:117.463642,46.804509:113.640000,45.105329:111.969090,45.243847:111.267254,44.465714:111.589045,43.737317:109.905388,42.763982:107.448179,42.614694:105.337313,41.946215:100.992746,42.800196:96.838239,42.914056:95.070866,44.957807:91.816477,45.242319:91.161836,46.742245:90.130007,47.948495:88.699097,48.336174:87.883642,49.202090:86.809933,49.172099:85.459963,48.255788:85.328157,47.119427:82.919985,47.328453:82.134523,45.619623:82.396343,45.291415:81.735685,45.446091:79.797183,45.018009:80.618157,43.259401:80.112694,42.868284:80.120896,42.260590:77.976351,41.282314:76.788172,41.096389:76.197254,40.491205:75.361880,40.846808:73.365418,39.794560:73.634523,38.503352:74.669067,38.423003:74.896815,37.310540:74.429528,37.294106:74.454501,36.972073:75.734530,36.578999:75.962701,35.784605:77.852731,35.299899:78.205470,34.574291:78.973568,32.910437:78.263619,32.582183:78.649985,30.992536:81.199112,29.930890:81.625396,30.231654:85.988179,27.769037:88.674612,27.787987:88.840910,27.047339:89.241858,27.247275:89.644552,28.077447:90.426358,28.002589:91.425425,27.605415:92.127284,26.721880:93.834582,26.907073:95.855604,28.198876:97.000074,27.593593:97.491836,27.849236:97.700896,28.296779:98.301769,27.394792:98.605433,27.417494:98.502702,26.026786:97.440895,25.088802:97.485448,23.745403:98.497224,24.030523:98.809985,23.174956:99.324515,22.945024:99.099993,22.084196:100.205485,21.391178:101.003735,21.463004:101.278198,21.122876:101.931836,21.129823:101.785481,22.197373:102.650063,22.558783:103.074619,22.382137:103.979093,22.474798:104.809933,22.767793:105.399978,23.049961:106.469971,22.704082:106.610899,21.787060:107.897261,21.372454:107.490036,19.305984:109.748489,14.674666:110.039063,11.480025:107.666016,6.271618:111.752930,3.281824:112.939454,3.413421:115.018257,6.054474:118.674316,10.790140:119.164223,12.212996:119.707031,18.020528:121.397269,20.720622:118.487770,21.778166:119.578789,24.089008:120.465831,25.121382:121.207406,25.815692:121.869972,25.849447:122.742859,25.209509:122.699226,23.809795:127.303391,24.447079:127.390663,31.568056:124.335754,32.823666";

    /* renamed from: n */
    private static final String f341843n = "121.397269,20.720622:118.487770,21.778166:119.578789,24.089008:120.465831,25.121382:121.207406,25.815692:121.869972,25.849447:122.742859,25.209509:122.699226,23.809795:121.959229,21.677848";

    /* renamed from: g */
    private ReentrantReadWriteLock f341844g = new ReentrantReadWriteLock();

    /* renamed from: h */
    private String f341845h = null;

    /* renamed from: i */
    private String f341846i = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f341847j = false;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public volatile boolean f341848k;

    private C114181rs() {
    }

    /* renamed from: c */
    private static void m159514c() {
    }

    /* renamed from: c */
    public static C113741fw[] m159515c(String str) {
        return f341839e.get(str);
    }

    /* renamed from: d */
    private static C113741fw[] m159516d(String str) {
        C113741fw[] fwVarArr = null;
        if (!(str == null || str.length() == 0)) {
            String[] split = str.split(XVFSFile.PATH_SEPARATOR);
            if (split.length == 0) {
                return null;
            }
            fwVarArr = new C113741fw[split.length];
            for (int i = 0; i < split.length; i++) {
                String[] split2 = split[i].split(",");
                fwVarArr[i] = C114373y.m160626b(new GeoPoint((int) (Double.parseDouble(split2[1]) * 1000000.0d), (int) (Double.parseDouble(split2[0]) * 1000000.0d)));
            }
        }
        return fwVarArr;
    }

    /* renamed from: b */
    public final String mo172823b() {
        FileInputStream fileInputStream;
        this.f341844g.readLock().lock();
        try {
            fileInputStream = new FileInputStream(new File(this.f341845h));
            try {
                String str = new String(C113886kg.m157522b((InputStream) fileInputStream), "UTF-8");
                C113886kg.m157515a((Closeable) fileInputStream);
                this.f341844g.readLock().unlock();
                return str;
            } catch (Throwable unused) {
                C113886kg.m157515a((Closeable) fileInputStream);
                this.f341844g.readLock().unlock();
                return null;
            }
        } catch (Throwable unused2) {
            fileInputStream = null;
            C113886kg.m157515a((Closeable) fileInputStream);
            this.f341844g.readLock().unlock();
            return null;
        }
    }

    /* renamed from: a */
    public static C114181rs m159508a() {
        if (f341840f == null) {
            synchronized (C114181rs.class) {
                if (f341840f == null) {
                    f341840f = new C114181rs();
                }
            }
        }
        return f341840f;
    }

    /* renamed from: b */
    public static int m159513b(String str) {
        C113741fw[] d;
        C113741fw[] d2;
        C113741fw[] d3;
        int i = 0;
        if (!(str == null || str.length() == 0)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (ProviderConstants.API_COLNAME_FEATURE_VERSION.equals(next)) {
                        i = jSONObject.optInt(next);
                    } else {
                        C113741fw[] d4 = m159516d(jSONObject.optString(next));
                        if (d4 != null) {
                            f341839e.put(next, d4);
                        }
                    }
                }
                if (!f341839e.containsKey(f341835a) && (d3 = m159516d(f341841l)) != null) {
                    f341839e.put(f341835a, d3);
                }
                if (!f341839e.containsKey(f341836b) && (d2 = m159516d(f341842m)) != null) {
                    f341839e.put(f341836b, d2);
                }
                if (!f341839e.containsKey(f341837c) && (d = m159516d(f341843n)) != null) {
                    f341839e.put(f341837c, d);
                }
            } catch (Throwable unused) {
            }
        }
        return i;
    }

    /* renamed from: a */
    public final void mo172821a(Context context) {
        if (!this.f341847j && !this.f341848k) {
            f341839e.put(f341835a, m159516d(f341841l));
            f341839e.put(f341836b, m159516d(f341842m));
            f341839e.put(f341837c, m159516d(f341843n));
            if (context != null) {
                this.f341845h = context.getFilesDir() + "/frontiers.dat";
                this.f341846i = this.f341845h + ".bak";
            }
            C113865kb.m157396a(new C113865kb.C113879g<Boolean>() {
                /* renamed from: a */
                private Boolean m159520a() {
                    boolean unused = C114181rs.this.f341848k = true;
                    String b = C114181rs.this.mo172823b();
                    if (!TextUtils.isEmpty(b)) {
                        C114181rs.m159513b(b);
                    }
                    boolean unused2 = C114181rs.this.f341848k = false;
                    boolean unused3 = C114181rs.this.f341847j = true;
                    return Boolean.TRUE;
                }

                public final /* synthetic */ Object call() {
                    boolean unused = C114181rs.this.f341848k = true;
                    String b = C114181rs.this.mo172823b();
                    if (!TextUtils.isEmpty(b)) {
                        C114181rs.m159513b(b);
                    }
                    boolean unused2 = C114181rs.this.f341848k = false;
                    boolean unused3 = C114181rs.this.f341847j = true;
                    return Boolean.TRUE;
                }
            }).mo172279a(Boolean.FALSE);
        }
    }

    /* renamed from: a */
    public final boolean mo172822a(String str) {
        this.f341844g.writeLock().lock();
        File file = new File(this.f341845h);
        File file2 = new File(this.f341846i);
        if (!file2.exists() || file2.delete()) {
            FileOutputStream fileOutputStream = null;
            try {
                if (!file.exists() || file.renameTo(file2)) {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    try {
                        fileOutputStream2.write(str.getBytes("UTF-8"));
                        fileOutputStream2.flush();
                        C113886kg.m157515a((Closeable) fileOutputStream2);
                        file2.delete();
                        this.f341844g.writeLock().unlock();
                        return true;
                    } catch (Throwable unused) {
                        fileOutputStream = fileOutputStream2;
                    }
                }
            } catch (Throwable unused2) {
            }
            C113886kg.m157515a((Closeable) fileOutputStream);
            file2.renameTo(file);
            this.f341844g.writeLock().unlock();
            return false;
        }
        file2.deleteOnExit();
        return false;
    }

    /* renamed from: a */
    public static boolean m159509a(C113741fw fwVar, C113741fw[] fwVarArr) {
        int i;
        C113741fw fwVar2 = fwVar;
        C113741fw[] fwVarArr2 = fwVarArr;
        if (fwVarArr2 == null || fwVarArr2.length < 3) {
            return false;
        }
        int length = fwVarArr2.length - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 < fwVarArr2.length) {
            C113741fw fwVar3 = fwVarArr2[i2];
            double d = fwVar3.f340306b;
            double d2 = fwVar2.f340306b;
            if ((d >= d2 || fwVarArr2[length].f340306b < d2) && (fwVarArr2[length].f340306b >= d2 || d < d2)) {
                i = i2;
            } else {
                double d3 = fwVar3.f340307c;
                double d4 = fwVar2.f340307c;
                if (d3 > d4) {
                    i = i2;
                    if (fwVarArr2[length].f340307c > d4) {
                    }
                } else {
                    i = i2;
                }
                C113741fw fwVar4 = fwVarArr2[length];
                z ^= d3 + (((d2 - d) / (fwVar4.f340306b - d)) * (fwVar4.f340307c - d3)) < d4;
            }
            i2 = i + 1;
            length = i;
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m159512a(C113741fw[] fwVarArr, C113741fw[] fwVarArr2) {
        boolean z;
        int length = fwVarArr.length;
        int i = 0;
        boolean z2 = false;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            z2 |= m159509a(fwVarArr[i], fwVarArr2);
            if (z2) {
                z = true;
                break;
            }
            i++;
        }
        boolean z3 = false;
        boolean z4 = false;
        for (C113741fw a : fwVarArr2) {
            z3 |= m159509a(a, fwVarArr);
            if (z3) {
                z4 = true;
            }
        }
        return z || z4;
    }
}
