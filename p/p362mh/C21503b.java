package p362mh;

import android.media.AudioTrack;
import com.tencent.p014mm.sdk.platformtools.Log;
import p213oh.C11412b;
import p335eh.C116768d;
import p348ih.C21079c;
import p356lh.C21434h;

/* renamed from: mh.b */
public class C21503b extends C21502a {

    /* renamed from: p */
    public Thread f60890p;

    public C21503b(int i, int i2, C116768d dVar, C21434h hVar) {
        super(i, i2, dVar, hVar);
    }

    /* renamed from: b */
    public void mo33703b() {
        AudioTrack audioTrack = this.f60878a;
        if (audioTrack != null) {
            int state = audioTrack.getState();
            int playState = audioTrack.getPlayState();
            if (state == 1 && playState == 3) {
                try {
                    audioTrack.pause();
                    int playbackHeadPosition = audioTrack.getPlaybackHeadPosition();
                    this.f60887j = playbackHeadPosition;
                    Object[] objArr = {Integer.valueOf(playbackHeadPosition)};
                    int i = C11412b.f33577a;
                    Log.m105925i("MicroMsg.Mix.AudioPcmStaticPlayComponent", "pause startPos :%d", objArr);
                    Thread thread = this.f60890p;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Exception e) {
                    int i2 = C11412b.f33577a;
                    Log.printErrStackTrace("MicroMsg.Mix.AudioPcmStaticPlayComponent", e, "pause", new Object[0]);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e3 A[SYNTHETIC, Splitter:B:41:0x00e3] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo33704c(byte[] r15) {
        /*
            r14 = this;
            android.media.AudioTrack r0 = r14.f60878a
            r1 = 0
            r2 = 3536(0xdd0, float:4.955E-42)
            if (r0 != 0) goto L_0x00fb
            int r0 = p213oh.C11412b.f33577a
            java.lang.String r0 = "MicroMsg.Mix.AudioPcmStaticPlayComponent"
            java.lang.String r3 = "create AudioTrack before"
            r4 = 0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r4)
            int r3 = r14.f60880c
            r5 = 1
            if (r3 <= r5) goto L_0x001e
            java.lang.String r3 = "createAudioTrack fail count reach MAX COUNT"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r3, r4)
        L_0x001b:
            r5 = 0
            goto L_0x00d0
        L_0x001e:
            int r3 = r14.f60883f
            if (r3 != r5) goto L_0x0025
            r3 = 4
            r9 = 4
            goto L_0x0029
        L_0x0025:
            r3 = 12
            r9 = 12
        L_0x0029:
            int r3 = r14.f60882e
            r13 = 2
            int r3 = android.media.AudioTrack.getMinBufferSize(r3, r9, r13)
            eh.d r6 = r14.f60885h
            if (r6 == 0) goto L_0x0042
            int r6 = r6.mo180745k()
            if (r6 <= 0) goto L_0x0042
            eh.d r3 = r14.f60885h
            int r3 = r3.mo180745k()
            int r3 = r3 * 3536
        L_0x0042:
            double r6 = r14.f60884g
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 <= 0) goto L_0x0052
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 23
            if (r6 < r7) goto L_0x0052
            int r3 = r3 * 2
        L_0x0052:
            r11 = r3
            android.media.AudioTrack r3 = r14.f60878a
            if (r3 != 0) goto L_0x0076
            java.lang.String r3 = "new AudioTrack"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r4)
            java.lang.System.currentTimeMillis()
            android.media.AudioTrack r3 = new android.media.AudioTrack
            r7 = 3
            int r8 = r14.f60882e
            r10 = 2
            r12 = 0
            r6 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r14.f60878a = r3
            int r3 = r14.f60880c
            int r3 = r3 + r5
            r14.f60880c = r3
            java.util.concurrent.atomic.AtomicInteger r3 = p362mh.C21502a.f60876n
            r3.incrementAndGet()
        L_0x0076:
            android.media.AudioTrack r3 = r14.f60878a
            if (r3 == 0) goto L_0x009c
            android.media.AudioTrack r3 = r14.f60878a
            int r3 = r3.getState()
            if (r3 == r13) goto L_0x0083
            goto L_0x009c
        L_0x0083:
            java.util.concurrent.atomic.AtomicInteger r3 = p362mh.C21502a.f60877o
            r3.incrementAndGet()
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.util.concurrent.atomic.AtomicInteger r6 = p362mh.C21502a.f60877o
            int r6 = r6.get()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3[r1] = r6
            java.lang.String r6 = "audioTrackCount:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r6, r3)
            goto L_0x00d0
        L_0x009c:
            java.lang.String r3 = "audio track not initialized"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r3, r4)
            java.util.concurrent.atomic.AtomicInteger r3 = p362mh.C21502a.f60875m
            r3.incrementAndGet()
            android.media.AudioTrack r3 = r14.f60878a
            if (r3 == 0) goto L_0x001b
            java.lang.Object[] r3 = new java.lang.Object[r5]
            android.media.AudioTrack r5 = r14.f60878a
            int r5 = r5.getState()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r1] = r5
            java.lang.String r5 = "AudioTrack getState:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r5, r3)
            android.media.AudioTrack r3 = r14.f60878a     // Catch:{ Exception -> 0x00c6 }
            r3.release()     // Catch:{ Exception -> 0x00c6 }
            r14.f60878a = r4     // Catch:{ Exception -> 0x00c6 }
            goto L_0x001b
        L_0x00c6:
            r3 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.String r6 = "AudioTrack release"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r3, r6, r5)
            goto L_0x001b
        L_0x00d0:
            if (r5 != 0) goto L_0x00e3
            lh.h r15 = r14.f60886i
            if (r15 == 0) goto L_0x00dd
            r1 = 707(0x2c3, float:9.91E-43)
            ih.c r15 = (p348ih.C21079c) r15
            r15.mo32818l(r1)
        L_0x00dd:
            java.lang.String r15 = "create AudioTrack fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r15, r4)
            return
        L_0x00e3:
            android.media.AudioTrack r3 = r14.f60878a     // Catch:{ IllegalStateException -> 0x00ed }
            if (r3 == 0) goto L_0x00f6
            float r5 = r14.f60889l     // Catch:{ IllegalStateException -> 0x00ed }
            r3.setStereoVolume(r5, r5)     // Catch:{ IllegalStateException -> 0x00ed }
            goto L_0x00f6
        L_0x00ed:
            r3 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.String r6 = "setStereoVolume"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r3, r6, r5)
        L_0x00f6:
            java.lang.String r3 = "create AudioTrack after and success!"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r4)
        L_0x00fb:
            byte[] r0 = r14.f60879b
            if (r0 != 0) goto L_0x0119
            eh.d r0 = r14.f60885h
            if (r0 == 0) goto L_0x010a
            int r0 = r0.mo180745k()
            int r0 = r0 * 3536
            goto L_0x010c
        L_0x010a:
            r0 = 3536(0xdd0, float:4.955E-42)
        L_0x010c:
            if (r0 != 0) goto L_0x0110
            r0 = 3536(0xdd0, float:4.955E-42)
        L_0x0110:
            int r3 = r15.length
            if (r3 != r2) goto L_0x0115
            int r0 = r0 + 1
        L_0x0115:
            byte[] r0 = new byte[r0]
            r14.f60879b = r0
        L_0x0119:
            int r0 = r14.f60881d
            int r2 = r15.length
            int r2 = r2 + r0
            byte[] r3 = r14.f60879b
            int r4 = r3.length
            if (r2 > r4) goto L_0x012c
            int r2 = r15.length
            java.lang.System.arraycopy(r15, r1, r3, r0, r2)
            int r0 = r14.f60881d
            int r15 = r15.length
            int r0 = r0 + r15
            r14.f60881d = r0
        L_0x012c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p362mh.C21503b.mo33704c(byte[]):void");
    }

    /* renamed from: d */
    public void mo33705d() {
        long j;
        Object[] objArr = {Integer.valueOf(C21502a.f60876n.get()), Integer.valueOf(C21502a.f60875m.get())};
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioPcmStaticPlayComponent", "playFlush play_count:%d, fail_count:%d", objArr);
        if (this.f60878a != null) {
            C21434h hVar = this.f60886i;
            if (hVar != null) {
                ((C21079c) hVar).mo32829u();
            }
            AudioTrack audioTrack = this.f60878a;
            if (audioTrack.getState() == 2) {
                byte[] bArr = this.f60879b;
                if (audioTrack.write(bArr, 0, bArr.length) <= 0) {
                    Log.m105921e("MicroMsg.Mix.AudioPcmStaticPlayComponent", "AudioTrack write fail, should write length:%d", Integer.valueOf(this.f60879b.length));
                    ((C21079c) this.f60886i).mo32818l(708);
                    return;
                }
            }
            if (audioTrack.getState() == 1) {
                audioTrack.reloadStaticData();
                mo33709h(this.f60884g);
                audioTrack.play();
                this.f60890p = Thread.currentThread();
                try {
                    long j2 = this.f60885h.f350075d;
                    if (j2 <= 0) {
                        j = 2000;
                    } else {
                        j = j2 + (j2 < 1000 ? 240 : 120);
                    }
                    Thread.sleep(j);
                } catch (Exception unused) {
                    Log.m105921e("MicroMsg.Mix.AudioPcmStaticPlayComponent", "play Thread.sleep", (Object[]) null);
                }
            }
        }
    }

    /* renamed from: f */
    public void mo33707f() {
        super.mo33707f();
        mo33706e();
        this.f60890p = null;
    }

    /* renamed from: g */
    public void mo33708g() {
        long j;
        AudioTrack audioTrack = this.f60878a;
        if (audioTrack != null && audioTrack.getState() == 1) {
            int i = C11412b.f33577a;
            Log.m105925i("MicroMsg.Mix.AudioPcmStaticPlayComponent", "resume", (Object[]) null);
            C21434h hVar = this.f60886i;
            if (hVar != null) {
                ((C21079c) hVar).mo32829u();
            }
            try {
                float f = this.f60889l;
                audioTrack.setStereoVolume(f, f);
            } catch (IllegalStateException e) {
                Log.printErrStackTrace("MicroMsg.Mix.AudioPcmStaticPlayComponent", e, "setStereoVolume", new Object[0]);
            }
            Log.m105925i("MicroMsg.Mix.AudioPcmStaticPlayComponent", "play startPos:%d", Integer.valueOf(this.f60887j));
            audioTrack.setPlaybackHeadPosition(this.f60887j);
            audioTrack.play();
            try {
                long j2 = this.f60885h.f350075d;
                if (j2 <= 0) {
                    j = 2000;
                } else {
                    j = j2 + (j2 < 1000 ? 240 : 120);
                }
                Thread.sleep(j);
            } catch (Exception unused) {
                Log.m105921e("MicroMsg.Mix.AudioPcmStaticPlayComponent", "play Thread.sleep", (Object[]) null);
            }
        }
    }
}
