package s62;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.view.Surface;
import com.tencent.p014mm.compatible.deviceinfo.C104619a;
import com.tencent.p014mm.feature.sight.api.ISightJNIService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import java.nio.ByteBuffer;

/* renamed from: s62.n */
public class C110774n extends C110767k {

    /* renamed from: A */
    public boolean f331366A = false;

    /* renamed from: B */
    public long f331367B = 0;

    /* renamed from: C */
    public float f331368C = 1.0f;

    /* renamed from: D */
    public long f331369D = -1;

    /* renamed from: w */
    public Surface f331370w;

    /* renamed from: x */
    public boolean f331371x = false;

    /* renamed from: y */
    public int f331372y;

    /* renamed from: z */
    public int f331373z;

    public C110774n(C110766j jVar, MMHandler mMHandler) {
        super(jVar, mMHandler);
    }

    /* renamed from: b */
    public C110765g mo162293b(String str) {
        return null;
    }

    /* renamed from: g */
    public void mo162298g(MediaFormat mediaFormat, String str, int i) {
        boolean z;
        int i2;
        super.mo162298g(mediaFormat, str, i);
        this.f331373z = mediaFormat.getInteger("height");
        this.f331372y = mediaFormat.getInteger("width");
        if (mediaFormat.containsKey("rotation-degrees")) {
            i2 = mediaFormat.getInteger("rotation-degrees");
            z = true;
        } else {
            i2 = ((ISightJNIService) C86312j.m106911c(ISightJNIService.class)).getMp4RotateVFS(this.f331314d);
            Log.m105929w("MicroMsg.VideoTrackDataSource", "%s it don't contains rotation key. degrees [%d]", mo162299i(), Integer.valueOf(i2));
            z = false;
        }
        if (Math.abs(i2) == 90 || Math.abs(i2) == 270) {
            int i3 = this.f331372y;
            this.f331372y = this.f331373z;
            this.f331373z = i3;
        }
        if (z) {
            i2 = 0;
        }
        this.f331313c.obtainMessage(4, this.f331372y, this.f331373z, Integer.valueOf(i2)).sendToTarget();
        Log.m105925i("MicroMsg.VideoTrackDataSource", "%s video size[%d, %d] degrees[%d]", mo162299i(), Integer.valueOf(this.f331372y), Integer.valueOf(this.f331373z), Integer.valueOf(i2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0048, code lost:
        r2 = r5.f331322l;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo162278h(com.tencent.p014mm.compatible.deviceinfo.C104619a r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.view.Surface r1 = r5.f331370w
            java.lang.String r2 = "MicroMsg.VideoTrackDataSource"
            r3 = 1
            if (r1 != 0) goto L_0x001b
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r4 = r5.mo162299i()
            r1[r0] = r4
            java.lang.String r4 = "%s decoder configure surface but surface is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r4, r1)
            r5.f331371x = r0
            goto L_0x001d
        L_0x001b:
            r5.f331371x = r3
        L_0x001d:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r4 = r5.mo162299i()
            r1[r0] = r4
            java.lang.String r4 = "%s handleDecoderBeforeStart"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r1)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r4 = r5.mo162299i()
            r1[r0] = r4
            android.view.Surface r4 = r5.f331370w
            boolean r4 = r4.isValid()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1[r3] = r4
            java.lang.String r3 = "%s before prepare init decoder, surface valid: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r1)
            oj.b r1 = r5.f331324n
            if (r1 == 0) goto L_0x0053
            int r2 = r5.f331322l
            r3 = -1
            if (r2 > r3) goto L_0x004e
            goto L_0x0053
        L_0x004e:
            android.media.MediaFormat r1 = r1.mo161386e(r2)
            goto L_0x0055
        L_0x0053:
            android.media.MediaFormat r1 = r5.f331319i
        L_0x0055:
            android.view.Surface r2 = r5.f331370w
            r3 = 0
            r6.mo148202a(r1, r2, r3, r0)
            r1 = 0
            r5.f331367B = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s62.C110774n.mo162278h(com.tencent.mm.compatible.deviceinfo.a):boolean");
    }

    /* renamed from: n */
    public boolean mo162281n(long j, long j2, C104619a aVar, ByteBuffer byteBuffer, int i, MediaCodec.BufferInfo bufferInfo) {
        boolean z;
        long j3 = j;
        C104619a aVar2 = aVar;
        int i2 = i;
        MediaCodec.BufferInfo bufferInfo2 = bufferInfo;
        Object[] objArr = new Object[8];
        objArr[0] = mo162299i();
        objArr[1] = Integer.valueOf(this.f331311a);
        objArr[2] = Long.valueOf(j);
        objArr[3] = Long.valueOf(j2);
        objArr[4] = Integer.valueOf(i);
        objArr[5] = Long.valueOf(bufferInfo2.presentationTimeUs);
        objArr[6] = Boolean.valueOf((bufferInfo2.flags & 1) != 0);
        objArr[7] = Integer.valueOf(bufferInfo2.flags);
        Log.m105919d("MicroMsg.VideoTrackDataSource", "%s start to process output buffer state %d time[%d, %d] index %d, pts:%s, keyframe:%s, flags:%s", objArr);
        if (this.f331311a == 10) {
            Log.m105925i("MicroMsg.VideoTrackDataSource", "%s video track flush surface", mo162299i());
            aVar2.mo148216r(i2, true);
            mo162306t(4);
            return true;
        }
        if (this.f331311a == 6) {
            long j4 = bufferInfo2.presentationTimeUs / 1000;
            long j5 = j3 - j4;
            Log.m105919d("MicroMsg.VideoTrackDataSource", "%s start to handle precision seek[%d, %d] diff[%d]", mo162299i(), Long.valueOf(j4), Long.valueOf(j), Long.valueOf(j5));
            if (j5 <= 30) {
                Log.m105925i("MicroMsg.VideoTrackDataSource", "%s precision seek done to surface", mo162299i());
                aVar2.mo148216r(i2, true);
                if (this.f331366A) {
                    mo162306t(7);
                    this.f331366A = false;
                }
                this.f331366A = true;
            } else {
                aVar2.mo148216r(i2, false);
            }
            return true;
        }
        int i3 = this.f331311a;
        if (!(i3 == 3 || i3 == 5 || i3 == 7)) {
            Log.m105925i("MicroMsg.VideoTrackDataSource", "%s it no need process buffer now state %d", mo162299i(), Integer.valueOf(this.f331311a));
            return false;
        }
        String str = "%s it no need process buffer now state %d";
        long j6 = bufferInfo2.presentationTimeUs / 1000;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j7 = elapsedRealtime - j2;
        long j8 = (long) (((((float) j6) / this.f331368C) - ((float) j3)) - ((float) j7));
        Log.m105919d("MicroMsg.VideoTrackDataSource", "%s earlyMs[%d] time[%d, %d, %d] sample[%d %d]", mo162299i(), Long.valueOf(j8), Long.valueOf(j7), Long.valueOf(elapsedRealtime), Long.valueOf(j2), Long.valueOf(j), Long.valueOf(j6));
        if (j8 < -30) {
            Log.m105919d("MicroMsg.VideoTrackDataSource", "%s finish to process but it too late to show video frame. throw now", mo162299i());
            aVar2.mo148216r(i2, false);
            this.f331312b.f331303h = 0;
            return true;
        } else if (j8 < 30) {
            this.f331312b.f331300e = bufferInfo2.presentationTimeUs;
            if (j8 > 11) {
                try {
                    Thread.sleep(j8 - 10);
                } catch (Exception unused) {
                }
            }
            int i4 = this.f331311a;
            if (!(i4 == 3 || i4 == 5 || i4 == 7)) {
                Log.m105925i("MicroMsg.VideoTrackDataSource", str, mo162299i(), Integer.valueOf(this.f331311a));
                return false;
            }
            if (Math.abs(j6 - this.f331367B) > 1000 || this.f331367B <= 0) {
                z = true;
                Log.m105925i("MicroMsg.VideoTrackDataSource", "%s finish to process index[%d] time[%d] to surface", mo162299i(), Integer.valueOf(i), Long.valueOf(j6));
                this.f331367B = j6;
            } else {
                z = true;
            }
            aVar2.mo148216r(i2, z);
            return z;
        } else {
            Log.m105919d("MicroMsg.VideoTrackDataSource", "%s finish to process but it too early now do nothing.", mo162299i());
            return false;
        }
    }

    /* renamed from: r */
    public boolean mo162304r(int i, long j) {
        Log.m105919d("MicroMsg.VideoTrackDataSource", "%s reset extractor flag[%d] needReset[%b]", mo162299i(), Integer.valueOf(i), Boolean.valueOf(this.f331312b.f331304i));
        if (!this.f331312b.f331304i || i != 1 || this.f331369D == j) {
            return false;
        }
        boolean a = mo162292a(j, -1);
        this.f331369D = j;
        return a;
    }

    /* renamed from: u */
    public String mo162283u() {
        return "video";
    }

    /* renamed from: v */
    public final void mo162330v() {
        Log.m105925i("MicroMsg.VideoTrackDataSource", "%s change surface below 23", mo162299i());
        if (this.f331325o != null) {
            mo162302p();
            mo162292a(this.f331312b.f331300e, -1);
            try {
                Log.m105925i("MicroMsg.TrackDataSource", "%s start to prepare decoder mime[%s]", mo162299i(), this.f331320j);
                C104619a c = C104619a.m140211c(this.f331320j);
                this.f331325o = c;
                mo162278h(c);
                this.f331325o.mo148222y();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.TrackDataSource", e, "%s prepare decoder init decoder error ", mo162299i());
                this.f331312b.mo162290d("video");
            }
        }
    }
}
