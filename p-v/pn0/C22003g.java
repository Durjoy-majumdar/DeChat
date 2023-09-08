package pn0;

import com.tencent.p014mm.plugin.appbrand.jsapi.video.C17978c;

/* renamed from: pn0.g */
public class C22003g {

    /* renamed from: a */
    public boolean f62259a;

    /* renamed from: b */
    public C17978c.C17986h f62260b = C17978c.C17986h.DEFAULT;

    /* renamed from: c */
    public int f62261c;

    /* renamed from: d */
    public int f62262d;

    /* renamed from: e */
    public int f62263e;

    /* renamed from: f */
    public int f62264f;

    /* renamed from: g */
    public int f62265g;

    /* renamed from: h */
    public int f62266h;

    /* renamed from: a */
    public final void mo35096a(float f, float f2) {
        if (!this.f62259a) {
            int i = this.f62261c;
            int i2 = this.f62262d;
            if (i < i2) {
                this.f62266h = (int) (((float) i) / f);
                this.f62265g = i;
                return;
            }
            this.f62265g = (int) (((float) i2) * f);
            this.f62266h = i2;
        } else if (((double) Math.abs(f - f2)) > 0.05d) {
            int i3 = this.f62261c;
            int i4 = this.f62262d;
            if (i3 < i4) {
                this.f62266h = (int) (((float) i3) / f);
                this.f62265g = i3;
                return;
            }
            this.f62265g = (int) (((float) i4) * f);
            this.f62266h = i4;
        } else {
            int i5 = this.f62261c;
            int i6 = this.f62262d;
            if (i5 > i6) {
                this.f62266h = (int) (((float) i5) / f);
                this.f62265g = i5;
                return;
            }
            this.f62265g = (int) (((float) i6) * f);
            this.f62266h = i6;
        }
    }
}
