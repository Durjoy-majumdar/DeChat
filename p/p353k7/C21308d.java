package p353k7;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import com.tencent.tmassistantsdk.downloadservice.Downloads;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import p333e8.C20551y;

/* renamed from: k7.d */
public final class C21308d {

    /* renamed from: a */
    public static final C21303a f60207a = new C21303a("OMX.google.raw.decoder", (String) null, (MediaCodecInfo.CodecCapabilities) null, false, false);

    /* renamed from: b */
    public static final Pattern f60208b = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: c */
    public static final HashMap<C21310b, List<C21303a>> f60209c = new HashMap<>();

    /* renamed from: d */
    public static final SparseIntArray f60210d;

    /* renamed from: e */
    public static final SparseIntArray f60211e;

    /* renamed from: f */
    public static final Map<String, Integer> f60212f;

    /* renamed from: g */
    public static int f60213g = -1;

    /* renamed from: k7.d$b */
    public static final class C21310b {

        /* renamed from: a */
        public final String f60214a;

        /* renamed from: b */
        public final boolean f60215b;

        public C21310b(String str, boolean z) {
            this.f60214a = str;
            this.f60215b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != C21310b.class) {
                return false;
            }
            C21310b bVar = (C21310b) obj;
            return TextUtils.equals(this.f60214a, bVar.f60214a) && this.f60215b == bVar.f60215b;
        }

        public int hashCode() {
            String str = this.f60214a;
            return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.f60215b ? 1231 : 1237);
        }
    }

    /* renamed from: k7.d$c */
    public static class C21311c extends Exception {
        public C21311c(Throwable th, C21309a aVar) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* renamed from: k7.d$d */
    public interface C21312d {
        /* renamed from: a */
        int mo33317a();

        /* renamed from: b */
        boolean mo33318b();

        /* renamed from: c */
        MediaCodecInfo mo33319c(int i);

        /* renamed from: d */
        boolean mo33320d(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);
    }

    /* renamed from: k7.d$e */
    public static final class C21313e implements C21312d {
        public C21313e(C21309a aVar) {
        }

        /* renamed from: a */
        public int mo33317a() {
            return MediaCodecList.getCodecCount();
        }

        /* renamed from: b */
        public boolean mo33318b() {
            return false;
        }

        /* renamed from: c */
        public MediaCodecInfo mo33319c(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        /* renamed from: d */
        public boolean mo33320d(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "video/avc".equals(str);
        }
    }

    /* renamed from: k7.d$f */
    public static final class C21314f implements C21312d {

        /* renamed from: a */
        public final int f60216a;

        /* renamed from: b */
        public MediaCodecInfo[] f60217b;

        public C21314f(boolean z) {
            this.f60216a = z ? 1 : 0;
        }

        /* renamed from: a */
        public int mo33317a() {
            if (this.f60217b == null) {
                this.f60217b = new MediaCodecList(this.f60216a).getCodecInfos();
            }
            return this.f60217b.length;
        }

        /* renamed from: b */
        public boolean mo33318b() {
            return true;
        }

        /* renamed from: c */
        public MediaCodecInfo mo33319c(int i) {
            if (this.f60217b == null) {
                this.f60217b = new MediaCodecList(this.f60216a).getCodecInfos();
            }
            return this.f60217b[i];
        }

        /* renamed from: d */
        public boolean mo33320d(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported("secure-playback");
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f60210d = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f60211e = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, 65536);
        HashMap hashMap = new HashMap();
        f60212f = hashMap;
        hashMap.put("L30", 1);
        hashMap.put("L60", 4);
        hashMap.put("L63", 16);
        hashMap.put("L90", 64);
        hashMap.put("L93", 256);
        hashMap.put("L120", 1024);
        hashMap.put("L123", 4096);
        hashMap.put("L150", 16384);
        hashMap.put("L153", 65536);
        hashMap.put("L156", 262144);
        hashMap.put("L180", 1048576);
        hashMap.put("L183", 4194304);
        hashMap.put("L186", Integer.valueOf(TPMediaCodecProfileLevel.HEVCMainTierLevel62));
        hashMap.put("H30", 2);
        hashMap.put("H60", 8);
        hashMap.put("H63", 32);
        hashMap.put("H90", 128);
        hashMap.put("H93", 512);
        hashMap.put("H120", 2048);
        hashMap.put("H123", 8192);
        hashMap.put("H150", 32768);
        hashMap.put("H153", 131072);
        hashMap.put("H156", 524288);
        hashMap.put("H180", 2097152);
        hashMap.put("H183", 8388608);
        hashMap.put("H186", Integer.valueOf(TPMediaCodecProfileLevel.HEVCHighTierLevel62));
    }

    /* renamed from: a */
    public static void m23876a(List<C21303a> list) {
        if (C20551y.f57835a < 26) {
            if (list.size() > 1 && "OMX.MTK.AUDIO.DECODER.RAW".equals(list.get(0).f60160a)) {
                for (int i = 1; i < list.size(); i++) {
                    C21303a aVar = list.get(i);
                    if ("OMX.google.raw.decoder".equals(aVar.f60160a)) {
                        list.remove(i);
                        list.add(0, aVar);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static C21303a m23877b(String str, boolean z) {
        List<T> list;
        synchronized (C21308d.class) {
            C21310b bVar = new C21310b(str, z);
            HashMap<C21310b, List<C21303a>> hashMap = f60209c;
            list = hashMap.get(bVar);
            if (list == null) {
                int i = C20551y.f57835a;
                List<C21303a> c = m23878c(bVar, i >= 21 ? new C21314f(z) : new C21313e((C21309a) null));
                if (z && ((ArrayList) c).isEmpty() && 21 <= i && i <= 23) {
                    c = m23878c(bVar, new C21313e((C21309a) null));
                    ArrayList arrayList = (ArrayList) c;
                    if (!arrayList.isEmpty()) {
                        String str2 = ((C21303a) arrayList.get(0)).f60160a;
                    }
                }
                m23876a(c);
                list = Collections.unmodifiableList(c);
                hashMap.put(bVar, list);
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        return (C21303a) list.get(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e0 A[Catch:{ Exception -> 0x00fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e1 A[Catch:{ Exception -> 0x00fb }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<p353k7.C21303a> m23878c(p353k7.C21308d.C21310b r20, p353k7.C21308d.C21312d r21) {
        /*
            r1 = r20
            r2 = r21
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x00fb }
            r3.<init>()     // Catch:{ Exception -> 0x00fb }
            java.lang.String r10 = r1.f60214a     // Catch:{ Exception -> 0x00fb }
            int r11 = r21.mo33317a()     // Catch:{ Exception -> 0x00fb }
            boolean r12 = r21.mo33318b()     // Catch:{ Exception -> 0x00fb }
            r14 = 0
        L_0x0014:
            if (r14 >= r11) goto L_0x00fa
            android.media.MediaCodecInfo r15 = r2.mo33319c(r14)     // Catch:{ Exception -> 0x00fb }
            java.lang.String r9 = r15.getName()     // Catch:{ Exception -> 0x00fb }
            boolean r0 = m23879d(r15, r9, r12)     // Catch:{ Exception -> 0x00fb }
            if (r0 == 0) goto L_0x00f4
            java.lang.String[] r8 = r15.getSupportedTypes()     // Catch:{ Exception -> 0x00fb }
            int r7 = r8.length     // Catch:{ Exception -> 0x00fb }
            r6 = 0
        L_0x002a:
            if (r6 >= r7) goto L_0x00f4
            r0 = r8[r6]     // Catch:{ Exception -> 0x00fb }
            boolean r4 = r0.equalsIgnoreCase(r10)     // Catch:{ Exception -> 0x00fb }
            if (r4 == 0) goto L_0x00e2
            android.media.MediaCodecInfo$CodecCapabilities r0 = r15.getCapabilitiesForType(r0)     // Catch:{ Exception -> 0x00cc }
            boolean r4 = r2.mo33320d(r10, r0)     // Catch:{ Exception -> 0x00cc }
            int r5 = p333e8.C20551y.f57835a     // Catch:{ Exception -> 0x00cc }
            r13 = 22
            r16 = 1
            if (r5 > r13) goto L_0x0069
            java.lang.String r5 = p333e8.C20551y.f57838d     // Catch:{ Exception -> 0x00cc }
            java.lang.String r13 = "ODROID-XU3"
            boolean r13 = r5.equals(r13)     // Catch:{ Exception -> 0x00cc }
            if (r13 != 0) goto L_0x0056
            java.lang.String r13 = "Nexus 10"
            boolean r5 = r5.equals(r13)     // Catch:{ Exception -> 0x00cc }
            if (r5 == 0) goto L_0x0069
        L_0x0056:
            java.lang.String r5 = "OMX.Exynos.AVC.Decoder"
            boolean r5 = r5.equals(r9)     // Catch:{ Exception -> 0x00cc }
            if (r5 != 0) goto L_0x0066
            java.lang.String r5 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r5 = r5.equals(r9)     // Catch:{ Exception -> 0x00cc }
            if (r5 == 0) goto L_0x0069
        L_0x0066:
            r5 = 1
            r13 = 1
            goto L_0x006a
        L_0x0069:
            r13 = 0
        L_0x006a:
            if (r12 == 0) goto L_0x0070
            boolean r5 = r1.f60215b     // Catch:{ Exception -> 0x00cc }
            if (r5 == r4) goto L_0x0076
        L_0x0070:
            if (r12 != 0) goto L_0x009e
            boolean r5 = r1.f60215b     // Catch:{ Exception -> 0x00cc }
            if (r5 != 0) goto L_0x009e
        L_0x0076:
            r16 = 0
            k7.a r5 = new k7.a     // Catch:{ Exception -> 0x0094 }
            r4 = r5
            r1 = r5
            r5 = r9
            r17 = r6
            r6 = r10
            r18 = r7
            r7 = r0
            r19 = r8
            r8 = r13
            r13 = r9
            r9 = r16
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0092 }
            r3.add(r1)     // Catch:{ Exception -> 0x0092 }
            r1 = r13
            goto L_0x00e9
        L_0x0092:
            r0 = move-exception
            goto L_0x009c
        L_0x0094:
            r0 = move-exception
            r17 = r6
            r18 = r7
            r19 = r8
            r13 = r9
        L_0x009c:
            r1 = r13
            goto L_0x00d4
        L_0x009e:
            r17 = r6
            r18 = r7
            r19 = r8
            r1 = r9
            if (r12 != 0) goto L_0x00e9
            if (r4 == 0) goto L_0x00e9
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ca }
            r4.<init>()     // Catch:{ Exception -> 0x00ca }
            r4.append(r1)     // Catch:{ Exception -> 0x00ca }
            java.lang.String r5 = ".secure"
            r4.append(r5)     // Catch:{ Exception -> 0x00ca }
            java.lang.String r5 = r4.toString()     // Catch:{ Exception -> 0x00ca }
            k7.a r9 = new k7.a     // Catch:{ Exception -> 0x00ca }
            r4 = r9
            r6 = r10
            r7 = r0
            r8 = r13
            r0 = r9
            r9 = r16
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x00ca }
            r3.add(r0)     // Catch:{ Exception -> 0x00ca }
            return r3
        L_0x00ca:
            r0 = move-exception
            goto L_0x00d4
        L_0x00cc:
            r0 = move-exception
            r17 = r6
            r18 = r7
            r19 = r8
            r1 = r9
        L_0x00d4:
            int r4 = p333e8.C20551y.f57835a     // Catch:{ Exception -> 0x00fb }
            r5 = 23
            if (r4 > r5) goto L_0x00e1
            boolean r4 = r3.isEmpty()     // Catch:{ Exception -> 0x00fb }
            if (r4 != 0) goto L_0x00e1
            goto L_0x00e9
        L_0x00e1:
            throw r0     // Catch:{ Exception -> 0x00fb }
        L_0x00e2:
            r17 = r6
            r18 = r7
            r19 = r8
            r1 = r9
        L_0x00e9:
            int r6 = r17 + 1
            r9 = r1
            r7 = r18
            r8 = r19
            r1 = r20
            goto L_0x002a
        L_0x00f4:
            int r14 = r14 + 1
            r1 = r20
            goto L_0x0014
        L_0x00fa:
            return r3
        L_0x00fb:
            r0 = move-exception
            k7.d$c r1 = new k7.d$c
            r2 = 0
            r1.<init>(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p353k7.C21308d.m23878c(k7.d$b, k7.d$d):java.util.List");
    }

    /* renamed from: d */
    public static boolean m23879d(MediaCodecInfo mediaCodecInfo, String str, boolean z) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = C20551y.f57835a;
        if (i < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i < 18 && "OMX.SEC.MP3.Decoder".equals(str)) {
            return false;
        }
        if (i < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str2 = C20551y.f57836b;
            if ("a70".equals(str2) || ("Xiaomi".equals(C20551y.f57837c) && str2.startsWith("HM"))) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str3 = C20551y.f57836b;
            if ("dlxu".equals(str3) || "protou".equals(str3) || "ville".equals(str3) || "villeplus".equals(str3) || "villec2".equals(str3) || str3.startsWith("gee") || "C6602".equals(str3) || "C6603".equals(str3) || "C6606".equals(str3) || "C6616".equals(str3) || "L36h".equals(str3) || "SO-02E".equals(str3)) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str4 = C20551y.f57836b;
            if ("C1504".equals(str4) || "C1505".equals(str4) || "C1604".equals(str4) || "C1605".equals(str4)) {
                return false;
            }
        }
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && C20551y.f57837c.equals("samsung"))) {
            String str5 = C20551y.f57836b;
            if (str5.startsWith("zeroflte") || str5.startsWith("zerolte") || str5.startsWith("zenlte") || str5.equals("SC-05G") || str5.equals("marinelteatt") || str5.equals("404SC") || str5.equals("SC-04G") || str5.equals("SCV31")) {
                return false;
            }
        }
        if (i <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(C20551y.f57837c)) {
            String str6 = C20551y.f57836b;
            if (str6.startsWith("d2") || str6.startsWith("serrano") || str6.startsWith("jflte") || str6.startsWith("santos") || str6.startsWith("t0")) {
                return false;
            }
        }
        return i > 19 || !C20551y.f57836b.startsWith("jflte") || !"OMX.qcom.video.decoder.vp8".equals(str);
    }

    /* renamed from: e */
    public static int m23880e() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        if (f60213g == -1) {
            int i = 0;
            C21303a b = m23877b("video/avc", false);
            if (b != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = b.f60165f;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int i2 = 0;
                while (i < length) {
                    int i3 = codecProfileLevelArr[i].level;
                    int i4 = 25344;
                    if (!(i3 == 1 || i3 == 2)) {
                        i4 = 9437184;
                        switch (i3) {
                            case 8:
                            case 16:
                            case 32:
                                i4 = 101376;
                                break;
                            case 64:
                                i4 = 202752;
                                break;
                            case 128:
                            case 256:
                                i4 = 414720;
                                break;
                            case 512:
                                i4 = Downloads.SPLIT_RANGE_SIZE_NET;
                                break;
                            case 1024:
                                i4 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i4 = 2097152;
                                break;
                            case 8192:
                                i4 = 2228224;
                                break;
                            case 16384:
                                i4 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                break;
                            default:
                                i4 = -1;
                                break;
                        }
                    }
                    i2 = Math.max(i4, i2);
                    i++;
                }
                i = Math.max(i2, C20551y.f57835a >= 21 ? 345600 : 172800);
            }
            f60213g = i;
        }
        return f60213g;
    }
}
