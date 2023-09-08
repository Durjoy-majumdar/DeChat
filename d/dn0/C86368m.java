package dn0;

import an0.C79592a;
import android.text.TextUtils;
import android.webkit.URLUtil;
import bn0.C79722f;
import bn0.C79725i;
import fn0.C87002g;
import fn0.C87008m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

/* renamed from: dn0.m */
public class C86368m {

    /* renamed from: c */
    public static volatile C86368m f251099c;

    /* renamed from: a */
    public C86370o f251100a = new C86370o();

    /* renamed from: b */
    public Set<String> f251101b = Collections.synchronizedSet(new HashSet());

    /* renamed from: b */
    public static C86368m m106993b() {
        if (f251099c != null) {
            return f251099c;
        }
        throw new IllegalStateException("Video SDK has not been initialized! Call init() first!");
    }

    /* renamed from: a */
    public long mo120758a(String str) {
        C86370o oVar = this.f251100a;
        oVar.getClass();
        long j = 0;
        if (!TextUtils.isEmpty(str) && oVar.f251109c != null) {
            String v = C87002g.m108028v(str);
            C79725i iVar = (C79725i) oVar.f251109c;
            synchronized (iVar) {
                NavigableSet<C79722f> c = iVar.mo109852c(v);
                if (c != null) {
                    C79722f first = c.first();
                    if (first == null || !first.f233663i || first.f233661g < 0 || first.f233659e == 0) {
                        if (first != null) {
                            if (first.f233661g >= 0) {
                                Iterator<C79722f> it = c.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    C79722f next = it.next();
                                    if (!next.f233663i) {
                                        break;
                                    }
                                    j += next.f233660f;
                                }
                            }
                        }
                    }
                }
            }
        }
        return j;
    }

    /* renamed from: c */
    public boolean mo120759c(String str) {
        C79722f first;
        C86370o oVar = this.f251100a;
        oVar.getClass();
        boolean z = false;
        if (!TextUtils.isEmpty(str) && oVar.f251109c != null) {
            String v = C87002g.m108028v(str);
            C79725i iVar = (C79725i) oVar.f251109c;
            synchronized (iVar) {
                NavigableSet<C79722f> c = iVar.mo109852c(v);
                if (!(c == null || (first = c.first()) == null)) {
                    long j = first.f233661g;
                    long j2 = 0;
                    if (j >= 0) {
                        Iterator<C79722f> it = c.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                C79722f next = it.next();
                                if (!next.f233663i) {
                                    break;
                                }
                                j2 += next.f233660f;
                            } else if (j2 >= j) {
                                z = true;
                            }
                        }
                    }
                }
            }
        }
        return z;
    }

    /* renamed from: d */
    public boolean mo120760d(String str, long j) {
        String str2 = str;
        if (TextUtils.isEmpty(str) || !URLUtil.isNetworkUrl(str)) {
            C87002g.m108023q(4, "VideoManager", "preload, not valid url, url=" + str2, (Throwable) null);
        } else if (!C79592a.m96648a().f233400c) {
            C87002g.m108023q(4, "VideoManager", "preload, video proxy & cache disabled", (Throwable) null);
        } else if (this.f251101b.contains(str2)) {
            C87002g.m108023q(4, "VideoManager", "preload, same url in preloading, url=" + str2, (Throwable) null);
        } else if (C87002g.m108019m(str)) {
            C87002g.m108023q(4, "VideoManager", "preload, m3u8 is not supported, url=" + str2, (Throwable) null);
        } else if (mo120759c(str)) {
            C87002g.m108023q(4, "VideoManager", "preload, video already cached, url=" + str2, (Throwable) null);
            return true;
        } else {
            boolean z = j == -1 || mo120758a(str) < j;
            if (!z) {
                C87002g.m108023q(4, "VideoManager", "preload, no need to preload, preloadSync skipped, url=" + str2, (Throwable) null);
            } else {
                try {
                    C87008m.m108035b(new C86366k(this, str, j, 0, 0, z, false, (C86357a) null), "preloadAsync");
                    return true;
                } catch (Exception e) {
                    C87002g.m108023q(6, "VideoManager", "preload, preloadSync error, url=" + str2 + " msg=" + e.getMessage(), (Throwable) null);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    public void mo120761e(ArrayList<C86363h> arrayList, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "preloadMediasAsync";
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<C86363h> it = arrayList.iterator();
        while (it.hasNext()) {
            C86363h next = it.next();
            if (!mo120759c(next.f251086a)) {
                arrayList2.add(new C86367l(this, next, -1, (C86364i) null, str));
            } else {
                C87002g.m108023q(4, str, "preloadMediasAsync, url " + next.f251086a + " already cached, cacheMaxBytes=" + -1, (Throwable) null);
            }
        }
        if (arrayList2.size() > 0) {
            synchronized (C87008m.class) {
                C87008m.C87011c cVar = new C87008m.C87011c(2);
                Long l = 1L;
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    Long valueOf = Long.valueOf(l.longValue() + 1);
                    cVar.execute(new C87008m.C87009a((Runnable) it4.next(), null, l.longValue()));
                    l = valueOf;
                }
                cVar.shutdown();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0441, code lost:
        if (r11 == null) goto L_0x0309;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x05cf, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x05d0, code lost:
        r5 = r50;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x05d3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x05d4, code lost:
        r5 = r50;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x05e2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x05e3, code lost:
        r5 = r50;
        r7 = r28;
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x05ea, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x05eb, code lost:
        r5 = r50;
        r46 = "preloadSync tail error for url ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x05ef, code lost:
        r7 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x065f, code lost:
        if (r5 == null) goto L_0x0664;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0661, code lost:
        r5.mo120747d(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0664, code lost:
        r0 = (lu0.C88650c) an0.C79592a.m96648a().mo109709e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0673, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0674, code lost:
        r5 = r50;
        r10 = "preloadSync tail error for url ";
        r7 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0687, code lost:
        if (r0.getMessage() == null) goto L_0x06c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x069a, code lost:
        fn0.C87002g.m108022p(4, r4, "preloadSync tail preload interrupted totalPreloadedBytes=" + r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x06b0, code lost:
        if (r5 != null) goto L_0x06b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x06b2, code lost:
        r5.mo120747d(r8, -101);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x06b7, code lost:
        ((lu0.C88650c) an0.C79592a.m96648a().mo109709e()).mo123091e(r7, r8, -101);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x06c7, code lost:
        fn0.C87002g.m108022p(5, r4, r10 + r8 + " pos1 " + fn0.C87002g.m108013g(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x06e6, code lost:
        if (r5 != null) goto L_0x06e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x06e8, code lost:
        r5.mo120747d(r8, -102);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x06ed, code lost:
        ((lu0.C88650c) an0.C79592a.m96648a().mo109709e()).mo123091e(r7, r8, -102);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x06fd, code lost:
        fn0.C87002g.m108022p(5, r4, r10 + r8 + " pos2 " + fn0.C87002g.m108013g(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x071c, code lost:
        if (r5 != null) goto L_0x071e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x071e, code lost:
        r5.mo120747d(r8, -103);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0723, code lost:
        ((lu0.C88650c) an0.C79592a.m96648a().mo109709e()).mo123091e(r7, r8, -103);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0766, code lost:
        if (r5 == null) goto L_0x0664;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        fn0.C87002g.m108022p(3, r4, "preloadSync head total preload " + r11 + " bytes");
        r7.close();
        fn0.C87002g.m108022p(4, r4, r26);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0204, code lost:
        r11 = r50;
        r12 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0209, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x020a, code lost:
        fn0.C87002g.m108022p(4, r4, r3 + r0);
        r11 = r50;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0221, code lost:
        if (r11 != null) goto L_0x0223;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0223, code lost:
        r11.mo120747d(r8, com.tencent.p014mm.plugin.appbrand.appstorage.ZipJNI.UNZ_CRCERROR);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0226, code lost:
        r12 = r28;
        ((lu0.C88650c) an0.C79592a.m96648a().mo109709e()).mo123091e(r12, r8, com.tencent.p014mm.plugin.appbrand.appstorage.ZipJNI.UNZ_CRCERROR);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x025c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x025d, code lost:
        r27 = r2;
        r1 = "preloadSync head preload finish";
        r40 = r12;
        r12 = r3;
        r3 = r40;
        r26 = ", url=";
        r5 = "preloadSync error preload ";
        r2 = r17;
        r23 = -1;
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0272, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0273, code lost:
        r40 = r12;
        r12 = r3;
        r2 = r40;
        r1 = "preloadSync head preload finish";
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x027f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0280, code lost:
        r27 = r2;
        r25 = "preloadSync error preload ";
        r1 = "preloadSync head preload finish";
        r40 = r12;
        r12 = r3;
        r3 = r40;
        r23 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0304, code lost:
        if (r11 == null) goto L_0x0309;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0306, code lost:
        r11.mo120747d(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0309, code lost:
        ((lu0.C88650c) an0.C79592a.m96648a().mo109709e()).mo123091e(r12, r8, r1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0338 A[SYNTHETIC, Splitter:B:103:0x0338] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x03cb  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x04a1 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x05e2 A[ExcHandler: all (r0v65 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:170:0x050b] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x05ea A[ExcHandler: IOException (e java.io.IOException), Splitter:B:170:0x050b] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0616 A[Catch:{ all -> 0x076a }] */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0683 A[Catch:{ all -> 0x076a }] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x06fd A[Catch:{ all -> 0x076a }] */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x07bf  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0272 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:12:0x00af] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x027f A[ExcHandler: IOException (e java.io.IOException), Splitter:B:12:0x00af] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02bb A[Catch:{ all -> 0x0318 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:210:0x05f3=Splitter:B:210:0x05f3, B:225:0x067b=Splitter:B:225:0x067b} */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo120762f(java.lang.String r42, long r43, long r45, int r47, boolean r48, boolean r49, dn0.C86357a r50) {
        /*
            r41 = this;
            r1 = r41
            r8 = r42
            r9 = r43
            r11 = r50
            java.lang.String r12 = " bytes for url "
            java.lang.String r13 = "preloadSync error preload "
            java.lang.String r14 = "preloadSync head preload finish"
            java.lang.String r15 = "preloadSync head total preload "
            java.lang.String r7 = "preloadSync head closeException "
            java.util.Set<java.lang.String> r0 = r1.f251101b
            boolean r0 = r0.contains(r8)
            r6 = 0
            r5 = 4
            if (r0 == 0) goto L_0x0038
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "preloadSync, same url in preloading, url="
            r0.append(r2)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "VideoManager"
            fn0.C87002g.m108022p(r5, r2, r0)
            return r6
        L_0x0038:
            dn0.o r2 = r1.f251100a
            r4 = 1
            r0 = 1
            r16 = 10
            java.lang.String r17 = "video/mp4"
            r3 = r42
            r5 = r0
            r6 = r17
            r17 = r12
            r12 = r7
            r7 = r16
            java.lang.String r2 = r2.mo120766c(r3, r4, r5, r6, r7)
            java.lang.String r3 = fn0.C87002g.m108018l(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "VideoManager/preloadSync/"
            r0.append(r4)
            r0.append(r3)
            java.lang.String r4 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "preloadSync, preloadBytes="
            r0.append(r5)
            r0.append(r9)
            java.lang.String r5 = ", url="
            r0.append(r5)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            r6 = 4
            fn0.C87002g.m108022p(r6, r4, r0)
            java.util.Set<java.lang.String> r0 = r1.f251101b
            r0.add(r8)
            if (r11 == 0) goto L_0x008c
            r11.mo120745b(r8)
        L_0x008c:
            an0.a r0 = an0.C79592a.m96648a()
            en0.a r0 = r0.mo109709e()
            lu0.c r0 = (lu0.C88650c) r0
            r0.mo123092f(r3, r8)
            r19 = -1
            java.lang.String r6 = " bytes"
            if (r48 == 0) goto L_0x0498
            r21 = 0
            if (r2 == 0) goto L_0x0498
            cn0.j r7 = new cn0.j
            java.lang.String r0 = "com.tencent.mm.video"
            r1 = 0
            r7.<init>(r0, r1, r1)
            r0 = 512(0x200, float:7.175E-43)
            byte[] r1 = new byte[r0]
            cn0.g r0 = new cn0.g     // Catch:{ a -> 0x031c, IOException -> 0x027f, all -> 0x0272 }
            android.net.Uri r24 = android.net.Uri.parse(r2)     // Catch:{ a -> 0x025c, IOException -> 0x027f, all -> 0x0272 }
            r25 = 0
            r27 = 0
            r29 = -1
            r31 = 0
            r32 = 0
            r33 = 0
            r23 = r0
            r23.<init>(r24, r25, r27, r29, r31, r32, r33)     // Catch:{ a -> 0x025c, IOException -> 0x027f, all -> 0x0272 }
            r7.mo109837b(r0)     // Catch:{ a -> 0x025c, IOException -> 0x027f, all -> 0x0272 }
            long r23 = r7.mo109835a()     // Catch:{ a -> 0x025c, IOException -> 0x027f, all -> 0x0272 }
            int r0 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r0 != 0) goto L_0x00d3
            r9 = r23
        L_0x00d3:
            r25 = 5000(0x1388, double:2.4703E-320)
            int r0 = (r45 > r25 ? 1 : (r45 == r25 ? 0 : -1))
            if (r0 <= 0) goto L_0x0188
            r25 = 8
            long r25 = r25 * r23
            r27 = r2
            r28 = r3
            long r2 = r25 / r45
            int r0 = (int) r2     // Catch:{ a -> 0x0177, IOException -> 0x016a, all -> 0x015e }
            int r0 = r0 * 1000
            r2 = r47
            int r2 = r2 / 1000
            int r2 = r2 * r0
            int r2 = r2 / 8
            r25 = 800(0x320, double:3.953E-321)
            r29 = 1000(0x3e8, double:4.94E-321)
            long r29 = r45 / r29
            r3 = r12
            long r11 = r29 * r25
            r25 = r13
            r26 = r14
            long r13 = (long) r2
            long r13 = r13 + r11
            long r9 = java.lang.Math.min(r9, r13)     // Catch:{ a -> 0x014b, IOException -> 0x0143, all -> 0x0137 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ a -> 0x014b, IOException -> 0x0143, all -> 0x0137 }
            r13.<init>()     // Catch:{ a -> 0x014b, IOException -> 0x0143, all -> 0x0137 }
            java.lang.String r14 = "preloadSync head start, bitrate="
            r13.append(r14)     // Catch:{ a -> 0x014b, IOException -> 0x0143, all -> 0x0137 }
            r13.append(r0)     // Catch:{ a -> 0x014b, IOException -> 0x0143, all -> 0x0137 }
            java.lang.String r0 = ", headerBytesCount= "
            r13.append(r0)     // Catch:{ a -> 0x014b, IOException -> 0x0143, all -> 0x0137 }
            r13.append(r11)     // Catch:{ a -> 0x014b, IOException -> 0x0143, all -> 0x0137 }
            java.lang.String r0 = ", durationBytesCount="
            r13.append(r0)     // Catch:{ a -> 0x014b, IOException -> 0x0143, all -> 0x0137 }
            r13.append(r2)     // Catch:{ a -> 0x014b, IOException -> 0x0143, all -> 0x0137 }
            java.lang.String r0 = ", maxPreloadBytes="
            r13.append(r0)     // Catch:{ a -> 0x014b, IOException -> 0x0143, all -> 0x0137 }
            r13.append(r9)     // Catch:{ a -> 0x014b, IOException -> 0x0143, all -> 0x0137 }
            r13.append(r5)     // Catch:{ a -> 0x014b, IOException -> 0x0143, all -> 0x0137 }
            r13.append(r8)     // Catch:{ a -> 0x014b, IOException -> 0x0143, all -> 0x0137 }
            java.lang.String r0 = r13.toString()     // Catch:{ a -> 0x014b, IOException -> 0x0143, all -> 0x0137 }
            r2 = 4
            fn0.C87002g.m108022p(r2, r4, r0)     // Catch:{ a -> 0x014b, IOException -> 0x0143, all -> 0x0137 }
            goto L_0x01af
        L_0x0137:
            r0 = move-exception
            r11 = r50
            r2 = r3
            r13 = r21
            r1 = r26
            r12 = r28
            goto L_0x027c
        L_0x0143:
            r0 = move-exception
            r11 = r50
            r13 = r21
            r1 = r26
            goto L_0x0173
        L_0x014b:
            r0 = move-exception
            r11 = r50
            r2 = r17
            r13 = r21
            r1 = r26
            r12 = r28
        L_0x0156:
            r17 = r3
            r26 = r5
            r5 = r25
            goto L_0x0330
        L_0x015e:
            r0 = move-exception
            r11 = r50
            r3 = r0
            r2 = r12
            r1 = r14
            r13 = r21
            r12 = r28
            goto L_0x0451
        L_0x016a:
            r0 = move-exception
            r3 = r12
            r25 = r13
            r11 = r50
            r1 = r14
            r13 = r21
        L_0x0173:
            r12 = r28
            goto L_0x028e
        L_0x0177:
            r0 = move-exception
            r11 = r50
            r26 = r5
            r5 = r13
            r1 = r14
            r2 = r17
            r13 = r21
            r17 = r12
            r12 = r28
            goto L_0x0330
        L_0x0188:
            r27 = r2
            r28 = r3
            r3 = r12
            r25 = r13
            r26 = r14
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ a -> 0x024c, IOException -> 0x0244, all -> 0x0239 }
            r0.<init>()     // Catch:{ a -> 0x024c, IOException -> 0x0244, all -> 0x0239 }
            java.lang.String r2 = "preloadSync head url "
            r0.append(r2)     // Catch:{ a -> 0x024c, IOException -> 0x0244, all -> 0x0239 }
            r0.append(r8)     // Catch:{ a -> 0x024c, IOException -> 0x0244, all -> 0x0239 }
            java.lang.String r2 = " maxPreloadBytes "
            r0.append(r2)     // Catch:{ a -> 0x024c, IOException -> 0x0244, all -> 0x0239 }
            r0.append(r9)     // Catch:{ a -> 0x024c, IOException -> 0x0244, all -> 0x0239 }
            java.lang.String r0 = r0.toString()     // Catch:{ a -> 0x024c, IOException -> 0x0244, all -> 0x0239 }
            r2 = 4
            fn0.C87002g.m108022p(r2, r4, r0)     // Catch:{ a -> 0x024c, IOException -> 0x0244, all -> 0x0239 }
        L_0x01af:
            r11 = r21
        L_0x01b1:
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x01e4
            r0 = 512(0x200, float:7.175E-43)
            r2 = 0
            int r13 = r7.mo109838c(r1, r2, r0)     // Catch:{ a -> 0x01d8, IOException -> 0x01ce, all -> 0x01c3 }
            long r13 = (long) r13
            int r18 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            if (r18 == 0) goto L_0x01e5
            long r11 = r11 + r13
            goto L_0x01b1
        L_0x01c3:
            r0 = move-exception
            r2 = r3
            r13 = r11
            r1 = r26
            r12 = r28
            r11 = r50
            goto L_0x027c
        L_0x01ce:
            r0 = move-exception
            r13 = r11
            r1 = r26
            r12 = r28
            r11 = r50
            goto L_0x028e
        L_0x01d8:
            r0 = move-exception
            r13 = r11
            r2 = r17
            r1 = r26
            r12 = r28
            r11 = r50
            goto L_0x0156
        L_0x01e4:
            r2 = 0
        L_0x01e5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0209 }
            r0.<init>()     // Catch:{ Exception -> 0x0209 }
            r0.append(r15)     // Catch:{ Exception -> 0x0209 }
            r0.append(r11)     // Catch:{ Exception -> 0x0209 }
            r0.append(r6)     // Catch:{ Exception -> 0x0209 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0209 }
            r1 = 3
            fn0.C87002g.m108022p(r1, r4, r0)     // Catch:{ Exception -> 0x0209 }
            r7.close()     // Catch:{ Exception -> 0x0209 }
            r1 = r26
            r7 = 4
            fn0.C87002g.m108022p(r7, r4, r1)     // Catch:{ Exception -> 0x0209 }
            r11 = r50
            r12 = r28
            goto L_0x0235
        L_0x0209:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 4
            fn0.C87002g.m108022p(r1, r4, r0)
            r11 = r50
            r1 = -105(0xffffffffffffff97, float:NaN)
            if (r11 == 0) goto L_0x0226
            r11.mo120747d(r8, r1)
        L_0x0226:
            an0.a r0 = an0.C79592a.m96648a()
            en0.a r0 = r0.mo109709e()
            lu0.c r0 = (lu0.C88650c) r0
            r12 = r28
            r0.mo123091e(r12, r8, r1)
        L_0x0235:
            r26 = r5
            goto L_0x049f
        L_0x0239:
            r0 = move-exception
            r11 = r50
            r12 = r28
            r2 = r3
            r13 = r21
            r1 = r26
            goto L_0x027c
        L_0x0244:
            r0 = move-exception
            r11 = r50
            r1 = r26
            r12 = r28
            goto L_0x028c
        L_0x024c:
            r0 = move-exception
            r11 = r50
            r1 = r26
            r12 = r28
            r26 = r5
            r2 = r17
            r13 = r21
            r5 = r25
            goto L_0x026e
        L_0x025c:
            r0 = move-exception
            r27 = r2
            r1 = r14
            r40 = r12
            r12 = r3
            r3 = r40
            r26 = r5
            r5 = r13
            r2 = r17
            r23 = r19
            r13 = r21
        L_0x026e:
            r17 = r3
            goto L_0x0330
        L_0x0272:
            r0 = move-exception
            r40 = r12
            r12 = r3
            r3 = r40
            r2 = r3
            r1 = r14
            r13 = r21
        L_0x027c:
            r3 = r0
            goto L_0x0451
        L_0x027f:
            r0 = move-exception
            r27 = r2
            r25 = r13
            r1 = r14
            r40 = r12
            r12 = r3
            r3 = r40
            r23 = r19
        L_0x028c:
            r13 = r21
        L_0x028e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0318 }
            r2.<init>()     // Catch:{ all -> 0x0318 }
            r26 = r5
            r5 = r25
            r2.append(r5)     // Catch:{ all -> 0x0318 }
            r2.append(r9)     // Catch:{ all -> 0x0318 }
            r5 = r17
            r2.append(r5)     // Catch:{ all -> 0x0318 }
            r2.append(r8)     // Catch:{ all -> 0x0318 }
            java.lang.String r5 = " pos3 "
            r2.append(r5)     // Catch:{ all -> 0x0318 }
            java.lang.String r0 = fn0.C87002g.m108013g(r0)     // Catch:{ all -> 0x0318 }
            r2.append(r0)     // Catch:{ all -> 0x0318 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0318 }
            r2 = 5
            fn0.C87002g.m108022p(r2, r4, r0)     // Catch:{ all -> 0x0318 }
            if (r11 == 0) goto L_0x02c0
            r2 = -104(0xffffffffffffff98, float:NaN)
            r11.mo120747d(r8, r2)     // Catch:{ all -> 0x0318 }
        L_0x02c0:
            an0.a r0 = an0.C79592a.m96648a()     // Catch:{ all -> 0x0318 }
            en0.a r0 = r0.mo109709e()     // Catch:{ all -> 0x0318 }
            lu0.c r0 = (lu0.C88650c) r0     // Catch:{ all -> 0x0318 }
            r2 = -104(0xffffffffffffff98, float:NaN)
            r0.mo123091e(r12, r8, r2)     // Catch:{ all -> 0x0318 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02ee }
            r0.<init>()     // Catch:{ Exception -> 0x02ee }
            r0.append(r15)     // Catch:{ Exception -> 0x02ee }
            r0.append(r13)     // Catch:{ Exception -> 0x02ee }
            r0.append(r6)     // Catch:{ Exception -> 0x02ee }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02ee }
            r2 = 3
            fn0.C87002g.m108022p(r2, r4, r0)     // Catch:{ Exception -> 0x02ee }
            r7.close()     // Catch:{ Exception -> 0x02ee }
            r2 = 4
            fn0.C87002g.m108022p(r2, r4, r1)     // Catch:{ Exception -> 0x02ee }
            goto L_0x049f
        L_0x02ee:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 4
            fn0.C87002g.m108022p(r1, r4, r0)
            r1 = -105(0xffffffffffffff97, float:NaN)
            if (r11 == 0) goto L_0x0309
        L_0x0306:
            r11.mo120747d(r8, r1)
        L_0x0309:
            an0.a r0 = an0.C79592a.m96648a()
            en0.a r0 = r0.mo109709e()
            lu0.c r0 = (lu0.C88650c) r0
            r0.mo123091e(r12, r8, r1)
            goto L_0x049f
        L_0x0318:
            r0 = move-exception
            r2 = r3
            goto L_0x027c
        L_0x031c:
            r0 = move-exception
            r27 = r2
            r26 = r5
            r5 = r13
            r1 = r14
            r2 = r17
            r40 = r12
            r12 = r3
            r3 = r40
            r17 = r3
            r23 = r19
            r13 = r21
        L_0x0330:
            java.lang.Throwable r3 = r0.getCause()     // Catch:{ all -> 0x044c }
            boolean r3 = r3 instanceof java.net.ProtocolException     // Catch:{ all -> 0x044c }
            if (r3 == 0) goto L_0x03cb
            java.lang.String r3 = r0.getMessage()     // Catch:{ all -> 0x03c5 }
            if (r3 == 0) goto L_0x037f
            java.lang.String r3 = r0.getMessage()     // Catch:{ all -> 0x03c5 }
            java.lang.String r3 = r3.toLowerCase()     // Catch:{ all -> 0x03c5 }
            r21 = r1
            java.lang.String r1 = "unexpected end of stream"
            boolean r1 = r3.contains(r1)     // Catch:{ all -> 0x03bd }
            if (r1 == 0) goto L_0x0381
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x03bd }
            r0.<init>()     // Catch:{ all -> 0x03bd }
            java.lang.String r1 = "preloadSync head preload interrupted totalPreloadedBytes="
            r0.append(r1)     // Catch:{ all -> 0x03bd }
            r0.append(r13)     // Catch:{ all -> 0x03bd }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x03bd }
            r1 = 4
            fn0.C87002g.m108022p(r1, r4, r0)     // Catch:{ all -> 0x03bd }
            if (r11 == 0) goto L_0x036e
            r1 = -101(0xffffffffffffff9b, float:NaN)
            r11.mo120747d(r8, r1)     // Catch:{ all -> 0x03bd }
        L_0x036e:
            an0.a r0 = an0.C79592a.m96648a()     // Catch:{ all -> 0x03bd }
            en0.a r0 = r0.mo109709e()     // Catch:{ all -> 0x03bd }
            lu0.c r0 = (lu0.C88650c) r0     // Catch:{ all -> 0x03bd }
            r1 = -101(0xffffffffffffff9b, float:NaN)
            r0.mo123091e(r12, r8, r1)     // Catch:{ all -> 0x03bd }
            goto L_0x0408
        L_0x037f:
            r21 = r1
        L_0x0381:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x03bd }
            r1.<init>()     // Catch:{ all -> 0x03bd }
            r1.append(r5)     // Catch:{ all -> 0x03bd }
            r1.append(r9)     // Catch:{ all -> 0x03bd }
            r1.append(r2)     // Catch:{ all -> 0x03bd }
            r1.append(r8)     // Catch:{ all -> 0x03bd }
            java.lang.String r2 = " pos1 "
            r1.append(r2)     // Catch:{ all -> 0x03bd }
            java.lang.String r0 = fn0.C87002g.m108013g(r0)     // Catch:{ all -> 0x03bd }
            r1.append(r0)     // Catch:{ all -> 0x03bd }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x03bd }
            r1 = 5
            fn0.C87002g.m108022p(r1, r4, r0)     // Catch:{ all -> 0x03bd }
            if (r11 == 0) goto L_0x03ad
            r1 = -102(0xffffffffffffff9a, float:NaN)
            r11.mo120747d(r8, r1)     // Catch:{ all -> 0x03bd }
        L_0x03ad:
            an0.a r0 = an0.C79592a.m96648a()     // Catch:{ all -> 0x03bd }
            en0.a r0 = r0.mo109709e()     // Catch:{ all -> 0x03bd }
            lu0.c r0 = (lu0.C88650c) r0     // Catch:{ all -> 0x03bd }
            r1 = -102(0xffffffffffffff9a, float:NaN)
            r0.mo123091e(r12, r8, r1)     // Catch:{ all -> 0x03bd }
            goto L_0x0408
        L_0x03bd:
            r0 = move-exception
            r3 = r0
            r2 = r17
            r1 = r21
            goto L_0x0451
        L_0x03c5:
            r0 = move-exception
            r3 = r0
            r2 = r17
            goto L_0x0451
        L_0x03cb:
            r21 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0445 }
            r1.<init>()     // Catch:{ all -> 0x0445 }
            r1.append(r5)     // Catch:{ all -> 0x0445 }
            r1.append(r9)     // Catch:{ all -> 0x0445 }
            r1.append(r2)     // Catch:{ all -> 0x0445 }
            r1.append(r8)     // Catch:{ all -> 0x0445 }
            java.lang.String r2 = " pos2 "
            r1.append(r2)     // Catch:{ all -> 0x0445 }
            java.lang.String r0 = fn0.C87002g.m108013g(r0)     // Catch:{ all -> 0x0445 }
            r1.append(r0)     // Catch:{ all -> 0x0445 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0445 }
            r1 = 5
            fn0.C87002g.m108022p(r1, r4, r0)     // Catch:{ all -> 0x0445 }
            if (r11 == 0) goto L_0x03f9
            r1 = -103(0xffffffffffffff99, float:NaN)
            r11.mo120747d(r8, r1)     // Catch:{ all -> 0x03bd }
        L_0x03f9:
            an0.a r0 = an0.C79592a.m96648a()     // Catch:{ all -> 0x0445 }
            en0.a r0 = r0.mo109709e()     // Catch:{ all -> 0x0445 }
            lu0.c r0 = (lu0.C88650c) r0     // Catch:{ all -> 0x0445 }
            r1 = -103(0xffffffffffffff99, float:NaN)
            r0.mo123091e(r12, r8, r1)     // Catch:{ all -> 0x0445 }
        L_0x0408:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0429 }
            r0.<init>()     // Catch:{ Exception -> 0x0429 }
            r0.append(r15)     // Catch:{ Exception -> 0x0429 }
            r0.append(r13)     // Catch:{ Exception -> 0x0429 }
            r0.append(r6)     // Catch:{ Exception -> 0x0429 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0429 }
            r1 = 3
            fn0.C87002g.m108022p(r1, r4, r0)     // Catch:{ Exception -> 0x0429 }
            r7.close()     // Catch:{ Exception -> 0x0429 }
            r1 = r21
            r2 = 4
            fn0.C87002g.m108022p(r2, r4, r1)     // Catch:{ Exception -> 0x0429 }
            goto L_0x049f
        L_0x0429:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = r17
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 4
            fn0.C87002g.m108022p(r1, r4, r0)
            r1 = -105(0xffffffffffffff97, float:NaN)
            if (r11 == 0) goto L_0x0309
            goto L_0x0306
        L_0x0445:
            r0 = move-exception
            r2 = r17
            r1 = r21
            goto L_0x027c
        L_0x044c:
            r0 = move-exception
            r2 = r17
            goto L_0x027c
        L_0x0451:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x046f }
            r0.<init>()     // Catch:{ Exception -> 0x046f }
            r0.append(r15)     // Catch:{ Exception -> 0x046f }
            r0.append(r13)     // Catch:{ Exception -> 0x046f }
            r0.append(r6)     // Catch:{ Exception -> 0x046f }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x046f }
            r5 = 3
            fn0.C87002g.m108022p(r5, r4, r0)     // Catch:{ Exception -> 0x046f }
            r7.close()     // Catch:{ Exception -> 0x046f }
            r5 = 4
            fn0.C87002g.m108022p(r5, r4, r1)     // Catch:{ Exception -> 0x046f }
            goto L_0x0497
        L_0x046f:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 4
            fn0.C87002g.m108022p(r1, r4, r0)
            r1 = -105(0xffffffffffffff97, float:NaN)
            if (r11 == 0) goto L_0x048a
            r11.mo120747d(r8, r1)
        L_0x048a:
            an0.a r0 = an0.C79592a.m96648a()
            en0.a r0 = r0.mo109709e()
            lu0.c r0 = (lu0.C88650c) r0
            r0.mo123091e(r12, r8, r1)
        L_0x0497:
            throw r3
        L_0x0498:
            r27 = r2
            r12 = r3
            r26 = r5
            r23 = r19
        L_0x049f:
            if (r49 == 0) goto L_0x07b4
            if (r27 == 0) goto L_0x07b4
            cn0.j r3 = new cn0.j
            java.lang.String r0 = "com.tencent.mm.video"
            r5 = 0
            r3.<init>(r0, r5, r5)
            r0 = 512(0x200, float:7.175E-43)
            byte[] r5 = new byte[r0]
            java.lang.String r7 = "preloadSync tail error for url "
            java.lang.String r13 = "preloadSync tail preload finish"
            java.lang.String r14 = "preloadSync tail total preload "
            java.lang.String r15 = "preloadSync tail closeException "
            int r17 = (r23 > r19 ? 1 : (r23 == r19 ? 0 : -1))
            if (r17 != 0) goto L_0x04fa
            cn0.g r1 = new cn0.g     // Catch:{ a -> 0x04f2, IOException -> 0x04e9, all -> 0x04e1 }
            android.net.Uri r29 = android.net.Uri.parse(r27)     // Catch:{ a -> 0x04f2, IOException -> 0x04e9, all -> 0x04e1 }
            r30 = 0
            r32 = 0
            r34 = -1
            r36 = 0
            r37 = 0
            r38 = 0
            r28 = r1
            r28.<init>(r29, r30, r32, r34, r36, r37, r38)     // Catch:{ a -> 0x04f2, IOException -> 0x04e9, all -> 0x04e1 }
            r3.mo109837b(r1)     // Catch:{ a -> 0x04f2, IOException -> 0x04e9, all -> 0x04e1 }
            long r23 = r3.mo109835a()     // Catch:{ a -> 0x04f2, IOException -> 0x04e9, all -> 0x04e1 }
            r3.close()     // Catch:{ a -> 0x04f2, IOException -> 0x04e9, all -> 0x04e1 }
            goto L_0x04fa
        L_0x04e1:
            r0 = move-exception
            r1 = r0
            r5 = r11
            r7 = r12
        L_0x04e5:
            r9 = 0
            goto L_0x076d
        L_0x04e9:
            r0 = move-exception
            r46 = r7
            r5 = r11
            r7 = r12
        L_0x04ee:
            r1 = 0
            goto L_0x05f3
        L_0x04f2:
            r0 = move-exception
            r10 = r7
            r5 = r11
            r7 = r12
        L_0x04f6:
            r1 = 0
            goto L_0x067b
        L_0x04fa:
            r1 = r23
            int r17 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r17 != 0) goto L_0x0501
            r9 = r1
        L_0x0501:
            r17 = 1063675494(0x3f666666, float:0.9)
            float r0 = (float) r1
            float r0 = r0 * r17
            r28 = r12
            long r11 = (long) r0
            long r1 = r1 - r9
            long r9 = java.lang.Math.max(r1, r11)     // Catch:{ a -> 0x0673, IOException -> 0x05ea, all -> 0x05e2 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ a -> 0x05d7, IOException -> 0x05ea, all -> 0x05e2 }
            r0.<init>()     // Catch:{ a -> 0x05d7, IOException -> 0x05ea, all -> 0x05e2 }
            r46 = r7
            java.lang.String r7 = "preloadSync tail positionWanted="
            r0.append(r7)     // Catch:{ a -> 0x05d3, IOException -> 0x05cf, all -> 0x05e2 }
            r0.append(r11)     // Catch:{ a -> 0x05d3, IOException -> 0x05cf, all -> 0x05e2 }
            java.lang.String r7 = ", positionMax="
            r0.append(r7)     // Catch:{ a -> 0x05d3, IOException -> 0x05cf, all -> 0x05e2 }
            r0.append(r1)     // Catch:{ a -> 0x05d3, IOException -> 0x05cf, all -> 0x05e2 }
            java.lang.String r1 = ", position="
            r0.append(r1)     // Catch:{ a -> 0x05d3, IOException -> 0x05cf, all -> 0x05e2 }
            r0.append(r9)     // Catch:{ a -> 0x05d3, IOException -> 0x05cf, all -> 0x05e2 }
            r1 = r26
            r0.append(r1)     // Catch:{ a -> 0x05d3, IOException -> 0x05cf, all -> 0x05e2 }
            r0.append(r8)     // Catch:{ a -> 0x05d3, IOException -> 0x05cf, all -> 0x05e2 }
            java.lang.String r0 = r0.toString()     // Catch:{ a -> 0x05d3, IOException -> 0x05cf, all -> 0x05e2 }
            r1 = 4
            fn0.C87002g.m108022p(r1, r4, r0)     // Catch:{ a -> 0x05d3, IOException -> 0x05cf, all -> 0x05e2 }
            cn0.g r0 = new cn0.g     // Catch:{ a -> 0x05d3, IOException -> 0x05cf, all -> 0x05e2 }
            android.net.Uri r30 = android.net.Uri.parse(r27)     // Catch:{ a -> 0x05d3, IOException -> 0x05cf, all -> 0x05e2 }
            r35 = -1
            r37 = 0
            r38 = 0
            r39 = 0
            r29 = r0
            r31 = r9
            r33 = r9
            r29.<init>(r30, r31, r33, r35, r37, r38, r39)     // Catch:{ a -> 0x05d3, IOException -> 0x05cf, all -> 0x05e2 }
            r3.mo109837b(r0)     // Catch:{ a -> 0x05d3, IOException -> 0x05cf, all -> 0x05e2 }
            r1 = 0
        L_0x055b:
            r0 = 512(0x200, float:7.175E-43)
            r7 = 0
            int r9 = r3.mo109838c(r5, r7, r0)     // Catch:{ a -> 0x05c6, IOException -> 0x05c0, all -> 0x05b9 }
            long r9 = (long) r9
            int r11 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r11 == 0) goto L_0x0569
            long r1 = r1 + r9
            goto L_0x055b
        L_0x0569:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x058e }
            r0.<init>()     // Catch:{ Exception -> 0x058e }
            r0.append(r14)     // Catch:{ Exception -> 0x058e }
            r0.append(r1)     // Catch:{ Exception -> 0x058e }
            r0.append(r6)     // Catch:{ Exception -> 0x058e }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x058e }
            r1 = 3
            fn0.C87002g.m108022p(r1, r4, r0)     // Catch:{ Exception -> 0x058e }
            r3.close()     // Catch:{ Exception -> 0x058e }
            r1 = 4
            fn0.C87002g.m108022p(r1, r4, r13)     // Catch:{ Exception -> 0x058e }
            r1 = r41
            r5 = r50
            r7 = r28
            goto L_0x07b8
        L_0x058e:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 4
            fn0.C87002g.m108022p(r1, r4, r0)
            r5 = r50
            r1 = -105(0xffffffffffffff97, float:NaN)
            if (r5 == 0) goto L_0x05ab
            r5.mo120747d(r8, r1)
        L_0x05ab:
            an0.a r0 = an0.C79592a.m96648a()
            en0.a r0 = r0.mo109709e()
            lu0.c r0 = (lu0.C88650c) r0
            r7 = r28
            goto L_0x066e
        L_0x05b9:
            r0 = move-exception
            r5 = r50
            r7 = r28
            goto L_0x076b
        L_0x05c0:
            r0 = move-exception
            r5 = r50
            r7 = r28
            goto L_0x05f3
        L_0x05c6:
            r0 = move-exception
            r5 = r50
            r7 = r28
            r10 = r46
            goto L_0x067b
        L_0x05cf:
            r0 = move-exception
            r5 = r50
            goto L_0x05ef
        L_0x05d3:
            r0 = move-exception
            r5 = r50
            goto L_0x05dc
        L_0x05d7:
            r0 = move-exception
            r5 = r50
            r46 = r7
        L_0x05dc:
            r7 = r28
            r10 = r46
            goto L_0x04f6
        L_0x05e2:
            r0 = move-exception
            r5 = r50
            r7 = r28
            r1 = r0
            goto L_0x04e5
        L_0x05ea:
            r0 = move-exception
            r5 = r50
            r46 = r7
        L_0x05ef:
            r7 = r28
            goto L_0x04ee
        L_0x05f3:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x076a }
            r9.<init>()     // Catch:{ all -> 0x076a }
            r10 = r46
            r9.append(r10)     // Catch:{ all -> 0x076a }
            r9.append(r8)     // Catch:{ all -> 0x076a }
            java.lang.String r10 = " pos3 "
            r9.append(r10)     // Catch:{ all -> 0x076a }
            java.lang.String r0 = fn0.C87002g.m108013g(r0)     // Catch:{ all -> 0x076a }
            r9.append(r0)     // Catch:{ all -> 0x076a }
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x076a }
            r9 = 5
            fn0.C87002g.m108022p(r9, r4, r0)     // Catch:{ all -> 0x076a }
            if (r5 == 0) goto L_0x061b
            r9 = -104(0xffffffffffffff98, float:NaN)
            r5.mo120747d(r8, r9)     // Catch:{ all -> 0x076a }
        L_0x061b:
            an0.a r0 = an0.C79592a.m96648a()     // Catch:{ all -> 0x076a }
            en0.a r0 = r0.mo109709e()     // Catch:{ all -> 0x076a }
            lu0.c r0 = (lu0.C88650c) r0     // Catch:{ all -> 0x076a }
            r9 = -104(0xffffffffffffff98, float:NaN)
            r0.mo123091e(r7, r8, r9)     // Catch:{ all -> 0x076a }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0649 }
            r0.<init>()     // Catch:{ Exception -> 0x0649 }
            r0.append(r14)     // Catch:{ Exception -> 0x0649 }
            r0.append(r1)     // Catch:{ Exception -> 0x0649 }
            r0.append(r6)     // Catch:{ Exception -> 0x0649 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0649 }
            r1 = 3
            fn0.C87002g.m108022p(r1, r4, r0)     // Catch:{ Exception -> 0x0649 }
            r3.close()     // Catch:{ Exception -> 0x0649 }
            r1 = 4
            fn0.C87002g.m108022p(r1, r4, r13)     // Catch:{ Exception -> 0x0649 }
            goto L_0x07b6
        L_0x0649:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 4
            fn0.C87002g.m108022p(r1, r4, r0)
            r1 = -105(0xffffffffffffff97, float:NaN)
            if (r5 == 0) goto L_0x0664
        L_0x0661:
            r5.mo120747d(r8, r1)
        L_0x0664:
            an0.a r0 = an0.C79592a.m96648a()
            en0.a r0 = r0.mo109709e()
            lu0.c r0 = (lu0.C88650c) r0
        L_0x066e:
            r0.mo123091e(r7, r8, r1)
            goto L_0x07b6
        L_0x0673:
            r0 = move-exception
            r5 = r50
            r10 = r7
            r7 = r28
            goto L_0x04f6
        L_0x067b:
            java.lang.Throwable r9 = r0.getCause()     // Catch:{ all -> 0x076a }
            boolean r9 = r9 instanceof java.net.ProtocolException     // Catch:{ all -> 0x076a }
            if (r9 == 0) goto L_0x06fd
            java.lang.String r9 = r0.getMessage()     // Catch:{ all -> 0x076a }
            if (r9 == 0) goto L_0x06c7
            java.lang.String r9 = r0.getMessage()     // Catch:{ all -> 0x076a }
            java.lang.String r9 = r9.toLowerCase()     // Catch:{ all -> 0x076a }
            java.lang.String r11 = "unexpected end of stream"
            boolean r9 = r9.contains(r11)     // Catch:{ all -> 0x076a }
            if (r9 == 0) goto L_0x06c7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x076a }
            r0.<init>()     // Catch:{ all -> 0x076a }
            java.lang.String r9 = "preloadSync tail preload interrupted totalPreloadedBytes="
            r0.append(r9)     // Catch:{ all -> 0x076a }
            r0.append(r1)     // Catch:{ all -> 0x076a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x076a }
            r9 = 4
            fn0.C87002g.m108022p(r9, r4, r0)     // Catch:{ all -> 0x076a }
            if (r5 == 0) goto L_0x06b7
            r9 = -101(0xffffffffffffff9b, float:NaN)
            r5.mo120747d(r8, r9)     // Catch:{ all -> 0x076a }
        L_0x06b7:
            an0.a r0 = an0.C79592a.m96648a()     // Catch:{ all -> 0x076a }
            en0.a r0 = r0.mo109709e()     // Catch:{ all -> 0x076a }
            lu0.c r0 = (lu0.C88650c) r0     // Catch:{ all -> 0x076a }
            r9 = -101(0xffffffffffffff9b, float:NaN)
            r0.mo123091e(r7, r8, r9)     // Catch:{ all -> 0x076a }
            goto L_0x0732
        L_0x06c7:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x076a }
            r9.<init>()     // Catch:{ all -> 0x076a }
            r9.append(r10)     // Catch:{ all -> 0x076a }
            r9.append(r8)     // Catch:{ all -> 0x076a }
            java.lang.String r10 = " pos1 "
            r9.append(r10)     // Catch:{ all -> 0x076a }
            java.lang.String r0 = fn0.C87002g.m108013g(r0)     // Catch:{ all -> 0x076a }
            r9.append(r0)     // Catch:{ all -> 0x076a }
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x076a }
            r9 = 5
            fn0.C87002g.m108022p(r9, r4, r0)     // Catch:{ all -> 0x076a }
            if (r5 == 0) goto L_0x06ed
            r9 = -102(0xffffffffffffff9a, float:NaN)
            r5.mo120747d(r8, r9)     // Catch:{ all -> 0x076a }
        L_0x06ed:
            an0.a r0 = an0.C79592a.m96648a()     // Catch:{ all -> 0x076a }
            en0.a r0 = r0.mo109709e()     // Catch:{ all -> 0x076a }
            lu0.c r0 = (lu0.C88650c) r0     // Catch:{ all -> 0x076a }
            r9 = -102(0xffffffffffffff9a, float:NaN)
            r0.mo123091e(r7, r8, r9)     // Catch:{ all -> 0x076a }
            goto L_0x0732
        L_0x06fd:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x076a }
            r9.<init>()     // Catch:{ all -> 0x076a }
            r9.append(r10)     // Catch:{ all -> 0x076a }
            r9.append(r8)     // Catch:{ all -> 0x076a }
            java.lang.String r10 = " pos2 "
            r9.append(r10)     // Catch:{ all -> 0x076a }
            java.lang.String r0 = fn0.C87002g.m108013g(r0)     // Catch:{ all -> 0x076a }
            r9.append(r0)     // Catch:{ all -> 0x076a }
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x076a }
            r9 = 5
            fn0.C87002g.m108022p(r9, r4, r0)     // Catch:{ all -> 0x076a }
            if (r5 == 0) goto L_0x0723
            r9 = -103(0xffffffffffffff99, float:NaN)
            r5.mo120747d(r8, r9)     // Catch:{ all -> 0x076a }
        L_0x0723:
            an0.a r0 = an0.C79592a.m96648a()     // Catch:{ all -> 0x076a }
            en0.a r0 = r0.mo109709e()     // Catch:{ all -> 0x076a }
            lu0.c r0 = (lu0.C88650c) r0     // Catch:{ all -> 0x076a }
            r9 = -103(0xffffffffffffff99, float:NaN)
            r0.mo123091e(r7, r8, r9)     // Catch:{ all -> 0x076a }
        L_0x0732:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0750 }
            r0.<init>()     // Catch:{ Exception -> 0x0750 }
            r0.append(r14)     // Catch:{ Exception -> 0x0750 }
            r0.append(r1)     // Catch:{ Exception -> 0x0750 }
            r0.append(r6)     // Catch:{ Exception -> 0x0750 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0750 }
            r1 = 3
            fn0.C87002g.m108022p(r1, r4, r0)     // Catch:{ Exception -> 0x0750 }
            r3.close()     // Catch:{ Exception -> 0x0750 }
            r1 = 4
            fn0.C87002g.m108022p(r1, r4, r13)     // Catch:{ Exception -> 0x0750 }
            goto L_0x07b6
        L_0x0750:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 4
            fn0.C87002g.m108022p(r1, r4, r0)
            r1 = -105(0xffffffffffffff97, float:NaN)
            if (r5 == 0) goto L_0x0664
            goto L_0x0661
        L_0x076a:
            r0 = move-exception
        L_0x076b:
            r9 = r1
            r1 = r0
        L_0x076d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x078b }
            r0.<init>()     // Catch:{ Exception -> 0x078b }
            r0.append(r14)     // Catch:{ Exception -> 0x078b }
            r0.append(r9)     // Catch:{ Exception -> 0x078b }
            r0.append(r6)     // Catch:{ Exception -> 0x078b }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x078b }
            r2 = 3
            fn0.C87002g.m108022p(r2, r4, r0)     // Catch:{ Exception -> 0x078b }
            r3.close()     // Catch:{ Exception -> 0x078b }
            r2 = 4
            fn0.C87002g.m108022p(r2, r4, r13)     // Catch:{ Exception -> 0x078b }
            goto L_0x07b3
        L_0x078b:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r15)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r2 = 4
            fn0.C87002g.m108022p(r2, r4, r0)
            r2 = -105(0xffffffffffffff97, float:NaN)
            if (r5 == 0) goto L_0x07a6
            r5.mo120747d(r8, r2)
        L_0x07a6:
            an0.a r0 = an0.C79592a.m96648a()
            en0.a r0 = r0.mo109709e()
            lu0.c r0 = (lu0.C88650c) r0
            r0.mo123091e(r7, r8, r2)
        L_0x07b3:
            throw r1
        L_0x07b4:
            r5 = r11
            r7 = r12
        L_0x07b6:
            r1 = r41
        L_0x07b8:
            java.util.Set<java.lang.String> r0 = r1.f251101b
            r0.remove(r8)
            if (r5 == 0) goto L_0x07c2
            r5.mo120746c(r8)
        L_0x07c2:
            an0.a r0 = an0.C79592a.m96648a()
            en0.a r0 = r0.mo109709e()
            lu0.c r0 = (lu0.C88650c) r0
            r0.mo123090d(r7, r8)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dn0.C86368m.mo120762f(java.lang.String, long, long, int, boolean, boolean, dn0.a):boolean");
    }
}
