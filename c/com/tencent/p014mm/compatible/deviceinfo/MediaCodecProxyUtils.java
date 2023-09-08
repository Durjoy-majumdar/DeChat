package com.tencent.p014mm.compatible.deviceinfo;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.app.C81169m2;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.util.WXWebReporter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p156gj.C87226y;

/* renamed from: com.tencent.mm.compatible.deviceinfo.MediaCodecProxyUtils */
public class MediaCodecProxyUtils {

    /* renamed from: a */
    public static volatile long f310643a;

    /* renamed from: b */
    public static final Map<Integer, C104617a> f310644b = new ConcurrentHashMap();

    /* renamed from: c */
    public static final Map<Integer, C104617a> f310645c = new ConcurrentHashMap();

    /* renamed from: d */
    public static final Map<Integer, C104617a> f310646d = new ConcurrentHashMap();

    /* renamed from: e */
    public static final Map<Integer, C104617a> f310647e = new ConcurrentHashMap();

    /* renamed from: f */
    public static C87226y f310648f;

    /* renamed from: com.tencent.mm.compatible.deviceinfo.MediaCodecProxyUtils$MediaCodecRetryInfo */
    public static class MediaCodecRetryInfo implements Parcelable {
        public static final Parcelable.Creator<MediaCodecRetryInfo> CREATOR = new C104615a();

        /* renamed from: d */
        public int f310649d;

        /* renamed from: com.tencent.mm.compatible.deviceinfo.MediaCodecProxyUtils$MediaCodecRetryInfo$a */
        public class C104615a implements Parcelable.Creator<MediaCodecRetryInfo> {
            public Object createFromParcel(Parcel parcel) {
                return new MediaCodecRetryInfo(parcel);
            }

            public Object[] newArray(int i) {
                return new MediaCodecRetryInfo[i];
            }
        }

        public MediaCodecRetryInfo(Parcel parcel) {
            this.f310649d = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f310649d);
        }
    }

    /* renamed from: com.tencent.mm.compatible.deviceinfo.MediaCodecProxyUtils$MediaCodecRetryInfoWrapper */
    public static class MediaCodecRetryInfoWrapper implements Parcelable {
        public static final Parcelable.Creator<MediaCodecRetryInfoWrapper> CREATOR = new C104616a();

        /* renamed from: d */
        public List<MediaCodecRetryInfo> f310650d;

        /* renamed from: com.tencent.mm.compatible.deviceinfo.MediaCodecProxyUtils$MediaCodecRetryInfoWrapper$a */
        public class C104616a implements Parcelable.Creator<MediaCodecRetryInfoWrapper> {
            public Object createFromParcel(Parcel parcel) {
                return new MediaCodecRetryInfoWrapper(parcel);
            }

            public Object[] newArray(int i) {
                return new MediaCodecRetryInfoWrapper[i];
            }
        }

        public MediaCodecRetryInfoWrapper(Parcel parcel) {
            this.f310650d = parcel.createTypedArrayList(MediaCodecRetryInfo.CREATOR);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeTypedList(this.f310650d);
        }
    }

    /* renamed from: com.tencent.mm.compatible.deviceinfo.MediaCodecProxyUtils$a */
    public static class C104617a {

        /* renamed from: a */
        public long f310651a = System.currentTimeMillis();

        /* renamed from: b */
        public boolean f310652b;

        /* renamed from: c */
        public String f310653c = Util.getStack().toString();

        /* renamed from: d */
        public String f310654d;

        /* renamed from: e */
        public String f310655e;

        /* renamed from: f */
        public String f310656f;
    }

    /* renamed from: com.tencent.mm.compatible.deviceinfo.MediaCodecProxyUtils$b */
    public static final class C104618b {
        /* renamed from: a */
        public static void m140206a(int i) {
            C87226y yVar = MediaCodecProxyUtils.f310648f;
            if (yVar != null) {
                ((C81169m2.C81175c) yVar).getClass();
                C115669n.INSTANCE.idkeyStat(1132, (long) i, 1, false);
            }
        }

        /* renamed from: b */
        public static void m140207b(int i, C104617a aVar) {
            if (aVar == null) {
                aVar = new C104617a();
            }
            String str = aVar.f310656f;
            m140208c(i, String.format(Locale.US, "%d,%d,%d,%d,%d,%b,%s,%s,%s,%s", new Object[]{Integer.valueOf(i), Integer.valueOf(((ConcurrentHashMap) MediaCodecProxyUtils.f310644b).size()), Integer.valueOf(((ConcurrentHashMap) MediaCodecProxyUtils.f310645c).size()), Integer.valueOf(((ConcurrentHashMap) MediaCodecProxyUtils.f310646d).size()), Integer.valueOf(((ConcurrentHashMap) MediaCodecProxyUtils.f310647e).size()), Boolean.valueOf(aVar.f310652b), aVar.f310654d, aVar.f310655e, str != null ? str.replace(",", ";") : "", aVar.f310653c}));
        }

        /* renamed from: c */
        public static void m140208c(int i, String str) {
            C87226y yVar = MediaCodecProxyUtils.f310648f;
            if (yVar != null) {
                yVar.getClass();
            }
            Log.m105925i("MicroMsg.MediaCodecProxyUtils", "reportKVImpl xSwitch:[%s], reportKey:[%d], kv:[%s]", false, Integer.valueOf(i), str);
        }

        /* renamed from: d */
        public static void m140209d(int i, String str) {
            m140208c(i, String.format(Locale.US, "%d,%d,%d,%d,%d,%b,%s,%s,%s,%s", new Object[]{Integer.valueOf(i), Integer.valueOf(((ConcurrentHashMap) MediaCodecProxyUtils.f310644b).size()), Integer.valueOf(((ConcurrentHashMap) MediaCodecProxyUtils.f310645c).size()), Integer.valueOf(((ConcurrentHashMap) MediaCodecProxyUtils.f310646d).size()), Integer.valueOf(((ConcurrentHashMap) MediaCodecProxyUtils.f310647e).size()), Boolean.FALSE, "", "", "", str}));
        }
    }

    /* renamed from: a */
    public static void m140199a() {
        Map<Integer, C104617a> map = f310644b;
        int size = ((ConcurrentHashMap) map).size();
        Map<Integer, C104617a> map2 = f310645c;
        int size2 = size + ((ConcurrentHashMap) map2).size();
        Map<Integer, C104617a> map3 = f310646d;
        int size3 = size2 + ((ConcurrentHashMap) map3).size();
        Map<Integer, C104617a> map4 = f310647e;
        Log.m105925i("MicroMsg.MediaCodecProxyUtils", "codecCountCheck allsize:[%d], audioEncodeMap:[%d], audioDecodeMap:[%d], videoEncodeMap:[%d], videoDecodeMap:[%d]", Integer.valueOf(size3 + ((ConcurrentHashMap) map4).size()), Integer.valueOf(((ConcurrentHashMap) map).size()), Integer.valueOf(((ConcurrentHashMap) map2).size()), Integer.valueOf(((ConcurrentHashMap) map3).size()), Integer.valueOf(((ConcurrentHashMap) map4).size()));
        m140200b(map2, 12);
        m140200b(map, 13);
        m140200b(map4, 14);
        m140200b(map3, 15);
    }

    /* renamed from: b */
    public static void m140200b(Map<Integer, C104617a> map, int i) {
        Iterator<Integer> it;
        int i2 = i;
        if (map.size() >= 8) {
            char c = 0;
            Log.m105925i("MicroMsg.MediaCodecProxyUtils", "codecLeakCheckImpl type:[%d], map.size:[%d], process:[%s]", Integer.valueOf(i), Integer.valueOf(map.size()), MMApplicationContext.getProcessName());
            if (f310643a + 30000 >= System.currentTimeMillis()) {
                if (f310643a == 0) {
                    Log.m105918d("MicroMsg.MediaCodecProxyUtils", "codecLeakCheckImpl first time");
                } else {
                    Log.m105919d("MicroMsg.MediaCodecProxyUtils", "codecLeakCheckImpl report return, time diff is %s", Long.valueOf(System.currentTimeMillis() - f310643a));
                    return;
                }
            }
            f310643a = System.currentTimeMillis();
            Log.m105919d("MicroMsg.MediaCodecProxyUtils", "codecLeakCheckImpl start leak report, time:%s", Long.valueOf(f310643a));
            StringBuilder sb = new StringBuilder();
            StringBuilder sb4 = new StringBuilder();
            Set<Integer> keySet = map.keySet();
            long currentTimeMillis = System.currentTimeMillis();
            Iterator<Integer> it4 = keySet.iterator();
            while (it4.hasNext()) {
                C104617a aVar = map.get(it4.next());
                if (aVar != null) {
                    String str = aVar.f310656f;
                    String replace = str != null ? str.replace(",", ";") : "";
                    sb.append(aVar.f310652b);
                    sb.append(";");
                    sb.append(aVar.f310654d);
                    sb.append(";");
                    sb.append(aVar.f310655e);
                    sb.append(";");
                    sb.append(MMApplicationContext.getProcessName());
                    sb.append(";");
                    sb.append(replace);
                    sb.append(";");
                    sb.append(aVar.f310653c);
                    sb.append("|");
                    long j = currentTimeMillis - aVar.f310651a;
                    if (j > 600000) {
                        it = it4;
                        Object[] objArr = new Object[1];
                        objArr[c] = Long.valueOf(j);
                        Log.m105925i("MicroMsg.MediaCodecProxyUtils", "codecCountCheckImpl diffTime:[%s] ", objArr);
                        sb4.append(j);
                        sb4.append(";");
                        sb4.append(aVar.f310652b);
                        sb4.append(";");
                        sb4.append(aVar.f310654d);
                        sb4.append(";");
                        sb4.append(aVar.f310655e);
                        sb4.append(";");
                        sb4.append(MMApplicationContext.getProcessName());
                        sb4.append(";");
                        sb4.append(replace);
                        sb4.append(";");
                        sb4.append(aVar.f310653c);
                        sb4.append("|");
                        it4 = it;
                        c = 0;
                    }
                }
                it = it4;
                it4 = it;
                c = 0;
            }
            if (i2 == 12) {
                C104618b.m140206a(12);
                if (!TextUtils.isEmpty(sb4.toString())) {
                    C104618b.m140206a(192);
                    if (MMApplicationContext.isMainProcess()) {
                        C104618b.m140209d(192, sb.toString());
                    }
                }
                if (MMApplicationContext.isMainProcess()) {
                    C104618b.m140206a(180);
                    C104618b.m140209d(180, sb.toString());
                } else if (MMApplicationContext.getProcessName().contains(":appbrand")) {
                    C104618b.m140206a(WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_PARSE_FAILED);
                } else {
                    C104618b.m140206a(WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_MD5_FAILED);
                }
            } else if (i2 == 13) {
                C104618b.m140206a(13);
                if (!TextUtils.isEmpty(sb4.toString())) {
                    C104618b.m140206a(193);
                    if (MMApplicationContext.isMainProcess()) {
                        C104618b.m140209d(193, sb.toString());
                    }
                }
                if (MMApplicationContext.isMainProcess()) {
                    C104618b.m140206a(WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD);
                    C104618b.m140209d(WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD, sb.toString());
                } else if (MMApplicationContext.getProcessName().contains(":appbrand")) {
                    C104618b.m140206a(WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_DOWNLOAD);
                } else {
                    C104618b.m140206a(WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_USE_DOWNLOAD);
                }
            } else if (i2 == 14) {
                C104618b.m140206a(14);
                if (!TextUtils.isEmpty(sb4.toString())) {
                    C104618b.m140206a(194);
                    if (MMApplicationContext.isMainProcess()) {
                        C104618b.m140209d(194, sb.toString());
                    }
                }
                if (MMApplicationContext.isMainProcess()) {
                    C104618b.m140206a(WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD_SUCCESS);
                    C104618b.m140209d(WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD_SUCCESS, sb.toString());
                } else if (MMApplicationContext.getProcessName().contains(":appbrand")) {
                    C104618b.m140206a(WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_DOWNLOAD_SUCCESS);
                } else {
                    C104618b.m140206a(190);
                }
            } else if (i2 == 15) {
                C104618b.m140206a(15);
                if (!TextUtils.isEmpty(sb4.toString())) {
                    C104618b.m140206a(195);
                    if (MMApplicationContext.isMainProcess()) {
                        C104618b.m140209d(195, sb.toString());
                    }
                }
                if (MMApplicationContext.isMainProcess()) {
                    C104618b.m140206a(WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD_FAILED);
                    C104618b.m140209d(WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD_FAILED, sb.toString());
                } else if (MMApplicationContext.getProcessName().contains(":appbrand")) {
                    C104618b.m140206a(WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_DOWNLOAD_FAILED);
                } else {
                    C104618b.m140206a(191);
                }
            }
        }
    }

    /* renamed from: c */
    public static void m140201c(boolean z, String str, C104617a aVar) {
        Log.m105925i("MicroMsg.MediaCodecProxyUtils", "isEncode:[%b], mimeType:[%s]", Boolean.valueOf(z), str);
        if (str.contains("video/")) {
            if (z) {
                C104618b.m140206a(6);
                C104618b.m140207b(6, aVar);
                return;
            }
            C104618b.m140206a(5);
            C104618b.m140207b(5, aVar);
        } else if (!str.contains("audio/")) {
        } else {
            if (z) {
                C104618b.m140206a(4);
                C104618b.m140207b(4, aVar);
                return;
            }
            C104618b.m140206a(3);
            C104618b.m140207b(3, aVar);
        }
    }

    /* renamed from: d */
    public static C104617a m140202d(int i, String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i2 = 0; i2 < codecCount; i2++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
            if (TextUtils.equals(codecInfoAt.getName(), str)) {
                String[] supportedTypes = codecInfoAt.getSupportedTypes();
                if (supportedTypes.length > 0) {
                    Log.m105925i("MicroMsg.MediaCodecProxyUtils", "insertMapWithCodecName success, codecName:[%s], mime:[%s]", str, supportedTypes[0]);
                    return m140203e(i, codecInfoAt.isEncoder(), supportedTypes[0]);
                }
            }
        }
        Log.m105921e("MicroMsg.MediaCodecProxyUtils", "insertMapWithCodecName fail, codecName:[%s]", str);
        C104617a aVar = new C104617a();
        aVar.f310655e = str;
        C104618b.m140206a(21);
        C104618b.m140207b(21, aVar);
        return new C104617a();
    }

    /* renamed from: e */
    public static C104617a m140203e(int i, boolean z, String str) {
        C104617a aVar = new C104617a();
        aVar.f310654d = str;
        aVar.f310652b = z;
        Log.m105925i("MicroMsg.MediaCodecProxyUtils", "insertMapWithMimeType, isEncode:[%b],mimeType:[%s]", Boolean.valueOf(z), str);
        if (str.contains("video/")) {
            if (z) {
                ((ConcurrentHashMap) f310646d).put(Integer.valueOf(i), aVar);
            } else {
                ((ConcurrentHashMap) f310647e).put(Integer.valueOf(i), aVar);
            }
        } else if (!str.contains("audio/")) {
            C104618b.m140206a(20);
            C104618b.m140207b(20, aVar);
        } else if (z) {
            ((ConcurrentHashMap) f310644b).put(Integer.valueOf(i), aVar);
        } else {
            ((ConcurrentHashMap) f310645c).put(Integer.valueOf(i), aVar);
        }
        return aVar;
    }

    /* renamed from: f */
    public static boolean m140204f(String str, C104617a aVar) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            String[] supportedTypes = codecInfoAt.getSupportedTypes();
            for (String equals : supportedTypes) {
                if (TextUtils.equals(equals, str)) {
                    aVar.f310655e = codecInfoAt.getName();
                    return true;
                }
            }
        }
        Log.m105921e("MicroMsg.MediaCodecProxyUtils", "mimeTypeSupportCheck error, type unsupport:[%s]", str);
        C104618b.m140206a(23);
        C104618b.m140207b(23, aVar);
        return false;
    }

    /* renamed from: g */
    public static boolean m140205g(int i) {
        if (((ConcurrentHashMap) f310644b).remove(Integer.valueOf(i)) != null) {
            Log.m105918d("MicroMsg.MediaCodecProxyUtils", "removeMap audioEncodeMap success");
            return true;
        }
        if (((ConcurrentHashMap) f310645c).remove(Integer.valueOf(i)) != null) {
            Log.m105918d("MicroMsg.MediaCodecProxyUtils", "removeMap audioDecodeMap success");
            return true;
        }
        if (((ConcurrentHashMap) f310646d).remove(Integer.valueOf(i)) != null) {
            Log.m105918d("MicroMsg.MediaCodecProxyUtils", "removeMap videoEncodeMap success");
            return true;
        }
        if (((ConcurrentHashMap) f310647e).remove(Integer.valueOf(i)) != null) {
            Log.m105918d("MicroMsg.MediaCodecProxyUtils", "removeMap videoDecodeMap success");
            return true;
        }
        Log.m105920e("MicroMsg.MediaCodecProxyUtils", "removeMap fail");
        C104618b.m140206a(22);
        C104618b.m140207b(22, new C104617a());
        return false;
    }
}
