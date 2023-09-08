package xb0;

import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: xb0.j */
public class C102610j {

    /* renamed from: a */
    public String f302157a;

    /* renamed from: b */
    public int f302158b;

    /* renamed from: c */
    public int f302159c;

    /* renamed from: d */
    public int f302160d;

    /* renamed from: e */
    public int f302161e;

    /* renamed from: f */
    public boolean f302162f;

    /* renamed from: g */
    public C102611k[] f302163g;

    /* renamed from: h */
    public int f302164h = -1;

    /* renamed from: a */
    public VideoTransPara mo142243a(int i) {
        VideoTransPara b = mo142244b(i);
        if (b == null) {
            return null;
        }
        int i2 = b.f267168f;
        if (i2 <= 0) {
            b.f267172j = 1;
        } else {
            double d = ((double) b.f267172j) / ((double) i2);
            if (d < 1.0d) {
                d = 1.0d;
            }
            b.f267172j = (int) Math.ceil(d);
        }
        return b;
    }

    /* renamed from: b */
    public VideoTransPara mo142244b(int i) {
        C102611k[] kVarArr = this.f302163g;
        VideoTransPara videoTransPara = null;
        if (kVarArr != null) {
            for (C102611k kVar : kVarArr) {
                if (kVar != null && i >= kVar.f302165d && i <= kVar.f302166e) {
                    videoTransPara = new VideoTransPara();
                    videoTransPara.f267166d = kVar.f302167f;
                    videoTransPara.f267167e = kVar.f302168g;
                    videoTransPara.f267168f = kVar.f302169h;
                    videoTransPara.f267169g = kVar.f302170i;
                    videoTransPara.f267172j = this.f302159c;
                    videoTransPara.f267173n = this.f302158b;
                    videoTransPara.f267176q = this.f302160d;
                    videoTransPara.f267177r = this.f302161e;
                    boolean z = true;
                    if (this.f302164h != 1) {
                        z = false;
                    }
                    videoTransPara.f267165L = z;
                }
            }
        }
        return videoTransPara;
    }

    /* renamed from: c */
    public boolean mo142245c() {
        if (Util.isNullOrNil(this.f302157a)) {
            return true;
        }
        return C38471b.m41885a(this.f302157a);
    }

    public String toString() {
        return "[ busyTime " + this.f302157a + " audioBitrate " + this.f302158b + " iFrame " + this.f302159c + " profileIndex " + this.f302160d + " presetIndex " + this.f302161e + " isStepBr " + this.f302162f + " ]";
    }
}
