package p381s7;

import android.text.TextUtils;
import com.google.android.gms.stats.netstats.NetstatsParserPatterns;
import com.tencent.tav.coremedia.TimeUtil;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import java.io.BufferedReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Queue;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p300c8.C79964v;
import p333e8.C20551y;
import p381s7.C22302b;
import p396x6.C22994b;
import p396x6.C23015n;
import p984j7.C87901b;

/* renamed from: s7.d */
public final class C118272d implements C79964v.C79965a<C22304c> {

    /* renamed from: a */
    public static final Pattern f353490a = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: b */
    public static final Pattern f353491b = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: c */
    public static final Pattern f353492c = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: d */
    public static final Pattern f353493d = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: e */
    public static final Pattern f353494e = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: f */
    public static final Pattern f353495f = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: g */
    public static final Pattern f353496g = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: h */
    public static final Pattern f353497h = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: i */
    public static final Pattern f353498i = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: j */
    public static final Pattern f353499j = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: k */
    public static final Pattern f353500k = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: l */
    public static final Pattern f353501l = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: m */
    public static final Pattern f353502m = Pattern.compile("METHOD=(NONE|AES-128)");

    /* renamed from: n */
    public static final Pattern f353503n = Pattern.compile("URI=\"(.+?)\"");

    /* renamed from: o */
    public static final Pattern f353504o = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: p */
    public static final Pattern f353505p = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: q */
    public static final Pattern f353506q = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* renamed from: r */
    public static final Pattern f353507r = Pattern.compile("NAME=\"(.+?)\"");

    /* renamed from: s */
    public static final Pattern f353508s = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: t */
    public static final Pattern f353509t = m166837a("AUTOSELECT");

    /* renamed from: u */
    public static final Pattern f353510u = m166837a(NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN);

    /* renamed from: v */
    public static final Pattern f353511v = m166837a("FORCED");

    /* renamed from: s7.d$a */
    public static class C118273a {

        /* renamed from: a */
        public final BufferedReader f353512a;

        /* renamed from: b */
        public final Queue<String> f353513b;

        /* renamed from: c */
        public String f353514c;

        public C118273a(Queue<String> queue, BufferedReader bufferedReader) {
            this.f353513b = queue;
            this.f353512a = bufferedReader;
        }

        /* renamed from: a */
        public boolean mo183056a() {
            String trim;
            if (this.f353514c != null) {
                return true;
            }
            if (!this.f353513b.isEmpty()) {
                this.f353514c = this.f353513b.poll();
                return true;
            }
            do {
                String readLine = this.f353512a.readLine();
                this.f353514c = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.f353514c = trim;
            } while (trim.isEmpty());
            return true;
        }
    }

    /* renamed from: a */
    public static Pattern m166837a(String str) {
        return Pattern.compile(str + "=(" + "NO" + "|" + "YES" + ")");
    }

    /* renamed from: c */
    public static boolean m166838c(String str, Pattern pattern, boolean z) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? matcher.group(1).equals("YES") : z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r3v1, types: [boolean, int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x015b  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p381s7.C22300a m166839d(p381s7.C118272d.C118273a r74, java.lang.String r75) {
        /*
            r0 = r74
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r2 = 0
            r3 = 0
            r8 = r2
            r10 = r8
            r9 = 0
        L_0x0020:
            boolean r11 = r74.mo183056a()
            if (r11 == 0) goto L_0x023a
            boolean r11 = r74.mo183056a()
            if (r11 == 0) goto L_0x0031
            java.lang.String r11 = r0.f353514c
            r0.f353514c = r2
            goto L_0x0032
        L_0x0031:
            r11 = r2
        L_0x0032:
            java.lang.Object[] r12 = new java.lang.Object[r3]
            java.lang.String r13 = "master ExoPlayer"
            p984j7.C87901b.m109401b(r13, r11, r12)
            java.lang.String r12 = "#EXT"
            boolean r12 = r11.startsWith(r12)
            if (r12 == 0) goto L_0x0044
            r4.add(r11)
        L_0x0044:
            java.lang.String r12 = "#EXT-X-MEDIA"
            boolean r12 = r11.startsWith(r12)
            if (r12 == 0) goto L_0x0179
            java.util.regex.Pattern r12 = f353510u
            boolean r12 = m166838c(r11, r12, r3)
            java.util.regex.Pattern r15 = f353511v
            boolean r15 = m166838c(r11, r15, r3)
            if (r15 == 0) goto L_0x005c
            r15 = 2
            goto L_0x005d
        L_0x005c:
            r15 = 0
        L_0x005d:
            r12 = r12 | r15
            java.util.regex.Pattern r15 = f353509t
            boolean r15 = m166838c(r11, r15, r3)
            if (r15 == 0) goto L_0x0068
            r15 = 4
            goto L_0x0069
        L_0x0068:
            r15 = 0
        L_0x0069:
            r12 = r12 | r15
            java.util.regex.Pattern r15 = f353503n
            java.lang.String r15 = m166841f(r11, r15)
            java.util.regex.Pattern r2 = f353507r
            java.lang.String r2 = m166842g(r11, r2)
            java.util.regex.Pattern r3 = f353506q
            java.lang.String r3 = m166841f(r11, r3)
            java.util.regex.Pattern r14 = f353505p
            java.lang.String r14 = m166842g(r11, r14)
            r14.getClass()
            int r13 = r14.hashCode()
            r45 = r8
            r8 = -959297733(0xffffffffc6d2473b, float:-26915.615)
            if (r13 == r8) goto L_0x00b1
            r8 = -333210994(0xffffffffec239a8e, float:-7.911391E26)
            if (r13 == r8) goto L_0x00a6
            r8 = 62628790(0x3bba3b6, float:1.1028458E-36)
            if (r13 == r8) goto L_0x009b
            goto L_0x00b9
        L_0x009b:
            java.lang.String r8 = "AUDIO"
            boolean r8 = r14.equals(r8)
            if (r8 != 0) goto L_0x00a4
            goto L_0x00b9
        L_0x00a4:
            r14 = 2
            goto L_0x00bc
        L_0x00a6:
            java.lang.String r8 = "CLOSED-CAPTIONS"
            boolean r8 = r14.equals(r8)
            if (r8 != 0) goto L_0x00af
            goto L_0x00b9
        L_0x00af:
            r14 = 1
            goto L_0x00bc
        L_0x00b1:
            java.lang.String r8 = "SUBTITLES"
            boolean r8 = r14.equals(r8)
            if (r8 != 0) goto L_0x00bb
        L_0x00b9:
            r14 = -1
            goto L_0x00bc
        L_0x00bb:
            r14 = 0
        L_0x00bc:
            if (r14 == 0) goto L_0x015b
            r8 = 1
            if (r14 == r8) goto L_0x0114
            r8 = 2
            if (r14 == r8) goto L_0x00c6
            goto L_0x0233
        L_0x00c6:
            r20 = 0
            r21 = 0
            r22 = -1
            r32 = -1
            r33 = -1
            r42 = 0
            com.google.android.exoplayer2.Format r8 = new com.google.android.exoplayer2.Format
            r17 = r8
            r23 = -1
            r24 = -1
            r25 = -1
            r26 = -1082130432(0xffffffffbf800000, float:-1.0)
            r27 = -1
            r28 = -1082130432(0xffffffffbf800000, float:-1.0)
            r29 = 0
            r30 = -1
            r31 = 0
            r34 = -1
            r35 = -1
            r36 = -1
            r39 = -1
            r40 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r43 = 0
            r44 = 0
            java.lang.String r19 = "application/x-mpegURL"
            r18 = r2
            r37 = r12
            r38 = r3
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r42, r43, r44)
            if (r15 != 0) goto L_0x010a
        L_0x0106:
            r2 = 0
            r3 = 0
            goto L_0x0020
        L_0x010a:
            s7.a$a r2 = new s7.a$a
            r2.<init>(r15, r8)
            r6.add(r2)
            goto L_0x0233
        L_0x0114:
            java.util.regex.Pattern r8 = f353508s
            java.lang.String r8 = m166842g(r11, r8)
            java.lang.String r11 = "CC"
            boolean r11 = r8.startsWith(r11)
            if (r11 == 0) goto L_0x012e
            r11 = 2
            java.lang.String r8 = r8.substring(r11)
            int r8 = java.lang.Integer.parseInt(r8)
            java.lang.String r11 = "application/cea-608"
            goto L_0x0139
        L_0x012e:
            r11 = 7
            java.lang.String r8 = r8.substring(r11)
            int r8 = java.lang.Integer.parseInt(r8)
            java.lang.String r11 = "application/cea-708"
        L_0x0139:
            r24 = r8
            r19 = r11
            if (r10 != 0) goto L_0x0145
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r10 = r8
        L_0x0145:
            r18 = 0
            r20 = 0
            r21 = -1
            r17 = r2
            r22 = r12
            r23 = r3
            com.google.android.exoplayer2.Format r2 = com.google.android.exoplayer2.Format.m16646g(r17, r18, r19, r20, r21, r22, r23, r24)
            r10.add(r2)
            r8 = r45
            goto L_0x0106
        L_0x015b:
            r20 = 0
            r21 = -1
            r24 = -1
            java.lang.String r18 = "application/x-mpegURL"
            java.lang.String r19 = "text/vtt"
            r17 = r2
            r22 = r12
            r23 = r3
            com.google.android.exoplayer2.Format r2 = com.google.android.exoplayer2.Format.m16646g(r17, r18, r19, r20, r21, r22, r23, r24)
            s7.a$a r3 = new s7.a$a
            r3.<init>(r15, r2)
            r7.add(r3)
            goto L_0x0233
        L_0x0179:
            r45 = r8
            java.lang.String r2 = "#EXT-X-STREAM-INF"
            boolean r2 = r11.startsWith(r2)
            if (r2 == 0) goto L_0x0233
            java.util.regex.Pattern r2 = f353491b
            java.lang.String r2 = m166842g(r11, r2)
            int r2 = java.lang.Integer.parseInt(r2)
            java.util.regex.Pattern r3 = f353490a
            java.lang.String r3 = m166841f(r11, r3)
            if (r3 == 0) goto L_0x0199
            int r2 = java.lang.Integer.parseInt(r3)
        L_0x0199:
            r51 = r2
            java.util.regex.Pattern r2 = f353492c
            java.lang.String r50 = m166841f(r11, r2)
            java.util.regex.Pattern r2 = f353493d
            java.lang.String r2 = m166841f(r11, r2)
            java.lang.String r3 = "CLOSED-CAPTIONS=NONE"
            boolean r3 = r11.contains(r3)
            r9 = r9 | r3
            if (r2 == 0) goto L_0x01d5
            java.lang.String r3 = "x"
            java.lang.String[] r2 = r2.split(r3)
            r3 = 0
            r8 = r2[r3]
            int r8 = java.lang.Integer.parseInt(r8)
            r11 = 1
            r2 = r2[r11]
            int r2 = java.lang.Integer.parseInt(r2)
            if (r8 <= 0) goto L_0x01cd
            if (r2 > 0) goto L_0x01c9
            goto L_0x01cd
        L_0x01c9:
            r16 = r2
            r14 = r8
            goto L_0x01d0
        L_0x01cd:
            r14 = -1
            r16 = -1
        L_0x01d0:
            r53 = r14
            r54 = r16
            goto L_0x01da
        L_0x01d5:
            r3 = 0
            r53 = -1
            r54 = -1
        L_0x01da:
            boolean r2 = r74.mo183056a()
            if (r2 == 0) goto L_0x01e6
            java.lang.String r2 = r0.f353514c
            r8 = 0
            r0.f353514c = r8
            goto L_0x01e8
        L_0x01e6:
            r8 = 0
            r2 = r8
        L_0x01e8:
            boolean r11 = r1.add(r2)
            if (r11 == 0) goto L_0x0235
            int r11 = r5.size()
            java.lang.String r47 = java.lang.Integer.toString(r11)
            r49 = 0
            r55 = -1082130432(0xffffffffbf800000, float:-1.0)
            r71 = 0
            r66 = 0
            com.google.android.exoplayer2.Format r11 = new com.google.android.exoplayer2.Format
            r46 = r11
            r52 = -1
            r56 = -1
            r57 = -1082130432(0xffffffffbf800000, float:-1.0)
            r58 = 0
            r59 = -1
            r60 = 0
            r61 = -1
            r62 = -1
            r63 = -1
            r64 = -1
            r65 = -1
            r67 = 0
            r68 = -1
            r69 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r72 = 0
            r73 = 0
            java.lang.String r48 = "application/x-mpegURL"
            r46.<init>(r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r71, r72, r73)
            s7.a$a r12 = new s7.a$a
            r12.<init>(r2, r11)
            r5.add(r12)
            goto L_0x0235
        L_0x0233:
            r3 = 0
            r8 = 0
        L_0x0235:
            r2 = r8
            r8 = r45
            goto L_0x0020
        L_0x023a:
            r45 = r8
            if (r9 == 0) goto L_0x0244
            java.util.List r0 = java.util.Collections.emptyList()
            r9 = r0
            goto L_0x0245
        L_0x0244:
            r9 = r10
        L_0x0245:
            s7.a r0 = new s7.a
            r2 = r0
            r3 = r75
            r8 = r45
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p381s7.C118272d.m166839d(s7.d$a, java.lang.String):s7.a");
    }

    /* renamed from: e */
    public static C22302b m166840e(C118273a aVar, String str) {
        String str2;
        String str3;
        int i;
        C118273a aVar2 = aVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String str4 = null;
        int i2 = 1;
        int i3 = 0;
        long j = -9223372036854775807L;
        C22302b.C22303a aVar3 = null;
        long j2 = -9223372036854775807L;
        int i4 = 0;
        int i5 = 0;
        long j3 = 0;
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1;
        boolean z2 = false;
        boolean z3 = false;
        long j4 = 0;
        int i9 = 0;
        long j5 = -1;
        boolean z4 = false;
        long j6 = 0;
        long j7 = 0;
        while (true) {
            String str5 = str2;
            String str6 = str5;
            int i15 = i4;
            boolean z5 = z2;
            boolean z6 = z3;
            C22302b.C22303a aVar4 = aVar3;
            long j8 = j5;
            boolean z7 = z4;
            long j9 = j6;
            long j15 = j7;
            long j16 = j2;
            long j17 = j3;
            boolean z8 = z;
            int i16 = i6;
            int i17 = i7;
            int i18 = i8;
            while (aVar.mo183056a()) {
                if (aVar.mo183056a()) {
                    str3 = aVar2.f353514c;
                    aVar2.f353514c = str2;
                } else {
                    str3 = str2;
                }
                C87901b.m109401b("ExoPlayer", str3, new Object[i3]);
                if (str3.startsWith("#EXT")) {
                    arrayList2.add(str3);
                }
                if (str3.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                    String g = m166842g(str3, f353496g);
                    if ("VOD".equals(g)) {
                        str2 = null;
                        i5 = 1;
                    } else if ("EVENT".equals(g)) {
                        str2 = null;
                        i5 = 2;
                    }
                } else if (str3.startsWith("#EXT-X-START")) {
                    j = (long) (Double.parseDouble(m166842g(str3, f353499j)) * 1000000.0d);
                } else if (str3.startsWith("#EXT-X-MAP")) {
                    String g2 = m166842g(str3, f353503n);
                    String f = m166841f(str3, f353501l);
                    if (f != null) {
                        String[] split = f.split("@");
                        j8 = Long.parseLong(split[i3]);
                        if (split.length > i2) {
                            j4 = Long.parseLong(split[i2]);
                        }
                    }
                    aVar4 = new C22302b.C22303a(g2, 0, -1, -9223372036854775807L, false, (String) null, (String) null, j4, j8);
                    str2 = null;
                    j4 = 0;
                    j8 = -1;
                } else if (str3.startsWith("#EXT-X-TARGETDURATION")) {
                    j16 = TimeUtil.SECOND_TO_US * ((long) Integer.parseInt(m166842g(str3, f353494e)));
                } else if (str3.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                    i9 = Integer.parseInt(m166842g(str3, f353497h));
                    i17 = i9;
                } else if (str3.startsWith("#EXT-X-VERSION")) {
                    i18 = Integer.parseInt(m166842g(str3, f353495f));
                } else if (str3.startsWith("#EXTINF")) {
                    j15 = (long) (Double.parseDouble(m166842g(str3, f353498i)) * 1000000.0d);
                } else if (str3.startsWith("#EXT-X-KEY")) {
                    z7 = "AES-128".equals(m166842g(str3, f353502m));
                    if (z7) {
                        str6 = m166842g(str3, f353503n);
                        str5 = m166841f(str3, f353504o);
                    } else {
                        z = z8;
                        j2 = j16;
                        j3 = j17;
                        i6 = i16;
                        i7 = i17;
                        i8 = i18;
                        z2 = z5;
                        z3 = z6;
                        aVar3 = aVar4;
                        j5 = j8;
                        z4 = z7;
                        j6 = j9;
                        j7 = j15;
                        str4 = null;
                        i4 = i15;
                    }
                } else if (str3.startsWith("#EXT-X-BYTERANGE")) {
                    String[] split2 = m166842g(str3, f353500k).split("@");
                    j8 = Long.parseLong(split2[i3]);
                    if (split2.length > i2) {
                        j4 = Long.parseLong(split2[i2]);
                    }
                } else if (str3.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                    i16 = Integer.parseInt(str3.substring(str3.indexOf(58) + i2));
                    str2 = null;
                    z8 = true;
                } else if (str3.equals("#EXT-X-DISCONTINUITY")) {
                    i15++;
                } else {
                    if (str3.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                        if (j17 == 0) {
                            String substring = str3.substring(str3.indexOf(58) + i2);
                            Matcher matcher = C20551y.f57839e.matcher(substring);
                            if (matcher.matches()) {
                                if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                                    i = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
                                    if (matcher.group(11).equals("-")) {
                                        i *= -1;
                                    }
                                } else {
                                    i = 0;
                                }
                                GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
                                gregorianCalendar.clear();
                                gregorianCalendar.set(Integer.parseInt(matcher.group(i2)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
                                if (!TextUtils.isEmpty(matcher.group(8))) {
                                    gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
                                }
                                long timeInMillis = gregorianCalendar.getTimeInMillis();
                                if (i != 0) {
                                    timeInMillis -= (long) (i * CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL);
                                }
                                j17 = C22994b.m27203a(timeInMillis) - j9;
                            } else {
                                throw new C23015n("Invalid date/time format: " + substring);
                            }
                        }
                    } else if (!str3.startsWith("#")) {
                        String hexString = !z7 ? null : str5 != null ? str5 : Integer.toHexString(i9);
                        int i19 = i9 + 1;
                        int i25 = (j8 > -1 ? 1 : (j8 == -1 ? 0 : -1));
                        long j18 = i25 == 0 ? 0 : j4;
                        arrayList.add(new C22302b.C22303a(str3, j15, i15, j9, z7, str6, hexString, j18, j8));
                        j9 += j15;
                        if (i25 != 0) {
                            j18 += j8;
                        }
                        j4 = j18;
                        aVar2 = aVar;
                        i9 = i19;
                        j8 = -1;
                        str2 = null;
                        i2 = 1;
                        i3 = 0;
                        j15 = 0;
                    } else if (str3.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                        aVar2 = aVar;
                        str2 = null;
                        i2 = 1;
                        i3 = 0;
                        z5 = true;
                    } else if (str3.equals("#EXT-X-ENDLIST")) {
                        aVar2 = aVar;
                        str2 = null;
                        i2 = 1;
                        i3 = 0;
                        z6 = true;
                    }
                    aVar2 = aVar;
                    str2 = null;
                    i2 = 1;
                    i3 = 0;
                }
                str2 = null;
            }
            return new C22302b(i5, str, arrayList2, j, j17, z8, i16, i17, i18, j16, z5, z6, j17 != 0, aVar4, arrayList);
        }
    }

    /* renamed from: f */
    public static String m166841f(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    /* renamed from: g */
    public static String m166842g(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find() && matcher.groupCount() == 1) {
            return matcher.group(1);
        }
        throw new C23015n("Couldn't match " + pattern.pattern() + " in " + str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0069 A[Catch:{ all -> 0x0123 }, LOOP:2: B:21:0x0051->B:32:0x0069, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0077 A[Catch:{ all -> 0x0123 }, LOOP:3: B:38:0x0077->B:84:0x0077, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x006e A[EDGE_INSN: B:82:0x006e->B:33:0x006e ?: BREAK  , SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo183055b(android.net.Uri r9, java.io.InputStream r10) {
        /*
            r8 = this;
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            r1.<init>(r10)
            r0.<init>(r1)
            java.util.LinkedList r10 = new java.util.LinkedList
            r10.<init>()
            int r1 = r0.read()     // Catch:{ all -> 0x0123 }
            r2 = 239(0xef, float:3.35E-43)
            r3 = 1
            r4 = 0
            if (r1 != r2) goto L_0x002e
            int r1 = r0.read()     // Catch:{ all -> 0x0123 }
            r2 = 187(0xbb, float:2.62E-43)
            if (r1 != r2) goto L_0x0048
            int r1 = r0.read()     // Catch:{ all -> 0x0123 }
            r2 = 191(0xbf, float:2.68E-43)
            if (r1 == r2) goto L_0x002a
            goto L_0x0048
        L_0x002a:
            int r1 = r0.read()     // Catch:{ all -> 0x0123 }
        L_0x002e:
            r2 = -1
            if (r1 == r2) goto L_0x003c
            boolean r5 = java.lang.Character.isWhitespace(r1)     // Catch:{ all -> 0x0123 }
            if (r5 == 0) goto L_0x003c
            int r1 = r0.read()     // Catch:{ all -> 0x0123 }
            goto L_0x002e
        L_0x003c:
            r5 = 7
            r6 = 0
        L_0x003e:
            if (r6 >= r5) goto L_0x0051
            java.lang.String r7 = "#EXTM3U"
            char r7 = r7.charAt(r6)     // Catch:{ all -> 0x0123 }
            if (r1 == r7) goto L_0x004a
        L_0x0048:
            r1 = 0
            goto L_0x0075
        L_0x004a:
            int r1 = r0.read()     // Catch:{ all -> 0x0123 }
            int r6 = r6 + 1
            goto L_0x003e
        L_0x0051:
            r5 = 13
            r6 = 10
            if (r1 == r2) goto L_0x006e
            boolean r7 = java.lang.Character.isWhitespace(r1)     // Catch:{ all -> 0x0123 }
            if (r7 == 0) goto L_0x006e
            int r7 = p333e8.C20551y.f57835a     // Catch:{ all -> 0x0123 }
            if (r1 == r6) goto L_0x0066
            if (r1 != r5) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r7 = 0
            goto L_0x0067
        L_0x0066:
            r7 = 1
        L_0x0067:
            if (r7 != 0) goto L_0x006e
            int r1 = r0.read()     // Catch:{ all -> 0x0123 }
            goto L_0x0051
        L_0x006e:
            int r2 = p333e8.C20551y.f57835a     // Catch:{ all -> 0x0123 }
            if (r1 == r6) goto L_0x0074
            if (r1 != r5) goto L_0x0048
        L_0x0074:
            r1 = 1
        L_0x0075:
            if (r1 == 0) goto L_0x0105
        L_0x0077:
            java.lang.String r1 = r0.readLine()     // Catch:{ all -> 0x0123 }
            if (r1 == 0) goto L_0x00fa
            java.lang.String r1 = r1.trim()     // Catch:{ all -> 0x0123 }
            boolean r2 = r1.isEmpty()     // Catch:{ all -> 0x0123 }
            if (r2 == 0) goto L_0x0088
            goto L_0x0077
        L_0x0088:
            java.lang.String r2 = "#EXT-X-STREAM-INF"
            boolean r2 = r1.startsWith(r2)     // Catch:{ all -> 0x0123 }
            if (r2 == 0) goto L_0x00a1
            r10.add(r1)     // Catch:{ all -> 0x0123 }
            s7.d$a r1 = new s7.d$a     // Catch:{ all -> 0x0123 }
            r1.<init>(r10, r0)     // Catch:{ all -> 0x0123 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0123 }
            s7.a r9 = m166839d(r1, r9)     // Catch:{ all -> 0x0123 }
            goto L_0x00f6
        L_0x00a1:
            java.lang.String r2 = "#EXT-X-TARGETDURATION"
            boolean r2 = r1.startsWith(r2)     // Catch:{ all -> 0x0123 }
            if (r2 != 0) goto L_0x00e6
            java.lang.String r2 = "#EXT-X-MEDIA-SEQUENCE"
            boolean r2 = r1.startsWith(r2)     // Catch:{ all -> 0x0123 }
            if (r2 != 0) goto L_0x00e6
            java.lang.String r2 = "#EXTINF"
            boolean r2 = r1.startsWith(r2)     // Catch:{ all -> 0x0123 }
            if (r2 != 0) goto L_0x00e6
            java.lang.String r2 = "#EXT-X-KEY"
            boolean r2 = r1.startsWith(r2)     // Catch:{ all -> 0x0123 }
            if (r2 != 0) goto L_0x00e6
            java.lang.String r2 = "#EXT-X-BYTERANGE"
            boolean r2 = r1.startsWith(r2)     // Catch:{ all -> 0x0123 }
            if (r2 != 0) goto L_0x00e6
            java.lang.String r2 = "#EXT-X-DISCONTINUITY"
            boolean r2 = r1.equals(r2)     // Catch:{ all -> 0x0123 }
            if (r2 != 0) goto L_0x00e6
            java.lang.String r2 = "#EXT-X-DISCONTINUITY-SEQUENCE"
            boolean r2 = r1.equals(r2)     // Catch:{ all -> 0x0123 }
            if (r2 != 0) goto L_0x00e6
            java.lang.String r2 = "#EXT-X-ENDLIST"
            boolean r2 = r1.equals(r2)     // Catch:{ all -> 0x0123 }
            if (r2 == 0) goto L_0x00e2
            goto L_0x00e6
        L_0x00e2:
            r10.add(r1)     // Catch:{ all -> 0x0123 }
            goto L_0x0077
        L_0x00e6:
            r10.add(r1)     // Catch:{ all -> 0x0123 }
            s7.d$a r1 = new s7.d$a     // Catch:{ all -> 0x0123 }
            r1.<init>(r10, r0)     // Catch:{ all -> 0x0123 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0123 }
            s7.b r9 = m166840e(r1, r9)     // Catch:{ all -> 0x0123 }
        L_0x00f6:
            p333e8.C20551y.m22315e(r0)
            return r9
        L_0x00fa:
            p333e8.C20551y.m22315e(r0)
            x6.n r9 = new x6.n
            java.lang.String r10 = "Failed to parse the playlist, could not identify any tags."
            r9.<init>((java.lang.String) r10)
            throw r9
        L_0x0105:
            java.lang.String r10 = "ExoPlayer"
            java.lang.String r1 = "parse, not the #EXTM3U header, uri:%s, reader:%s"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0123 }
            java.lang.String r5 = r9.toString()     // Catch:{ all -> 0x0123 }
            r2[r4] = r5     // Catch:{ all -> 0x0123 }
            java.lang.String r4 = r0.readLine()     // Catch:{ all -> 0x0123 }
            r2[r3] = r4     // Catch:{ all -> 0x0123 }
            p984j7.C87901b.m109400a(r10, r1, r2)     // Catch:{ all -> 0x0123 }
            p7.w r10 = new p7.w     // Catch:{ all -> 0x0123 }
            java.lang.String r1 = "Input does not start with the #EXTM3U header."
            r10.<init>(r1, r9)     // Catch:{ all -> 0x0123 }
            throw r10     // Catch:{ all -> 0x0123 }
        L_0x0123:
            r9 = move-exception
            p333e8.C20551y.m22315e(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p381s7.C118272d.mo183055b(android.net.Uri, java.io.InputStream):java.lang.Object");
    }
}
