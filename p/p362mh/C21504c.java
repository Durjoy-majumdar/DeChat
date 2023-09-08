package p362mh;

import com.tencent.p014mm.sdk.platformtools.Log;
import p213oh.C11412b;
import p335eh.C116768d;
import p356lh.C21434h;

/* renamed from: mh.c */
public class C21504c extends C21502a {
    public C21504c(int i, int i2, C116768d dVar, C21434h hVar) {
        super(i, i2, dVar, hVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0103  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo33704c(byte[] r14) {
        /*
            r13 = this;
            android.media.AudioTrack r0 = r13.f60878a
            r1 = 0
            if (r0 != 0) goto L_0x0128
            int r0 = p213oh.C11412b.f33577a
            java.lang.String r0 = "MicroMsg.Mix.AudioPcmStreamPlayComponent"
            java.lang.String r2 = "create AudioTrack before"
            r3 = 0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r3)
            java.lang.String r2 = "createAudioTrack"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r3)
            int r2 = r13.f60880c
            r4 = 1
            if (r2 <= r4) goto L_0x0021
            java.lang.String r2 = "createAudioTrack fail count reach MAX COUNT"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r2, r3)
        L_0x001e:
            r4 = 0
            goto L_0x00f0
        L_0x0021:
            int r2 = r13.f60883f
            if (r2 != r4) goto L_0x0028
            r2 = 4
            r8 = 4
            goto L_0x002c
        L_0x0028:
            r2 = 12
            r8 = 12
        L_0x002c:
            int r2 = r13.f60882e
            r12 = 2
            int r2 = android.media.AudioTrack.getMinBufferSize(r2, r8, r12)
            if (r2 > 0) goto L_0x0043
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4[r1] = r2
            java.lang.String r2 = "createAudioTrack miniBufferSize %d is illegal"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r2, r4)
            goto L_0x001e
        L_0x0043:
            double r5 = r13.f60884g
            r9 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x0053
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 23
            if (r5 < r6) goto L_0x0053
            int r2 = r2 * 2
        L_0x0053:
            r10 = r2
            android.media.AudioTrack r2 = r13.f60878a
            if (r2 != 0) goto L_0x0077
            java.lang.String r2 = "new AudioTrack"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r2, r3)
            java.lang.System.currentTimeMillis()
            android.media.AudioTrack r2 = new android.media.AudioTrack
            r6 = 3
            int r7 = r13.f60882e
            r9 = 2
            r11 = 1
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r13.f60878a = r2
            int r2 = r13.f60880c
            int r2 = r2 + r4
            r13.f60880c = r2
            java.util.concurrent.atomic.AtomicInteger r2 = p362mh.C21502a.f60876n
            r2.incrementAndGet()
        L_0x0077:
            android.media.AudioTrack r2 = r13.f60878a
            if (r2 == 0) goto L_0x009d
            android.media.AudioTrack r2 = r13.f60878a
            int r2 = r2.getState()
            if (r2 == r4) goto L_0x0084
            goto L_0x009d
        L_0x0084:
            java.util.concurrent.atomic.AtomicInteger r2 = p362mh.C21502a.f60877o
            r2.incrementAndGet()
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.util.concurrent.atomic.AtomicInteger r5 = p362mh.C21502a.f60877o
            int r5 = r5.get()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2[r1] = r5
            java.lang.String r5 = "audioTrackCount:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r5, r2)
            goto L_0x00f0
        L_0x009d:
            java.util.concurrent.atomic.AtomicInteger r2 = p362mh.C21502a.f60875m
            r2.incrementAndGet()
            java.lang.Object[] r2 = new java.lang.Object[r12]
            java.util.concurrent.atomic.AtomicInteger r5 = p362mh.C21502a.f60876n
            int r5 = r5.get()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2[r1] = r5
            java.util.concurrent.atomic.AtomicInteger r5 = p362mh.C21502a.f60875m
            int r5 = r5.get()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2[r4] = r5
            java.lang.String r5 = "play_count:%d, fail_count:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r5, r2)
            java.lang.String r2 = "audio track not initialized"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r2, r3)
            android.media.AudioTrack r2 = r13.f60878a
            if (r2 == 0) goto L_0x001e
            java.lang.Object[] r2 = new java.lang.Object[r4]
            android.media.AudioTrack r4 = r13.f60878a
            int r4 = r4.getState()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r1] = r4
            java.lang.String r4 = "AudioTrack getState:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r4, r2)
            android.media.AudioTrack r2 = r13.f60878a     // Catch:{ Exception -> 0x00e6 }
            r2.release()     // Catch:{ Exception -> 0x00e6 }
            r13.f60878a = r3     // Catch:{ Exception -> 0x00e6 }
            goto L_0x001e
        L_0x00e6:
            r2 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.String r5 = "AudioTrack release"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r2, r5, r4)
            goto L_0x001e
        L_0x00f0:
            if (r4 != 0) goto L_0x0103
            lh.h r14 = r13.f60886i
            if (r14 == 0) goto L_0x00fd
            r1 = 707(0x2c3, float:9.91E-43)
            ih.c r14 = (p348ih.C21079c) r14
            r14.mo32818l(r1)
        L_0x00fd:
            java.lang.String r14 = "create AudioTrack fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r14, r3)
            return
        L_0x0103:
            java.lang.String r2 = "create AudioTrack success"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r3)
            double r4 = r13.f60884g     // Catch:{ IllegalStateException -> 0x011a }
            r13.mo33709h(r4)     // Catch:{ IllegalStateException -> 0x011a }
            android.media.AudioTrack r2 = r13.f60878a     // Catch:{ IllegalStateException -> 0x011a }
            r2.play()     // Catch:{ IllegalStateException -> 0x011a }
            android.media.AudioTrack r2 = r13.f60878a     // Catch:{ IllegalStateException -> 0x011a }
            float r4 = r13.f60889l     // Catch:{ IllegalStateException -> 0x011a }
            r2.setStereoVolume(r4, r4)     // Catch:{ IllegalStateException -> 0x011a }
            goto L_0x0123
        L_0x011a:
            r2 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.String r5 = "setStereoVolume"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r2, r5, r4)
        L_0x0123:
            java.lang.String r2 = "create AudioTrack after"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r3)
        L_0x0128:
            lh.h r0 = r13.f60886i
            if (r0 == 0) goto L_0x0131
            ih.c r0 = (p348ih.C21079c) r0
            r0.mo32829u()
        L_0x0131:
            android.media.AudioTrack r0 = r13.f60878a
            float r2 = r13.f60889l
            r0.setStereoVolume(r2, r2)
            android.media.AudioTrack r0 = r13.f60878a
            int r2 = r14.length
            r0.write(r14, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p362mh.C21504c.mo33704c(byte[]):void");
    }

    /* renamed from: d */
    public void mo33705d() {
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioPcmStreamPlayComponent", "playFlush", (Object[]) null);
    }
}
