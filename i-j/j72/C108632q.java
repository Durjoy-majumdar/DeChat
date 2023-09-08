package j72;

import com.tencent.p014mm.plugin.sight.base.C106139e;
import com.tencent.p014mm.plugin.sight.base.C94555d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;

/* renamed from: j72.q */
public class C108632q implements C108611g {

    /* renamed from: a */
    public C106139e f325286a;

    /* renamed from: b */
    public float f325287b;

    /* renamed from: c */
    public String f325288c;

    /* renamed from: d */
    public int f325289d;

    /* renamed from: e */
    public int f325290e;

    /* renamed from: f */
    public boolean f325291f;

    public C108632q(C106139e eVar, String str, float f, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        this.f325286a = eVar;
        this.f325288c = str;
        this.f325287b = f;
        this.f325289d = i2;
        this.f325290e = i3;
        this.f325291f = z;
        Log.m105925i("MicroMsg.MMSightMP4Muxer", "create MMSightMP4Muxer, bufId: %s, recordPath: %s, fps: %s, bitrate: %s, videoDuration: %s, audioSampleRate%s, mute: %s, useSoftEncode:%s, enableHevc:%s", Integer.valueOf(eVar.f316167a), str, Float.valueOf(f), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3));
    }

    /* renamed from: a */
    public boolean mo159656a(boolean z) {
        long currentTicks = Util.currentTicks();
        new C86009m1(this.f325288c).mo119974l().mo119987x();
        String a = C94555d.m119565a(this.f325288c);
        String str = null;
        try {
            if (!C86013q1.m106450k(a)) {
                a = null;
            }
            str = a;
        } catch (Exception unused) {
        }
        Log.m105925i("MicroMsg.MMSightMP4Muxer", "start mux, bufId: %s, aacFile: %s useFFMpeg:%b", Integer.valueOf(this.f325286a.f316167a), str, Boolean.valueOf(z));
        int b = this.f325286a.mo151874b(this.f325288c, Math.max(1000, this.f325289d), this.f325287b, this.f325291f, this.f325290e, 1);
        Log.m105925i("MicroMsg.MMSightMP4Muxer", "mux sight end, duration %ds, used %sms", Integer.valueOf(b), Long.valueOf(Util.ticksToNow(currentTicks)));
        if (!Util.isNullOrNil(str)) {
            try {
                C86013q1.m106447h(str);
            } catch (Exception unused2) {
            }
        }
        return b >= 0;
    }
}
