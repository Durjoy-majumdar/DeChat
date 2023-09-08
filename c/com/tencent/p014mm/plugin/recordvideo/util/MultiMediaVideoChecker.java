package com.tencent.p014mm.plugin.recordvideo.util;

import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.sight.base.C94555d;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import gy3.C87412m;
import java.util.HashMap;
import kotlin.Metadata;
import p232rw.C63679m;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/util/MultiMediaVideoChecker;", "", "", "path", "Lrw/m$a;", "getVideoInfoBySightJNI", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker */
public final class MultiMediaVideoChecker {

    /* renamed from: a */
    public static final MultiMediaVideoChecker f273077a = new MultiMediaVideoChecker();

    /* renamed from: b */
    public static final HashMap<String, C63679m.C63680a> f273078b = new HashMap<>();

    private final C63679m.C63680a getVideoInfoBySightJNI(String str) {
        try {
            C94554a c = C94555d.m119567c(str, true);
            if (c == null) {
                return null;
            }
            int i = c.f273456n;
            if (i < 0) {
                i = SightVideoJNI.getMp4RotateVFS(str);
            }
            C63679m.C63680a aVar = new C63679m.C63680a(c.f273445c, c.f273446d, (float) c.f273447e, (long) c.f273443a, c.f273444b, i, false, c.f273449g, c.f273448f, c.f273450h, c.f273454l);
            aVar.f180536l = c;
            return aVar;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0027 A[Catch:{ Exception -> 0x0021, all -> 0x001e }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002c A[Catch:{ Exception -> 0x0021, all -> 0x001e }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0037 A[SYNTHETIC, Splitter:B:22:0x0037] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0042 A[Catch:{ Exception -> 0x0021, all -> 0x001e }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x004f A[SYNTHETIC, Splitter:B:33:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x005a A[Catch:{ Exception -> 0x0021, all -> 0x001e }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0068 A[SYNTHETIC, Splitter:B:44:0x0068] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0072 A[Catch:{ Exception -> 0x0021, all -> 0x001e }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0079 A[Catch:{ Exception -> 0x0021, all -> 0x001e }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x009d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p232rw.C63679m.C63680a mo129929a(java.lang.String r24) {
        /*
            r23 = this;
            r0 = r24
            java.lang.String r1 = "path"
            gy3.C87412m.m108594g(r0, r1)
            r1 = 0
            o80.a r2 = new o80.a     // Catch:{ Exception -> 0x0099, all -> 0x0092 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0099, all -> 0x0092 }
            android.media.MediaFormat r0 = r2.f329159f     // Catch:{ Exception -> 0x0021, all -> 0x001e }
            java.lang.String r3 = "durationUs"
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0024
            boolean r6 = r0.containsKey(r3)     // Catch:{ Exception -> 0x0021, all -> 0x001e }
            if (r6 != r4) goto L_0x0024
            r6 = 1
            goto L_0x0025
        L_0x001e:
            r0 = move-exception
            goto L_0x0090
        L_0x0021:
            goto L_0x009b
        L_0x0024:
            r6 = 0
        L_0x0025:
            if (r6 == 0) goto L_0x002c
            long r6 = r0.getLong(r3)     // Catch:{ Exception -> 0x0021, all -> 0x001e }
            goto L_0x002e
        L_0x002c:
            r6 = 0
        L_0x002e:
            r3 = 1000(0x3e8, float:1.401E-42)
            long r8 = (long) r3     // Catch:{ Exception -> 0x0021, all -> 0x001e }
            long r14 = r6 / r8
            java.lang.String r3 = "bitrate"
            if (r0 == 0) goto L_0x003f
            boolean r6 = r0.containsKey(r3)     // Catch:{ Exception -> 0x0021, all -> 0x001e }
            if (r6 != r4) goto L_0x003f
            r6 = 1
            goto L_0x0040
        L_0x003f:
            r6 = 0
        L_0x0040:
            if (r6 == 0) goto L_0x0049
            int r3 = r0.getInteger(r3)     // Catch:{ Exception -> 0x0021, all -> 0x001e }
            r19 = r3
            goto L_0x004b
        L_0x0049:
            r19 = 0
        L_0x004b:
            java.lang.String r3 = "channel-count"
            if (r0 == 0) goto L_0x0057
            boolean r6 = r0.containsKey(r3)     // Catch:{ Exception -> 0x0021, all -> 0x001e }
            if (r6 != r4) goto L_0x0057
            r6 = 1
            goto L_0x0058
        L_0x0057:
            r6 = 0
        L_0x0058:
            if (r6 == 0) goto L_0x0061
            int r3 = r0.getInteger(r3)     // Catch:{ Exception -> 0x0021, all -> 0x001e }
            r20 = r3
            goto L_0x0063
        L_0x0061:
            r20 = 0
        L_0x0063:
            java.lang.String r3 = "sample-rate"
            if (r0 == 0) goto L_0x006f
            boolean r6 = r0.containsKey(r3)     // Catch:{ Exception -> 0x0021, all -> 0x001e }
            if (r6 != r4) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r4 = 0
        L_0x0070:
            if (r4 == 0) goto L_0x0079
            int r5 = r0.getInteger(r3)     // Catch:{ Exception -> 0x0021, all -> 0x001e }
            r21 = r5
            goto L_0x007b
        L_0x0079:
            r21 = 0
        L_0x007b:
            rw.m$a r0 = new rw.m$a     // Catch:{ Exception -> 0x0021, all -> 0x001e }
            r11 = 0
            r12 = 0
            r13 = 0
            r16 = 0
            r17 = 0
            r18 = 1
            r22 = -1
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x0021, all -> 0x001e }
            r2.mo161327e()
            return r0
        L_0x0090:
            r1 = r2
            goto L_0x0093
        L_0x0092:
            r0 = move-exception
        L_0x0093:
            if (r1 == 0) goto L_0x0098
            r1.mo161327e()
        L_0x0098:
            throw r0
        L_0x0099:
            r2 = r1
        L_0x009b:
            if (r2 == 0) goto L_0x00a0
            r2.mo161327e()
        L_0x00a0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.recordvideo.util.MultiMediaVideoChecker.mo129929a(java.lang.String):rw.m$a");
    }

    /* renamed from: b */
    public final C63679m.C63680a mo129930b(String str) {
        C87412m.m108594g(str, "path");
        return mo129931c(str, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:124:0x017e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x017f, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00d6, code lost:
        r21 = "MicroMsg.MultiMediaVideoChecker";
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x013b A[SYNTHETIC, Splitter:B:103:0x013b] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0147 A[Catch:{ Exception -> 0x0183, all -> 0x017e }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0155 A[SYNTHETIC, Splitter:B:114:0x0155] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0163 A[Catch:{ Exception -> 0x0183, all -> 0x017e }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x016a A[Catch:{ Exception -> 0x0183, all -> 0x017e }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x017e A[ExcHandler: all (th java.lang.Throwable), Splitter:B:20:0x0060] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0091 A[Catch:{ Exception -> 0x00d6, all -> 0x017e }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009b A[SYNTHETIC, Splitter:B:34:0x009b] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a6 A[Catch:{ Exception -> 0x00d6, all -> 0x017e }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b0 A[SYNTHETIC, Splitter:B:44:0x00b0] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bb A[Catch:{ Exception -> 0x00d6, all -> 0x017e }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ce A[SYNTHETIC, Splitter:B:57:0x00ce] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00de A[Catch:{ Exception -> 0x00d6, all -> 0x017e }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00e8 A[SYNTHETIC, Splitter:B:69:0x00e8] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f3 A[Catch:{ Exception -> 0x00d6, all -> 0x017e }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f8 A[Catch:{ Exception -> 0x00d6, all -> 0x017e }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00fb A[Catch:{ Exception -> 0x00d6, all -> 0x017e }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x010d A[Catch:{ Exception -> 0x0183, all -> 0x017e }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0112 A[Catch:{ Exception -> 0x0183, all -> 0x017e }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0117 A[Catch:{ Exception -> 0x0183, all -> 0x017e }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0129 A[Catch:{ Exception -> 0x0183, all -> 0x017e }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x012b A[Catch:{ Exception -> 0x0183, all -> 0x017e }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x012e A[Catch:{ Exception -> 0x0183, all -> 0x017e }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p232rw.C63679m.C63680a mo129931c(java.lang.String r23, boolean r24) {
        /*
            r22 = this;
            r0 = r23
            java.lang.String r1 = "path"
            gy3.C87412m.m108594g(r0, r1)
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r23)
            r3 = 1
            java.lang.String r4 = "MicroMsg.MultiMediaVideoChecker"
            if (r1 == 0) goto L_0x01cc
            if (r24 == 0) goto L_0x0022
            java.util.HashMap<java.lang.String, rw.m$a> r1 = f273078b
            java.lang.Object r5 = r1.get(r0)
            if (r5 == 0) goto L_0x0022
            java.lang.Object r0 = r1.get(r0)
            rw.m$a r0 = (p232rw.C63679m.C63680a) r0
            return r0
        L_0x0022:
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            rw.m$a r1 = r22.getVideoInfoBySightJNI(r23)
            r7 = 1000(0x3e8, float:1.401E-42)
            if (r1 == 0) goto L_0x003d
            boolean r8 = r1.mo88493g()
            if (r8 == 0) goto L_0x003d
            int r8 = r1.f180534j
            if (r8 >= r7) goto L_0x0039
            goto L_0x003d
        L_0x0039:
            r21 = r4
            goto L_0x0198
        L_0x003d:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "getVideoInfo: jni info invalid "
            r8.append(r9)
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r8)
            if (r1 == 0) goto L_0x0058
            int r1 = r1.f180535k
            r20 = r1
            goto L_0x005b
        L_0x0058:
            r1 = -1
            r20 = -1
        L_0x005b:
            o80.a r1 = new o80.a     // Catch:{ Exception -> 0x018d, all -> 0x0185 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x018d, all -> 0x0185 }
            android.media.MediaFormat r8 = r1.f329158e     // Catch:{ Exception -> 0x0181, all -> 0x017e }
            android.media.MediaFormat r9 = r1.f329159f     // Catch:{ Exception -> 0x0181, all -> 0x017e }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0181, all -> 0x017e }
            r10.<init>()     // Catch:{ Exception -> 0x0181, all -> 0x017e }
            java.lang.String r11 = "videoFormat:"
            r10.append(r11)     // Catch:{ Exception -> 0x0181, all -> 0x017e }
            r10.append(r8)     // Catch:{ Exception -> 0x0181, all -> 0x017e }
            java.lang.String r11 = ", audioFormat:"
            r10.append(r11)     // Catch:{ Exception -> 0x0181, all -> 0x017e }
            r10.append(r9)     // Catch:{ Exception -> 0x0181, all -> 0x017e }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x0181, all -> 0x017e }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r10)     // Catch:{ Exception -> 0x0181, all -> 0x017e }
            java.lang.String r10 = "width"
            if (r8 == 0) goto L_0x008e
            boolean r12 = r8.containsKey(r10)     // Catch:{ Exception -> 0x00d6, all -> 0x017e }
            if (r12 != r3) goto L_0x008e
            r12 = 1
            goto L_0x008f
        L_0x008e:
            r12 = 0
        L_0x008f:
            if (r12 == 0) goto L_0x0096
            int r10 = r8.getInteger(r10)     // Catch:{ Exception -> 0x00d6, all -> 0x017e }
            goto L_0x0097
        L_0x0096:
            r10 = 0
        L_0x0097:
            java.lang.String r12 = "height"
            if (r8 == 0) goto L_0x00a3
            boolean r13 = r8.containsKey(r12)     // Catch:{ Exception -> 0x00d6, all -> 0x017e }
            if (r13 != r3) goto L_0x00a3
            r13 = 1
            goto L_0x00a4
        L_0x00a3:
            r13 = 0
        L_0x00a4:
            if (r13 == 0) goto L_0x00ab
            int r12 = r8.getInteger(r12)     // Catch:{ Exception -> 0x00d6, all -> 0x017e }
            goto L_0x00ac
        L_0x00ab:
            r12 = 0
        L_0x00ac:
            java.lang.String r13 = "durationUs"
            if (r8 == 0) goto L_0x00b8
            boolean r14 = r8.containsKey(r13)     // Catch:{ Exception -> 0x00d6, all -> 0x017e }
            if (r14 != r3) goto L_0x00b8
            r14 = 1
            goto L_0x00b9
        L_0x00b8:
            r14 = 0
        L_0x00b9:
            if (r14 == 0) goto L_0x00c0
            long r13 = r8.getLong(r13)     // Catch:{ Exception -> 0x00d6, all -> 0x017e }
            goto L_0x00c2
        L_0x00c0:
            r13 = 0
        L_0x00c2:
            r15 = r12
            long r11 = (long) r7
            long r12 = r13 / r11
            int r7 = com.tencent.p014mm.plugin.sight.base.SightVideoJNI.getMp4RotateVFS(r23)     // Catch:{ Exception -> 0x0181, all -> 0x017e }
            java.lang.String r11 = "frame-rate"
            if (r8 == 0) goto L_0x00db
            boolean r14 = r8.containsKey(r11)     // Catch:{ Exception -> 0x00d6, all -> 0x017e }
            if (r14 != r3) goto L_0x00db
            r14 = 1
            goto L_0x00dc
        L_0x00d6:
            r21 = r4
            goto L_0x0191
        L_0x00db:
            r14 = 0
        L_0x00dc:
            if (r14 == 0) goto L_0x00e3
            int r11 = r8.getInteger(r11)     // Catch:{ Exception -> 0x00d6, all -> 0x017e }
            goto L_0x00e4
        L_0x00e3:
            r11 = 0
        L_0x00e4:
            java.lang.String r14 = "bitrate"
            if (r8 == 0) goto L_0x00f0
            boolean r2 = r8.containsKey(r14)     // Catch:{ Exception -> 0x00d6, all -> 0x017e }
            if (r2 != r3) goto L_0x00f0
            r2 = 1
            goto L_0x00f1
        L_0x00f0:
            r2 = 0
        L_0x00f1:
            if (r2 == 0) goto L_0x00f8
            int r2 = r8.getInteger(r14)     // Catch:{ Exception -> 0x00d6, all -> 0x017e }
            goto L_0x00f9
        L_0x00f8:
            r2 = 0
        L_0x00f9:
            if (r2 > 0) goto L_0x00fd
            int r2 = r1.f329160g     // Catch:{ Exception -> 0x00d6, all -> 0x017e }
        L_0x00fd:
            java.lang.String r3 = "mime"
            if (r8 == 0) goto L_0x010d
            r21 = r4
            boolean r4 = r8.containsKey(r3)     // Catch:{ Exception -> 0x0183, all -> 0x017e }
            r0 = 1
            if (r4 != r0) goto L_0x010f
            r0 = 1
            goto L_0x0110
        L_0x010d:
            r21 = r4
        L_0x010f:
            r0 = 0
        L_0x0110:
            if (r0 == 0) goto L_0x0117
            java.lang.String r0 = r8.getString(r3)     // Catch:{ Exception -> 0x0183, all -> 0x017e }
            goto L_0x0119
        L_0x0117:
            java.lang.String r0 = ""
        L_0x0119:
            java.lang.String r3 = "video/hevc"
            boolean r0 = gy3.C87412m.m108589b(r0, r3)     // Catch:{ Exception -> 0x0183, all -> 0x017e }
            if (r9 == 0) goto L_0x012b
            boolean r3 = r9.containsKey(r14)     // Catch:{ Exception -> 0x0183, all -> 0x017e }
            r4 = 1
            if (r3 != r4) goto L_0x012b
            r3 = 1
            goto L_0x012c
        L_0x012b:
            r3 = 0
        L_0x012c:
            if (r3 == 0) goto L_0x0135
            int r3 = r9.getInteger(r14)     // Catch:{ Exception -> 0x0183, all -> 0x017e }
            r17 = r3
            goto L_0x0137
        L_0x0135:
            r17 = 0
        L_0x0137:
            java.lang.String r3 = "channel-count"
            if (r9 == 0) goto L_0x0144
            boolean r4 = r9.containsKey(r3)     // Catch:{ Exception -> 0x0183, all -> 0x017e }
            r8 = 1
            if (r4 != r8) goto L_0x0144
            r4 = 1
            goto L_0x0145
        L_0x0144:
            r4 = 0
        L_0x0145:
            if (r4 == 0) goto L_0x014e
            int r3 = r9.getInteger(r3)     // Catch:{ Exception -> 0x0183, all -> 0x017e }
            r18 = r3
            goto L_0x0150
        L_0x014e:
            r18 = 0
        L_0x0150:
            java.lang.String r3 = "sample-rate"
            if (r9 == 0) goto L_0x015f
            boolean r4 = r9.containsKey(r3)     // Catch:{ Exception -> 0x0183, all -> 0x017e }
            r8 = 1
            if (r4 != r8) goto L_0x015f
            r16 = 1
            goto L_0x0161
        L_0x015f:
            r16 = 0
        L_0x0161:
            if (r16 == 0) goto L_0x016a
            int r3 = r9.getInteger(r3)     // Catch:{ Exception -> 0x0183, all -> 0x017e }
            r19 = r3
            goto L_0x016c
        L_0x016a:
            r19 = 0
        L_0x016c:
            rw.m$a r3 = new rw.m$a     // Catch:{ Exception -> 0x0183, all -> 0x017e }
            float r11 = (float) r11     // Catch:{ Exception -> 0x0183, all -> 0x017e }
            r8 = r3
            r9 = r10
            r10 = r15
            r14 = r2
            r15 = r7
            r16 = r0
            r8.<init>(r9, r10, r11, r12, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x0183, all -> 0x017e }
            r1.mo161327e()
            r2 = r3
            goto L_0x0197
        L_0x017e:
            r0 = move-exception
            r2 = r1
            goto L_0x0187
        L_0x0181:
            r21 = r4
        L_0x0183:
            goto L_0x0191
        L_0x0185:
            r0 = move-exception
            r2 = 0
        L_0x0187:
            if (r2 == 0) goto L_0x018c
            r2.mo161327e()
        L_0x018c:
            throw r0
        L_0x018d:
            r21 = r4
            r1 = 0
        L_0x0191:
            if (r1 == 0) goto L_0x0196
            r1.mo161327e()
        L_0x0196:
            r2 = 0
        L_0x0197:
            r1 = r2
        L_0x0198:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "getVideoInfo cost:"
            r0.append(r2)
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r5)
            r0.append(r2)
            java.lang.String r2 = ", info:"
            r0.append(r2)
            r0.append(r1)
            r2 = 32
            r0.append(r2)
            r2 = r23
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3 = r21
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            if (r1 == 0) goto L_0x01cb
            java.util.HashMap<java.lang.String, rw.m$a> r0 = f273078b
            r0.put(r2, r1)
        L_0x01cb:
            return r1
        L_0x01cc:
            r2 = r0
            r3 = r4
            com.tencent.mm.autogen.mmdata.rpt.TestKvReportStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.TestKvReportStruct
            r0.<init>()
            r1 = 2021(0x7e5, float:2.832E-42)
            r0.f266360g = r1
            java.lang.String r1 = "MsgExt"
            r4 = 1
            java.lang.String r1 = r0.mo86045b(r1, r2, r4)
            r0.f266359f = r1
            r0.mo86054n()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "file not exist: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.recordvideo.util.MultiMediaVideoChecker.mo129931c(java.lang.String, boolean):rw.m$a");
    }
}
