package p362mh;

import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Build;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import p213oh.C11412b;
import p335eh.C116768d;
import p356lh.C21434h;
import tm0.C14016b0;

/* renamed from: mh.a */
public abstract class C21502a {

    /* renamed from: m */
    public static volatile AtomicInteger f60875m = new AtomicInteger(0);

    /* renamed from: n */
    public static volatile AtomicInteger f60876n = new AtomicInteger(0);

    /* renamed from: o */
    public static volatile AtomicInteger f60877o = new AtomicInteger(0);

    /* renamed from: a */
    public volatile AudioTrack f60878a;

    /* renamed from: b */
    public byte[] f60879b;

    /* renamed from: c */
    public int f60880c = 0;

    /* renamed from: d */
    public int f60881d = 0;

    /* renamed from: e */
    public int f60882e;

    /* renamed from: f */
    public int f60883f;

    /* renamed from: g */
    public double f60884g = 0.0d;

    /* renamed from: h */
    public C116768d f60885h;

    /* renamed from: i */
    public C21434h f60886i;

    /* renamed from: j */
    public int f60887j = 0;

    /* renamed from: k */
    public long f60888k = -1;

    /* renamed from: l */
    public float f60889l = 1.0f;

    public C21502a(int i, int i2, C116768d dVar, C21434h hVar) {
        this.f60882e = i;
        this.f60883f = i2;
        this.f60885h = dVar;
        this.f60886i = hVar;
    }

    /* renamed from: a */
    public long mo33702a() {
        try {
            if (this.f60878a == null || this.f60878a.getState() == 0) {
                return this.f60888k;
            }
            long round = Math.round((((double) ((long) this.f60878a.getPlaybackHeadPosition())) / ((double) this.f60878a.getSampleRate())) * 1000.0d);
            this.f60888k = round;
            return round;
        } catch (Exception e) {
            int i = C11412b.f33577a;
            Log.printErrStackTrace("MicroMsg.Mix.AudioPcmBasePlayComponent", e, "getCurrentPosition", new Object[0]);
            return -1;
        }
    }

    /* renamed from: b */
    public void mo33703b() {
    }

    /* renamed from: c */
    public abstract void mo33704c(byte[] bArr);

    /* renamed from: d */
    public abstract void mo33705d();

    /* renamed from: e */
    public void mo33706e() {
        try {
            if (this.f60878a != null) {
                f60877o.decrementAndGet();
            }
            if (!(this.f60878a == null || this.f60878a.getState() == 0)) {
                this.f60878a.stop();
                this.f60878a.flush();
            }
            if (this.f60878a != null) {
                this.f60878a.release();
                this.f60878a = null;
            }
        } catch (Exception e) {
            int i = C11412b.f33577a;
            Log.printErrStackTrace("MicroMsg.Mix.AudioPcmBasePlayComponent", e, "releaseAudioTrack", new Object[0]);
        }
    }

    /* renamed from: f */
    public void mo33707f() {
        this.f60880c = 0;
        this.f60881d = 0;
        byte[] bArr = this.f60879b;
        if (bArr != null) {
            Arrays.fill(bArr, 0, bArr.length, (byte) 0);
        }
    }

    /* renamed from: g */
    public void mo33708g() {
    }

    /* renamed from: h */
    public void mo33709h(double d) {
        if (Build.VERSION.SDK_INT >= 23) {
            Object[] objArr = {Double.valueOf(d)};
            int i = C11412b.f33577a;
            Log.m105925i("MicroMsg.Mix.AudioPcmBasePlayComponent", "setPlaybackRate:%f", objArr);
            try {
                if (this.f60878a == null) {
                    return;
                }
                if (this.f60878a.getState() == 1 || this.f60878a.getState() == 2) {
                    PlaybackParams playbackParams = this.f60878a.getPlaybackParams();
                    playbackParams.setSpeed((float) d);
                    this.f60878a.setPlaybackParams(playbackParams);
                }
            } catch (IllegalStateException e) {
                Log.printErrStackTrace("MicroMsg.Mix.AudioPcmBasePlayComponent", e, "setPlaybackRate", new Object[0]);
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.Mix.AudioPcmBasePlayComponent", e2, "setPlaybackRate", new Object[0]);
            }
        }
    }

    /* renamed from: i */
    public void mo33710i(float f, float f2) {
        try {
            if (this.f60878a != null && (this.f60878a.getState() == 1 || this.f60878a.getState() == 2)) {
                this.f60878a.setStereoVolume(f, f2);
            }
        } catch (IllegalStateException e) {
            int i = C11412b.f33577a;
            Log.printErrStackTrace("MicroMsg.Mix.AudioPcmBasePlayComponent", e, C14016b0.NAME, new Object[0]);
        } catch (Exception e2) {
            int i2 = C11412b.f33577a;
            Log.printErrStackTrace("MicroMsg.Mix.AudioPcmBasePlayComponent", e2, C14016b0.NAME, new Object[0]);
        }
        this.f60889l = f;
    }
}
