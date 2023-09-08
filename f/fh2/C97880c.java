package fh2;

import com.tencent.p014mm.plugin.recordvideo.model.audio.AudioCacheInfo;
import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: fh2.c */
public final class C97880c implements Serializable {

    /* renamed from: d */
    public String f287128d = "";

    /* renamed from: e */
    public String f287129e = "";

    /* renamed from: f */
    public long f287130f;

    /* renamed from: g */
    public long f287131g;

    /* renamed from: h */
    public boolean f287132h;

    /* renamed from: i */
    public int f287133i;

    /* renamed from: j */
    public AudioCacheInfo f287134j;

    /* renamed from: n */
    public int f287135n;

    /* renamed from: o */
    public ArrayList<String> f287136o = new ArrayList<>();

    public String toString() {
        return "CaptureInfo(sourceVideoPath='" + this.f287128d + "', sourceThumb='" + this.f287129e + "', remuxStart=" + this.f287130f + ", remuxEnd=" + this.f287131g + ", isCaptureVideo=" + this.f287132h + ", audioMixType=" + this.f287133i + ", audioInfo=" + this.f287134j + ", videoRotate=" + this.f287135n + ')';
    }
}
