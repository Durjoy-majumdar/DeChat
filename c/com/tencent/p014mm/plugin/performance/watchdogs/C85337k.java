package com.tencent.p014mm.plugin.performance.watchdogs;

import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.thumbplayer.api.TPOptionalID;
import com.tencent.tmassistantsdk.downloadservice.DownloadHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kj2.C117407d;
import p757xv.C91355x;

/* renamed from: com.tencent.mm.plugin.performance.watchdogs.k */
public class C85337k {

    /* renamed from: com.tencent.mm.plugin.performance.watchdogs.k$a */
    public enum C85338a {
        GLOBAL(new String[0]),
        FOREGROUND(new String[0]),
        BACKGROUND(new String[0]),
        LAUNCHER_BACKGROUND(new String[0]);
        

        /* renamed from: t */
        public static final int f248675t = 0;

        /* renamed from: d */
        public List<String> f248677d;

        /* renamed from: e */
        public int f248678e;

        /* renamed from: f */
        public int f248679f;

        /* renamed from: g */
        public int f248680g;

        /* renamed from: h */
        public int f248681h;

        /* renamed from: i */
        public int f248682i;

        /* renamed from: j */
        public int f248683j;

        /* renamed from: n */
        public int f248684n;

        /* renamed from: o */
        public boolean f248685o;

        /* renamed from: com.tencent.mm.plugin.performance.watchdogs.k$a$a */
        public static class C85339a {

            /* renamed from: a */
            public static int f248686a;
        }

        /* access modifiers changed from: public */
        static {
            f248675t = Integer.MIN_VALUE >> values().length;
        }

        /* access modifiers changed from: public */
        C85338a(String... strArr) {
            this.f248679f = 0;
            this.f248680g = 0;
            this.f248681h = 0;
            this.f248682i = 0;
            this.f248683j = 0;
            this.f248684n = 0;
            this.f248685o = false;
            int i = C85339a.f248686a;
            C85339a.f248686a = i + 1;
            this.f248678e = Integer.MIN_VALUE >>> i;
            this.f248677d = Arrays.asList(strArr);
        }

        /* renamed from: a */
        public static List<C85338a> m105361a(String str) {
            ArrayList arrayList = new ArrayList();
            for (C85338a aVar : values()) {
                Iterator<String> it = aVar.f248677d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String next = it.next();
                    if (!aVar.f248685o && str.matches(next)) {
                        Log.m105919d("MicroMsg.MemoryWatchDog.Reporter", "%s matches %s(%s)", str, next, aVar.name());
                        arrayList.add(aVar);
                        break;
                    }
                }
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    public static boolean m105352a(C91355x xVar, boolean z) {
        if (xVar.f262024z <= 1024000) {
            return false;
        }
        if (!z) {
            return true;
        }
        C85338a.GLOBAL.f248684n++;
        if (!xVar.f262009k ? !xVar.f262006h : !xVar.f262007i) {
            C85338a.BACKGROUND.f248684n++;
            String str = xVar.f262005g;
            if (str != null && (str.contains("default") || xVar.f262005g.contains("LauncherUI"))) {
                C85338a.LAUNCHER_BACKGROUND.f248684n++;
            }
        } else {
            C85338a.FOREGROUND.f248684n++;
        }
        Iterator it = ((ArrayList) C85338a.m105361a(xVar.f262005g)).iterator();
        while (it.hasNext()) {
            ((C85338a) it.next()).f248684n++;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m105353b(C91355x xVar, boolean z) {
        if (xVar.f262014p - xVar.f262015q <= 262144000) {
            return false;
        }
        if (!z) {
            return true;
        }
        C85338a.GLOBAL.f248679f++;
        if (!xVar.f262009k ? !xVar.f262006h : !xVar.f262007i) {
            C85338a.BACKGROUND.f248679f++;
            String str = xVar.f262005g;
            if (str != null && (str.contains("default") || xVar.f262005g.contains("LauncherUI"))) {
                C85338a.LAUNCHER_BACKGROUND.f248679f++;
            }
        } else {
            C85338a.FOREGROUND.f248679f++;
        }
        Iterator it = ((ArrayList) C85338a.m105361a(xVar.f262005g)).iterator();
        while (it.hasNext()) {
            ((C85338a) it.next()).f248679f++;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m105354c(C91355x xVar, boolean z) {
        if (xVar.f262012n <= 524288000) {
            return false;
        }
        if (!z) {
            return true;
        }
        C85338a.GLOBAL.f248680g++;
        if (!xVar.f262009k ? !xVar.f262006h : !xVar.f262007i) {
            C85338a.BACKGROUND.f248680g++;
            String str = xVar.f262005g;
            if (str != null && (str.contains("default") || xVar.f262005g.contains("LauncherUI"))) {
                C85338a.LAUNCHER_BACKGROUND.f248680g++;
            }
        } else {
            C85338a.FOREGROUND.f248680g++;
        }
        Iterator it = ((ArrayList) C85338a.m105361a(xVar.f262005g)).iterator();
        while (it.hasNext()) {
            ((C85338a) it.next()).f248680g++;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m105355d(C91355x xVar, boolean z) {
        if (xVar.f261988A <= 2097152) {
            return false;
        }
        if (!z) {
            return true;
        }
        C85338a.GLOBAL.f248683j++;
        if (!xVar.f262009k ? !xVar.f262006h : !xVar.f262007i) {
            C85338a.BACKGROUND.f248683j++;
            String str = xVar.f262005g;
            if (str != null && (str.contains("default") || xVar.f262005g.contains("LauncherUI"))) {
                C85338a.LAUNCHER_BACKGROUND.f248683j++;
            }
        } else {
            C85338a.FOREGROUND.f248683j++;
        }
        Iterator it = ((ArrayList) C85338a.m105361a(xVar.f262005g)).iterator();
        while (it.hasNext()) {
            ((C85338a) it.next()).f248683j++;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m105356e(C91355x xVar, boolean z) {
        if (xVar.f262023y <= 1024000) {
            return false;
        }
        if (!z) {
            return true;
        }
        C85338a.GLOBAL.f248682i++;
        if (!xVar.f262009k ? !xVar.f262006h : !xVar.f262007i) {
            C85338a.BACKGROUND.f248682i++;
            String str = xVar.f262005g;
            if (str != null && (str.contains("default") || xVar.f262005g.contains("LauncherUI"))) {
                C85338a.LAUNCHER_BACKGROUND.f248682i++;
            }
        } else {
            C85338a.FOREGROUND.f248682i++;
        }
        Iterator it = ((ArrayList) C85338a.m105361a(xVar.f262005g)).iterator();
        while (it.hasNext()) {
            ((C85338a) it.next()).f248682i++;
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m105357f(C91355x xVar, boolean z) {
        if (BuildInfo.IS_ARM64 || ((double) xVar.f262003e) <= 3879731.2d) {
            return false;
        }
        if (!z) {
            return true;
        }
        C85338a.GLOBAL.f248681h++;
        if (!xVar.f262009k ? !xVar.f262006h : !xVar.f262007i) {
            C85338a.BACKGROUND.f248681h++;
            String str = xVar.f262005g;
            if (str != null && (str.contains("default") || xVar.f262005g.contains("LauncherUI"))) {
                C85338a.LAUNCHER_BACKGROUND.f248681h++;
            }
        } else {
            C85338a.FOREGROUND.f248681h++;
        }
        Iterator it = ((ArrayList) C85338a.m105361a(xVar.f262005g)).iterator();
        while (it.hasNext()) {
            ((C85338a) it.next()).f248681h++;
        }
        return true;
    }

    /* renamed from: g */
    public static int m105358g(int i) {
        return i < 102400 ? BuildInfo.IS_ARM64 ? 42 : 2 : i < 204800 ? BuildInfo.IS_ARM64 ? 43 : 3 : i < 307200 ? BuildInfo.IS_ARM64 ? 44 : 4 : i < 409600 ? BuildInfo.IS_ARM64 ? 45 : 5 : i < 512000 ? BuildInfo.IS_ARM64 ? 46 : 6 : i < 614400 ? BuildInfo.IS_ARM64 ? 47 : 7 : i < 716800 ? BuildInfo.IS_ARM64 ? 48 : 8 : i < 819200 ? BuildInfo.IS_ARM64 ? 49 : 9 : i < 921600 ? BuildInfo.IS_ARM64 ? 50 : 10 : i < 1024000 ? BuildInfo.IS_ARM64 ? 51 : 11 : i < 1126400 ? BuildInfo.IS_ARM64 ? 52 : 12 : i < 1228800 ? BuildInfo.IS_ARM64 ? 53 : 13 : i < 1331200 ? BuildInfo.IS_ARM64 ? 54 : 14 : i < 1433600 ? BuildInfo.IS_ARM64 ? 55 : 15 : BuildInfo.IS_ARM64 ? 56 : 16;
    }

    /* renamed from: h */
    public static void m105359h(int i, long j, long j2, long j3, long j4, long j5, String str, int i2, long j6, long j7, long j8, long j9, String str2, String str3, String str4, String str5, long j15, String str6) {
        int i3 = 1;
        Log.m105919d("MicroMsg.MemoryWatchDog.Reporter", "report type:%s, java:%s, native:%s, vmSize:%s, totalPss:%s, sumPss:%s, extra:%s, soCount:%s, systemPss:%s, graphic:%s, backgroundDuration:%s, systemTotalMem:%s, amsTotalPss:%s, activity: %s", Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5), str, Integer.valueOf(i2), Long.valueOf(j6), Long.valueOf(j7), Long.valueOf(j8), Long.valueOf(j9), Long.valueOf(j15), str6);
        C117407d dVar = C117407d.INSTANCE;
        Object[] objArr = new Object[21];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = MMApplicationContext.getProcessName();
        objArr[2] = Long.valueOf(j);
        objArr[3] = Long.valueOf(j2);
        objArr[4] = Long.valueOf(j3);
        objArr[5] = Long.valueOf(j4);
        objArr[6] = Long.valueOf(j5);
        objArr[7] = str;
        objArr[8] = Integer.valueOf(i2);
        objArr[9] = Long.valueOf(j6);
        objArr[10] = Long.valueOf(j7);
        if (!BuildInfo.IS_ARM64) {
            i3 = 2;
        }
        objArr[11] = Integer.valueOf(i3);
        objArr[12] = Long.valueOf(j8);
        objArr[13] = Long.valueOf(j9);
        objArr[14] = str2;
        objArr[15] = str3;
        objArr[16] = str4;
        objArr[17] = str5;
        objArr[18] = Long.valueOf(j15);
        objArr[19] = str6;
        objArr[20] = BuildInfo.REV;
        dVar.mo160131h(20731, objArr);
    }

    /* renamed from: i */
    public static void m105360i(C91355x xVar, boolean z) {
        C91355x xVar2 = xVar;
        Log.m105919d("MicroMsg.MemoryWatchDog.Reporter", "reportPreloadProcessMemory: hasActivity = %s", Boolean.valueOf(z));
        int i = MMApplicationContext.isAppBrandProcess() ? 1462 : MMApplicationContext.isToolsProcess() ? 1463 : -1;
        if (i > 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new IDKey(i, 0, 1));
            arrayList.add(new IDKey(i, z ? 1 : 2, 1));
            long j = xVar2.f262014p - xVar2.f262015q;
            IDKey iDKey = new IDKey();
            iDKey.SetID(i);
            iDKey.SetValue(1);
            if (j < 52428800) {
                iDKey.SetKey(z ? 3 : 16);
            } else if (j < DownloadHelper.SAVE_LENGTH) {
                iDKey.SetKey(z ? 4 : 17);
            } else if (j < 209715200) {
                iDKey.SetKey(z ? 5 : 18);
            } else if (j < 314572800) {
                iDKey.SetKey(z ? 6 : 19);
            } else if (j < 419430400) {
                iDKey.SetKey(z ? 7 : 20);
            } else if (j < 524288000) {
                iDKey.SetKey(z ? 8 : 21);
            } else if (j < 629145600) {
                iDKey.SetKey(z ? 9 : 22);
            } else if (j < 734003200) {
                iDKey.SetKey(z ? 10 : 23);
            } else if (j < 838860800) {
                iDKey.SetKey(z ? 11 : 24);
            } else if (j < 943718400) {
                iDKey.SetKey(z ? 12 : 25);
            } else if (j < 1048576000) {
                iDKey.SetKey(z ? 13 : 26);
            } else {
                iDKey.SetKey(z ? 14 : 27);
            }
            arrayList.add(iDKey);
            long j2 = xVar2.f262012n;
            IDKey iDKey2 = new IDKey();
            iDKey2.SetID(i);
            iDKey2.SetValue(1);
            if (j2 < DownloadHelper.SAVE_LENGTH) {
                iDKey2.SetKey(z ? 55 : 69);
            } else if (j2 < 209715200) {
                iDKey2.SetKey(z ? 56 : 70);
            } else if (j2 < 314572800) {
                iDKey2.SetKey(z ? 57 : 71);
            } else if (j2 < 419430400) {
                iDKey2.SetKey(z ? 58 : 72);
            } else if (j2 < 524288000) {
                iDKey2.SetKey(z ? 59 : 73);
            } else if (j2 < 629145600) {
                iDKey2.SetKey(z ? 60 : 74);
            } else if (j2 < 734003200) {
                iDKey2.SetKey(z ? 61 : 75);
            } else if (j2 < 838860800) {
                iDKey2.SetKey(z ? 62 : 76);
            } else if (j2 < 943718400) {
                iDKey2.SetKey(z ? 63 : 77);
            } else if (j2 < 1048576000) {
                iDKey2.SetKey(z ? 64 : 78);
            } else {
                iDKey2.SetKey(z ? 65 : 79);
            }
            arrayList.add(iDKey2);
            if (!BuildInfo.IS_ARM64) {
                IDKey iDKey3 = new IDKey();
                iDKey3.SetID(i);
                iDKey3.SetValue(1);
                long j3 = (long) xVar2.f262003e;
                double d = (double) j3;
                if (d < 1572864.0d) {
                    iDKey3.SetKey(z ? 111 : 118);
                } else if (j3 < 2097152) {
                    iDKey3.SetKey(z ? 112 : 119);
                } else if (d < 2621440.0d) {
                    iDKey3.SetKey(z ? 113 : 120);
                } else if (j3 < 3145728) {
                    iDKey3.SetKey(z ? 114 : 121);
                } else if (d < 3670016.0d) {
                    iDKey3.SetKey(z ? 115 : 122);
                } else {
                    iDKey3.SetKey(z ? 116 : 123);
                }
                arrayList.add(iDKey3);
            }
            IDKey iDKey4 = new IDKey();
            iDKey4.SetID(i);
            iDKey4.SetValue(1);
            int i2 = xVar2.f262023y;
            if (i2 < 102400) {
                iDKey4.SetKey(z ? 139 : 153);
            } else if (i2 < 204800) {
                iDKey4.SetKey(z ? 140 : 154);
            } else if (i2 < 307200) {
                iDKey4.SetKey(z ? 141 : 155);
            } else if (i2 < 409600) {
                iDKey4.SetKey(z ? TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS : 156);
            } else if (i2 < 512000) {
                iDKey4.SetKey(z ? TPOptionalID.f349338xc9bdf6cd : 157);
            } else if (i2 < 614400) {
                iDKey4.SetKey(z ? 144 : 158);
            } else if (i2 < 716800) {
                iDKey4.SetKey(z ? 145 : 159);
            } else if (i2 < 819200) {
                iDKey4.SetKey(z ? 146 : 160);
            } else if (i2 < 921600) {
                iDKey4.SetKey(z ? 147 : 161);
            } else if (i2 < 1024000) {
                iDKey4.SetKey(z ? 148 : 162);
            } else {
                iDKey4.SetKey(z ? 149 : 163);
            }
            arrayList.add(iDKey4);
            C117407d.INSTANCE.mo160124a(arrayList, false);
        }
    }
}
