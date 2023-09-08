package nc0;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import eb0.C75592q0;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: nc0.a */
public class C76850a {

    /* renamed from: a */
    public static Map<String, C76851a> f224672a;

    /* renamed from: b */
    public static Map<String, String> f224673b;

    /* renamed from: c */
    public static String f224674c;

    /* renamed from: nc0.a$a */
    public static class C76851a {

        /* renamed from: a */
        public String f224675a;

        /* renamed from: b */
        public String f224676b;

        /* renamed from: c */
        public String f224677c;

        /* renamed from: d */
        public String f224678d;

        /* renamed from: e */
        public int f224679e;

        public C76851a(String str, String str2, String str3, String str4, int i) {
            this.f224675a = str;
            this.f224676b = str2;
            this.f224677c = str3;
            this.f224678d = str4;
            this.f224679e = i;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        if (r0.equals(f224674c) == false) goto L_0x000f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static nc0.C76850a.C76851a m92629a(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
        /*
            r2 = 0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()     // Catch:{ Exception -> 0x0015 }
            if (r0 == 0) goto L_0x000f
            java.lang.String r1 = f224674c     // Catch:{ Exception -> 0x0012 }
            boolean r1 = r0.equals(r1)     // Catch:{ Exception -> 0x0012 }
            if (r1 != 0) goto L_0x0017
        L_0x000f:
            f224672a = r2     // Catch:{ Exception -> 0x0012 }
            goto L_0x0017
        L_0x0012:
            r2 = r0
            goto L_0x0016
        L_0x0015:
        L_0x0016:
            r0 = r2
        L_0x0017:
            java.util.Map<java.lang.String, nc0.a$a> r2 = f224672a
            if (r2 == 0) goto L_0x001f
            java.util.Map<java.lang.String, java.lang.String> r2 = f224673b
            if (r2 != 0) goto L_0x0024
        L_0x001f:
            f224674c = r0
            m92634f(r4)
        L_0x0024:
            java.util.Map<java.lang.String, nc0.a$a> r2 = f224672a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = r3.toUpperCase()
            r4.append(r0)
            java.util.Map<java.lang.String, java.lang.String> r0 = f224673b
            java.lang.String r3 = r3.toUpperCase()
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.Object r2 = r2.get(r3)
            nc0.a$a r2 = (nc0.C76850a.C76851a) r2
            boolean r3 = com.tencent.p014mm.sdk.platformtools.WeChatSomeFeatureSwitch.onlyUSMobile()
            if (r3 == 0) goto L_0x0076
            java.lang.String r2 = "US"
            java.util.Map<java.lang.String, nc0.a$a> r3 = f224672a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = f224673b
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.Object r2 = r3.get(r2)
            nc0.a$a r2 = (nc0.C76850a.C76851a) r2
        L_0x0076:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: nc0.C76850a.m92629a(android.content.Context, java.lang.String, java.lang.String):nc0.a$a");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        if (r0.equals(f224674c) == false) goto L_0x000f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<nc0.C76850a.C76851a> m92630b(android.content.Context r2, java.lang.String r3) {
        /*
            r2 = 0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()     // Catch:{ Exception -> 0x0015 }
            if (r0 == 0) goto L_0x000f
            java.lang.String r1 = f224674c     // Catch:{ Exception -> 0x0012 }
            boolean r1 = r0.equals(r1)     // Catch:{ Exception -> 0x0012 }
            if (r1 != 0) goto L_0x0017
        L_0x000f:
            f224672a = r2     // Catch:{ Exception -> 0x0012 }
            goto L_0x0017
        L_0x0012:
            r2 = r0
            goto L_0x0016
        L_0x0015:
        L_0x0016:
            r0 = r2
        L_0x0017:
            java.util.Map<java.lang.String, nc0.a$a> r2 = f224672a
            if (r2 != 0) goto L_0x0020
            f224674c = r0
            m92634f(r3)
        L_0x0020:
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.Map<java.lang.String, nc0.a$a> r3 = f224672a
            java.util.Collection r3 = r3.values()
            r2.<init>(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: nc0.C76850a.m92630b(android.content.Context, java.lang.String):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        if (r0.equals(f224674c) == false) goto L_0x000f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0030  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m92631c(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
        /*
            r2 = 0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()     // Catch:{ Exception -> 0x0015 }
            if (r0 == 0) goto L_0x000f
            java.lang.String r1 = f224674c     // Catch:{ Exception -> 0x0012 }
            boolean r1 = r0.equals(r1)     // Catch:{ Exception -> 0x0012 }
            if (r1 != 0) goto L_0x0017
        L_0x000f:
            f224672a = r2     // Catch:{ Exception -> 0x0012 }
            goto L_0x0017
        L_0x0012:
            r2 = r0
            goto L_0x0016
        L_0x0015:
        L_0x0016:
            r0 = r2
        L_0x0017:
            java.util.Map<java.lang.String, nc0.a$a> r2 = f224672a
            if (r2 != 0) goto L_0x0020
            f224674c = r0
            m92634f(r4)
        L_0x0020:
            java.util.Map<java.lang.String, nc0.a$a> r2 = f224672a
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x002a:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0041
            java.lang.Object r4 = r2.next()
            nc0.a$a r4 = (nc0.C76850a.C76851a) r4
            java.lang.String r0 = r4.f224676b
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x002a
            java.lang.String r2 = r4.f224677c
            return r2
        L_0x0041:
            java.lang.String r2 = ""
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: nc0.C76850a.m92631c(android.content.Context, java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: d */
    public static String m92632d(String str) {
        return (str.startsWith("+886") || str.startsWith("+86")) ? "zh-TW" : (str.startsWith("+852") || str.startsWith("+853")) ? "zh-HK" : str.startsWith("+81") ? LocaleUtil.JAPANESE : str.startsWith("+82") ? LocaleUtil.KOREAN : str.startsWith("+66") ? LocaleUtil.THAI : str.startsWith("+84") ? LocaleUtil.VIETNAMESE : str.startsWith("+62") ? "id" : str.startsWith("+55") ? LocaleUtil.PORTUGUESE : str.startsWith("+34") ? "es-419" : "en";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        if (r0.equals(f224674c) == false) goto L_0x000f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0030  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m92633e(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
        /*
            r2 = 0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()     // Catch:{ Exception -> 0x0015 }
            if (r0 == 0) goto L_0x000f
            java.lang.String r1 = f224674c     // Catch:{ Exception -> 0x0012 }
            boolean r1 = r0.equals(r1)     // Catch:{ Exception -> 0x0012 }
            if (r1 != 0) goto L_0x0017
        L_0x000f:
            f224672a = r2     // Catch:{ Exception -> 0x0012 }
            goto L_0x0017
        L_0x0012:
            r2 = r0
            goto L_0x0016
        L_0x0015:
        L_0x0016:
            r0 = r2
        L_0x0017:
            java.util.Map<java.lang.String, nc0.a$a> r2 = f224672a
            if (r2 != 0) goto L_0x0020
            f224674c = r0
            m92634f(r4)
        L_0x0020:
            java.util.Map<java.lang.String, nc0.a$a> r2 = f224672a
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x002a:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0041
            java.lang.Object r4 = r2.next()
            nc0.a$a r4 = (nc0.C76850a.C76851a) r4
            java.lang.String r0 = r4.f224676b
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x002a
            java.lang.String r2 = r4.f224675a
            return r2
        L_0x0041:
            java.lang.String r2 = ""
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: nc0.C76850a.m92633e(android.content.Context, java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bc  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m92634f(java.lang.String r16) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            f224672a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            f224673b = r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r16)
            java.lang.String r0 = r0.trim()
            java.lang.String r1 = ","
            java.lang.String[] r1 = r0.split(r1)
            r2 = 0
            r3 = 0
        L_0x001e:
            int r0 = r1.length
            if (r3 >= r0) goto L_0x03ad
            r0 = r1[r3]
            java.lang.String r0 = r0.trim()
            java.lang.String r4 = ":"
            java.lang.String[] r0 = r0.split(r4)
            int r4 = r0.length
            r5 = 4
            r6 = 1
            if (r4 >= r5) goto L_0x0046
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r4 = r1[r3]
            java.lang.String r4 = r4.trim()
            r0[r2] = r4
            java.lang.String r4 = "MicroMsg.InternationaPluginlLogic"
            java.lang.String r5 = "this country item has problem %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r5, r0)
            goto L_0x03a9
        L_0x0046:
            com.tencent.mm.storage.RegionCodeDecoder r4 = com.tencent.p014mm.storage.RegionCodeDecoder.m124563k()
            r7 = r0[r2]
            java.lang.String r4 = r4.mo135576l(r7)
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            r8 = 2
            if (r7 == 0) goto L_0x0059
            r4 = r0[r8]
        L_0x0059:
            r12 = r4
            boolean r4 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.isTraditionalChineseAppLang()
            r7 = 3
            if (r4 != 0) goto L_0x0073
            nc0.a$a r4 = new nc0.a$a
            r10 = r0[r2]
            r11 = r0[r6]
            r13 = r0[r7]
            char r14 = r13.charAt(r2)
            r9 = r4
            r9.<init>(r10, r11, r12, r13, r14)
            goto L_0x0388
        L_0x0073:
            nc0.a$a r4 = new nc0.a$a
            r10 = r0[r2]
            r11 = r0[r6]
            r13 = r0[r7]
            java.lang.String r9 = "Big5Util"
            if (r12 == 0) goto L_0x037e
            int r0 = r12.length()
            if (r0 > 0) goto L_0x0087
            goto L_0x037e
        L_0x0087:
            java.lang.String r0 = "big5"
            byte[] r0 = r12.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x036d }
            if (r0 == 0) goto L_0x00a9
            int r14 = r0.length     // Catch:{ UnsupportedEncodingException -> 0x036d }
            if (r14 >= r8) goto L_0x0093
            goto L_0x00a9
        L_0x0093:
            r14 = 0
            r15 = 0
        L_0x0095:
            if (r14 >= r8) goto L_0x00a4
            int r15 = r15 << 8
            short r15 = (short) r15     // Catch:{ UnsupportedEncodingException -> 0x036d }
            byte r5 = r0[r14]     // Catch:{ UnsupportedEncodingException -> 0x036d }
            r5 = r5 & 255(0xff, float:3.57E-43)
            r5 = r5 | r15
            short r15 = (short) r5     // Catch:{ UnsupportedEncodingException -> 0x036d }
            int r14 = r14 + 1
            r5 = 4
            goto L_0x0095
        L_0x00a4:
            r0 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r15
            goto L_0x00af
        L_0x00a9:
            java.lang.String r0 = "byteToShort"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)     // Catch:{ UnsupportedEncodingException -> 0x036d }
            r0 = 0
        L_0x00af:
            r5 = 42048(0xa440, float:5.8922E-41)
            if (r0 < r5) goto L_0x00bc
            r5 = 42049(0xa441, float:5.8923E-41)
            if (r0 > r5) goto L_0x00bc
            r5 = 1
            goto L_0x037c
        L_0x00bc:
            r5 = 42050(0xa442, float:5.8925E-41)
            if (r0 < r5) goto L_0x00c6
            r5 = 42067(0xa453, float:5.8948E-41)
            if (r0 <= r5) goto L_0x00d0
        L_0x00c6:
            r5 = 51520(0xc940, float:7.2195E-41)
            if (r0 < r5) goto L_0x00d3
            r5 = 51524(0xc944, float:7.22E-41)
            if (r0 > r5) goto L_0x00d3
        L_0x00d0:
            r5 = 2
            goto L_0x037c
        L_0x00d3:
            r5 = 42068(0xa454, float:5.895E-41)
            if (r0 < r5) goto L_0x00dd
            r5 = 42110(0xa47e, float:5.9009E-41)
            if (r0 <= r5) goto L_0x00e7
        L_0x00dd:
            r5 = 51525(0xc945, float:7.2202E-41)
            if (r0 < r5) goto L_0x00ea
            r5 = 51532(0xc94c, float:7.2212E-41)
            if (r0 > r5) goto L_0x00ea
        L_0x00e7:
            r5 = 3
            goto L_0x037c
        L_0x00ea:
            r5 = 42145(0xa4a1, float:5.9058E-41)
            if (r0 < r5) goto L_0x00f4
            r5 = 42237(0xa4fd, float:5.9187E-41)
            if (r0 <= r5) goto L_0x00fe
        L_0x00f4:
            r5 = 51533(0xc94d, float:7.2213E-41)
            if (r0 < r5) goto L_0x0101
            r5 = 51548(0xc95c, float:7.2234E-41)
            if (r0 > r5) goto L_0x0101
        L_0x00fe:
            r5 = 4
            goto L_0x037c
        L_0x0101:
            r5 = 42238(0xa4fe, float:5.9188E-41)
            if (r0 < r5) goto L_0x010b
            r5 = 42463(0xa5df, float:5.9503E-41)
            if (r0 <= r5) goto L_0x0115
        L_0x010b:
            r5 = 51549(0xc95d, float:7.2236E-41)
            if (r0 < r5) goto L_0x0118
            r5 = 51626(0xc9aa, float:7.2343E-41)
            if (r0 > r5) goto L_0x0118
        L_0x0115:
            r5 = 5
            goto L_0x037c
        L_0x0118:
            r5 = 42464(0xa5e0, float:5.9505E-41)
            if (r0 < r5) goto L_0x0122
            r5 = 42729(0xa6e9, float:5.9876E-41)
            if (r0 <= r5) goto L_0x012c
        L_0x0122:
            r5 = 51627(0xc9ab, float:7.2345E-41)
            if (r0 < r5) goto L_0x012f
            r5 = 51545(0xc959, float:7.223E-41)
            if (r0 > r5) goto L_0x012f
        L_0x012c:
            r5 = 6
            goto L_0x037c
        L_0x012f:
            r5 = 42730(0xa6ea, float:5.9877E-41)
            if (r0 < r5) goto L_0x0139
            r5 = 43202(0xa8c2, float:6.0539E-41)
            if (r0 <= r5) goto L_0x0143
        L_0x0139:
            r5 = 51802(0xca5a, float:7.259E-41)
            if (r0 < r5) goto L_0x0146
            r5 = 52144(0xcbb0, float:7.307E-41)
            if (r0 > r5) goto L_0x0146
        L_0x0143:
            r5 = 7
            goto L_0x037c
        L_0x0146:
            r5 = 43203(0xa8c3, float:6.054E-41)
            if (r0 < r5) goto L_0x0150
            r5 = 43844(0xab44, float:6.1439E-41)
            if (r0 <= r5) goto L_0x015a
        L_0x0150:
            r5 = 52145(0xcbb1, float:7.3071E-41)
            if (r0 < r5) goto L_0x015e
            r5 = 52700(0xcddc, float:7.3848E-41)
            if (r0 > r5) goto L_0x015e
        L_0x015a:
            r5 = 8
            goto L_0x037c
        L_0x015e:
            r5 = 43845(0xab45, float:6.144E-41)
            if (r0 < r5) goto L_0x0168
            r5 = 44475(0xadbb, float:6.2323E-41)
            if (r0 <= r5) goto L_0x0177
        L_0x0168:
            r5 = 52701(0xcddd, float:7.385E-41)
            if (r0 < r5) goto L_0x0172
            r5 = 53447(0xd0c7, float:7.4895E-41)
            if (r0 <= r5) goto L_0x0177
        L_0x0172:
            r5 = 63962(0xf9da, float:8.963E-41)
            if (r0 != r5) goto L_0x017b
        L_0x0177:
            r5 = 9
            goto L_0x037c
        L_0x017b:
            r5 = 44476(0xadbc, float:6.2324E-41)
            if (r0 < r5) goto L_0x0185
            r5 = 45229(0xb0ad, float:6.338E-41)
            if (r0 <= r5) goto L_0x018f
        L_0x0185:
            r5 = 53448(0xd0c8, float:7.4897E-41)
            if (r0 < r5) goto L_0x0193
            r5 = 54346(0xd44a, float:7.6155E-41)
            if (r0 > r5) goto L_0x0193
        L_0x018f:
            r5 = 10
            goto L_0x037c
        L_0x0193:
            r5 = 45230(0xb0ae, float:6.3381E-41)
            if (r0 < r5) goto L_0x019d
            r5 = 46018(0xb3c2, float:6.4485E-41)
            if (r0 <= r5) goto L_0x01a7
        L_0x019d:
            r5 = 54347(0xd44b, float:7.6156E-41)
            if (r0 < r5) goto L_0x01ab
            r5 = 55376(0xd850, float:7.7598E-41)
            if (r0 > r5) goto L_0x01ab
        L_0x01a7:
            r5 = 11
            goto L_0x037c
        L_0x01ab:
            r5 = 46019(0xb3c3, float:6.4486E-41)
            if (r0 < r5) goto L_0x01b5
            r5 = 46787(0xb6c3, float:6.5563E-41)
            if (r0 <= r5) goto L_0x01c4
        L_0x01b5:
            r5 = 55377(0xd851, float:7.76E-41)
            if (r0 < r5) goto L_0x01bf
            r5 = 56496(0xdcb0, float:7.9168E-41)
            if (r0 <= r5) goto L_0x01c4
        L_0x01bf:
            r5 = 63963(0xf9db, float:8.9631E-41)
            if (r0 != r5) goto L_0x01c8
        L_0x01c4:
            r5 = 12
            goto L_0x037c
        L_0x01c8:
            r5 = 46788(0xb6c4, float:6.5564E-41)
            if (r0 < r5) goto L_0x01d2
            r5 = 47531(0xb9ab, float:6.6605E-41)
            if (r0 <= r5) goto L_0x01e6
        L_0x01d2:
            r5 = 56497(0xdcb1, float:7.9169E-41)
            if (r0 < r5) goto L_0x01dc
            r5 = 57583(0xe0ef, float:8.0691E-41)
            if (r0 <= r5) goto L_0x01e6
        L_0x01dc:
            r5 = 63958(0xf9d6, float:8.9624E-41)
            if (r0 < r5) goto L_0x01ea
            r5 = 63960(0xf9d8, float:8.9627E-41)
            if (r0 > r5) goto L_0x01ea
        L_0x01e6:
            r5 = 13
            goto L_0x037c
        L_0x01ea:
            r5 = 47532(0xb9ac, float:6.6607E-41)
            if (r0 < r5) goto L_0x01f4
            r5 = 48116(0xbbf4, float:6.7425E-41)
            if (r0 <= r5) goto L_0x01fe
        L_0x01f4:
            r5 = 57584(0xe0f0, float:8.0692E-41)
            if (r0 < r5) goto L_0x0202
            r5 = 58597(0xe4e5, float:8.2112E-41)
            if (r0 > r5) goto L_0x0202
        L_0x01fe:
            r5 = 14
            goto L_0x037c
        L_0x0202:
            r5 = 48117(0xbbf5, float:6.7426E-41)
            if (r0 < r5) goto L_0x020c
            r5 = 48806(0xbea6, float:6.8392E-41)
            if (r0 <= r5) goto L_0x021b
        L_0x020c:
            r5 = 58598(0xe4e6, float:8.2113E-41)
            if (r0 < r5) goto L_0x0216
            r5 = 59635(0xe8f3, float:8.3566E-41)
            if (r0 <= r5) goto L_0x021b
        L_0x0216:
            r5 = 63964(0xf9dc, float:8.9633E-41)
            if (r0 != r5) goto L_0x021f
        L_0x021b:
            r5 = 15
            goto L_0x037c
        L_0x021f:
            r5 = 48807(0xbea7, float:6.8393E-41)
            if (r0 < r5) goto L_0x0229
            r5 = 49268(0xc074, float:6.9039E-41)
            if (r0 <= r5) goto L_0x0238
        L_0x0229:
            r5 = 59636(0xe8f4, float:8.3568E-41)
            if (r0 < r5) goto L_0x0233
            r5 = 60600(0xecb8, float:8.4919E-41)
            if (r0 <= r5) goto L_0x0238
        L_0x0233:
            r5 = 63961(0xf9d9, float:8.9628E-41)
            if (r0 != r5) goto L_0x023c
        L_0x0238:
            r5 = 16
            goto L_0x037c
        L_0x023c:
            r5 = 49269(0xc075, float:6.904E-41)
            if (r0 < r5) goto L_0x0246
            r5 = 49742(0xc24e, float:6.9703E-41)
            if (r0 <= r5) goto L_0x0250
        L_0x0246:
            r5 = 60601(0xecb9, float:8.492E-41)
            if (r0 < r5) goto L_0x0254
            r5 = 61366(0xefb6, float:8.5992E-41)
            if (r0 > r5) goto L_0x0254
        L_0x0250:
            r5 = 17
            goto L_0x037c
        L_0x0254:
            r5 = 49743(0xc24f, float:6.9705E-41)
            if (r0 < r5) goto L_0x025e
            r5 = 50014(0xc35e, float:7.0085E-41)
            if (r0 <= r5) goto L_0x0268
        L_0x025e:
            r5 = 61367(0xefb7, float:8.5993E-41)
            if (r0 < r5) goto L_0x026c
            r5 = 61930(0xf1ea, float:8.6782E-41)
            if (r0 > r5) goto L_0x026c
        L_0x0268:
            r5 = 18
            goto L_0x037c
        L_0x026c:
            r5 = 50015(0xc35f, float:7.0086E-41)
            if (r0 < r5) goto L_0x0276
            r5 = 50260(0xc454, float:7.0429E-41)
            if (r0 <= r5) goto L_0x0280
        L_0x0276:
            r5 = 61931(0xf1eb, float:8.6784E-41)
            if (r0 < r5) goto L_0x0284
            r5 = 62460(0xf3fc, float:8.7525E-41)
            if (r0 > r5) goto L_0x0284
        L_0x0280:
            r5 = 19
            goto L_0x037c
        L_0x0284:
            r5 = 50261(0xc455, float:7.043E-41)
            if (r0 < r5) goto L_0x028e
            r5 = 50390(0xc4d6, float:7.0611E-41)
            if (r0 <= r5) goto L_0x0298
        L_0x028e:
            r5 = 62461(0xf3fd, float:8.7527E-41)
            if (r0 < r5) goto L_0x029c
            r5 = 62911(0xf5bf, float:8.8157E-41)
            if (r0 > r5) goto L_0x029c
        L_0x0298:
            r5 = 20
            goto L_0x037c
        L_0x029c:
            r5 = 50135(0xc3d7, float:7.0254E-41)
            if (r0 < r5) goto L_0x02a6
            r5 = 50538(0xc56a, float:7.0819E-41)
            if (r0 <= r5) goto L_0x02b0
        L_0x02a6:
            r5 = 62912(0xf5c0, float:8.8158E-41)
            if (r0 < r5) goto L_0x02b4
            r5 = 63189(0xf6d5, float:8.8547E-41)
            if (r0 > r5) goto L_0x02b4
        L_0x02b0:
            r5 = 21
            goto L_0x037c
        L_0x02b4:
            r5 = 50539(0xc56b, float:7.082E-41)
            if (r0 < r5) goto L_0x02be
            r5 = 50631(0xc5c7, float:7.0949E-41)
            if (r0 <= r5) goto L_0x02c8
        L_0x02be:
            r5 = 63190(0xf6d6, float:8.8548E-41)
            if (r0 < r5) goto L_0x02cc
            r6 = 63439(0xf7cf, float:8.8897E-41)
            if (r0 > r6) goto L_0x02cc
        L_0x02c8:
            r5 = 22
            goto L_0x037c
        L_0x02cc:
            r6 = 50632(0xc5c8, float:7.095E-41)
            if (r0 < r6) goto L_0x02d6
            r6 = 50672(0xc5f0, float:7.1007E-41)
            if (r0 <= r6) goto L_0x02e0
        L_0x02d6:
            r6 = 63440(0xf7d0, float:8.8898E-41)
            if (r0 < r6) goto L_0x02e4
            r6 = 63652(0xf8a4, float:8.9195E-41)
            if (r0 > r6) goto L_0x02e4
        L_0x02e0:
            r5 = 23
            goto L_0x037c
        L_0x02e4:
            r6 = 50673(0xc5f1, float:7.1008E-41)
            if (r0 < r6) goto L_0x02ee
            r6 = 50772(0xc654, float:7.1147E-41)
            if (r0 <= r6) goto L_0x02f8
        L_0x02ee:
            r6 = 63653(0xf8a5, float:8.9197E-41)
            if (r0 < r6) goto L_0x02fc
            r6 = 63725(0xf8ed, float:8.9298E-41)
            if (r0 > r6) goto L_0x02fc
        L_0x02f8:
            r5 = 24
            goto L_0x037c
        L_0x02fc:
            r6 = 50773(0xc655, float:7.1148E-41)
            if (r0 < r6) goto L_0x0306
            r6 = 50788(0xc664, float:7.1169E-41)
            if (r0 <= r6) goto L_0x0310
        L_0x0306:
            r6 = 63721(0xf8e9, float:8.9292E-41)
            if (r0 < r6) goto L_0x0314
            r6 = 63850(0xf96a, float:8.9473E-41)
            if (r0 > r6) goto L_0x0314
        L_0x0310:
            r5 = 25
            goto L_0x037c
        L_0x0314:
            r6 = 50789(0xc665, float:7.117E-41)
            if (r0 < r6) goto L_0x031e
            r6 = 50795(0xc66b, float:7.1179E-41)
            if (r0 <= r6) goto L_0x0328
        L_0x031e:
            r6 = 63906(0xf9a2, float:8.9551E-41)
            if (r0 < r6) goto L_0x032b
            r6 = 63905(0xf9a1, float:8.955E-41)
            if (r0 > r6) goto L_0x032b
        L_0x0328:
            r5 = 26
            goto L_0x037c
        L_0x032b:
            r6 = 50796(0xc66c, float:7.118E-41)
            if (r0 < r6) goto L_0x0335
            r6 = 50805(0xc675, float:7.1193E-41)
            if (r0 <= r6) goto L_0x033c
        L_0x0335:
            if (r0 < r5) goto L_0x033f
            r5 = 63929(0xf9b9, float:8.9584E-41)
            if (r0 > r5) goto L_0x033f
        L_0x033c:
            r5 = 27
            goto L_0x037c
        L_0x033f:
            r5 = 50806(0xc676, float:7.1194E-41)
            if (r0 < r5) goto L_0x0349
            r5 = 50810(0xc67a, float:7.12E-41)
            if (r0 <= r5) goto L_0x0353
        L_0x0349:
            r5 = 63930(0xf9ba, float:8.9585E-41)
            if (r0 < r5) goto L_0x0356
            r5 = 63941(0xf9c5, float:8.96E-41)
            if (r0 > r5) goto L_0x0356
        L_0x0353:
            r5 = 28
            goto L_0x037c
        L_0x0356:
            r5 = 50811(0xc67b, float:7.1201E-41)
            if (r0 < r5) goto L_0x0360
            r5 = 50814(0xc67e, float:7.1206E-41)
            if (r0 <= r5) goto L_0x036a
        L_0x0360:
            r5 = 63942(0xf9c6, float:8.9602E-41)
            if (r0 < r5) goto L_0x037b
            r5 = 63957(0xf9d5, float:8.9623E-41)
            if (r0 > r5) goto L_0x037b
        L_0x036a:
            r5 = 29
            goto L_0x037c
        L_0x036d:
            r0 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r6]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r5[r2] = r0
            java.lang.String r0 = "exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r0, r5)
        L_0x037b:
            r5 = 0
        L_0x037c:
            r14 = r5
            goto L_0x0384
        L_0x037e:
            java.lang.String r0 = "getStrokesCount buffer is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
            r14 = 0
        L_0x0384:
            r9 = r4
            r9.<init>(r10, r11, r12, r13, r14)
        L_0x0388:
            java.util.Map<java.lang.String, nc0.a$a> r0 = f224672a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r4.f224675a
            r5.append(r6)
            java.lang.String r6 = r4.f224676b
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r0.put(r5, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = f224673b
            java.lang.String r5 = r4.f224675a
            java.lang.String r4 = r4.f224676b
            r0.put(r5, r4)
        L_0x03a9:
            int r3 = r3 + 1
            goto L_0x001e
        L_0x03ad:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.WeChatSomeFeatureSwitch.onlyUSMobile()
            if (r0 == 0) goto L_0x03d5
            java.util.Map<java.lang.String, nc0.a$a> r0 = f224672a
            java.lang.String r1 = "US1"
            java.lang.Object r0 = r0.get(r1)
            nc0.a$a r0 = (nc0.C76850a.C76851a) r0
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            f224672a = r2
            r2.put(r1, r0)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            f224673b = r1
            java.lang.String r2 = r0.f224675a
            java.lang.String r0 = r0.f224676b
            r1.put(r2, r0)
        L_0x03d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nc0.C76850a.m92634f(java.lang.String):void");
    }

    /* renamed from: g */
    public static boolean m92635g(String str) {
        return str != null && str.length() > 1 && str.startsWith("+") && !str.startsWith("+86");
    }

    /* renamed from: h */
    public static boolean m92636h() {
        return m92642n() && WeChatBrands.AppInfo.current().isMainland();
    }

    /* renamed from: i */
    public static boolean m92637i() {
        return C75592q0.m90776f() != 0 || !m92642n();
    }

    /* renamed from: j */
    public static boolean m92638j(String str) {
        return !Util.isNullOrNil(str) && new HashSet(Arrays.asList("43,32,359,357,420,385,45,372,358,33,49,30,36,353,39,371,40,370,352,356,31,48,351,421,386,34,46,44,354,423,47,41,90".split(","))).contains(str);
    }

    /* renamed from: k */
    public static boolean m92639k(String str) {
        return !Util.isNullOrNil(str) && new HashSet(Arrays.asList("AT,BE,BG,CY,CZ,HR,DK,EE,FI,FR,DE,GR,HU,IE,IT,LV,RO,LT,LU,MT,NL,PL,PT,SK,SI,ES,SE,GB,IS,LI,NO,CH,TR".split(","))).contains(str.toUpperCase());
    }

    /* renamed from: l */
    public static boolean m92640l() {
        return !LocaleUtil.isChineseAppLang() && !LocaleUtil.getApplicationLanguage().equals("en");
    }

    /* renamed from: m */
    public static boolean m92641m() {
        if (!LocaleUtil.getApplicationLanguage().equals("zh_CN")) {
            return true;
        }
        return TimeZone.getDefault().getRawOffset() != TimeZone.getTimeZone("GMT+08:00").getRawOffset();
    }

    /* renamed from: n */
    public static boolean m92642n() {
        return Util.isOverseasUser(MMApplicationContext.getContext());
    }
}
