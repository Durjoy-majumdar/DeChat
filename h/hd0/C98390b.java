package hd0;

import com.tencent.p014mm.modelcontrol.VideoTransPara;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: hd0.b */
public final class C98390b {

    /* renamed from: a */
    public final VideoTransPara f288457a;

    /* renamed from: b */
    public long f288458b = -1;

    /* renamed from: c */
    public long f288459c = -1;

    /* renamed from: d */
    public boolean f288460d;

    /* renamed from: e */
    public boolean f288461e;

    /* renamed from: f */
    public boolean f288462f = true;

    /* renamed from: g */
    public C32831w f288463g = new C32831w(false, 0, 3, (C8480h) null);

    /* renamed from: h */
    public boolean f288464h;

    /* renamed from: i */
    public int f288465i;

    public C98390b(VideoTransPara videoTransPara) {
        C87412m.m108594g(videoTransPara, "videoParam");
        this.f288457a = videoTransPara;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C98390b) && C87412m.m108589b(this.f288457a, ((C98390b) obj).f288457a);
    }

    public int hashCode() {
        return this.f288457a.hashCode();
    }

    public String toString() {
        return "CompositionVideoTranscodeParam(videoParam=" + this.f288457a + ')';
    }
}
