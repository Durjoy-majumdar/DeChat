package a01;

import com.tencent.tavkit.component.TAVExporter;
import di3.C86312j;
import gy3.C8480h;
import h81.C32735h;
import l80.C109277d;

/* renamed from: a01.b */
public final class C103219b extends C109277d {

    /* renamed from: o */
    public String f304418o;

    /* renamed from: p */
    public Integer f304419p;

    /* renamed from: q */
    public C27724a f304420q = new C27724a();

    /* renamed from: r */
    public String f304421r;

    /* renamed from: s */
    public String f304422s;

    /* renamed from: t */
    public int f304423t;

    public C103219b() {
        super(false, 1, (C8480h) null);
    }

    /* renamed from: c */
    public final void mo142937c() {
        Class cls = C32735h.class;
        this.f327160c = TAVExporter.VIDEO_EXPORT_WIDTH;
        this.f327159b = (((int) (((float) TAVExporter.VIDEO_EXPORT_WIDTH) * (((float) this.f327159b) / ((float) this.f327160c)))) / 16) * 16;
        this.f327161d = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_finder_screec_cast_pc_video_bitrate, 4000) * 1000;
        this.f327164g = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_finder_screec_cast_pc_video_iframe_interval, 3);
    }

    public String toString() {
        return "mVideoWidth:" + this.f327159b + "  mVideoHeight : " + this.f327160c + " mBitRate : " + this.f327161d + " , mFps : " + this.f327162e + ' ';
    }
}
