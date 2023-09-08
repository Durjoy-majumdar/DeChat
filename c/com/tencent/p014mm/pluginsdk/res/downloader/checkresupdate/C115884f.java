package com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate;

import com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.C115890j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Locale;
import java.util.Map;
import te3.C118473ut3;
import te3.C52019xt3;
import te3.C90448yt3;

/* renamed from: com.tencent.mm.pluginsdk.res.downloader.checkresupdate.f */
public final class C115884f {
    /* renamed from: a */
    public static boolean m162996a(String str, Map<String, String> map) {
        if (map.get(str) != null) {
            return false;
        }
        if (map.get(str + ".resType") != null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".subType");
        return map.get(sb.toString()) == null;
    }

    /* renamed from: b */
    public static boolean m162997b(String str, String str2, Map<String, String> map, boolean z) {
        String format = String.format("%s.%s.%s", new Object[]{str, str2, "Resource"});
        int a = C115890j.C30692a.m39153a(str2);
        if (m162996a(format, map)) {
            return true;
        }
        boolean d = m162999d(a, format, map, z) | false;
        int i = 0;
        while (true) {
            i++;
            String format2 = String.format(Locale.US, "%s.%s.%s%d", new Object[]{str, str2, "Resource", Integer.valueOf(i)});
            if (m162996a(format2, map)) {
                return d;
            }
            d |= m162999d(a, format2, map, z);
        }
    }

    /* renamed from: c */
    public static void m162998c(String str, String str2, Map<String, String> map, boolean z) {
        boolean z2 = false;
        if (!m162996a(String.format("%s.%s", new Object[]{str, str2}), map)) {
            boolean b = m162997b(str, str2, map, z) | false;
            int i = 0;
            while (true) {
                i++;
                if (m162996a(String.format(Locale.US, "%s.%s%d", new Object[]{str, str2, Integer.valueOf(i)}), map)) {
                    break;
                }
                b |= m162997b(str, str2, map, z);
            }
            int a = C115890j.C30692a.m39153a(str2);
            if ((a & 1) > 0) {
                C115891k.m163010a(0, 32);
                if (!b) {
                    C115891k.m163010a(0, 33);
                    return;
                }
                return;
            }
            if ((a & 2) > 0) {
                C115891k.m163010a(0, 35);
                if (!b) {
                    C115891k.m163010a(0, 36);
                    return;
                }
                return;
            }
            if ((a & 4) > 0) {
                z2 = true;
            }
            if (z2) {
                C115891k.m163010a(0, 38);
                if (!b) {
                    C115891k.m163010a(0, 39);
                }
            }
        }
    }

    /* renamed from: d */
    public static boolean m162999d(int i, String str, Map<String, String> map, boolean z) {
        String str2 = str;
        Map<String, String> map2 = map;
        if (map2.get(str2 + ".resType") == null) {
            if (map2.get(str2 + ".subType") == null) {
                return true;
            }
        }
        if ((i & 4) > 0) {
            Log.m105918d("MicroMsg.CheckResUpdateNewXmlParser", "handleResourceDelete()");
            int i2 = Util.getInt(map2.get(str2 + ".resType"), -1);
            int i3 = Util.getInt(map2.get(str2 + ".subType"), -1);
            if (-1 == i2 || -1 == i3) {
                return false;
            }
            C118473ut3 ut32 = new C118473ut3();
            ut32.f354482d = i3;
            C90448yt3 yt32 = new C90448yt3();
            ut32.f354483e = yt32;
            yt32.f259944e = Util.getInt(map2.get(str2 + ".resVer"), 0);
            ut32.f354487i = map2.get(str2 + ".sampleID");
            ut32.f354486h = Util.getInt(map2.get(str2 + ".reportID"), 0);
            ut32.f354485g = 4;
            CheckResUpdateHelper.m162971c().mo176406g(i2, ut32, true);
            C115891k.m163010a((long) ut32.f354486h, 40);
            return true;
        }
        if ((i & 1) > 0) {
            Log.m105918d("MicroMsg.CheckResUpdateNewXmlParser", "handleResourceCache()");
            String str3 = map2.get(str2 + ".CDNUrl");
            int i4 = Util.getInt(map2.get(str2 + ".subType"), -1);
            int i5 = Util.getInt(map2.get(str2 + ".resType"), -1);
            String str4 = map2.get(str2 + ".md5");
            int i6 = Util.getInt(map2.get(str2 + ".priority"), 0);
            if (Util.isNullOrNil(str3) || Util.isNullOrNil(str4) || -1 == i4 || -1 == i5 || i6 < 0) {
                return false;
            }
            C118473ut3 ut33 = new C118473ut3();
            ut33.f354483e = new C90448yt3();
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(".fileEncrypt");
            int i7 = Util.getInt(map2.get(sb.toString()), 0) > 0 ? 1 : 0;
            if (Util.getInt(map2.get(str2 + ".fileCompress"), 0) > 0) {
                i7 |= 2;
            }
            ut33.f354482d = i4;
            ut33.f354491p = Util.getInt(map2.get(str2 + ".networkType"), 2);
            ut33.f354488j = Util.getInt(map2.get(str2 + ".expireTime"), 1);
            C90448yt3 yt33 = ut33.f354483e;
            yt33.f259945f = str3;
            yt33.f259944e = Util.getInt(map2.get(str2 + ".resVer"), 0);
            C90448yt3 yt34 = ut33.f354483e;
            yt34.f259943d = str4;
            yt34.f259949j = map2.get(str2 + ".originalmd5");
            C90448yt3 yt35 = ut33.f354483e;
            yt35.f259946g = i7;
            yt35.f259947h = null;
            yt35.f259948i = null;
            ut33.f354493r = i6;
            ut33.f354485g = 1;
            ut33.f354486h = Util.getInt(map2.get(str2 + ".reportID"), 0);
            ut33.f354487i = map2.get(str2 + ".sampleID");
            ut33.f354489n = Util.getInt(map2.get(str2 + ".retryTime"), 3);
            ut33.f354492q = Util.getInt(map2.get(str2 + ".retryInterval"), 0);
            ut33.f354490o = 0;
            CheckResUpdateHelper.m162971c().mo176404e(i5, ut33, true);
            C115891k.m163010a((long) ut33.f354486h, 34);
            return true;
        }
        if (!((i & 2) > 0)) {
            return false;
        }
        Log.m105918d("MicroMsg.CheckResUpdateNewXmlParser", "handleResourceDecrypt()");
        int i8 = Util.getInt(map2.get(str2 + ".resType"), -1);
        int i9 = Util.getInt(map2.get(str2 + ".subType"), -1);
        if (-1 == i8 || -1 == i9) {
            return false;
        }
        C118473ut3 ut34 = new C118473ut3();
        C52019xt3 xt32 = new C52019xt3();
        ut34.f354484f = xt32;
        ut34.f354482d = i9;
        xt32.f144962e = map2.get(str2 + ".resKey");
        C52019xt3 xt33 = ut34.f354484f;
        xt33.f144961d = Util.getInt(map2.get(str2 + ".resKeyVersion"), 0);
        ut34.f354487i = map2.get(str2 + ".sampleID");
        ut34.f354486h = Util.getInt(map2.get(str2 + ".reportID"), 0);
        ut34.f354485g = 2;
        C90448yt3 yt36 = new C90448yt3();
        ut34.f354483e = yt36;
        yt36.f259949j = map2.get(str2 + ".originalmd5");
        CheckResUpdateHelper.m162971c().mo176405f(i8, ut34, true, z ^ true);
        C115891k.m163010a((long) ut34.f354486h, 37);
        return true;
    }
}
