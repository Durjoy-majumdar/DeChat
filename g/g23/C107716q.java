package g23;

import android.media.MediaFormat;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.concurrent.ConcurrentHashMap;
import o80.C109993a;
import r80.C110536p;
import rx3.C13598b0;

/* renamed from: g23.q */
public final class C107716q implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C107718r f322301d;

    /* renamed from: g23.q$a */
    public static final class C107717a extends C87413o implements C32227p<MediaFormat, C110536p, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C107718r f322302d;

        /* renamed from: e */
        public final /* synthetic */ long f322303e;

        /* renamed from: f */
        public final /* synthetic */ C109993a f322304f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107717a(C107718r rVar, long j, C109993a aVar) {
            super(2);
            this.f322302d = rVar;
            this.f322303e = j;
            this.f322304f = aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            ConcurrentHashMap<String, C107696a> concurrentHashMap;
            C107696a aVar;
            MediaFormat mediaFormat = (MediaFormat) obj;
            C87412m.m108594g((C110536p) obj2, "checker");
            if (mediaFormat != null) {
                C107718r rVar = this.f322302d;
                long j = this.f322303e;
                C109993a aVar2 = this.f322304f;
                if (mediaFormat.containsKey("crop-left") || mediaFormat.containsKey("crop-top") || mediaFormat.containsKey("crop-right") || mediaFormat.containsKey("crop-bottom")) {
                    rVar.f322218h = mediaFormat.containsKey("crop-left") ? mediaFormat.getInteger("crop-left") : 0;
                    rVar.f322219i = mediaFormat.containsKey("crop-top") ? mediaFormat.getInteger("crop-top") : 0;
                    rVar.f322220j = mediaFormat.containsKey("crop-right") ? mediaFormat.getInteger("crop-right") : 0;
                    rVar.f322221k = mediaFormat.containsKey("crop-bottom") ? mediaFormat.getInteger("crop-bottom") : 0;
                    if (mediaFormat.containsKey("width") && mediaFormat.containsKey("height")) {
                        rVar.f322216f = mediaFormat.getInteger("width");
                        rVar.f322217g = mediaFormat.getInteger("height");
                    }
                    Log.m105924i("MicroMsg.VLogVideoPlayer", rVar.hashCode() + ' ' + rVar.f322214d.f282491c + " finish check crop rect:[" + rVar.f322218h + ", " + rVar.f322219i + ", " + rVar.f322220j + ", " + rVar.f322221k + "], width:" + rVar.f322216f + ", height:" + rVar.f322217g);
                    C107706i iVar = C107706i.f322258a;
                    String str = rVar.f322214d.f282491c;
                    int i = rVar.f322216f;
                    int i2 = rVar.f322217g;
                    int i3 = rVar.f322218h;
                    int i4 = rVar.f322219i;
                    int i5 = rVar.f322220j;
                    int i6 = rVar.f322221k;
                    C87412m.m108594g(str, "path");
                    if ((str.length() > 0) && (aVar = concurrentHashMap.get(str)) != null) {
                        Log.m105924i("MicroMsg.VLogMaterialsInfoCache", "updateCache, path:" + str + ", width:" + i + ", height:height, rotate:" + -1 + ", cropLeft:" + i3 + ", cropTop:" + i4 + ", cropRight:" + i5 + ", cropBottom:" + i6);
                        if (i > 0) {
                            aVar.f322204a = i;
                        }
                        if (i2 > 0) {
                            aVar.f322205b = i2;
                        }
                        if (i3 >= 0) {
                            aVar.f322207d = i3;
                        }
                        if (i4 >= 0) {
                            aVar.f322208e = i4;
                        }
                        if (i5 >= 0) {
                            aVar.f322209f = i5;
                        }
                        if (i6 >= 0) {
                            aVar.f322210g = i6;
                        }
                        (concurrentHashMap = C107706i.f322259b).put(str, aVar);
                    }
                }
                Log.m105924i("MicroMsg.VLogVideoPlayer", rVar.hashCode() + ' ' + rVar.f322214d.f282491c + " finish check crop rect, notify all, cost:" + Util.ticksToNow(j) + LocaleUtil.MALAY);
                aVar2.mo161327e();
            }
            return C13598b0.f38549a;
        }
    }

    public C107716q(C107718r rVar) {
        this.f322301d = rVar;
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [m80.f] */
    /* JADX WARNING: type inference failed for: r9v9, types: [m80.i] */
    /* JADX WARNING: type inference failed for: r10v7, types: [m80.j] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r20 = this;
            r1 = r20
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            g23.r r2 = r1.f322301d
            int r2 = r2.hashCode()
            r0.append(r2)
            r2 = 32
            r0.append(r2)
            g23.r r2 = r1.f322301d
            com.tencent.mm.plugin.vlog.model.c0 r2 = r2.f322214d
            java.lang.String r2 = r2.f282491c
            r0.append(r2)
            java.lang.String r2 = " start do check crop rect"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.VLogVideoPlayer"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            o80.a r0 = new o80.a
            g23.r r5 = r1.f322301d
            com.tencent.mm.plugin.vlog.model.c0 r5 = r5.f322214d
            java.lang.String r5 = r5.f282491c
            r0.<init>(r5)
            r80.p r5 = new r80.p
            r6 = 0
            r7 = 2
            r8 = 0
            r5.<init>(r0, r6, r7, r8)
            g23.q$a r7 = new g23.q$a
            g23.r r9 = r1.f322301d
            r7.<init>(r9, r3, r0)
            r5.f330542c = r7
            r0 = 23
            boolean r0 = p206nj.C11171e.m11046c(r0)     // Catch:{ Exception -> 0x00c3 }
            java.lang.String r9 = "durationUs"
            if (r0 == 0) goto L_0x008c
            m80.j r0 = new m80.j     // Catch:{ Exception -> 0x00c3 }
            r11 = 0
            o80.a r10 = r5.f330540a     // Catch:{ Exception -> 0x00c3 }
            android.media.MediaFormat r13 = r10.f329158e     // Catch:{ Exception -> 0x00c3 }
            if (r13 == 0) goto L_0x0066
            long r13 = r13.getLong(r9)     // Catch:{ Exception -> 0x00c3 }
            int r14 = (int) r13     // Catch:{ Exception -> 0x00c3 }
            goto L_0x0067
        L_0x0066:
            r14 = 0
        L_0x0067:
            if (r14 > 0) goto L_0x0075
            android.media.MediaFormat r10 = r10.f329159f     // Catch:{ Exception -> 0x00c3 }
            if (r10 == 0) goto L_0x0074
            long r9 = r10.getLong(r9)     // Catch:{ Exception -> 0x00c3 }
            int r10 = (int) r9     // Catch:{ Exception -> 0x00c3 }
            r14 = r10
            goto L_0x0075
        L_0x0074:
            r14 = 0
        L_0x0075:
            int r14 = r14 / 1000
            long r13 = (long) r14     // Catch:{ Exception -> 0x00c3 }
            o80.a r15 = r5.f330540a     // Catch:{ Exception -> 0x00c3 }
            r16 = 0
            r80.m r9 = new r80.m     // Catch:{ Exception -> 0x00c3 }
            r9.<init>(r5)     // Catch:{ Exception -> 0x00c3 }
            r17 = 0
            r18 = 0
            r10 = r0
            r19 = r9
            r10.<init>(r11, r13, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x00c3 }
            goto L_0x00c0
        L_0x008c:
            m80.i r0 = new m80.i     // Catch:{ Exception -> 0x00c3 }
            r10 = 0
            o80.a r12 = r5.f330540a     // Catch:{ Exception -> 0x00c3 }
            android.media.MediaFormat r13 = r12.f329158e     // Catch:{ Exception -> 0x00c3 }
            if (r13 == 0) goto L_0x009c
            long r13 = r13.getLong(r9)     // Catch:{ Exception -> 0x00c3 }
            int r14 = (int) r13     // Catch:{ Exception -> 0x00c3 }
            goto L_0x009d
        L_0x009c:
            r14 = 0
        L_0x009d:
            if (r14 > 0) goto L_0x00ab
            android.media.MediaFormat r12 = r12.f329159f     // Catch:{ Exception -> 0x00c3 }
            if (r12 == 0) goto L_0x00aa
            long r12 = r12.getLong(r9)     // Catch:{ Exception -> 0x00c3 }
            int r9 = (int) r12     // Catch:{ Exception -> 0x00c3 }
            r14 = r9
            goto L_0x00ab
        L_0x00aa:
            r14 = 0
        L_0x00ab:
            int r14 = r14 / 1000
            long r12 = (long) r14     // Catch:{ Exception -> 0x00c3 }
            o80.a r14 = r5.f330540a     // Catch:{ Exception -> 0x00c3 }
            r15 = 0
            r80.n r9 = new r80.n     // Catch:{ Exception -> 0x00c3 }
            r9.<init>(r5)     // Catch:{ Exception -> 0x00c3 }
            r16 = 0
            r17 = 0
            r18 = r9
            r9 = r0
            r9.<init>(r10, r12, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x00c3 }
        L_0x00c0:
            r5.f330541b = r0     // Catch:{ Exception -> 0x00c3 }
            goto L_0x00e2
        L_0x00c3:
            r0 = move-exception
            java.lang.String r9 = r5.f330546g
            java.lang.Object[] r10 = new java.lang.Object[r6]
            java.lang.String r11 = "start check init decoder error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r0, r11, r10)
            java.lang.String r0 = "MicroMsg.MediaEditorIDKeyStat"
            java.lang.String r9 = "markRemuxCheckCropRectFailed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r9)
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 986(0x3da, double:4.87E-321)
            r13 = 78
            r15 = 1
            r10.mo175913w(r11, r13, r15)
            r7.invoke(r8, r5)
        L_0x00e2:
            r80.o r0 = new r80.o
            r0.<init>(r5)
            java.lang.String r7 = "MediaCodecCheckVideoCropRect_decode"
            android.os.HandlerThread r0 = o40.C61926c.m72685j(r7, r6, r0)
            r5.f330547h = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            g23.r r5 = r1.f322301d
            int r5 = r5.hashCode()
            r0.append(r5)
            java.lang.String r5 = " checkCropRect finish cost "
            r0.append(r5)
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r3)
            r0.append(r3)
            java.lang.String r3 = "ms"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g23.C107716q.run():void");
    }
}
